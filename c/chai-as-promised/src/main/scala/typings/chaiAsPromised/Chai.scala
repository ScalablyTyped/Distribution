package typings.chaiAsPromised

import typings.chai.Chai.LanguageChains
import typings.chai.Chai.NumericComparison
import typings.chai.Chai.TypeComparison
import typings.std.Error
import typings.std.PromiseLike
import typings.std.PropertyDescriptor
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Chai")
@js.native
object Chai extends js.Object {
  
  // For Assert API
  @js.native
  trait Assert extends js.Object {
    
    def becomes(promise: js.Thenable[_], expected: js.Any): js.Thenable[Unit] = js.native
    def becomes(promise: js.Thenable[_], expected: js.Any, message: String): js.Thenable[Unit] = js.native
    
    def doesNotBecome(promise: js.Thenable[_], expected: js.Any): js.Thenable[Unit] = js.native
    def doesNotBecome(promise: js.Thenable[_], expected: js.Any, message: String): js.Thenable[Unit] = js.native
    
    var eventually: PromisedAssert = js.native
    
    def isFulfilled(promise: js.Thenable[_]): js.Thenable[Unit] = js.native
    def isFulfilled(promise: js.Thenable[_], message: String): js.Thenable[Unit] = js.native
    
    def isRejected(promise: js.Thenable[_]): js.Thenable[Unit] = js.native
    def isRejected(promise: js.Thenable[_], expected: js.Any): js.Thenable[Unit] = js.native
    def isRejected(promise: js.Thenable[_], expected: js.Any, message: String): js.Thenable[Unit] = js.native
    def isRejected(promise: js.Thenable[_], `match`: RegExp): js.Thenable[Unit] = js.native
    def isRejected(promise: js.Thenable[_], `match`: RegExp, message: String): js.Thenable[Unit] = js.native
    def isRejected(promise: js.Thenable[_], message: String): js.Thenable[Unit] = js.native
    
    def notify(fn: js.Function): js.Thenable[Unit] = js.native
  }
  
  // For BDD API
  @js.native
  trait Assertion
    extends LanguageChains
       with NumericComparison
       with TypeComparison {
    
    def become(expected: js.Any): PromisedAssertion = js.native
    
    def eventually(`type`: String): PromisedAssertion = js.native
    def eventually(`type`: String, message: String): PromisedAssertion = js.native
    @JSName("eventually")
    var eventually_Original: PromisedAssertion = js.native
    
    def fulfilled(`type`: String): PromisedAssertion = js.native
    def fulfilled(`type`: String, message: String): PromisedAssertion = js.native
    @JSName("fulfilled")
    var fulfilled_Original: PromisedAssertion = js.native
    
    def notify(fn: js.Function): PromisedAssertion = js.native
    
    def rejected(`type`: String): PromisedAssertion = js.native
    def rejected(`type`: String, message: String): PromisedAssertion = js.native
    
    def rejectedWith(): PromisedAssertion = js.native
    def rejectedWith(constructor: js.Function): PromisedAssertion = js.native
    def rejectedWith(constructor: js.Function, expected: js.UndefOr[scala.Nothing], message: String): PromisedAssertion = js.native
    def rejectedWith(constructor: js.Function, expected: String): PromisedAssertion = js.native
    def rejectedWith(constructor: js.Function, expected: String, message: String): PromisedAssertion = js.native
    def rejectedWith(constructor: js.Function, expected: RegExp): PromisedAssertion = js.native
    def rejectedWith(constructor: js.Function, expected: RegExp, message: String): PromisedAssertion = js.native
    def rejectedWith(constructor: Error): PromisedAssertion = js.native
    def rejectedWith(constructor: Error, expected: js.UndefOr[scala.Nothing], message: String): PromisedAssertion = js.native
    def rejectedWith(constructor: Error, expected: String): PromisedAssertion = js.native
    def rejectedWith(constructor: Error, expected: String, message: String): PromisedAssertion = js.native
    def rejectedWith(constructor: Error, expected: RegExp): PromisedAssertion = js.native
    def rejectedWith(constructor: Error, expected: RegExp, message: String): PromisedAssertion = js.native
    def rejectedWith(expected: String): PromisedAssertion = js.native
    def rejectedWith(expected: String, message: String): PromisedAssertion = js.native
    def rejectedWith(expected: RegExp): PromisedAssertion = js.native
    def rejectedWith(expected: RegExp, message: String): PromisedAssertion = js.native
    @JSName("rejectedWith")
    var rejectedWith_Original: PromisedThrow = js.native
    
    @JSName("rejected")
    var rejected_Original: PromisedAssertion = js.native
  }
  
