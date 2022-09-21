package typings.chai.Chai

import typings.chai.Object
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Assertion
  extends StObject
     with LanguageChains
     with NumericComparison
     with TypeComparison {
  
  def Arguments(`type`: String): Assertion = js.native
  def Arguments(`type`: String, message: String): Assertion = js.native
  @JSName("Arguments")
  var Arguments_Original: Assertion = js.native
  
  def NaN(`type`: String): Assertion = js.native
  def NaN(`type`: String, message: String): Assertion = js.native
  @JSName("NaN")
  var NaN_Original: Assertion = js.native
  
  def Throw(): Assertion = js.native
  def Throw(constructor: js.Error): Assertion = js.native
  def Throw(constructor: js.Error, expected: String): Assertion = js.native
  def Throw(constructor: js.Error, expected: String, message: String): Assertion = js.native
  def Throw(constructor: js.Error, expected: js.RegExp): Assertion = js.native
  def Throw(constructor: js.Error, expected: js.RegExp, message: String): Assertion = js.native
  def Throw(constructor: js.Error, expected: Unit, message: String): Assertion = js.native
  def Throw(constructor: js.Function): Assertion = js.native
  def Throw(constructor: js.Function, expected: String): Assertion = js.native
  def Throw(constructor: js.Function, expected: String, message: String): Assertion = js.native
  def Throw(constructor: js.Function, expected: js.RegExp): Assertion = js.native
  def Throw(constructor: js.Function, expected: js.RegExp, message: String): Assertion = js.native
  def Throw(constructor: js.Function, expected: Unit, message: String): Assertion = js.native
  def Throw(expected: String): Assertion = js.native
  def Throw(expected: String, message: String): Assertion = js.native
  def Throw(expected: js.RegExp): Assertion = js.native
  def Throw(expected: js.RegExp, message: String): Assertion = js.native
  def Throw(expected: Unit, message: String): Assertion = js.native
  @JSName("Throw")
  var Throw_Original: Throw = js.native
  
  def a(`type`: String): Assertion = js.native
  def a(`type`: String, message: String): Assertion = js.native
  @JSName("a")
  var a_Original: Assertion = js.native
  
  var all: KeyFilter = js.native
  
  def an(`type`: String): Assertion = js.native
  def an(`type`: String, message: String): Assertion = js.native
  @JSName("an")
  var an_Original: Assertion = js.native
  
  var any: KeyFilter = js.native
  
  def approximately(expected: Double, delta: Double): Assertion = js.native
  def approximately(expected: Double, delta: Double, message: String): Assertion = js.native
  @JSName("approximately")
  var approximately_Original: CloseTo = js.native
  
  def arguments(`type`: String): Assertion = js.native
  def arguments(`type`: String, message: String): Assertion = js.native
  @JSName("arguments")
  var arguments_Original: Assertion = js.native
  
  def change(`object`: Object): DeltaAssertion = js.native
  def change(`object`: Object, property: String): DeltaAssertion = js.native
  def change(`object`: Object, property: String, message: String): DeltaAssertion = js.native
  def change(`object`: Object, property: Unit, message: String): DeltaAssertion = js.native
  @JSName("change")
  var change_Original: PropertyChange = js.native
  
  def changes(`object`: Object): DeltaAssertion = js.native
  def changes(`object`: Object, property: String): DeltaAssertion = js.native
  def changes(`object`: Object, property: String, message: String): DeltaAssertion = js.native
  def changes(`object`: Object, property: Unit, message: String): DeltaAssertion = js.native
  @JSName("changes")
  var changes_Original: PropertyChange = js.native
  
  def closeTo(expected: Double, delta: Double): Assertion = js.native
  def closeTo(expected: Double, delta: Double, message: String): Assertion = js.native
  @JSName("closeTo")
  var closeTo_Original: CloseTo = js.native
  
  def contain(value: Any): Assertion = js.native
  def contain(value: Any, message: String): Assertion = js.native
  @JSName("contain")
  var contain_Original: Include = js.native
  
  def contains(value: Any): Assertion = js.native
  def contains(value: Any, message: String): Assertion = js.native
  @JSName("contains")
  var contains_Original: Include = js.native
  
  def decrease(`object`: Object): DeltaAssertion = js.native
  def decrease(`object`: Object, property: String): DeltaAssertion = js.native
  def decrease(`object`: Object, property: String, message: String): DeltaAssertion = js.native
  def decrease(`object`: Object, property: Unit, message: String): DeltaAssertion = js.native
  @JSName("decrease")
  var decrease_Original: PropertyChange = js.native
  
  def decreases(`object`: Object): DeltaAssertion = js.native
  def decreases(`object`: Object, property: String): DeltaAssertion = js.native
  def decreases(`object`: Object, property: String, message: String): DeltaAssertion = js.native
  def decreases(`object`: Object, property: Unit, message: String): DeltaAssertion = js.native
  @JSName("decreases")
  var decreases_Original: PropertyChange = js.native
  
  var deep: Deep = js.native
  
  def empty(`type`: String): Assertion = js.native
  def empty(`type`: String, message: String): Assertion = js.native
  @JSName("empty")
  var empty_Original: Assertion = js.native
  
  def eq(value: Any, message: String): Assertion = js.native
  @JSName("eq")
  var eq_Original: Equal = js.native
  
  def eql(value: Any): Assertion = js.native
  def eql(value: Any, message: String): Assertion = js.native
  @JSName("eql")
  var eql_Original: Equal = js.native
  
  def eqls(value: Any): Assertion = js.native
  def eqls(value: Any, message: String): Assertion = js.native
  @JSName("eqls")
  var eqls_Original: Equal = js.native
  
  def equal(value: Any): Assertion = js.native
  def equal(value: Any, message: String): Assertion = js.native
  @JSName("equal")
  var equal_Original: Equal = js.native
  
  def equals(value: Any, message: String): Assertion = js.native
  @JSName("equals")
  var equals_Original: Equal = js.native
  
  def exist(`type`: String): Assertion = js.native
  def exist(`type`: String, message: String): Assertion = js.native
  @JSName("exist")
  var exist_Original: Assertion = js.native
  
  def extensible(`type`: String): Assertion = js.native
  def extensible(`type`: String, message: String): Assertion = js.native
  @JSName("extensible")
  var extensible_Original: Assertion = js.native
  
  def `false`(`type`: String): Assertion = js.native
  def `false`(`type`: String, message: String): Assertion = js.native
  @JSName("false")
  var false_Original: Assertion = js.native
  
  def finite(`type`: String): Assertion = js.native
  def finite(`type`: String, message: String): Assertion = js.native
  @JSName("finite")
  var finite_Original: Assertion = js.native
  
  def frozen(`type`: String): Assertion = js.native
  def frozen(`type`: String, message: String): Assertion = js.native
  @JSName("frozen")
  var frozen_Original: Assertion = js.native
  
  def haveOwnProperty(name: String): Assertion = js.native
  def haveOwnProperty(name: String, message: String): Assertion = js.native
  def haveOwnProperty(name: String, value: Any): Assertion = js.native
  def haveOwnProperty(name: String, value: Any, message: String): Assertion = js.native
  def haveOwnProperty(name: js.Symbol): Assertion = js.native
  def haveOwnProperty(name: js.Symbol, message: String): Assertion = js.native
  def haveOwnProperty(name: js.Symbol, value: Any): Assertion = js.native
  def haveOwnProperty(name: js.Symbol, value: Any, message: String): Assertion = js.native
  
  def haveOwnPropertyDescriptor(name: String): Assertion = js.native
  def haveOwnPropertyDescriptor(name: String, descriptor: js.PropertyDescriptor): Assertion = js.native
  def haveOwnPropertyDescriptor(name: String, descriptor: js.PropertyDescriptor, message: String): Assertion = js.native
  def haveOwnPropertyDescriptor(name: String, message: String): Assertion = js.native
  def haveOwnPropertyDescriptor(name: js.Symbol): Assertion = js.native
  def haveOwnPropertyDescriptor(name: js.Symbol, descriptor: js.PropertyDescriptor): Assertion = js.native
  def haveOwnPropertyDescriptor(name: js.Symbol, descriptor: js.PropertyDescriptor, message: String): Assertion = js.native
  def haveOwnPropertyDescriptor(name: js.Symbol, message: String): Assertion = js.native
  @JSName("haveOwnPropertyDescriptor")
  var haveOwnPropertyDescriptor_Original: OwnPropertyDescriptor = js.native
  
  @JSName("haveOwnProperty")
  var haveOwnProperty_Original: Property = js.native
  
  def include(value: Any): Assertion = js.native
  def include(value: Any, message: String): Assertion = js.native
  @JSName("include")
  var include_Original: Include = js.native
  
  def includes(value: Any): Assertion = js.native
  def includes(value: Any, message: String): Assertion = js.native
  @JSName("includes")
  var includes_Original: Include = js.native
  
  def increase(`object`: Object): DeltaAssertion = js.native
  def increase(`object`: Object, property: String): DeltaAssertion = js.native
  def increase(`object`: Object, property: String, message: String): DeltaAssertion = js.native
  def increase(`object`: Object, property: Unit, message: String): DeltaAssertion = js.native
  @JSName("increase")
  var increase_Original: PropertyChange = js.native
  
  def increases(`object`: Object): DeltaAssertion = js.native
  def increases(`object`: Object, property: String): DeltaAssertion = js.native
  def increases(`object`: Object, property: String, message: String): DeltaAssertion = js.native
  def increases(`object`: Object, property: Unit, message: String): DeltaAssertion = js.native
  @JSName("increases")
  var increases_Original: PropertyChange = js.native
  
  def itself(`type`: String): Assertion = js.native
  def itself(`type`: String, message: String): Assertion = js.native
  @JSName("itself")
  var itself_Original: Assertion = js.native
  
  def key(string: String): Assertion = js.native
  
  def keys(keys: String*): Assertion = js.native
  def keys(keys: js.Array[Any]): Assertion = js.native
  def keys(keys: Object): Assertion = js.native
  @JSName("keys")
  var keys_Original: Keys = js.native
  
  def length(length: Double): Assertion = js.native
  def length(length: Double, message: String): Assertion = js.native
  
  def lengthOf(length: Double): Assertion = js.native
  def lengthOf(length: Double, message: String): Assertion = js.native
  @JSName("lengthOf")
  var lengthOf_Original: Length = js.native
  
  @JSName("length")
  var length_Original: Length = js.native
  
  def `match`(regexp: js.RegExp): Assertion = js.native
  def `match`(regexp: js.RegExp, message: String): Assertion = js.native
  @JSName("match")
  var match_Original: Match = js.native
  
  def matches(regexp: js.RegExp): Assertion = js.native
  def matches(regexp: js.RegExp, message: String): Assertion = js.native
  @JSName("matches")
  var matches_Original: Match = js.native
  
  def members(set: js.Array[Any]): Assertion = js.native
  def members(set: js.Array[Any], message: String): Assertion = js.native
  @JSName("members")
  var members_Original: Members = js.native
  
  var nested: Nested = js.native
  
  def not(`type`: String): Assertion = js.native
  def not(`type`: String, message: String): Assertion = js.native
  @JSName("not")
  var not_Original: Assertion = js.native
  
  def `null`(`type`: String): Assertion = js.native
  def `null`(`type`: String, message: String): Assertion = js.native
  @JSName("null")
  var null_Original: Assertion = js.native
  
  def ok(`type`: String): Assertion = js.native
  def ok(`type`: String, message: String): Assertion = js.native
  @JSName("ok")
  var ok_Original: Assertion = js.native
  
  def oneOf(list: js.Array[Any]): Assertion = js.native
  def oneOf(list: js.Array[Any], message: String): Assertion = js.native
  @JSName("oneOf")
  var oneOf_Original: OneOf = js.native
  
  var ordered: Ordered = js.native
  
  var own: Own = js.native
  
  def ownProperty(name: String): Assertion = js.native
  def ownProperty(name: String, message: String): Assertion = js.native
  def ownProperty(name: String, value: Any): Assertion = js.native
  def ownProperty(name: String, value: Any, message: String): Assertion = js.native
  def ownProperty(name: js.Symbol): Assertion = js.native
  def ownProperty(name: js.Symbol, message: String): Assertion = js.native
  def ownProperty(name: js.Symbol, value: Any): Assertion = js.native
  def ownProperty(name: js.Symbol, value: Any, message: String): Assertion = js.native
  
  def ownPropertyDescriptor(name: String): Assertion = js.native
  def ownPropertyDescriptor(name: String, descriptor: js.PropertyDescriptor): Assertion = js.native
  def ownPropertyDescriptor(name: String, descriptor: js.PropertyDescriptor, message: String): Assertion = js.native
  def ownPropertyDescriptor(name: String, message: String): Assertion = js.native
  def ownPropertyDescriptor(name: js.Symbol): Assertion = js.native
  def ownPropertyDescriptor(name: js.Symbol, descriptor: js.PropertyDescriptor): Assertion = js.native
  def ownPropertyDescriptor(name: js.Symbol, descriptor: js.PropertyDescriptor, message: String): Assertion = js.native
  def ownPropertyDescriptor(name: js.Symbol, message: String): Assertion = js.native
  @JSName("ownPropertyDescriptor")
  var ownPropertyDescriptor_Original: OwnPropertyDescriptor = js.native
  
  @JSName("ownProperty")
  var ownProperty_Original: Property = js.native
  
  def property(name: String): Assertion = js.native
  def property(name: String, message: String): Assertion = js.native
  def property(name: String, value: Any): Assertion = js.native
  def property(name: String, value: Any, message: String): Assertion = js.native
  def property(name: js.Symbol): Assertion = js.native
  def property(name: js.Symbol, message: String): Assertion = js.native
  def property(name: js.Symbol, value: Any): Assertion = js.native
  def property(name: js.Symbol, value: Any, message: String): Assertion = js.native
  @JSName("property")
  var property_Original: Property = js.native
  
  def respondTo(method: String): Assertion = js.native
  def respondTo(method: String, message: String): Assertion = js.native
  @JSName("respondTo")
  var respondTo_Original: RespondTo = js.native
  
  def respondsTo(method: String): Assertion = js.native
  def respondsTo(method: String, message: String): Assertion = js.native
  @JSName("respondsTo")
  var respondsTo_Original: RespondTo = js.native
  
  def satisfies(matcher: js.Function): Assertion = js.native
  def satisfies(matcher: js.Function, message: String): Assertion = js.native
  @JSName("satisfies")
  var satisfies_Original: Satisfy = js.native
  
  def satisfy(matcher: js.Function): Assertion = js.native
  def satisfy(matcher: js.Function, message: String): Assertion = js.native
  @JSName("satisfy")
  var satisfy_Original: Satisfy = js.native
  
  def `sealed`(`type`: String): Assertion = js.native
  def `sealed`(`type`: String, message: String): Assertion = js.native
  @JSName("sealed")
  var sealed_Original: Assertion = js.native
  
  def string(string: String): Assertion = js.native
  def string(string: String, message: String): Assertion = js.native
  
  def `throw`(): Assertion = js.native
  def `throw`(constructor: js.Error): Assertion = js.native
  def `throw`(constructor: js.Error, expected: String): Assertion = js.native
  def `throw`(constructor: js.Error, expected: String, message: String): Assertion = js.native
  def `throw`(constructor: js.Error, expected: js.RegExp): Assertion = js.native
  def `throw`(constructor: js.Error, expected: js.RegExp, message: String): Assertion = js.native
  def `throw`(constructor: js.Error, expected: Unit, message: String): Assertion = js.native
  def `throw`(constructor: js.Function): Assertion = js.native
  def `throw`(constructor: js.Function, expected: String): Assertion = js.native
  def `throw`(constructor: js.Function, expected: String, message: String): Assertion = js.native
  def `throw`(constructor: js.Function, expected: js.RegExp): Assertion = js.native
  def `throw`(constructor: js.Function, expected: js.RegExp, message: String): Assertion = js.native
  def `throw`(constructor: js.Function, expected: Unit, message: String): Assertion = js.native
  def `throw`(expected: String): Assertion = js.native
  def `throw`(expected: String, message: String): Assertion = js.native
  def `throw`(expected: js.RegExp): Assertion = js.native
  def `throw`(expected: js.RegExp, message: String): Assertion = js.native
  def `throw`(expected: Unit, message: String): Assertion = js.native
  @JSName("throw")
  var throw_Original: Throw = js.native
  
  def throws(): Assertion = js.native
  def throws(constructor: js.Error): Assertion = js.native
  def throws(constructor: js.Error, expected: String): Assertion = js.native
  def throws(constructor: js.Error, expected: String, message: String): Assertion = js.native
  def throws(constructor: js.Error, expected: js.RegExp): Assertion = js.native
  def throws(constructor: js.Error, expected: js.RegExp, message: String): Assertion = js.native
  def throws(constructor: js.Error, expected: Unit, message: String): Assertion = js.native
  def throws(constructor: js.Function): Assertion = js.native
  def throws(constructor: js.Function, expected: String): Assertion = js.native
  def throws(constructor: js.Function, expected: String, message: String): Assertion = js.native
  def throws(constructor: js.Function, expected: js.RegExp): Assertion = js.native
  def throws(constructor: js.Function, expected: js.RegExp, message: String): Assertion = js.native
  def throws(constructor: js.Function, expected: Unit, message: String): Assertion = js.native
  def throws(expected: String): Assertion = js.native
  def throws(expected: String, message: String): Assertion = js.native
  def throws(expected: js.RegExp): Assertion = js.native
  def throws(expected: js.RegExp, message: String): Assertion = js.native
  def throws(expected: Unit, message: String): Assertion = js.native
  @JSName("throws")
  var throws_Original: Throw = js.native
  
  def `true`(`type`: String): Assertion = js.native
  def `true`(`type`: String, message: String): Assertion = js.native
  @JSName("true")
  var true_Original: Assertion = js.native
  
  def undefined(`type`: String): Assertion = js.native
  def undefined(`type`: String, message: String): Assertion = js.native
  @JSName("undefined")
  var undefined_Original: Assertion = js.native
}
