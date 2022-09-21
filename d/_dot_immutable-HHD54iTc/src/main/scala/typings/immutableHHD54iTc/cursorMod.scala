package typings.immutableHHD54iTc

import org.scalablytyped.runtime.StringDictionary
import typings.immutableHHD54iTc.Immutable.Collection
import typings.immutableHHD54iTc.Immutable.Iterable
import typings.immutableHHD54iTc.Immutable.Seq
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cursorMod {
  
  @JSImport("immutable/contrib/cursor", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def from(collection: Collection[Any, Any]): Cursor = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(collection.asInstanceOf[js.Any]).asInstanceOf[Cursor]
  inline def from(collection: Collection[Any, Any], keyPath: js.Array[Any]): Cursor = (^.asInstanceOf[js.Dynamic].applyDynamic("from")(collection.asInstanceOf[js.Any], keyPath.asInstanceOf[js.Any])).asInstanceOf[Cursor]
  inline def from(
    collection: Collection[Any, Any],
    keyPath: js.Array[Any],
    onChange: js.Function3[
      /* newValue */ Any, 
      /* oldValue */ js.UndefOr[Any], 
      /* keyPath */ js.UndefOr[js.Array[Any]], 
      Any
    ]
  ): Cursor = (^.asInstanceOf[js.Dynamic].applyDynamic("from")(collection.asInstanceOf[js.Any], keyPath.asInstanceOf[js.Any], onChange.asInstanceOf[js.Any])).asInstanceOf[Cursor]
  inline def from(collection: Collection[Any, Any], key: Any): Cursor = (^.asInstanceOf[js.Dynamic].applyDynamic("from")(collection.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[Cursor]
  inline def from(
    collection: Collection[Any, Any],
    key: Any,
    onChange: js.Function3[
      /* newValue */ Any, 
      /* oldValue */ js.UndefOr[Any], 
      /* keyPath */ js.UndefOr[js.Array[Any]], 
      Any
    ]
  ): Cursor = (^.asInstanceOf[js.Dynamic].applyDynamic("from")(collection.asInstanceOf[js.Any], key.asInstanceOf[js.Any], onChange.asInstanceOf[js.Any])).asInstanceOf[Cursor]
  inline def from(
    collection: Collection[Any, Any],
    onChange: js.Function3[
      /* newValue */ Any, 
      /* oldValue */ js.UndefOr[Any], 
      /* keyPath */ js.UndefOr[js.Array[Any]], 
      Any
    ]
  ): Cursor = (^.asInstanceOf[js.Dynamic].applyDynamic("from")(collection.asInstanceOf[js.Any], onChange.asInstanceOf[js.Any])).asInstanceOf[Cursor]
  
  @js.native
  trait Cursor
    extends StObject
       with Seq[Any, Any] {
    
    /**
      * Clears the value at this cursor, returning a new cursor to the same
      * point in the new data.
      */
    def clear(): Cursor = js.native
    
    /**
      * Returns a sub-cursor following the key-path starting from this cursor.
      */
    def cursor(subKeyPath: js.Array[Any]): Cursor = js.native
    def cursor(subKey: Any): Cursor = js.native
    
    /**
      * Deletes `key` from the cursor, returning a new cursor to the same
      * point in the new data.
      *
      * Note: `delete` cannot be safely used in IE8
      * @alias remove
      */
    def delete(key: Any): Cursor = js.native
    
    /**
      * Returns a new Cursor having removed the value at this `keyPath`.
      *
      * @alias removeIn
      */
    def deleteIn(keyPath: js.Array[Any]): Cursor = js.native
    def deleteIn(keyPath: Iterable[Any, Any]): Cursor = js.native
    
    /**
      * Returns the value at the cursor, if the cursor path does not yet exist,
      * returns `notSetValue`.
      */
    def deref(): Any = js.native
    def deref(notSetValue: Any): Any = js.native
    
    /**
      * @see `Map#merge`
      */
    def merge(iterables: ((Iterable[Any, Any]) | StringDictionary[Any])*): Cursor = js.native
    
    /**
      * @see `Map#mergeDeep`
      */
    def mergeDeep(iterables: ((Iterable[Any, Any]) | StringDictionary[Any])*): Cursor = js.native
    
    def mergeDeepIn(keyPath: js.Array[Any], iterables: ((Iterable[Any, Any]) | StringDictionary[Any])*): Cursor = js.native
    /**
      * A combination of `updateIn` and `mergeDeep`, returning a new Cursor, but
      * performing the deep merge at a point arrived at by following the keyPath.
      * In other words, these two lines are equivalent:
      *
      *     x.updateIn(['a', 'b', 'c'], abc => abc.mergeDeep(y));
      *     x.mergeDeepIn(['a', 'b', 'c'], y);
      *
      */
    def mergeDeepIn(keyPath: Iterable[Any, Any], iterables: (Iterable[Any, Any])*): Cursor = js.native
    
    /**
      * @see `Map#mergeDeepWith`
      */
    def mergeDeepWith(
      merger: js.Function2[js.UndefOr[Any], js.UndefOr[Any], Any],
      iterables: ((Iterable[Any, Any]) | StringDictionary[Any])*
    ): Cursor = js.native
    
    def mergeIn(keyPath: js.Array[Any], iterables: ((Iterable[Any, Any]) | StringDictionary[Any])*): Cursor = js.native
    /**
      * A combination of `updateIn` and `merge`, returning a new Cursor, but
      * performing the merge at a point arrived at by following the keyPath.
      * In other words, these two lines are equivalent:
      *
      *     x.updateIn(['a', 'b', 'c'], abc => abc.merge(y));
      *     x.mergeIn(['a', 'b', 'c'], y);
      *
      */
    def mergeIn(keyPath: Iterable[Any, Any], iterables: (Iterable[Any, Any])*): Cursor = js.native
    
    /**
      * @see `Map#mergeWith`
      */
    def mergeWith(
      merger: js.Function2[js.UndefOr[Any], js.UndefOr[Any], Any],
      iterables: ((Iterable[Any, Any]) | StringDictionary[Any])*
    ): Cursor = js.native
    
    /**
      * Returns a new Cursor with a size ones less than this Cursor,
      * excluding the last index in this Cursor.
      */
    def pop(): Cursor = js.native
    
    /**
      * Returns a new Cursor with provided `values` appended
      */
    def push(values: Any*): Cursor = js.native
    
    def remove(key: Any): Cursor = js.native
    
    def removeIn(keyPath: js.Array[Any]): Cursor = js.native
    def removeIn(keyPath: Iterable[Any, Any]): Cursor = js.native
    
    /**
      * Sets `value` at `key` in the cursor, returning a new cursor to the same
      * point in the new data.
      *
      * If only one parameter is provided, it is set directly as the cursor's value.
      */
    def set(key: Any, value: Any): Cursor = js.native
    def set(value: Any): Cursor = js.native
    
    // Deep persistent changes
    /**
      * Returns a new Cursor having set `value` at this `keyPath`. If any keys in
      * `keyPath` do not exist, a new immutable Map will be created at that key.
      */
    def setIn(keyPath: js.Array[Any], value: Any): Cursor = js.native
    def setIn(keyPath: Iterable[Any, Any], value: Any): Cursor = js.native
    
    /**
      * Returns a new Cursor with a size ones less than this Cursor, excluding
      * the first index in this Cursor, shifting all other values to a lower index.
      */
    def shift(): Cursor = js.native
    
    /**
      * Returns a new Cursor with the provided `values` prepended,
      * shifting other values ahead to higher indices.
      */
    def unshift(values: Any*): Cursor = js.native
    
    def update(key: Any, notSetValue: Any, updater: js.Function1[/* value */ Any, Any]): Cursor = js.native
    def update(key: Any, updater: js.Function1[/* value */ Any, Any]): Cursor = js.native
    /**
      * Updates the value in the data this cursor points to, triggering the
      * callback for the root cursor and returning a new cursor pointing to the
      * new data.
      */
    def update(updater: js.Function1[/* value */ Any, Any]): Cursor = js.native
    
    def updateIn(keyPath: js.Array[Any], notSetValue: Any, updater: js.Function1[/* value */ Any, Any]): Cursor = js.native
    /**
      * Returns a new Cursor having applied the `updater` to the value found at
      * the keyPath.
      *
      * If any keys in `keyPath` do not exist, new Immutable `Map`s will
      * be created at those keys. If the `keyPath` does not already contain a
      * value, the `updater` function will be called with `notSetValue`, if
      * provided, otherwise `undefined`.
      *
      * If the `updater` function returns the same value it was called with, then
      * no change will occur. This is still true if `notSetValue` is provided.
      */
    def updateIn(keyPath: js.Array[Any], updater: js.Function1[/* value */ Any, Any]): Cursor = js.native
    def updateIn(keyPath: Iterable[Any, Any], notSetValue: Any, updater: js.Function1[/* value */ Any, Any]): Cursor = js.native
    def updateIn(keyPath: Iterable[Any, Any], updater: js.Function1[/* value */ Any, Any]): Cursor = js.native
    
    // Transient changes
    /**
      * Every time you call one of the above functions, a new immutable value is
      * created and the callback is triggered. If you need to apply a series of
      * mutations to a Cursor without triggering the callback repeatedly,
      * `withMutations()` creates a temporary mutable copy of the value which
      * can apply mutations in a highly performant manner. Afterwards the
      * callback is triggered with the final value.
      */
    def withMutations(mutator: js.Function1[/* mutable */ Any, Any]): Cursor = js.native
  }
}
