package typings.dataloader

import typings.std.ArrayLike
import typings.std.PromiseLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("dataloader", JSImport.Namespace)
  @js.native
  open class ^[K, V, C] protected ()
    extends StObject
       with DataLoader[K, V, C] {
    def this(batchLoadFn: BatchLoadFn[K, V]) = this()
    def this(batchLoadFn: BatchLoadFn[K, V], options: Options[K, V, C]) = this()
  }
  
  type BatchLoadFn[K, V] = js.Function1[/* keys */ js.Array[K], PromiseLike[ArrayLike[V | js.Error]]]
  
  trait CacheMap[K, V] extends StObject {
    
    def clear(): Any
    
    def delete(key: K): Any
    
    def get(key: K): V | Unit
    
    def set(key: K, value: V): Any
  }
  object CacheMap {
    
    inline def apply[K, V](clear: () => Any, delete: K => Any, get: K => V | Unit, set: (K, V) => Any): CacheMap[K, V] = {
      val __obj = js.Dynamic.literal(clear = js.Any.fromFunction0(clear), delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), set = js.Any.fromFunction2(set))
      __obj.asInstanceOf[CacheMap[K, V]]
    }
    
    extension [Self <: CacheMap[?, ?], K, V](x: Self & (CacheMap[K, V])) {
      
      inline def setClear(value: () => Any): Self = StObject.set(x, "clear", js.Any.fromFunction0(value))
      
      inline def setDelete(value: K => Any): Self = StObject.set(x, "delete", js.Any.fromFunction1(value))
      
      inline def setGet(value: K => V | Unit): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
      
      inline def setSet(value: (K, V) => Any): Self = StObject.set(x, "set", js.Any.fromFunction2(value))
    }
  }
  
  @js.native
  trait DataLoader[K, V, C] extends StObject {
    
    /**
      * Clears the value at `key` from the cache, if it exists. Returns itself for
      * method chaining.
      */
    def clear(key: K): this.type = js.native
    
    /**
      * Clears the entire cache. To be used when some event results in unknown
      * invalidations across this particular `DataLoader`. Returns itself for
      * method chaining.
      */
    def clearAll(): this.type = js.native
    
    /**
      * Loads a key, returning a `Promise` for the value represented by that key.
      */
    def load(key: K): js.Promise[V] = js.native
    
    /**
      * Loads multiple keys, promising an array of values:
      *
      *     var [ a, b ] = await myLoader.loadMany([ 'a', 'b' ]);
      *
      * This is equivalent to the more verbose:
      *
      *     var [ a, b ] = await Promise.all([
      *       myLoader.load('a'),
      *       myLoader.load('b')
      *     ]);
      *
      */
    def loadMany(keys: ArrayLike[K]): js.Promise[js.Array[V | js.Error]] = js.native
    
    /**
      * Adds the provided key and value to the cache. If the key already exists, no
      * change is made. Returns itself for method chaining.
      */
    def prime(key: K, value: V): this.type = js.native
    def prime(key: K, value: js.Error): this.type = js.native
  }
  
  trait Options[K, V, C] extends StObject {
    
    /**
      * Default `true`. Set to `false` to disable batching, invoking
      * `batchLoadFn` with a single load key. This is equivalent to setting
      * `maxBatchSize` to `1`.
      */
    var batch: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Default see https://github.com/graphql/dataloader#batch-scheduling.
      * A function to schedule the later execution of a batch. The function is
      * expected to call the provided callback in the immediate future.
      */
    var batchScheduleFn: js.UndefOr[js.Function1[/* callback */ js.Function0[Unit], Unit]] = js.undefined
    
    /**
      * Default `true`. Set to `false` to disable memoization caching, creating a
      * new Promise and new key in the `batchLoadFn` for every load of the same
      * key. This is equivalent to setting `cacheMap` to `null`.
      */
    var cache: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Default `key => key`. Produces cache key for a given load key. Useful
      * when keys are objects and two objects should be considered equivalent.
      */
    var cacheKeyFn: js.UndefOr[js.Function1[/* key */ K, C]] = js.undefined
    
    /**
      * Default `new Map()`. Instance of `Map` (or an object with a similar API)
      * to be used as cache. May be set to `null` to disable caching.
      */
    var cacheMap: js.UndefOr[(CacheMap[C, js.Promise[V]]) | Null] = js.undefined
    
    /**
      * Default `Infinity`. Limits the number of items that get passed in to the
      * `batchLoadFn`. May be set to `1` to disable batching.
      */
    var maxBatchSize: js.UndefOr[Double] = js.undefined
  }
  object Options {
    
    inline def apply[K, V, C](): Options[K, V, C] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options[K, V, C]]
    }
    
    extension [Self <: Options[?, ?, ?], K, V, C](x: Self & (Options[K, V, C])) {
      
      inline def setBatch(value: Boolean): Self = StObject.set(x, "batch", value.asInstanceOf[js.Any])
      
      inline def setBatchScheduleFn(value: /* callback */ js.Function0[Unit] => Unit): Self = StObject.set(x, "batchScheduleFn", js.Any.fromFunction1(value))
      
      inline def setBatchScheduleFnUndefined: Self = StObject.set(x, "batchScheduleFn", js.undefined)
      
      inline def setBatchUndefined: Self = StObject.set(x, "batch", js.undefined)
      
      inline def setCache(value: Boolean): Self = StObject.set(x, "cache", value.asInstanceOf[js.Any])
      
      inline def setCacheKeyFn(value: /* key */ K => C): Self = StObject.set(x, "cacheKeyFn", js.Any.fromFunction1(value))
      
      inline def setCacheKeyFnUndefined: Self = StObject.set(x, "cacheKeyFn", js.undefined)
      
      inline def setCacheMap(value: CacheMap[C, js.Promise[V]]): Self = StObject.set(x, "cacheMap", value.asInstanceOf[js.Any])
      
      inline def setCacheMapNull: Self = StObject.set(x, "cacheMap", null)
      
      inline def setCacheMapUndefined: Self = StObject.set(x, "cacheMap", js.undefined)
      
      inline def setCacheUndefined: Self = StObject.set(x, "cache", js.undefined)
      
      inline def setMaxBatchSize(value: Double): Self = StObject.set(x, "maxBatchSize", value.asInstanceOf[js.Any])
      
      inline def setMaxBatchSizeUndefined: Self = StObject.set(x, "maxBatchSize", js.undefined)
    }
  }
}
