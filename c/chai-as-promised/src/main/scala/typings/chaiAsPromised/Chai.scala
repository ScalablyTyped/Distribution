package typings.chaiAsPromised

import typings.chai.Chai.LanguageChains
import typings.chai.Chai.NumericComparison
import typings.chai.Chai.TypeComparison
import typings.std.PromiseLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Chai {
  
  // For Assert API
  @js.native
  trait Assert extends StObject {
    
    def becomes(promise: PromiseLike[Any], expected: Any): PromiseLike[Unit] = js.native
    def becomes(promise: PromiseLike[Any], expected: Any, message: String): PromiseLike[Unit] = js.native
    
    def doesNotBecome(promise: PromiseLike[Any], expected: Any): PromiseLike[Unit] = js.native
    def doesNotBecome(promise: PromiseLike[Any], expected: Any, message: String): PromiseLike[Unit] = js.native
    
    var eventually: PromisedAssert = js.native
    
    def isFulfilled(promise: PromiseLike[Any]): PromiseLike[Unit] = js.native
    def isFulfilled(promise: PromiseLike[Any], message: String): PromiseLike[Unit] = js.native
    
    def isRejected(promise: PromiseLike[Any]): PromiseLike[Unit] = js.native
    def isRejected(promise: PromiseLike[Any], expected: Any): PromiseLike[Unit] = js.native
    def isRejected(promise: PromiseLike[Any], expected: Any, message: String): PromiseLike[Unit] = js.native
    def isRejected(promise: PromiseLike[Any], `match`: js.RegExp): PromiseLike[Unit] = js.native
    def isRejected(promise: PromiseLike[Any], `match`: js.RegExp, message: String): PromiseLike[Unit] = js.native
    def isRejected(promise: PromiseLike[Any], message: String): PromiseLike[Unit] = js.native
    
    def notify(fn: js.Function): PromiseLike[Unit] = js.native
  }
  
  // For BDD API
  @js.native
  trait Assertion
    extends StObject
       with LanguageChains
       with NumericComparison
       with TypeComparison {
    
    def become(expected: Any): PromisedAssertion = js.native
    
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
    def rejectedWith(constructor: js.Error): PromisedAssertion = js.native
    def rejectedWith(constructor: js.Error, expected: String): PromisedAssertion = js.native
    def rejectedWith(constructor: js.Error, expected: String, message: String): PromisedAssertion = js.native
    def rejectedWith(constructor: js.Error, expected: js.RegExp): PromisedAssertion = js.native
    def rejectedWith(constructor: js.Error, expected: js.RegExp, message: String): PromisedAssertion = js.native
    def rejectedWith(constructor: js.Error, expected: Unit, message: String): PromisedAssertion = js.native
    def rejectedWith(constructor: js.Function): PromisedAssertion = js.native
    def rejectedWith(constructor: js.Function, expected: String): PromisedAssertion = js.native
    def rejectedWith(constructor: js.Function, expected: String, message: String): PromisedAssertion = js.native
    def rejectedWith(constructor: js.Function, expected: js.RegExp): PromisedAssertion = js.native
    def rejectedWith(constructor: js.Function, expected: js.RegExp, message: String): PromisedAssertion = js.native
    def rejectedWith(constructor: js.Function, expected: Unit, message: String): PromisedAssertion = js.native
    def rejectedWith(expected: String): PromisedAssertion = js.native
    def rejectedWith(expected: String, message: String): PromisedAssertion = js.native
    def rejectedWith(expected: js.RegExp): PromisedAssertion = js.native
    def rejectedWith(expected: js.RegExp, message: String): PromisedAssertion = js.native
    @JSName("rejectedWith")
    var rejectedWith_Original: PromisedThrow = js.native
    
    @JSName("rejected")
    var rejected_Original: PromisedAssertion = js.native
  }
  
  // Eventually does not have .then(), but PromisedAssertion have.
  @js.native
  trait Eventually
    extends StObject
       with PromisedLanguageChains
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
    def Throw(constructor: js.Error): PromisedAssertion = js.native
    def Throw(constructor: js.Error, expected: String): PromisedAssertion = js.native
    def Throw(constructor: js.Error, expected: String, message: String): PromisedAssertion = js.native
    def Throw(constructor: js.Error, expected: js.RegExp): PromisedAssertion = js.native
    def Throw(constructor: js.Error, expected: js.RegExp, message: String): PromisedAssertion = js.native
    def Throw(constructor: js.Error, expected: Unit, message: String): PromisedAssertion = js.native
    def Throw(constructor: js.Function): PromisedAssertion = js.native
    def Throw(constructor: js.Function, expected: String): PromisedAssertion = js.native
    def Throw(constructor: js.Function, expected: String, message: String): PromisedAssertion = js.native
    def Throw(constructor: js.Function, expected: js.RegExp): PromisedAssertion = js.native
    def Throw(constructor: js.Function, expected: js.RegExp, message: String): PromisedAssertion = js.native
    def Throw(constructor: js.Function, expected: Unit, message: String): PromisedAssertion = js.native
    def Throw(expected: String): PromisedAssertion = js.native
    def Throw(expected: String, message: String): PromisedAssertion = js.native
    def Throw(expected: js.RegExp): PromisedAssertion = js.native
    def Throw(expected: js.RegExp, message: String): PromisedAssertion = js.native
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
    def become(expected: Any): PromisedAssertion = js.native
    
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
    
    def eq(value: Any, message: String): PromisedAssertion = js.native
    @JSName("eq")
    var eq_Original: PromisedEqual = js.native
    
    def eql(value: Any): PromisedAssertion = js.native
    def eql(value: Any, message: String): PromisedAssertion = js.native
    @JSName("eql")
    var eql_Original: PromisedEqual = js.native
    
    def eqls(value: Any): PromisedAssertion = js.native
    def eqls(value: Any, message: String): PromisedAssertion = js.native
    @JSName("eqls")
    var eqls_Original: PromisedEqual = js.native
    
    def equal(value: Any): PromisedAssertion = js.native
    def equal(value: Any, message: String): PromisedAssertion = js.native
    @JSName("equal")
    var equal_Original: PromisedEqual = js.native
    
    def equals(value: Any, message: String): PromisedAssertion = js.native
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
    def haveOwnProperty(name: js.Symbol): PromisedAssertion = js.native
    def haveOwnProperty(name: js.Symbol, message: String): PromisedAssertion = js.native
    
    def haveOwnPropertyDescriptor(name: String): PromisedAssertion = js.native
    def haveOwnPropertyDescriptor(name: String, descriptor: js.PropertyDescriptor): PromisedAssertion = js.native
    def haveOwnPropertyDescriptor(name: String, descriptor: js.PropertyDescriptor, message: String): PromisedAssertion = js.native
    def haveOwnPropertyDescriptor(name: String, message: String): PromisedAssertion = js.native
    def haveOwnPropertyDescriptor(name: js.Symbol): PromisedAssertion = js.native
    def haveOwnPropertyDescriptor(name: js.Symbol, descriptor: js.PropertyDescriptor): PromisedAssertion = js.native
    def haveOwnPropertyDescriptor(name: js.Symbol, descriptor: js.PropertyDescriptor, message: String): PromisedAssertion = js.native
    def haveOwnPropertyDescriptor(name: js.Symbol, message: String): PromisedAssertion = js.native
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
    def keys(keys: js.Array[Any]): PromisedAssertion = js.native
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
    def `match`(regexp: js.RegExp): PromisedAssertion = js.native
    def `match`(regexp: js.RegExp, message: String): PromisedAssertion = js.native
    @JSName("match")
    var match_Original: PromisedMatch = js.native
    
    def matches(regexp: String): PromisedAssertion = js.native
    def matches(regexp: String, message: String): PromisedAssertion = js.native
    def matches(regexp: js.RegExp): PromisedAssertion = js.native
    def matches(regexp: js.RegExp, message: String): PromisedAssertion = js.native
    @JSName("matches")
    var matches_Original: PromisedMatch = js.native
    
    def members(set: js.Array[Any]): PromisedAssertion = js.native
    def members(set: js.Array[Any], message: String): PromisedAssertion = js.native
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
    
    def oneOf(list: js.Array[Any]): PromisedAssertion = js.native
    def oneOf(list: js.Array[Any], message: String): PromisedAssertion = js.native
    
    var ordered: PromisedOrdered = js.native
    
    def ownProperty(name: String): PromisedAssertion = js.native
    def ownProperty(name: String, message: String): PromisedAssertion = js.native
    def ownProperty(name: js.Symbol): PromisedAssertion = js.native
    def ownProperty(name: js.Symbol, message: String): PromisedAssertion = js.native
    
    def ownPropertyDescriptor(name: String): PromisedAssertion = js.native
    def ownPropertyDescriptor(name: String, descriptor: js.PropertyDescriptor): PromisedAssertion = js.native
    def ownPropertyDescriptor(name: String, descriptor: js.PropertyDescriptor, message: String): PromisedAssertion = js.native
    def ownPropertyDescriptor(name: String, message: String): PromisedAssertion = js.native
    def ownPropertyDescriptor(name: js.Symbol): PromisedAssertion = js.native
    def ownPropertyDescriptor(name: js.Symbol, descriptor: js.PropertyDescriptor): PromisedAssertion = js.native
    def ownPropertyDescriptor(name: js.Symbol, descriptor: js.PropertyDescriptor, message: String): PromisedAssertion = js.native
    def ownPropertyDescriptor(name: js.Symbol, message: String): PromisedAssertion = js.native
    @JSName("ownPropertyDescriptor")
    var ownPropertyDescriptor_Original: PromisedOwnPropertyDescriptor = js.native
    
    @JSName("ownProperty")
    var ownProperty_Original: PromisedOwnProperty = js.native
    
    def property(name: String): PromisedAssertion = js.native
    def property(name: String, value: Any): PromisedAssertion = js.native
    def property(name: String, value: Any, message: String): PromisedAssertion = js.native
    def property(name: String, value: Unit, message: String): PromisedAssertion = js.native
    def property(name: js.Symbol): PromisedAssertion = js.native
    def property(name: js.Symbol, value: Any): PromisedAssertion = js.native
    def property(name: js.Symbol, value: Any, message: String): PromisedAssertion = js.native
    def property(name: js.Symbol, value: Unit, message: String): PromisedAssertion = js.native
    @JSName("property")
    var property_Original: PromisedProperty = js.native
    
    def rejected(`type`: String): PromisedAssertion = js.native
    def rejected(`type`: String, message: String): PromisedAssertion = js.native
    
    def rejectedWith(): PromisedAssertion = js.native
    def rejectedWith(constructor: js.Error): PromisedAssertion = js.native
    def rejectedWith(constructor: js.Error, expected: String): PromisedAssertion = js.native
    def rejectedWith(constructor: js.Error, expected: String, message: String): PromisedAssertion = js.native
    def rejectedWith(constructor: js.Error, expected: js.RegExp): PromisedAssertion = js.native
    def rejectedWith(constructor: js.Error, expected: js.RegExp, message: String): PromisedAssertion = js.native
    def rejectedWith(constructor: js.Error, expected: Unit, message: String): PromisedAssertion = js.native
    def rejectedWith(constructor: js.Function): PromisedAssertion = js.native
    def rejectedWith(constructor: js.Function, expected: String): PromisedAssertion = js.native
    def rejectedWith(constructor: js.Function, expected: String, message: String): PromisedAssertion = js.native
    def rejectedWith(constructor: js.Function, expected: js.RegExp): PromisedAssertion = js.native
    def rejectedWith(constructor: js.Function, expected: js.RegExp, message: String): PromisedAssertion = js.native
    def rejectedWith(constructor: js.Function, expected: Unit, message: String): PromisedAssertion = js.native
    def rejectedWith(expected: String): PromisedAssertion = js.native
    def rejectedWith(expected: String, message: String): PromisedAssertion = js.native
    def rejectedWith(expected: js.RegExp): PromisedAssertion = js.native
    def rejectedWith(expected: js.RegExp, message: String): PromisedAssertion = js.native
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
    def `throw`(constructor: js.Error): PromisedAssertion = js.native
    def `throw`(constructor: js.Error, expected: String): PromisedAssertion = js.native
    def `throw`(constructor: js.Error, expected: String, message: String): PromisedAssertion = js.native
    def `throw`(constructor: js.Error, expected: js.RegExp): PromisedAssertion = js.native
    def `throw`(constructor: js.Error, expected: js.RegExp, message: String): PromisedAssertion = js.native
    def `throw`(constructor: js.Error, expected: Unit, message: String): PromisedAssertion = js.native
    def `throw`(constructor: js.Function): PromisedAssertion = js.native
    def `throw`(constructor: js.Function, expected: String): PromisedAssertion = js.native
    def `throw`(constructor: js.Function, expected: String, message: String): PromisedAssertion = js.native
    def `throw`(constructor: js.Function, expected: js.RegExp): PromisedAssertion = js.native
    def `throw`(constructor: js.Function, expected: js.RegExp, message: String): PromisedAssertion = js.native
    def `throw`(constructor: js.Function, expected: Unit, message: String): PromisedAssertion = js.native
    def `throw`(expected: String): PromisedAssertion = js.native
    def `throw`(expected: String, message: String): PromisedAssertion = js.native
    def `throw`(expected: js.RegExp): PromisedAssertion = js.native
    def `throw`(expected: js.RegExp, message: String): PromisedAssertion = js.native
    @JSName("throw")
    var throw_Original: PromisedThrow = js.native
    
    def throws(): PromisedAssertion = js.native
    def throws(constructor: js.Error): PromisedAssertion = js.native
    def throws(constructor: js.Error, expected: String): PromisedAssertion = js.native
    def throws(constructor: js.Error, expected: String, message: String): PromisedAssertion = js.native
    def throws(constructor: js.Error, expected: js.RegExp): PromisedAssertion = js.native
    def throws(constructor: js.Error, expected: js.RegExp, message: String): PromisedAssertion = js.native
    def throws(constructor: js.Error, expected: Unit, message: String): PromisedAssertion = js.native
    def throws(constructor: js.Function): PromisedAssertion = js.native
    def throws(constructor: js.Function, expected: String): PromisedAssertion = js.native
    def throws(constructor: js.Function, expected: String, message: String): PromisedAssertion = js.native
    def throws(constructor: js.Function, expected: js.RegExp): PromisedAssertion = js.native
    def throws(constructor: js.Function, expected: js.RegExp, message: String): PromisedAssertion = js.native
    def throws(constructor: js.Function, expected: Unit, message: String): PromisedAssertion = js.native
    def throws(expected: String): PromisedAssertion = js.native
    def throws(expected: String, message: String): PromisedAssertion = js.native
    def throws(expected: js.RegExp): PromisedAssertion = js.native
    def throws(expected: js.RegExp, message: String): PromisedAssertion = js.native
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
  trait PromisedAssert extends StObject {
    
    def Throw(fn: js.Function): PromiseLike[Unit] = js.native
    def Throw(fn: js.Function, errType: js.Function): PromiseLike[Unit] = js.native
    def Throw(fn: js.Function, errType: js.Function, msg: String): PromiseLike[Unit] = js.native
    def Throw(fn: js.Function, errType: js.Function, regExp: js.RegExp): PromiseLike[Unit] = js.native
    def Throw(fn: js.Function, msg: String): PromiseLike[Unit] = js.native
    def Throw(fn: js.Function, regExp: js.RegExp): PromiseLike[Unit] = js.native
    
    def approximately(act: PromiseLike[Double], exp: Double, delta: Double): PromiseLike[Unit] = js.native
    def approximately(act: PromiseLike[Double], exp: Double, delta: Double, msg: String): PromiseLike[Unit] = js.native
    
    def changes(modifier: js.Function, obj: js.Object, property: String): PromiseLike[Unit] = js.native
    def changes(modifier: js.Function, obj: js.Object, property: String, msg: String): PromiseLike[Unit] = js.native
    
    def changesButNotBy(modifier: js.Function, obj: js.Object, property: String, change: Double): PromiseLike[Unit] = js.native
    def changesButNotBy(modifier: js.Function, obj: js.Object, property: String, change: Double, msg: String): PromiseLike[Unit] = js.native
    
    def changesBy(modifier: js.Function, obj: js.Object, property: String, change: Double): PromiseLike[Unit] = js.native
    def changesBy(modifier: js.Function, obj: js.Object, property: String, change: Double, msg: String): PromiseLike[Unit] = js.native
    
    def closeTo(act: PromiseLike[Double], exp: Double, delta: Double): PromiseLike[Unit] = js.native
    def closeTo(act: PromiseLike[Double], exp: Double, delta: Double, msg: String): PromiseLike[Unit] = js.native
    
    def containsAllDeepKeys(obj: PromiseLike[Any], keys: js.Array[Any]): PromiseLike[Unit] = js.native
    def containsAllDeepKeys(obj: PromiseLike[Any], keys: js.Array[Any], msg: String): PromiseLike[Unit] = js.native
    def containsAllDeepKeys(obj: PromiseLike[Any], keys: js.Object): PromiseLike[Unit] = js.native
    def containsAllDeepKeys(obj: PromiseLike[Any], keys: js.Object, msg: String): PromiseLike[Unit] = js.native
    
    def containsAllKeys(obj: PromiseLike[Any], keys: js.Array[Any]): PromiseLike[Unit] = js.native
    def containsAllKeys(obj: PromiseLike[Any], keys: js.Array[Any], msg: String): PromiseLike[Unit] = js.native
    def containsAllKeys(obj: PromiseLike[Any], keys: js.Object): PromiseLike[Unit] = js.native
    def containsAllKeys(obj: PromiseLike[Any], keys: js.Object, msg: String): PromiseLike[Unit] = js.native
    
    def decreases(modifier: js.Function, obj: js.Object, property: String): PromiseLike[Unit] = js.native
    def decreases(modifier: js.Function, obj: js.Object, property: String, msg: String): PromiseLike[Unit] = js.native
    
    def decreasesButNotBy(modifier: js.Function, obj: js.Object, property: String, change: Double): PromiseLike[Unit] = js.native
    def decreasesButNotBy(modifier: js.Function, obj: js.Object, property: String, change: Double, msg: String): PromiseLike[Unit] = js.native
    
    def decreasesBy(modifier: js.Function, obj: js.Object, property: String, change: Double): PromiseLike[Unit] = js.native
    def decreasesBy(modifier: js.Function, obj: js.Object, property: String, change: Double, msg: String): PromiseLike[Unit] = js.native
    
    def deepEqual(act: PromiseLike[Any], exp: Any): PromiseLike[Unit] = js.native
    def deepEqual(act: PromiseLike[Any], exp: Any, msg: String): PromiseLike[Unit] = js.native
    
    def deepInclude(exp: PromiseLike[js.Array[Any] | String], inc: Any): PromiseLike[Unit] = js.native
    def deepInclude(exp: PromiseLike[js.Array[Any] | String], inc: Any, msg: String): PromiseLike[Unit] = js.native
    
    def deepNestedInclude(exp: PromiseLike[js.Object], inc: js.Object): PromiseLike[Unit] = js.native
    def deepNestedInclude(exp: PromiseLike[js.Object], inc: js.Object, msg: String): PromiseLike[Unit] = js.native
    
    def deepNestedPropertyVal(obj: PromiseLike[js.Object], prop: String, `val`: Any): PromiseLike[Unit] = js.native
    def deepNestedPropertyVal(obj: PromiseLike[js.Object], prop: String, `val`: Any, msg: String): PromiseLike[Unit] = js.native
    
    def deepOwnInclude(exp: PromiseLike[js.Object], inc: js.Object): PromiseLike[Unit] = js.native
    def deepOwnInclude(exp: PromiseLike[js.Object], inc: js.Object, msg: String): PromiseLike[Unit] = js.native
    
    def deepProperty(obj: PromiseLike[js.Object], prop: String): PromiseLike[Unit] = js.native
    def deepProperty(obj: PromiseLike[js.Object], prop: String, msg: String): PromiseLike[Unit] = js.native
    
    def deepPropertyNotVal(obj: PromiseLike[js.Object], prop: String, `val`: Any): PromiseLike[Unit] = js.native
    def deepPropertyNotVal(obj: PromiseLike[js.Object], prop: String, `val`: Any, msg: String): PromiseLike[Unit] = js.native
    
    def deepPropertyVal(obj: PromiseLike[js.Object], prop: String, `val`: Any): PromiseLike[Unit] = js.native
    def deepPropertyVal(obj: PromiseLike[js.Object], prop: String, `val`: Any, msg: String): PromiseLike[Unit] = js.native
    
    def doesNotChange(modifier: js.Function, obj: js.Object, property: String): PromiseLike[Unit] = js.native
    def doesNotChange(modifier: js.Function, obj: js.Object, property: String, msg: String): PromiseLike[Unit] = js.native
    
    def doesNotDecrease(modifier: js.Function, obj: js.Object, property: String): PromiseLike[Unit] = js.native
    def doesNotDecrease(modifier: js.Function, obj: js.Object, property: String, msg: String): PromiseLike[Unit] = js.native
    
    def doesNotHaveAllDeepKeys(obj: PromiseLike[Any], keys: js.Array[Any]): PromiseLike[Unit] = js.native
    def doesNotHaveAllDeepKeys(obj: PromiseLike[Any], keys: js.Array[Any], msg: String): PromiseLike[Unit] = js.native
    def doesNotHaveAllDeepKeys(obj: PromiseLike[Any], keys: js.Object): PromiseLike[Unit] = js.native
    def doesNotHaveAllDeepKeys(obj: PromiseLike[Any], keys: js.Object, msg: String): PromiseLike[Unit] = js.native
    
    def doesNotHaveAllKeys(obj: PromiseLike[Any], keys: js.Array[Any]): PromiseLike[Unit] = js.native
    def doesNotHaveAllKeys(obj: PromiseLike[Any], keys: js.Array[Any], msg: String): PromiseLike[Unit] = js.native
    def doesNotHaveAllKeys(obj: PromiseLike[Any], keys: js.Object): PromiseLike[Unit] = js.native
    def doesNotHaveAllKeys(obj: PromiseLike[Any], keys: js.Object, msg: String): PromiseLike[Unit] = js.native
    
    def doesNotHaveAnyDeepKeys(obj: PromiseLike[Any], keys: js.Array[Any]): PromiseLike[Unit] = js.native
    def doesNotHaveAnyDeepKeys(obj: PromiseLike[Any], keys: js.Array[Any], msg: String): PromiseLike[Unit] = js.native
    def doesNotHaveAnyDeepKeys(obj: PromiseLike[Any], keys: js.Object): PromiseLike[Unit] = js.native
    def doesNotHaveAnyDeepKeys(obj: PromiseLike[Any], keys: js.Object, msg: String): PromiseLike[Unit] = js.native
    
    def doesNotHaveAnyKeys(obj: PromiseLike[Any], keys: js.Array[Any]): PromiseLike[Unit] = js.native
    def doesNotHaveAnyKeys(obj: PromiseLike[Any], keys: js.Array[Any], msg: String): PromiseLike[Unit] = js.native
    def doesNotHaveAnyKeys(obj: PromiseLike[Any], keys: js.Object): PromiseLike[Unit] = js.native
    def doesNotHaveAnyKeys(obj: PromiseLike[Any], keys: js.Object, msg: String): PromiseLike[Unit] = js.native
    
    def doesNotIncrease(modifier: js.Function, obj: js.Object, property: String): PromiseLike[Unit] = js.native
    def doesNotIncrease(modifier: js.Function, obj: js.Object, property: String, msg: String): PromiseLike[Unit] = js.native
    
    def doesNotThrow(fn: js.Function): PromiseLike[Unit] = js.native
    def doesNotThrow(fn: js.Function, errType: js.Function): PromiseLike[Unit] = js.native
    def doesNotThrow(fn: js.Function, errType: js.Function, msg: String): PromiseLike[Unit] = js.native
    def doesNotThrow(fn: js.Function, errType: js.Function, regExp: js.RegExp): PromiseLike[Unit] = js.native
    def doesNotThrow(fn: js.Function, msg: String): PromiseLike[Unit] = js.native
    def doesNotThrow(fn: js.Function, regExp: js.RegExp): PromiseLike[Unit] = js.native
    
    def equal(act: PromiseLike[Any], exp: Any): PromiseLike[Unit] = js.native
    def equal(act: PromiseLike[Any], exp: Any, msg: String): PromiseLike[Unit] = js.native
    
    def exists(`val`: PromiseLike[Any]): PromiseLike[Unit] = js.native
    def exists(`val`: PromiseLike[Any], msg: String): PromiseLike[Unit] = js.native
    
    def fail(): PromiseLike[Unit] = js.native
    def fail(actual: Unit, expected: Any): PromiseLike[Unit] = js.native
    def fail(actual: Unit, expected: Any, msg: String): PromiseLike[Unit] = js.native
    def fail(actual: Unit, expected: Any, msg: String, operator: String): PromiseLike[Unit] = js.native
    def fail(actual: Unit, expected: Any, msg: Unit, operator: String): PromiseLike[Unit] = js.native
    def fail(actual: Unit, expected: Unit, msg: String): PromiseLike[Unit] = js.native
    def fail(actual: Unit, expected: Unit, msg: String, operator: String): PromiseLike[Unit] = js.native
    def fail(actual: Unit, expected: Unit, msg: Unit, operator: String): PromiseLike[Unit] = js.native
    def fail(actual: PromiseLike[Any]): PromiseLike[Unit] = js.native
    def fail(actual: PromiseLike[Any], expected: Any): PromiseLike[Unit] = js.native
    def fail(actual: PromiseLike[Any], expected: Any, msg: String): PromiseLike[Unit] = js.native
    def fail(actual: PromiseLike[Any], expected: Any, msg: String, operator: String): PromiseLike[Unit] = js.native
    def fail(actual: PromiseLike[Any], expected: Any, msg: Unit, operator: String): PromiseLike[Unit] = js.native
    def fail(actual: PromiseLike[Any], expected: Unit, msg: String): PromiseLike[Unit] = js.native
    def fail(actual: PromiseLike[Any], expected: Unit, msg: String, operator: String): PromiseLike[Unit] = js.native
    def fail(actual: PromiseLike[Any], expected: Unit, msg: Unit, operator: String): PromiseLike[Unit] = js.native
    
    def frozen(obj: PromiseLike[js.Object]): PromiseLike[Unit] = js.native
    def frozen(obj: PromiseLike[js.Object], msg: String): PromiseLike[Unit] = js.native
    
    def hasAllDeepKeys(obj: PromiseLike[Any], keys: js.Array[Any]): PromiseLike[Unit] = js.native
    def hasAllDeepKeys(obj: PromiseLike[Any], keys: js.Array[Any], msg: String): PromiseLike[Unit] = js.native
    def hasAllDeepKeys(obj: PromiseLike[Any], keys: js.Object): PromiseLike[Unit] = js.native
    def hasAllDeepKeys(obj: PromiseLike[Any], keys: js.Object, msg: String): PromiseLike[Unit] = js.native
    
    def hasAllKeys(obj: PromiseLike[Any], keys: js.Array[Any]): PromiseLike[Unit] = js.native
    def hasAllKeys(obj: PromiseLike[Any], keys: js.Array[Any], msg: String): PromiseLike[Unit] = js.native
    def hasAllKeys(obj: PromiseLike[Any], keys: js.Object): PromiseLike[Unit] = js.native
    def hasAllKeys(obj: PromiseLike[Any], keys: js.Object, msg: String): PromiseLike[Unit] = js.native
    
    def hasAnyDeepKeys(obj: PromiseLike[Any], keys: js.Array[Any]): PromiseLike[Unit] = js.native
    def hasAnyDeepKeys(obj: PromiseLike[Any], keys: js.Array[Any], msg: String): PromiseLike[Unit] = js.native
    def hasAnyDeepKeys(obj: PromiseLike[Any], keys: js.Object): PromiseLike[Unit] = js.native
    def hasAnyDeepKeys(obj: PromiseLike[Any], keys: js.Object, msg: String): PromiseLike[Unit] = js.native
    
    def hasAnyKeys(obj: PromiseLike[Any], keys: js.Array[Any]): PromiseLike[Unit] = js.native
    def hasAnyKeys(obj: PromiseLike[Any], keys: js.Array[Any], msg: String): PromiseLike[Unit] = js.native
    def hasAnyKeys(obj: PromiseLike[Any], keys: js.Object): PromiseLike[Unit] = js.native
    def hasAnyKeys(obj: PromiseLike[Any], keys: js.Object, msg: String): PromiseLike[Unit] = js.native
    
    def ifError(`val`: PromiseLike[Any]): PromiseLike[Unit] = js.native
    def ifError(`val`: PromiseLike[Any], msg: String): PromiseLike[Unit] = js.native
    
    def include(exp: PromiseLike[js.Array[Any] | String], inc: Any): PromiseLike[Unit] = js.native
    def include(exp: PromiseLike[js.Array[Any] | String], inc: Any, msg: String): PromiseLike[Unit] = js.native
    
    def includeDeepMembers(set1: PromiseLike[js.Array[Any]], set2: js.Array[Any]): PromiseLike[Unit] = js.native
    def includeDeepMembers(set1: PromiseLike[js.Array[Any]], set2: js.Array[Any], msg: String): PromiseLike[Unit] = js.native
    
    def includeDeepOrderedMembers(set1: PromiseLike[js.Array[Any]], set2: js.Array[Any]): PromiseLike[Unit] = js.native
    def includeDeepOrderedMembers(set1: PromiseLike[js.Array[Any]], set2: js.Array[Any], msg: String): PromiseLike[Unit] = js.native
    
    def includeMembers(set1: PromiseLike[js.Array[Any]], set2: js.Array[Any]): PromiseLike[Unit] = js.native
    def includeMembers(set1: PromiseLike[js.Array[Any]], set2: js.Array[Any], msg: String): PromiseLike[Unit] = js.native
    
    def includeOrderedMembers(set1: PromiseLike[js.Array[Any]], set2: js.Array[Any]): PromiseLike[Unit] = js.native
    def includeOrderedMembers(set1: PromiseLike[js.Array[Any]], set2: js.Array[Any], msg: String): PromiseLike[Unit] = js.native
    
    def increases(modifier: js.Function, obj: js.Object, property: String): PromiseLike[Unit] = js.native
    def increases(modifier: js.Function, obj: js.Object, property: String, msg: String): PromiseLike[Unit] = js.native
    
    def increasesButNotBy(modifier: js.Function, obj: js.Object, property: String, change: Double): PromiseLike[Unit] = js.native
    def increasesButNotBy(modifier: js.Function, obj: js.Object, property: String, change: Double, msg: String): PromiseLike[Unit] = js.native
    
    def increasesBy(modifier: js.Function, obj: js.Object, property: String, change: Double): PromiseLike[Unit] = js.native
    def increasesBy(modifier: js.Function, obj: js.Object, property: String, change: Double, msg: String): PromiseLike[Unit] = js.native
    
    def instanceOf(`val`: PromiseLike[Any], `type`: js.Function): PromiseLike[Unit] = js.native
    def instanceOf(`val`: PromiseLike[Any], `type`: js.Function, msg: String): PromiseLike[Unit] = js.native
    
    def isAbove(`val`: PromiseLike[Double], above: Double): PromiseLike[Unit] = js.native
    def isAbove(`val`: PromiseLike[Double], above: Double, msg: String): PromiseLike[Unit] = js.native
    
    def isArray(`val`: PromiseLike[Any]): PromiseLike[Unit] = js.native
    def isArray(`val`: PromiseLike[Any], msg: String): PromiseLike[Unit] = js.native
    
    def isAtBelow(`val`: PromiseLike[Double], below: Double): PromiseLike[Unit] = js.native
    def isAtBelow(`val`: PromiseLike[Double], below: Double, msg: String): PromiseLike[Unit] = js.native
    
    def isAtLeast(`val`: PromiseLike[Double], atLeast: Double): PromiseLike[Unit] = js.native
    def isAtLeast(`val`: PromiseLike[Double], atLeast: Double, msg: String): PromiseLike[Unit] = js.native
    
    def isAtMost(`val`: PromiseLike[Double], atMost: Double): PromiseLike[Unit] = js.native
    def isAtMost(`val`: PromiseLike[Double], atMost: Double, msg: String): PromiseLike[Unit] = js.native
    
    def isBoolean(`val`: PromiseLike[Any]): PromiseLike[Unit] = js.native
    def isBoolean(`val`: PromiseLike[Any], msg: String): PromiseLike[Unit] = js.native
    
    def isDefined(`val`: PromiseLike[Any]): PromiseLike[Unit] = js.native
    def isDefined(`val`: PromiseLike[Any], msg: String): PromiseLike[Unit] = js.native
    
    def isEmpty(`val`: PromiseLike[Any]): PromiseLike[Unit] = js.native
    def isEmpty(`val`: PromiseLike[Any], msg: String): PromiseLike[Unit] = js.native
    
    def isExtensible(obj: PromiseLike[js.Object]): PromiseLike[Unit] = js.native
    def isExtensible(obj: PromiseLike[js.Object], msg: String): PromiseLike[Unit] = js.native
    
    def isFalse(`val`: PromiseLike[Any]): PromiseLike[Unit] = js.native
    def isFalse(`val`: PromiseLike[Any], msg: String): PromiseLike[Unit] = js.native
    
    def isFinite(`val`: PromiseLike[Double]): PromiseLike[Unit] = js.native
    def isFinite(`val`: PromiseLike[Double], msg: String): PromiseLike[Unit] = js.native
    
    def isFrozen(obj: PromiseLike[js.Object]): PromiseLike[Unit] = js.native
    def isFrozen(obj: PromiseLike[js.Object], msg: String): PromiseLike[Unit] = js.native
    
    def isFunction(`val`: PromiseLike[Any]): PromiseLike[Unit] = js.native
    def isFunction(`val`: PromiseLike[Any], msg: String): PromiseLike[Unit] = js.native
    
    def isNaN(`val`: PromiseLike[Any]): PromiseLike[Unit] = js.native
    def isNaN(`val`: PromiseLike[Any], msg: String): PromiseLike[Unit] = js.native
    
    def isNotArray(`val`: PromiseLike[Any]): PromiseLike[Unit] = js.native
    def isNotArray(`val`: PromiseLike[Any], msg: String): PromiseLike[Unit] = js.native
    
    def isNotBoolean(`val`: PromiseLike[Any]): PromiseLike[Unit] = js.native
    def isNotBoolean(`val`: PromiseLike[Any], msg: String): PromiseLike[Unit] = js.native
    
    def isNotEmpty(`val`: PromiseLike[Any]): PromiseLike[Unit] = js.native
    def isNotEmpty(`val`: PromiseLike[Any], msg: String): PromiseLike[Unit] = js.native
    
    def isNotExtensible(obj: PromiseLike[js.Object]): PromiseLike[Unit] = js.native
    def isNotExtensible(obj: PromiseLike[js.Object], msg: String): PromiseLike[Unit] = js.native
    
    def isNotFalse(`val`: PromiseLike[Any]): PromiseLike[Unit] = js.native
    def isNotFalse(`val`: PromiseLike[Any], msg: String): PromiseLike[Unit] = js.native
    
    def isNotFrozen(obj: PromiseLike[js.Object]): PromiseLike[Unit] = js.native
    def isNotFrozen(obj: PromiseLike[js.Object], msg: String): PromiseLike[Unit] = js.native
    
    def isNotFunction(`val`: PromiseLike[Any]): PromiseLike[Unit] = js.native
    def isNotFunction(`val`: PromiseLike[Any], msg: String): PromiseLike[Unit] = js.native
    
    def isNotNaN(`val`: PromiseLike[Any]): PromiseLike[Unit] = js.native
    def isNotNaN(`val`: PromiseLike[Any], msg: String): PromiseLike[Unit] = js.native
    
    def isNotNull(`val`: PromiseLike[Any]): PromiseLike[Unit] = js.native
    def isNotNull(`val`: PromiseLike[Any], msg: String): PromiseLike[Unit] = js.native
    
    def isNotNumber(`val`: PromiseLike[Any]): PromiseLike[Unit] = js.native
    def isNotNumber(`val`: PromiseLike[Any], msg: String): PromiseLike[Unit] = js.native
    
    def isNotObject(`val`: PromiseLike[Any]): PromiseLike[Unit] = js.native
    def isNotObject(`val`: PromiseLike[Any], msg: String): PromiseLike[Unit] = js.native
    
    def isNotOk(`val`: PromiseLike[Any]): PromiseLike[Unit] = js.native
    def isNotOk(`val`: PromiseLike[Any], msg: String): PromiseLike[Unit] = js.native
    
    def isNotSealed(obj: PromiseLike[js.Object]): PromiseLike[Unit] = js.native
    def isNotSealed(obj: PromiseLike[js.Object], msg: String): PromiseLike[Unit] = js.native
    
    def isNotString(`val`: PromiseLike[Any]): PromiseLike[Unit] = js.native
    def isNotString(`val`: PromiseLike[Any], msg: String): PromiseLike[Unit] = js.native
    
    def isNotTrue(`val`: PromiseLike[Any]): PromiseLike[Unit] = js.native
    def isNotTrue(`val`: PromiseLike[Any], msg: String): PromiseLike[Unit] = js.native
    
    def isNull(`val`: PromiseLike[Any]): PromiseLike[Unit] = js.native
    def isNull(`val`: PromiseLike[Any], msg: String): PromiseLike[Unit] = js.native
    
    def isNumber(`val`: PromiseLike[Any]): PromiseLike[Unit] = js.native
    def isNumber(`val`: PromiseLike[Any], msg: String): PromiseLike[Unit] = js.native
    
    def isObject(`val`: PromiseLike[Any]): PromiseLike[Unit] = js.native
    def isObject(`val`: PromiseLike[Any], msg: String): PromiseLike[Unit] = js.native
    
    def isOk(`val`: PromiseLike[Any]): PromiseLike[Unit] = js.native
    def isOk(`val`: PromiseLike[Any], msg: String): PromiseLike[Unit] = js.native
    
    def isSealed(obj: PromiseLike[js.Object]): PromiseLike[Unit] = js.native
    def isSealed(obj: PromiseLike[js.Object], msg: String): PromiseLike[Unit] = js.native
    
    def isString(`val`: PromiseLike[Any]): PromiseLike[Unit] = js.native
    def isString(`val`: PromiseLike[Any], msg: String): PromiseLike[Unit] = js.native
    
    def isTrue(`val`: PromiseLike[Any]): PromiseLike[Unit] = js.native
    def isTrue(`val`: PromiseLike[Any], msg: String): PromiseLike[Unit] = js.native
    
    def isUndefined(`val`: PromiseLike[Any]): PromiseLike[Unit] = js.native
    def isUndefined(`val`: PromiseLike[Any], msg: String): PromiseLike[Unit] = js.native
    
    def lengthOf(exp: PromiseLike[Any], len: Double): PromiseLike[Unit] = js.native
    def lengthOf(exp: PromiseLike[Any], len: Double, msg: String): PromiseLike[Unit] = js.native
    
    def `match`(exp: PromiseLike[Any], re: js.RegExp): PromiseLike[Unit] = js.native
    def `match`(exp: PromiseLike[Any], re: js.RegExp, msg: String): PromiseLike[Unit] = js.native
    
    def nestedInclude(exp: PromiseLike[js.Object], inc: js.Object): PromiseLike[Unit] = js.native
    def nestedInclude(exp: PromiseLike[js.Object], inc: js.Object, msg: String): PromiseLike[Unit] = js.native
    
    def nestedProperty(obj: PromiseLike[js.Object], prop: String): PromiseLike[Unit] = js.native
    def nestedProperty(obj: PromiseLike[js.Object], prop: String, msg: String): PromiseLike[Unit] = js.native
    
    def nestedPropertyVal(obj: PromiseLike[js.Object], prop: String, `val`: Any): PromiseLike[Unit] = js.native
    def nestedPropertyVal(obj: PromiseLike[js.Object], prop: String, `val`: Any, msg: String): PromiseLike[Unit] = js.native
    
    def notDeepEqual(act: PromiseLike[Any], exp: Any): PromiseLike[Unit] = js.native
    def notDeepEqual(act: PromiseLike[Any], exp: Any, msg: String): PromiseLike[Unit] = js.native
    
    def notDeepInclude(exp: PromiseLike[js.Array[Any] | String], inc: Any): PromiseLike[Unit] = js.native
    def notDeepInclude(exp: PromiseLike[js.Array[Any] | String], inc: Any, msg: String): PromiseLike[Unit] = js.native
    
    def notDeepNestedInclude(exp: PromiseLike[js.Object], inc: js.Object): PromiseLike[Unit] = js.native
    def notDeepNestedInclude(exp: PromiseLike[js.Object], inc: js.Object, msg: String): PromiseLike[Unit] = js.native
    
    def notDeepNestedPropertyVal(obj: PromiseLike[js.Object], prop: String, `val`: Any): PromiseLike[Unit] = js.native
    def notDeepNestedPropertyVal(obj: PromiseLike[js.Object], prop: String, `val`: Any, msg: String): PromiseLike[Unit] = js.native
    
    def notDeepOwnInclude(exp: PromiseLike[js.Object], inc: js.Object): PromiseLike[Unit] = js.native
    def notDeepOwnInclude(exp: PromiseLike[js.Object], inc: js.Object, msg: String): PromiseLike[Unit] = js.native
    
    def notDeepProperty(obj: PromiseLike[js.Object], prop: String): PromiseLike[Unit] = js.native
    def notDeepProperty(obj: PromiseLike[js.Object], prop: String, msg: String): PromiseLike[Unit] = js.native
    
    def notEqual(act: PromiseLike[Any], exp: Any): PromiseLike[Unit] = js.native
    def notEqual(act: PromiseLike[Any], exp: Any, msg: String): PromiseLike[Unit] = js.native
    
    def notExists(`val`: PromiseLike[Any]): PromiseLike[Unit] = js.native
    def notExists(`val`: PromiseLike[Any], msg: String): PromiseLike[Unit] = js.native
    
    def notFrozen(obj: PromiseLike[js.Object]): PromiseLike[Unit] = js.native
    def notFrozen(obj: PromiseLike[js.Object], msg: String): PromiseLike[Unit] = js.native
    
    def notInclude(exp: PromiseLike[js.Array[Any] | String], inc: Any): PromiseLike[Unit] = js.native
    def notInclude(exp: PromiseLike[js.Array[Any] | String], inc: Any, msg: String): PromiseLike[Unit] = js.native
    
    def notIncludeDeepOrderedMembers(set1: PromiseLike[js.Array[Any]], set2: js.Array[Any]): PromiseLike[Unit] = js.native
    def notIncludeDeepOrderedMembers(set1: PromiseLike[js.Array[Any]], set2: js.Array[Any], msg: String): PromiseLike[Unit] = js.native
    
    def notIncludeOrderedMembers(set1: PromiseLike[js.Array[Any]], set2: js.Array[Any]): PromiseLike[Unit] = js.native
    def notIncludeOrderedMembers(set1: PromiseLike[js.Array[Any]], set2: js.Array[Any], msg: String): PromiseLike[Unit] = js.native
    
    def notInstanceOf(`val`: PromiseLike[Any], `type`: js.Function): PromiseLike[Unit] = js.native
    def notInstanceOf(`val`: PromiseLike[Any], `type`: js.Function, msg: String): PromiseLike[Unit] = js.native
    
    def notMatch(exp: PromiseLike[Any], re: js.RegExp): PromiseLike[Unit] = js.native
    def notMatch(exp: PromiseLike[Any], re: js.RegExp, msg: String): PromiseLike[Unit] = js.native
    
    def notNestedInclude(exp: PromiseLike[js.Object], inc: js.Object): PromiseLike[Unit] = js.native
    def notNestedInclude(exp: PromiseLike[js.Object], inc: js.Object, msg: String): PromiseLike[Unit] = js.native
    
    def notNestedProperty(obj: PromiseLike[js.Object], prop: String): PromiseLike[Unit] = js.native
    def notNestedProperty(obj: PromiseLike[js.Object], prop: String, msg: String): PromiseLike[Unit] = js.native
    
    def notNestedPropertyVal(obj: PromiseLike[js.Object], prop: String, `val`: Any): PromiseLike[Unit] = js.native
    def notNestedPropertyVal(obj: PromiseLike[js.Object], prop: String, `val`: Any, msg: String): PromiseLike[Unit] = js.native
    
    def notOk(`val`: PromiseLike[Any]): PromiseLike[Unit] = js.native
    def notOk(`val`: PromiseLike[Any], msg: String): PromiseLike[Unit] = js.native
    
    def notOwnInclude(exp: PromiseLike[js.Object], inc: js.Object): PromiseLike[Unit] = js.native
    def notOwnInclude(exp: PromiseLike[js.Object], inc: js.Object, msg: String): PromiseLike[Unit] = js.native
    
    def notProperty(obj: PromiseLike[js.Object], prop: String): PromiseLike[Unit] = js.native
    def notProperty(obj: PromiseLike[js.Object], prop: String, msg: String): PromiseLike[Unit] = js.native
    
    def notSameDeepOrderedMembers(set1: PromiseLike[js.Array[Any]], set2: js.Array[Any]): PromiseLike[Unit] = js.native
    def notSameDeepOrderedMembers(set1: PromiseLike[js.Array[Any]], set2: js.Array[Any], msg: String): PromiseLike[Unit] = js.native
    
    def notSameOrderedMembers(set1: PromiseLike[js.Array[Any]], set2: js.Array[Any]): PromiseLike[Unit] = js.native
    def notSameOrderedMembers(set1: PromiseLike[js.Array[Any]], set2: js.Array[Any], msg: String): PromiseLike[Unit] = js.native
    
    def notSealed(obj: PromiseLike[js.Object]): PromiseLike[Unit] = js.native
    def notSealed(obj: PromiseLike[js.Object], msg: String): PromiseLike[Unit] = js.native
    
    def notStrictEqual(act: PromiseLike[Any], exp: Any): PromiseLike[Unit] = js.native
    def notStrictEqual(act: PromiseLike[Any], exp: Any, msg: String): PromiseLike[Unit] = js.native
    
    def notTypeOf(`val`: PromiseLike[Any], `type`: String): PromiseLike[Unit] = js.native
    def notTypeOf(`val`: PromiseLike[Any], `type`: String, msg: String): PromiseLike[Unit] = js.native
    
    def ok(`val`: PromiseLike[Any]): PromiseLike[Unit] = js.native
    def ok(`val`: PromiseLike[Any], msg: String): PromiseLike[Unit] = js.native
    
    def oneOf(`val`: PromiseLike[Any], list: js.Array[Any]): PromiseLike[Unit] = js.native
    def oneOf(`val`: PromiseLike[Any], list: js.Array[Any], msg: String): PromiseLike[Unit] = js.native
    
    def operator(`val`: PromiseLike[Any], operator: String, val2: Any): PromiseLike[Unit] = js.native
    def operator(`val`: PromiseLike[Any], operator: String, val2: Any, msg: String): PromiseLike[Unit] = js.native
    
    def ownInclude(exp: PromiseLike[js.Object], inc: js.Object): PromiseLike[Unit] = js.native
    def ownInclude(exp: PromiseLike[js.Object], inc: js.Object, msg: String): PromiseLike[Unit] = js.native
    
    def property(obj: PromiseLike[js.Object], prop: String): PromiseLike[Unit] = js.native
    def property(obj: PromiseLike[js.Object], prop: String, msg: String): PromiseLike[Unit] = js.native
    
    def propertyNotVal(obj: PromiseLike[js.Object], prop: String, `val`: Any): PromiseLike[Unit] = js.native
    def propertyNotVal(obj: PromiseLike[js.Object], prop: String, `val`: Any, msg: String): PromiseLike[Unit] = js.native
    
    def propertyVal(obj: PromiseLike[js.Object], prop: String, `val`: Any): PromiseLike[Unit] = js.native
    def propertyVal(obj: PromiseLike[js.Object], prop: String, `val`: Any, msg: String): PromiseLike[Unit] = js.native
    
    def sameDeepMembers(set1: PromiseLike[js.Array[Any]], set2: js.Array[Any]): PromiseLike[Unit] = js.native
    def sameDeepMembers(set1: PromiseLike[js.Array[Any]], set2: js.Array[Any], msg: String): PromiseLike[Unit] = js.native
    
    def sameDeepOrderedMembers(set1: PromiseLike[js.Array[Any]], set2: js.Array[Any]): PromiseLike[Unit] = js.native
    def sameDeepOrderedMembers(set1: PromiseLike[js.Array[Any]], set2: js.Array[Any], msg: String): PromiseLike[Unit] = js.native
    
    def sameMembers(set1: PromiseLike[js.Array[Any]], set2: js.Array[Any]): PromiseLike[Unit] = js.native
    def sameMembers(set1: PromiseLike[js.Array[Any]], set2: js.Array[Any], msg: String): PromiseLike[Unit] = js.native
    
    def sameOrderedMembers(set1: PromiseLike[js.Array[Any]], set2: js.Array[Any]): PromiseLike[Unit] = js.native
    def sameOrderedMembers(set1: PromiseLike[js.Array[Any]], set2: js.Array[Any], msg: String): PromiseLike[Unit] = js.native
    
    def `sealed`(obj: PromiseLike[js.Object]): PromiseLike[Unit] = js.native
    def `sealed`(obj: PromiseLike[js.Object], msg: String): PromiseLike[Unit] = js.native
    
    def strictEqual(act: PromiseLike[Any], exp: Any): PromiseLike[Unit] = js.native
    def strictEqual(act: PromiseLike[Any], exp: Any, msg: String): PromiseLike[Unit] = js.native
    
    //alias frenzy
    def `throw`(fn: js.Function): PromiseLike[Unit] = js.native
    def `throw`(fn: js.Function, errType: js.Function): PromiseLike[Unit] = js.native
    def `throw`(fn: js.Function, errType: js.Function, msg: String): PromiseLike[Unit] = js.native
    def `throw`(fn: js.Function, errType: js.Function, regExp: js.RegExp): PromiseLike[Unit] = js.native
    def `throw`(fn: js.Function, msg: String): PromiseLike[Unit] = js.native
    def `throw`(fn: js.Function, regExp: js.RegExp): PromiseLike[Unit] = js.native
    
    def throws(fn: js.Function): PromiseLike[Unit] = js.native
    def throws(fn: js.Function, errType: js.Function): PromiseLike[Unit] = js.native
    def throws(fn: js.Function, errType: js.Function, msg: String): PromiseLike[Unit] = js.native
    def throws(fn: js.Function, errType: js.Function, regExp: js.RegExp): PromiseLike[Unit] = js.native
    def throws(fn: js.Function, msg: String): PromiseLike[Unit] = js.native
    def throws(fn: js.Function, regExp: js.RegExp): PromiseLike[Unit] = js.native
    
    def typeOf(`val`: PromiseLike[Any], `type`: String): PromiseLike[Unit] = js.native
    def typeOf(`val`: PromiseLike[Any], `type`: String, msg: String): PromiseLike[Unit] = js.native
  }
  
  @js.native
  trait PromisedAssertion
    extends StObject
       with Eventually
       with PromiseLike[Any]
  
  type PromisedCloseTo = js.Function3[
    /* expected */ Double, 
    /* delta */ Double, 
    /* message */ js.UndefOr[String], 
    PromisedAssertion
  ]
  
  trait PromisedDeep extends StObject {
    
    def eq(value: Any, message: String): PromisedAssertion
    @JSName("eq")
    var eq_Original: PromisedEqual
    
    def equal(value: Any): PromisedAssertion
    def equal(value: Any, message: String): PromisedAssertion
    @JSName("equal")
    var equal_Original: PromisedEqual
    
    def equals(value: Any, message: String): PromisedAssertion
    @JSName("equals")
    var equals_Original: PromisedEqual
    
    def include(value: String): PromisedAssertion
    def include(value: String, message: String): PromisedAssertion
    def include(value: js.Object): PromisedAssertion
    def include(value: js.Object, message: String): PromisedAssertion
    def include(value: Double): PromisedAssertion
    def include(value: Double, message: String): PromisedAssertion
    @JSName("include")
    var include_Original: PromisedInclude
    
    def members(set: js.Array[Any]): PromisedAssertion
    def members(set: js.Array[Any], message: String): PromisedAssertion
    @JSName("members")
    var members_Original: PromisedMembers
    
    var ordered: PromisedOrdered
    
    def property(name: String): PromisedAssertion
    def property(name: String, value: Any): PromisedAssertion
    def property(name: String, value: Any, message: String): PromisedAssertion
    def property(name: String, value: Unit, message: String): PromisedAssertion
    def property(name: js.Symbol): PromisedAssertion
    def property(name: js.Symbol, value: Any): PromisedAssertion
    def property(name: js.Symbol, value: Any, message: String): PromisedAssertion
    def property(name: js.Symbol, value: Unit, message: String): PromisedAssertion
    @JSName("property")
    var property_Original: PromisedProperty
  }
  object PromisedDeep {
    
    inline def apply(
      eq_ : (/* value */ Any, /* message */ js.UndefOr[String]) => PromisedAssertion,
      equal: (/* value */ Any, /* message */ js.UndefOr[String]) => PromisedAssertion,
      equals_ : (/* value */ Any, /* message */ js.UndefOr[String]) => PromisedAssertion,
      include: PromisedInclude,
      members: (/* set */ js.Array[Any], /* message */ js.UndefOr[String]) => PromisedAssertion,
      ordered: PromisedOrdered,
      property: (/* name */ String | js.Symbol, /* value */ js.UndefOr[Any], /* message */ js.UndefOr[String]) => PromisedAssertion
    ): PromisedDeep = {
      val __obj = js.Dynamic.literal(equal = js.Any.fromFunction2(equal), include = include.asInstanceOf[js.Any], members = js.Any.fromFunction2(members), ordered = ordered.asInstanceOf[js.Any], property = js.Any.fromFunction3(property))
      __obj.updateDynamic("eq")(js.Any.fromFunction2(eq_))
      __obj.updateDynamic("equals")(js.Any.fromFunction2(equals_))
      __obj.asInstanceOf[PromisedDeep]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PromisedDeep] (val x: Self) extends AnyVal {
      
      inline def setEq_(value: (/* value */ Any, /* message */ js.UndefOr[String]) => PromisedAssertion): Self = StObject.set(x, "eq", js.Any.fromFunction2(value))
      
      inline def setEqual(value: (/* value */ Any, /* message */ js.UndefOr[String]) => PromisedAssertion): Self = StObject.set(x, "equal", js.Any.fromFunction2(value))
      
      inline def setEquals_(value: (/* value */ Any, /* message */ js.UndefOr[String]) => PromisedAssertion): Self = StObject.set(x, "equals", js.Any.fromFunction2(value))
      
      inline def setInclude(value: PromisedInclude): Self = StObject.set(x, "include", value.asInstanceOf[js.Any])
      
      inline def setMembers(value: (/* set */ js.Array[Any], /* message */ js.UndefOr[String]) => PromisedAssertion): Self = StObject.set(x, "members", js.Any.fromFunction2(value))
      
      inline def setOrdered(value: PromisedOrdered): Self = StObject.set(x, "ordered", value.asInstanceOf[js.Any])
      
      inline def setProperty(
        value: (/* name */ String | js.Symbol, /* value */ js.UndefOr[Any], /* message */ js.UndefOr[String]) => PromisedAssertion
      ): Self = StObject.set(x, "property", js.Any.fromFunction3(value))
    }
  }
  
  type PromisedEqual = js.Function2[/* value */ Any, /* message */ js.UndefOr[String], PromisedAssertion]
  
  @js.native
  trait PromisedInclude extends StObject {
    
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
    def keys(keys: js.Array[Any]): PromisedAssertion = js.native
    def keys(keys: js.Object): PromisedAssertion = js.native
    @JSName("keys")
    var keys_Original: PromisedKeys = js.native
    
    def members(set: js.Array[Any]): PromisedAssertion = js.native
    def members(set: js.Array[Any], message: String): PromisedAssertion = js.native
    @JSName("members")
    var members_Original: PromisedMembers = js.native
    
    var ordered: PromisedOrdered = js.native
  }
  
  type PromisedInstanceOf = js.Function2[/* constructor */ js.Object, /* message */ js.UndefOr[String], PromisedAssertion]
  
  trait PromisedKeyFilter extends StObject {
    
    def keys(keys: String*): PromisedAssertion
    def keys(keys: js.Array[Any]): PromisedAssertion
    def keys(keys: js.Object): PromisedAssertion
    @JSName("keys")
    var keys_Original: PromisedKeys
  }
  object PromisedKeyFilter {
    
    inline def apply(keys: PromisedKeys): PromisedKeyFilter = {
      val __obj = js.Dynamic.literal(keys = keys.asInstanceOf[js.Any])
      __obj.asInstanceOf[PromisedKeyFilter]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PromisedKeyFilter] (val x: Self) extends AnyVal {
      
      inline def setKeys(value: PromisedKeys): Self = StObject.set(x, "keys", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait PromisedKeys extends StObject {
    
    def apply(keys: String*): PromisedAssertion = js.native
    def apply(keys: js.Array[Any]): PromisedAssertion = js.native
    def apply(keys: js.Object): PromisedAssertion = js.native
  }
  
  trait PromisedLanguageChains extends StObject {
    
    def and(`type`: String): PromisedAssertion
    def and(`type`: String, message: String): PromisedAssertion
    @JSName("and")
    var and_Original: PromisedAssertion
    
    def at(`type`: String): PromisedAssertion
    def at(`type`: String, message: String): PromisedAssertion
    @JSName("at")
    var at_Original: PromisedAssertion
    
    def be(`type`: String): PromisedAssertion
    def be(`type`: String, message: String): PromisedAssertion
    @JSName("be")
    var be_Original: PromisedAssertion
    
    def been(`type`: String): PromisedAssertion
    def been(`type`: String, message: String): PromisedAssertion
    @JSName("been")
    var been_Original: PromisedAssertion
    
    def but(`type`: String): PromisedAssertion
    def but(`type`: String, message: String): PromisedAssertion
    @JSName("but")
    var but_Original: PromisedAssertion
    
    def does(`type`: String): PromisedAssertion
    def does(`type`: String, message: String): PromisedAssertion
    @JSName("does")
    var does_Original: PromisedAssertion
    
    def eventually(`type`: String): PromisedAssertion
    def eventually(`type`: String, message: String): PromisedAssertion
    @JSName("eventually")
    var eventually_Original: Eventually
    
    def has(`type`: String): PromisedAssertion
    def has(`type`: String, message: String): PromisedAssertion
    @JSName("has")
    var has_Original: PromisedAssertion
    
    def have(`type`: String): PromisedAssertion
    def have(`type`: String, message: String): PromisedAssertion
    @JSName("have")
    var have_Original: PromisedAssertion
    
    def is(`type`: String): PromisedAssertion
    def is(`type`: String, message: String): PromisedAssertion
    @JSName("is")
    var is_Original: PromisedAssertion
    
    def of(`type`: String): PromisedAssertion
    def of(`type`: String, message: String): PromisedAssertion
    @JSName("of")
    var of_Original: PromisedAssertion
    
    def same(`type`: String): PromisedAssertion
    def same(`type`: String, message: String): PromisedAssertion
    @JSName("same")
    var same_Original: PromisedAssertion
    
    def that(`type`: String): PromisedAssertion
    def that(`type`: String, message: String): PromisedAssertion
    @JSName("that")
    var that_Original: PromisedAssertion
    
    // From chai
    def to(`type`: String): PromisedAssertion
    def to(`type`: String, message: String): PromisedAssertion
    // From chai
    @JSName("to")
    var to_Original: PromisedAssertion
    
    def which(`type`: String): PromisedAssertion
    def which(`type`: String, message: String): PromisedAssertion
    @JSName("which")
    var which_Original: PromisedAssertion
    
    def `with`(`type`: String): PromisedAssertion
    def `with`(`type`: String, message: String): PromisedAssertion
    @JSName("with")
    var with_Original: PromisedAssertion
  }
  object PromisedLanguageChains {
    
    inline def apply(
      and: PromisedAssertion,
      at: PromisedAssertion,
      be: PromisedAssertion,
      been: PromisedAssertion,
      but: PromisedAssertion,
      does: PromisedAssertion,
      eventually: Eventually,
      has: PromisedAssertion,
      have: PromisedAssertion,
      is: PromisedAssertion,
      of: PromisedAssertion,
      same: PromisedAssertion,
      that: PromisedAssertion,
      to: PromisedAssertion,
      which: PromisedAssertion,
      `with`: PromisedAssertion
    ): PromisedLanguageChains = {
      val __obj = js.Dynamic.literal(and = and.asInstanceOf[js.Any], at = at.asInstanceOf[js.Any], be = be.asInstanceOf[js.Any], been = been.asInstanceOf[js.Any], but = but.asInstanceOf[js.Any], does = does.asInstanceOf[js.Any], eventually = eventually.asInstanceOf[js.Any], has = has.asInstanceOf[js.Any], have = have.asInstanceOf[js.Any], is = is.asInstanceOf[js.Any], of = of.asInstanceOf[js.Any], same = same.asInstanceOf[js.Any], that = that.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any], which = which.asInstanceOf[js.Any])
      __obj.updateDynamic("with")(`with`.asInstanceOf[js.Any])
      __obj.asInstanceOf[PromisedLanguageChains]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PromisedLanguageChains] (val x: Self) extends AnyVal {
      
      inline def setAnd(value: PromisedAssertion): Self = StObject.set(x, "and", value.asInstanceOf[js.Any])
      
      inline def setAt(value: PromisedAssertion): Self = StObject.set(x, "at", value.asInstanceOf[js.Any])
      
      inline def setBe(value: PromisedAssertion): Self = StObject.set(x, "be", value.asInstanceOf[js.Any])
      
      inline def setBeen(value: PromisedAssertion): Self = StObject.set(x, "been", value.asInstanceOf[js.Any])
      
      inline def setBut(value: PromisedAssertion): Self = StObject.set(x, "but", value.asInstanceOf[js.Any])
      
      inline def setDoes(value: PromisedAssertion): Self = StObject.set(x, "does", value.asInstanceOf[js.Any])
      
      inline def setEventually(value: Eventually): Self = StObject.set(x, "eventually", value.asInstanceOf[js.Any])
      
      inline def setHas(value: PromisedAssertion): Self = StObject.set(x, "has", value.asInstanceOf[js.Any])
      
      inline def setHave(value: PromisedAssertion): Self = StObject.set(x, "have", value.asInstanceOf[js.Any])
      
      inline def setIs(value: PromisedAssertion): Self = StObject.set(x, "is", value.asInstanceOf[js.Any])
      
      inline def setOf(value: PromisedAssertion): Self = StObject.set(x, "of", value.asInstanceOf[js.Any])
      
      inline def setSame(value: PromisedAssertion): Self = StObject.set(x, "same", value.asInstanceOf[js.Any])
      
      inline def setThat(value: PromisedAssertion): Self = StObject.set(x, "that", value.asInstanceOf[js.Any])
      
      inline def setTo(value: PromisedAssertion): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
      
      inline def setWhich(value: PromisedAssertion): Self = StObject.set(x, "which", value.asInstanceOf[js.Any])
      
      inline def setWith(value: PromisedAssertion): Self = StObject.set(x, "with", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait PromisedLength
    extends StObject
       with PromisedLanguageChains
       with PromisedNumericComparison {
    
    def apply(length: Double): PromisedAssertion = js.native
    def apply(length: Double, message: String): PromisedAssertion = js.native
  }
  
  type PromisedMatch = js.Function2[/* regexp */ js.RegExp | String, /* message */ js.UndefOr[String], PromisedAssertion]
  
  type PromisedMembers = js.Function2[/* set */ js.Array[Any], /* message */ js.UndefOr[String], PromisedAssertion]
  
  trait PromisedNested extends StObject {
    
    def include(value: String): PromisedAssertion
    def include(value: String, message: String): PromisedAssertion
    def include(value: js.Object): PromisedAssertion
    def include(value: js.Object, message: String): PromisedAssertion
    def include(value: Double): PromisedAssertion
    def include(value: Double, message: String): PromisedAssertion
    @JSName("include")
    var include_Original: PromisedInclude
    
    def members(set: js.Array[Any]): PromisedAssertion
    def members(set: js.Array[Any], message: String): PromisedAssertion
    @JSName("members")
    var members_Original: PromisedMembers
    
    def property(name: String): PromisedAssertion
    def property(name: String, value: Any): PromisedAssertion
    def property(name: String, value: Any, message: String): PromisedAssertion
    def property(name: String, value: Unit, message: String): PromisedAssertion
    def property(name: js.Symbol): PromisedAssertion
    def property(name: js.Symbol, value: Any): PromisedAssertion
    def property(name: js.Symbol, value: Any, message: String): PromisedAssertion
    def property(name: js.Symbol, value: Unit, message: String): PromisedAssertion
    @JSName("property")
    var property_Original: PromisedProperty
  }
  object PromisedNested {
    
    inline def apply(
      include: PromisedInclude,
      members: (/* set */ js.Array[Any], /* message */ js.UndefOr[String]) => PromisedAssertion,
      property: (/* name */ String | js.Symbol, /* value */ js.UndefOr[Any], /* message */ js.UndefOr[String]) => PromisedAssertion
    ): PromisedNested = {
      val __obj = js.Dynamic.literal(include = include.asInstanceOf[js.Any], members = js.Any.fromFunction2(members), property = js.Any.fromFunction3(property))
      __obj.asInstanceOf[PromisedNested]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PromisedNested] (val x: Self) extends AnyVal {
      
      inline def setInclude(value: PromisedInclude): Self = StObject.set(x, "include", value.asInstanceOf[js.Any])
      
      inline def setMembers(value: (/* set */ js.Array[Any], /* message */ js.UndefOr[String]) => PromisedAssertion): Self = StObject.set(x, "members", js.Any.fromFunction2(value))
      
      inline def setProperty(
        value: (/* name */ String | js.Symbol, /* value */ js.UndefOr[Any], /* message */ js.UndefOr[String]) => PromisedAssertion
      ): Self = StObject.set(x, "property", js.Any.fromFunction3(value))
    }
  }
  
  type PromisedNumberComparer = js.Function2[/* value */ Double, /* message */ js.UndefOr[String], PromisedAssertion]
  
  @js.native
  trait PromisedNumericComparison extends StObject {
    
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
  
  trait PromisedOrdered extends StObject {
    
    def members(set: js.Array[Any]): PromisedAssertion
    def members(set: js.Array[Any], message: String): PromisedAssertion
    @JSName("members")
    var members_Original: PromisedMembers
  }
  object PromisedOrdered {
    
    inline def apply(members: (/* set */ js.Array[Any], /* message */ js.UndefOr[String]) => PromisedAssertion): PromisedOrdered = {
      val __obj = js.Dynamic.literal(members = js.Any.fromFunction2(members))
      __obj.asInstanceOf[PromisedOrdered]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PromisedOrdered] (val x: Self) extends AnyVal {
      
      inline def setMembers(value: (/* set */ js.Array[Any], /* message */ js.UndefOr[String]) => PromisedAssertion): Self = StObject.set(x, "members", js.Any.fromFunction2(value))
    }
  }
  
  type PromisedOwnProperty = js.Function2[/* name */ String | js.Symbol, /* message */ js.UndefOr[String], PromisedAssertion]
  
  @js.native
  trait PromisedOwnPropertyDescriptor extends StObject {
    
    def apply(name: String): PromisedAssertion = js.native
    def apply(name: String, descriptor: js.PropertyDescriptor): PromisedAssertion = js.native
    def apply(name: String, descriptor: js.PropertyDescriptor, message: String): PromisedAssertion = js.native
    def apply(name: String, message: String): PromisedAssertion = js.native
    def apply(name: js.Symbol): PromisedAssertion = js.native
    def apply(name: js.Symbol, descriptor: js.PropertyDescriptor): PromisedAssertion = js.native
    def apply(name: js.Symbol, descriptor: js.PropertyDescriptor, message: String): PromisedAssertion = js.native
    def apply(name: js.Symbol, message: String): PromisedAssertion = js.native
  }
  
  type PromisedProperty = js.Function3[
    /* name */ String | js.Symbol, 
    /* value */ js.UndefOr[Any], 
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
  
  @js.native
  trait PromisedThrow extends StObject {
    
    def apply(): PromisedAssertion = js.native
    def apply(constructor: js.Error): PromisedAssertion = js.native
    def apply(constructor: js.Error, expected: String): PromisedAssertion = js.native
    def apply(constructor: js.Error, expected: String, message: String): PromisedAssertion = js.native
    def apply(constructor: js.Error, expected: js.RegExp): PromisedAssertion = js.native
    def apply(constructor: js.Error, expected: js.RegExp, message: String): PromisedAssertion = js.native
    def apply(constructor: js.Error, expected: Unit, message: String): PromisedAssertion = js.native
    def apply(constructor: js.Function): PromisedAssertion = js.native
    def apply(constructor: js.Function, expected: String): PromisedAssertion = js.native
    def apply(constructor: js.Function, expected: String, message: String): PromisedAssertion = js.native
    def apply(constructor: js.Function, expected: js.RegExp): PromisedAssertion = js.native
    def apply(constructor: js.Function, expected: js.RegExp, message: String): PromisedAssertion = js.native
    def apply(constructor: js.Function, expected: Unit, message: String): PromisedAssertion = js.native
    def apply(expected: String): PromisedAssertion = js.native
    def apply(expected: String, message: String): PromisedAssertion = js.native
    def apply(expected: js.RegExp): PromisedAssertion = js.native
    def apply(expected: js.RegExp, message: String): PromisedAssertion = js.native
  }
  
  @js.native
  trait PromisedTypeComparison extends StObject {
    
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
}
