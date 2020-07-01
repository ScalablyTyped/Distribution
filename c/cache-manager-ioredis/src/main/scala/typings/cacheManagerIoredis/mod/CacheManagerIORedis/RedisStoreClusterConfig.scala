package typings.cacheManagerIoredis.mod.CacheManagerIORedis

import typings.cacheManager.mod.TtlFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined cache-manager.cache-manager.CachingConfig & {  store  :cache-manager-ioredis.cache-manager-ioredis.CacheManagerIORedis.RedisStoreConstructor,   max ? :number,   clusterConfig  :cache-manager-ioredis.cache-manager-ioredis.CacheManagerIORedis.ClusterOptions} & cache-manager.cache-manager.CacheOptions */
trait RedisStoreClusterConfig extends js.Object {
  var clusterConfig: ClusterOptions
  var isCacheableValue: js.UndefOr[js.Function1[/* value */ js.Any, Boolean]] = js.undefined
  var max: js.UndefOr[Double] = js.undefined
  /**
    * Promise library to replace global.Promise
    */
  var promiseDependency: js.UndefOr[js.Any] = js.undefined
  var store: RedisStoreConstructor
  var ttl: Double | TtlFunction
}

object RedisStoreClusterConfig {
  @scala.inline
  def apply(
    clusterConfig: ClusterOptions,
    store: RedisStoreConstructor,
    ttl: Double | TtlFunction,
    isCacheableValue: /* value */ js.Any => Boolean = null,
    max: js.UndefOr[Double] = js.undefined,
    promiseDependency: js.Any = null
  ): RedisStoreClusterConfig = {
    val __obj = js.Dynamic.literal(clusterConfig = clusterConfig.asInstanceOf[js.Any], store = store.asInstanceOf[js.Any], ttl = ttl.asInstanceOf[js.Any])
    if (isCacheableValue != null) __obj.updateDynamic("isCacheableValue")(js.Any.fromFunction1(isCacheableValue))
    if (!js.isUndefined(max)) __obj.updateDynamic("max")(max.get.asInstanceOf[js.Any])
    if (promiseDependency != null) __obj.updateDynamic("promiseDependency")(promiseDependency.asInstanceOf[js.Any])
    __obj.asInstanceOf[RedisStoreClusterConfig]
  }
}

