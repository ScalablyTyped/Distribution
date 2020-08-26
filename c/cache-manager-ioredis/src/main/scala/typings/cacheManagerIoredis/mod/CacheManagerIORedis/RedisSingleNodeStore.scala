package typings.cacheManagerIoredis.mod.CacheManagerIORedis

import typings.cacheManagerIoredis.cacheManagerIoredisStrings.redis
import typings.ioredis.mod.Cluster
import typings.ioredis.mod.Redis
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
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
    ttl: /* repeated */ js.Any => js.Promise[_]
  ): RedisSingleNodeStore = {
    val __obj = js.Dynamic.literal(del = js.Any.fromFunction1(del), get = js.Any.fromFunction1(get), getClient = js.Any.fromFunction0(getClient), isCacheableValue = js.Any.fromFunction1(isCacheableValue), keys = js.Any.fromFunction1(keys), name = name.asInstanceOf[js.Any], reset = js.Any.fromFunction1(reset), set = js.Any.fromFunction1(set), ttl = js.Any.fromFunction1(ttl))
    __obj.asInstanceOf[RedisSingleNodeStore]
  }
}

