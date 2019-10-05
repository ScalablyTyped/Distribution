package typings.d3DashCollection.d3DashCollectionMod

import org.scalablytyped.runtime.StringDictionary
import typings.d3DashCollection.Anon_KeyValueValuesAny
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Nest[Datum, RollupType] extends js.Object {
  /**
    * Applies the nest operator to the specified array, returning an array of key-values entries.
    * Conceptually, this is similar to applying map.entries to the associative array returned by nest.map,
    * but it applies to every level of the hierarchy rather than just the first (outermost) level.
    * Each entry in the returned array corresponds to a distinct key value returned by the first key function.
    * The entry value depends on the number of registered key functions: if there is an additional key, the value is another nested array of entries;
    * otherwise, the value is the array of elements filtered from the input array that have the given key value.
    *
    * NOTE:
    *
    * Strictly speaking the return type of this method is:
    *
    * (1) NestedArray<Datum, RollupType>, if at least one key function was defined,
    *
    * (2) Datum[], if neither a key nor a rollup function were defined, and
    *
    * (3) RollupType, if no keys, but a rollup function were defined.
    *
    * Since (2) and (3) are edge cases with little to no practical relevance, they have been omitted in favour of ease-of-use.
    *
    * Should you determine that this simplification creates an issue in practice, please file an issue on
    * https://github.com/DefinitelyTyped/DefinitelyTyped.
    *
    * The formal, generalized return type under (1) is cumbersome to work with in practice. The recommended approach
    * is to define the type of the variable being assigned the return value using knowledge specific to the use-case at hand.
    * I.e. making use of knowing how many keys are applied, and the nature of any roll-up function will make working with
    * the variable more meaningful, despite the compromise in type-safety.
    *
    * @param array An array to create a nested data structure from.
    */
  def entries(array: js.Array[Datum]): js.Array[Anon_KeyValueValuesAny[RollupType]]
  /**
    * Registers a new key function and returns this nest operator.
    * The key function will be invoked for each element in the input array and must return a string identifier to assign the element to its group.
    * Most often, the function is a simple accessor. (Keys functions are not passed the input array index.)
    *
    * Each time a key is registered, it is pushed onto the end of the internal array of keys,
    * and the nest operator applies an additional level of nesting.
    *
    * @param func A key accessor function being invoked for each element.
    */
  def key(func: js.Function1[/* datum */ Datum, String]): this.type
  /**
    * Applies the nest operator to the specified array, returning a nested map.
    *
    * Each entry in the returned map corresponds to a distinct key value returned by the first key function.
    * The entry value depends on the number of registered key functions: if there is an additional key, the value is another map;
    * otherwise, the value is the array of elements filtered from the input array that have the given key value.
    *
    * NOTE:
    *
    * Strictly speaking the return type of this method is:
    *
    * (1) NestedMap<Datum, RollupType>, if at least one key function was defined,
    *
    * (2) Datum[], if neither a key nor a rollup function were defined, and
    *
    * (3) RollupType, if no keys, but a rollup function were defined.
    *
    * Since (2) and (3) are edge cases with little to no practical relevance, they have been omitted in favour of ease-of-use.
    *
    * Should you determine that this simplification creates an issue in practice, please file an issue on
    * https://github.com/DefinitelyTyped/DefinitelyTyped.
    *
    * The formal, generalized return type under (1) is cumbersome to work with in practice. The recommended approach
    * is to define the type of the variable being assigned the return value using knowledge specific to the use-case at hand.
    * I.e. making use of knowing how many keys are applied, and the nature of any roll-up function will make working with
    * the variable more meaningful, despite the compromise in type-safety.
    *
    * @param array An array to create a nested data structure from.
    */
  def map(array: js.Array[Datum]): Map[_]
  /**
    * Applies the nest operator to the specified array, returning a nested object.
    * Each entry in the returned associative array corresponds to a distinct key value returned by the first key function.
    * The entry value depends on the number of registered key functions: if there is an additional key, the value is another associative array;
    * otherwise, the value is the array of elements filtered from the input array that have the given key value.
    *
    * WARNING: this method is unsafe if any of the keys conflict with built-in JavaScript properties, such as __proto__.
    * If you cannot guarantee that the keys will be safe, you should use nest.map instead.
    *
    * NOTE:
    *
    * Strictly speaking the return type of this method is:
    *
    * (1) NestedObject<Datum, RollupType>, if at least one key function was defined,
    *
    * (2) Datum[], if neither a key nor a rollup function were defined, and
    *
    * (3) RollupType, if no keys, but a rollup function were defined.
    *
    * Since (2) and (3) are edge cases with little to no practical relevance, they have been omitted in favour of ease-of-use.
    *
    * Should you determine that this simplification creates an issue in practice, please file an issue on
    * https://github.com/DefinitelyTyped/DefinitelyTyped.
    *
    * The formal, generalized return type under (1) is cumbersome to work with in practice. The recommended approach
    * is to define the type of the variable being assigned the return value using knowledge specific to the use-case at hand.
    * I.e. making use of knowing how many keys are applied, and the nature of any roll-up function will make working with
    * the variable more meaningful, despite the compromise in type-safety.
    *
    * @param array An array to create a nested data structure from.
    */
  def `object`(array: js.Array[Datum]): StringDictionary[js.Any]
  /**
    * Specifies a rollup function to be applied on each group of leaf elements and returns this nest operator.
    * The return value of the rollup function will replace the array of leaf values in either the associative array returned by nest.map or nest.object;
    * for nest.entries, it replaces the leaf entry.values with entry.value.
    *
    * If a leaf comparator is specified, the leaf elements are sorted prior to invoking the rollup function.
    *
    * @param func A function computing the rollup value for a group of leaf elements.
    */
  def rollup(func: js.Function1[/* values */ js.Array[Datum], RollupType]): this.type
  /**
    * Sorts key values for the current key using the specified comparator function, such as d3.ascending or d3.descending.
    *
    * If no comparator is specified for the current key, the order in which keys will be returned is undefined.
    *
    * Note that this only affects the result of nest.entries;
    * the order of keys returned by nest.map and nest.object is always undefined, regardless of comparator.
    *
    * @param comparator A comparator function which returns a negative value if, according to the sorting criterion,
    * a is less than b, or a positive value if a is greater than b, or 0 if the two values are the same under the sorting criterion.
    */
  def sortKeys(comparator: js.Function2[/* a */ String, /* b */ String, Double]): this.type
  /**
    * Sorts leaf elements using the specified comparator function, such as d3.ascending or d3.descending.
    * This is roughly equivalent to sorting the input array before applying the nest operator;
    * however it is typically more efficient as the size of each group is smaller.
    *
    * If no value comparator is specified, elements will be returned in the order they appeared in the input array.
    * This applies to nest.map, nest.entries and nest.object.
    *
    * @param comparator A comparator function which returns a negative value if, according to the sorting criterion,
    * a is less than b, or a positive value if a is greater than b, or 0 if the two values are the same under the sorting criterion.
    */
  def sortValues(comparator: js.Function2[/* a */ Datum, /* b */ Datum, Double]): this.type
}

