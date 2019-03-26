package typings
package cypressLib.ChaiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Assertion
  extends LanguageChains
     with NumericComparison
     with TypeComparison {
  @JSName("Arguments")
  var Arguments_Original: Assertion = js.native
  @JSName("NaN")
  var NaN_Original: Assertion = js.native
  @JSName("Throw")
  var Throw_Original: Throw = js.native
  @JSName("a")
  var a_Original: TypeComparison = js.native
  var all: KeyFilter = js.native
  @JSName("an")
  var an_Original: TypeComparison = js.native
  var any: KeyFilter = js.native
  @JSName("approximately")
  var approximately_Original: CloseTo = js.native
  @JSName("arguments")
  var arguments_Original: Assertion = js.native
  @JSName("change")
  var change_Original: PropertyChange = js.native
  @JSName("changes")
  var changes_Original: PropertyChange = js.native
  @JSName("closeTo")
  var closeTo_Original: CloseTo = js.native
  @JSName("contain")
  var contain_Original: Include = js.native
  @JSName("contains")
  var contains_Original: Include = js.native
  @JSName("decrease")
  var decrease_Original: PropertyChange = js.native
  @JSName("decreases")
  var decreases_Original: PropertyChange = js.native
  var deep: Deep = js.native
  @JSName("empty")
  var empty_Original: Assertion = js.native
  @JSName("eq")
  var eq_Original: Equal = js.native
  @JSName("eql")
  var eql_Original: Equal = js.native
  @JSName("eqls")
  var eqls_Original: Equal = js.native
  @JSName("equal")
  var equal_Original: Equal = js.native
  @JSName("equals")
  var equals_Original: Equal = js.native
  @JSName("exist")
  var exist_Original: Assertion = js.native
  @JSName("extensible")
  var extensible_Original: Assertion = js.native
  @JSName("false")
  var false_Original: Assertion = js.native
  @JSName("frozen")
  var frozen_Original: Assertion = js.native
  @JSName("haveOwnPropertyDescriptor")
  var haveOwnPropertyDescriptor_Original: OwnPropertyDescriptor = js.native
  @JSName("haveOwnProperty")
  var haveOwnProperty_Original: OwnProperty = js.native
  @JSName("include")
  var include_Original: Include = js.native
  @JSName("includes")
  var includes_Original: Include = js.native
  @JSName("increase")
  var increase_Original: PropertyChange = js.native
  @JSName("increases")
  var increases_Original: PropertyChange = js.native
  @JSName("itself")
  var itself_Original: Assertion = js.native
  @JSName("keys")
  var keys_Original: Keys = js.native
  @JSName("lengthOf")
  var lengthOf_Original: Length = js.native
  @JSName("length")
  var length_Original: Length = js.native
  @JSName("match")
  var match_Original: Match = js.native
  @JSName("matches")
  var matches_Original: Match = js.native
  @JSName("members")
  var members_Original: Members = js.native
  var nested: Nested = js.native
  @JSName("not")
  var not_Original: Assertion = js.native
  @JSName("null")
  var null_Original: Assertion = js.native
  @JSName("ok")
  var ok_Original: Assertion = js.native
  var ordered: Ordered = js.native
  @JSName("ownPropertyDescriptor")
  var ownPropertyDescriptor_Original: OwnPropertyDescriptor = js.native
  @JSName("ownProperty")
  var ownProperty_Original: OwnProperty = js.native
  @JSName("property")
  var property_Original: Property = js.native
  @JSName("respondTo")
  var respondTo_Original: RespondTo = js.native
  @JSName("respondsTo")
  var respondsTo_Original: RespondTo = js.native
  @JSName("satisfies")
  var satisfies_Original: Satisfy = js.native
  @JSName("satisfy")
  var satisfy_Original: Satisfy = js.native
  @JSName("sealed")
  var sealed_Original: Assertion = js.native
  @JSName("throw")
  var throw_Original: Throw = js.native
  @JSName("throws")
  var throws_Original: Throw = js.native
  @JSName("true")
  var true_Original: Assertion = js.native
  @JSName("undefined")
  var undefined_Original: Assertion = js.native
  def Arguments(selector: java.lang.String): Assertion = js.native
  def Arguments(`type`: java.lang.String, message: java.lang.String): Assertion = js.native
  def NaN(selector: java.lang.String): Assertion = js.native
  def NaN(`type`: java.lang.String, message: java.lang.String): Assertion = js.native
  def Throw(): Assertion = js.native
  def Throw(constructor: js.Function): Assertion = js.native
  def Throw(constructor: js.Function, expected: java.lang.String): Assertion = js.native
  def Throw(constructor: js.Function, expected: java.lang.String, message: java.lang.String): Assertion = js.native
  def Throw(constructor: js.Function, expected: stdLib.RegExp): Assertion = js.native
  def Throw(constructor: js.Function, expected: stdLib.RegExp, message: java.lang.String): Assertion = js.native
  def Throw(constructor: stdLib.Error): Assertion = js.native
  def Throw(constructor: stdLib.Error, expected: java.lang.String): Assertion = js.native
  def Throw(constructor: stdLib.Error, expected: java.lang.String, message: java.lang.String): Assertion = js.native
  def Throw(constructor: stdLib.Error, expected: stdLib.RegExp): Assertion = js.native
  def Throw(constructor: stdLib.Error, expected: stdLib.RegExp, message: java.lang.String): Assertion = js.native
  def Throw(expected: java.lang.String): Assertion = js.native
  def Throw(expected: java.lang.String, message: java.lang.String): Assertion = js.native
  def Throw(expected: stdLib.RegExp): Assertion = js.native
  def Throw(expected: stdLib.RegExp, message: java.lang.String): Assertion = js.native
  def a(`type`: java.lang.String): Assertion = js.native
  def a(`type`: java.lang.String, message: java.lang.String): Assertion = js.native
  def an(`type`: java.lang.String): Assertion = js.native
  def an(`type`: java.lang.String, message: java.lang.String): Assertion = js.native
  def approximately(expected: scala.Double, delta: scala.Double): Assertion = js.native
  def approximately(expected: scala.Double, delta: scala.Double, message: java.lang.String): Assertion = js.native
  def arguments(selector: java.lang.String): Assertion = js.native
  def arguments(`type`: java.lang.String, message: java.lang.String): Assertion = js.native
  def attr(name: java.lang.String): Assertion = js.native
  def attr(name: java.lang.String, value: java.lang.String): Assertion = js.native
  def change(`object`: cypressLib.Object, property: java.lang.String): Assertion = js.native
  def change(`object`: cypressLib.Object, property: java.lang.String, message: java.lang.String): Assertion = js.native
  def changes(`object`: cypressLib.Object, property: java.lang.String): Assertion = js.native
  def changes(`object`: cypressLib.Object, property: java.lang.String, message: java.lang.String): Assertion = js.native
  def checked(): Assertion = js.native
  def `class`(className: java.lang.String): Assertion = js.native
  def closeTo(expected: scala.Double, delta: scala.Double): Assertion = js.native
  def closeTo(expected: scala.Double, delta: scala.Double, message: java.lang.String): Assertion = js.native
  def contain(value: cypressLib.Object): Assertion = js.native
  def contain(value: cypressLib.Object, message: java.lang.String): Assertion = js.native
  def contain(value: java.lang.String): Assertion = js.native
  def contain(value: java.lang.String, message: java.lang.String): Assertion = js.native
  def contain(value: scala.Double): Assertion = js.native
  def contain(value: scala.Double, message: java.lang.String): Assertion = js.native
  def contains(value: cypressLib.Object): Assertion = js.native
  def contains(value: cypressLib.Object, message: java.lang.String): Assertion = js.native
  def contains(value: java.lang.String): Assertion = js.native
  def contains(value: java.lang.String, message: java.lang.String): Assertion = js.native
  def contains(value: scala.Double): Assertion = js.native
  def contains(value: scala.Double, message: java.lang.String): Assertion = js.native
  def css(name: java.lang.String): Assertion = js.native
  def css(name: java.lang.String, value: java.lang.String): Assertion = js.native
  def data(name: java.lang.String): Assertion = js.native
  def data(name: java.lang.String, value: java.lang.String): Assertion = js.native
  def decrease(`object`: cypressLib.Object, property: java.lang.String): Assertion = js.native
  def decrease(`object`: cypressLib.Object, property: java.lang.String, message: java.lang.String): Assertion = js.native
  def decreases(`object`: cypressLib.Object, property: java.lang.String): Assertion = js.native
  def decreases(`object`: cypressLib.Object, property: java.lang.String, message: java.lang.String): Assertion = js.native
  def descendants(selector: java.lang.String): Assertion = js.native
  def disabled(): Assertion = js.native
  def empty(selector: java.lang.String): Assertion = js.native
  def empty(`type`: java.lang.String, message: java.lang.String): Assertion = js.native
  def enabled(): Assertion = js.native
  def eq(value: js.Any): Assertion = js.native
  def eq(value: js.Any, message: java.lang.String): Assertion = js.native
  def eql(value: js.Any): Assertion = js.native
  def eql(value: js.Any, message: java.lang.String): Assertion = js.native
  def eqls(value: js.Any): Assertion = js.native
  def eqls(value: js.Any, message: java.lang.String): Assertion = js.native
  def equal(value: js.Any): Assertion = js.native
  def equal(value: js.Any, message: java.lang.String): Assertion = js.native
  def equals(value: js.Any): Assertion = js.native
  def equals(value: js.Any, message: java.lang.String): Assertion = js.native
  def exist(selector: java.lang.String): Assertion = js.native
  def exist(`type`: java.lang.String, message: java.lang.String): Assertion = js.native
  def extensible(selector: java.lang.String): Assertion = js.native
  def extensible(`type`: java.lang.String, message: java.lang.String): Assertion = js.native
  def `false`(selector: java.lang.String): Assertion = js.native
  def `false`(`type`: java.lang.String, message: java.lang.String): Assertion = js.native
  def frozen(selector: java.lang.String): Assertion = js.native
  def frozen(`type`: java.lang.String, message: java.lang.String): Assertion = js.native
  def haveOwnProperty(name: java.lang.String): Assertion = js.native
  def haveOwnProperty(name: java.lang.String, message: java.lang.String): Assertion = js.native
  def haveOwnPropertyDescriptor(name: java.lang.String): Assertion = js.native
  def haveOwnPropertyDescriptor(name: java.lang.String, descriptor: stdLib.PropertyDescriptor): Assertion = js.native
  def haveOwnPropertyDescriptor(name: java.lang.String, descriptor: stdLib.PropertyDescriptor, message: java.lang.String): Assertion = js.native
  def haveOwnPropertyDescriptor(name: java.lang.String, message: java.lang.String): Assertion = js.native
  def hidden(): Assertion = js.native
  def html(html: java.lang.String): Assertion = js.native
  def id(id: java.lang.String): Assertion = js.native
  def include(value: cypressLib.Object): Assertion = js.native
  def include(value: cypressLib.Object, message: java.lang.String): Assertion = js.native
  def include(value: java.lang.String): Assertion = js.native
  def include(value: java.lang.String, message: java.lang.String): Assertion = js.native
  def include(value: scala.Double): Assertion = js.native
  def include(value: scala.Double, message: java.lang.String): Assertion = js.native
  def includes(value: cypressLib.Object): Assertion = js.native
  def includes(value: cypressLib.Object, message: java.lang.String): Assertion = js.native
  def includes(value: java.lang.String): Assertion = js.native
  def includes(value: java.lang.String, message: java.lang.String): Assertion = js.native
  def includes(value: scala.Double): Assertion = js.native
  def includes(value: scala.Double, message: java.lang.String): Assertion = js.native
  def increase(`object`: cypressLib.Object, property: java.lang.String): Assertion = js.native
  def increase(`object`: cypressLib.Object, property: java.lang.String, message: java.lang.String): Assertion = js.native
  def increases(`object`: cypressLib.Object, property: java.lang.String): Assertion = js.native
  def increases(`object`: cypressLib.Object, property: java.lang.String, message: java.lang.String): Assertion = js.native
  def itself(selector: java.lang.String): Assertion = js.native
  def itself(`type`: java.lang.String, message: java.lang.String): Assertion = js.native
  def key(string: java.lang.String): Assertion = js.native
  def keys(keys: java.lang.String*): Assertion = js.native
  def keys(keys: cypressLib.Object): Assertion = js.native
  def keys(keys: js.Array[_]): Assertion = js.native
  def length(length: scala.Double): Assertion = js.native
  def length(length: scala.Double, message: java.lang.String): Assertion = js.native
  def lengthOf(length: scala.Double): Assertion = js.native
  def lengthOf(length: scala.Double, message: java.lang.String): Assertion = js.native
  def `match`(regexp: java.lang.String, message: java.lang.String): Assertion = js.native
  def `match`(regexp: stdLib.RegExp): Assertion = js.native
  def `match`(regexp: stdLib.RegExp, message: java.lang.String): Assertion = js.native
  def `match`(selector: java.lang.String): Assertion = js.native
  def matches(regexp: java.lang.String, message: java.lang.String): Assertion = js.native
  def matches(regexp: stdLib.RegExp): Assertion = js.native
  def matches(regexp: stdLib.RegExp, message: java.lang.String): Assertion = js.native
  def matches(selector: java.lang.String): Assertion = js.native
  def members(set: js.Array[_]): Assertion = js.native
  def members(set: js.Array[_], message: java.lang.String): Assertion = js.native
  def not(selector: java.lang.String): Assertion = js.native
  def not(`type`: java.lang.String, message: java.lang.String): Assertion = js.native
  def `null`(selector: java.lang.String): Assertion = js.native
  def `null`(`type`: java.lang.String, message: java.lang.String): Assertion = js.native
  def ok(selector: java.lang.String): Assertion = js.native
  def ok(`type`: java.lang.String, message: java.lang.String): Assertion = js.native
  def oneOf(list: js.Array[_]): Assertion = js.native
  def oneOf(list: js.Array[_], message: java.lang.String): Assertion = js.native
  def ownProperty(name: java.lang.String): Assertion = js.native
  def ownProperty(name: java.lang.String, message: java.lang.String): Assertion = js.native
  def ownPropertyDescriptor(name: java.lang.String): Assertion = js.native
  def ownPropertyDescriptor(name: java.lang.String, descriptor: stdLib.PropertyDescriptor): Assertion = js.native
  def ownPropertyDescriptor(name: java.lang.String, descriptor: stdLib.PropertyDescriptor, message: java.lang.String): Assertion = js.native
  def ownPropertyDescriptor(name: java.lang.String, message: java.lang.String): Assertion = js.native
  def prop(name: java.lang.String): Assertion = js.native
  def prop(name: java.lang.String, value: js.Any): Assertion = js.native
  def property(name: java.lang.String): Assertion = js.native
  def property(name: java.lang.String, value: js.Any): Assertion = js.native
  def property(name: java.lang.String, value: js.Any, message: java.lang.String): Assertion = js.native
  def respondTo(method: java.lang.String): Assertion = js.native
  def respondTo(method: java.lang.String, message: java.lang.String): Assertion = js.native
  def respondsTo(method: java.lang.String): Assertion = js.native
  def respondsTo(method: java.lang.String, message: java.lang.String): Assertion = js.native
  def satisfies(matcher: js.Function): Assertion = js.native
  def satisfies(matcher: js.Function, message: java.lang.String): Assertion = js.native
  def satisfy(matcher: js.Function): Assertion = js.native
  def satisfy(matcher: js.Function, message: java.lang.String): Assertion = js.native
  def `sealed`(selector: java.lang.String): Assertion = js.native
  def `sealed`(`type`: java.lang.String, message: java.lang.String): Assertion = js.native
  def selected(): Assertion = js.native
  def string(string: java.lang.String): Assertion = js.native
  def string(string: java.lang.String, message: java.lang.String): Assertion = js.native
  def text(text: java.lang.String): Assertion = js.native
  def `throw`(): Assertion = js.native
  def `throw`(constructor: js.Function): Assertion = js.native
  def `throw`(constructor: js.Function, expected: java.lang.String): Assertion = js.native
  def `throw`(constructor: js.Function, expected: java.lang.String, message: java.lang.String): Assertion = js.native
  def `throw`(constructor: js.Function, expected: stdLib.RegExp): Assertion = js.native
  def `throw`(constructor: js.Function, expected: stdLib.RegExp, message: java.lang.String): Assertion = js.native
  def `throw`(constructor: stdLib.Error): Assertion = js.native
  def `throw`(constructor: stdLib.Error, expected: java.lang.String): Assertion = js.native
  def `throw`(constructor: stdLib.Error, expected: java.lang.String, message: java.lang.String): Assertion = js.native
  def `throw`(constructor: stdLib.Error, expected: stdLib.RegExp): Assertion = js.native
  def `throw`(constructor: stdLib.Error, expected: stdLib.RegExp, message: java.lang.String): Assertion = js.native
  def `throw`(expected: java.lang.String): Assertion = js.native
  def `throw`(expected: java.lang.String, message: java.lang.String): Assertion = js.native
  def `throw`(expected: stdLib.RegExp): Assertion = js.native
  def `throw`(expected: stdLib.RegExp, message: java.lang.String): Assertion = js.native
  def throws(): Assertion = js.native
  def throws(constructor: js.Function): Assertion = js.native
  def throws(constructor: js.Function, expected: java.lang.String): Assertion = js.native
  def throws(constructor: js.Function, expected: java.lang.String, message: java.lang.String): Assertion = js.native
  def throws(constructor: js.Function, expected: stdLib.RegExp): Assertion = js.native
  def throws(constructor: js.Function, expected: stdLib.RegExp, message: java.lang.String): Assertion = js.native
  def throws(constructor: stdLib.Error): Assertion = js.native
  def throws(constructor: stdLib.Error, expected: java.lang.String): Assertion = js.native
  def throws(constructor: stdLib.Error, expected: java.lang.String, message: java.lang.String): Assertion = js.native
  def throws(constructor: stdLib.Error, expected: stdLib.RegExp): Assertion = js.native
  def throws(constructor: stdLib.Error, expected: stdLib.RegExp, message: java.lang.String): Assertion = js.native
  def throws(expected: java.lang.String): Assertion = js.native
  def throws(expected: java.lang.String, message: java.lang.String): Assertion = js.native
  def throws(expected: stdLib.RegExp): Assertion = js.native
  def throws(expected: stdLib.RegExp, message: java.lang.String): Assertion = js.native
  def `true`(selector: java.lang.String): Assertion = js.native
  def `true`(`type`: java.lang.String, message: java.lang.String): Assertion = js.native
  def undefined(selector: java.lang.String): Assertion = js.native
  def undefined(`type`: java.lang.String, message: java.lang.String): Assertion = js.native
  def value(text: java.lang.String): Assertion = js.native
  def visible(): Assertion = js.native
}

