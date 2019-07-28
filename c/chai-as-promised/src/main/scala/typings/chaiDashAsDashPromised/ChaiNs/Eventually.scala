package typings.chaiDashAsDashPromised.ChaiNs

import typings.std.Error
import typings.std.PropertyDescriptor
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Eventually does not have .then(), but PromisedAssertion have.
@js.native
trait Eventually
  extends PromisedLanguageChains
     with PromisedNumericComparison
     with PromisedTypeComparison {
  @JSName("Arguments")
  var Arguments_Original: PromisedAssertion = js.native
  @JSName("NaN")
  var NaN_Original: PromisedAssertion = js.native
  @JSName("Throw")
  var Throw_Original: PromisedThrow = js.native
  @JSName("a")
  var a_Original: PromisedTypeComparison = js.native
  var all: PromisedKeyFilter = js.native
  @JSName("an")
  var an_Original: PromisedTypeComparison = js.native
  var any: PromisedKeyFilter = js.native
  @JSName("approximately")
  var approximately_Original: PromisedCloseTo = js.native
  @JSName("arguments")
  var arguments_Original: PromisedAssertion = js.native
  @JSName("change")
  var change_Original: PromisedPropertyChange = js.native
  @JSName("changes")
  var changes_Original: PromisedPropertyChange = js.native
  @JSName("closeTo")
  var closeTo_Original: PromisedCloseTo = js.native
  @JSName("contain")
  var contain_Original: PromisedInclude = js.native
  @JSName("decrease")
  var decrease_Original: PromisedPropertyChange = js.native
  @JSName("decreases")
  var decreases_Original: PromisedPropertyChange = js.native
  var deep: PromisedDeep = js.native
  @JSName("empty")
  var empty_Original: PromisedAssertion = js.native
  @JSName("eq")
  var eq_Original: PromisedEqual = js.native
  @JSName("eql")
  var eql_Original: PromisedEqual = js.native
  @JSName("eqls")
  var eqls_Original: PromisedEqual = js.native
  @JSName("equal")
  var equal_Original: PromisedEqual = js.native
  @JSName("equals")
  var equals_Original: PromisedEqual = js.native
  @JSName("exist")
  var exist_Original: PromisedAssertion = js.native
  @JSName("extensible")
  var extensible_Original: PromisedAssertion = js.native
  @JSName("false")
  var false_Original: PromisedAssertion = js.native
  @JSName("frozen")
  var frozen_Original: PromisedAssertion = js.native
  @JSName("fulfilled")
  var fulfilled_Original: PromisedAssertion = js.native
  @JSName("haveOwnPropertyDescriptor")
  var haveOwnPropertyDescriptor_Original: PromisedOwnPropertyDescriptor = js.native
  @JSName("haveOwnProperty")
  var haveOwnProperty_Original: PromisedOwnProperty = js.native
  @JSName("include")
  var include_Original: PromisedInclude = js.native
  @JSName("increase")
  var increase_Original: PromisedPropertyChange = js.native
  @JSName("increases")
  var increases_Original: PromisedPropertyChange = js.native
  @JSName("itself")
  var itself_Original: PromisedAssertion = js.native
  @JSName("keys")
  var keys_Original: PromisedKeys = js.native
  @JSName("lengthOf")
  var lengthOf_Original: PromisedLength = js.native
  @JSName("length")
  var length_Original: PromisedLength = js.native
  @JSName("match")
  var match_Original: PromisedMatch = js.native
  @JSName("matches")
  var matches_Original: PromisedMatch = js.native
  @JSName("members")
  var members_Original: PromisedMembers = js.native
  var nested: PromisedNested = js.native
  // From chai
  @JSName("not")
  var not_Original: PromisedAssertion = js.native
  @JSName("null")
  var null_Original: PromisedAssertion = js.native
  @JSName("ok")
  var ok_Original: PromisedAssertion = js.native
  var ordered: PromisedOrdered = js.native
  @JSName("ownPropertyDescriptor")
  var ownPropertyDescriptor_Original: PromisedOwnPropertyDescriptor = js.native
  @JSName("ownProperty")
  var ownProperty_Original: PromisedOwnProperty = js.native
  @JSName("property")
  var property_Original: PromisedProperty = js.native
  @JSName("rejectedWith")
  var rejectedWith_Original: PromisedThrow = js.native
  @JSName("rejected")
  var rejected_Original: PromisedAssertion = js.native
  @JSName("respondTo")
  var respondTo_Original: PromisedRespondTo = js.native
  @JSName("respondsTo")
  var respondsTo_Original: PromisedRespondTo = js.native
  @JSName("satisfies")
  var satisfies_Original: PromisedSatisfy = js.native
  @JSName("satisfy")
  var satisfy_Original: PromisedSatisfy = js.native
  @JSName("sealed")
  var sealed_Original: PromisedAssertion = js.native
  @JSName("throw")
  var throw_Original: PromisedThrow = js.native
  @JSName("throws")
  var throws_Original: PromisedThrow = js.native
  @JSName("true")
  var true_Original: PromisedAssertion = js.native
  @JSName("undefined")
  var undefined_Original: PromisedAssertion = js.native
  def Arguments(`type`: String): PromisedAssertion = js.native
  def Arguments(`type`: String, message: String): PromisedAssertion = js.native
  def NaN(`type`: String): PromisedAssertion = js.native
  def NaN(`type`: String, message: String): PromisedAssertion = js.native
  def Throw(): PromisedAssertion = js.native
  def Throw(constructor: js.Function): PromisedAssertion = js.native
  def Throw(constructor: js.Function, expected: String): PromisedAssertion = js.native
  def Throw(constructor: js.Function, expected: String, message: String): PromisedAssertion = js.native
  def Throw(constructor: js.Function, expected: RegExp): PromisedAssertion = js.native
  def Throw(constructor: js.Function, expected: RegExp, message: String): PromisedAssertion = js.native
  def Throw(constructor: Error): PromisedAssertion = js.native
  def Throw(constructor: Error, expected: String): PromisedAssertion = js.native
  def Throw(constructor: Error, expected: String, message: String): PromisedAssertion = js.native
  def Throw(constructor: Error, expected: RegExp): PromisedAssertion = js.native
  def Throw(constructor: Error, expected: RegExp, message: String): PromisedAssertion = js.native
  def Throw(expected: String): PromisedAssertion = js.native
  def Throw(expected: String, message: String): PromisedAssertion = js.native
  def Throw(expected: RegExp): PromisedAssertion = js.native
  def Throw(expected: RegExp, message: String): PromisedAssertion = js.native
  def a(`type`: String): PromisedAssertion = js.native
  def a(`type`: String, message: String): PromisedAssertion = js.native
  def an(`type`: String): PromisedAssertion = js.native
  def an(`type`: String, message: String): PromisedAssertion = js.native
  def approximately(expected: Double, delta: Double): PromisedAssertion = js.native
  def approximately(expected: Double, delta: Double, message: String): PromisedAssertion = js.native
  def arguments(`type`: String): PromisedAssertion = js.native
  def arguments(`type`: String, message: String): PromisedAssertion = js.native
  // From chai-as-promised
  def become(expected: js.Any): PromisedAssertion = js.native
  def change(`object`: js.Object, property: String): PromisedAssertion = js.native
  def change(`object`: js.Object, property: String, message: String): PromisedAssertion = js.native
  def changes(`object`: js.Object, property: String): PromisedAssertion = js.native
  def changes(`object`: js.Object, property: String, message: String): PromisedAssertion = js.native
  def closeTo(expected: Double, delta: Double): PromisedAssertion = js.native
  def closeTo(expected: Double, delta: Double, message: String): PromisedAssertion = js.native
  def contain(value: String): PromisedAssertion = js.native
  def contain(value: String, message: String): PromisedAssertion = js.native
  def contain(value: js.Object): PromisedAssertion = js.native
  def contain(value: js.Object, message: String): PromisedAssertion = js.native
  def contain(value: Double): PromisedAssertion = js.native
  def contain(value: Double, message: String): PromisedAssertion = js.native
  def decrease(`object`: js.Object, property: String): PromisedAssertion = js.native
  def decrease(`object`: js.Object, property: String, message: String): PromisedAssertion = js.native
  def decreases(`object`: js.Object, property: String): PromisedAssertion = js.native
  def decreases(`object`: js.Object, property: String, message: String): PromisedAssertion = js.native
  def empty(`type`: String): PromisedAssertion = js.native
  def empty(`type`: String, message: String): PromisedAssertion = js.native
  def eq(value: js.Any): PromisedAssertion = js.native
  def eq(value: js.Any, message: String): PromisedAssertion = js.native
  def eql(value: js.Any): PromisedAssertion = js.native
  def eql(value: js.Any, message: String): PromisedAssertion = js.native
  def eqls(value: js.Any): PromisedAssertion = js.native
  def eqls(value: js.Any, message: String): PromisedAssertion = js.native
  def equal(value: js.Any): PromisedAssertion = js.native
  def equal(value: js.Any, message: String): PromisedAssertion = js.native
  def equals(value: js.Any): PromisedAssertion = js.native
  def equals(value: js.Any, message: String): PromisedAssertion = js.native
  def exist(`type`: String): PromisedAssertion = js.native
  def exist(`type`: String, message: String): PromisedAssertion = js.native
  def extensible(`type`: String): PromisedAssertion = js.native
  def extensible(`type`: String, message: String): PromisedAssertion = js.native
  def `false`(`type`: String): PromisedAssertion = js.native
  def `false`(`type`: String, message: String): PromisedAssertion = js.native
  def frozen(`type`: String): PromisedAssertion = js.native
  def frozen(`type`: String, message: String): PromisedAssertion = js.native
  def fulfilled(`type`: String): PromisedAssertion = js.native
  def fulfilled(`type`: String, message: String): PromisedAssertion = js.native
  def haveOwnProperty(name: String): PromisedAssertion = js.native
  def haveOwnProperty(name: String, message: String): PromisedAssertion = js.native
  def haveOwnPropertyDescriptor(name: String): PromisedAssertion = js.native
  def haveOwnPropertyDescriptor(name: String, descriptor: PropertyDescriptor): PromisedAssertion = js.native
  def haveOwnPropertyDescriptor(name: String, descriptor: PropertyDescriptor, message: String): PromisedAssertion = js.native
  def haveOwnPropertyDescriptor(name: String, message: String): PromisedAssertion = js.native
  def include(value: String): PromisedAssertion = js.native
  def include(value: String, message: String): PromisedAssertion = js.native
  def include(value: js.Object): PromisedAssertion = js.native
  def include(value: js.Object, message: String): PromisedAssertion = js.native
  def include(value: Double): PromisedAssertion = js.native
  def include(value: Double, message: String): PromisedAssertion = js.native
  def increase(`object`: js.Object, property: String): PromisedAssertion = js.native
  def increase(`object`: js.Object, property: String, message: String): PromisedAssertion = js.native
  def increases(`object`: js.Object, property: String): PromisedAssertion = js.native
  def increases(`object`: js.Object, property: String, message: String): PromisedAssertion = js.native
  def itself(`type`: String): PromisedAssertion = js.native
  def itself(`type`: String, message: String): PromisedAssertion = js.native
  def key(string: String): PromisedAssertion = js.native
  def keys(keys: String*): PromisedAssertion = js.native
  def keys(keys: js.Array[_]): PromisedAssertion = js.native
  def keys(keys: js.Object): PromisedAssertion = js.native
  def length(length: Double): PromisedAssertion = js.native
  def length(length: Double, message: String): PromisedAssertion = js.native
  def lengthOf(length: Double): PromisedAssertion = js.native
  def lengthOf(length: Double, message: String): PromisedAssertion = js.native
  def `match`(regexp: String): PromisedAssertion = js.native
  def `match`(regexp: String, message: String): PromisedAssertion = js.native
  def `match`(regexp: RegExp): PromisedAssertion = js.native
  def `match`(regexp: RegExp, message: String): PromisedAssertion = js.native
  def matches(regexp: String): PromisedAssertion = js.native
  def matches(regexp: String, message: String): PromisedAssertion = js.native
  def matches(regexp: RegExp): PromisedAssertion = js.native
  def matches(regexp: RegExp, message: String): PromisedAssertion = js.native
  def members(set: js.Array[_]): PromisedAssertion = js.native
  def members(set: js.Array[_], message: String): PromisedAssertion = js.native
  // From chai
  def not(`type`: String): PromisedAssertion = js.native
  def not(`type`: String, message: String): PromisedAssertion = js.native
  def notify(fn: js.Function): PromisedAssertion = js.native
  def `null`(`type`: String): PromisedAssertion = js.native
  def `null`(`type`: String, message: String): PromisedAssertion = js.native
  def ok(`type`: String): PromisedAssertion = js.native
  def ok(`type`: String, message: String): PromisedAssertion = js.native
  def oneOf(list: js.Array[_]): PromisedAssertion = js.native
  def oneOf(list: js.Array[_], message: String): PromisedAssertion = js.native
  def ownProperty(name: String): PromisedAssertion = js.native
  def ownProperty(name: String, message: String): PromisedAssertion = js.native
  def ownPropertyDescriptor(name: String): PromisedAssertion = js.native
  def ownPropertyDescriptor(name: String, descriptor: PropertyDescriptor): PromisedAssertion = js.native
  def ownPropertyDescriptor(name: String, descriptor: PropertyDescriptor, message: String): PromisedAssertion = js.native
  def ownPropertyDescriptor(name: String, message: String): PromisedAssertion = js.native
  def property(name: String): PromisedAssertion = js.native
  def property(name: String, value: js.Any): PromisedAssertion = js.native
  def property(name: String, value: js.Any, message: String): PromisedAssertion = js.native
  def rejected(`type`: String): PromisedAssertion = js.native
  def rejected(`type`: String, message: String): PromisedAssertion = js.native
  def rejectedWith(): PromisedAssertion = js.native
  def rejectedWith(constructor: js.Function): PromisedAssertion = js.native
  def rejectedWith(constructor: js.Function, expected: String): PromisedAssertion = js.native
  def rejectedWith(constructor: js.Function, expected: String, message: String): PromisedAssertion = js.native
  def rejectedWith(constructor: js.Function, expected: RegExp): PromisedAssertion = js.native
  def rejectedWith(constructor: js.Function, expected: RegExp, message: String): PromisedAssertion = js.native
  def rejectedWith(constructor: Error): PromisedAssertion = js.native
  def rejectedWith(constructor: Error, expected: String): PromisedAssertion = js.native
  def rejectedWith(constructor: Error, expected: String, message: String): PromisedAssertion = js.native
  def rejectedWith(constructor: Error, expected: RegExp): PromisedAssertion = js.native
  def rejectedWith(constructor: Error, expected: RegExp, message: String): PromisedAssertion = js.native
  def rejectedWith(expected: String): PromisedAssertion = js.native
  def rejectedWith(expected: String, message: String): PromisedAssertion = js.native
  def rejectedWith(expected: RegExp): PromisedAssertion = js.native
  def rejectedWith(expected: RegExp, message: String): PromisedAssertion = js.native
  def respondTo(method: String): PromisedAssertion = js.native
  def respondTo(method: String, message: String): PromisedAssertion = js.native
  def respondsTo(method: String): PromisedAssertion = js.native
  def respondsTo(method: String, message: String): PromisedAssertion = js.native
  def satisfies(matcher: js.Function): PromisedAssertion = js.native
  def satisfies(matcher: js.Function, message: String): PromisedAssertion = js.native
  def satisfy(matcher: js.Function): PromisedAssertion = js.native
  def satisfy(matcher: js.Function, message: String): PromisedAssertion = js.native
  def `sealed`(`type`: String): PromisedAssertion = js.native
  def `sealed`(`type`: String, message: String): PromisedAssertion = js.native
  def string(string: String): PromisedAssertion = js.native
  def string(string: String, message: String): PromisedAssertion = js.native
  def `throw`(): PromisedAssertion = js.native
  def `throw`(constructor: js.Function): PromisedAssertion = js.native
  def `throw`(constructor: js.Function, expected: String): PromisedAssertion = js.native
  def `throw`(constructor: js.Function, expected: String, message: String): PromisedAssertion = js.native
  def `throw`(constructor: js.Function, expected: RegExp): PromisedAssertion = js.native
  def `throw`(constructor: js.Function, expected: RegExp, message: String): PromisedAssertion = js.native
  def `throw`(constructor: Error): PromisedAssertion = js.native
  def `throw`(constructor: Error, expected: String): PromisedAssertion = js.native
  def `throw`(constructor: Error, expected: String, message: String): PromisedAssertion = js.native
  def `throw`(constructor: Error, expected: RegExp): PromisedAssertion = js.native
  def `throw`(constructor: Error, expected: RegExp, message: String): PromisedAssertion = js.native
  def `throw`(expected: String): PromisedAssertion = js.native
  def `throw`(expected: String, message: String): PromisedAssertion = js.native
  def `throw`(expected: RegExp): PromisedAssertion = js.native
  def `throw`(expected: RegExp, message: String): PromisedAssertion = js.native
  def throws(): PromisedAssertion = js.native
  def throws(constructor: js.Function): PromisedAssertion = js.native
  def throws(constructor: js.Function, expected: String): PromisedAssertion = js.native
  def throws(constructor: js.Function, expected: String, message: String): PromisedAssertion = js.native
  def throws(constructor: js.Function, expected: RegExp): PromisedAssertion = js.native
  def throws(constructor: js.Function, expected: RegExp, message: String): PromisedAssertion = js.native
  def throws(constructor: Error): PromisedAssertion = js.native
  def throws(constructor: Error, expected: String): PromisedAssertion = js.native
  def throws(constructor: Error, expected: String, message: String): PromisedAssertion = js.native
  def throws(constructor: Error, expected: RegExp): PromisedAssertion = js.native
  def throws(constructor: Error, expected: RegExp, message: String): PromisedAssertion = js.native
  def throws(expected: String): PromisedAssertion = js.native
  def throws(expected: String, message: String): PromisedAssertion = js.native
  def throws(expected: RegExp): PromisedAssertion = js.native
  def throws(expected: RegExp, message: String): PromisedAssertion = js.native
  def `true`(`type`: String): PromisedAssertion = js.native
  def `true`(`type`: String, message: String): PromisedAssertion = js.native
  def undefined(`type`: String): PromisedAssertion = js.native
  def undefined(`type`: String, message: String): PromisedAssertion = js.native
}

