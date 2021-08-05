package typings.chunkedDc.jasmine

import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Env extends StObject {
  
  def addCustomEqualityTester(equalityTester: CustomEqualityTester): Unit
  
  def addMatchers(matchers: CustomMatcherFactories): Unit
  
  def addReporter(reporter: Reporter): Unit
  
  def afterAll(afterAllFunction: js.Function0[Unit]): Unit
  
  def afterEach(afterEachFunction: js.Function0[Unit]): Unit
  
  def beforeAll(beforeAllFunction: js.Function0[Unit]): Unit
  
  // ddescribe(description: string, specDefinitions: () => void): Suite; Not a part of jasmine. Angular team adds these
  def beforeEach(beforeEachFunction: js.Function0[Unit]): Unit
  
  var clearInterval: Unit
  
  var clearTimeout: Unit
  
  def compareObjects_(a: js.Any, b: js.Any, mismatchKeys: js.Array[String], mismatchValues: js.Array[String]): Boolean
  
  def compareRegExps_(a: RegExp, b: RegExp, mismatchKeys: js.Array[String], mismatchValues: js.Array[String]): Boolean
  
  def contains_(haystack: js.Any, needle: js.Any): Boolean
  
  def currentRunner(): Runner
  
  var currentSpec: Spec
  
  def describe(description: String, specDefinitions: js.Function0[Unit]): Suite
  
  def equals_(a: js.Any, b: js.Any, mismatchKeys: js.Array[String], mismatchValues: js.Array[String]): Boolean
  
  def execute(): Unit
  
  def it(description: String, func: js.Function0[Unit]): Spec
  
  var matchersClass: Matchers
  
  def nextSpecId(): Double
  
  var setInterval: js.Any
  
  var setTimeout: js.Any
  
  def specFilter(spec: Spec): Boolean
  
  var updateInterval: Double
  
  def version(): js.Any
  
  def versionString(): String
  
  def xdescribe(desc: String, specDefinitions: js.Function0[Unit]): XSuite
  
  // iit(description: string, func: () => void): Spec; Not a part of jasmine. Angular team adds these
  def xit(desc: String, func: js.Function0[Unit]): XSpec
}
object Env {
  
  inline def apply(
    addCustomEqualityTester: CustomEqualityTester => Unit,
    addMatchers: CustomMatcherFactories => Unit,
    addReporter: Reporter => Unit,
    afterAll: js.Function0[Unit] => Unit,
    afterEach: js.Function0[Unit] => Unit,
    beforeAll: js.Function0[Unit] => Unit,
    beforeEach: js.Function0[Unit] => Unit,
    clearInterval: Unit,
    clearTimeout: Unit,
    compareObjects_ : (js.Any, js.Any, js.Array[String], js.Array[String]) => Boolean,
    compareRegExps_ : (RegExp, RegExp, js.Array[String], js.Array[String]) => Boolean,
    contains_ : (js.Any, js.Any) => Boolean,
    currentRunner: () => Runner,
    currentSpec: Spec,
    describe: (String, js.Function0[Unit]) => Suite,
    equals_ : (js.Any, js.Any, js.Array[String], js.Array[String]) => Boolean,
    execute: () => Unit,
    it: (String, js.Function0[Unit]) => Spec,
    matchersClass: Matchers,
    nextSpecId: () => Double,
    setInterval: js.Any,
    setTimeout: js.Any,
    specFilter: Spec => Boolean,
    updateInterval: Double,
    version: () => js.Any,
    versionString: () => String,
    xdescribe: (String, js.Function0[Unit]) => XSuite,
    xit: (String, js.Function0[Unit]) => XSpec
  ): Env = {
    val __obj = js.Dynamic.literal(addCustomEqualityTester = js.Any.fromFunction1(addCustomEqualityTester), addMatchers = js.Any.fromFunction1(addMatchers), addReporter = js.Any.fromFunction1(addReporter), afterAll = js.Any.fromFunction1(afterAll), afterEach = js.Any.fromFunction1(afterEach), beforeAll = js.Any.fromFunction1(beforeAll), beforeEach = js.Any.fromFunction1(beforeEach), clearInterval = clearInterval.asInstanceOf[js.Any], clearTimeout = clearTimeout.asInstanceOf[js.Any], compareObjects_ = js.Any.fromFunction4(compareObjects_), compareRegExps_ = js.Any.fromFunction4(compareRegExps_), contains_ = js.Any.fromFunction2(contains_), currentRunner = js.Any.fromFunction0(currentRunner), currentSpec = currentSpec.asInstanceOf[js.Any], describe = js.Any.fromFunction2(describe), equals_ = js.Any.fromFunction4(equals_), execute = js.Any.fromFunction0(execute), it = js.Any.fromFunction2(it), matchersClass = matchersClass.asInstanceOf[js.Any], nextSpecId = js.Any.fromFunction0(nextSpecId), setInterval = setInterval.asInstanceOf[js.Any], setTimeout = setTimeout.asInstanceOf[js.Any], specFilter = js.Any.fromFunction1(specFilter), updateInterval = updateInterval.asInstanceOf[js.Any], version = js.Any.fromFunction0(version), versionString = js.Any.fromFunction0(versionString), xdescribe = js.Any.fromFunction2(xdescribe), xit = js.Any.fromFunction2(xit))
    __obj.asInstanceOf[Env]
  }
  
