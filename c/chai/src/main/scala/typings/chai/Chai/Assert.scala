package typings.chai.Chai

import org.scalablytyped.runtime.StringDictionary
import typings.chai.Anon_Length
import typings.chai.Object
import typings.std.Partial
import typings.std.ReadonlyMap
import typings.std.ReadonlySet
import typings.std.RegExp
import typings.std.WeakSet
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Assert extends js.Object {
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
  def Throw(fn: js.Function): Unit = js.native
  /**
    * Asserts that function will throw an error that is an instance of constructor.
    *
    * @param fn   Function that may throw.
    * @param constructor   Potential expected error constructor.
    * @param message   Message to display on error.
    */
  def Throw(fn: js.Function, errType: js.Function): Unit = js.native
  def Throw(fn: js.Function, errType: js.Function, message: String): Unit = js.native
  /**
    * Asserts that function will throw an error that is an instance of constructor
    * and an error with message matching regexp.
    *
    * @param fn   Function that may throw.
    * @param constructor   Potential expected error constructor.
    * @param message   Message to display on error.
    */
  def Throw(fn: js.Function, errType: js.Function, regExp: RegExp): Unit = js.native
  def Throw(fn: js.Function, message: String): Unit = js.native
  /**
    * Asserts that function will throw an error with message matching regexp.
    *
    * @param fn   Function that may throw.
    * @param regExp   Potential expected message match.
    * @param message   Message to display on error.
    */
  def Throw(fn: js.Function, regExp: RegExp): Unit = js.native
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
  def deepPropertyNotVal[T, V](`object`: T, property: String, value: V): Unit = js.native
  def deepPropertyNotVal[T, V](`object`: T, property: String, value: V, message: String): Unit = js.native
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
  def doesNotThrow(fn: js.Function): Unit = js.native
  /**
    * Asserts that function will throw an error that is an instance of constructor.
    *
    * @param fn   Function that may throw.
    * @param constructor   Potential expected error constructor.
    * @param message   Message to display on error.
    */
  def doesNotThrow(fn: js.Function, errType: js.Function): Unit = js.native
  def doesNotThrow(fn: js.Function, errType: js.Function, message: String): Unit = js.native
  /**
    * Asserts that function will throw an error that is an instance of constructor
    * and an error with message matching regexp.
    *
    * @param fn   Function that may throw.
    * @param constructor   Potential expected error constructor.
    * @param message   Message to display on error.
    */
  def doesNotThrow(fn: js.Function, errType: js.Function, regExp: RegExp): Unit = js.native
  def doesNotThrow(fn: js.Function, message: String): Unit = js.native
  /**
    * Asserts that function will throw an error with message matching regexp.
    *
    * @param fn   Function that may throw.
    * @param regExp   Potential expected message match.
    * @param message   Message to display on error.
    */
  def doesNotThrow(fn: js.Function, regExp: RegExp): Unit = js.native
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
    * @type T   Type of the objects.
    * @param actual   Actual value.
    * @param expected   Potential expected value.
    * @param message    Message to display on error.
    * @param operator   Comparison operator, if not strict equality.
    * @remarks Node.js assert module-compatible.
    */
  def fail[T](): Unit = js.native
  def fail[T](actual: T): Unit = js.native
  def fail[T](actual: T, expected: T): Unit = js.native
  def fail[T](actual: T, expected: T, message: String): Unit = js.native
  def fail[T](actual: T, expected: T, message: String, operator: Operator): Unit = js.native
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
    * Asserts that value is not null.
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
    * Asserts that value is not null.
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
  def lengthOf[T /* <: Anon_Length */](`object`: T, length: Double): Unit = js.native
  def lengthOf[T /* <: Anon_Length */](`object`: T, length: Double, message: String): Unit = js.native
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
  def propertyNotVal[T, V](`object`: T, property: String, value: V): Unit = js.native
  def propertyNotVal[T, V](`object`: T, property: String, value: V, message: String): Unit = js.native
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
  def `throw`(fn: js.Function): Unit = js.native
  /**
    * Asserts that function will throw an error that is an instance of constructor.
    *
    * @param fn   Function that may throw.
    * @param constructor   Potential expected error constructor.
    * @param message   Message to display on error.
    */
  def `throw`(fn: js.Function, constructor: js.Function): Unit = js.native
  def `throw`(fn: js.Function, constructor: js.Function, message: String): Unit = js.native
  /**
    * Asserts that function will throw an error that is an instance of constructor
    * and an error with message matching regexp.
    *
    * @param fn   Function that may throw.
    * @param constructor   Potential expected error constructor.
    * @param message   Message to display on error.
    */
  def `throw`(fn: js.Function, constructor: js.Function, regExp: RegExp): Unit = js.native
  def `throw`(fn: js.Function, message: String): Unit = js.native
  /**
    * Asserts that function will throw an error with message matching regexp.
    *
    * @param fn   Function that may throw.
    * @param regExp   Potential expected message match.
    * @param message   Message to display on error.
    */
  def `throw`(fn: js.Function, regExp: RegExp): Unit = js.native
  /**
    * Asserts that fn will throw an error.
    *
    * @param fn   Function that may throw.
    * @param message   Message to display on error.
    */
  def throws(fn: js.Function): Unit = js.native
  def throws(fn: js.Function, errType: js.Function): Unit = js.native
  def throws(fn: js.Function, errType: js.Function, message: String): Unit = js.native
  /**
    * Asserts that function will throw an error that is an instance of constructor
    * and an error with message matching regexp.
    *
    * @param fn   Function that may throw.
    * @param constructor   Potential expected error constructor.
    * @param message   Message to display on error.
    */
  def throws(fn: js.Function, errType: js.Function, regExp: RegExp): Unit = js.native
  /**
    * Asserts that function will throw an error with message matching regexp.
    *
    * @param fn   Function that may throw.
    * @param errType  Potential expected message match or error constructor.
    * @param message   Message to display on error.
    */
  def throws(fn: js.Function, errType: RegExp): Unit = js.native
  def throws(fn: js.Function, errType: RegExp, message: String): Unit = js.native
  def throws(fn: js.Function, message: String): Unit = js.native
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