  // Eventually does not have .then(), but PromisedAssertion have.
  @js.native
  trait Eventually
    extends PromisedLanguageChains
       with PromisedNumericComparison
       with PromisedTypeComparison {
    
    def Arguments(`type`: String): PromisedAssertion = js.native
    def Arguments(`type`: String, message: String): PromisedAssertion = js.native
    @JSName("Arguments")
    var Arguments_Original: PromisedAssertion = js.native
    
    def NaN(`type`: String): PromisedAssertion = js.native
    def NaN(`type`: String, message: String): PromisedAssertion = js.native
    @JSName("NaN")
    var NaN_Original: PromisedAssertion = js.native
    
    def Throw(): PromisedAssertion = js.native
    def Throw(constructor: js.Function): PromisedAssertion = js.native
    def Throw(constructor: js.Function, expected: js.UndefOr[scala.Nothing], message: String): PromisedAssertion = js.native
    def Throw(constructor: js.Function, expected: String): PromisedAssertion = js.native
    def Throw(constructor: js.Function, expected: String, message: String): PromisedAssertion = js.native
    def Throw(constructor: js.Function, expected: RegExp): PromisedAssertion = js.native
    def Throw(constructor: js.Function, expected: RegExp, message: String): PromisedAssertion = js.native
    def Throw(constructor: Error): PromisedAssertion = js.native
    def Throw(constructor: Error, expected: js.UndefOr[scala.Nothing], message: String): PromisedAssertion = js.native
    def Throw(constructor: Error, expected: String): PromisedAssertion = js.native
    def Throw(constructor: Error, expected: String, message: String): PromisedAssertion = js.native
    def Throw(constructor: Error, expected: RegExp): PromisedAssertion = js.native
    def Throw(constructor: Error, expected: RegExp, message: String): PromisedAssertion = js.native
    def Throw(expected: String): PromisedAssertion = js.native
    def Throw(expected: String, message: String): PromisedAssertion = js.native
    def Throw(expected: RegExp): PromisedAssertion = js.native
    def Throw(expected: RegExp, message: String): PromisedAssertion = js.native
    @JSName("Throw")
    var Throw_Original: PromisedThrow = js.native
    
    def a(`type`: String): PromisedAssertion = js.native
    def a(`type`: String, message: String): PromisedAssertion = js.native
    @JSName("a")
    var a_Original: PromisedTypeComparison = js.native
    
    var all: PromisedKeyFilter = js.native
    
    def an(`type`: String): PromisedAssertion = js.native
    def an(`type`: String, message: String): PromisedAssertion = js.native
    @JSName("an")
    var an_Original: PromisedTypeComparison = js.native
    
    var any: PromisedKeyFilter = js.native
    
    def approximately(expected: Double, delta: Double): PromisedAssertion = js.native
    def approximately(expected: Double, delta: Double, message: String): PromisedAssertion = js.native
    @JSName("approximately")
    var approximately_Original: PromisedCloseTo = js.native
    
    def arguments(`type`: String): PromisedAssertion = js.native
    def arguments(`type`: String, message: String): PromisedAssertion = js.native
    @JSName("arguments")
    var arguments_Original: PromisedAssertion = js.native
    
    // From chai-as-promised
    def become(expected: js.Any): PromisedAssertion = js.native
    
    def change(`object`: js.Object, property: String): PromisedAssertion = js.native
    def change(`object`: js.Object, property: String, message: String): PromisedAssertion = js.native
    @JSName("change")
    var change_Original: PromisedPropertyChange = js.native
    
    def changes(`object`: js.Object, property: String): PromisedAssertion = js.native
    def changes(`object`: js.Object, property: String, message: String): PromisedAssertion = js.native
    @JSName("changes")
    var changes_Original: PromisedPropertyChange = js.native
    
    def closeTo(expected: Double, delta: Double): PromisedAssertion = js.native
    def closeTo(expected: Double, delta: Double, message: String): PromisedAssertion = js.native
    @JSName("closeTo")
    var closeTo_Original: PromisedCloseTo = js.native
    
    def contain(value: String): PromisedAssertion = js.native
    def contain(value: String, message: String): PromisedAssertion = js.native
    def contain(value: js.Object): PromisedAssertion = js.native
    def contain(value: js.Object, message: String): PromisedAssertion = js.native
    def contain(value: Double): PromisedAssertion = js.native
    def contain(value: Double, message: String): PromisedAssertion = js.native
    @JSName("contain")
    var contain_Original: PromisedInclude = js.native
    
    def decrease(`object`: js.Object, property: String): PromisedAssertion = js.native
    def decrease(`object`: js.Object, property: String, message: String): PromisedAssertion = js.native
    @JSName("decrease")
    var decrease_Original: PromisedPropertyChange = js.native
    
    def decreases(`object`: js.Object, property: String): PromisedAssertion = js.native
    def decreases(`object`: js.Object, property: String, message: String): PromisedAssertion = js.native
    @JSName("decreases")
    var decreases_Original: PromisedPropertyChange = js.native
    
    var deep: PromisedDeep = js.native
    
    def empty(`type`: String): PromisedAssertion = js.native
    def empty(`type`: String, message: String): PromisedAssertion = js.native
    @JSName("empty")
    var empty_Original: PromisedAssertion = js.native
    
    def eq(value: js.Any): PromisedAssertion = js.native
    def eq(value: js.Any, message: String): PromisedAssertion = js.native
    @JSName("eq")
    var eq_Original: PromisedEqual = js.native
    
    def eql(value: js.Any): PromisedAssertion = js.native
    def eql(value: js.Any, message: String): PromisedAssertion = js.native
    @JSName("eql")
    var eql_Original: PromisedEqual = js.native
    
    def eqls(value: js.Any): PromisedAssertion = js.native
    def eqls(value: js.Any, message: String): PromisedAssertion = js.native
    @JSName("eqls")
    var eqls_Original: PromisedEqual = js.native
    
    def equal(value: js.Any): PromisedAssertion = js.native
    def equal(value: js.Any, message: String): PromisedAssertion = js.native
    @JSName("equal")
    var equal_Original: PromisedEqual = js.native
    
    def equals(value: js.Any): PromisedAssertion = js.native
    def equals(value: js.Any, message: String): PromisedAssertion = js.native
    @JSName("equals")
    var equals_Original: PromisedEqual = js.native
    
    def exist(`type`: String): PromisedAssertion = js.native
    def exist(`type`: String, message: String): PromisedAssertion = js.native
    @JSName("exist")
    var exist_Original: PromisedAssertion = js.native
    
    def extensible(`type`: String): PromisedAssertion = js.native
    def extensible(`type`: String, message: String): PromisedAssertion = js.native
    @JSName("extensible")
    var extensible_Original: PromisedAssertion = js.native
    
    def `false`(`type`: String): PromisedAssertion = js.native
    def `false`(`type`: String, message: String): PromisedAssertion = js.native
    @JSName("false")
    var false_Original: PromisedAssertion = js.native
    
    def frozen(`type`: String): PromisedAssertion = js.native
    def frozen(`type`: String, message: String): PromisedAssertion = js.native
    @JSName("frozen")
    var frozen_Original: PromisedAssertion = js.native
    
    def fulfilled(`type`: String): PromisedAssertion = js.native
    def fulfilled(`type`: String, message: String): PromisedAssertion = js.native
    @JSName("fulfilled")
    var fulfilled_Original: PromisedAssertion = js.native
    
    def haveOwnProperty(name: String): PromisedAssertion = js.native
    def haveOwnProperty(name: String, message: String): PromisedAssertion = js.native
    
    def haveOwnPropertyDescriptor(name: String): PromisedAssertion = js.native
    def haveOwnPropertyDescriptor(name: String, descriptor: PropertyDescriptor): PromisedAssertion = js.native
    def haveOwnPropertyDescriptor(name: String, descriptor: PropertyDescriptor, message: String): PromisedAssertion = js.native
    def haveOwnPropertyDescriptor(name: String, message: String): PromisedAssertion = js.native
    @JSName("haveOwnPropertyDescriptor")
    var haveOwnPropertyDescriptor_Original: PromisedOwnPropertyDescriptor = js.native
    
    @JSName("haveOwnProperty")
    var haveOwnProperty_Original: PromisedOwnProperty = js.native
    
    def include(value: String): PromisedAssertion = js.native
    def include(value: String, message: String): PromisedAssertion = js.native
    def include(value: js.Object): PromisedAssertion = js.native
    def include(value: js.Object, message: String): PromisedAssertion = js.native
    def include(value: Double): PromisedAssertion = js.native
    def include(value: Double, message: String): PromisedAssertion = js.native
    @JSName("include")
    var include_Original: PromisedInclude = js.native
    
    def increase(`object`: js.Object, property: String): PromisedAssertion = js.native
    def increase(`object`: js.Object, property: String, message: String): PromisedAssertion = js.native
    @JSName("increase")
    var increase_Original: PromisedPropertyChange = js.native
    
    def increases(`object`: js.Object, property: String): PromisedAssertion = js.native
    def increases(`object`: js.Object, property: String, message: String): PromisedAssertion = js.native
    @JSName("increases")
    var increases_Original: PromisedPropertyChange = js.native
    
    def itself(`type`: String): PromisedAssertion = js.native
    def itself(`type`: String, message: String): PromisedAssertion = js.native
    @JSName("itself")
    var itself_Original: PromisedAssertion = js.native
    
    def key(string: String): PromisedAssertion = js.native
    
    def keys(keys: String*): PromisedAssertion = js.native
    def keys(keys: js.Array[_]): PromisedAssertion = js.native
    def keys(keys: js.Object): PromisedAssertion = js.native
    @JSName("keys")
    var keys_Original: PromisedKeys = js.native
    
    def length(length: Double): PromisedAssertion = js.native
    def length(length: Double, message: String): PromisedAssertion = js.native
    
    def lengthOf(length: Double): PromisedAssertion = js.native
    def lengthOf(length: Double, message: String): PromisedAssertion = js.native
    @JSName("lengthOf")
    var lengthOf_Original: PromisedLength = js.native
    
    @JSName("length")
    var length_Original: PromisedLength = js.native
    
    def `match`(regexp: String): PromisedAssertion = js.native
    def `match`(regexp: String, message: String): PromisedAssertion = js.native
    def `match`(regexp: RegExp): PromisedAssertion = js.native
    def `match`(regexp: RegExp, message: String): PromisedAssertion = js.native
    @JSName("match")
    var match_Original: PromisedMatch = js.native
    
    def matches(regexp: String): PromisedAssertion = js.native
    def matches(regexp: String, message: String): PromisedAssertion = js.native
    def matches(regexp: RegExp): PromisedAssertion = js.native
    def matches(regexp: RegExp, message: String): PromisedAssertion = js.native
    @JSName("matches")
    var matches_Original: PromisedMatch = js.native
    
    def members(set: js.Array[_]): PromisedAssertion = js.native
    def members(set: js.Array[_], message: String): PromisedAssertion = js.native
    @JSName("members")
    var members_Original: PromisedMembers = js.native
    
    var nested: PromisedNested = js.native
    
    // From chai
    def not(`type`: String): PromisedAssertion = js.native
    def not(`type`: String, message: String): PromisedAssertion = js.native
    // From chai
    @JSName("not")
    var not_Original: PromisedAssertion = js.native
    
    def notify(fn: js.Function): PromisedAssertion = js.native
    
    def `null`(`type`: String): PromisedAssertion = js.native
    def `null`(`type`: String, message: String): PromisedAssertion = js.native
    @JSName("null")
    var null_Original: PromisedAssertion = js.native
    
    def ok(`type`: String): PromisedAssertion = js.native
    def ok(`type`: String, message: String): PromisedAssertion = js.native
    @JSName("ok")
    var ok_Original: PromisedAssertion = js.native
    
    def oneOf(list: js.Array[_]): PromisedAssertion = js.native
    def oneOf(list: js.Array[_], message: String): PromisedAssertion = js.native
    
    var ordered: PromisedOrdered = js.native
    
    def ownProperty(name: String): PromisedAssertion = js.native
    def ownProperty(name: String, message: String): PromisedAssertion = js.native
    
    def ownPropertyDescriptor(name: String): PromisedAssertion = js.native
    def ownPropertyDescriptor(name: String, descriptor: PropertyDescriptor): PromisedAssertion = js.native
    def ownPropertyDescriptor(name: String, descriptor: PropertyDescriptor, message: String): PromisedAssertion = js.native
    def ownPropertyDescriptor(name: String, message: String): PromisedAssertion = js.native
    @JSName("ownPropertyDescriptor")
    var ownPropertyDescriptor_Original: PromisedOwnPropertyDescriptor = js.native
    
    @JSName("ownProperty")
    var ownProperty_Original: PromisedOwnProperty = js.native
    
    def property(name: String): PromisedAssertion = js.native
    def property(name: String, value: js.UndefOr[scala.Nothing], message: String): PromisedAssertion = js.native
    def property(name: String, value: js.Any): PromisedAssertion = js.native
    def property(name: String, value: js.Any, message: String): PromisedAssertion = js.native
    @JSName("property")
    var property_Original: PromisedProperty = js.native
    
    def rejected(`type`: String): PromisedAssertion = js.native
    def rejected(`type`: String, message: String): PromisedAssertion = js.native
    
    def rejectedWith(): PromisedAssertion = js.native
    def rejectedWith(constructor: js.Function): PromisedAssertion = js.native
    def rejectedWith(constructor: js.Function, expected: js.UndefOr[scala.Nothing], message: String): PromisedAssertion = js.native
    def rejectedWith(constructor: js.Function, expected: String): PromisedAssertion = js.native
    def rejectedWith(constructor: js.Function, expected: String, message: String): PromisedAssertion = js.native
    def rejectedWith(constructor: js.Function, expected: RegExp): PromisedAssertion = js.native
    def rejectedWith(constructor: js.Function, expected: RegExp, message: String): PromisedAssertion = js.native
    def rejectedWith(constructor: Error): PromisedAssertion = js.native
    def rejectedWith(constructor: Error, expected: js.UndefOr[scala.Nothing], message: String): PromisedAssertion = js.native
    def rejectedWith(constructor: Error, expected: String): PromisedAssertion = js.native
    def rejectedWith(constructor: Error, expected: String, message: String): PromisedAssertion = js.native
    def rejectedWith(constructor: Error, expected: RegExp): PromisedAssertion = js.native
    def rejectedWith(constructor: Error, expected: RegExp, message: String): PromisedAssertion = js.native
    def rejectedWith(expected: String): PromisedAssertion = js.native
    def rejectedWith(expected: String, message: String): PromisedAssertion = js.native
    def rejectedWith(expected: RegExp): PromisedAssertion = js.native
    def rejectedWith(expected: RegExp, message: String): PromisedAssertion = js.native
    @JSName("rejectedWith")
    var rejectedWith_Original: PromisedThrow = js.native
    
    @JSName("rejected")
    var rejected_Original: PromisedAssertion = js.native
    
    def respondTo(method: String): PromisedAssertion = js.native
    def respondTo(method: String, message: String): PromisedAssertion = js.native
    @JSName("respondTo")
    var respondTo_Original: PromisedRespondTo = js.native
    
    def respondsTo(method: String): PromisedAssertion = js.native
    def respondsTo(method: String, message: String): PromisedAssertion = js.native
    @JSName("respondsTo")
    var respondsTo_Original: PromisedRespondTo = js.native
    
    def satisfies(matcher: js.Function): PromisedAssertion = js.native
    def satisfies(matcher: js.Function, message: String): PromisedAssertion = js.native
    @JSName("satisfies")
    var satisfies_Original: PromisedSatisfy = js.native
    
    def satisfy(matcher: js.Function): PromisedAssertion = js.native
    def satisfy(matcher: js.Function, message: String): PromisedAssertion = js.native
    @JSName("satisfy")
    var satisfy_Original: PromisedSatisfy = js.native
    
    def `sealed`(`type`: String): PromisedAssertion = js.native
    def `sealed`(`type`: String, message: String): PromisedAssertion = js.native
    @JSName("sealed")
    var sealed_Original: PromisedAssertion = js.native
    
    def string(string: String): PromisedAssertion = js.native
    def string(string: String, message: String): PromisedAssertion = js.native
    
    def `throw`(): PromisedAssertion = js.native
    def `throw`(constructor: js.Function): PromisedAssertion = js.native
    def `throw`(constructor: js.Function, expected: js.UndefOr[scala.Nothing], message: String): PromisedAssertion = js.native
    def `throw`(constructor: js.Function, expected: String): PromisedAssertion = js.native
    def `throw`(constructor: js.Function, expected: String, message: String): PromisedAssertion = js.native
    def `throw`(constructor: js.Function, expected: RegExp): PromisedAssertion = js.native
    def `throw`(constructor: js.Function, expected: RegExp, message: String): PromisedAssertion = js.native
    def `throw`(constructor: Error): PromisedAssertion = js.native
    def `throw`(constructor: Error, expected: js.UndefOr[scala.Nothing], message: String): PromisedAssertion = js.native
    def `throw`(constructor: Error, expected: String): PromisedAssertion = js.native
    def `throw`(constructor: Error, expected: String, message: String): PromisedAssertion = js.native
    def `throw`(constructor: Error, expected: RegExp): PromisedAssertion = js.native
    def `throw`(constructor: Error, expected: RegExp, message: String): PromisedAssertion = js.native
    def `throw`(expected: String): PromisedAssertion = js.native
    def `throw`(expected: String, message: String): PromisedAssertion = js.native
    def `throw`(expected: RegExp): PromisedAssertion = js.native
    def `throw`(expected: RegExp, message: String): PromisedAssertion = js.native
    @JSName("throw")
    var throw_Original: PromisedThrow = js.native
    
    def throws(): PromisedAssertion = js.native
    def throws(constructor: js.Function): PromisedAssertion = js.native
    def throws(constructor: js.Function, expected: js.UndefOr[scala.Nothing], message: String): PromisedAssertion = js.native
    def throws(constructor: js.Function, expected: String): PromisedAssertion = js.native
    def throws(constructor: js.Function, expected: String, message: String): PromisedAssertion = js.native
    def throws(constructor: js.Function, expected: RegExp): PromisedAssertion = js.native
    def throws(constructor: js.Function, expected: RegExp, message: String): PromisedAssertion = js.native
    def throws(constructor: Error): PromisedAssertion = js.native
    def throws(constructor: Error, expected: js.UndefOr[scala.Nothing], message: String): PromisedAssertion = js.native
    def throws(constructor: Error, expected: String): PromisedAssertion = js.native
    def throws(constructor: Error, expected: String, message: String): PromisedAssertion = js.native
    def throws(constructor: Error, expected: RegExp): PromisedAssertion = js.native
    def throws(constructor: Error, expected: RegExp, message: String): PromisedAssertion = js.native
    def throws(expected: String): PromisedAssertion = js.native
    def throws(expected: String, message: String): PromisedAssertion = js.native
    def throws(expected: RegExp): PromisedAssertion = js.native
    def throws(expected: RegExp, message: String): PromisedAssertion = js.native
    @JSName("throws")
    var throws_Original: PromisedThrow = js.native
    
    def `true`(`type`: String): PromisedAssertion = js.native
    def `true`(`type`: String, message: String): PromisedAssertion = js.native
    @JSName("true")
    var true_Original: PromisedAssertion = js.native
    
    def undefined(`type`: String): PromisedAssertion = js.native
    def undefined(`type`: String, message: String): PromisedAssertion = js.native
    @JSName("undefined")
    var undefined_Original: PromisedAssertion = js.native
  }
  
