package typings.chunkedDc

import org.scalablytyped.runtime.Shortcut
import typings.chunkedDc.chunkedDc.Chunker
import typings.chunkedDc.chunkedDc.Standalone
import typings.chunkedDc.chunkedDc.Unchunker
import typings.chunkedDc.jasmine.ArrayContaining
import typings.chunkedDc.jasmine.Clock
import typings.chunkedDc.jasmine.CustomEqualityTester
import typings.chunkedDc.jasmine.CustomMatcherFactories
import typings.chunkedDc.jasmine.Env
import typings.chunkedDc.jasmine.HtmlReporter
import typings.chunkedDc.jasmine.HtmlSpecFilter
import typings.chunkedDc.jasmine.Matchers
import typings.chunkedDc.jasmine.ObjectContaining
import typings.chunkedDc.jasmine.Spy
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  inline def afterAll(action: js.Function0[Unit]): Unit = js.Dynamic.global.applyDynamic("afterAll")(action.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def afterAll(action: js.Function0[Unit], timeout: Double): Unit = (js.Dynamic.global.applyDynamic("afterAll")(action.asInstanceOf[js.Any], timeout.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def afterAll(action: js.Function1[/* done */ DoneFn, Unit]): Unit = js.Dynamic.global.applyDynamic("afterAll")(action.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def afterAll(action: js.Function1[/* done */ DoneFn, Unit], timeout: Double): Unit = (js.Dynamic.global.applyDynamic("afterAll")(action.asInstanceOf[js.Any], timeout.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def afterEach(action: js.Function0[Unit]): Unit = js.Dynamic.global.applyDynamic("afterEach")(action.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def afterEach(action: js.Function0[Unit], timeout: Double): Unit = (js.Dynamic.global.applyDynamic("afterEach")(action.asInstanceOf[js.Any], timeout.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def afterEach(action: js.Function1[/* done */ DoneFn, Unit]): Unit = js.Dynamic.global.applyDynamic("afterEach")(action.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def afterEach(action: js.Function1[/* done */ DoneFn, Unit], timeout: Double): Unit = (js.Dynamic.global.applyDynamic("afterEach")(action.asInstanceOf[js.Any], timeout.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def beforeAll(action: js.Function0[Unit]): Unit = js.Dynamic.global.applyDynamic("beforeAll")(action.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def beforeAll(action: js.Function0[Unit], timeout: Double): Unit = (js.Dynamic.global.applyDynamic("beforeAll")(action.asInstanceOf[js.Any], timeout.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def beforeAll(action: js.Function1[/* done */ DoneFn, Unit]): Unit = js.Dynamic.global.applyDynamic("beforeAll")(action.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def beforeAll(action: js.Function1[/* done */ DoneFn, Unit], timeout: Double): Unit = (js.Dynamic.global.applyDynamic("beforeAll")(action.asInstanceOf[js.Any], timeout.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def beforeEach(action: js.Function0[Unit]): Unit = js.Dynamic.global.applyDynamic("beforeEach")(action.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def beforeEach(action: js.Function0[Unit], timeout: Double): Unit = (js.Dynamic.global.applyDynamic("beforeEach")(action.asInstanceOf[js.Any], timeout.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def beforeEach(action: js.Function1[/* done */ DoneFn, Unit]): Unit = js.Dynamic.global.applyDynamic("beforeEach")(action.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def beforeEach(action: js.Function1[/* done */ DoneFn, Unit], timeout: Double): Unit = (js.Dynamic.global.applyDynamic("beforeEach")(action.asInstanceOf[js.Any], timeout.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  // Entry point
  object chunkedDc extends Shortcut {
    
    @JSGlobal("chunkedDc")
    @js.native
    val ^ : Standalone = js.native
    
    /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
    @JSGlobal("chunkedDc.Chunker")
    @js.native
    open class ChunkerCls protected ()
      extends StObject
         with Chunker {
      def this(id: Double, message: js.typedarray.Uint8Array, chunkSize: Double) = this()
    }
    
    /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
    @JSGlobal("chunkedDc.Unchunker")
    @js.native
    open class UnchunkerCls ()
      extends StObject
         with Unchunker
    
    type _To = Standalone
    
    /* This means you don't have to write `^`, but can instead just say `chunkedDc.foo` */
    override def _to: Standalone = ^
  }
  
  inline def describe(description: String, specDefinitions: js.Function0[Unit]): Unit = (js.Dynamic.global.applyDynamic("describe")(description.asInstanceOf[js.Any], specDefinitions.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def expect(actual: Any): Matchers = js.Dynamic.global.applyDynamic("expect")(actual.asInstanceOf[js.Any]).asInstanceOf[Matchers]
  inline def expect(spy: js.Function): Matchers = js.Dynamic.global.applyDynamic("expect")(spy.asInstanceOf[js.Any]).asInstanceOf[Matchers]
  
  inline def fail(): Unit = js.Dynamic.global.applyDynamic("fail")().asInstanceOf[Unit]
  inline def fail(e: Any): Unit = js.Dynamic.global.applyDynamic("fail")(e.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def fdescribe(description: String, specDefinitions: js.Function0[Unit]): Unit = (js.Dynamic.global.applyDynamic("fdescribe")(description.asInstanceOf[js.Any], specDefinitions.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def fit(expectation: String): Unit = js.Dynamic.global.applyDynamic("fit")(expectation.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def fit(expectation: String, assertion: js.Function0[Unit]): Unit = (js.Dynamic.global.applyDynamic("fit")(expectation.asInstanceOf[js.Any], assertion.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def fit(expectation: String, assertion: js.Function0[Unit], timeout: Double): Unit = (js.Dynamic.global.applyDynamic("fit")(expectation.asInstanceOf[js.Any], assertion.asInstanceOf[js.Any], timeout.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def fit(expectation: String, assertion: js.Function1[/* done */ DoneFn, Unit]): Unit = (js.Dynamic.global.applyDynamic("fit")(expectation.asInstanceOf[js.Any], assertion.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def fit(expectation: String, assertion: js.Function1[/* done */ DoneFn, Unit], timeout: Double): Unit = (js.Dynamic.global.applyDynamic("fit")(expectation.asInstanceOf[js.Any], assertion.asInstanceOf[js.Any], timeout.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def fit(expectation: String, assertion: Unit, timeout: Double): Unit = (js.Dynamic.global.applyDynamic("fit")(expectation.asInstanceOf[js.Any], assertion.asInstanceOf[js.Any], timeout.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def it(expectation: String): Unit = js.Dynamic.global.applyDynamic("it")(expectation.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def it(expectation: String, assertion: js.Function0[Unit]): Unit = (js.Dynamic.global.applyDynamic("it")(expectation.asInstanceOf[js.Any], assertion.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def it(expectation: String, assertion: js.Function0[Unit], timeout: Double): Unit = (js.Dynamic.global.applyDynamic("it")(expectation.asInstanceOf[js.Any], assertion.asInstanceOf[js.Any], timeout.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def it(expectation: String, assertion: js.Function1[/* done */ DoneFn, Unit]): Unit = (js.Dynamic.global.applyDynamic("it")(expectation.asInstanceOf[js.Any], assertion.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def it(expectation: String, assertion: js.Function1[/* done */ DoneFn, Unit], timeout: Double): Unit = (js.Dynamic.global.applyDynamic("it")(expectation.asInstanceOf[js.Any], assertion.asInstanceOf[js.Any], timeout.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def it(expectation: String, assertion: Unit, timeout: Double): Unit = (js.Dynamic.global.applyDynamic("it")(expectation.asInstanceOf[js.Any], assertion.asInstanceOf[js.Any], timeout.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  object jasmine {
    
    @JSGlobal("jasmine")
    @js.native
    val ^ : js.Any = js.native
    
    @JSGlobal("jasmine.DEFAULT_TIMEOUT_INTERVAL")
    @js.native
    def DEFAULT_TIMEOUT_INTERVAL: Double = js.native
    inline def DEFAULT_TIMEOUT_INTERVAL_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DEFAULT_TIMEOUT_INTERVAL")(x.asInstanceOf[js.Any])
    
    @JSGlobal("jasmine.HtmlReporter")
    @js.native
    def HtmlReporter: typings.chunkedDc.jasmine.HtmlReporter = js.native
    inline def HtmlReporter_=(x: HtmlReporter): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("HtmlReporter")(x.asInstanceOf[js.Any])
    
    @JSGlobal("jasmine.HtmlSpecFilter")
    @js.native
    def HtmlSpecFilter: typings.chunkedDc.jasmine.HtmlSpecFilter = js.native
    inline def HtmlSpecFilter_=(x: HtmlSpecFilter): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("HtmlSpecFilter")(x.asInstanceOf[js.Any])
    
    inline def addCustomEqualityTester(equalityTester: CustomEqualityTester): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addCustomEqualityTester")(equalityTester.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def addMatchers(matchers: CustomMatcherFactories): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addMatchers")(matchers.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def any(aclass: Any): typings.chunkedDc.jasmine.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("any")(aclass.asInstanceOf[js.Any]).asInstanceOf[typings.chunkedDc.jasmine.Any]
    
    inline def anything(): typings.chunkedDc.jasmine.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("anything")().asInstanceOf[typings.chunkedDc.jasmine.Any]
    
    inline def arrayContaining(sample: js.Array[Any]): ArrayContaining = ^.asInstanceOf[js.Dynamic].applyDynamic("arrayContaining")(sample.asInstanceOf[js.Any]).asInstanceOf[ArrayContaining]
    
    @JSGlobal("jasmine.clock")
    @js.native
    def clock: js.Function0[Clock] = js.native
    inline def clock_=(x: js.Function0[Clock]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("clock")(x.asInstanceOf[js.Any])
    
    inline def createSpy(name: String): Spy = ^.asInstanceOf[js.Dynamic].applyDynamic("createSpy")(name.asInstanceOf[js.Any]).asInstanceOf[Spy]
    inline def createSpy(name: String, originalFn: js.Function): Spy = (^.asInstanceOf[js.Dynamic].applyDynamic("createSpy")(name.asInstanceOf[js.Any], originalFn.asInstanceOf[js.Any])).asInstanceOf[Spy]
    
    inline def createSpyObj(baseName: String, methodNames: js.Array[Any]): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("createSpyObj")(baseName.asInstanceOf[js.Any], methodNames.asInstanceOf[js.Any])).asInstanceOf[Any]
    
    inline def createSpyObj_T_T[T](baseName: String, methodNames: js.Array[Any]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("createSpyObj")(baseName.asInstanceOf[js.Any], methodNames.asInstanceOf[js.Any])).asInstanceOf[T]
    
    inline def getEnv(): Env = ^.asInstanceOf[js.Dynamic].applyDynamic("getEnv")().asInstanceOf[Env]
    
    inline def objectContaining(sample: Any): ObjectContaining = ^.asInstanceOf[js.Dynamic].applyDynamic("objectContaining")(sample.asInstanceOf[js.Any]).asInstanceOf[ObjectContaining]
    
    inline def pp(value: Any): String = ^.asInstanceOf[js.Dynamic].applyDynamic("pp")(value.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def stringMatching(str: String): typings.chunkedDc.jasmine.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("stringMatching")(str.asInstanceOf[js.Any]).asInstanceOf[typings.chunkedDc.jasmine.Any]
    inline def stringMatching(str: js.RegExp): typings.chunkedDc.jasmine.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("stringMatching")(str.asInstanceOf[js.Any]).asInstanceOf[typings.chunkedDc.jasmine.Any]
  }
  
  /** If you call the function pending anywhere in the spec body, no matter the expectations, the spec will be marked pending. */
  inline def pending(): Unit = js.Dynamic.global.applyDynamic("pending")().asInstanceOf[Unit]
  inline def pending(reason: String): Unit = js.Dynamic.global.applyDynamic("pending")(reason.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def runs(asyncMethod: js.Function): Unit = js.Dynamic.global.applyDynamic("runs")(asyncMethod.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def spyOn(`object`: Any, method: String): Spy = (js.Dynamic.global.applyDynamic("spyOn")(`object`.asInstanceOf[js.Any], method.asInstanceOf[js.Any])).asInstanceOf[Spy]
  
  inline def waits(): Unit = js.Dynamic.global.applyDynamic("waits")().asInstanceOf[Unit]
  inline def waits(timeout: Double): Unit = js.Dynamic.global.applyDynamic("waits")(timeout.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def waitsFor(latchMethod: js.Function0[Boolean]): Unit = js.Dynamic.global.applyDynamic("waitsFor")(latchMethod.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def waitsFor(latchMethod: js.Function0[Boolean], failureMessage: String): Unit = (js.Dynamic.global.applyDynamic("waitsFor")(latchMethod.asInstanceOf[js.Any], failureMessage.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def waitsFor(latchMethod: js.Function0[Boolean], failureMessage: String, timeout: Double): Unit = (js.Dynamic.global.applyDynamic("waitsFor")(latchMethod.asInstanceOf[js.Any], failureMessage.asInstanceOf[js.Any], timeout.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def waitsFor(latchMethod: js.Function0[Boolean], failureMessage: Unit, timeout: Double): Unit = (js.Dynamic.global.applyDynamic("waitsFor")(latchMethod.asInstanceOf[js.Any], failureMessage.asInstanceOf[js.Any], timeout.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def xdescribe(description: String, specDefinitions: js.Function0[Unit]): Unit = (js.Dynamic.global.applyDynamic("xdescribe")(description.asInstanceOf[js.Any], specDefinitions.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def xit(expectation: String): Unit = js.Dynamic.global.applyDynamic("xit")(expectation.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def xit(expectation: String, assertion: js.Function0[Unit]): Unit = (js.Dynamic.global.applyDynamic("xit")(expectation.asInstanceOf[js.Any], assertion.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def xit(expectation: String, assertion: js.Function0[Unit], timeout: Double): Unit = (js.Dynamic.global.applyDynamic("xit")(expectation.asInstanceOf[js.Any], assertion.asInstanceOf[js.Any], timeout.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def xit(expectation: String, assertion: js.Function1[/* done */ DoneFn, Unit]): Unit = (js.Dynamic.global.applyDynamic("xit")(expectation.asInstanceOf[js.Any], assertion.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def xit(expectation: String, assertion: js.Function1[/* done */ DoneFn, Unit], timeout: Double): Unit = (js.Dynamic.global.applyDynamic("xit")(expectation.asInstanceOf[js.Any], assertion.asInstanceOf[js.Any], timeout.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def xit(expectation: String, assertion: Unit, timeout: Double): Unit = (js.Dynamic.global.applyDynamic("xit")(expectation.asInstanceOf[js.Any], assertion.asInstanceOf[js.Any], timeout.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
