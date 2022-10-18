package typings.blueprintjsTable

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libEsmCommonBatcherMod {
  
  @JSImport("@blueprintjs/table/lib/esm/common/batcher", "Batcher")
  @js.native
  open class Batcher[T] () extends StObject {
    
    /**
      * Stores the variadic arguments to be later batched together.
      *
      * The arguments must be simple stringifyable objects.
      */
    def addArgsToBatch(args: SimpleStringifyable*): Unit = js.native
    
    /* private */ var batchArgs: Any = js.native
    
    /* private */ var callback: Any = js.native
    
    def cancelOutstandingCallback(): Unit = js.native
    
    /* private */ var currentObjects: Any = js.native
    
    /* private */ var done: Any = js.native
    
    /* private */ var getKey: Any = js.native
    
    /**
      * Returns all the objects in the "current" set.
      */
    def getList(): js.Array[T] = js.native
    
    /* private */ var handleIdleCallback: Any = js.native
    
    /**
      * Registers a callback to be invoked on the next idle frame. If a callback
      * has already been registered, we do not register a new one.
      */
    def idleCallback(callback: Callback): Unit = js.native
    
    /**
      * Returns true if the "current" set matches the "batch" set.
      */
    def isDone(): Boolean = js.native
    
    /* private */ var mapCurrentObjectKey: Any = js.native
    
    /* private */ var oldObjects: Any = js.native
    
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
    def removeOldAddNew(callback: js.Function1[/* repeated */ Any, T]): Unit = js.native
    def removeOldAddNew(callback: js.Function1[/* repeated */ Any, T], addNewLimit: Double): Unit = js.native
    def removeOldAddNew(callback: js.Function1[/* repeated */ Any, T], addNewLimit: Double, removeOldLimit: Double): Unit = js.native
    def removeOldAddNew(
      callback: js.Function1[/* repeated */ Any, T],
      addNewLimit: Double,
      removeOldLimit: Double,
      updateLimit: Double
    ): Unit = js.native
    def removeOldAddNew(
      callback: js.Function1[/* repeated */ Any, T],
      addNewLimit: Double,
      removeOldLimit: Unit,
      updateLimit: Double
    ): Unit = js.native
    def removeOldAddNew(callback: js.Function1[/* repeated */ Any, T], addNewLimit: Unit, removeOldLimit: Double): Unit = js.native
    def removeOldAddNew(
      callback: js.Function1[/* repeated */ Any, T],
      addNewLimit: Unit,
      removeOldLimit: Double,
      updateLimit: Double
    ): Unit = js.native
    def removeOldAddNew(
      callback: js.Function1[/* repeated */ Any, T],
      addNewLimit: Unit,
      removeOldLimit: Unit,
      updateLimit: Double
    ): Unit = js.native
    
    /**
      * Resets the "batch" and "current" sets. This essentially clears the cache
      * and prevents accidental re-use of "current" objects.
      */
    def reset(): Unit = js.native
    
    /**
      * Returns true of objects `a` and `b` have exactly the same keys.
      */
    /* private */ var setHasSameKeys: Any = js.native
    
    /* private */ var setKeysDifference: Any = js.native
    
    /* private */ var setKeysIntersection: Any = js.native
    
    /**
      * Compares the keys of A from B -- and performs an "intersection" or
      * "difference" operation on the keys.
      *
      * Note that the order of operands A and B matters for the "difference"
      * operation.
      *
      * Returns an array of at most `limit` keys.
      */
    /* private */ var setKeysOperation: Any = js.native
    
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
  object Batcher {
    
    @JSImport("@blueprintjs/table/lib/esm/common/batcher", "Batcher")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@blueprintjs/table/lib/esm/common/batcher", "Batcher.ARG_DELIMITER")
    @js.native
    def ARG_DELIMITER: String = js.native
    inline def ARG_DELIMITER_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ARG_DELIMITER")(x.asInstanceOf[js.Any])
    
    @JSImport("@blueprintjs/table/lib/esm/common/batcher", "Batcher.DEFAULT_ADD_LIMIT")
    @js.native
    def DEFAULT_ADD_LIMIT: Double = js.native
    inline def DEFAULT_ADD_LIMIT_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DEFAULT_ADD_LIMIT")(x.asInstanceOf[js.Any])
    
    @JSImport("@blueprintjs/table/lib/esm/common/batcher", "Batcher.DEFAULT_REMOVE_LIMIT")
    @js.native
    def DEFAULT_REMOVE_LIMIT: Double = js.native
    inline def DEFAULT_REMOVE_LIMIT_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DEFAULT_REMOVE_LIMIT")(x.asInstanceOf[js.Any])
    
    @JSImport("@blueprintjs/table/lib/esm/common/batcher", "Batcher.DEFAULT_UPDATE_LIMIT")
    @js.native
    def DEFAULT_UPDATE_LIMIT: Double = js.native
    inline def DEFAULT_UPDATE_LIMIT_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DEFAULT_UPDATE_LIMIT")(x.asInstanceOf[js.Any])
  }
  
  type Callback = js.Function0[Unit]
  
  type SimpleStringifyable = js.UndefOr[String | Double | Null]
}