  @js.native
  trait PromisedAssert extends js.Object {
    
    def Throw(fn: js.Function): js.Thenable[Unit] = js.native
    def Throw(fn: js.Function, errType: js.Function): js.Thenable[Unit] = js.native
    def Throw(fn: js.Function, errType: js.Function, msg: String): js.Thenable[Unit] = js.native
    def Throw(fn: js.Function, errType: js.Function, regExp: RegExp): js.Thenable[Unit] = js.native
    def Throw(fn: js.Function, msg: String): js.Thenable[Unit] = js.native
    def Throw(fn: js.Function, regExp: RegExp): js.Thenable[Unit] = js.native
    
    def approximately(act: Double, exp: Double, delta: Double): js.Thenable[Unit] = js.native
    def approximately(act: Double, exp: Double, delta: Double, msg: String): js.Thenable[Unit] = js.native
    
    def changes(modifier: js.Function, obj: js.Object, property: String): js.Thenable[Unit] = js.native
    def changes(modifier: js.Function, obj: js.Object, property: String, msg: String): js.Thenable[Unit] = js.native
    
    def changesButNotBy(modifier: js.Function, obj: js.Object, property: String, change: Double): js.Thenable[Unit] = js.native
    def changesButNotBy(modifier: js.Function, obj: js.Object, property: String, change: Double, msg: String): js.Thenable[Unit] = js.native
    
    def changesBy(modifier: js.Function, obj: js.Object, property: String, change: Double): js.Thenable[Unit] = js.native
    def changesBy(modifier: js.Function, obj: js.Object, property: String, change: Double, msg: String): js.Thenable[Unit] = js.native
    
    def closeTo(act: Double, exp: Double, delta: Double): js.Thenable[Unit] = js.native
    def closeTo(act: Double, exp: Double, delta: Double, msg: String): js.Thenable[Unit] = js.native
    
    def containsAllDeepKeys(obj: js.Any, keys: js.Array[_]): js.Thenable[Unit] = js.native
    def containsAllDeepKeys(obj: js.Any, keys: js.Array[_], msg: String): js.Thenable[Unit] = js.native
    def containsAllDeepKeys(obj: js.Any, keys: js.Object): js.Thenable[Unit] = js.native
    def containsAllDeepKeys(obj: js.Any, keys: js.Object, msg: String): js.Thenable[Unit] = js.native
    
    def containsAllKeys(obj: js.Any, keys: js.Array[_]): js.Thenable[Unit] = js.native
    def containsAllKeys(obj: js.Any, keys: js.Array[_], msg: String): js.Thenable[Unit] = js.native
    def containsAllKeys(obj: js.Any, keys: js.Object): js.Thenable[Unit] = js.native
    def containsAllKeys(obj: js.Any, keys: js.Object, msg: String): js.Thenable[Unit] = js.native
    
    def decreases(modifier: js.Function, obj: js.Object, property: String): js.Thenable[Unit] = js.native
    def decreases(modifier: js.Function, obj: js.Object, property: String, msg: String): js.Thenable[Unit] = js.native
    
    def decreasesButNotBy(modifier: js.Function, obj: js.Object, property: String, change: Double): js.Thenable[Unit] = js.native
    def decreasesButNotBy(modifier: js.Function, obj: js.Object, property: String, change: Double, msg: String): js.Thenable[Unit] = js.native
    
    def decreasesBy(modifier: js.Function, obj: js.Object, property: String, change: Double): js.Thenable[Unit] = js.native
    def decreasesBy(modifier: js.Function, obj: js.Object, property: String, change: Double, msg: String): js.Thenable[Unit] = js.native
    
