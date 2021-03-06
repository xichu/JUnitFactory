package org.jmmo.testing.example;

import org.junit.runner.RunWith;
import org.jmmo.testing.JUnitFactoryRunner;
import org.jmmo.testing.JUnitFactoryRunner.JUnitFactory;

@RunWith(JUnitFactoryRunner.class)
public class BSuite {

    @JUnitFactory
    public static ATest test1() {
        return new ATest(new ATest.AFactory() {
            @Override
            public A createA(String firstName) {
                return new B(firstName, "");
            }
        });
    }

    @JUnitFactory
    public static BTest test2() {
        return new BTest(new BTest.BFactory() {
            @Override
            public B createB(String firstName, String secondName) {
                return new B(firstName, secondName);
            }
        });
    }
}
