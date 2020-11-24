package typings.chunkedDc.jasmine

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Env extends js.Object {
  
  def addCustomEqualityTester(equalityTester: CustomEqualityTester): Unit = js.native
  
  def addMatchers(matchers: CustomMatcherFactories): Unit = js.native
  
  def addReporter(reporter: Reporter): Unit = js.native
  
  def afterAll(afterAllFunction: js.Function0[Unit]): Unit = js.native
  
  def afterEach(afterEachFunction: js.Function0[Unit]): Unit = js.native
  
  def beforeAll(beforeAllFunction: js.Function0[Unit]): Unit = js.native
  
  // ddescribe(description: string, specDefinitions: () => void): Suite; Not a part of jasmine. Angular team adds these
  def beforeEach(beforeEachFunction: js.Function0[Unit]): Unit = js.native
  
  var clearInterval: Unit = js.native
  
  var clearTimeout: Unit = js.native
  
  def compareObjects_(a: js.Any, b: js.Any, mismatchKeys: js.Array[String], mismatchValues: js.Array[String]): Boolean = js.native
  
  def compareRegExps_(a: RegExp, b: RegExp, mismatchKeys: js.Array[String], mismatchValues: js.Array[String]): Boolean = js.native
  
  def contains_(haystack: js.Any, needle: js.Any): Boolean = js.native
  
  def currentRunner(): Runner = js.native
  
  var currentSpec: Spec = js.native
  
  def describe(description: String, specDefinitions: js.Function0[Unit]): Suite = js.native
  
  def equals_(a: js.Any, b: js.Any, mismatchKeys: js.Array[String], mismatchValues: js.Array[String]): Boolean = js.native
  
  def execute(): Unit = js.native
  
  def it(description: String, func: js.Function0[Unit]): Spec = js.native
  
  var matchersClass: Matchers = js.native
  
  def nextSpecId(): Double = js.native
  
  var setInterval: js.Any = js.native
  
  var setTimeout: js.Any = js.native
  
  def specFilter(spec: Spec): Boolean = js.native
  
  var updateInterval: Double = js.native
  
  def version(): js.Any = js.native
  
  def versionString(): String = js.native
  
  def xdescribe(desc: String, specDefinitions: js.Function0[Unit]): XSuite = js.native
  
  // iit(description: string, func: () => void): Spec; Not a part of jasmine. Angular team adds these
  def xit(desc: String, func: js.Function0[Unit]): XSpec = js.native
}
object Env {
  
  @scala.inline
  def apply(
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
  
  @scala.inline
  implicit class EnvOps[Self <: Env] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAddCustomEqualityTester(value: CustomEqualityTester => Unit): Self = this.set("addCustomEqualityTester", js.Any.fromFunction1(value))
    
    @scala.inline
    def setAddMatchers(value: CustomMatcherFactories => Unit): Self = this.set("addMatchers", js.Any.fromFunction1(value))
    
    @scala.inline
    def setAddReporter(value: Reporter => Unit): Self = this.set("addReporter", js.Any.fromFunction1(value))
    
    @scala.inline
    def setAfterAll(value: js.Function0[Unit] => Unit): Self = this.set("afterAll", js.Any.fromFunction1(value))
    
    @scala.inline
    def setAfterEach(value: js.Function0[Unit] => Unit): Self = this.set("afterEach", js.Any.fromFunction1(value))
    
    @scala.inline
    def setBeforeAll(value: js.Function0[Unit] => Unit): Self = this.set("beforeAll", js.Any.fromFunction1(value))
    
    @scala.inline
    def setBeforeEach(value: js.Function0[Unit] => Unit): Self = this.set("beforeEach", js.Any.fromFunction1(value))
    
    @scala.inline
    def setClearInterval(value: Unit): Self = this.set("clearInterval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClearTimeout(value: Unit): Self = this.set("clearTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompareObjects_(value: (js.Any, js.Any, js.Array[String], js.Array[String]) => Boolean): Self = this.set("compareObjects_", js.Any.fromFunction4(value))
    
    @scala.inline
    def setCompareRegExps_(value: (RegExp, RegExp, js.Array[String], js.Array[String]) => Boolean): Self = this.set("compareRegExps_", js.Any.fromFunction4(value))
    
    @scala.inline
    def setContains_(value: (js.Any, js.Any) => Boolean): Self = this.set("contains_", js.Any.fromFunction2(value))
    
    @scala.inline
    def setCurrentRunner(value: () => Runner): Self = this.set("currentRunner", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCurrentSpec(value: Spec): Self = this.set("currentSpec", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescribe(value: (String, js.Function0[Unit]) => Suite): Self = this.set("describe", js.Any.fromFunction2(value))
    
    @scala.inline
    def setEquals_(value: (js.Any, js.Any, js.Array[String], js.Array[String]) => Boolean): Self = this.set("equals_", js.Any.fromFunction4(value))
    
    @scala.inline
    def setExecute(value: () => Unit): Self = this.set("execute", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIt(value: (String, js.Function0[Unit]) => Spec): Self = this.set("it", js.Any.fromFunction2(value))
    
    @scala.inline
    def setMatchersClass(value: Matchers): Self = this.set("matchersClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextSpecId(value: () => Double): Self = this.set("nextSpecId", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetInterval(value: js.Any): Self = this.set("setInterval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetTimeout(value: js.Any): Self = this.set("setTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpecFilter(value: Spec => Boolean): Self = this.set("specFilter", js.Any.fromFunction1(value))
    
    @scala.inline
    def setUpdateInterval(value: Double): Self = this.set("updateInterval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersion(value: () => js.Any): Self = this.set("version", js.Any.fromFunction0(value))
    
    @scala.inline
    def setVersionString(value: () => String): Self = this.set("versionString", js.Any.fromFunction0(value))
    
    @scala.inline
    def setXdescribe(value: (String, js.Function0[Unit]) => XSuite): Self = this.set("xdescribe", js.Any.fromFunction2(value))
    
    @scala.inline
    def setXit(value: (String, js.Function0[Unit]) => XSpec): Self = this.set("xit", js.Any.fromFunction2(value))
  }
}