    def deepEqual(act: js.Any, exp: js.Any): js.Thenable[Unit] = js.native
    def deepEqual(act: js.Any, exp: js.Any, msg: String): js.Thenable[Unit] = js.native
    
    def deepInclude(exp: String, inc: js.Any): js.Thenable[Unit] = js.native
    def deepInclude(exp: String, inc: js.Any, msg: String): js.Thenable[Unit] = js.native
    def deepInclude(exp: js.Array[_], inc: js.Any): js.Thenable[Unit] = js.native
    def deepInclude(exp: js.Array[_], inc: js.Any, msg: String): js.Thenable[Unit] = js.native
    
    def deepNestedInclude(exp: js.Object, inc: js.Object): js.Thenable[Unit] = js.native
    def deepNestedInclude(exp: js.Object, inc: js.Object, msg: String): js.Thenable[Unit] = js.native
    
    def deepNestedPropertyVal(obj: js.Object, prop: String, `val`: js.Any): js.Thenable[Unit] = js.native
    def deepNestedPropertyVal(obj: js.Object, prop: String, `val`: js.Any, msg: String): js.Thenable[Unit] = js.native
    
    def deepOwnInclude(exp: js.Object, inc: js.Object): js.Thenable[Unit] = js.native
    def deepOwnInclude(exp: js.Object, inc: js.Object, msg: String): js.Thenable[Unit] = js.native
    
    def deepProperty(obj: js.Object, prop: String): js.Thenable[Unit] = js.native
    def deepProperty(obj: js.Object, prop: String, msg: String): js.Thenable[Unit] = js.native
    
    def deepPropertyNotVal(obj: js.Object, prop: String, `val`: js.Any): js.Thenable[Unit] = js.native
    def deepPropertyNotVal(obj: js.Object, prop: String, `val`: js.Any, msg: String): js.Thenable[Unit] = js.native
    
    def deepPropertyVal(obj: js.Object, prop: String, `val`: js.Any): js.Thenable[Unit] = js.native
    def deepPropertyVal(obj: js.Object, prop: String, `val`: js.Any, msg: String): js.Thenable[Unit] = js.native
    
    def doesNotChange(modifier: js.Function, obj: js.Object, property: String): js.Thenable[Unit] = js.native
    def doesNotChange(modifier: js.Function, obj: js.Object, property: String, msg: String): js.Thenable[Unit] = js.native
    
    def doesNotDecrease(modifier: js.Function, obj: js.Object, property: String): js.Thenable[Unit] = js.native
    def doesNotDecrease(modifier: js.Function, obj: js.Object, property: String, msg: String): js.Thenable[Unit] = js.native
    
    def doesNotHaveAllDeepKeys(obj: js.Any, keys: js.Array[_]): js.Thenable[Unit] = js.native
    def doesNotHaveAllDeepKeys(obj: js.Any, keys: js.Array[_], msg: String): js.Thenable[Unit] = js.native
    def doesNotHaveAllDeepKeys(obj: js.Any, keys: js.Object): js.Thenable[Unit] = js.native
    def doesNotHaveAllDeepKeys(obj: js.Any, keys: js.Object, msg: String): js.Thenable[Unit] = js.native
    
    def doesNotHaveAllKeys(obj: js.Any, keys: js.Array[_]): js.Thenable[Unit] = js.native
    def doesNotHaveAllKeys(obj: js.Any, keys: js.Array[_], msg: String): js.Thenable[Unit] = js.native
    def doesNotHaveAllKeys(obj: js.Any, keys: js.Object): js.Thenable[Unit] = js.native
    def doesNotHaveAllKeys(obj: js.Any, keys: js.Object, msg: String): js.Thenable[Unit] = js.native
    
    def doesNotHaveAnyDeepKeys(obj: js.Any, keys: js.Array[_]): js.Thenable[Unit] = js.native
    def doesNotHaveAnyDeepKeys(obj: js.Any, keys: js.Array[_], msg: String): js.Thenable[Unit] = js.native
    def doesNotHaveAnyDeepKeys(obj: js.Any, keys: js.Object): js.Thenable[Unit] = js.native
    def doesNotHaveAnyDeepKeys(obj: js.Any, keys: js.Object, msg: String): js.Thenable[Unit] = js.native
    
    def doesNotHaveAnyKeys(obj: js.Any, keys: js.Array[_]): js.Thenable[Unit] = js.native
    def doesNotHaveAnyKeys(obj: js.Any, keys: js.Array[_], msg: String): js.Thenable[Unit] = js.native
    def doesNotHaveAnyKeys(obj: js.Any, keys: js.Object): js.Thenable[Unit] = js.native
    def doesNotHaveAnyKeys(obj: js.Any, keys: js.Object, msg: String): js.Thenable[Unit] = js.native
    
    def doesNotIncrease(modifier: js.Function, obj: js.Object, property: String): js.Thenable[Unit] = js.native
    def doesNotIncrease(modifier: js.Function, obj: js.Object, property: String, msg: String): js.Thenable[Unit] = js.native
    
    def doesNotThrow(fn: js.Function): js.Thenable[Unit] = js.native
    def doesNotThrow(fn: js.Function, errType: js.Function): js.Thenable[Unit] = js.native
    def doesNotThrow(fn: js.Function, errType: js.Function, msg: String): js.Thenable[Unit] = js.native
    def doesNotThrow(fn: js.Function, errType: js.Function, regExp: RegExp): js.Thenable[Unit] = js.native
    def doesNotThrow(fn: js.Function, msg: String): js.Thenable[Unit] = js.native
    def doesNotThrow(fn: js.Function, regExp: RegExp): js.Thenable[Unit] = js.native
    
    def equal(act: js.Any, exp: js.Any): js.Thenable[Unit] = js.native
    def equal(act: js.Any, exp: js.Any, msg: String): js.Thenable[Unit] = js.native
    
    def exists(`val`: js.Any): js.Thenable[Unit] = js.native
    def exists(`val`: js.Any, msg: String): js.Thenable[Unit] = js.native
    
    def fail(): js.Thenable[Unit] = js.native
    def fail(
      actual: js.UndefOr[scala.Nothing],
      expected: js.UndefOr[scala.Nothing],
      msg: js.UndefOr[scala.Nothing],
      operator: String
    ): js.Thenable[Unit] = js.native
    def fail(actual: js.UndefOr[scala.Nothing], expected: js.UndefOr[scala.Nothing], msg: String): js.Thenable[Unit] = js.native
    def fail(
      actual: js.UndefOr[scala.Nothing],
      expected: js.UndefOr[scala.Nothing],
      msg: String,
      operator: String
    ): js.Thenable[Unit] = js.native
    def fail(actual: js.UndefOr[scala.Nothing], expected: js.Any): js.Thenable[Unit] = js.native
    def fail(
      actual: js.UndefOr[scala.Nothing],
      expected: js.Any,
      msg: js.UndefOr[scala.Nothing],
      operator: String
    ): js.Thenable[Unit] = js.native
    def fail(actual: js.UndefOr[scala.Nothing], expected: js.Any, msg: String): js.Thenable[Unit] = js.native
    def fail(actual: js.UndefOr[scala.Nothing], expected: js.Any, msg: String, operator: String): js.Thenable[Unit] = js.native
    def fail(actual: js.Any): js.Thenable[Unit] = js.native
    def fail(
      actual: js.Any,
      expected: js.UndefOr[scala.Nothing],
      msg: js.UndefOr[scala.Nothing],
      operator: String
    ): js.Thenable[Unit] = js.native
    def fail(actual: js.Any, expected: js.UndefOr[scala.Nothing], msg: String): js.Thenable[Unit] = js.native
    def fail(actual: js.Any, expected: js.UndefOr[scala.Nothing], msg: String, operator: String): js.Thenable[Unit] = js.native
    def fail(actual: js.Any, expected: js.Any): js.Thenable[Unit] = js.native
    def fail(actual: js.Any, expected: js.Any, msg: js.UndefOr[scala.Nothing], operator: String): js.Thenable[Unit] = js.native
    def fail(actual: js.Any, expected: js.Any, msg: String): js.Thenable[Unit] = js.native
    def fail(actual: js.Any, expected: js.Any, msg: String, operator: String): js.Thenable[Unit] = js.native
    
    def frozen(obj: js.Object): js.Thenable[Unit] = js.native
    def frozen(obj: js.Object, msg: String): js.Thenable[Unit] = js.native
    
    def hasAllDeepKeys(obj: js.Any, keys: js.Array[_]): js.Thenable[Unit] = js.native
    def hasAllDeepKeys(obj: js.Any, keys: js.Array[_], msg: String): js.Thenable[Unit] = js.native
    def hasAllDeepKeys(obj: js.Any, keys: js.Object): js.Thenable[Unit] = js.native
    def hasAllDeepKeys(obj: js.Any, keys: js.Object, msg: String): js.Thenable[Unit] = js.native
    
    def hasAllKeys(obj: js.Any, keys: js.Array[_]): js.Thenable[Unit] = js.native
    def hasAllKeys(obj: js.Any, keys: js.Array[_], msg: String): js.Thenable[Unit] = js.native
    def hasAllKeys(obj: js.Any, keys: js.Object): js.Thenable[Unit] = js.native
    def hasAllKeys(obj: js.Any, keys: js.Object, msg: String): js.Thenable[Unit] = js.native
    
