package typings.chaiAsPromised

import typings.chai.Chai.LanguageChains
import typings.chai.Chai.NumericComparison
import typings.chai.Chai.TypeComparison
import typings.std.Error
import typings.std.PromiseLike
import typings.std.PropertyDescriptor
import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Chai {
  
  // For Assert API
  @js.native
  trait Assert extends StObject {
    
    def becomes(promise: js.Thenable[js.Any], expected: js.Any): js.Thenable[Unit] = js.native
    def becomes(promise: js.Thenable[js.Any], expected: js.Any, message: String): js.Thenable[Unit] = js.native
    
    def doesNotBecome(promise: js.Thenable[js.Any], expected: js.Any): js.Thenable[Unit] = js.native
    def doesNotBecome(promise: js.Thenable[js.Any], expected: js.Any, message: String): js.Thenable[Unit] = js.native
    
    var eventually: PromisedAssert = js.native
    
    def isFulfilled(promise: js.Thenable[js.Any]): js.Thenable[Unit] = js.native
    def isFulfilled(promise: js.Thenable[js.Any], message: String): js.Thenable[Unit] = js.native
    
    def isRejected(promise: js.Thenable[js.Any]): js.Thenable[Unit] = js.native
    def isRejected(promise: js.Thenable[js.Any], expected: js.Any): js.Thenable[Unit] = js.native
    def isRejected(promise: js.Thenable[js.Any], expected: js.Any, message: String): js.Thenable[Unit] = js.native
    def isRejected(promise: js.Thenable[js.Any], `match`: RegExp): js.Thenable[Unit] = js.native
    def isRejected(promise: js.Thenable[js.Any], `match`: RegExp, message: String): js.Thenable[Unit] = js.native
    def isRejected(promise: js.Thenable[js.Any], message: String): js.Thenable[Unit] = js.native
    
    def notify(fn: js.Function): js.Thenable[Unit] = js.native
  }
  
  // For BDD API
  @js.native
  trait Assertion
    extends StObject
       with LanguageChains
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
    def rejectedWith(constructor: js.Function, expected: String): PromisedAssertion = js.native
    def rejectedWith(constructor: js.Function, expected: String, message: String): PromisedAssertion = js.native
    def rejectedWith(constructor: js.Function, expected: Unit, message: String): PromisedAssertion = js.native
    def rejectedWith(constructor: js.Function, expected: RegExp): PromisedAssertion = js.native
    def rejectedWith(constructor: js.Function, expected: RegExp, message: String): PromisedAssertion = js.native
    def rejectedWith(constructor: Error): PromisedAssertion = js.native
    def rejectedWith(constructor: Error, expected: String): PromisedAssertion = js.native
    def rejectedWith(constructor: Error, expected: String, message: String): PromisedAssertion = js.native
    def rejectedWith(constructor: Error, expected: Unit, message: String): PromisedAssertion = js.native
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
    def Throw(constructor: js.Function): PromisedAssertion = js.native
    def Throw(constructor: js.Function, expected: String): PromisedAssertion = js.native
    def Throw(constructor: js.Function, expected: String, message: String): PromisedAssertion = js.native
    def Throw(constructor: js.Function, expected: Unit, message: String): PromisedAssertion = js.native
    def Throw(constructor: js.Function, expected: RegExp): PromisedAssertion = js.native
    def Throw(constructor: js.Function, expected: RegExp, message: String): PromisedAssertion = js.native
    def Throw(constructor: Error): PromisedAssertion = js.native
    def Throw(constructor: Error, expected: String): PromisedAssertion = js.native
    def Throw(constructor: Error, expected: String, message: String): PromisedAssertion = js.native
    def Throw(constructor: Error, expected: Unit, message: String): PromisedAssertion = js.native
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
    def keys(keys: js.Array[js.Any]): PromisedAssertion = js.native
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
    
    def members(set: js.Array[js.Any]): PromisedAssertion = js.native
    def members(set: js.Array[js.Any], message: String): PromisedAssertion = js.native
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
    
    def oneOf(list: js.Array[js.Any]): PromisedAssertion = js.native
    def oneOf(list: js.Array[js.Any], message: String): PromisedAssertion = js.native
    
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
    def property(name: String, value: js.Any): PromisedAssertion = js.native
    def property(name: String, value: js.Any, message: String): PromisedAssertion = js.native
    def property(name: String, value: Unit, message: String): PromisedAssertion = js.native
    @JSName("property")
    var property_Original: PromisedProperty = js.native
    
    def rejected(`type`: String): PromisedAssertion = js.native
    def rejected(`type`: String, message: String): PromisedAssertion = js.native
    
    def rejectedWith(): PromisedAssertion = js.native
    def rejectedWith(constructor: js.Function): PromisedAssertion = js.native
    def rejectedWith(constructor: js.Function, expected: String): PromisedAssertion = js.native
    def rejectedWith(constructor: js.Function, expected: String, message: String): PromisedAssertion = js.native
    def rejectedWith(constructor: js.Function, expected: Unit, message: String): PromisedAssertion = js.native
    def rejectedWith(constructor: js.Function, expected: RegExp): PromisedAssertion = js.native
    def rejectedWith(constructor: js.Function, expected: RegExp, message: String): PromisedAssertion = js.native
    def rejectedWith(constructor: Error): PromisedAssertion = js.native
    def rejectedWith(constructor: Error, expected: String): PromisedAssertion = js.native
    def rejectedWith(constructor: Error, expected: String, message: String): PromisedAssertion = js.native
    def rejectedWith(constructor: Error, expected: Unit, message: String): PromisedAssertion = js.native
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
    def `throw`(constructor: js.Function, expected: String): PromisedAssertion = js.native
    def `throw`(constructor: js.Function, expected: String, message: String): PromisedAssertion = js.native
    def `throw`(constructor: js.Function, expected: Unit, message: String): PromisedAssertion = js.native
    def `throw`(constructor: js.Function, expected: RegExp): PromisedAssertion = js.native
    def `throw`(constructor: js.Function, expected: RegExp, message: String): PromisedAssertion = js.native
    def `throw`(constructor: Error): PromisedAssertion = js.native
    def `throw`(constructor: Error, expected: String): PromisedAssertion = js.native
    def `throw`(constructor: Error, expected: String, message: String): PromisedAssertion = js.native
    def `throw`(constructor: Error, expected: Unit, message: String): PromisedAssertion = js.native
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
    def throws(constructor: js.Function, expected: String): PromisedAssertion = js.native
    def throws(constructor: js.Function, expected: String, message: String): PromisedAssertion = js.native
    def throws(constructor: js.Function, expected: Unit, message: String): PromisedAssertion = js.native
    def throws(constructor: js.Function, expected: RegExp): PromisedAssertion = js.native
    def throws(constructor: js.Function, expected: RegExp, message: String): PromisedAssertion = js.native
    def throws(constructor: Error): PromisedAssertion = js.native
    def throws(constructor: Error, expected: String): PromisedAssertion = js.native
    def throws(constructor: Error, expected: String, message: String): PromisedAssertion = js.native
    def throws(constructor: Error, expected: Unit, message: String): PromisedAssertion = js.native
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
  trait PromisedAssert extends StObject {
    
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
    
    def containsAllDeepKeys(obj: js.Any, keys: js.Array[js.Any]): js.Thenable[Unit] = js.native
    def containsAllDeepKeys(obj: js.Any, keys: js.Array[js.Any], msg: String): js.Thenable[Unit] = js.native
    def containsAllDeepKeys(obj: js.Any, keys: js.Object): js.Thenable[Unit] = js.native
    def containsAllDeepKeys(obj: js.Any, keys: js.Object, msg: String): js.Thenable[Unit] = js.native
    
    def containsAllKeys(obj: js.Any, keys: js.Array[js.Any]): js.Thenable[Unit] = js.native
    def containsAllKeys(obj: js.Any, keys: js.Array[js.Any], msg: String): js.Thenable[Unit] = js.native
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
    def deepInclude(exp: js.Array[js.Any], inc: js.Any): js.Thenable[Unit] = js.native
    def deepInclude(exp: js.Array[js.Any], inc: js.Any, msg: String): js.Thenable[Unit] = js.native
    
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
    
    def doesNotHaveAllDeepKeys(obj: js.Any, keys: js.Array[js.Any]): js.Thenable[Unit] = js.native
    def doesNotHaveAllDeepKeys(obj: js.Any, keys: js.Array[js.Any], msg: String): js.Thenable[Unit] = js.native
    def doesNotHaveAllDeepKeys(obj: js.Any, keys: js.Object): js.Thenable[Unit] = js.native
    def doesNotHaveAllDeepKeys(obj: js.Any, keys: js.Object, msg: String): js.Thenable[Unit] = js.native
    
    def doesNotHaveAllKeys(obj: js.Any, keys: js.Array[js.Any]): js.Thenable[Unit] = js.native
    def doesNotHaveAllKeys(obj: js.Any, keys: js.Array[js.Any], msg: String): js.Thenable[Unit] = js.native
    def doesNotHaveAllKeys(obj: js.Any, keys: js.Object): js.Thenable[Unit] = js.native
    def doesNotHaveAllKeys(obj: js.Any, keys: js.Object, msg: String): js.Thenable[Unit] = js.native
    
    def doesNotHaveAnyDeepKeys(obj: js.Any, keys: js.Array[js.Any]): js.Thenable[Unit] = js.native
    def doesNotHaveAnyDeepKeys(obj: js.Any, keys: js.Array[js.Any], msg: String): js.Thenable[Unit] = js.native
    def doesNotHaveAnyDeepKeys(obj: js.Any, keys: js.Object): js.Thenable[Unit] = js.native
    def doesNotHaveAnyDeepKeys(obj: js.Any, keys: js.Object, msg: String): js.Thenable[Unit] = js.native
    
    def doesNotHaveAnyKeys(obj: js.Any, keys: js.Array[js.Any]): js.Thenable[Unit] = js.native
    def doesNotHaveAnyKeys(obj: js.Any, keys: js.Array[js.Any], msg: String): js.Thenable[Unit] = js.native
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
    def fail(actual: js.Any): js.Thenable[Unit] = js.native
    def fail(actual: js.Any, expected: js.Any): js.Thenable[Unit] = js.native
    def fail(actual: js.Any, expected: js.Any, msg: String): js.Thenable[Unit] = js.native
    def fail(actual: js.Any, expected: js.Any, msg: String, operator: String): js.Thenable[Unit] = js.native
    def fail(actual: js.Any, expected: js.Any, msg: Unit, operator: String): js.Thenable[Unit] = js.native
    def fail(actual: js.Any, expected: Unit, msg: String): js.Thenable[Unit] = js.native
    def fail(actual: js.Any, expected: Unit, msg: String, operator: String): js.Thenable[Unit] = js.native
    def fail(actual: js.Any, expected: Unit, msg: Unit, operator: String): js.Thenable[Unit] = js.native
    def fail(actual: Unit, expected: js.Any): js.Thenable[Unit] = js.native
    def fail(actual: Unit, expected: js.Any, msg: String): js.Thenable[Unit] = js.native
    def fail(actual: Unit, expected: js.Any, msg: String, operator: String): js.Thenable[Unit] = js.native
    def fail(actual: Unit, expected: js.Any, msg: Unit, operator: String): js.Thenable[Unit] = js.native
    def fail(actual: Unit, expected: Unit, msg: String): js.Thenable[Unit] = js.native
    def fail(actual: Unit, expected: Unit, msg: String, operator: String): js.Thenable[Unit] = js.native
    def fail(actual: Unit, expected: Unit, msg: Unit, operator: String): js.Thenable[Unit] = js.native
    
    def frozen(obj: js.Object): js.Thenable[Unit] = js.native
    def frozen(obj: js.Object, msg: String): js.Thenable[Unit] = js.native
    
    def hasAllDeepKeys(obj: js.Any, keys: js.Array[js.Any]): js.Thenable[Unit] = js.native
    def hasAllDeepKeys(obj: js.Any, keys: js.Array[js.Any], msg: String): js.Thenable[Unit] = js.native
    def hasAllDeepKeys(obj: js.Any, keys: js.Object): js.Thenable[Unit] = js.native
    def hasAllDeepKeys(obj: js.Any, keys: js.Object, msg: String): js.Thenable[Unit] = js.native
    
    def hasAllKeys(obj: js.Any, keys: js.Array[js.Any]): js.Thenable[Unit] = js.native
    def hasAllKeys(obj: js.Any, keys: js.Array[js.Any], msg: String): js.Thenable[Unit] = js.native
    def hasAllKeys(obj: js.Any, keys: js.Object): js.Thenable[Unit] = js.native
    def hasAllKeys(obj: js.Any, keys: js.Object, msg: String): js.Thenable[Unit] = js.native
    
    def hasAnyDeepKeys(obj: js.Any, keys: js.Array[js.Any]): js.Thenable[Unit] = js.native
    def hasAnyDeepKeys(obj: js.Any, keys: js.Array[js.Any], msg: String): js.Thenable[Unit] = js.native
    def hasAnyDeepKeys(obj: js.Any, keys: js.Object): js.Thenable[Unit] = js.native
    def hasAnyDeepKeys(obj: js.Any, keys: js.Object, msg: String): js.Thenable[Unit] = js.native
    
    def hasAnyKeys(obj: js.Any, keys: js.Array[js.Any]): js.Thenable[Unit] = js.native
    def hasAnyKeys(obj: js.Any, keys: js.Array[js.Any], msg: String): js.Thenable[Unit] = js.native
    def hasAnyKeys(obj: js.Any, keys: js.Object): js.Thenable[Unit] = js.native
    def hasAnyKeys(obj: js.Any, keys: js.Object, msg: String): js.Thenable[Unit] = js.native
    
    def ifError(`val`: js.Any): js.Thenable[Unit] = js.native
    def ifError(`val`: js.Any, msg: String): js.Thenable[Unit] = js.native
    
    def include(exp: String, inc: js.Any): js.Thenable[Unit] = js.native
    def include(exp: String, inc: js.Any, msg: String): js.Thenable[Unit] = js.native
    def include(exp: js.Array[js.Any], inc: js.Any): js.Thenable[Unit] = js.native
    def include(exp: js.Array[js.Any], inc: js.Any, msg: String): js.Thenable[Unit] = js.native
    
    def includeDeepMembers(set1: js.Array[js.Any], set2: js.Array[js.Any]): js.Thenable[Unit] = js.native
    def includeDeepMembers(set1: js.Array[js.Any], set2: js.Array[js.Any], msg: String): js.Thenable[Unit] = js.native
    
    def includeDeepOrderedMembers(set1: js.Array[js.Any], set2: js.Array[js.Any]): js.Thenable[Unit] = js.native
    def includeDeepOrderedMembers(set1: js.Array[js.Any], set2: js.Array[js.Any], msg: String): js.Thenable[Unit] = js.native
    
    def includeMembers(set1: js.Array[js.Any], set2: js.Array[js.Any]): js.Thenable[Unit] = js.native
    def includeMembers(set1: js.Array[js.Any], set2: js.Array[js.Any], msg: String): js.Thenable[Unit] = js.native
    
    def includeOrderedMembers(set1: js.Array[js.Any], set2: js.Array[js.Any]): js.Thenable[Unit] = js.native
    def includeOrderedMembers(set1: js.Array[js.Any], set2: js.Array[js.Any], msg: String): js.Thenable[Unit] = js.native
    
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
    def notDeepInclude(exp: js.Array[js.Any], inc: js.Any): js.Thenable[Unit] = js.native
    def notDeepInclude(exp: js.Array[js.Any], inc: js.Any, msg: String): js.Thenable[Unit] = js.native
    
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
    def notInclude(exp: js.Array[js.Any], inc: js.Any): js.Thenable[Unit] = js.native
    def notInclude(exp: js.Array[js.Any], inc: js.Any, msg: String): js.Thenable[Unit] = js.native
    
    def notIncludeDeepOrderedMembers(set1: js.Array[js.Any], set2: js.Array[js.Any]): js.Thenable[Unit] = js.native
    def notIncludeDeepOrderedMembers(set1: js.Array[js.Any], set2: js.Array[js.Any], msg: String): js.Thenable[Unit] = js.native
    
    def notIncludeOrderedMembers(set1: js.Array[js.Any], set2: js.Array[js.Any]): js.Thenable[Unit] = js.native
    def notIncludeOrderedMembers(set1: js.Array[js.Any], set2: js.Array[js.Any], msg: String): js.Thenable[Unit] = js.native
    
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
    
    def notSameDeepOrderedMembers(set1: js.Array[js.Any], set2: js.Array[js.Any]): js.Thenable[Unit] = js.native
    def notSameDeepOrderedMembers(set1: js.Array[js.Any], set2: js.Array[js.Any], msg: String): js.Thenable[Unit] = js.native
    
    def notSameOrderedMembers(set1: js.Array[js.Any], set2: js.Array[js.Any]): js.Thenable[Unit] = js.native
    def notSameOrderedMembers(set1: js.Array[js.Any], set2: js.Array[js.Any], msg: String): js.Thenable[Unit] = js.native
    
    def notSealed(obj: js.Object): js.Thenable[Unit] = js.native
    def notSealed(obj: js.Object, msg: String): js.Thenable[Unit] = js.native
    
    def notStrictEqual(act: js.Any, exp: js.Any): js.Thenable[Unit] = js.native
    def notStrictEqual(act: js.Any, exp: js.Any, msg: String): js.Thenable[Unit] = js.native
    
    def notTypeOf(`val`: js.Any, `type`: String): js.Thenable[Unit] = js.native
    def notTypeOf(`val`: js.Any, `type`: String, msg: String): js.Thenable[Unit] = js.native
    
    def ok(`val`: js.Any): js.Thenable[Unit] = js.native
    def ok(`val`: js.Any, msg: String): js.Thenable[Unit] = js.native
    
    def oneOf(`val`: js.Any, list: js.Array[js.Any]): js.Thenable[Unit] = js.native
    def oneOf(`val`: js.Any, list: js.Array[js.Any], msg: String): js.Thenable[Unit] = js.native
    
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
    
    def sameDeepMembers(set1: js.Array[js.Any], set2: js.Array[js.Any]): js.Thenable[Unit] = js.native
    def sameDeepMembers(set1: js.Array[js.Any], set2: js.Array[js.Any], msg: String): js.Thenable[Unit] = js.native
    
    def sameDeepOrderedMembers(set1: js.Array[js.Any], set2: js.Array[js.Any]): js.Thenable[Unit] = js.native
    def sameDeepOrderedMembers(set1: js.Array[js.Any], set2: js.Array[js.Any], msg: String): js.Thenable[Unit] = js.native
    
    def sameMembers(set1: js.Array[js.Any], set2: js.Array[js.Any]): js.Thenable[Unit] = js.native
    def sameMembers(set1: js.Array[js.Any], set2: js.Array[js.Any], msg: String): js.Thenable[Unit] = js.native
    
    def sameOrderedMembers(set1: js.Array[js.Any], set2: js.Array[js.Any]): js.Thenable[Unit] = js.native
    def sameOrderedMembers(set1: js.Array[js.Any], set2: js.Array[js.Any], msg: String): js.Thenable[Unit] = js.native
    
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
    extends StObject
       with Eventually
       with PromiseLike[js.Any]
  
  type PromisedCloseTo = js.Function3[
    /* expected */ Double, 
    /* delta */ Double, 
    /* message */ js.UndefOr[String], 
    PromisedAssertion
  ]
  
  trait PromisedDeep extends StObject {
    
    def eq(value: js.Any): PromisedAssertion
    def eq(value: js.Any, message: String): PromisedAssertion
    @JSName("eq")
    var eq_Original: PromisedEqual
    
    def equal(value: js.Any): PromisedAssertion
    def equal(value: js.Any, message: String): PromisedAssertion
    @JSName("equal")
    var equal_Original: PromisedEqual
    
    def equals(value: js.Any): PromisedAssertion
    def equals(value: js.Any, message: String): PromisedAssertion
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
    
    def members(set: js.Array[js.Any]): PromisedAssertion
    def members(set: js.Array[js.Any], message: String): PromisedAssertion
    @JSName("members")
    var members_Original: PromisedMembers
    
    var ordered: PromisedOrdered
    
    def property(name: String): PromisedAssertion
    def property(name: String, value: js.Any): PromisedAssertion
    def property(name: String, value: js.Any, message: String): PromisedAssertion
    def property(name: String, value: Unit, message: String): PromisedAssertion
    @JSName("property")
    var property_Original: PromisedProperty
  }
  object PromisedDeep {
    
    @scala.inline
    def apply(
      eq_ : (/* value */ js.Any, /* message */ js.UndefOr[String]) => PromisedAssertion,
      equal: (/* value */ js.Any, /* message */ js.UndefOr[String]) => PromisedAssertion,
      equals_ : (/* value */ js.Any, /* message */ js.UndefOr[String]) => PromisedAssertion,
      include: PromisedInclude,
      members: (/* set */ js.Array[js.Any], /* message */ js.UndefOr[String]) => PromisedAssertion,
      ordered: PromisedOrdered,
      property: (/* name */ String, /* value */ js.UndefOr[js.Any], /* message */ js.UndefOr[String]) => PromisedAssertion
    ): PromisedDeep = {
      val __obj = js.Dynamic.literal(equal = js.Any.fromFunction2(equal), include = include.asInstanceOf[js.Any], members = js.Any.fromFunction2(members), ordered = ordered.asInstanceOf[js.Any], property = js.Any.fromFunction3(property))
      __obj.updateDynamic("eq")(js.Any.fromFunction2(eq_))
      __obj.updateDynamic("equals")(js.Any.fromFunction2(equals_))
      __obj.asInstanceOf[PromisedDeep]
    }
    
    @scala.inline
    implicit class PromisedDeepMutableBuilder[Self <: PromisedDeep] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEq_(value: (/* value */ js.Any, /* message */ js.UndefOr[String]) => PromisedAssertion): Self = StObject.set(x, "eq", js.Any.fromFunction2(value))
      
      @scala.inline
      def setEqual(value: (/* value */ js.Any, /* message */ js.UndefOr[String]) => PromisedAssertion): Self = StObject.set(x, "equal", js.Any.fromFunction2(value))
      
      @scala.inline
      def setEquals_(value: (/* value */ js.Any, /* message */ js.UndefOr[String]) => PromisedAssertion): Self = StObject.set(x, "equals", js.Any.fromFunction2(value))
      
      @scala.inline
      def setInclude(value: PromisedInclude): Self = StObject.set(x, "include", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMembers(value: (/* set */ js.Array[js.Any], /* message */ js.UndefOr[String]) => PromisedAssertion): Self = StObject.set(x, "members", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOrdered(value: PromisedOrdered): Self = StObject.set(x, "ordered", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProperty(
        value: (/* name */ String, /* value */ js.UndefOr[js.Any], /* message */ js.UndefOr[String]) => PromisedAssertion
      ): Self = StObject.set(x, "property", js.Any.fromFunction3(value))
    }
  }
  
  type PromisedEqual = js.Function2[/* value */ js.Any, /* message */ js.UndefOr[String], PromisedAssertion]
  
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
    def keys(keys: js.Array[js.Any]): PromisedAssertion = js.native
    def keys(keys: js.Object): PromisedAssertion = js.native
    @JSName("keys")
    var keys_Original: PromisedKeys = js.native
    
    def members(set: js.Array[js.Any]): PromisedAssertion = js.native
    def members(set: js.Array[js.Any], message: String): PromisedAssertion = js.native
    @JSName("members")
    var members_Original: PromisedMembers = js.native
    
    var ordered: PromisedOrdered = js.native
  }
  
  type PromisedInstanceOf = js.Function2[/* constructor */ js.Object, /* message */ js.UndefOr[String], PromisedAssertion]
  
  trait PromisedKeyFilter extends StObject {
    
    def keys(keys: String*): PromisedAssertion
    def keys(keys: js.Array[js.Any]): PromisedAssertion
    def keys(keys: js.Object): PromisedAssertion
    @JSName("keys")
    var keys_Original: PromisedKeys
  }
  object PromisedKeyFilter {
    
    @scala.inline
    def apply(keys: PromisedKeys): PromisedKeyFilter = {
      val __obj = js.Dynamic.literal(keys = keys.asInstanceOf[js.Any])
      __obj.asInstanceOf[PromisedKeyFilter]
    }
    
    @scala.inline
    implicit class PromisedKeyFilterMutableBuilder[Self <: PromisedKeyFilter] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setKeys(value: PromisedKeys): Self = StObject.set(x, "keys", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait PromisedKeys extends StObject {
    
    def apply(keys: String*): PromisedAssertion = js.native
    def apply(keys: js.Array[js.Any]): PromisedAssertion = js.native
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
    
    @scala.inline
    def apply(
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
    implicit class PromisedLanguageChainsMutableBuilder[Self <: PromisedLanguageChains] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAnd(value: PromisedAssertion): Self = StObject.set(x, "and", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAt(value: PromisedAssertion): Self = StObject.set(x, "at", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBe(value: PromisedAssertion): Self = StObject.set(x, "be", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBeen(value: PromisedAssertion): Self = StObject.set(x, "been", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBut(value: PromisedAssertion): Self = StObject.set(x, "but", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDoes(value: PromisedAssertion): Self = StObject.set(x, "does", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEventually(value: Eventually): Self = StObject.set(x, "eventually", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHas(value: PromisedAssertion): Self = StObject.set(x, "has", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHave(value: PromisedAssertion): Self = StObject.set(x, "have", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIs(value: PromisedAssertion): Self = StObject.set(x, "is", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOf(value: PromisedAssertion): Self = StObject.set(x, "of", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSame(value: PromisedAssertion): Self = StObject.set(x, "same", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThat(value: PromisedAssertion): Self = StObject.set(x, "that", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTo(value: PromisedAssertion): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWhich(value: PromisedAssertion): Self = StObject.set(x, "which", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWith(value: PromisedAssertion): Self = StObject.set(x, "with", value.asInstanceOf[js.Any])
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
  
  type PromisedMatch = js.Function2[/* regexp */ RegExp | String, /* message */ js.UndefOr[String], PromisedAssertion]
  
  type PromisedMembers = js.Function2[/* set */ js.Array[js.Any], /* message */ js.UndefOr[String], PromisedAssertion]
  
  trait PromisedNested extends StObject {
    
    def include(value: String): PromisedAssertion
    def include(value: String, message: String): PromisedAssertion
    def include(value: js.Object): PromisedAssertion
    def include(value: js.Object, message: String): PromisedAssertion
    def include(value: Double): PromisedAssertion
    def include(value: Double, message: String): PromisedAssertion
    @JSName("include")
    var include_Original: PromisedInclude
    
    def members(set: js.Array[js.Any]): PromisedAssertion
    def members(set: js.Array[js.Any], message: String): PromisedAssertion
    @JSName("members")
    var members_Original: PromisedMembers
    
    def property(name: String): PromisedAssertion
    def property(name: String, value: js.Any): PromisedAssertion
    def property(name: String, value: js.Any, message: String): PromisedAssertion
    def property(name: String, value: Unit, message: String): PromisedAssertion
    @JSName("property")
    var property_Original: PromisedProperty
  }
  object PromisedNested {
    
    @scala.inline
    def apply(
      include: PromisedInclude,
      members: (/* set */ js.Array[js.Any], /* message */ js.UndefOr[String]) => PromisedAssertion,
      property: (/* name */ String, /* value */ js.UndefOr[js.Any], /* message */ js.UndefOr[String]) => PromisedAssertion
    ): PromisedNested = {
      val __obj = js.Dynamic.literal(include = include.asInstanceOf[js.Any], members = js.Any.fromFunction2(members), property = js.Any.fromFunction3(property))
      __obj.asInstanceOf[PromisedNested]
    }
    
    @scala.inline
    implicit class PromisedNestedMutableBuilder[Self <: PromisedNested] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setInclude(value: PromisedInclude): Self = StObject.set(x, "include", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMembers(value: (/* set */ js.Array[js.Any], /* message */ js.UndefOr[String]) => PromisedAssertion): Self = StObject.set(x, "members", js.Any.fromFunction2(value))
      
      @scala.inline
      def setProperty(
        value: (/* name */ String, /* value */ js.UndefOr[js.Any], /* message */ js.UndefOr[String]) => PromisedAssertion
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
    
    def members(set: js.Array[js.Any]): PromisedAssertion
    def members(set: js.Array[js.Any], message: String): PromisedAssertion
    @JSName("members")
    var members_Original: PromisedMembers
  }
  object PromisedOrdered {
    
    @scala.inline
    def apply(members: (/* set */ js.Array[js.Any], /* message */ js.UndefOr[String]) => PromisedAssertion): PromisedOrdered = {
      val __obj = js.Dynamic.literal(members = js.Any.fromFunction2(members))
      __obj.asInstanceOf[PromisedOrdered]
    }
    
    @scala.inline
    implicit class PromisedOrderedMutableBuilder[Self <: PromisedOrdered] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMembers(value: (/* set */ js.Array[js.Any], /* message */ js.UndefOr[String]) => PromisedAssertion): Self = StObject.set(x, "members", js.Any.fromFunction2(value))
    }
  }
  
  type PromisedOwnProperty = js.Function2[/* name */ String, /* message */ js.UndefOr[String], PromisedAssertion]
  
  @js.native
  trait PromisedOwnPropertyDescriptor extends StObject {
    
    def apply(name: String): PromisedAssertion = js.native
    def apply(name: String, descriptor: PropertyDescriptor): PromisedAssertion = js.native
    def apply(name: String, descriptor: PropertyDescriptor, message: String): PromisedAssertion = js.native
    def apply(name: String, message: String): PromisedAssertion = js.native
  }
  
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
  
  @js.native
  trait PromisedThrow extends StObject {
    
    def apply(): PromisedAssertion = js.native
    def apply(constructor: js.Function): PromisedAssertion = js.native
    def apply(constructor: js.Function, expected: String): PromisedAssertion = js.native
    def apply(constructor: js.Function, expected: String, message: String): PromisedAssertion = js.native
    def apply(constructor: js.Function, expected: Unit, message: String): PromisedAssertion = js.native
    def apply(constructor: js.Function, expected: RegExp): PromisedAssertion = js.native
    def apply(constructor: js.Function, expected: RegExp, message: String): PromisedAssertion = js.native
    def apply(constructor: Error): PromisedAssertion = js.native
    def apply(constructor: Error, expected: String): PromisedAssertion = js.native
    def apply(constructor: Error, expected: String, message: String): PromisedAssertion = js.native
    def apply(constructor: Error, expected: Unit, message: String): PromisedAssertion = js.native
    def apply(constructor: Error, expected: RegExp): PromisedAssertion = js.native
    def apply(constructor: Error, expected: RegExp, message: String): PromisedAssertion = js.native
    def apply(expected: String): PromisedAssertion = js.native
    def apply(expected: String, message: String): PromisedAssertion = js.native
    def apply(expected: RegExp): PromisedAssertion = js.native
    def apply(expected: RegExp, message: String): PromisedAssertion = js.native
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
