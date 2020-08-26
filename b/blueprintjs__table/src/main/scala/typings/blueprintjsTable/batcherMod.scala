package typings.blueprintjsTable

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@blueprintjs/table/lib/esm/common/batcher", JSImport.Namespace)
@js.native
object batcherMod extends js.Object {
  @js.native
  class Batcher[T] () extends js.Object {
    var batchArgs: js.Any = js.native
    var callback: js.Any = js.native
    var currentObjects: js.Any = js.native
    var done: js.Any = js.native
    var getKey: js.Any = js.native
    var handleIdleCallback: js.Any = js.native
    var mapCurrentObjectKey: js.Any = js.native
    var oldObjects: js.Any = js.native
    /**
      * Returns true of objects `a` and `b` have exactly the same keys.
      */
    var setHasSameKeys: js.Any = js.native
    var setKeysDifference: js.Any = js.native
    var setKeysIntersection: js.Any = js.native
    /**
      * Compares the keys of A from B -- and performs an "intersection" or
      * "difference" operation on the keys.
      *
      * Note that the order of operands A and B matters for the "difference"
      * operation.
      *
      * Returns an array of at most `limit` keys.
      */
    var setKeysOperation: js.Any = js.native
    /**
      * Stores the variadic arguments to be later batched together.
      *
      * The arguments must be simple stringifyable objects.
      */
    def addArgsToBatch(args: SimpleStringifyable*): Unit = js.native
    def cancelOutstandingCallback(): Unit = js.native
    /**
      * Returns all the objects in the "current" set.
      */
    def getList(): js.Array[T] = js.native
    /**
      * Registers a callback to be invoked on the next idle frame. If a callback
      * has already been registered, we do not register a new one.
      */
    def idleCallback(callback: Callback): Unit = js.native
    /**
      * Returns true if the "current" set matches the "batch" set.
      */
    def isDone(): Boolean = js.native
    /**
      * Compares the set of "batch" arguments to the "current" set. Creates any
      * new objects using the callback as a factory. Removes old objects.
      *
      * Arguments that are in the "current" set but were not part of the last
      * "batch" set are considered candidates for removal. Similarly, Arguments
      * that are part of the "batch" set but not the "current" set are candidates
      * for addition.
      *
      * The number of objects added and removed may be limited with the
      * `...Limit` parameters.
      *
      * Finally, the batcher determines if the batching is complete if the
      * "current" arguments match the "batch" arguments.
      */
    def removeOldAddNew(callback: js.Function1[/* repeated */ js.Any, T]): Unit = js.native
    def removeOldAddNew(
      callback: js.Function1[/* repeated */ js.Any, T],
      addNewLimit: js.UndefOr[scala.Nothing],
      removeOldLimit: js.UndefOr[scala.Nothing],
      updateLimit: Double
    ): Unit = js.native
    def removeOldAddNew(
      callback: js.Function1[/* repeated */ js.Any, T],
      addNewLimit: js.UndefOr[scala.Nothing],
      removeOldLimit: Double
    ): Unit = js.native
    def removeOldAddNew(
      callback: js.Function1[/* repeated */ js.Any, T],
      addNewLimit: js.UndefOr[scala.Nothing],
      removeOldLimit: Double,
      updateLimit: Double
    ): Unit = js.native
    def removeOldAddNew(callback: js.Function1[/* repeated */ js.Any, T], addNewLimit: Double): Unit = js.native
    def removeOldAddNew(
      callback: js.Function1[/* repeated */ js.Any, T],
      addNewLimit: Double,
      removeOldLimit: js.UndefOr[scala.Nothing],
      updateLimit: Double
    ): Unit = js.native
    def removeOldAddNew(callback: js.Function1[/* repeated */ js.Any, T], addNewLimit: Double, removeOldLimit: Double): Unit = js.native
    def removeOldAddNew(
      callback: js.Function1[/* repeated */ js.Any, T],
      addNewLimit: Double,
      removeOldLimit: Double,
      updateLimit: Double
    ): Unit = js.native
    /**
      * Resets the "batch" and "current" sets. This essentially clears the cache
      * and prevents accidental re-use of "current" objects.
      */
    def reset(): Unit = js.native
    /**
      * Forcibly overwrites the current list of batched objects. Not recommended
      * for normal usage.
      */
    def setList(objectsArgs: js.Array[js.Array[SimpleStringifyable]], objects: js.Array[T]): Unit = js.native
    /**
      * Starts a new "batch" argument set
      */
    def startNewBatch(): Unit = js.native
  }
  
  /* static members */
  @js.native
  object Batcher extends js.Object {
    var ARG_DELIMITER: String = js.native
    var DEFAULT_ADD_LIMIT: Double = js.native
    var DEFAULT_REMOVE_LIMIT: Double = js.native
    var DEFAULT_UPDATE_LIMIT: Double = js.native
  }
  
  type Callback = js.Function0[Unit]
  type SimpleStringifyable = js.UndefOr[String | Double | Null]
}