    def hasAnyDeepKeys(obj: js.Any, keys: js.Array[_]): js.Thenable[Unit] = js.native
    def hasAnyDeepKeys(obj: js.Any, keys: js.Array[_], msg: String): js.Thenable[Unit] = js.native
    def hasAnyDeepKeys(obj: js.Any, keys: js.Object): js.Thenable[Unit] = js.native
    def hasAnyDeepKeys(obj: js.Any, keys: js.Object, msg: String): js.Thenable[Unit] = js.native
    
    def hasAnyKeys(obj: js.Any, keys: js.Array[_]): js.Thenable[Unit] = js.native
    def hasAnyKeys(obj: js.Any, keys: js.Array[_], msg: String): js.Thenable[Unit] = js.native
    def hasAnyKeys(obj: js.Any, keys: js.Object): js.Thenable[Unit] = js.native
    def hasAnyKeys(obj: js.Any, keys: js.Object, msg: String): js.Thenable[Unit] = js.native
    
    def ifError(`val`: js.Any): js.Thenable[Unit] = js.native
    def ifError(`val`: js.Any, msg: String): js.Thenable[Unit] = js.native
    
    def include(exp: String, inc: js.Any): js.Thenable[Unit] = js.native
    def include(exp: String, inc: js.Any, msg: String): js.Thenable[Unit] = js.native
    def include(exp: js.Array[_], inc: js.Any): js.Thenable[Unit] = js.native
    def include(exp: js.Array[_], inc: js.Any, msg: String): js.Thenable[Unit] = js.native
    
    def includeDeepMembers(set1: js.Array[_], set2: js.Array[_]): js.Thenable[Unit] = js.native
    def includeDeepMembers(set1: js.Array[_], set2: js.Array[_], msg: String): js.Thenable[Unit] = js.native
    
    def includeDeepOrderedMembers(set1: js.Array[_], set2: js.Array[_]): js.Thenable[Unit] = js.native
    def includeDeepOrderedMembers(set1: js.Array[_], set2: js.Array[_], msg: String): js.Thenable[Unit] = js.native
    
    def includeMembers(set1: js.Array[_], set2: js.Array[_]): js.Thenable[Unit] = js.native
    def includeMembers(set1: js.Array[_], set2: js.Array[_], msg: String): js.Thenable[Unit] = js.native
    
    def includeOrderedMembers(set1: js.Array[_], set2: js.Array[_]): js.Thenable[Unit] = js.native
    def includeOrderedMembers(set1: js.Array[_], set2: js.Array[_], msg: String): js.Thenable[Unit] = js.native
    
    def increases(modifier: js.Function, obj: js.Object, property: String): js.Thenable[Unit] = js.native
    def increases(modifier: js.Function, obj: js.Object, property: String, msg: String): js.Thenable[Unit] = js.native
    
    def increasesButNotBy(modifier: js.Function, obj: js.Object, property: String, change: Double): js.Thenable[Unit] = js.native
    def increasesButNotBy(modifier: js.Function, obj: js.Object, property: String, change: Double, msg: String): js.Thenable[Unit] = js.native
    
    def increasesBy(modifier: js.Function, obj: js.Object, property: String, change: Double): js.Thenable[Unit] = js.native
    def increasesBy(modifier: js.Function, obj: js.Object, property: String, change: Double, msg: String): js.Thenable[Unit] = js.native
    
    def instanceOf(`val`: js.Any, `type`: js.Function): js.Thenable[Unit] = js.native
    def instanceOf(`val`: js.Any, `type`: js.Function, msg: String): js.Thenable[Unit] = js.native
    
    def isAbove(`val`: Double, above: Double): js.Thenable[Unit] = js.native
    def isAbove(`val`: Double, above: Double, msg: String): js.Thenable[Unit] = js.native
    
    def isArray(`val`: js.Any): js.Thenable[Unit] = js.native
    def isArray(`val`: js.Any, msg: String): js.Thenable[Unit] = js.native
    
    def isAtBelow(`val`: Double, below: Double): js.Thenable[Unit] = js.native
    def isAtBelow(`val`: Double, below: Double, msg: String): js.Thenable[Unit] = js.native
    
    def isAtLeast(`val`: Double, atLeast: Double): js.Thenable[Unit] = js.native
    def isAtLeast(`val`: Double, atLeast: Double, msg: String): js.Thenable[Unit] = js.native
    
    def isAtMost(`val`: Double, atMost: Double): js.Thenable[Unit] = js.native
    def isAtMost(`val`: Double, atMost: Double, msg: String): js.Thenable[Unit] = js.native
    
    def isBoolean(`val`: js.Any): js.Thenable[Unit] = js.native
    def isBoolean(`val`: js.Any, msg: String): js.Thenable[Unit] = js.native
    
    def isDefined(`val`: js.Any): js.Thenable[Unit] = js.native
    def isDefined(`val`: js.Any, msg: String): js.Thenable[Unit] = js.native
    
    def isEmpty(`val`: js.Any): js.Thenable[Unit] = js.native
    def isEmpty(`val`: js.Any, msg: String): js.Thenable[Unit] = js.native
    
    def isExtensible(obj: js.Object): js.Thenable[Unit] = js.native
    def isExtensible(obj: js.Object, msg: String): js.Thenable[Unit] = js.native
    
    def isFalse(`val`: js.Any): js.Thenable[Unit] = js.native
    def isFalse(`val`: js.Any, msg: String): js.Thenable[Unit] = js.native
    
    def isFinite(`val`: Double): js.Thenable[Unit] = js.native
    def isFinite(`val`: Double, msg: String): js.Thenable[Unit] = js.native
    
    def isFrozen(obj: js.Object): js.Thenable[Unit] = js.native
    def isFrozen(obj: js.Object, msg: String): js.Thenable[Unit] = js.native
    
    def isFunction(`val`: js.Any): js.Thenable[Unit] = js.native
    def isFunction(`val`: js.Any, msg: String): js.Thenable[Unit] = js.native
    
    def isNaN(`val`: js.Any): js.Thenable[Unit] = js.native
    def isNaN(`val`: js.Any, msg: String): js.Thenable[Unit] = js.native
    
    def isNotArray(`val`: js.Any): js.Thenable[Unit] = js.native
    def isNotArray(`val`: js.Any, msg: String): js.Thenable[Unit] = js.native
    
    def isNotBoolean(`val`: js.Any): js.Thenable[Unit] = js.native
    def isNotBoolean(`val`: js.Any, msg: String): js.Thenable[Unit] = js.native
    
    def isNotEmpty(`val`: js.Any): js.Thenable[Unit] = js.native
    def isNotEmpty(`val`: js.Any, msg: String): js.Thenable[Unit] = js.native
    
    def isNotExtensible(obj: js.Object): js.Thenable[Unit] = js.native
    def isNotExtensible(obj: js.Object, msg: String): js.Thenable[Unit] = js.native
    
    def isNotFalse(`val`: js.Any): js.Thenable[Unit] = js.native
    def isNotFalse(`val`: js.Any, msg: String): js.Thenable[Unit] = js.native
    
    def isNotFrozen(obj: js.Object): js.Thenable[Unit] = js.native
    def isNotFrozen(obj: js.Object, msg: String): js.Thenable[Unit] = js.native
    
    def isNotFunction(`val`: js.Any): js.Thenable[Unit] = js.native
    def isNotFunction(`val`: js.Any, msg: String): js.Thenable[Unit] = js.native
    
    def isNotNaN(`val`: js.Any): js.Thenable[Unit] = js.native
    def isNotNaN(`val`: js.Any, msg: String): js.Thenable[Unit] = js.native
    
    def isNotNull(`val`: js.Any): js.Thenable[Unit] = js.native
    def isNotNull(`val`: js.Any, msg: String): js.Thenable[Unit] = js.native
    
    def isNotNumber(`val`: js.Any): js.Thenable[Unit] = js.native
    def isNotNumber(`val`: js.Any, msg: String): js.Thenable[Unit] = js.native
    
    def isNotObject(`val`: js.Any): js.Thenable[Unit] = js.native
    def isNotObject(`val`: js.Any, msg: String): js.Thenable[Unit] = js.native
    
    def isNotOk(`val`: js.Any): js.Thenable[Unit] = js.native
    def isNotOk(`val`: js.Any, msg: String): js.Thenable[Unit] = js.native
    
    def isNotSealed(obj: js.Object): js.Thenable[Unit] = js.native
    def isNotSealed(obj: js.Object, msg: String): js.Thenable[Unit] = js.native
    
    def isNotString(`val`: js.Any): js.Thenable[Unit] = js.native
    def isNotString(`val`: js.Any, msg: String): js.Thenable[Unit] = js.native
    
    def isNotTrue(`val`: js.Any): js.Thenable[Unit] = js.native
    def isNotTrue(`val`: js.Any, msg: String): js.Thenable[Unit] = js.native
    
    def isNull(`val`: js.Any): js.Thenable[Unit] = js.native
    def isNull(`val`: js.Any, msg: String): js.Thenable[Unit] = js.native
    
    def isNumber(`val`: js.Any): js.Thenable[Unit] = js.native
    def isNumber(`val`: js.Any, msg: String): js.Thenable[Unit] = js.native
    
