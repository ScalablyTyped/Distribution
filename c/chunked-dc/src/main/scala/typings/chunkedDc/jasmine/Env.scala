package typings.chunkedDc.jasmine

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Env extends js.Object {
  var clearInterval: Unit
  var clearTimeout: Unit
  var currentSpec: Spec
  var matchersClass: Matchers
  var setInterval: js.Any
  var setTimeout: js.Any
  var updateInterval: Double
  def addCustomEqualityTester(equalityTester: CustomEqualityTester): Unit
  def addMatchers(matchers: CustomMatcherFactories): Unit
  def addReporter(reporter: Reporter): Unit
  def afterAll(afterAllFunction: js.Function0[Unit]): Unit
  def afterEach(afterEachFunction: js.Function0[Unit]): Unit
  def beforeAll(beforeAllFunction: js.Function0[Unit]): Unit
  // ddescribe(description: string, specDefinitions: () => void): Suite; Not a part of jasmine. Angular team adds these
  def beforeEach(beforeEachFunction: js.Function0[Unit]): Unit
  def compareObjects_(a: js.Any, b: js.Any, mismatchKeys: js.Array[String], mismatchValues: js.Array[String]): Boolean
  def compareRegExps_(a: RegExp, b: RegExp, mismatchKeys: js.Array[String], mismatchValues: js.Array[String]): Boolean
  def contains_(haystack: js.Any, needle: js.Any): Boolean
  def currentRunner(): Runner
  def describe(description: String, specDefinitions: js.Function0[Unit]): Suite
  def equals_(a: js.Any, b: js.Any, mismatchKeys: js.Array[String], mismatchValues: js.Array[String]): Boolean
  def execute(): Unit
  def it(description: String, func: js.Function0[Unit]): Spec
  def nextSpecId(): Double
  def specFilter(spec: Spec): Boolean
  def version(): js.Any
  def versionString(): String
  def xdescribe(desc: String, specDefinitions: js.Function0[Unit]): XSuite
  // iit(description: string, func: () => void): Spec; Not a part of jasmine. Angular team adds these
  def xit(desc: String, func: js.Function0[Unit]): XSpec
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
}

