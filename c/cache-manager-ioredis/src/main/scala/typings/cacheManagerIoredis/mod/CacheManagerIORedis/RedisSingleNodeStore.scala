package typings.cacheManagerIoredis.mod.CacheManagerIORedis

import typings.cacheManagerIoredis.cacheManagerIoredisStrings.redis
import typings.ioredis.mod.Cluster
import typings.ioredis.mod.Redis
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RedisSingleNodeStore extends RedisStore

object RedisSingleNodeStore {
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
  ): RedisSingleNodeStore = {
    val __obj = js.Dynamic.literal(del = js.Any.fromFunction1(del), get = js.Any.fromFunction1(get), getClient = js.Any.fromFunction0(getClient), isCacheableValue = js.Any.fromFunction1(isCacheableValue), keys = js.Any.fromFunction1(keys), name = name.asInstanceOf[js.Any], reset = js.Any.fromFunction1(reset), set = js.Any.fromFunction1(set), ttl = js.Any.fromFunction1(ttl))
    if (mget != null) __obj.updateDynamic("mget")(js.Any.fromFunction1(mget))
    if (mset != null) __obj.updateDynamic("mset")(js.Any.fromFunction1(mset))
    if (setex != null) __obj.updateDynamic("setex")(js.Any.fromFunction1(setex))
    __obj.asInstanceOf[RedisSingleNodeStore]
  }
}

