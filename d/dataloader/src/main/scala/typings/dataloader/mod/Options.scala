package typings.dataloader.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options[K, V, C] extends js.Object {
  
  /**
    * Default `true`. Set to `false` to disable batching, invoking
    * `batchLoadFn` with a single load key. This is equivalent to setting
    * `maxBatchSize` to `1`.
    */
  var batch: js.UndefOr[Boolean] = js.native
  
  /**
    * Default see https://github.com/graphql/dataloader#batch-scheduling.
    * A function to schedule the later execution of a batch. The function is
    * expected to call the provided callback in the immediate future.
    */
  var batchScheduleFn: js.UndefOr[js.Function1[/* callback */ js.Function0[Unit], Unit]] = js.native
  
  /**
    * Default `true`. Set to `false` to disable memoization caching, creating a
    * new Promise and new key in the `batchLoadFn` for every load of the same
    * key. This is equivalent to setting `cacheMap` to `null`.
    */
  var cache: js.UndefOr[Boolean] = js.native
  
  /**
    * Default `key => key`. Produces cache key for a given load key. Useful
    * when objects are keys and two objects should be considered equivalent.
    */
  var cacheKeyFn: js.UndefOr[js.Function1[/* key */ K, C]] = js.native
  
  /**
    * Default `new Map()`. Instance of `Map` (or an object with a similar API)
    * to be used as cache. May be set to `null` to disable caching.
    */
  var cacheMap: js.UndefOr[(CacheMap[C, js.Promise[V]]) | Null] = js.native
  
  /**
    * Default `Infinity`. Limits the number of items that get passed in to the
    * `batchLoadFn`. May be set to `1` to disable batching.
    */
  var maxBatchSize: js.UndefOr[Double] = js.native
}
object Options {
  
  @scala.inline
  def apply[K, V, C](): Options[K, V, C] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options[K, V, C]]
  }
  
  @scala.inline
  implicit class OptionsOps[Self <: Options[_, _, _], K, V, C] (val x: Self with (Options[K, V, C])) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setBatch(value: Boolean): Self = this.set("batch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBatch: Self = this.set("batch", js.undefined)
    
    @scala.inline
    def setBatchScheduleFn(value: /* callback */ js.Function0[Unit] => Unit): Self = this.set("batchScheduleFn", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteBatchScheduleFn: Self = this.set("batchScheduleFn", js.undefined)
    
    @scala.inline
    def setCache(value: Boolean): Self = this.set("cache", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCache: Self = this.set("cache", js.undefined)
    
    @scala.inline
    def setCacheKeyFn(value: /* key */ K => C): Self = this.set("cacheKeyFn", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteCacheKeyFn: Self = this.set("cacheKeyFn", js.undefined)
    
    @scala.inline
    def setCacheMap(value: CacheMap[C, js.Promise[V]]): Self = this.set("cacheMap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCacheMap: Self = this.set("cacheMap", js.undefined)
    
    @scala.inline
    def setCacheMapNull: Self = this.set("cacheMap", null)
    
    @scala.inline
    def setMaxBatchSize(value: Double): Self = this.set("maxBatchSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxBatchSize: Self = this.set("maxBatchSize", js.undefined)
  }
}
