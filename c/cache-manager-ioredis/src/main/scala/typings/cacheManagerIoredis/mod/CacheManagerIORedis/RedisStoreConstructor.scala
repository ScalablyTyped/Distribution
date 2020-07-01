package typings.cacheManagerIoredis.mod.CacheManagerIORedis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RedisStoreConstructor extends js.Object {
  var create: js.Function1[
    (/* repeated */ RedisStoreClusterConfig) | (/* repeated */ RedisStoreSingleNodeConfig), 
    RedisClusterStore | RedisSingleNodeStore
  ]
}

object RedisStoreConstructor {
  @scala.inline
  def apply(
    create: (/* repeated */ RedisStoreClusterConfig) | (/* repeated */ RedisStoreSingleNodeConfig) => RedisClusterStore | RedisSingleNodeStore
  ): RedisStoreConstructor = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create))
    __obj.asInstanceOf[RedisStoreConstructor]
  }
}