object Nest {
  @scala.inline
  def apply[Datum, RollupType](
    entries: js.Array[Datum] => js.Array[Anon_KeyValueValuesAny[RollupType]],
    key: js.Function1[/* datum */ Datum, String] => Nest[Datum, RollupType],
    map: js.Array[Datum] => Map[_],
    `object`: js.Array[Datum] => StringDictionary[js.Any],
    rollup: js.Function1[/* values */ js.Array[Datum], RollupType] => Nest[Datum, RollupType],
    sortKeys: js.Function2[/* a */ String, /* b */ String, Double] => Nest[Datum, RollupType],
    sortValues: js.Function2[/* a */ Datum, /* b */ Datum, Double] => Nest[Datum, RollupType]
  ): Nest[Datum, RollupType] = {
    val __obj = js.Dynamic.literal(entries = js.Any.fromFunction1(entries), key = js.Any.fromFunction1(key), map = js.Any.fromFunction1(map), rollup = js.Any.fromFunction1(rollup), sortKeys = js.Any.fromFunction1(sortKeys), sortValues = js.Any.fromFunction1(sortValues))
    __obj.updateDynamic("object")(js.Any.fromFunction1(`object`))
    __obj.asInstanceOf[Nest[Datum, RollupType]]
  }
}

@JSImport("d3-collection", "nest")
@js.native
object nest extends js.Object {
  def apply[Datum, RollupType](): Nest[Datum, RollupType] = js.native
}

