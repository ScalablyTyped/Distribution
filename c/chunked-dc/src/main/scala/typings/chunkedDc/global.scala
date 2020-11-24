package typings.chunkedDc

import org.scalablytyped.runtime.TopLevel
import typings.chunkedDc.chunkedDc.Standalone
import typings.chunkedDc.jasmine.Any
import typings.chunkedDc.jasmine.ArrayContaining
import typings.chunkedDc.jasmine.Clock
import typings.chunkedDc.jasmine.CustomEqualityTester
import typings.chunkedDc.jasmine.CustomMatcherFactories
import typings.chunkedDc.jasmine.Env
import typings.chunkedDc.jasmine.Matchers
import typings.chunkedDc.jasmine.ObjectContaining
import typings.chunkedDc.jasmine.Spy
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobalScope
@js.native
object global extends js.Object {
  
  def afterAll(action: js.Function0[Unit]): Unit = js.native
  def afterAll(action: js.Function0[Unit], timeout: Double): Unit = js.native
  def afterAll(action: js.Function1[/* done */ DoneFn, Unit]): Unit = js.native
  def afterAll(action: js.Function1[/* done */ DoneFn, Unit], timeout: Double): Unit = js.native
  
  def afterEach(action: js.Function0[Unit]): Unit = js.native
  def afterEach(action: js.Function0[Unit], timeout: Double): Unit = js.native
  def afterEach(action: js.Function1[/* done */ DoneFn, Unit]): Unit = js.native
  def afterEach(action: js.Function1[/* done */ DoneFn, Unit], timeout: Double): Unit = js.native
  
  def beforeAll(action: js.Function0[Unit]): Unit = js.native
  def beforeAll(action: js.Function0[Unit], timeout: Double): Unit = js.native
  def beforeAll(action: js.Function1[/* done */ DoneFn, Unit]): Unit = js.native
  def beforeAll(action: js.Function1[/* done */ DoneFn, Unit], timeout: Double): Unit = js.native
  
  def beforeEach(action: js.Function0[Unit]): Unit = js.native
  def beforeEach(action: js.Function0[Unit], timeout: Double): Unit = js.native
  def beforeEach(action: js.Function1[/* done */ DoneFn, Unit]): Unit = js.native
  def beforeEach(action: js.Function1[/* done */ DoneFn, Unit], timeout: Double): Unit = js.native
  
  def describe(description: String, specDefinitions: js.Function0[Unit]): Unit = js.native
  
  def expect(actual: js.Any): Matchers = js.native
  def expect(spy: js.Function): Matchers = js.native
  
  def fail(): Unit = js.native
  def fail(e: js.Any): Unit = js.native
  
  def fdescribe(description: String, specDefinitions: js.Function0[Unit]): Unit = js.native
  
  def fit(expectation: String): Unit = js.native
  def fit(expectation: String, assertion: js.UndefOr[scala.Nothing], timeout: Double): Unit = js.native
  def fit(expectation: String, assertion: js.Function0[Unit]): Unit = js.native
  def fit(expectation: String, assertion: js.Function0[Unit], timeout: Double): Unit = js.native
  def fit(expectation: String, assertion: js.Function1[/* done */ DoneFn, Unit]): Unit = js.native
  def fit(expectation: String, assertion: js.Function1[/* done */ DoneFn, Unit], timeout: Double): Unit = js.native
  
  def it(expectation: String): Unit = js.native
  def it(expectation: String, assertion: js.UndefOr[scala.Nothing], timeout: Double): Unit = js.native
  def it(expectation: String, assertion: js.Function0[Unit]): Unit = js.native
  def it(expectation: String, assertion: js.Function0[Unit], timeout: Double): Unit = js.native
  def it(expectation: String, assertion: js.Function1[/* done */ DoneFn, Unit]): Unit = js.native
  def it(expectation: String, assertion: js.Function1[/* done */ DoneFn, Unit], timeout: Double): Unit = js.native
  
  /** If you call the function pending anywhere in the spec body, no matter the expectations, the spec will be marked pending. */
  def pending(): Unit = js.native
  def pending(reason: String): Unit = js.native
  
  def runs(asyncMethod: js.Function): Unit = js.native
  
  def spyOn(`object`: js.Any, method: String): Spy = js.native
  
  def waits(): Unit = js.native
  def waits(timeout: Double): Unit = js.native
  
  def waitsFor(latchMethod: js.Function0[Boolean]): Unit = js.native
  def waitsFor(latchMethod: js.Function0[Boolean], failureMessage: js.UndefOr[scala.Nothing], timeout: Double): Unit = js.native
  def waitsFor(latchMethod: js.Function0[Boolean], failureMessage: String): Unit = js.native
  def waitsFor(latchMethod: js.Function0[Boolean], failureMessage: String, timeout: Double): Unit = js.native
  
  def xdescribe(description: String, specDefinitions: js.Function0[Unit]): Unit = js.native
  
  def xit(expectation: String): Unit = js.native
  def xit(expectation: String, assertion: js.UndefOr[scala.Nothing], timeout: Double): Unit = js.native
  def xit(expectation: String, assertion: js.Function0[Unit]): Unit = js.native
  def xit(expectation: String, assertion: js.Function0[Unit], timeout: Double): Unit = js.native
  def xit(expectation: String, assertion: js.Function1[/* done */ DoneFn, Unit]): Unit = js.native
  def xit(expectation: String, assertion: js.Function1[/* done */ DoneFn, Unit], timeout: Double): Unit = js.native
  
  @js.native
  object chunkedDc extends TopLevel[Standalone]
  
  @js.native
  object jasmine extends js.Object {
    
    var DEFAULT_TIMEOUT_INTERVAL: Double = js.native
    
    var HtmlReporter: typings.chunkedDc.jasmine.HtmlReporter = js.native
    
    var HtmlSpecFilter: typings.chunkedDc.jasmine.HtmlSpecFilter = js.native
    
    def addCustomEqualityTester(equalityTester: CustomEqualityTester): Unit = js.native
    
    def addMatchers(matchers: CustomMatcherFactories): Unit = js.native
    
    def any(aclass: js.Any): Any = js.native
    
    def anything(): Any = js.native
    
    def arrayContaining(sample: js.Array[_]): ArrayContaining = js.native
    
    var clock: js.Function0[Clock] = js.native
    
    def createSpy(name: String): Spy = js.native
    def createSpy(name: String, originalFn: js.Function): Spy = js.native
    
    def createSpyObj(baseName: String, methodNames: js.Array[_]): js.Any = js.native
    @JSName("createSpyObj")
    def createSpyObj_T_T[T](baseName: String, methodNames: js.Array[_]): T = js.native
    
    def getEnv(): Env = js.native
    
    def objectContaining(sample: js.Any): ObjectContaining = js.native
    
    def pp(value: js.Any): String = js.native
    
    def stringMatching(str: String): Any = js.native
    def stringMatching(str: RegExp): Any = js.native
  }
}