    def isObject(`val`: js.Any): js.Thenable[Unit] = js.native
    def isObject(`val`: js.Any, msg: String): js.Thenable[Unit] = js.native
    
    def isOk(`val`: js.Any): js.Thenable[Unit] = js.native
    def isOk(`val`: js.Any, msg: String): js.Thenable[Unit] = js.native
    
    def isSealed(obj: js.Object): js.Thenable[Unit] = js.native
    def isSealed(obj: js.Object, msg: String): js.Thenable[Unit] = js.native
    
    def isString(`val`: js.Any): js.Thenable[Unit] = js.native
    def isString(`val`: js.Any, msg: String): js.Thenable[Unit] = js.native
    
    def isTrue(`val`: js.Any): js.Thenable[Unit] = js.native
    def isTrue(`val`: js.Any, msg: String): js.Thenable[Unit] = js.native
    
    def isUndefined(`val`: js.Any): js.Thenable[Unit] = js.native
    def isUndefined(`val`: js.Any, msg: String): js.Thenable[Unit] = js.native
    
    def lengthOf(exp: js.Any, len: Double): js.Thenable[Unit] = js.native
    def lengthOf(exp: js.Any, len: Double, msg: String): js.Thenable[Unit] = js.native
    
    def `match`(exp: js.Any, re: RegExp): js.Thenable[Unit] = js.native
    def `match`(exp: js.Any, re: RegExp, msg: String): js.Thenable[Unit] = js.native
    
    def nestedInclude(exp: js.Object, inc: js.Object): js.Thenable[Unit] = js.native
    def nestedInclude(exp: js.Object, inc: js.Object, msg: String): js.Thenable[Unit] = js.native
    
    def nestedProperty(obj: js.Object, prop: String): js.Thenable[Unit] = js.native
    def nestedProperty(obj: js.Object, prop: String, msg: String): js.Thenable[Unit] = js.native
    
    def nestedPropertyVal(obj: js.Object, prop: String, `val`: js.Any): js.Thenable[Unit] = js.native
    def nestedPropertyVal(obj: js.Object, prop: String, `val`: js.Any, msg: String): js.Thenable[Unit] = js.native
    
    def notDeepEqual(act: js.Any, exp: js.Any): js.Thenable[Unit] = js.native
    def notDeepEqual(act: js.Any, exp: js.Any, msg: String): js.Thenable[Unit] = js.native
    
    def notDeepInclude(exp: String, inc: js.Any): js.Thenable[Unit] = js.native
    def notDeepInclude(exp: String, inc: js.Any, msg: String): js.Thenable[Unit] = js.native
    def notDeepInclude(exp: js.Array[_], inc: js.Any): js.Thenable[Unit] = js.native
    def notDeepInclude(exp: js.Array[_], inc: js.Any, msg: String): js.Thenable[Unit] = js.native
    
    def notDeepNestedInclude(exp: js.Object, inc: js.Object): js.Thenable[Unit] = js.native
    def notDeepNestedInclude(exp: js.Object, inc: js.Object, msg: String): js.Thenable[Unit] = js.native
    
    def notDeepNestedPropertyVal(obj: js.Object, prop: String, `val`: js.Any): js.Thenable[Unit] = js.native
    def notDeepNestedPropertyVal(obj: js.Object, prop: String, `val`: js.Any, msg: String): js.Thenable[Unit] = js.native
    
    def notDeepOwnInclude(exp: js.Object, inc: js.Object): js.Thenable[Unit] = js.native
    def notDeepOwnInclude(exp: js.Object, inc: js.Object, msg: String): js.Thenable[Unit] = js.native
    
    def notDeepProperty(obj: js.Object, prop: String): js.Thenable[Unit] = js.native
    def notDeepProperty(obj: js.Object, prop: String, msg: String): js.Thenable[Unit] = js.native
    
    def notEqual(act: js.Any, exp: js.Any): js.Thenable[Unit] = js.native
    def notEqual(act: js.Any, exp: js.Any, msg: String): js.Thenable[Unit] = js.native
    
    def notExists(`val`: js.Any): js.Thenable[Unit] = js.native
    def notExists(`val`: js.Any, msg: String): js.Thenable[Unit] = js.native
    
    def notFrozen(obj: js.Object): js.Thenable[Unit] = js.native
    def notFrozen(obj: js.Object, msg: String): js.Thenable[Unit] = js.native
    
    def notInclude(exp: String, inc: js.Any): js.Thenable[Unit] = js.native
    def notInclude(exp: String, inc: js.Any, msg: String): js.Thenable[Unit] = js.native
    def notInclude(exp: js.Array[_], inc: js.Any): js.Thenable[Unit] = js.native
    def notInclude(exp: js.Array[_], inc: js.Any, msg: String): js.Thenable[Unit] = js.native
    
    def notIncludeDeepOrderedMembers(set1: js.Array[_], set2: js.Array[_]): js.Thenable[Unit] = js.native
    def notIncludeDeepOrderedMembers(set1: js.Array[_], set2: js.Array[_], msg: String): js.Thenable[Unit] = js.native
    
    def notIncludeOrderedMembers(set1: js.Array[_], set2: js.Array[_]): js.Thenable[Unit] = js.native
    def notIncludeOrderedMembers(set1: js.Array[_], set2: js.Array[_], msg: String): js.Thenable[Unit] = js.native
    
    def notInstanceOf(`val`: js.Any, `type`: js.Function): js.Thenable[Unit] = js.native
    def notInstanceOf(`val`: js.Any, `type`: js.Function, msg: String): js.Thenable[Unit] = js.native
    
    def notMatch(exp: js.Any, re: RegExp): js.Thenable[Unit] = js.native
    def notMatch(exp: js.Any, re: RegExp, msg: String): js.Thenable[Unit] = js.native
    
    def notNestedInclude(exp: js.Object, inc: js.Object): js.Thenable[Unit] = js.native
    def notNestedInclude(exp: js.Object, inc: js.Object, msg: String): js.Thenable[Unit] = js.native
    
    def notNestedProperty(obj: js.Object, prop: String): js.Thenable[Unit] = js.native
    def notNestedProperty(obj: js.Object, prop: String, msg: String): js.Thenable[Unit] = js.native
    
    def notNestedPropertyVal(obj: js.Object, prop: String, `val`: js.Any): js.Thenable[Unit] = js.native
    def notNestedPropertyVal(obj: js.Object, prop: String, `val`: js.Any, msg: String): js.Thenable[Unit] = js.native
    
    def notOk(`val`: js.Any): js.Thenable[Unit] = js.native
    def notOk(`val`: js.Any, msg: String): js.Thenable[Unit] = js.native
    
    def notOwnInclude(exp: js.Object, inc: js.Object): js.Thenable[Unit] = js.native
    def notOwnInclude(exp: js.Object, inc: js.Object, msg: String): js.Thenable[Unit] = js.native
    
    def notProperty(obj: js.Object, prop: String): js.Thenable[Unit] = js.native
    def notProperty(obj: js.Object, prop: String, msg: String): js.Thenable[Unit] = js.native
    
    def notSameDeepOrderedMembers(set1: js.Array[_], set2: js.Array[_]): js.Thenable[Unit] = js.native
    def notSameDeepOrderedMembers(set1: js.Array[_], set2: js.Array[_], msg: String): js.Thenable[Unit] = js.native
    
    def notSameOrderedMembers(set1: js.Array[_], set2: js.Array[_]): js.Thenable[Unit] = js.native
    def notSameOrderedMembers(set1: js.Array[_], set2: js.Array[_], msg: String): js.Thenable[Unit] = js.native
    
    def notSealed(obj: js.Object): js.Thenable[Unit] = js.native
    def notSealed(obj: js.Object, msg: String): js.Thenable[Unit] = js.native
    
    def notStrictEqual(act: js.Any, exp: js.Any): js.Thenable[Unit] = js.native
    def notStrictEqual(act: js.Any, exp: js.Any, msg: String): js.Thenable[Unit] = js.native
    
    def notTypeOf(`val`: js.Any, `type`: String): js.Thenable[Unit] = js.native
    def notTypeOf(`val`: js.Any, `type`: String, msg: String): js.Thenable[Unit] = js.native
    
    def ok(`val`: js.Any): js.Thenable[Unit] = js.native
    def ok(`val`: js.Any, msg: String): js.Thenable[Unit] = js.native
    
    def oneOf(`val`: js.Any, list: js.Array[_]): js.Thenable[Unit] = js.native
    def oneOf(`val`: js.Any, list: js.Array[_], msg: String): js.Thenable[Unit] = js.native
    
    def operator(`val`: js.Any, operator: String, val2: js.Any): js.Thenable[Unit] = js.native
    def operator(`val`: js.Any, operator: String, val2: js.Any, msg: String): js.Thenable[Unit] = js.native
    
    def ownInclude(exp: js.Object, inc: js.Object): js.Thenable[Unit] = js.native
    def ownInclude(exp: js.Object, inc: js.Object, msg: String): js.Thenable[Unit] = js.native
    
    def property(obj: js.Object, prop: String): js.Thenable[Unit] = js.native
    def property(obj: js.Object, prop: String, msg: String): js.Thenable[Unit] = js.native
    
