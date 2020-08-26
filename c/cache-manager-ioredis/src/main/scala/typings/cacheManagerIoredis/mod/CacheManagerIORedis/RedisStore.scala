package typings.cacheManagerIoredis.mod.CacheManagerIORedis

import typings.cacheManager.mod.Store
import typings.cacheManagerIoredis.cacheManagerIoredisStrings.redis
import typings.ioredis.mod.Cluster
import typings.ioredis.mod.Redis
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RedisStore extends Store {
  var name: redis = js.native
  @JSName("del")
  def del_MRedisStore(args: js.Any*): js.Promise[_] = js.native
  def getClient(): Redis | Cluster = js.native
  def isCacheableValue(value: js.Any): Boolean = js.native
  @JSName("keys")
  def keys_MRedisStore(args: js.Any*): js.Promise[_] = js.native
  @JSName("reset")
  def reset_MRedisStore(args: js.Any*): js.Promise[_] = js.native
  @JSName("ttl")
  def ttl_MRedisStore(args: js.Any*): js.Promise[_] = js.native
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
    ttl: /* repeated */ js.Any => js.Promise[_]
  ): RedisStore = {
    val __obj = js.Dynamic.literal(del = js.Any.fromFunction1(del), get = js.Any.fromFunction1(get), getClient = js.Any.fromFunction0(getClient), isCacheableValue = js.Any.fromFunction1(isCacheableValue), keys = js.Any.fromFunction1(keys), name = name.asInstanceOf[js.Any], reset = js.Any.fromFunction1(reset), set = js.Any.fromFunction1(set), ttl = js.Any.fromFunction1(ttl))
    __obj.asInstanceOf[RedisStore]
  }
  @scala.inline
  implicit class RedisStoreOps[Self <: RedisStore] (val x: Self) extends AnyVal {
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
    def setDel(value: /* repeated */ js.Any => js.Promise[_]): Self = this.set("del", js.Any.fromFunction1(value))
    @scala.inline
    def setGetClient(value: () => Redis | Cluster): Self = this.set("getClient", js.Any.fromFunction0(value))
    @scala.inline
    def setIsCacheableValue(value: js.Any => Boolean): Self = this.set("isCacheableValue", js.Any.fromFunction1(value))
    @scala.inline
    def setKeys(value: /* repeated */ js.Any => js.Promise[_]): Self = this.set("keys", js.Any.fromFunction1(value))
    @scala.inline
    def setName(value: redis): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setReset(value: /* repeated */ js.Any => js.Promise[_]): Self = this.set("reset", js.Any.fromFunction1(value))
    @scala.inline
    def setTtl(value: /* repeated */ js.Any => js.Promise[_]): Self = this.set("ttl", js.Any.fromFunction1(value))
  }
  
}

