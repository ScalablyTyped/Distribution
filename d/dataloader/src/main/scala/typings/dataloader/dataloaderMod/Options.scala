package typings.dataloader.dataloaderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options[K, V] extends js.Object {
  /**
    * Default `true`. Set to `false` to disable batching,
    * instead immediately invoking `batchLoadFn` with a
    * single load key.
    */
  var batch: js.UndefOr[Boolean] = js.undefined
  /**
    * Default `true`. Set to `false` to disable memoization caching,
    * instead creating a new Promise and new key in the `batchLoadFn` for every
    * load of the same key.
    */
  var cache: js.UndefOr[Boolean] = js.undefined
  /**
    * A function to produce a cache key for a given load key.
    * Defaults to `key => key`. Useful to provide when JavaScript
    * objects are keys and two similarly shaped objects should
    * be considered equivalent.
    */
  var cacheKeyFn: js.UndefOr[js.Function1[/* key */ js.Any, _]] = js.undefined
  /**
    * An instance of Map (or an object with a similar API) to
    * be used as the underlying cache for this loader.
    * Default `new Map()`.
    */
  var cacheMap: js.UndefOr[CacheMap[K, js.Promise[V]]] = js.undefined
  /**
    * Default `Infinity`. Limits the number of items that get
    * passed in to the `batchLoadFn`.
    */
  var maxBatchSize: js.UndefOr[Double] = js.undefined
}

object Options {
  @scala.inline
  def apply[K, V](
    batch: js.UndefOr[Boolean] = js.undefined,
    cache: js.UndefOr[Boolean] = js.undefined,
    cacheKeyFn: /* key */ js.Any => _ = null,
    cacheMap: CacheMap[K, js.Promise[V]] = null,
    maxBatchSize: Int | Double = null
  ): Options[K, V] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(batch)) __obj.updateDynamic("batch")(batch.asInstanceOf[js.Any])
    if (!js.isUndefined(cache)) __obj.updateDynamic("cache")(cache.asInstanceOf[js.Any])
    if (cacheKeyFn != null) __obj.updateDynamic("cacheKeyFn")(js.Any.fromFunction1(cacheKeyFn))
    if (cacheMap != null) __obj.updateDynamic("cacheMap")(cacheMap.asInstanceOf[js.Any])
    if (maxBatchSize != null) __obj.updateDynamic("maxBatchSize")(maxBatchSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options[K, V]]
  }
}