    def propertyNotVal(obj: js.Object, prop: String, `val`: js.Any): js.Thenable[Unit] = js.native
    def propertyNotVal(obj: js.Object, prop: String, `val`: js.Any, msg: String): js.Thenable[Unit] = js.native
    
    def propertyVal(obj: js.Object, prop: String, `val`: js.Any): js.Thenable[Unit] = js.native
    def propertyVal(obj: js.Object, prop: String, `val`: js.Any, msg: String): js.Thenable[Unit] = js.native
    
    def sameDeepMembers(set1: js.Array[_], set2: js.Array[_]): js.Thenable[Unit] = js.native
    def sameDeepMembers(set1: js.Array[_], set2: js.Array[_], msg: String): js.Thenable[Unit] = js.native
    
    def sameDeepOrderedMembers(set1: js.Array[_], set2: js.Array[_]): js.Thenable[Unit] = js.native
    def sameDeepOrderedMembers(set1: js.Array[_], set2: js.Array[_], msg: String): js.Thenable[Unit] = js.native
    
    def sameMembers(set1: js.Array[_], set2: js.Array[_]): js.Thenable[Unit] = js.native
    def sameMembers(set1: js.Array[_], set2: js.Array[_], msg: String): js.Thenable[Unit] = js.native
    
    def sameOrderedMembers(set1: js.Array[_], set2: js.Array[_]): js.Thenable[Unit] = js.native
    def sameOrderedMembers(set1: js.Array[_], set2: js.Array[_], msg: String): js.Thenable[Unit] = js.native
    
    def `sealed`(obj: js.Object): js.Thenable[Unit] = js.native
    def `sealed`(obj: js.Object, msg: String): js.Thenable[Unit] = js.native
    
    def strictEqual(act: js.Any, exp: js.Any): js.Thenable[Unit] = js.native
    def strictEqual(act: js.Any, exp: js.Any, msg: String): js.Thenable[Unit] = js.native
    
    //alias frenzy
    def `throw`(fn: js.Function): js.Thenable[Unit] = js.native
    def `throw`(fn: js.Function, errType: js.Function): js.Thenable[Unit] = js.native
    def `throw`(fn: js.Function, errType: js.Function, msg: String): js.Thenable[Unit] = js.native
    def `throw`(fn: js.Function, errType: js.Function, regExp: RegExp): js.Thenable[Unit] = js.native
    def `throw`(fn: js.Function, msg: String): js.Thenable[Unit] = js.native
    def `throw`(fn: js.Function, regExp: RegExp): js.Thenable[Unit] = js.native
    
    def throws(fn: js.Function): js.Thenable[Unit] = js.native
    def throws(fn: js.Function, errType: js.Function): js.Thenable[Unit] = js.native
    def throws(fn: js.Function, errType: js.Function, msg: String): js.Thenable[Unit] = js.native
    def throws(fn: js.Function, errType: js.Function, regExp: RegExp): js.Thenable[Unit] = js.native
    def throws(fn: js.Function, msg: String): js.Thenable[Unit] = js.native
    def throws(fn: js.Function, regExp: RegExp): js.Thenable[Unit] = js.native
    
    def typeOf(`val`: js.Any, `type`: String): js.Thenable[Unit] = js.native
    def typeOf(`val`: js.Any, `type`: String, msg: String): js.Thenable[Unit] = js.native
  }
  
  @js.native
  trait PromisedAssertion
    extends Eventually
       with PromiseLike[js.Any]
  
  @js.native
  trait PromisedDeep extends js.Object {
    
    def eq(value: js.Any): PromisedAssertion = js.native
    def eq(value: js.Any, message: String): PromisedAssertion = js.native
    @JSName("eq")
    var eq_Original: PromisedEqual = js.native
    
    def equal(value: js.Any): PromisedAssertion = js.native
    def equal(value: js.Any, message: String): PromisedAssertion = js.native
    @JSName("equal")
    var equal_Original: PromisedEqual = js.native
    
    def equals(value: js.Any): PromisedAssertion = js.native
    def equals(value: js.Any, message: String): PromisedAssertion = js.native
    @JSName("equals")
    var equals_Original: PromisedEqual = js.native
    
    def include(value: String): PromisedAssertion = js.native
    def include(value: String, message: String): PromisedAssertion = js.native
    def include(value: js.Object): PromisedAssertion = js.native
    def include(value: js.Object, message: String): PromisedAssertion = js.native
    def include(value: Double): PromisedAssertion = js.native
    def include(value: Double, message: String): PromisedAssertion = js.native
    @JSName("include")
    var include_Original: PromisedInclude = js.native
    
    def members(set: js.Array[_]): PromisedAssertion = js.native
    def members(set: js.Array[_], message: String): PromisedAssertion = js.native
    @JSName("members")
    var members_Original: PromisedMembers = js.native
    
    var ordered: PromisedOrdered = js.native
    
    def property(name: String): PromisedAssertion = js.native
    def property(name: String, value: js.UndefOr[scala.Nothing], message: String): PromisedAssertion = js.native
    def property(name: String, value: js.Any): PromisedAssertion = js.native
    def property(name: String, value: js.Any, message: String): PromisedAssertion = js.native
    @JSName("property")
    var property_Original: PromisedProperty = js.native
  }
  
  @js.native
  trait PromisedInclude extends js.Object {
    
    def apply(value: String): PromisedAssertion = js.native
    def apply(value: String, message: String): PromisedAssertion = js.native
    def apply(value: js.Object): PromisedAssertion = js.native
    def apply(value: js.Object, message: String): PromisedAssertion = js.native
    def apply(value: Double): PromisedAssertion = js.native
    def apply(value: Double, message: String): PromisedAssertion = js.native
    
    var all: PromisedKeyFilter = js.native
    
    var any: PromisedKeyFilter = js.native
    
    var deep: PromisedDeep = js.native
    
    def keys(keys: String*): PromisedAssertion = js.native
    def keys(keys: js.Array[_]): PromisedAssertion = js.native
    def keys(keys: js.Object): PromisedAssertion = js.native
    @JSName("keys")
    var keys_Original: PromisedKeys = js.native
    
    def members(set: js.Array[_]): PromisedAssertion = js.native
    def members(set: js.Array[_], message: String): PromisedAssertion = js.native
    @JSName("members")
    var members_Original: PromisedMembers = js.native
    
    var ordered: PromisedOrdered = js.native
  }
  
  @js.native
  trait PromisedKeyFilter extends js.Object {
    
    def keys(keys: String*): PromisedAssertion = js.native
    def keys(keys: js.Array[_]): PromisedAssertion = js.native
    def keys(keys: js.Object): PromisedAssertion = js.native
    @JSName("keys")
    var keys_Original: PromisedKeys = js.native
  }
  
  @js.native
  trait PromisedKeys extends js.Object {
    
    def apply(keys: String*): PromisedAssertion = js.native
    def apply(keys: js.Array[_]): PromisedAssertion = js.native
    def apply(keys: js.Object): PromisedAssertion = js.native
  }
  
  @js.native
  trait PromisedLanguageChains extends js.Object {
    
    def and(`type`: String): PromisedAssertion = js.native
    def and(`type`: String, message: String): PromisedAssertion = js.native
    @JSName("and")
    var and_Original: PromisedAssertion = js.native
    
    def at(`type`: String): PromisedAssertion = js.native
    def at(`type`: String, message: String): PromisedAssertion = js.native
    @JSName("at")
    var at_Original: PromisedAssertion = js.native
    
    def be(`type`: String): PromisedAssertion = js.native
    def be(`type`: String, message: String): PromisedAssertion = js.native
    @JSName("be")
    var be_Original: PromisedAssertion = js.native
    
    def been(`type`: String): PromisedAssertion = js.native
    def been(`type`: String, message: String): PromisedAssertion = js.native
    @JSName("been")
    var been_Original: PromisedAssertion = js.native
    
    def but(`type`: String): PromisedAssertion = js.native
    def but(`type`: String, message: String): PromisedAssertion = js.native
    @JSName("but")
    var but_Original: PromisedAssertion = js.native
    
    def does(`type`: String): PromisedAssertion = js.native
    def does(`type`: String, message: String): PromisedAssertion = js.native
    @JSName("does")
    var does_Original: PromisedAssertion = js.native
    
    def eventually(`type`: String): PromisedAssertion = js.native
    def eventually(`type`: String, message: String): PromisedAssertion = js.native
    @JSName("eventually")
    var eventually_Original: Eventually = js.native
    
    def has(`type`: String): PromisedAssertion = js.native
    def has(`type`: String, message: String): PromisedAssertion = js.native
    @JSName("has")
    var has_Original: PromisedAssertion = js.native
    
    def have(`type`: String): PromisedAssertion = js.native
    def have(`type`: String, message: String): PromisedAssertion = js.native
    @JSName("have")
    var have_Original: PromisedAssertion = js.native
    
    def is(`type`: String): PromisedAssertion = js.native
    def is(`type`: String, message: String): PromisedAssertion = js.native
    @JSName("is")
    var is_Original: PromisedAssertion = js.native
    
    def of(`type`: String): PromisedAssertion = js.native
    def of(`type`: String, message: String): PromisedAssertion = js.native
    @JSName("of")
    var of_Original: PromisedAssertion = js.native
    
