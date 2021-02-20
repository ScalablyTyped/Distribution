package typings.chai

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable3
import org.scalablytyped.runtime.Instantiable4
import org.scalablytyped.runtime.StringDictionary
import typings.chai.chaiNumbers.`-1`
import typings.chai.chaiNumbers.`1`
import typings.std.Date
import typings.std.Error
import typings.std.Partial
import typings.std.PropertyDescriptor
import typings.std.ReadonlyMap
import typings.std.ReadonlySet
import typings.std.RegExp
import typings.std.WeakSet
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Chai {
  
  @js.native
  trait Assert extends StObject {
    
    /**
      * @param expression    Expression to test for truthiness.
      * @param message    Message to display on error.
      */
    def apply(expression: js.Any): Unit = js.native
    def apply(expression: js.Any, message: String): Unit = js.native
    
    /**
      * Asserts that fn will throw an error.
      *
      * @param fn   Function that may throw.
      * @param message   Message to display on error.
      */
    def Throw(fn: js.Function0[Unit]): Unit = js.native
    /**
      * Asserts that function will throw an error that is an instance of constructor.
      *
      * @param fn   Function that may throw.
      * @param constructor   Potential expected error constructor.
      * @param message   Message to display on error.
      */
    def Throw(fn: js.Function0[Unit], constructor: ErrorConstructor): Unit = js.native
    def Throw(fn: js.Function0[Unit], constructor: ErrorConstructor, message: String): Unit = js.native
    /**
      * Asserts that function will throw an error that is an instance of constructor
      * and an error with message matching regexp.
      *
      * @param fn   Function that may throw.
      * @param constructor   Potential expected error constructor.
      * @param message   Message to display on error.
      */
    def Throw(fn: js.Function0[Unit], constructor: ErrorConstructor, regExp: RegExp): Unit = js.native
    def Throw(fn: js.Function0[Unit], message: String): Unit = js.native
    /**
      * Asserts that function will throw an error with message matching regexp.
      *
      * @param fn   Function that may throw.
      * @param regExp   Potential expected message match.
      * @param message   Message to display on error.
      */
    def Throw(fn: js.Function0[Unit], regExp: RegExp): Unit = js.native
    
    /**
      * Asserts that the target is equal to expected, to within a +/- delta range.
      *
      * @param actual   Actual value
      * @param expected   Potential expected value.
      * @param delta   Maximum differenced between values.
      * @param message   Message to display on error.
      */
    def approximately(act: Double, exp: Double, delta: Double): Unit = js.native
    def approximately(act: Double, exp: Double, delta: Double, message: String): Unit = js.native
    
    /**
      * Asserts that a function changes the value of a property.
      *
      * @type T   Type of object.
      * @param modifier   Function to run.
      * @param object   Container object.
      * @param property   Property of object expected to be modified.
      * @param message   Message to display on error.
      */
    def changes[T](modifier: js.Function, `object`: T, property: String): Unit = js.native
    def changes[T](modifier: js.Function, `object`: T, property: String, message: String): Unit = js.native
    
    /**
      * Asserts that the target is equal to expected, to within a +/- delta range.
      *
      * @param actual   Actual value
      * @param expected   Potential expected value.
      * @param delta   Maximum differenced between values.
      * @param message   Message to display on error.
      */
    def closeTo(actual: Double, expected: Double, delta: Double): Unit = js.native
    def closeTo(actual: Double, expected: Double, delta: Double, message: String): Unit = js.native
    
    /**
      * Asserts that `object` contains all of the `keys` provided.
      * Since Sets and Maps can have objects as keys you can use this assertion to perform
      * a deep comparison.
      * You can also provide a single object instead of a `keys` array and its keys
      * will be used as the expected set of keys.
      *
      * @type T   Type of object.
      * @param object   Object to test.
      * @param keys   Keys to check
      * @param message    Message to display on error.
      */
    def containsAllDeepKeys[T](`object`: T, keys: js.Array[Object | String]): Unit = js.native
    def containsAllDeepKeys[T](`object`: T, keys: js.Array[Object | String], message: String): Unit = js.native
    def containsAllDeepKeys[T](`object`: T, keys: StringDictionary[js.Any]): Unit = js.native
    def containsAllDeepKeys[T](`object`: T, keys: StringDictionary[js.Any], message: String): Unit = js.native
    
    /**
      * Asserts that `object` has all of the `keys` provided but may have more keys not listed.
      * You can also provide a single object instead of a `keys` array and its keys
      * will be used as the expected set of keys.
      *
      * @type T   Type of object.
      * @param object   Object to test.
      * @param keys   Keys to check
      * @param message    Message to display on error.
      */
    def containsAllKeys[T](`object`: T, keys: js.Array[Object | String]): Unit = js.native
    def containsAllKeys[T](`object`: T, keys: js.Array[Object | String], message: String): Unit = js.native
    def containsAllKeys[T](`object`: T, keys: StringDictionary[js.Any]): Unit = js.native
    def containsAllKeys[T](`object`: T, keys: StringDictionary[js.Any], message: String): Unit = js.native
    
    /**
      * Asserts that a function decreases an object property.
      *
      * @type T   Type of object.
      * @param modifier   Function to run.
      * @param object   Container object.
      * @param property   Property of object expected to be decreased.
      * @param message   Message to display on error.
      */
    def decreases[T](modifier: js.Function, `object`: T, property: String): Unit = js.native
    def decreases[T](modifier: js.Function, `object`: T, property: String, message: String): Unit = js.native
    
    /**
      * Asserts that actual is deeply equal (==) to expected.
      *
      * @type T   Type of the objects.
      * @param actual   Actual value.
      * @param expected   Potential expected value.
      * @param message   Message to display on error.
      */
    def deepEqual[T](actual: T, expected: T): Unit = js.native
    def deepEqual[T](actual: T, expected: T, message: String): Unit = js.native
    
    /**
      * Asserts that haystack includes needle. Deep equality is used.
      *
      * @param haystack   Container string.
      * @param needle   Potential substring of haystack.
      * @param message   Message to display on error.
      *
      * @deprecated Does not have any effect on string. Use {@link Assert#include} instead.
      */
    def deepInclude(haystack: String, needle: String): Unit = js.native
    def deepInclude(haystack: String, needle: String, message: String): Unit = js.native
    /**
      * Asserts that haystack does not includes needle.
      *
      * @type T   Type of haystack.
      * @param haystack   Object.
      * @param needle   Potential subset of the haystack's properties.
      * @param message   Message to display on error.
      */
    def deepInclude[T](haystack: T, needle: Partial[T]): Unit = js.native
    def deepInclude[T](haystack: T, needle: Partial[T], message: String): Unit = js.native
    /**
      * Asserts that haystack includes needle. Deep equality is used.
      *
      * @type T   Type of values in haystack.
      * @param haystack   Container array, set or map.
      * @param needle   Potential value contained in haystack.
      * @param message   Message to display on error.
      */
    def deepInclude[T](haystack: js.Array[T], needle: T): Unit = js.native
    def deepInclude[T](haystack: js.Array[T], needle: T, message: String): Unit = js.native
    def deepInclude[T](haystack: ReadonlyMap[_, T], needle: T): Unit = js.native
    def deepInclude[T](haystack: ReadonlyMap[_, T], needle: T, message: String): Unit = js.native
    def deepInclude[T](haystack: ReadonlySet[T], needle: T): Unit = js.native
    def deepInclude[T](haystack: ReadonlySet[T], needle: T, message: String): Unit = js.native
    
    /**
      * Asserts that ‘haystack’ includes ‘needle’. Can be used to assert the inclusion of a subset of properties in an object while checking for deep equality
      *
      * Enables the use of dot- and bracket-notation for referencing nested properties.
      * ‘[]’ and ‘.’ in property names can be escaped using double backslashes.Asserts that ‘haystack’ includes ‘needle’.
      * Can be used to assert the inclusion of a subset of properties in an object.
      * Enables the use of dot- and bracket-notation for referencing nested properties.
      * ‘[]’ and ‘.’ in property names can be escaped using double backslashes.
      *
      * @param haystack
      * @param needle
      * @param message   Message to display on error.
      */
    def deepNestedInclude(haystack: js.Any, needle: js.Any): Unit = js.native
    def deepNestedInclude(haystack: js.Any, needle: js.Any, message: String): Unit = js.native
    
    /**
      * Asserts that object has a property named by property with a value given by value.
      * property can use dot- and bracket-notation for nested reference. Uses a deep equality check.
      *
      * @type T   Type of object.
      * @param object   Object to test.
      * @param property    Property to test.
      * @param value    Value to test.
      * @param message    Message to display on error.
      */
    def deepNestedPropertyVal[T](`object`: T, property: String, value: js.Any): Unit = js.native
    def deepNestedPropertyVal[T](`object`: T, property: String, value: js.Any, message: String): Unit = js.native
    
    /**
      * Asserts that ‘haystack’ includes ‘needle’. Can be used to assert the inclusion of a subset of properties in an object while ignoring inherited properties and checking for deep
      *
      * @param haystack
      * @param needle
      * @param message   Message to display on error.
      */
    def deepOwnInclude(haystack: js.Any, needle: js.Any): Unit = js.native
    def deepOwnInclude(haystack: js.Any, needle: js.Any, message: String): Unit = js.native
    
    /**
      * Asserts that object has a property named by property, which can be a string
      * using dot- and bracket-notation for deep reference.
      *
      * @type T   Type of object.
      * @param object   Container object.
      * @param property   Potential contained property of object.
      * @param message   Message to display on error.
      */
    def deepProperty[T](`object`: T, property: String): Unit = js.native
    def deepProperty[T](`object`: T, property: String, message: String): Unit = js.native
    
    /**
      * Asserts that object has a property named by property, which can be a string
      * using dot- and bracket-notation for deep reference.
      *
      * @type T   Type of object.
      * @type V   Type of value.
      * @param object   Container object.
      * @param property   Potential contained property of object.
      * @param value   Potential expected property value.
      * @param message   Message to display on error.
      */
    def deepPropertyVal[T, V](`object`: T, property: String, value: V): Unit = js.native
    def deepPropertyVal[T, V](`object`: T, property: String, value: V, message: String): Unit = js.native
    
    /**
      * Asserts that actual is deeply strict equal (===) to expected.
      *
      * @type T   Type of the objects.
      * @param actual   Actual value.
      * @param expected   Potential expected value.
      * @param message   Message to display on error.
      */
    def deepStrictEqual[T](actual: T, expected: T): Unit = js.native
    def deepStrictEqual[T](actual: T, expected: T, message: String): Unit = js.native
    
    /**
      * Asserts that a function does not change the value of a property.
      *
      * @type T   Type of object.
      * @param modifier   Function to run.
      * @param object   Container object.
      * @param property   Property of object expected not to be modified.
      * @param message   Message to display on error.
      */
    def doesNotChange[T](modifier: js.Function, `object`: T, property: String): Unit = js.native
    def doesNotChange[T](modifier: js.Function, `object`: T, property: String, message: String): Unit = js.native
    
    /**
      * Asserts that a function does not decrease an object property.
      *
      * @type T   Type of object.
      * @param modifier   Function to run.
      * @param object   Container object.
      * @param property   Property of object expected not to be decreased.
      * @param message   Message to display on error.
      */
    def doesNotDecrease[T](modifier: js.Function, `object`: T, property: String): Unit = js.native
    def doesNotDecrease[T](modifier: js.Function, `object`: T, property: String, message: String): Unit = js.native
    
    /**
      * Asserts that `object` contains all of the `keys` provided.
      * Since Sets and Maps can have objects as keys you can use this assertion to perform
      * a deep comparison.
      * You can also provide a single object instead of a `keys` array and its keys
      * will be used as the expected set of keys.
      *
      * @type T   Type of object.
      * @param object   Object to test.
      * @param keys   Keys to check
      * @param message    Message to display on error.
      */
    def doesNotHaveAllDeepKeys[T](`object`: T, keys: js.Array[Object | String]): Unit = js.native
    def doesNotHaveAllDeepKeys[T](`object`: T, keys: js.Array[Object | String], message: String): Unit = js.native
    def doesNotHaveAllDeepKeys[T](`object`: T, keys: StringDictionary[js.Any]): Unit = js.native
    def doesNotHaveAllDeepKeys[T](`object`: T, keys: StringDictionary[js.Any], message: String): Unit = js.native
    
    /**
      * Asserts that `object` does not have at least one of the `keys` provided.
      * You can also provide a single object instead of a `keys` array and its keys
      * will be used as the expected set of keys.
      *
      * @type T   Type of object.
      * @param object   Object to test.
      * @param keys   Keys to check
      * @param message    Message to display on error.
      */
    def doesNotHaveAllKeys[T](`object`: T, keys: js.Array[Object | String]): Unit = js.native
    def doesNotHaveAllKeys[T](`object`: T, keys: js.Array[Object | String], message: String): Unit = js.native
    def doesNotHaveAllKeys[T](`object`: T, keys: StringDictionary[js.Any]): Unit = js.native
    def doesNotHaveAllKeys[T](`object`: T, keys: StringDictionary[js.Any], message: String): Unit = js.native
    
    /**
      * Asserts that `object` contains all of the `keys` provided.
      * Since Sets and Maps can have objects as keys you can use this assertion to perform
      * a deep comparison.
      * You can also provide a single object instead of a `keys` array and its keys
      * will be used as the expected set of keys.
      *
      * @type T   Type of object.
      * @param object   Object to test.
      * @param keys   Keys to check
      * @param message    Message to display on error.
      */
    def doesNotHaveAnyDeepKeys[T](`object`: T, keys: js.Array[Object | String]): Unit = js.native
    def doesNotHaveAnyDeepKeys[T](`object`: T, keys: js.Array[Object | String], message: String): Unit = js.native
    def doesNotHaveAnyDeepKeys[T](`object`: T, keys: StringDictionary[js.Any]): Unit = js.native
    def doesNotHaveAnyDeepKeys[T](`object`: T, keys: StringDictionary[js.Any], message: String): Unit = js.native
    
    /**
      * Asserts that `object` has none of the `keys` provided.
      * You can also provide a single object instead of a `keys` array and its keys
      * will be used as the expected set of keys.
      *
      * @type T   Type of object.
      * @param object   Object to test.
      * @param keys   Keys to check
      * @param message    Message to display on error.
      */
    def doesNotHaveAnyKeys[T](`object`: T, keys: js.Array[Object | String]): Unit = js.native
    def doesNotHaveAnyKeys[T](`object`: T, keys: js.Array[Object | String], message: String): Unit = js.native
    def doesNotHaveAnyKeys[T](`object`: T, keys: StringDictionary[js.Any]): Unit = js.native
    def doesNotHaveAnyKeys[T](`object`: T, keys: StringDictionary[js.Any], message: String): Unit = js.native
    
    /**
      * Asserts that a function does not increase an object property.
      *
      * @type T   Type of object.
      * @param modifier   Function to run.
      * @param object   Container object.
      * @param property   Property of object expected not to be increased.
      * @param message   Message to display on error.
      */
    def doesNotIncrease[T](modifier: js.Function, `object`: T, property: String): Unit = js.native
    def doesNotIncrease[T](modifier: js.Function, `object`: T, property: String, message: String): Unit = js.native
    
    /**
      * Asserts that fn will not throw an error.
      *
      * @param fn   Function that may throw.
      * @param message   Message to display on error.
      */
    def doesNotThrow(fn: js.Function0[Unit]): Unit = js.native
    /**
      * Asserts that function will throw an error that is an instance of constructor.
      *
      * @param fn   Function that may throw.
      * @param constructor   Potential expected error constructor.
      * @param message   Message to display on error.
      */
    def doesNotThrow(fn: js.Function0[Unit], constructor: ErrorConstructor): Unit = js.native
    def doesNotThrow(fn: js.Function0[Unit], constructor: ErrorConstructor, message: String): Unit = js.native
    /**
      * Asserts that function will throw an error that is an instance of constructor
      * and an error with message matching regexp.
      *
      * @param fn   Function that may throw.
      * @param constructor   Potential expected error constructor.
      * @param message   Message to display on error.
      */
    def doesNotThrow(fn: js.Function0[Unit], constructor: ErrorConstructor, regExp: RegExp): Unit = js.native
    def doesNotThrow(fn: js.Function0[Unit], message: String): Unit = js.native
    /**
      * Asserts that function will throw an error with message matching regexp.
      *
      * @param fn   Function that may throw.
      * @param regExp   Potential expected message match.
      * @param message   Message to display on error.
      */
    def doesNotThrow(fn: js.Function0[Unit], regExp: RegExp): Unit = js.native
    
    /**
      * Asserts non-strict equality (==) of actual and expected.
      *
      * @type T   Type of the objects.
      * @param actual   Actual value.
      * @param expected   Potential expected value.
      * @param message   Message to display on error.
      */
    def equal[T](actual: T, expected: T): Unit = js.native
    def equal[T](actual: T, expected: T, message: String): Unit = js.native
    
    /**
      * Asserts that the target is neither null nor undefined.
      *
      * @type T   Type of value.
      * @param value   Actual value.
      * @param message    Message to display on error.
      */
    def exists[T](value: T): Unit = js.native
    def exists[T](value: T, message: String): Unit = js.native
    
    /**
      * Asserts that object is extensible (can have new properties added to it).
      *
      * @type T   Type of object
      * @param object   Actual value.
      * @param message   Message to display on error.
      */
    def extensible[T](`object`: T): Unit = js.native
    def extensible[T](`object`: T, message: String): Unit = js.native
    
    /**
      * Throws a failure.
      *
      * @param message    Message to display on error.
      * @remarks Node.js assert module-compatible.
      */
    def fail(): scala.Nothing = js.native
    def fail(message: String): scala.Nothing = js.native
    /**
      * Throws a failure.
      *
      * @type T   Type of the objects.
      * @param actual   Actual value.
      * @param expected   Potential expected value.
      * @param message    Message to display on error.
      * @param operator   Comparison operator, if not strict equality.
      * @remarks Node.js assert module-compatible.
      */
    def fail[T](actual: T, expected: T): scala.Nothing = js.native
    def fail[T](actual: T, expected: T, message: js.UndefOr[scala.Nothing], operator: Operator): scala.Nothing = js.native
    def fail[T](actual: T, expected: T, message: String): scala.Nothing = js.native
    def fail[T](actual: T, expected: T, message: String, operator: Operator): scala.Nothing = js.native
    
    /**
      * Asserts that object is frozen (cannot have new properties added to it
      * and its existing properties cannot be removed).
      *
      * @type T   Type of object
      * @param object   Actual value.
      * @param message   Message to display on error.
      */
    def frozen[T](`object`: T): Unit = js.native
    def frozen[T](`object`: T, message: String): Unit = js.native
    
    /**
      * Asserts that `object` has all and only all of the `keys` provided.
      * Since Sets and Maps can have objects as keys you can use this assertion to perform
      * a deep comparison.
      * You can also provide a single object instead of a `keys` array and its keys
      * will be used as the expected set of keys.
      *
      * @type T   Type of object.
      * @param object   Object to test.
      * @param keys   Keys to check
      * @param message    Message to display on error.
      */
    def hasAllDeepKeys[T](`object`: T, keys: js.Array[Object | String]): Unit = js.native
    def hasAllDeepKeys[T](`object`: T, keys: js.Array[Object | String], message: String): Unit = js.native
    def hasAllDeepKeys[T](`object`: T, keys: StringDictionary[js.Any]): Unit = js.native
    def hasAllDeepKeys[T](`object`: T, keys: StringDictionary[js.Any], message: String): Unit = js.native
    
    /**
      * Asserts that `object` has all and only all of the `keys` provided.
      * You can also provide a single object instead of a `keys` array and its keys
      * will be used as the expected set of keys.
      *
      * @type T   Type of object.
      * @param object   Object to test.
      * @param keys   Keys to check
      * @param message    Message to display on error.
      */
    def hasAllKeys[T](`object`: T, keys: js.Array[Object | String]): Unit = js.native
    def hasAllKeys[T](`object`: T, keys: js.Array[Object | String], message: String): Unit = js.native
    def hasAllKeys[T](`object`: T, keys: StringDictionary[js.Any]): Unit = js.native
    def hasAllKeys[T](`object`: T, keys: StringDictionary[js.Any], message: String): Unit = js.native
    
    /**
      * Asserts that `object` has at least one of the `keys` provided.
      * Since Sets and Maps can have objects as keys you can use this assertion to perform
      * a deep comparison.
      * You can also provide a single object instead of a `keys` array and its keys
      * will be used as the expected set of keys.
      *
      * @type T   Type of object.
      * @param object   Object to test.
      * @param keys   Keys to check
      * @param message    Message to display on error.
      */
    def hasAnyDeepKeys[T](`object`: T, keys: js.Array[Object | String]): Unit = js.native
    def hasAnyDeepKeys[T](`object`: T, keys: js.Array[Object | String], message: String): Unit = js.native
    def hasAnyDeepKeys[T](`object`: T, keys: StringDictionary[js.Any]): Unit = js.native
    def hasAnyDeepKeys[T](`object`: T, keys: StringDictionary[js.Any], message: String): Unit = js.native
    
    /**
      * Asserts that `object` has at least one of the `keys` provided.
      * You can also provide a single object instead of a `keys` array and its keys
      * will be used as the expected set of keys.
      *
      * @type T   Type of object.
      * @param object   Object to test.
      * @param keys   Keys to check
      * @param message    Message to display on error.
      */
    def hasAnyKeys[T](`object`: T, keys: js.Array[Object | String]): Unit = js.native
    def hasAnyKeys[T](`object`: T, keys: js.Array[Object | String], message: String): Unit = js.native
    def hasAnyKeys[T](`object`: T, keys: StringDictionary[js.Any]): Unit = js.native
    def hasAnyKeys[T](`object`: T, keys: StringDictionary[js.Any], message: String): Unit = js.native
    
    /**
      * Asserts if value is not a false value, and throws if it is a true value.
      *
      * @type T   Type of object.
      * @param object   Actual value.
      * @param message   Message to display on error.
      * @remarks This is added to allow for chai to be a drop-in replacement for
      *          Node’s assert class.
      */
    def ifError[T](`object`: T): Unit = js.native
    def ifError[T](`object`: T, message: String): Unit = js.native
    
    /**
      * Asserts that haystack includes needle.
      *
      * @param haystack   Container string.
      * @param needle   Potential substring of haystack.
      * @param message   Message to display on error.
      */
    def include(haystack: String, needle: String): Unit = js.native
    def include(haystack: String, needle: String, message: String): Unit = js.native
    /**
      * Asserts that haystack includes needle.
      *
      * @type T   Type of haystack.
      * @param haystack   Object.
      * @param needle   Potential subset of the haystack's properties.
      * @param message   Message to display on error.
      */
    def include[T](haystack: T, needle: Partial[T]): Unit = js.native
    def include[T](haystack: T, needle: Partial[T], message: String): Unit = js.native
    /**
      * Asserts that haystack includes needle.
      *
      * @type T   Type of values in haystack.
      * @param haystack   Container array, set or map.
      * @param needle   Potential value contained in haystack.
      * @param message   Message to display on error.
      */
    def include[T](haystack: js.Array[T], needle: T): Unit = js.native
    def include[T](haystack: js.Array[T], needle: T, message: String): Unit = js.native
    def include[T](haystack: ReadonlyMap[_, T], needle: T): Unit = js.native
    def include[T](haystack: ReadonlyMap[_, T], needle: T, message: String): Unit = js.native
    def include[T](haystack: ReadonlySet[T], needle: T): Unit = js.native
    def include[T](haystack: ReadonlySet[T], needle: T, message: String): Unit = js.native
    /**
      * Asserts that haystack includes needle.
      *
      * @type T   Type of values in haystack.
      * @param haystack   WeakSet container.
      * @param needle   Potential value contained in haystack.
      * @param message   Message to display on error.
      */
    def include[T /* <: js.Object */](haystack: WeakSet[T], needle: T): Unit = js.native
    def include[T /* <: js.Object */](haystack: WeakSet[T], needle: T, message: String): Unit = js.native
    
    /**
      * Asserts that subset is included in superset using deep equality checking.
      * Order is not take into account.
      *
      * @type T   Type of set values.
      * @param superset   Actual set of values.
      * @param subset   Potential contained set of values.
      * @param message   Message to display on error.
      */
    def includeDeepMembers[T](superset: js.Array[T], subset: js.Array[T]): Unit = js.native
    def includeDeepMembers[T](superset: js.Array[T], subset: js.Array[T], message: String): Unit = js.native
    
    /**
      * Asserts that subset is included in superset in the same order beginning with the first element in superset.
      * Uses a deep equality check.
      *
      * @type T   Type of set values.
      * @param superset   Actual set of values.
      * @param subset   Potential contained set of values.
      * @param message   Message to display on error.
      */
    def includeDeepOrderedMembers[T](superset: js.Array[T], subset: js.Array[T]): Unit = js.native
    def includeDeepOrderedMembers[T](superset: js.Array[T], subset: js.Array[T], message: String): Unit = js.native
    
    /**
      * Asserts that subset is included in superset. Order is not take into account.
      *
      * @type T   Type of set values.
      * @param superset   Actual set of values.
      * @param subset   Potential contained set of values.
      * @param message   Message to display on error.
      */
    def includeMembers[T](superset: js.Array[T], subset: js.Array[T]): Unit = js.native
    def includeMembers[T](superset: js.Array[T], subset: js.Array[T], message: String): Unit = js.native
    
    /**
      * Asserts that subset is included in superset in the same order beginning with the first element in superset.
      * Uses a strict equality check (===).
      *
      * @type T   Type of set values.
      * @param superset   Actual set of values.
      * @param subset   Potential contained set of values.
      * @param message   Message to display on error.
      */
    def includeOrderedMembers[T](superset: js.Array[T], subset: js.Array[T]): Unit = js.native
    def includeOrderedMembers[T](superset: js.Array[T], subset: js.Array[T], message: String): Unit = js.native
    
    /**
      * Asserts that a function increases an object property.
      *
      * @type T   Type of object.
      * @param modifier   Function to run.
      * @param object   Container object.
      * @param property   Property of object expected to be increased.
      * @param message   Message to display on error.
      */
    def increases[T](modifier: js.Function, `object`: T, property: String): Unit = js.native
    def increases[T](modifier: js.Function, `object`: T, property: String, message: String): Unit = js.native
    
    /**
      * Asserts that value is an instance of constructor.
      *
      * @type T   Type of value.
      * @param value   Actual value.
      * @param constructor   Potential expected contructor of value.
      * @param message   Message to display on error.
      */
    def instanceOf[T](value: T, constructor: js.Function): Unit = js.native
    def instanceOf[T](value: T, constructor: js.Function, message: String): Unit = js.native
    
    /**
      * Asserts valueToCheck is strictly greater than (>) valueToBeAbove.
      *
      * @param valueToCheck   Actual value.
      * @param valueToBeAbove   Minimum Potential expected value.
      * @param message   Message to display on error.
      */
    def isAbove(valueToCheck: Double, valueToBeAbove: Double): Unit = js.native
    def isAbove(valueToCheck: Double, valueToBeAbove: Double, message: String): Unit = js.native
    
    /**
      * Asserts that value is an array.
      *
      * @type T   Type of value.
      * @param value   Actual value.
      * @param message   Message to display on error.
      */
    def isArray[T](value: T): Unit = js.native
    def isArray[T](value: T, message: String): Unit = js.native
    
    /**
      * Asserts valueToCheck is greater than or equal to (>=) valueToBeAtLeast.
      *
      * @param valueToCheck   Actual value.
      * @param valueToBeAtLeast   Minimum Potential expected value.
      * @param message   Message to display on error.
      */
    def isAtLeast(valueToCheck: Double, valueToBeAtLeast: Double): Unit = js.native
    def isAtLeast(valueToCheck: Double, valueToBeAtLeast: Double, message: String): Unit = js.native
    
    /**
      * Asserts valueToCheck is less than or equal to (<=) valueToBeAtMost.
      *
      * @param valueToCheck   Actual value.
      * @param valueToBeAtMost   Minimum Potential expected value.
      * @param message   Message to display on error.
      */
    def isAtMost(valueToCheck: Double, valueToBeAtMost: Double): Unit = js.native
    def isAtMost(valueToCheck: Double, valueToBeAtMost: Double, message: String): Unit = js.native
    
    /**
      * Asserts valueToCheck is strictly less than (<) valueToBeBelow.
      *
      * @param valueToCheck   Actual value.
      * @param valueToBeBelow   Minimum Potential expected value.
      * @param message   Message to display on error.
      */
    def isBelow(valueToCheck: Double, valueToBeBelow: Double): Unit = js.native
    def isBelow(valueToCheck: Double, valueToBeBelow: Double, message: String): Unit = js.native
    
    /**
      * Asserts that value is a boolean.
      *
      * @type T   Type of value.
      * @param value   Actual value.
      * @param message   Message to display on error.
      */
    def isBoolean[T](value: T): Unit = js.native
    def isBoolean[T](value: T, message: String): Unit = js.native
    
    /**
      * Asserts that value is not undefined.
      *
      * @type T   Type of value.
      * @param value   Actual value.
      * @param message   Message to display on error.
      */
    def isDefined[T](value: T): Unit = js.native
    def isDefined[T](value: T, message: String): Unit = js.native
    
    /**
      * Asserts that the target does not contain any values. For arrays and
      * strings, it checks the length property. For Map and Set instances, it
      * checks the size property. For non-function objects, it gets the count
      * of own enumerable string keys.
      *
      * @type T   Type of object
      * @param object   Actual value.
      * @param message   Message to display on error.
      */
    def isEmpty[T](`object`: T): Unit = js.native
    def isEmpty[T](`object`: T, message: String): Unit = js.native
    
    /**
      * Asserts that object is extensible (can have new properties added to it).
      *
      * @type T   Type of object
      * @param object   Actual value.
      * @param message   Message to display on error.
      */
    def isExtensible[T](`object`: T): Unit = js.native
    def isExtensible[T](`object`: T, message: String): Unit = js.native
    
    /**
      * Asserts that value is false.
      *
      * @type T   Type of value.
      * @param value   Actual value.
      * @param message   Message to display on error.
      */
    def isFalse[T](value: T): Unit = js.native
    def isFalse[T](value: T, message: String): Unit = js.native
    
    /**
      * Asserts that value is a finite number.
      * Unlike `.isNumber`, this will fail for `NaN` and `Infinity`.
      *
      * @type T   Type of value
      * @param value    Actual value
      * @param message   Message to display on error.
      */
    def isFinite[T](value: T): Unit = js.native
    def isFinite[T](value: T, message: String): Unit = js.native
    
    /**
      * Asserts that object is frozen (cannot have new properties added to it
      * and its existing properties cannot be removed).
      *
      * @type T   Type of object
      * @param object   Actual value.
      * @param message   Message to display on error.
      */
    def isFrozen[T](`object`: T): Unit = js.native
    def isFrozen[T](`object`: T, message: String): Unit = js.native
    
    /**
      * Asserts that value is a function.
      *
      * @type T   Type of value.
      * @param value   Actual value.
      * @param message   Message to display on error.
      */
    def isFunction[T](value: T): Unit = js.native
    def isFunction[T](value: T, message: String): Unit = js.native
    
    /**
      * Asserts that value is NaN.
      *
      * @type T   Type of value.
      * @param value   Actual value.
      * @param message   Message to display on error.
      */
    def isNaN[T](value: T): Unit = js.native
    def isNaN[T](value: T, message: String): Unit = js.native
    
    /**
      * Asserts that value is not an array.
      *
      * @type T   Type of value.
      * @param value   Actual value.
      * @param message   Message to display on error.
      */
    def isNotArray[T](value: T): Unit = js.native
    def isNotArray[T](value: T, message: String): Unit = js.native
    
    /**
      * Asserts that value is not a boolean.
      *
      * @type T   Type of value.
      * @param value   Actual value.
      * @param message   Message to display on error.
      */
    def isNotBoolean[T](value: T): Unit = js.native
    def isNotBoolean[T](value: T, message: String): Unit = js.native
    
    /**
      * Asserts that the target contains values. For arrays and strings, it checks
      * the length property. For Map and Set instances, it checks the size property.
      * For non-function objects, it gets the count of own enumerable string keys.
      *
      * @type T   Type of object.
      * @param object   Object to test.
      * @param message    Message to display on error.
      */
    def isNotEmpty[T](`object`: T): Unit = js.native
    def isNotEmpty[T](`object`: T, message: String): Unit = js.native
    
    /**
      * Asserts that object is not extensible.
      *
      * @type T   Type of object
      * @param object   Actual value.
      * @param message   Message to display on error.
      */
    def isNotExtensible[T](`object`: T): Unit = js.native
    def isNotExtensible[T](`object`: T, message: String): Unit = js.native
    
    /**
      * Asserts that value is not false.
      *
      * @type T   Type of value.
      * @param value   Actual value.
      * @param message   Message to display on error.
      */
    def isNotFalse[T](value: T): Unit = js.native
    def isNotFalse[T](value: T, message: String): Unit = js.native
    
    /**
      * Asserts that object is not frozen (cannot have new properties added to it
      * and its existing properties cannot be removed).
      *
      * @type T   Type of object
      * @param object   Actual value.
      * @param message   Message to display on error.
      */
    def isNotFrozen[T](`object`: T): Unit = js.native
    def isNotFrozen[T](`object`: T, message: String): Unit = js.native
    
    /**
      * Asserts that value is not a function.
      *
      * @type T   Type of value.
      * @param value   Actual value.
      * @param message   Message to display on error.
      */
    def isNotFunction[T](value: T): Unit = js.native
    def isNotFunction[T](value: T, message: String): Unit = js.native
    
    /**
      * Asserts that value is not NaN.
      *
      * @type T   Type of value.
      * @param value   Actual value.
      * @param message   Message to display on error.
      */
    def isNotNaN[T](value: T): Unit = js.native
    def isNotNaN[T](value: T, message: String): Unit = js.native
    
    /**
      * Asserts that value is not null.
      *
      * @type T   Type of value.
      * @param value   Actual value.
      * @param message   Message to display on error.
      */
    def isNotNull[T](value: T): Unit = js.native
    def isNotNull[T](value: T, message: String): Unit = js.native
    
    /**
      * Asserts that value is not a number.
      *
      * @type T   Type of value.
      * @param value   Actual value.
      * @param message   Message to display on error.
      */
    def isNotNumber[T](value: T): Unit = js.native
    def isNotNumber[T](value: T, message: String): Unit = js.native
    
    /**
      * Asserts that value is not an object of type 'Object'
      * (as revealed by Object.prototype.toString).
      *
      * @type T   Type of value.
      * @param value   Actual value.
      * @param message   Message to display on error.
      */
    def isNotObject[T](value: T): Unit = js.native
    def isNotObject[T](value: T, message: String): Unit = js.native
    
    /**
      * Asserts that object is falsy.
      *
      * @type T   Type of object.
      * @param object   Object to test.
      * @param message    Message to display on error.
      */
    def isNotOk[T](value: T): Unit = js.native
    def isNotOk[T](value: T, message: String): Unit = js.native
    
    /**
      * Asserts that object is not sealed.
      *
      * @type T   Type of object
      * @param object   Actual value.
      * @param message   Message to display on error.
      */
    def isNotSealed[T](`object`: T): Unit = js.native
    def isNotSealed[T](`object`: T, message: String): Unit = js.native
    
    /**
      * Asserts that value is not a string.
      *
      * @type T   Type of value.
      * @param value   Actual value.
      * @param message   Message to display on error.
      */
    def isNotString[T](value: T): Unit = js.native
    def isNotString[T](value: T, message: String): Unit = js.native
    
    /**
      * Asserts that value is not true.
      *
      * @type T   Type of value.
      * @param value   Actual value.
      * @param message   Message to display on error.
      */
    def isNotTrue[T](value: T): Unit = js.native
    def isNotTrue[T](value: T, message: String): Unit = js.native
    
    /**
      * Asserts that value is null.
      *
      * @type T   Type of value.
      * @param value   Actual value.
      * @param message   Message to display on error.
      */
    def isNull[T](value: T): Unit = js.native
    def isNull[T](value: T, message: String): Unit = js.native
    
    /**
      * Asserts that value is a number.
      *
      * @type T   Type of value.
      * @param value   Actual value.
      * @param message   Message to display on error.
      */
    def isNumber[T](value: T): Unit = js.native
    def isNumber[T](value: T, message: String): Unit = js.native
    
    /**
      * Asserts that value is an object of type 'Object'
      * (as revealed by Object.prototype.toString).
      *
      * @type T   Type of value.
      * @param value   Actual value.
      * @param message   Message to display on error.
      * @remarks The assertion does not match subclassed objects.
      */
    def isObject[T](value: T): Unit = js.native
    def isObject[T](value: T, message: String): Unit = js.native
    
    /**
      * Asserts that object is truthy.
      *
      * @type T   Type of object.
      * @param object   Object to test.
      * @param message    Message to display on error.
      */
    def isOk[T](value: T): Unit = js.native
    def isOk[T](value: T, message: String): Unit = js.native
    
    /**
      * Asserts that object is sealed (can have new properties added to it
      * and its existing properties cannot be removed).
      *
      * @type T   Type of object
      * @param object   Actual value.
      * @param message   Message to display on error.
      */
    def isSealed[T](`object`: T): Unit = js.native
    def isSealed[T](`object`: T, message: String): Unit = js.native
    
    /**
      * Asserts that value is a string.
      *
      * @type T   Type of value.
      * @param value   Actual value.
      * @param message   Message to display on error.
      */
    def isString[T](value: T): Unit = js.native
    def isString[T](value: T, message: String): Unit = js.native
    
    /**
      * Asserts that value is true.
      *
      * @type T   Type of value.
      * @param value   Actual value.
      * @param message   Message to display on error.
      */
    def isTrue[T](value: T): Unit = js.native
    def isTrue[T](value: T, message: String): Unit = js.native
    
    /**
      * Asserts that value is undefined.
      *
      * @type T   Type of value.
      * @param value   Actual value.
      * @param message   Message to display on error.
      */
    def isUndefined[T](value: T): Unit = js.native
    def isUndefined[T](value: T, message: String): Unit = js.native
    
    /**
      * Asserts that object has a length property with the expected value.
      *
      * @type T   Type of object.
      * @param object   Container object.
      * @param length   Potential expected length of object.
      * @param message   Message to display on error.
      */
    def lengthOf[T /* <: typings.chai.anon.Length */](`object`: T, length: Double): Unit = js.native
    def lengthOf[T /* <: typings.chai.anon.Length */](`object`: T, length: Double, message: String): Unit = js.native
    
    /**
      * Asserts that value matches the regular expression regexp.
      *
      * @param value   Actual value.
      * @param regexp   Potential match of value.
      * @param message   Message to display on error.
      */
    def `match`(value: String, regexp: RegExp): Unit = js.native
    def `match`(value: String, regexp: RegExp, message: String): Unit = js.native
    
    /**
      * Asserts that ‘haystack’ includes ‘needle’. Can be used to assert the inclusion of a subset of properties in an object.
      *
      * Enables the use of dot- and bracket-notation for referencing nested properties.
      * ‘[]’ and ‘.’ in property names can be escaped using double backslashes.Asserts that ‘haystack’ includes ‘needle’.
      * Can be used to assert the inclusion of a subset of properties in an object.
      * Enables the use of dot- and bracket-notation for referencing nested properties.
      * ‘[]’ and ‘.’ in property names can be escaped using double backslashes.
      *
      * @param haystack
      * @param needle
      * @param message   Message to display on error.
      */
    def nestedInclude(haystack: js.Any, needle: js.Any): Unit = js.native
    def nestedInclude(haystack: js.Any, needle: js.Any, message: String): Unit = js.native
    
    /**
      * Asserts that object has a direct or inherited property named by property,
      * which can be a string using dot- and bracket-notation for nested reference.
      *
      * @type T   Type of object.
      * @param object   Object to test.
      * @param property    Property to test.
      * @param message    Message to display on error.
      */
    def nestedProperty[T](`object`: T, property: String): Unit = js.native
    def nestedProperty[T](`object`: T, property: String, message: String): Unit = js.native
    
    /**
      * Asserts that object has a property named by property with value given by value.
      * property can use dot- and bracket-notation for nested reference. Uses a strict equality check (===).
      *
      * @type T   Type of object.
      * @param object   Object to test.
      * @param property    Property to test.
      * @param value    Value to test.
      * @param message    Message to display on error.
      */
    def nestedPropertyVal[T](`object`: T, property: String, value: js.Any): Unit = js.native
    def nestedPropertyVal[T](`object`: T, property: String, value: js.Any, message: String): Unit = js.native
    
    /**
      * Asserts that actual is not deeply equal (==) to expected.
      *
      * @type T   Type of the objects.
      * @param actual   Actual value.
      * @param expected   Potential expected value.
      * @param message   Message to display on error.
      */
    def notDeepEqual[T](actual: T, expected: T): Unit = js.native
    def notDeepEqual[T](actual: T, expected: T, message: String): Unit = js.native
    
    /**
      * Asserts that haystack does not includes needle. Deep equality is used.
      *
      * @param haystack   Container string.
      * @param needle   Potential substring of haystack.
      * @param message   Message to display on error.
      *
      * @deprecated Does not have any effect on string. Use {@link Assert#notInclude} instead.
      */
    def notDeepInclude(haystack: String, needle: String): Unit = js.native
    def notDeepInclude(haystack: String, needle: String, message: String): Unit = js.native
    /**
      * Asserts that haystack does not includes needle. Deep equality is used.
      *
      * @type T   Type of haystack.
      * @param haystack   Object.
      * @param needle   Potential subset of the haystack's properties.
      * @param message   Message to display on error.
      */
    def notDeepInclude[T](haystack: T, needle: Partial[T]): Unit = js.native
    def notDeepInclude[T](haystack: T, needle: Partial[T], message: String): Unit = js.native
    /**
      * Asserts that haystack does not includes needle. Deep equality is used.
      *
      * @type T   Type of values in haystack.
      * @param haystack   Container array, set or map.
      * @param needle   Potential value contained in haystack.
      * @param message   Message to display on error.
      */
    def notDeepInclude[T](haystack: js.Array[T], needle: T): Unit = js.native
    def notDeepInclude[T](haystack: js.Array[T], needle: T, message: String): Unit = js.native
    def notDeepInclude[T](haystack: ReadonlyMap[_, T], needle: T): Unit = js.native
    def notDeepInclude[T](haystack: ReadonlyMap[_, T], needle: T, message: String): Unit = js.native
    def notDeepInclude[T](haystack: ReadonlySet[T], needle: T): Unit = js.native
    def notDeepInclude[T](haystack: ReadonlySet[T], needle: T, message: String): Unit = js.native
    
    /**
      * Asserts that ‘haystack’ does not include ‘needle’. Can be used to assert the absence of a subset of properties in an object while checking for deep equality.
      *
      * Enables the use of dot- and bracket-notation for referencing nested properties.
      * ‘[]’ and ‘.’ in property names can be escaped using double backslashes.Asserts that ‘haystack’ includes ‘needle’.
      * Can be used to assert the inclusion of a subset of properties in an object.
      * Enables the use of dot- and bracket-notation for referencing nested properties.
      * ‘[]’ and ‘.’ in property names can be escaped using double backslashes.
      *
      * @param haystack
      * @param needle
      * @param message   Message to display on error.
      */
    def notDeepNestedInclude(haystack: js.Any, needle: js.Any): Unit = js.native
    def notDeepNestedInclude(haystack: js.Any, needle: js.Any, message: String): Unit = js.native
    
    /**
      * Asserts that object does not have a property named by property with value given by value.
      * property can use dot- and bracket-notation for nested reference. Uses a deep equality check.
      *
      * @type T   Type of object.
      * @param object   Object to test.
      * @param property    Property to test.
      * @param value    Value to test.
      * @param message    Message to display on error.
      */
    def notDeepNestedPropertyVal[T](`object`: T, property: String, value: js.Any): Unit = js.native
    def notDeepNestedPropertyVal[T](`object`: T, property: String, value: js.Any, message: String): Unit = js.native
    
    /**
      * Asserts that ‘haystack’ includes ‘needle’. Can be used to assert the absence of a subset of properties in an object while ignoring inherited properties and checking for deep equality.
      *
      * @param haystack
      * @param needle
      * @param message   Message to display on error.
      */
    def notDeepOwnInclude(haystack: js.Any, needle: js.Any): Unit = js.native
    def notDeepOwnInclude(haystack: js.Any, needle: js.Any, message: String): Unit = js.native
    
    /**
      * Asserts that object does not have a property named by property, which can be a
      * string using dot- and bracket-notation for deep reference.
      *
      * @type T   Type of object.
      * @param object   Container object.
      * @param property   Potential contained property of object.
      * @param message   Message to display on error.
      */
    def notDeepProperty[T](`object`: T, property: String): Unit = js.native
    def notDeepProperty[T](`object`: T, property: String, message: String): Unit = js.native
    
    /**
      * Asserts that object does not have a property named by property, which can be a
      * string using dot- and bracket-notation for deep reference.
      *
      * @type T   Type of object.
      * @type V   Type of value.
      * @param object   Container object.
      * @param property   Potential contained property of object.
      * @param value   Potential expected property value.
      * @param message   Message to display on error.
      */
    def notDeepPropertyVal[T, V](`object`: T, property: String, value: V): Unit = js.native
    def notDeepPropertyVal[T, V](`object`: T, property: String, value: V, message: String): Unit = js.native
    
    /**
      * Asserts non-strict inequality (==) of actual and expected.
      *
      * @type T   Type of the objects.
      * @param actual   Actual value.
      * @param expected   Potential expected value.
      * @param message   Message to display on error.
      */
    def notEqual[T](actual: T, expected: T): Unit = js.native
    def notEqual[T](actual: T, expected: T, message: String): Unit = js.native
    
    /**
      * Asserts that the target is either null or undefined.
      *
      * @type T   Type of value.
      * @param value   Actual value.
      * @param message    Message to display on error.
      */
    def notExists[T](value: T): Unit = js.native
    def notExists[T](value: T, message: String): Unit = js.native
    
    /**
      * Asserts that object is not extensible.
      *
      * @type T   Type of object
      * @param object   Actual value.
      * @param message   Message to display on error.
      */
    def notExtensible[T](`object`: T): Unit = js.native
    def notExtensible[T](`object`: T, message: String): Unit = js.native
    
    /**
      * Asserts that object is not frozen (cannot have new properties added to it
      * and its existing properties cannot be removed).
      *
      * @type T   Type of object
      * @param object   Actual value.
      * @param message   Message to display on error.
      */
    def notFrozen[T](`object`: T): Unit = js.native
    def notFrozen[T](`object`: T, message: String): Unit = js.native
    
    /**
      * Asserts that haystack does not includes needle.
      *
      * @param haystack   Container string.
      * @param needle   Potential substring of haystack.
      * @param message   Message to display on error.
      */
    def notInclude(haystack: String, needle: String): Unit = js.native
    def notInclude(haystack: String, needle: String, message: String): Unit = js.native
    /**
      * Asserts that haystack does not includes needle.
      *
      * @type T   Type of haystack.
      * @param haystack   Object.
      * @param needle   Potential subset of the haystack's properties.
      * @param message   Message to display on error.
      */
    def notInclude[T](haystack: T, needle: Partial[T]): Unit = js.native
    def notInclude[T](haystack: T, needle: Partial[T], message: String): Unit = js.native
    /**
      * Asserts that haystack does not includes needle.
      *
      * @type T   Type of values in haystack.
      * @param haystack   Container array, set or map.
      * @param needle   Potential value contained in haystack.
      * @param message   Message to display on error.
      */
    def notInclude[T](haystack: js.Array[T], needle: T): Unit = js.native
    def notInclude[T](haystack: js.Array[T], needle: T, message: String): Unit = js.native
    def notInclude[T](haystack: ReadonlyMap[_, T], needle: T): Unit = js.native
    def notInclude[T](haystack: ReadonlyMap[_, T], needle: T, message: String): Unit = js.native
    def notInclude[T](haystack: ReadonlySet[T], needle: T): Unit = js.native
    def notInclude[T](haystack: ReadonlySet[T], needle: T, message: String): Unit = js.native
    /**
      * Asserts that haystack does not includes needle.
      *
      * @type T   Type of values in haystack.
      * @param haystack   WeakSet container.
      * @param needle   Potential value contained in haystack.
      * @param message   Message to display on error.
      */
    def notInclude[T /* <: js.Object */](haystack: WeakSet[T], needle: T): Unit = js.native
    def notInclude[T /* <: js.Object */](haystack: WeakSet[T], needle: T, message: String): Unit = js.native
    
    /**
      * Asserts that subset isn’t included in superset in the same order beginning with the first element in superset.
      * Uses a deep equality check.
      *
      * @type T   Type of set values.
      * @param superset   Actual set of values.
      * @param subset   Potential contained set of values.
      * @param message   Message to display on error.
      */
    def notIncludeDeepOrderedMembers[T](superset: js.Array[T], subset: js.Array[T]): Unit = js.native
    def notIncludeDeepOrderedMembers[T](superset: js.Array[T], subset: js.Array[T], message: String): Unit = js.native
    
    /**
      * Asserts that subset isn’t included in superset in the same order beginning with the first element in superset.
      * Uses a strict equality check (===).
      *
      * @type T   Type of set values.
      * @param superset   Actual set of values.
      * @param subset   Potential contained set of values.
      * @param message   Message to display on error.
      */
    def notIncludeOrderedMembers[T](superset: js.Array[T], subset: js.Array[T]): Unit = js.native
    def notIncludeOrderedMembers[T](superset: js.Array[T], subset: js.Array[T], message: String): Unit = js.native
    
    /**
      * Asserts that value is not an instance of constructor.
      *
      * @type T   Type of value.
      * @param value   Actual value.
      * @param constructor   Potential expected contructor of value.
      * @param message   Message to display on error.
      */
    def notInstanceOf[T](value: T, `type`: js.Function): Unit = js.native
    def notInstanceOf[T](value: T, `type`: js.Function, message: String): Unit = js.native
    
    /**
      * Asserts that value does not match the regular expression regexp.
      *
      * @param value   Actual value.
      * @param regexp   Potential match of value.
      * @param message   Message to display on error.
      */
    def notMatch(expected: js.Any, regexp: RegExp): Unit = js.native
    def notMatch(expected: js.Any, regexp: RegExp, message: String): Unit = js.native
    
    /**
      * Asserts that ‘haystack’ does not include ‘needle’. Can be used to assert the absence of a subset of properties in an object.
      *
      * Enables the use of dot- and bracket-notation for referencing nested properties.
      * ‘[]’ and ‘.’ in property names can be escaped using double backslashes.Asserts that ‘haystack’ includes ‘needle’.
      * Can be used to assert the inclusion of a subset of properties in an object.
      * Enables the use of dot- and bracket-notation for referencing nested properties.
      * ‘[]’ and ‘.’ in property names can be escaped using double backslashes.
      *
      * @param haystack
      * @param needle
      * @param message   Message to display on error.
      */
    def notNestedInclude(haystack: js.Any, needle: js.Any): Unit = js.native
    def notNestedInclude(haystack: js.Any, needle: js.Any, message: String): Unit = js.native
    
    /**
      * Asserts that object does not have a property named by property,
      * which can be a string using dot- and bracket-notation for nested reference.
      * The property cannot exist on the object nor anywhere in its prototype chain.
      *
      * @type T   Type of object.
      * @param object   Object to test.
      * @param property    Property to test.
      * @param message    Message to display on error.
      */
    def notNestedProperty[T](`object`: T, property: String): Unit = js.native
    def notNestedProperty[T](`object`: T, property: String, message: String): Unit = js.native
    
    /**
      * Asserts that object does not have a property named by property with value given by value.
      * property can use dot- and bracket-notation for nested reference. Uses a strict equality check (===).
      *
      * @type T   Type of object.
      * @param object   Object to test.
      * @param property    Property to test.
      * @param value    Value to test.
      * @param message    Message to display on error.
      */
    def notNestedPropertyVal[T](`object`: T, property: String, value: js.Any): Unit = js.native
    def notNestedPropertyVal[T](`object`: T, property: String, value: js.Any, message: String): Unit = js.native
    
    /**
      * Asserts that object is falsy.
      *
      * @type T   Type of object.
      * @param object   Object to test.
      * @param message    Message to display on error.
      */
    def notOk[T](value: T): Unit = js.native
    def notOk[T](value: T, message: String): Unit = js.native
    
    /**
      * Asserts that ‘haystack’ includes ‘needle’. Can be used to assert the absence of a subset of properties in an object while ignoring inherited properties.
      *
      * @param haystack
      * @param needle
      * @param message   Message to display on error.
      */
    def notOwnInclude(haystack: js.Any, needle: js.Any): Unit = js.native
    def notOwnInclude(haystack: js.Any, needle: js.Any, message: String): Unit = js.native
    
    /**
      * Asserts that object has a property named by property.
      *
      * @type T   Type of object.
      * @param object   Container object.
      * @param property   Potential contained property of object.
      * @param message   Message to display on error.
      */
    def notProperty[T](`object`: T, property: String): Unit = js.native
    def notProperty[T](`object`: T, property: String, message: String): Unit = js.native
    
    /**
      * Asserts that object has a property named by property with value given by value.
      *
      * @type T   Type of object.
      * @type V   Type of value.
      * @param object   Container object.
      * @param property   Potential contained property of object.
      * @param value   Potential expected property value.
      * @param message   Message to display on error.
      */
    def notPropertyVal[T, V](`object`: T, property: String, value: V): Unit = js.native
    def notPropertyVal[T, V](`object`: T, property: String, value: V, message: String): Unit = js.native
    
    /**
      * Asserts that set1 and set2 don’t have the same members in the same order.
      * Uses a deep equality check.
      *
      * @type T   Type of set values.
      * @param set1   Actual set of values.
      * @param set2   Potential expected set of values.
      * @param message   Message to display on error.
      */
    def notSameDeepOrderedMembers[T](set1: js.Array[T], set2: js.Array[T]): Unit = js.native
    def notSameDeepOrderedMembers[T](set1: js.Array[T], set2: js.Array[T], message: String): Unit = js.native
    
    /**
      * Asserts that set1 and set2 don’t have the same members in the same order.
      * Uses a strict equality check (===).
      *
      * @type T   Type of set values.
      * @param set1   Actual set of values.
      * @param set2   Potential expected set of values.
      * @param message   Message to display on error.
      */
    def notSameOrderedMembers[T](set1: js.Array[T], set2: js.Array[T]): Unit = js.native
    def notSameOrderedMembers[T](set1: js.Array[T], set2: js.Array[T], message: String): Unit = js.native
    
    /**
      * Asserts that object is not sealed.
      *
      * @type T   Type of object
      * @param object   Actual value.
      * @param message   Message to display on error.
      */
    def notSealed[T](`object`: T): Unit = js.native
    def notSealed[T](`object`: T, message: String): Unit = js.native
    
    /**
      * Asserts strict inequality (==) of actual and expected.
      *
      * @type T   Type of the objects.
      * @param actual   Actual value.
      * @param expected   Potential expected value.
      * @param message   Message to display on error.
      */
    def notStrictEqual[T](actual: T, expected: T): Unit = js.native
    def notStrictEqual[T](actual: T, expected: T, message: String): Unit = js.native
    
    /**
      * Asserts that value's type is not name, as determined by Object.prototype.toString.
      *
      * @type T   Type of value.
      * @param value   Actual value.
      * @param name   Potential expected type name of value.
      * @param message   Message to display on error.
      */
    def notTypeOf[T](value: T, name: String): Unit = js.native
    def notTypeOf[T](value: T, name: String, message: String): Unit = js.native
    
    /**
      * Asserts that object is truthy.
      *
      * @type T   Type of object.
      * @param object   Object to test.
      * @param message    Message to display on error.
      */
    def ok[T](value: T): Unit = js.native
    def ok[T](value: T, message: String): Unit = js.native
    
    /**
      * Asserts that non-object, non-array value inList appears in the flat array list.
      *
      * @type T   Type of list values.
      * @param inList   Value expected to be in the list.
      * @param list   List of values.
      * @param message   Message to display on error.
      */
    def oneOf[T](inList: T, list: js.Array[T]): Unit = js.native
    def oneOf[T](inList: T, list: js.Array[T], message: String): Unit = js.native
    
    /**
      * Compares two values using operator.
      *
      * @param val1   Left value during comparison.
      * @param operator   Comparison operator.
      * @param val2   Right value during comparison.
      * @param message   Message to display on error.
      */
    def operator(val1: OperatorComparable, operator: Operator, val2: OperatorComparable): Unit = js.native
    def operator(val1: OperatorComparable, operator: Operator, val2: OperatorComparable, message: String): Unit = js.native
    
    /**
      * Asserts that ‘haystack’ includes ‘needle’. Can be used to assert the inclusion of a subset of properties in an object while ignoring inherited properties.
      *
      * @param haystack
      * @param needle
      * @param message   Message to display on error.
      */
    def ownInclude(haystack: js.Any, needle: js.Any): Unit = js.native
    def ownInclude(haystack: js.Any, needle: js.Any, message: String): Unit = js.native
    
    /**
      * Asserts that object has a property named by property.
      *
      * @type T   Type of object.
      * @param object   Container object.
      * @param property   Potential contained property of object.
      * @param message   Message to display on error.
      */
    def property[T](`object`: T, property: String): Unit = js.native
    def property[T](`object`: T, property: String, message: String): Unit = js.native
    
    /**
      * Asserts that object has a property named by property with value given by value.
      *
      * @type T   Type of object.
      * @type V   Type of value.
      * @param object   Container object.
      * @param property   Potential contained property of object.
      * @param value   Potential expected property value.
      * @param message   Message to display on error.
      */
    def propertyVal[T, V](`object`: T, property: String, value: V): Unit = js.native
    def propertyVal[T, V](`object`: T, property: String, value: V, message: String): Unit = js.native
    
    /**
      * Asserts that set1 and set2 have the same members using deep equality checking.
      * Order is not take into account.
      *
      * @type T   Type of set values.
      * @param set1   Actual set of values.
      * @param set2   Potential expected set of values.
      * @param message   Message to display on error.
      */
    def sameDeepMembers[T](set1: js.Array[T], set2: js.Array[T]): Unit = js.native
    def sameDeepMembers[T](set1: js.Array[T], set2: js.Array[T], message: String): Unit = js.native
    
    /**
      * Asserts that set1 and set2 have the same members in the same order.
      * Uses a deep equality check.
      *
      * @type T   Type of set values.
      * @param set1   Actual set of values.
      * @param set2   Potential expected set of values.
      * @param message   Message to display on error.
      */
    def sameDeepOrderedMembers[T](set1: js.Array[T], set2: js.Array[T]): Unit = js.native
    def sameDeepOrderedMembers[T](set1: js.Array[T], set2: js.Array[T], message: String): Unit = js.native
    
    /**
      * Asserts that set1 and set2 have the same members. Order is not take into account.
      *
      * @type T   Type of set values.
      * @param set1   Actual set of values.
      * @param set2   Potential expected set of values.
      * @param message   Message to display on error.
      */
    def sameMembers[T](set1: js.Array[T], set2: js.Array[T]): Unit = js.native
    def sameMembers[T](set1: js.Array[T], set2: js.Array[T], message: String): Unit = js.native
    
    /**
      * Asserts that set1 and set2 have the same members in the same order.
      * Uses a strict equality check (===).
      *
      * @type T   Type of set values.
      * @param set1   Actual set of values.
      * @param set2   Potential expected set of values.
      * @param message   Message to display on error.
      */
    def sameOrderedMembers[T](set1: js.Array[T], set2: js.Array[T]): Unit = js.native
    def sameOrderedMembers[T](set1: js.Array[T], set2: js.Array[T], message: String): Unit = js.native
    
    /**
      * Asserts that object is sealed (can have new properties added to it
      * and its existing properties cannot be removed).
      *
      * @type T   Type of object
      * @param object   Actual value.
      * @param message   Message to display on error.
      */
    def `sealed`[T](`object`: T): Unit = js.native
    def `sealed`[T](`object`: T, message: String): Unit = js.native
    
    /**
      * Asserts strict equality (===) of actual and expected.
      *
      * @type T   Type of the objects.
      * @param actual   Actual value.
      * @param expected   Potential expected value.
      * @param message   Message to display on error.
      */
    def strictEqual[T](actual: T, expected: T): Unit = js.native
    def strictEqual[T](actual: T, expected: T, message: String): Unit = js.native
    
    /**
      * Asserts that fn will throw an error.
      *
      * @param fn   Function that may throw.
      * @param message   Message to display on error.
      */
    def `throw`(fn: js.Function0[Unit]): Unit = js.native
    /**
      * Asserts that function will throw an error that is an instance of constructor.
      *
      * @param fn   Function that may throw.
      * @param constructor   Potential expected error constructor.
      * @param message   Message to display on error.
      */
    def `throw`(fn: js.Function0[Unit], constructor: ErrorConstructor): Unit = js.native
    def `throw`(fn: js.Function0[Unit], constructor: ErrorConstructor, message: String): Unit = js.native
    /**
      * Asserts that function will throw an error that is an instance of constructor
      * and an error with message matching regexp.
      *
      * @param fn   Function that may throw.
      * @param constructor   Potential expected error constructor.
      * @param message   Message to display on error.
      */
    def `throw`(fn: js.Function0[Unit], constructor: ErrorConstructor, regExp: RegExp): Unit = js.native
    def `throw`(fn: js.Function0[Unit], message: String): Unit = js.native
    /**
      * Asserts that function will throw an error with message matching regexp.
      *
      * @param fn   Function that may throw.
      * @param regExp   Potential expected message match.
      * @param message   Message to display on error.
      */
    def `throw`(fn: js.Function0[Unit], regExp: RegExp): Unit = js.native
    
    /**
      * Asserts that fn will throw an error.
      *
      * @param fn   Function that may throw.
      * @param message   Message to display on error.
      */
    def throws(fn: js.Function0[Unit]): Unit = js.native
    /**
      * Asserts that function will throw an error that is an instance of constructor
      * and an error with message matching regexp.
      *
      * @param fn   Function that may throw.
      * @param constructor   Potential expected error constructor.
      * @param message   Message to display on error.
      */
    def throws(fn: js.Function0[Unit], constructor: ErrorConstructor, regExp: RegExp): Unit = js.native
    def throws(fn: js.Function0[Unit], errType: ErrorConstructor): Unit = js.native
    def throws(fn: js.Function0[Unit], errType: ErrorConstructor, message: String): Unit = js.native
    /**
      * Asserts that function will throw an error with message matching regexp.
      *
      * @param fn   Function that may throw.
      * @param errType  Potential expected message match or error constructor.
      * @param message   Message to display on error.
      */
    def throws(fn: js.Function0[Unit], errType: RegExp): Unit = js.native
    def throws(fn: js.Function0[Unit], errType: RegExp, message: String): Unit = js.native
    def throws(fn: js.Function0[Unit], message: String): Unit = js.native
    
    /**
      * Asserts that value's type is name, as determined by Object.prototype.toString.
      *
      * @type T   Type of value.
      * @param value   Actual value.
      * @param name   Potential expected type name of value.
      * @param message   Message to display on error.
      */
    def typeOf[T](value: T, name: String): Unit = js.native
    def typeOf[T](value: T, name: String, message: String): Unit = js.native
  }
  
  type AssertStatic = Assert
  
  @js.native
  trait Assertion
    extends LanguageChains
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
    def Throw(constructor: js.Function): Assertion = js.native
    def Throw(constructor: js.Function, expected: js.UndefOr[scala.Nothing], message: String): Assertion = js.native
    def Throw(constructor: js.Function, expected: String): Assertion = js.native
    def Throw(constructor: js.Function, expected: String, message: String): Assertion = js.native
    def Throw(constructor: js.Function, expected: RegExp): Assertion = js.native
    def Throw(constructor: js.Function, expected: RegExp, message: String): Assertion = js.native
    def Throw(constructor: Error): Assertion = js.native
    def Throw(constructor: Error, expected: js.UndefOr[scala.Nothing], message: String): Assertion = js.native
    def Throw(constructor: Error, expected: String): Assertion = js.native
    def Throw(constructor: Error, expected: String, message: String): Assertion = js.native
    def Throw(constructor: Error, expected: RegExp): Assertion = js.native
    def Throw(constructor: Error, expected: RegExp, message: String): Assertion = js.native
    def Throw(expected: js.UndefOr[scala.Nothing], message: String): Assertion = js.native
    def Throw(expected: String): Assertion = js.native
    def Throw(expected: String, message: String): Assertion = js.native
    def Throw(expected: RegExp): Assertion = js.native
    def Throw(expected: RegExp, message: String): Assertion = js.native
    @JSName("Throw")
    var Throw_Original: Throw = js.native
    
    def a(`type`: String): Assertion = js.native
    def a(`type`: String, message: String): Assertion = js.native
    @JSName("a")
    var a_Original: TypeComparison = js.native
    
    var all: KeyFilter = js.native
    
    def an(`type`: String): Assertion = js.native
    def an(`type`: String, message: String): Assertion = js.native
    @JSName("an")
    var an_Original: TypeComparison = js.native
    
    var any: KeyFilter = js.native
    
    def approximately(expected: Double, delta: Double): Assertion = js.native
    def approximately(expected: Double, delta: Double, message: String): Assertion = js.native
    @JSName("approximately")
    var approximately_Original: CloseTo = js.native
    
    def arguments(`type`: String): Assertion = js.native
    def arguments(`type`: String, message: String): Assertion = js.native
    @JSName("arguments")
    var arguments_Original: Assertion = js.native
    
    def change(`object`: Object): Assertion = js.native
    def change(`object`: Object, property: js.UndefOr[scala.Nothing], message: String): Assertion = js.native
    def change(`object`: Object, property: String): Assertion = js.native
    def change(`object`: Object, property: String, message: String): Assertion = js.native
    @JSName("change")
    var change_Original: PropertyChange = js.native
    
    def changes(`object`: Object): Assertion = js.native
    def changes(`object`: Object, property: js.UndefOr[scala.Nothing], message: String): Assertion = js.native
    def changes(`object`: Object, property: String): Assertion = js.native
    def changes(`object`: Object, property: String, message: String): Assertion = js.native
    @JSName("changes")
    var changes_Original: PropertyChange = js.native
    
    def closeTo(expected: Double, delta: Double): Assertion = js.native
    def closeTo(expected: Double, delta: Double, message: String): Assertion = js.native
    @JSName("closeTo")
    var closeTo_Original: CloseTo = js.native
    
    def contain(value: js.Any): Assertion = js.native
    def contain(value: js.Any, message: String): Assertion = js.native
    @JSName("contain")
    var contain_Original: Include = js.native
    
    def contains(value: js.Any): Assertion = js.native
    def contains(value: js.Any, message: String): Assertion = js.native
    @JSName("contains")
    var contains_Original: Include = js.native
    
    def decrease(`object`: Object): Assertion = js.native
    def decrease(`object`: Object, property: js.UndefOr[scala.Nothing], message: String): Assertion = js.native
    def decrease(`object`: Object, property: String): Assertion = js.native
    def decrease(`object`: Object, property: String, message: String): Assertion = js.native
    @JSName("decrease")
    var decrease_Original: PropertyChange = js.native
    
    def decreases(`object`: Object): Assertion = js.native
    def decreases(`object`: Object, property: js.UndefOr[scala.Nothing], message: String): Assertion = js.native
    def decreases(`object`: Object, property: String): Assertion = js.native
    def decreases(`object`: Object, property: String, message: String): Assertion = js.native
    @JSName("decreases")
    var decreases_Original: PropertyChange = js.native
    
    var deep: Deep = js.native
    
    def empty(`type`: String): Assertion = js.native
    def empty(`type`: String, message: String): Assertion = js.native
    @JSName("empty")
    var empty_Original: Assertion = js.native
    
    def eq(value: js.Any): Assertion = js.native
    def eq(value: js.Any, message: String): Assertion = js.native
    @JSName("eq")
    var eq_Original: Equal = js.native
    
    def eql(value: js.Any): Assertion = js.native
    def eql(value: js.Any, message: String): Assertion = js.native
    @JSName("eql")
    var eql_Original: Equal = js.native
    
    def eqls(value: js.Any): Assertion = js.native
    def eqls(value: js.Any, message: String): Assertion = js.native
    @JSName("eqls")
    var eqls_Original: Equal = js.native
    
    def equal(value: js.Any): Assertion = js.native
    def equal(value: js.Any, message: String): Assertion = js.native
    @JSName("equal")
    var equal_Original: Equal = js.native
    
    def equals(value: js.Any): Assertion = js.native
    def equals(value: js.Any, message: String): Assertion = js.native
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
    def haveOwnProperty(name: String, value: js.Any): Assertion = js.native
    def haveOwnProperty(name: String, value: js.Any, message: String): Assertion = js.native
    
    def haveOwnPropertyDescriptor(name: String): Assertion = js.native
    def haveOwnPropertyDescriptor(name: String, descriptor: PropertyDescriptor): Assertion = js.native
    def haveOwnPropertyDescriptor(name: String, descriptor: PropertyDescriptor, message: String): Assertion = js.native
    def haveOwnPropertyDescriptor(name: String, message: String): Assertion = js.native
    @JSName("haveOwnPropertyDescriptor")
    var haveOwnPropertyDescriptor_Original: OwnPropertyDescriptor = js.native
    
    @JSName("haveOwnProperty")
    var haveOwnProperty_Original: Property = js.native
    
    def include(value: js.Any): Assertion = js.native
    def include(value: js.Any, message: String): Assertion = js.native
    @JSName("include")
    var include_Original: Include = js.native
    
    def includes(value: js.Any): Assertion = js.native
    def includes(value: js.Any, message: String): Assertion = js.native
    @JSName("includes")
    var includes_Original: Include = js.native
    
    def increase(`object`: Object): Assertion = js.native
    def increase(`object`: Object, property: js.UndefOr[scala.Nothing], message: String): Assertion = js.native
    def increase(`object`: Object, property: String): Assertion = js.native
    def increase(`object`: Object, property: String, message: String): Assertion = js.native
    @JSName("increase")
    var increase_Original: PropertyChange = js.native
    
    def increases(`object`: Object): Assertion = js.native
    def increases(`object`: Object, property: js.UndefOr[scala.Nothing], message: String): Assertion = js.native
    def increases(`object`: Object, property: String): Assertion = js.native
    def increases(`object`: Object, property: String, message: String): Assertion = js.native
    @JSName("increases")
    var increases_Original: PropertyChange = js.native
    
    def itself(`type`: String): Assertion = js.native
    def itself(`type`: String, message: String): Assertion = js.native
    @JSName("itself")
    var itself_Original: Assertion = js.native
    
    def key(string: String): Assertion = js.native
    
    def keys(keys: String*): Assertion = js.native
    def keys(keys: js.Array[_]): Assertion = js.native
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
    
    def `match`(regexp: RegExp): Assertion = js.native
    def `match`(regexp: RegExp, message: String): Assertion = js.native
    @JSName("match")
    var match_Original: Match = js.native
    
    def matches(regexp: RegExp): Assertion = js.native
    def matches(regexp: RegExp, message: String): Assertion = js.native
    @JSName("matches")
    var matches_Original: Match = js.native
    
    def members(set: js.Array[_]): Assertion = js.native
    def members(set: js.Array[_], message: String): Assertion = js.native
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
    
    def oneOf(list: js.Array[_]): Assertion = js.native
    def oneOf(list: js.Array[_], message: String): Assertion = js.native
    
    var ordered: Ordered = js.native
    
    var own: Own = js.native
    
    def ownProperty(name: String): Assertion = js.native
    def ownProperty(name: String, message: String): Assertion = js.native
    def ownProperty(name: String, value: js.Any): Assertion = js.native
    def ownProperty(name: String, value: js.Any, message: String): Assertion = js.native
    
    def ownPropertyDescriptor(name: String): Assertion = js.native
    def ownPropertyDescriptor(name: String, descriptor: PropertyDescriptor): Assertion = js.native
    def ownPropertyDescriptor(name: String, descriptor: PropertyDescriptor, message: String): Assertion = js.native
    def ownPropertyDescriptor(name: String, message: String): Assertion = js.native
    @JSName("ownPropertyDescriptor")
    var ownPropertyDescriptor_Original: OwnPropertyDescriptor = js.native
    
    @JSName("ownProperty")
    var ownProperty_Original: Property = js.native
    
    def property(name: String): Assertion = js.native
    def property(name: String, message: String): Assertion = js.native
    def property(name: String, value: js.Any): Assertion = js.native
    def property(name: String, value: js.Any, message: String): Assertion = js.native
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
    def `throw`(constructor: js.Function): Assertion = js.native
    def `throw`(constructor: js.Function, expected: js.UndefOr[scala.Nothing], message: String): Assertion = js.native
    def `throw`(constructor: js.Function, expected: String): Assertion = js.native
    def `throw`(constructor: js.Function, expected: String, message: String): Assertion = js.native
    def `throw`(constructor: js.Function, expected: RegExp): Assertion = js.native
    def `throw`(constructor: js.Function, expected: RegExp, message: String): Assertion = js.native
    def `throw`(constructor: Error): Assertion = js.native
    def `throw`(constructor: Error, expected: js.UndefOr[scala.Nothing], message: String): Assertion = js.native
    def `throw`(constructor: Error, expected: String): Assertion = js.native
    def `throw`(constructor: Error, expected: String, message: String): Assertion = js.native
    def `throw`(constructor: Error, expected: RegExp): Assertion = js.native
    def `throw`(constructor: Error, expected: RegExp, message: String): Assertion = js.native
    def `throw`(expected: js.UndefOr[scala.Nothing], message: String): Assertion = js.native
    def `throw`(expected: String): Assertion = js.native
    def `throw`(expected: String, message: String): Assertion = js.native
    def `throw`(expected: RegExp): Assertion = js.native
    def `throw`(expected: RegExp, message: String): Assertion = js.native
    @JSName("throw")
    var throw_Original: Throw = js.native
    
    def throws(): Assertion = js.native
    def throws(constructor: js.Function): Assertion = js.native
    def throws(constructor: js.Function, expected: js.UndefOr[scala.Nothing], message: String): Assertion = js.native
    def throws(constructor: js.Function, expected: String): Assertion = js.native
    def throws(constructor: js.Function, expected: String, message: String): Assertion = js.native
    def throws(constructor: js.Function, expected: RegExp): Assertion = js.native
    def throws(constructor: js.Function, expected: RegExp, message: String): Assertion = js.native
    def throws(constructor: Error): Assertion = js.native
    def throws(constructor: Error, expected: js.UndefOr[scala.Nothing], message: String): Assertion = js.native
    def throws(constructor: Error, expected: String): Assertion = js.native
    def throws(constructor: Error, expected: String, message: String): Assertion = js.native
    def throws(constructor: Error, expected: RegExp): Assertion = js.native
    def throws(constructor: Error, expected: RegExp, message: String): Assertion = js.native
    def throws(expected: js.UndefOr[scala.Nothing], message: String): Assertion = js.native
    def throws(expected: String): Assertion = js.native
    def throws(expected: String, message: String): Assertion = js.native
    def throws(expected: RegExp): Assertion = js.native
    def throws(expected: RegExp, message: String): Assertion = js.native
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
  
  // chai.Assertion.prototype.assert arguments
  type AssertionArgs = js.Tuple6[
    // 'expression to be tested'
  // This parameter is unused and the docs list its type as
  // 'Philosophical', which is mentioned nowhere else in the source. Do
  // with that what you will!
  js.Any, 
    Message, 
    // message if value fails
  Message, 
    // message if negated value fails
  js.Any, 
    js.UndefOr[// expected value
  js.Any], 
    js.UndefOr[// actual value
  Boolean]
  ]
  
  @js.native
  trait AssertionError extends StObject {
    
    var message: String = js.native
    
    var name: String = js.native
    
    var showDiff: Boolean = js.native
    
    var stack: String = js.native
  }
  object AssertionError {
    
    @scala.inline
    def apply(message: String, name: String, showDiff: Boolean, stack: String): AssertionError = {
      val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], showDiff = showDiff.asInstanceOf[js.Any], stack = stack.asInstanceOf[js.Any])
      __obj.asInstanceOf[AssertionError]
    }
    
    @scala.inline
    implicit class AssertionErrorMutableBuilder[Self <: AssertionError] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowDiff(value: Boolean): Self = StObject.set(x, "showDiff", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStack(value: String): Self = StObject.set(x, "stack", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait AssertionPrototype extends StObject {
    
    var _obj: js.Any = js.native
    
    def assert(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type AssertionArgs is not an array type */ args: AssertionArgs
    ): Unit = js.native
  }
  object AssertionPrototype {
    
    @scala.inline
    def apply(_obj: js.Any, assert: AssertionArgs => Unit): AssertionPrototype = {
      val __obj = js.Dynamic.literal(_obj = _obj.asInstanceOf[js.Any], assert = js.Any.fromFunction1(assert))
      __obj.asInstanceOf[AssertionPrototype]
    }
    
    @scala.inline
    implicit class AssertionPrototypeMutableBuilder[Self <: AssertionPrototype] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAssert(value: AssertionArgs => Unit): Self = StObject.set(x, "assert", js.Any.fromFunction1(value))
      
      @scala.inline
      def set_obj(value: js.Any): Self = StObject.set(x, "_obj", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait AssertionStatic
    extends AssertionPrototype
       with Instantiable1[/* target */ js.Any, Assertion]
       with Instantiable2[/* target */ js.Any, /* message */ String, Assertion]
       with Instantiable3[
          /* target */ js.Any, 
          js.UndefOr[/* message */ String], 
          /* ssfi */ js.Function, 
          Assertion
        ]
       with Instantiable4[
          /* target */ js.Any, 
          js.UndefOr[/* message */ String], 
          js.UndefOr[/* ssfi */ js.Function], 
          /* lockSsfi */ Boolean, 
          Assertion
        ] {
    
    def addChainableMethod(name: String, method: js.ThisFunction1[/* this */ this.type, /* repeated */ js.Any, Unit]): Unit = js.native
    def addChainableMethod(
      name: String,
      method: js.ThisFunction1[/* this */ this.type, /* repeated */ js.Any, Unit],
      chainingBehavior: js.Function0[Unit]
    ): Unit = js.native
    
    def addMethod(name: String, method: js.ThisFunction1[/* this */ this.type, /* repeated */ js.Any, _]): Unit = js.native
    
    // Partials of functions on ChaiUtils:
    def addProperty(name: String, getter: js.ThisFunction0[/* this */ this.type, _]): Unit = js.native
    
    // Deprecated properties:
    var includeStack: Boolean = js.native
    
    def overwriteChainableMethod(name: String, method: js.ThisFunction1[/* this */ this.type, /* repeated */ js.Any, Unit]): Unit = js.native
    def overwriteChainableMethod(
      name: String,
      method: js.ThisFunction1[/* this */ this.type, /* repeated */ js.Any, Unit],
      chainingBehavior: js.Function0[Unit]
    ): Unit = js.native
    
    def overwriteMethod(name: String, method: js.ThisFunction1[/* this */ this.type, /* repeated */ js.Any, _]): Unit = js.native
    
    def overwriteProperty(name: String, getter: js.ThisFunction0[/* this */ this.type, _]): Unit = js.native
    
    var showDiff: Boolean = js.native
  }
  
  type ChaiPlugin = js.Function2[/* chai */ ChaiStatic, /* utils */ ChaiUtils, Unit]
  
  @js.native
  trait ChaiStatic extends StObject {
    
    var Assertion: AssertionStatic = js.native
    
    var AssertionError: Instantiable3[
        /* message */ String, 
        /* _props */ js.UndefOr[js.Any], 
        /* ssf */ js.UndefOr[js.Function], 
        typings.chai.Chai.AssertionError
      ] = js.native
    
    /**
      * @param expression    Expression to test for truthiness.
      * @param message    Message to display on error.
      */
    def assert(expression: js.Any): Unit = js.native
    def assert(expression: js.Any, message: String): Unit = js.native
    @JSName("assert")
    var assert_Original: AssertStatic = js.native
    
    var config: Config = js.native
    
    def expect(`val`: js.Any): Assertion = js.native
    def expect(`val`: js.Any, message: String): Assertion = js.native
    @JSName("expect")
    var expect_Original: ExpectStatic = js.native
    
    def should(): Should = js.native
    
    /**
      * Provides a way to extend the internals of Chai
      */
    def use(fn: ChaiPlugin): ChaiStatic = js.native
    
    var util: ChaiUtils = js.native
    
    var version: String = js.native
  }
  
  @js.native
  trait ChaiUtils extends StObject {
    
    def addChainableMethod(
      // object to define the method on, e.g. chai.Assertion.prototype
    ctx: js.Object,
      // method name
    name: String,
      // method itself; any arguments
    method: js.Function1[/* repeated */ js.Any, Unit]
    ): Unit = js.native
    def addChainableMethod(
      // object to define the method on, e.g. chai.Assertion.prototype
    ctx: js.Object,
      // method name
    name: String,
      // method itself; any arguments
    method: js.Function1[/* repeated */ js.Any, Unit],
      // called when property is accessed
    chainingBehavior: js.Function0[Unit]
    ): Unit = js.native
    
    def addLengthGuard(fn: js.Function, assertionName: String, isChainable: Boolean): Unit = js.native
    
    def addMethod(ctx: js.Object, name: String, method: js.Function): Unit = js.native
    
    def addProperty(ctx: js.Object, name: String, getter: js.Function0[_]): Unit = js.native
    
    def compareByInspect(a: js.Object, b: js.Object): `-1` | `1` = js.native
    
    def compatibleConstructor(thrown: Error, errorLike: ErrorConstructor): Boolean = js.native
    def compatibleConstructor(thrown: Error, errorLike: Error): Boolean = js.native
    
    def compatibleInstance(thrown: Error, errorLike: ErrorConstructor): Boolean = js.native
    def compatibleInstance(thrown: Error, errorLike: Error): Boolean = js.native
    
    def compatibleMessage(thrown: Error, errMatcher: String): Boolean = js.native
    def compatibleMessage(thrown: Error, errMatcher: RegExp): Boolean = js.native
    
    def expectTypes(obj: js.Object, types: js.Array[String]): Unit = js.native
    
    def flag(obj: js.Object, key: String): js.Any = js.native
    def flag(obj: js.Object, key: String, value: js.Any): js.Any = js.native
    
    def getActual(obj: js.Object, args: AssertionArgs): js.Any = js.native
    
    def getConstructorName(constructorFn: js.Function): String = js.native
    
    def getEnumerableProperties(obj: js.Object): js.Array[String] = js.native
    
    def getFuncName(constructorFn: js.Function): String | Null = js.native
    
    def getMessage(errorLike: String): String = js.native
    def getMessage(errorLike: Error): String = js.native
    def getMessage(obj: js.Any, args: AssertionArgs): String = js.native
    
    def getOwnEnumerableProperties(obj: js.Object): js.Array[String | js.Symbol] = js.native
    
    def getOwnEnumerablePropertySymbols(obj: js.Object): js.Array[js.Symbol] = js.native
    
    def getPathInfo(obj: js.Object, path: String): PathInfo = js.native
    
    def getPathValue(obj: js.Object, path: String): js.UndefOr[js.Object] = js.native
    
    def getProperties(obj: js.Object): js.Array[String] = js.native
    
    def hasProperty(obj: js.UndefOr[scala.Nothing], name: ObjectProperty): Boolean = js.native
    // Reexports from pathval:
    def hasProperty(obj: js.Object, name: ObjectProperty): Boolean = js.native
    def hasProperty(obj: Null, name: ObjectProperty): Boolean = js.native
    
    def inspect(obj: js.Any): String = js.native
    def inspect(
      obj: js.Any,
      showHidden: js.UndefOr[scala.Nothing],
      depth: js.UndefOr[scala.Nothing],
      colors: Boolean
    ): String = js.native
    def inspect(obj: js.Any, showHidden: js.UndefOr[scala.Nothing], depth: Double): String = js.native
    def inspect(obj: js.Any, showHidden: js.UndefOr[scala.Nothing], depth: Double, colors: Boolean): String = js.native
    def inspect(obj: js.Any, showHidden: Boolean): String = js.native
    def inspect(obj: js.Any, showHidden: Boolean, depth: js.UndefOr[scala.Nothing], colors: Boolean): String = js.native
    def inspect(obj: js.Any, showHidden: Boolean, depth: Double): String = js.native
    def inspect(obj: js.Any, showHidden: Boolean, depth: Double, colors: Boolean): String = js.native
    
    def isProxyEnabled(): Boolean = js.native
    
    def objDisplay(obj: js.Object): Unit = js.native
    
    def overwriteChainableMethod(ctx: js.Object, name: String, method: js.Function1[/* repeated */ js.Any, Unit]): Unit = js.native
    def overwriteChainableMethod(
      ctx: js.Object,
      name: String,
      method: js.Function1[/* repeated */ js.Any, Unit],
      chainingBehavior: js.Function0[Unit]
    ): Unit = js.native
    
    def overwriteMethod(ctx: js.Object, name: String, method: js.Function): Unit = js.native
    
    def overwriteProperty(ctx: js.Object, name: String, getter: js.Function0[_]): Unit = js.native
    
    def proxify(obj: js.Object, nonChainableMethodName: String): js.Object = js.native
    
    def test(obj: js.Object, args: AssertionArgs): Boolean = js.native
    
    def transferFlags(assertion: Assertion, obj: js.Object): Unit = js.native
    def transferFlags(assertion: Assertion, obj: js.Object, includeAll: Boolean): Unit = js.native
  }
  
  type CloseTo = js.Function3[/* expected */ Double, /* delta */ Double, /* message */ js.UndefOr[String], Assertion]
  
  @js.native
  trait Config extends StObject {
    
    /**
      * Default: false
      */
    var includeStack: Boolean = js.native
    
    /**
      * Default: ['then', 'catch', 'inspect', 'toJSON']
      */
    var proxyExcludedKeys: js.Array[String] = js.native
    
    /**
      * Default: true
      */
    var showDiff: Boolean = js.native
    
    /**
      * Default: 40
      */
    var truncateThreshold: Double = js.native
    
    /**
      * Default: true
      */
    var useProxy: Boolean = js.native
  }
  object Config {
    
    @scala.inline
    def apply(
      includeStack: Boolean,
      proxyExcludedKeys: js.Array[String],
      showDiff: Boolean,
      truncateThreshold: Double,
      useProxy: Boolean
    ): Config = {
      val __obj = js.Dynamic.literal(includeStack = includeStack.asInstanceOf[js.Any], proxyExcludedKeys = proxyExcludedKeys.asInstanceOf[js.Any], showDiff = showDiff.asInstanceOf[js.Any], truncateThreshold = truncateThreshold.asInstanceOf[js.Any], useProxy = useProxy.asInstanceOf[js.Any])
      __obj.asInstanceOf[Config]
    }
    
    @scala.inline
    implicit class ConfigMutableBuilder[Self <: Config] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIncludeStack(value: Boolean): Self = StObject.set(x, "includeStack", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProxyExcludedKeys(value: js.Array[String]): Self = StObject.set(x, "proxyExcludedKeys", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProxyExcludedKeysVarargs(value: String*): Self = StObject.set(x, "proxyExcludedKeys", js.Array(value :_*))
      
      @scala.inline
      def setShowDiff(value: Boolean): Self = StObject.set(x, "showDiff", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTruncateThreshold(value: Double): Self = StObject.set(x, "truncateThreshold", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUseProxy(value: Boolean): Self = StObject.set(x, "useProxy", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Deep extends KeyFilter {
    
    def contain(value: js.Any): Assertion = js.native
    def contain(value: js.Any, message: String): Assertion = js.native
    @JSName("contain")
    var contain_Original: Include = js.native
    
    def contains(value: js.Any): Assertion = js.native
    def contains(value: js.Any, message: String): Assertion = js.native
    @JSName("contains")
    var contains_Original: Include = js.native
    
    def eq(value: js.Any): Assertion = js.native
    def eq(value: js.Any, message: String): Assertion = js.native
    @JSName("eq")
    var eq_Original: Equal = js.native
    
    def equal(value: js.Any): Assertion = js.native
    def equal(value: js.Any, message: String): Assertion = js.native
    @JSName("equal")
    var equal_Original: Equal = js.native
    
    def equals(value: js.Any): Assertion = js.native
    def equals(value: js.Any, message: String): Assertion = js.native
    @JSName("equals")
    var equals_Original: Equal = js.native
    
    def include(value: js.Any): Assertion = js.native
    def include(value: js.Any, message: String): Assertion = js.native
    @JSName("include")
    var include_Original: Include = js.native
    
    def includes(value: js.Any): Assertion = js.native
    def includes(value: js.Any, message: String): Assertion = js.native
    @JSName("includes")
    var includes_Original: Include = js.native
    
    var nested: Nested = js.native
    
    var ordered: Ordered = js.native
    
    var own: Own = js.native
    
    def property(name: String): Assertion = js.native
    def property(name: String, message: String): Assertion = js.native
    def property(name: String, value: js.Any): Assertion = js.native
    def property(name: String, value: js.Any, message: String): Assertion = js.native
    @JSName("property")
    var property_Original: Property = js.native
  }
  
  type Equal = js.Function2[/* value */ js.Any, /* message */ js.UndefOr[String], Assertion]
  
  @js.native
  trait ErrorConstructor
    extends Instantiable1[/* args (repeated) */ js.Any, Error]
  
  @js.native
  trait ExpectStatic extends StObject {
    
    def apply(`val`: js.Any): Assertion = js.native
    def apply(`val`: js.Any, message: String): Assertion = js.native
    
    def fail(): scala.Nothing = js.native
    def fail(actual: js.Any, expected: js.Any): scala.Nothing = js.native
    def fail(actual: js.Any, expected: js.Any, message: js.UndefOr[scala.Nothing], operator: Operator): scala.Nothing = js.native
    def fail(actual: js.Any, expected: js.Any, message: String): scala.Nothing = js.native
    def fail(actual: js.Any, expected: js.Any, message: String, operator: Operator): scala.Nothing = js.native
    def fail(message: String): scala.Nothing = js.native
  }
  
  @js.native
  trait Include extends StObject {
    
    def apply(value: js.Any): Assertion = js.native
    def apply(value: js.Any, message: String): Assertion = js.native
    
    var all: KeyFilter = js.native
    
    var any: KeyFilter = js.native
    
    var deep: Deep = js.native
    
    def keys(keys: String*): Assertion = js.native
    def keys(keys: js.Array[_]): Assertion = js.native
    def keys(keys: Object): Assertion = js.native
    @JSName("keys")
    var keys_Original: Keys = js.native
    
    def members(set: js.Array[_]): Assertion = js.native
    def members(set: js.Array[_], message: String): Assertion = js.native
    @JSName("members")
    var members_Original: Members = js.native
    
    var ordered: Ordered = js.native
  }
  
  type InstanceOf = js.Function2[/* constructor */ js.Any, /* message */ js.UndefOr[String], Assertion]
  
  @js.native
  trait KeyFilter extends StObject {
    
    def keys(keys: String*): Assertion = js.native
    def keys(keys: js.Array[_]): Assertion = js.native
    def keys(keys: Object): Assertion = js.native
    @JSName("keys")
    var keys_Original: Keys = js.native
    
    def members(set: js.Array[_]): Assertion = js.native
    def members(set: js.Array[_], message: String): Assertion = js.native
    @JSName("members")
    var members_Original: Members = js.native
  }
  
  @js.native
  trait Keys extends StObject {
    
    def apply(keys: String*): Assertion = js.native
    def apply(keys: js.Array[_]): Assertion = js.native
    def apply(keys: Object): Assertion = js.native
  }
  
  @js.native
  trait LanguageChains extends StObject {
    
    def and(`type`: String): Assertion = js.native
    def and(`type`: String, message: String): Assertion = js.native
    @JSName("and")
    var and_Original: Assertion = js.native
    
    def at(`type`: String): Assertion = js.native
    def at(`type`: String, message: String): Assertion = js.native
    @JSName("at")
    var at_Original: Assertion = js.native
    
    def be(`type`: String): Assertion = js.native
    def be(`type`: String, message: String): Assertion = js.native
    @JSName("be")
    var be_Original: Assertion = js.native
    
    def been(`type`: String): Assertion = js.native
    def been(`type`: String, message: String): Assertion = js.native
    @JSName("been")
    var been_Original: Assertion = js.native
    
    def but(`type`: String): Assertion = js.native
    def but(`type`: String, message: String): Assertion = js.native
    @JSName("but")
    var but_Original: Assertion = js.native
    
    def does(`type`: String): Assertion = js.native
    def does(`type`: String, message: String): Assertion = js.native
    @JSName("does")
    var does_Original: Assertion = js.native
    
    def has(`type`: String): Assertion = js.native
    def has(`type`: String, message: String): Assertion = js.native
    @JSName("has")
    var has_Original: Assertion = js.native
    
    def have(`type`: String): Assertion = js.native
    def have(`type`: String, message: String): Assertion = js.native
    @JSName("have")
    var have_Original: Assertion = js.native
    
    def is(`type`: String): Assertion = js.native
    def is(`type`: String, message: String): Assertion = js.native
    @JSName("is")
    var is_Original: Assertion = js.native
    
    def of(`type`: String): Assertion = js.native
    def of(`type`: String, message: String): Assertion = js.native
    @JSName("of")
    var of_Original: Assertion = js.native
    
    def same(`type`: String): Assertion = js.native
    def same(`type`: String, message: String): Assertion = js.native
    @JSName("same")
    var same_Original: Assertion = js.native
    
    def that(`type`: String): Assertion = js.native
    def that(`type`: String, message: String): Assertion = js.native
    @JSName("that")
    var that_Original: Assertion = js.native
    
    def to(`type`: String): Assertion = js.native
    def to(`type`: String, message: String): Assertion = js.native
    @JSName("to")
    var to_Original: Assertion = js.native
    
    def which(`type`: String): Assertion = js.native
    def which(`type`: String, message: String): Assertion = js.native
    @JSName("which")
    var which_Original: Assertion = js.native
    
    def `with`(`type`: String): Assertion = js.native
    def `with`(`type`: String, message: String): Assertion = js.native
    @JSName("with")
    var with_Original: Assertion = js.native
  }
  
  @js.native
  trait Length
    extends LanguageChains
       with NumericComparison {
    
    def apply(length: Double): Assertion = js.native
    def apply(length: Double, message: String): Assertion = js.native
  }
  
  type Match = js.Function2[/* regexp */ RegExp, /* message */ js.UndefOr[String], Assertion]
  
  type Members = js.Function2[/* set */ js.Array[js.Any], /* message */ js.UndefOr[String], Assertion]
  
  type Message = String | js.Function0[String]
  
  @js.native
  trait Nested extends StObject {
    
    def contain(value: js.Any): Assertion = js.native
    def contain(value: js.Any, message: String): Assertion = js.native
    @JSName("contain")
    var contain_Original: Include = js.native
    
    def contains(value: js.Any): Assertion = js.native
    def contains(value: js.Any, message: String): Assertion = js.native
    @JSName("contains")
    var contains_Original: Include = js.native
    
    def include(value: js.Any): Assertion = js.native
    def include(value: js.Any, message: String): Assertion = js.native
    @JSName("include")
    var include_Original: Include = js.native
    
    def includes(value: js.Any): Assertion = js.native
    def includes(value: js.Any, message: String): Assertion = js.native
    @JSName("includes")
    var includes_Original: Include = js.native
    
    def members(set: js.Array[_]): Assertion = js.native
    def members(set: js.Array[_], message: String): Assertion = js.native
    @JSName("members")
    var members_Original: Members = js.native
    
    def property(name: String): Assertion = js.native
    def property(name: String, message: String): Assertion = js.native
    def property(name: String, value: js.Any): Assertion = js.native
    def property(name: String, value: js.Any, message: String): Assertion = js.native
    @JSName("property")
    var property_Original: Property = js.native
  }
  
  type NumberComparer = js.Function2[/* value */ Double | Date, /* message */ js.UndefOr[String], Assertion]
  
  @js.native
  trait NumericComparison extends StObject {
    
    def above(value: Double): Assertion = js.native
    def above(value: Double, message: String): Assertion = js.native
    def above(value: Date): Assertion = js.native
    def above(value: Date, message: String): Assertion = js.native
    @JSName("above")
    var above_Original: NumberComparer = js.native
    
    def below(value: Double): Assertion = js.native
    def below(value: Double, message: String): Assertion = js.native
    def below(value: Date): Assertion = js.native
    def below(value: Date, message: String): Assertion = js.native
    @JSName("below")
    var below_Original: NumberComparer = js.native
    
    def greaterThan(value: Double): Assertion = js.native
    def greaterThan(value: Double, message: String): Assertion = js.native
    def greaterThan(value: Date): Assertion = js.native
    def greaterThan(value: Date, message: String): Assertion = js.native
    @JSName("greaterThan")
    var greaterThan_Original: NumberComparer = js.native
    
    def gt(value: Double): Assertion = js.native
    def gt(value: Double, message: String): Assertion = js.native
    def gt(value: Date): Assertion = js.native
    def gt(value: Date, message: String): Assertion = js.native
    @JSName("gt")
    var gt_Original: NumberComparer = js.native
    
    def gte(value: Double): Assertion = js.native
    def gte(value: Double, message: String): Assertion = js.native
    def gte(value: Date): Assertion = js.native
    def gte(value: Date, message: String): Assertion = js.native
    @JSName("gte")
    var gte_Original: NumberComparer = js.native
    
    def least(value: Double): Assertion = js.native
    def least(value: Double, message: String): Assertion = js.native
    def least(value: Date): Assertion = js.native
    def least(value: Date, message: String): Assertion = js.native
    @JSName("least")
    var least_Original: NumberComparer = js.native
    
    def lessThan(value: Double): Assertion = js.native
    def lessThan(value: Double, message: String): Assertion = js.native
    def lessThan(value: Date): Assertion = js.native
    def lessThan(value: Date, message: String): Assertion = js.native
    @JSName("lessThan")
    var lessThan_Original: NumberComparer = js.native
    
    def lt(value: Double): Assertion = js.native
    def lt(value: Double, message: String): Assertion = js.native
    def lt(value: Date): Assertion = js.native
    def lt(value: Date, message: String): Assertion = js.native
    @JSName("lt")
    var lt_Original: NumberComparer = js.native
    
    def lte(value: Double): Assertion = js.native
    def lte(value: Double, message: String): Assertion = js.native
    def lte(value: Date): Assertion = js.native
    def lte(value: Date, message: String): Assertion = js.native
    @JSName("lte")
    var lte_Original: NumberComparer = js.native
    
    def most(value: Double): Assertion = js.native
    def most(value: Double, message: String): Assertion = js.native
    def most(value: Date): Assertion = js.native
    def most(value: Date, message: String): Assertion = js.native
    @JSName("most")
    var most_Original: NumberComparer = js.native
    
    def within(start: Double, finish: Double): Assertion = js.native
    def within(start: Double, finish: Double, message: String): Assertion = js.native
    def within(start: Date, finish: Date): Assertion = js.native
    def within(start: Date, finish: Date, message: String): Assertion = js.native
  }
  
  type ObjectProperty = String | js.Symbol | Double
  
  type Operator = String
  
  type OperatorComparable = js.UndefOr[Boolean | Null | Double | String | Date]
  
  @js.native
  trait Ordered extends StObject {
    
    def members(set: js.Array[_]): Assertion = js.native
    def members(set: js.Array[_], message: String): Assertion = js.native
    @JSName("members")
    var members_Original: Members = js.native
  }
  
  @js.native
  trait Own extends StObject {
    
    def contain(value: js.Any): Assertion = js.native
    def contain(value: js.Any, message: String): Assertion = js.native
    @JSName("contain")
    var contain_Original: Include = js.native
    
    def contains(value: js.Any): Assertion = js.native
    def contains(value: js.Any, message: String): Assertion = js.native
    @JSName("contains")
    var contains_Original: Include = js.native
    
    def include(value: js.Any): Assertion = js.native
    def include(value: js.Any, message: String): Assertion = js.native
    @JSName("include")
    var include_Original: Include = js.native
    
    def includes(value: js.Any): Assertion = js.native
    def includes(value: js.Any, message: String): Assertion = js.native
    @JSName("includes")
    var includes_Original: Include = js.native
    
    def property(name: String): Assertion = js.native
    def property(name: String, message: String): Assertion = js.native
    def property(name: String, value: js.Any): Assertion = js.native
    def property(name: String, value: js.Any, message: String): Assertion = js.native
    @JSName("property")
    var property_Original: Property = js.native
  }
  
  @js.native
  trait OwnPropertyDescriptor extends StObject {
    
    def apply(name: String): Assertion = js.native
    def apply(name: String, descriptor: PropertyDescriptor): Assertion = js.native
    def apply(name: String, descriptor: PropertyDescriptor, message: String): Assertion = js.native
    def apply(name: String, message: String): Assertion = js.native
  }
  
  @js.native
  trait PathInfo extends StObject {
    
    var exists: Boolean = js.native
    
    var name: String = js.native
    
    var parent: js.Object = js.native
    
    var value: js.UndefOr[js.Any] = js.native
  }
  object PathInfo {
    
    @scala.inline
    def apply(exists: Boolean, name: String, parent: js.Object): PathInfo = {
      val __obj = js.Dynamic.literal(exists = exists.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any])
      __obj.asInstanceOf[PathInfo]
    }
    
    @scala.inline
    implicit class PathInfoMutableBuilder[Self <: PathInfo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setExists(value: Boolean): Self = StObject.set(x, "exists", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParent(value: js.Object): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  @js.native
  trait Property extends StObject {
    
    def apply(name: String): Assertion = js.native
    def apply(name: String, message: String): Assertion = js.native
    def apply(name: String, value: js.Any): Assertion = js.native
    def apply(name: String, value: js.Any, message: String): Assertion = js.native
  }
  
  type PropertyChange = js.Function3[
    /* object */ Object, 
    /* property */ js.UndefOr[String], 
    /* message */ js.UndefOr[String], 
    Assertion
  ]
  
  type RespondTo = js.Function2[/* method */ String, /* message */ js.UndefOr[String], Assertion]
  
  type Satisfy = js.Function2[/* matcher */ js.Function, /* message */ js.UndefOr[String], Assertion]
  
  @js.native
  trait Should extends ShouldAssertion {
    
    def fail(): scala.Nothing = js.native
    def fail(actual: js.Any, expected: js.Any): scala.Nothing = js.native
    def fail(actual: js.Any, expected: js.Any, message: js.UndefOr[scala.Nothing], operator: Operator): scala.Nothing = js.native
    def fail(actual: js.Any, expected: js.Any, message: String): scala.Nothing = js.native
    def fail(actual: js.Any, expected: js.Any, message: String, operator: Operator): scala.Nothing = js.native
    def fail(message: String): scala.Nothing = js.native
    
    var not: ShouldAssertion = js.native
  }
  
  @js.native
  trait ShouldAssertion extends StObject {
    
    def Throw(actual: js.Function): Unit = js.native
    def Throw(actual: js.Function, constructor: js.Function): Unit = js.native
    def Throw(
      actual: js.Function,
      constructor: js.Function,
      expected: js.UndefOr[scala.Nothing],
      message: String
    ): Unit = js.native
    def Throw(actual: js.Function, constructor: js.Function, expected: String): Unit = js.native
    def Throw(actual: js.Function, constructor: js.Function, expected: String, message: String): Unit = js.native
    def Throw(actual: js.Function, constructor: js.Function, expected: RegExp): Unit = js.native
    def Throw(actual: js.Function, constructor: js.Function, expected: RegExp, message: String): Unit = js.native
    def Throw(actual: js.Function, constructor: Error): Unit = js.native
    def Throw(actual: js.Function, constructor: Error, expected: js.UndefOr[scala.Nothing], message: String): Unit = js.native
    def Throw(actual: js.Function, constructor: Error, expected: String): Unit = js.native
    def Throw(actual: js.Function, constructor: Error, expected: String, message: String): Unit = js.native
    def Throw(actual: js.Function, constructor: Error, expected: RegExp): Unit = js.native
    def Throw(actual: js.Function, constructor: Error, expected: RegExp, message: String): Unit = js.native
    def Throw(actual: js.Function, expected: js.UndefOr[scala.Nothing], message: String): Unit = js.native
    def Throw(actual: js.Function, expected: String): Unit = js.native
    def Throw(actual: js.Function, expected: String, message: String): Unit = js.native
    def Throw(actual: js.Function, expected: RegExp): Unit = js.native
    def Throw(actual: js.Function, expected: RegExp, message: String): Unit = js.native
    @JSName("Throw")
    var Throw_Original: ShouldThrow = js.native
    
    def equal(value1: js.Any, value2: js.Any): Unit = js.native
    def equal(value1: js.Any, value2: js.Any, message: String): Unit = js.native
    
    def exist(value: js.Any): Unit = js.native
    def exist(value: js.Any, message: String): Unit = js.native
    
    def `throw`(actual: js.Function): Unit = js.native
    def `throw`(actual: js.Function, constructor: js.Function): Unit = js.native
    def `throw`(
      actual: js.Function,
      constructor: js.Function,
      expected: js.UndefOr[scala.Nothing],
      message: String
    ): Unit = js.native
    def `throw`(actual: js.Function, constructor: js.Function, expected: String): Unit = js.native
    def `throw`(actual: js.Function, constructor: js.Function, expected: String, message: String): Unit = js.native
    def `throw`(actual: js.Function, constructor: js.Function, expected: RegExp): Unit = js.native
    def `throw`(actual: js.Function, constructor: js.Function, expected: RegExp, message: String): Unit = js.native
    def `throw`(actual: js.Function, constructor: Error): Unit = js.native
    def `throw`(actual: js.Function, constructor: Error, expected: js.UndefOr[scala.Nothing], message: String): Unit = js.native
    def `throw`(actual: js.Function, constructor: Error, expected: String): Unit = js.native
    def `throw`(actual: js.Function, constructor: Error, expected: String, message: String): Unit = js.native
    def `throw`(actual: js.Function, constructor: Error, expected: RegExp): Unit = js.native
    def `throw`(actual: js.Function, constructor: Error, expected: RegExp, message: String): Unit = js.native
    def `throw`(actual: js.Function, expected: js.UndefOr[scala.Nothing], message: String): Unit = js.native
    def `throw`(actual: js.Function, expected: String): Unit = js.native
    def `throw`(actual: js.Function, expected: String, message: String): Unit = js.native
    def `throw`(actual: js.Function, expected: RegExp): Unit = js.native
    def `throw`(actual: js.Function, expected: RegExp, message: String): Unit = js.native
    @JSName("throw")
    var throw_Original: ShouldThrow = js.native
  }
  
  @js.native
  trait ShouldThrow extends StObject {
    
    def apply(actual: js.Function): Unit = js.native
    def apply(actual: js.Function, constructor: js.Function): Unit = js.native
    def apply(
      actual: js.Function,
      constructor: js.Function,
      expected: js.UndefOr[scala.Nothing],
      message: String
    ): Unit = js.native
    def apply(actual: js.Function, constructor: js.Function, expected: String): Unit = js.native
    def apply(actual: js.Function, constructor: js.Function, expected: String, message: String): Unit = js.native
    def apply(actual: js.Function, constructor: js.Function, expected: RegExp): Unit = js.native
    def apply(actual: js.Function, constructor: js.Function, expected: RegExp, message: String): Unit = js.native
    def apply(actual: js.Function, constructor: Error): Unit = js.native
    def apply(actual: js.Function, constructor: Error, expected: js.UndefOr[scala.Nothing], message: String): Unit = js.native
    def apply(actual: js.Function, constructor: Error, expected: String): Unit = js.native
    def apply(actual: js.Function, constructor: Error, expected: String, message: String): Unit = js.native
    def apply(actual: js.Function, constructor: Error, expected: RegExp): Unit = js.native
    def apply(actual: js.Function, constructor: Error, expected: RegExp, message: String): Unit = js.native
    def apply(actual: js.Function, expected: js.UndefOr[scala.Nothing], message: String): Unit = js.native
    def apply(actual: js.Function, expected: String): Unit = js.native
    def apply(actual: js.Function, expected: String, message: String): Unit = js.native
    def apply(actual: js.Function, expected: RegExp): Unit = js.native
    def apply(actual: js.Function, expected: RegExp, message: String): Unit = js.native
  }
  
  @js.native
  trait Throw extends StObject {
    
    def apply(): Assertion = js.native
    def apply(constructor: js.Function): Assertion = js.native
    def apply(constructor: js.Function, expected: js.UndefOr[scala.Nothing], message: String): Assertion = js.native
    def apply(constructor: js.Function, expected: String): Assertion = js.native
    def apply(constructor: js.Function, expected: String, message: String): Assertion = js.native
    def apply(constructor: js.Function, expected: RegExp): Assertion = js.native
    def apply(constructor: js.Function, expected: RegExp, message: String): Assertion = js.native
    def apply(constructor: Error): Assertion = js.native
    def apply(constructor: Error, expected: js.UndefOr[scala.Nothing], message: String): Assertion = js.native
    def apply(constructor: Error, expected: String): Assertion = js.native
    def apply(constructor: Error, expected: String, message: String): Assertion = js.native
    def apply(constructor: Error, expected: RegExp): Assertion = js.native
    def apply(constructor: Error, expected: RegExp, message: String): Assertion = js.native
    def apply(expected: js.UndefOr[scala.Nothing], message: String): Assertion = js.native
    def apply(expected: String): Assertion = js.native
    def apply(expected: String, message: String): Assertion = js.native
    def apply(expected: RegExp): Assertion = js.native
    def apply(expected: RegExp, message: String): Assertion = js.native
  }
  
  @js.native
  trait TypeComparison extends StObject {
    
    def apply(`type`: String): Assertion = js.native
    def apply(`type`: String, message: String): Assertion = js.native
    
    def instanceOf(constructor: js.Any): Assertion = js.native
    def instanceOf(constructor: js.Any, message: String): Assertion = js.native
    @JSName("instanceOf")
    var instanceOf_Original: InstanceOf = js.native
    
    def instanceof(constructor: js.Any): Assertion = js.native
    def instanceof(constructor: js.Any, message: String): Assertion = js.native
    @JSName("instanceof")
    var instanceof_Original: InstanceOf = js.native
  }
}
