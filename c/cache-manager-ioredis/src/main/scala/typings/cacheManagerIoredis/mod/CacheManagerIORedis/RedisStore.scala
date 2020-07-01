package typings.cacheManagerIoredis.mod.CacheManagerIORedis

import typings.cacheManager.mod.Store
import typings.cacheManagerIoredis.cacheManagerIoredisStrings.redis
import typings.ioredis.mod.Cluster
import typings.ioredis.mod.Redis
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RedisStore extends Store {
  var name: redis
  @JSName("del")
  def del_MRedisStore(args: js.Any*): js.Promise[_]
  def getClient(): Redis | Cluster
  def isCacheableValue(value: js.Any): Boolean
  @JSName("keys")
  def keys_MRedisStore(args: js.Any*): js.Promise[_]
  @JSName("reset")
  def reset_MRedisStore(args: js.Any*): js.Promise[_]
  @JSName("ttl")
  def ttl_MRedisStore(args: js.Any*): js.Promise[_]
}

object RedisStore {
  @scala.inline
  def apply(
    del: /* repeated */ js.Any => js.Promise[_],
    get: /* repeated */ js.Any => js.Promise[_],
    getClient: () => Redis | Cluster,
    isCacheableValue: js.Any => Boolean,
    keys: /* repeated */ js.Any => js.Promise[_],
    name: redis,
    reset: /* repeated */ js.Any => js.Promise[_],
    set: /* repeated */ js.Any => js.Promise[_],
    ttl: /* repeated */ js.Any => js.Promise[_],
    mget: /* repeated */ js.Any => js.Promise[_] = null,
    mset: /* repeated */ js.Any => js.Promise[_] = null,
    setex: /* repeated */ js.Any => js.Promise[_] = null
  ): RedisStore = {
    val __obj = js.Dynamic.literal(del = js.Any.fromFunction1(del), get = js.Any.fromFunction1(get), getClient = js.Any.fromFunction0(getClient), isCacheableValue = js.Any.fromFunction1(isCacheableValue), keys = js.Any.fromFunction1(keys), name = name.asInstanceOf[js.Any], reset = js.Any.fromFunction1(reset), set = js.Any.fromFunction1(set), ttl = js.Any.fromFunction1(ttl))
    if (mget != null) __obj.updateDynamic("mget")(js.Any.fromFunction1(mget))
    if (mset != null) __obj.updateDynamic("mset")(js.Any.fromFunction1(mset))
    if (setex != null) __obj.updateDynamic("setex")(js.Any.fromFunction1(setex))
    __obj.asInstanceOf[RedisStore]
  }
}

