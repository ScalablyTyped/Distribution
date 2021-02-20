package typings.d3Collection

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StringDictionary
import typings.d3Collection.anon.Key
import typings.d3Collection.anon.KeyValue
import typings.d3Collection.anon.Value
import typings.d3Collection.anon.Values
import typings.std.Array
import typings.std.ArrayLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("d3-collection", "entries")
  @js.native
  def entries(obj: js.Object): js.Array[Value] = js.native
  @JSImport("d3-collection", "entries")
  @js.native
  def entries[T](obj: StringDictionary[T]): js.Array[Key[T]] = js.native
  @JSImport("d3-collection", "entries")
  @js.native
  def entries[T](obj: ArrayLike[T]): js.Array[Key[T]] = js.native
  
  @JSImport("d3-collection", "keys")
  @js.native
  def keys(obj: js.Object): js.Array[String] = js.native
  
  @JSImport("d3-collection", "map")
  @js.native
  def map(obj: js.Object): Map_[_] = js.native
  @JSImport("d3-collection", "map")
  @js.native
  def map[T](): Map_[T] = js.native
  @JSImport("d3-collection", "map")
  @js.native
  def map[T](array: js.Array[T]): Map_[T] = js.native
  @JSImport("d3-collection", "map")
  @js.native
  def map[T](
    array: js.Array[T],
    key: js.Function3[/* value */ T, /* i */ js.UndefOr[Double], /* array */ js.UndefOr[js.Array[T]], String]
  ): Map_[T] = js.native
  @JSImport("d3-collection", "map")
  @js.native
  def map[T](d3Map: Map_[T]): Map_[T] = js.native
  @JSImport("d3-collection", "map")
  @js.native
  def map[T](obj: NumberDictionary[T]): Map_[T] = js.native
  @JSImport("d3-collection", "map")
  @js.native
  def map[T](obj: StringDictionary[T]): Map_[T] = js.native
  
  @JSImport("d3-collection", "nest")
  @js.native
  def nest[Datum, RollupType](): Nest_[Datum, RollupType] = js.native
  
  @JSImport("d3-collection", "set")
  @js.native
  def set(): Set_ = js.native
  @JSImport("d3-collection", "set")
  @js.native
  def set(array: js.Array[String | Stringifiable]): Set_ = js.native
  @JSImport("d3-collection", "set")
  @js.native
  def set(d3Set: Set_): Set_ = js.native
  @JSImport("d3-collection", "set")
  @js.native
  def set[T](
    array: js.Array[T],
    key: js.Function3[/* value */ T, /* index */ Double, /* array */ js.Array[T], String]
  ): Set_ = js.native
  
  @JSImport("d3-collection", "values")
  @js.native
  def values(obj: js.Object): js.Array[_] = js.native
  @JSImport("d3-collection", "values")
  @js.native
  def values[T](obj: StringDictionary[T]): js.Array[T] = js.native
  @JSImport("d3-collection", "values")
  @js.native
  def values[T](obj: ArrayLike[T]): js.Array[T] = js.native
  
  @js.native
  trait Map_[T] extends StObject {
    
    /**
      * Removes all entries from this map.
      */
    def clear(): Unit = js.native
    
    /**
      * Calls the specified function for each entry in this map and returns undefined.
      * The iteration order is arbitrary.
      *
      * @param func Function to call for each entry. The function is passed the entry’s value and key as arguments,
      * followed by the map itself.
      */
    def each(func: js.Function3[/* value */ T, /* key */ String, /* map */ Map_[T], Unit]): Unit = js.native
    
    /**
      * Returns true if and only if this map has zero entries.
      */
    def empty(): Boolean = js.native
    
    /**
      * Returns an array of key-value objects for each entry in this map. The order of the returned entries is arbitrary.
      * Each entry’s key is a string, but the value can have arbitrary type.
      */
    def entries(): js.Array[Key[T]] = js.native
    
    /**
      * Returns the value for the specified key string.
      * If the map does not have an entry for the specified key, returns undefined.
      *
      * @param key Key of map entry to access.
      */
    def get(key: String): js.UndefOr[T] = js.native
    
    /**
      * Returns true if and only if this map has an entry for the specified key string.
      * Note: the value may be null or undefined.
      *
      * @param key Key of map entry to access.
      */
    def has(key: String): Boolean = js.native
    
    /**
      * Returns an array of string keys for every entry in this map.
      * The order of the returned keys is arbitrary.
      */
    def keys(): js.Array[String] = js.native
    
    /**
      * If the map has an entry for the specified key string, removes the entry and returns true.
      * Otherwise, this method does nothing and returns false.
      *
      * @param key Map key for which to remove the entry.
      */
    def remove(key: String): Boolean = js.native
    
    /**
      * Sets the value for the specified key string and returns the updated map.
      * If the map previously had an entry for the same key string, the old entry is replaced with the new value.
      *
      * @param key Key of map entry to access.
      * @param value Value to set for entry at key.
      */
    def set(key: String, value: T): this.type = js.native
    
    /**
      * Returns the number of entries in this map.
      */
    def size(): Double = js.native
    
    /**
      * Returns an array of values for every entry in this map.
      * The order of the returned values is arbitrary.
      */
    def values(): js.Array[T] = js.native
  }
  object Map_ {
    
    @scala.inline
    def apply[T](
      clear: () => Unit,
      each: js.Function3[/* value */ T, /* key */ String, /* map */ Map_[T], Unit] => Unit,
      empty: () => Boolean,
      entries: () => js.Array[Key[T]],
      get: String => js.UndefOr[T],
      has: String => Boolean,
      keys: () => js.Array[String],
      remove: String => Boolean,
      set: (String, T) => Map_[T],
      size: () => Double,
      values: () => js.Array[T]
    ): Map_[T] = {
      val __obj = js.Dynamic.literal(clear = js.Any.fromFunction0(clear), each = js.Any.fromFunction1(each), empty = js.Any.fromFunction0(empty), entries = js.Any.fromFunction0(entries), get = js.Any.fromFunction1(get), has = js.Any.fromFunction1(has), keys = js.Any.fromFunction0(keys), remove = js.Any.fromFunction1(remove), set = js.Any.fromFunction2(set), size = js.Any.fromFunction0(size), values = js.Any.fromFunction0(values))
      __obj.asInstanceOf[Map_[T]]
    }
    
    @scala.inline
    implicit class Map_MutableBuilder[Self <: Map_[_], T] (val x: Self with Map_[T]) extends AnyVal {
      
      @scala.inline
      def setClear(value: () => Unit): Self = StObject.set(x, "clear", js.Any.fromFunction0(value))
      
      @scala.inline
      def setEach(value: js.Function3[/* value */ T, /* key */ String, /* map */ Map_[T], Unit] => Unit): Self = StObject.set(x, "each", js.Any.fromFunction1(value))
      
      @scala.inline
      def setEmpty(value: () => Boolean): Self = StObject.set(x, "empty", js.Any.fromFunction0(value))
      
      @scala.inline
      def setEntries(value: () => js.Array[Key[T]]): Self = StObject.set(x, "entries", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGet(value: String => js.UndefOr[T]): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
      
      @scala.inline
      def setHas(value: String => Boolean): Self = StObject.set(x, "has", js.Any.fromFunction1(value))
      
      @scala.inline
      def setKeys(value: () => js.Array[String]): Self = StObject.set(x, "keys", js.Any.fromFunction0(value))
      
      @scala.inline
      def setRemove(value: String => Boolean): Self = StObject.set(x, "remove", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSet(value: (String, T) => Map_[T]): Self = StObject.set(x, "set", js.Any.fromFunction2(value))
      
      @scala.inline
      def setSize(value: () => Double): Self = StObject.set(x, "size", js.Any.fromFunction0(value))
      
      @scala.inline
      def setValues(value: () => js.Array[T]): Self = StObject.set(x, "values", js.Any.fromFunction0(value))
    }
  }
  
  @js.native
  trait Nest_[Datum, RollupType] extends StObject {
    
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
    def entries(array: js.Array[Datum]): js.Array[KeyValue[RollupType]] = js.native
    
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
    def key(func: js.Function1[/* datum */ Datum, String]): this.type = js.native
    
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
    def map(array: js.Array[Datum]): Map_[_] = js.native
    
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
    def `object`(array: js.Array[Datum]): StringDictionary[js.Any] = js.native
    
    /**
      * Specifies a rollup function to be applied on each group of leaf elements and returns this nest operator.
      * The return value of the rollup function will replace the array of leaf values in either the associative array returned by nest.map or nest.object;
      * for nest.entries, it replaces the leaf entry.values with entry.value.
      *
      * If a leaf comparator is specified, the leaf elements are sorted prior to invoking the rollup function.
      *
      * @param func A function computing the rollup value for a group of leaf elements.
      */
    def rollup(func: js.Function1[/* values */ js.Array[Datum], RollupType]): this.type = js.native
    
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
    def sortKeys(comparator: js.Function2[/* a */ String, /* b */ String, Double]): this.type = js.native
    
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
    def sortValues(comparator: js.Function2[/* a */ Datum, /* b */ Datum, Double]): this.type = js.native
  }
  object Nest_ {
    
    @scala.inline
    def apply[Datum, RollupType](
      entries: js.Array[Datum] => js.Array[KeyValue[RollupType]],
      key: js.Function1[/* datum */ Datum, String] => Nest_[Datum, RollupType],
      map: js.Array[Datum] => Map_[_],
      `object`: js.Array[Datum] => StringDictionary[js.Any],
      rollup: js.Function1[/* values */ js.Array[Datum], RollupType] => Nest_[Datum, RollupType],
      sortKeys: js.Function2[/* a */ String, /* b */ String, Double] => Nest_[Datum, RollupType],
      sortValues: js.Function2[/* a */ Datum, /* b */ Datum, Double] => Nest_[Datum, RollupType]
    ): Nest_[Datum, RollupType] = {
      val __obj = js.Dynamic.literal(entries = js.Any.fromFunction1(entries), key = js.Any.fromFunction1(key), map = js.Any.fromFunction1(map), rollup = js.Any.fromFunction1(rollup), sortKeys = js.Any.fromFunction1(sortKeys), sortValues = js.Any.fromFunction1(sortValues))
      __obj.updateDynamic("object")(js.Any.fromFunction1(`object`))
      __obj.asInstanceOf[Nest_[Datum, RollupType]]
    }
    
    @scala.inline
    implicit class Nest_MutableBuilder[Self <: Nest_[_, _], Datum, RollupType] (val x: Self with (Nest_[Datum, RollupType])) extends AnyVal {
      
      @scala.inline
      def setEntries(value: js.Array[Datum] => js.Array[KeyValue[RollupType]]): Self = StObject.set(x, "entries", js.Any.fromFunction1(value))
      
      @scala.inline
      def setKey(value: js.Function1[/* datum */ Datum, String] => Nest_[Datum, RollupType]): Self = StObject.set(x, "key", js.Any.fromFunction1(value))
      
      @scala.inline
      def setMap(value: js.Array[Datum] => Map_[_]): Self = StObject.set(x, "map", js.Any.fromFunction1(value))
      
      @scala.inline
      def setObject(value: js.Array[Datum] => StringDictionary[js.Any]): Self = StObject.set(x, "object", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRollup(value: js.Function1[/* values */ js.Array[Datum], RollupType] => Nest_[Datum, RollupType]): Self = StObject.set(x, "rollup", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSortKeys(value: js.Function2[/* a */ String, /* b */ String, Double] => Nest_[Datum, RollupType]): Self = StObject.set(x, "sortKeys", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSortValues(value: js.Function2[/* a */ Datum, /* b */ Datum, Double] => Nest_[Datum, RollupType]): Self = StObject.set(x, "sortValues", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait NestedArray[Datum, RollupType] extends Array[Values[Datum, RollupType]]
  
  @js.native
  trait NestedMap[Datum, RollupType]
    extends Map_[(NestedMap[Datum, RollupType]) | js.Array[Datum] | RollupType]
  object NestedMap {
    
    @scala.inline
    def apply[Datum, RollupType](
      clear: () => Unit,
      each: js.Function3[
          (NestedMap[Datum, RollupType]) | js.Array[Datum] | RollupType, 
          /* key */ String, 
          /* map */ Map_[(NestedMap[Datum, RollupType]) | js.Array[Datum] | RollupType], 
          Unit
        ] => Unit,
      empty: () => Boolean,
      entries: () => js.Array[Key[(NestedMap[Datum, RollupType]) | js.Array[Datum] | RollupType]],
      get: String => js.UndefOr[(NestedMap[Datum, RollupType]) | js.Array[Datum] | RollupType],
      has: String => Boolean,
      keys: () => js.Array[String],
      remove: String => Boolean,
      set: (String, (NestedMap[Datum, RollupType]) | js.Array[Datum] | RollupType) => NestedMap[Datum, RollupType],
      size: () => Double,
      values: () => js.Array[(NestedMap[Datum, RollupType]) | js.Array[Datum] | RollupType]
    ): NestedMap[Datum, RollupType] = {
      val __obj = js.Dynamic.literal(clear = js.Any.fromFunction0(clear), each = js.Any.fromFunction1(each), empty = js.Any.fromFunction0(empty), entries = js.Any.fromFunction0(entries), get = js.Any.fromFunction1(get), has = js.Any.fromFunction1(has), keys = js.Any.fromFunction0(keys), remove = js.Any.fromFunction1(remove), set = js.Any.fromFunction2(set), size = js.Any.fromFunction0(size), values = js.Any.fromFunction0(values))
      __obj.asInstanceOf[NestedMap[Datum, RollupType]]
    }
  }
  
  @js.native
  trait NestedObject[Datum, RollupType]
    extends /* key */ StringDictionary[(NestedObject[Datum, RollupType]) | js.Array[Datum] | RollupType]
  object NestedObject {
    
    @scala.inline
    def apply[Datum, RollupType](): NestedObject[Datum, RollupType] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NestedObject[Datum, RollupType]]
    }
  }
  
  @js.native
  trait Set_ extends StObject {
    
    /**
      * Adds the specified value string to this set and returns the set.
      *
      * @param value Value to add to set.
      */
    def add(value: String): this.type = js.native
    def add(value: Stringifiable): this.type = js.native
    
    /**
      * Removes all values from this set.
      */
    def clear(): Unit = js.native
    
    /**
      * Calls the specified function for each value in this set, passing the value as the first two arguments (for symmetry with map.each),
      * followed by the set itself. Returns undefined.
      * The iteration order is arbitrary.
      *
      * @param func Function to call for each set element. The first and second argument of the function are both passed
      * the 'value' of the set entry for consistency with the map.each(...) signature, as a third argument the entire set is passed in.
      */
    def each(func: js.Function3[/* value */ String, /* valueRepeat */ String, /* set */ this.type, Unit]): Unit = js.native
    
    /**
      * Returns true if and only if this set has zero values.
      */
    def empty(): Boolean = js.native
    
    /**
      * Returns true if and only if this set has an entry for the specified value string.
      *
      * @param value Value whose membership in the class to test.
      */
    def has(value: String): Boolean = js.native
    def has(value: Stringifiable): Boolean = js.native
    
    /**
      * If the set contains the specified value string, removes it and returns true.
      * Otherwise, this method does nothing and returns false.
      *
      * @param value Value to remove from set.
      */
    def remove(value: String): Boolean = js.native
    def remove(value: Stringifiable): Boolean = js.native
    
    /**
      * Returns the number of values in this set.
      */
    def size(): Double = js.native
    
    /**
      * Returns an array of the string values in this set. The order of the returned values is arbitrary.
      * Can be used as a convenient way of computing the unique values for a set of strings.
      */
    def values(): js.Array[String] = js.native
  }
  
  @js.native
  trait Stringifiable extends StObject
}
