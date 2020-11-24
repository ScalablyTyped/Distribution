package typings.cacheManagerIoredis.mod.CacheManagerIORedis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RedisStoreConstructor extends js.Object {
  
  var create: js.Function1[
    (/* repeated */ RedisStoreClusterConfig) | (/* repeated */ RedisStoreSingleNodeConfig), 
    RedisClusterStore | RedisSingleNodeStore
  ] = js.native
}
object RedisStoreConstructor {
  
  @scala.inline
  def apply(
    create: (/* repeated */ RedisStoreClusterConfig) | (/* repeated */ RedisStoreSingleNodeConfig) => RedisClusterStore | RedisSingleNodeStore
  ): RedisStoreConstructor = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create))
    __obj.asInstanceOf[RedisStoreConstructor]
  }
  
  @scala.inline
  implicit class RedisStoreConstructorOps[Self <: RedisStoreConstructor] (val x: Self) extends AnyVal {
    
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
    def setCreate(
      value: (/* repeated */ RedisStoreClusterConfig) | (/* repeated */ RedisStoreSingleNodeConfig) => RedisClusterStore | RedisSingleNodeStore
    ): Self = this.set("create", js.Any.fromFunction1(value))
  }
}