    def same(`type`: String): PromisedAssertion = js.native
    def same(`type`: String, message: String): PromisedAssertion = js.native
    @JSName("same")
    var same_Original: PromisedAssertion = js.native
    
    def that(`type`: String): PromisedAssertion = js.native
    def that(`type`: String, message: String): PromisedAssertion = js.native
    @JSName("that")
    var that_Original: PromisedAssertion = js.native
    
    // From chai
    def to(`type`: String): PromisedAssertion = js.native
    def to(`type`: String, message: String): PromisedAssertion = js.native
    // From chai
    @JSName("to")
    var to_Original: PromisedAssertion = js.native
    
    def which(`type`: String): PromisedAssertion = js.native
    def which(`type`: String, message: String): PromisedAssertion = js.native
    @JSName("which")
    var which_Original: PromisedAssertion = js.native
    
    def `with`(`type`: String): PromisedAssertion = js.native
    def `with`(`type`: String, message: String): PromisedAssertion = js.native
    @JSName("with")
    var with_Original: PromisedAssertion = js.native
  }
  
  @js.native
  trait PromisedLength
    extends PromisedLanguageChains
       with PromisedNumericComparison {
    
    def apply(length: Double): PromisedAssertion = js.native
    def apply(length: Double, message: String): PromisedAssertion = js.native
  }
  
  @js.native
  trait PromisedNested extends js.Object {
    
    def include(value: String): PromisedAssertion = js.native
    def include(value: String, message: String): PromisedAssertion = js.native
    def include(value: js.Object): PromisedAssertion = js.native
    def include(value: js.Object, message: String): PromisedAssertion = js.native
    def include(value: Double): PromisedAssertion = js.native
    def include(value: Double, message: String): PromisedAssertion = js.native
    @JSName("include")
    var include_Original: PromisedInclude = js.native
    
    def members(set: js.Array[_]): PromisedAssertion = js.native
    def members(set: js.Array[_], message: String): PromisedAssertion = js.native
    @JSName("members")
    var members_Original: PromisedMembers = js.native
    
    def property(name: String): PromisedAssertion = js.native
    def property(name: String, value: js.UndefOr[scala.Nothing], message: String): PromisedAssertion = js.native
    def property(name: String, value: js.Any): PromisedAssertion = js.native
    def property(name: String, value: js.Any, message: String): PromisedAssertion = js.native
    @JSName("property")
    var property_Original: PromisedProperty = js.native
  }
  
  @js.native
  trait PromisedNumericComparison extends js.Object {
    
    def above(value: Double): PromisedAssertion = js.native
    def above(value: Double, message: String): PromisedAssertion = js.native
    @JSName("above")
    var above_Original: PromisedNumberComparer = js.native
    
    def below(value: Double): PromisedAssertion = js.native
    def below(value: Double, message: String): PromisedAssertion = js.native
    @JSName("below")
    var below_Original: PromisedNumberComparer = js.native
    
    def greaterThan(value: Double): PromisedAssertion = js.native
    def greaterThan(value: Double, message: String): PromisedAssertion = js.native
    @JSName("greaterThan")
    var greaterThan_Original: PromisedNumberComparer = js.native
    
    def gt(value: Double): PromisedAssertion = js.native
    def gt(value: Double, message: String): PromisedAssertion = js.native
    @JSName("gt")
    var gt_Original: PromisedNumberComparer = js.native
    
    def gte(value: Double): PromisedAssertion = js.native
    def gte(value: Double, message: String): PromisedAssertion = js.native
    @JSName("gte")
    var gte_Original: PromisedNumberComparer = js.native
    
    def least(value: Double): PromisedAssertion = js.native
    def least(value: Double, message: String): PromisedAssertion = js.native
    @JSName("least")
    var least_Original: PromisedNumberComparer = js.native
    
    def lessThan(value: Double): PromisedAssertion = js.native
    def lessThan(value: Double, message: String): PromisedAssertion = js.native
    @JSName("lessThan")
    var lessThan_Original: PromisedNumberComparer = js.native
    
    def lt(value: Double): PromisedAssertion = js.native
    def lt(value: Double, message: String): PromisedAssertion = js.native
    @JSName("lt")
    var lt_Original: PromisedNumberComparer = js.native
    
    def lte(value: Double): PromisedAssertion = js.native
    def lte(value: Double, message: String): PromisedAssertion = js.native
    @JSName("lte")
    var lte_Original: PromisedNumberComparer = js.native
    
    def most(value: Double): PromisedAssertion = js.native
    def most(value: Double, message: String): PromisedAssertion = js.native
    @JSName("most")
    var most_Original: PromisedNumberComparer = js.native
    
    def within(start: Double, finish: Double): PromisedAssertion = js.native
    def within(start: Double, finish: Double, message: String): PromisedAssertion = js.native
  }
  
  @js.native
  trait PromisedOrdered extends js.Object {
    
    def members(set: js.Array[_]): PromisedAssertion = js.native
    def members(set: js.Array[_], message: String): PromisedAssertion = js.native
    @JSName("members")
    var members_Original: PromisedMembers = js.native
  }
  
  @js.native
  trait PromisedOwnPropertyDescriptor extends js.Object {
    
    def apply(name: String): PromisedAssertion = js.native
    def apply(name: String, descriptor: PropertyDescriptor): PromisedAssertion = js.native
    def apply(name: String, descriptor: PropertyDescriptor, message: String): PromisedAssertion = js.native
    def apply(name: String, message: String): PromisedAssertion = js.native
  }
  
  @js.native
  trait PromisedThrow extends js.Object {
    
    def apply(): PromisedAssertion = js.native
    def apply(constructor: js.Function): PromisedAssertion = js.native
    def apply(constructor: js.Function, expected: js.UndefOr[scala.Nothing], message: String): PromisedAssertion = js.native
    def apply(constructor: js.Function, expected: String): PromisedAssertion = js.native
    def apply(constructor: js.Function, expected: String, message: String): PromisedAssertion = js.native
    def apply(constructor: js.Function, expected: RegExp): PromisedAssertion = js.native
    def apply(constructor: js.Function, expected: RegExp, message: String): PromisedAssertion = js.native
    def apply(constructor: Error): PromisedAssertion = js.native
    def apply(constructor: Error, expected: js.UndefOr[scala.Nothing], message: String): PromisedAssertion = js.native
    def apply(constructor: Error, expected: String): PromisedAssertion = js.native
    def apply(constructor: Error, expected: String, message: String): PromisedAssertion = js.native
    def apply(constructor: Error, expected: RegExp): PromisedAssertion = js.native
    def apply(constructor: Error, expected: RegExp, message: String): PromisedAssertion = js.native
    def apply(expected: String): PromisedAssertion = js.native
    def apply(expected: String, message: String): PromisedAssertion = js.native
    def apply(expected: RegExp): PromisedAssertion = js.native
    def apply(expected: RegExp, message: String): PromisedAssertion = js.native
  }
  
  @js.native
  trait PromisedTypeComparison extends js.Object {
    
    def apply(`type`: String): PromisedAssertion = js.native
    def apply(`type`: String, message: String): PromisedAssertion = js.native
    
    def instanceOf(constructor: js.Object): PromisedAssertion = js.native
    def instanceOf(constructor: js.Object, message: String): PromisedAssertion = js.native
    @JSName("instanceOf")
    var instanceOf_Original: PromisedInstanceOf = js.native
    
    def instanceof(constructor: js.Object): PromisedAssertion = js.native
    def instanceof(constructor: js.Object, message: String): PromisedAssertion = js.native
    @JSName("instanceof")
    var instanceof_Original: PromisedInstanceOf = js.native
  }
  
  type PromisedCloseTo = js.Function3[
    /* expected */ Double, 
    /* delta */ Double, 
    /* message */ js.UndefOr[String], 
    PromisedAssertion
  ]
  
  type PromisedEqual = js.Function2[/* value */ js.Any, /* message */ js.UndefOr[String], PromisedAssertion]
  
  type PromisedInstanceOf = js.Function2[/* constructor */ js.Object, /* message */ js.UndefOr[String], PromisedAssertion]
  
  type PromisedMatch = js.Function2[/* regexp */ RegExp | String, /* message */ js.UndefOr[String], PromisedAssertion]
  
  type PromisedMembers = js.Function2[/* set */ js.Array[js.Any], /* message */ js.UndefOr[String], PromisedAssertion]
  
  type PromisedNumberComparer = js.Function2[/* value */ Double, /* message */ js.UndefOr[String], PromisedAssertion]
  
  type PromisedOwnProperty = js.Function2[/* name */ String, /* message */ js.UndefOr[String], PromisedAssertion]
  
  type PromisedProperty = js.Function3[
    /* name */ String, 
    /* value */ js.UndefOr[js.Any], 
    /* message */ js.UndefOr[String], 
    PromisedAssertion
  ]
  
  type PromisedPropertyChange = js.Function3[
    /* object */ js.Object, 
    /* property */ String, 
    /* message */ js.UndefOr[String], 
    PromisedAssertion
  ]
  
  type PromisedRespondTo = js.Function2[/* method */ String, /* message */ js.UndefOr[String], PromisedAssertion]
  
  type PromisedSatisfy = js.Function2[/* matcher */ js.Function, /* message */ js.UndefOr[String], PromisedAssertion]
}