  extension [Self <: Env](x: Self) {
    
    inline def setAddCustomEqualityTester(value: CustomEqualityTester => Unit): Self = StObject.set(x, "addCustomEqualityTester", js.Any.fromFunction1(value))
    
    inline def setAddMatchers(value: CustomMatcherFactories => Unit): Self = StObject.set(x, "addMatchers", js.Any.fromFunction1(value))
    
    inline def setAddReporter(value: Reporter => Unit): Self = StObject.set(x, "addReporter", js.Any.fromFunction1(value))
    
    inline def setAfterAll(value: js.Function0[Unit] => Unit): Self = StObject.set(x, "afterAll", js.Any.fromFunction1(value))
    
    inline def setAfterEach(value: js.Function0[Unit] => Unit): Self = StObject.set(x, "afterEach", js.Any.fromFunction1(value))
    
    inline def setBeforeAll(value: js.Function0[Unit] => Unit): Self = StObject.set(x, "beforeAll", js.Any.fromFunction1(value))
    
    inline def setBeforeEach(value: js.Function0[Unit] => Unit): Self = StObject.set(x, "beforeEach", js.Any.fromFunction1(value))
    
    inline def setClearInterval(value: Unit): Self = StObject.set(x, "clearInterval", value.asInstanceOf[js.Any])
    
    inline def setClearTimeout(value: Unit): Self = StObject.set(x, "clearTimeout", value.asInstanceOf[js.Any])
    
    inline def setCompareObjects_(value: (js.Any, js.Any, js.Array[String], js.Array[String]) => Boolean): Self = StObject.set(x, "compareObjects_", js.Any.fromFunction4(value))
    
    inline def setCompareRegExps_(value: (RegExp, RegExp, js.Array[String], js.Array[String]) => Boolean): Self = StObject.set(x, "compareRegExps_", js.Any.fromFunction4(value))
    
    inline def setContains_(value: (js.Any, js.Any) => Boolean): Self = StObject.set(x, "contains_", js.Any.fromFunction2(value))
    
    inline def setCurrentRunner(value: () => Runner): Self = StObject.set(x, "currentRunner", js.Any.fromFunction0(value))
    
    inline def setCurrentSpec(value: Spec): Self = StObject.set(x, "currentSpec", value.asInstanceOf[js.Any])
    
    inline def setDescribe(value: (String, js.Function0[Unit]) => Suite): Self = StObject.set(x, "describe", js.Any.fromFunction2(value))
    
    inline def setEquals_(value: (js.Any, js.Any, js.Array[String], js.Array[String]) => Boolean): Self = StObject.set(x, "equals_", js.Any.fromFunction4(value))
    
    inline def setExecute(value: () => Unit): Self = StObject.set(x, "execute", js.Any.fromFunction0(value))
    
    inline def setIt(value: (String, js.Function0[Unit]) => Spec): Self = StObject.set(x, "it", js.Any.fromFunction2(value))
    
    inline def setMatchersClass(value: Matchers): Self = StObject.set(x, "matchersClass", value.asInstanceOf[js.Any])
    
    inline def setNextSpecId(value: () => Double): Self = StObject.set(x, "nextSpecId", js.Any.fromFunction0(value))
    
    inline def setSetInterval(value: js.Any): Self = StObject.set(x, "setInterval", value.asInstanceOf[js.Any])
    
    inline def setSetTimeout(value: js.Any): Self = StObject.set(x, "setTimeout", value.asInstanceOf[js.Any])
    
    inline def setSpecFilter(value: Spec => Boolean): Self = StObject.set(x, "specFilter", js.Any.fromFunction1(value))
    
    inline def setUpdateInterval(value: Double): Self = StObject.set(x, "updateInterval", value.asInstanceOf[js.Any])
    
    inline def setVersion(value: () => js.Any): Self = StObject.set(x, "version", js.Any.fromFunction0(value))
    
    inline def setVersionString(value: () => String): Self = StObject.set(x, "versionString", js.Any.fromFunction0(value))
    
    inline def setXdescribe(value: (String, js.Function0[Unit]) => XSuite): Self = StObject.set(x, "xdescribe", js.Any.fromFunction2(value))
    
    inline def setXit(value: (String, js.Function0[Unit]) => XSpec): Self = StObject.set(x, "xit", js.Any.fromFunction2(value))
  }
}
