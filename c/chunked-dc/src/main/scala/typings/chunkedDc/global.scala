package typings.chunkedDc

import org.scalablytyped.runtime.Shortcut
import typings.chunkedDc.chunkedDc.Chunker
import typings.chunkedDc.chunkedDc.Standalone
import typings.chunkedDc.chunkedDc.Unchunker
import typings.chunkedDc.jasmine.Any
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
import typings.std.RegExp
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  @JSGlobal("afterAll")
  @js.native
  def afterAll(action: js.Function0[Unit]): Unit = js.native
  @JSGlobal("afterAll")
  @js.native
  def afterAll(action: js.Function0[Unit], timeout: Double): Unit = js.native
  @JSGlobal("afterAll")
  @js.native
  def afterAll(action: js.Function1[/* done */ DoneFn, Unit]): Unit = js.native
  @JSGlobal("afterAll")
  @js.native
  def afterAll(action: js.Function1[/* done */ DoneFn, Unit], timeout: Double): Unit = js.native
  
  @JSGlobal("afterEach")
  @js.native
  def afterEach(action: js.Function0[Unit]): Unit = js.native
  @JSGlobal("afterEach")
  @js.native
  def afterEach(action: js.Function0[Unit], timeout: Double): Unit = js.native
  @JSGlobal("afterEach")
  @js.native
  def afterEach(action: js.Function1[/* done */ DoneFn, Unit]): Unit = js.native
  @JSGlobal("afterEach")
  @js.native
  def afterEach(action: js.Function1[/* done */ DoneFn, Unit], timeout: Double): Unit = js.native
  
  @JSGlobal("beforeAll")
  @js.native
  def beforeAll(action: js.Function0[Unit]): Unit = js.native
  @JSGlobal("beforeAll")
  @js.native
  def beforeAll(action: js.Function0[Unit], timeout: Double): Unit = js.native
  @JSGlobal("beforeAll")
  @js.native
  def beforeAll(action: js.Function1[/* done */ DoneFn, Unit]): Unit = js.native
  @JSGlobal("beforeAll")
  @js.native
  def beforeAll(action: js.Function1[/* done */ DoneFn, Unit], timeout: Double): Unit = js.native
  
  @JSGlobal("beforeEach")
  @js.native
  def beforeEach(action: js.Function0[Unit]): Unit = js.native
  @JSGlobal("beforeEach")
  @js.native
  def beforeEach(action: js.Function0[Unit], timeout: Double): Unit = js.native
  @JSGlobal("beforeEach")
  @js.native
  def beforeEach(action: js.Function1[/* done */ DoneFn, Unit]): Unit = js.native
  @JSGlobal("beforeEach")
  @js.native
  def beforeEach(action: js.Function1[/* done */ DoneFn, Unit], timeout: Double): Unit = js.native
  
  // Entry point
  object chunkedDc extends Shortcut {
    
    @JSGlobal("chunkedDc")
    @js.native
    val ^ : Standalone = js.native
    
    /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
    @JSGlobal("chunkedDc.Chunker")
    @js.native
    class ChunkerCls protected () extends Chunker {
      def this(id: Double, message: Uint8Array, chunkSize: Double) = this()
    }
    
    /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
    @JSGlobal("chunkedDc.Unchunker")
    @js.native
    class UnchunkerCls () extends Unchunker
    
    type _To = Standalone
    
    /* This means you don't have to write `^`, but can instead just say `chunkedDc.foo` */
    override def _to: Standalone = ^
  }
  
  @JSGlobal("describe")
  @js.native
  def describe(description: String, specDefinitions: js.Function0[Unit]): Unit = js.native
  
  @JSGlobal("expect")
  @js.native
  def expect(actual: js.Any): Matchers = js.native
  @JSGlobal("expect")
  @js.native
  def expect(spy: js.Function): Matchers = js.native
  
  @JSGlobal("fail")
  @js.native
  def fail(): Unit = js.native
  @JSGlobal("fail")
  @js.native
  def fail(e: js.Any): Unit = js.native
  
  @JSGlobal("fdescribe")
  @js.native
  def fdescribe(description: String, specDefinitions: js.Function0[Unit]): Unit = js.native
  
  @JSGlobal("fit")
  @js.native
  def fit(expectation: String): Unit = js.native
  @JSGlobal("fit")
  @js.native
  def fit(expectation: String, assertion: js.UndefOr[scala.Nothing], timeout: Double): Unit = js.native
  @JSGlobal("fit")
  @js.native
  def fit(expectation: String, assertion: js.Function0[Unit]): Unit = js.native
  @JSGlobal("fit")
  @js.native
  def fit(expectation: String, assertion: js.Function0[Unit], timeout: Double): Unit = js.native
  @JSGlobal("fit")
  @js.native
  def fit(expectation: String, assertion: js.Function1[/* done */ DoneFn, Unit]): Unit = js.native
  @JSGlobal("fit")
  @js.native
  def fit(expectation: String, assertion: js.Function1[/* done */ DoneFn, Unit], timeout: Double): Unit = js.native
  
  @JSGlobal("it")
  @js.native
  def it(expectation: String): Unit = js.native
  @JSGlobal("it")
  @js.native
  def it(expectation: String, assertion: js.UndefOr[scala.Nothing], timeout: Double): Unit = js.native
  @JSGlobal("it")
  @js.native
  def it(expectation: String, assertion: js.Function0[Unit]): Unit = js.native
  @JSGlobal("it")
  @js.native
  def it(expectation: String, assertion: js.Function0[Unit], timeout: Double): Unit = js.native
  @JSGlobal("it")
  @js.native
  def it(expectation: String, assertion: js.Function1[/* done */ DoneFn, Unit]): Unit = js.native
  @JSGlobal("it")
  @js.native
  def it(expectation: String, assertion: js.Function1[/* done */ DoneFn, Unit], timeout: Double): Unit = js.native
  
  object jasmine {
    
    @JSGlobal("jasmine")
    @js.native
    val ^ : js.Any = js.native
    
    @JSGlobal("jasmine.DEFAULT_TIMEOUT_INTERVAL")
    @js.native
    def DEFAULT_TIMEOUT_INTERVAL: Double = js.native
    @scala.inline
    def DEFAULT_TIMEOUT_INTERVAL_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DEFAULT_TIMEOUT_INTERVAL")(x.asInstanceOf[js.Any])
    
    @JSGlobal("jasmine.HtmlReporter")
    @js.native
    def HtmlReporter: typings.chunkedDc.jasmine.HtmlReporter = js.native
    @scala.inline
    def HtmlReporter_=(x: HtmlReporter): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("HtmlReporter")(x.asInstanceOf[js.Any])
    
    @JSGlobal("jasmine.HtmlSpecFilter")
    @js.native
    def HtmlSpecFilter: typings.chunkedDc.jasmine.HtmlSpecFilter = js.native
    @scala.inline
    def HtmlSpecFilter_=(x: HtmlSpecFilter): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("HtmlSpecFilter")(x.asInstanceOf[js.Any])
    
    @JSGlobal("jasmine.addCustomEqualityTester")
    @js.native
    def addCustomEqualityTester(equalityTester: CustomEqualityTester): Unit = js.native
    
    @JSGlobal("jasmine.addMatchers")
    @js.native
    def addMatchers(matchers: CustomMatcherFactories): Unit = js.native
    
    @JSGlobal("jasmine.any")
    @js.native
    def any(aclass: js.Any): Any = js.native
    
    @JSGlobal("jasmine.anything")
    @js.native
    def anything(): Any = js.native
    
    @JSGlobal("jasmine.arrayContaining")
    @js.native
    def arrayContaining(sample: js.Array[_]): ArrayContaining = js.native
    
    @JSGlobal("jasmine.clock")
    @js.native
    def clock: js.Function0[Clock] = js.native
    @scala.inline
    def clock_=(x: js.Function0[Clock]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("clock")(x.asInstanceOf[js.Any])
    
    @JSGlobal("jasmine.createSpy")
    @js.native
    def createSpy(name: String): Spy = js.native
    @JSGlobal("jasmine.createSpy")
    @js.native
    def createSpy(name: String, originalFn: js.Function): Spy = js.native
    
    @JSGlobal("jasmine.createSpyObj")
    @js.native
    def createSpyObj(baseName: String, methodNames: js.Array[_]): js.Any = js.native
    @JSGlobal("jasmine.createSpyObj")
    @js.native
    def createSpyObj_T_T[T](baseName: String, methodNames: js.Array[_]): T = js.native
    
    @JSGlobal("jasmine.getEnv")
    @js.native
    def getEnv(): Env = js.native
    
    @JSGlobal("jasmine.objectContaining")
    @js.native
    def objectContaining(sample: js.Any): ObjectContaining = js.native
    
    @JSGlobal("jasmine.pp")
    @js.native
    def pp(value: js.Any): String = js.native
    
    @JSGlobal("jasmine.stringMatching")
    @js.native
    def stringMatching(str: String): Any = js.native
    @JSGlobal("jasmine.stringMatching")
    @js.native
    def stringMatching(str: RegExp): Any = js.native
  }
  
  /** If you call the function pending anywhere in the spec body, no matter the expectations, the spec will be marked pending. */
  @JSGlobal("pending")
  @js.native
  def pending(): Unit = js.native
  @JSGlobal("pending")
  @js.native
  def pending(reason: String): Unit = js.native
  
  @JSGlobal("runs")
  @js.native
  def runs(asyncMethod: js.Function): Unit = js.native
  
  @JSGlobal("spyOn")
  @js.native
  def spyOn(`object`: js.Any, method: String): Spy = js.native
  
  @JSGlobal("waits")
  @js.native
  def waits(): Unit = js.native
  @JSGlobal("waits")
  @js.native
  def waits(timeout: Double): Unit = js.native
  
  @JSGlobal("waitsFor")
  @js.native
  def waitsFor(latchMethod: js.Function0[Boolean]): Unit = js.native
  @JSGlobal("waitsFor")
  @js.native
  def waitsFor(latchMethod: js.Function0[Boolean], failureMessage: js.UndefOr[scala.Nothing], timeout: Double): Unit = js.native
  @JSGlobal("waitsFor")
  @js.native
  def waitsFor(latchMethod: js.Function0[Boolean], failureMessage: String): Unit = js.native
  @JSGlobal("waitsFor")
  @js.native
  def waitsFor(latchMethod: js.Function0[Boolean], failureMessage: String, timeout: Double): Unit = js.native
  
  @JSGlobal("xdescribe")
  @js.native
  def xdescribe(description: String, specDefinitions: js.Function0[Unit]): Unit = js.native
  
  @JSGlobal("xit")
  @js.native
  def xit(expectation: String): Unit = js.native
  @JSGlobal("xit")
  @js.native
  def xit(expectation: String, assertion: js.UndefOr[scala.Nothing], timeout: Double): Unit = js.native
  @JSGlobal("xit")
  @js.native
  def xit(expectation: String, assertion: js.Function0[Unit]): Unit = js.native
  @JSGlobal("xit")
  @js.native
  def xit(expectation: String, assertion: js.Function0[Unit], timeout: Double): Unit = js.native
  @JSGlobal("xit")
  @js.native
  def xit(expectation: String, assertion: js.Function1[/* done */ DoneFn, Unit]): Unit = js.native
  @JSGlobal("xit")
  @js.native
  def xit(expectation: String, assertion: js.Function1[/* done */ DoneFn, Unit], timeout: Double): Unit = js.native
}
