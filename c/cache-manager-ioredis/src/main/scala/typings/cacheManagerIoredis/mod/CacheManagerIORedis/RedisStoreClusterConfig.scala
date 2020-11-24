package typings.cacheManagerIoredis.mod.CacheManagerIORedis

import typings.cacheManager.mod.TtlFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined cache-manager.cache-manager.CachingConfig & {  store :cache-manager-ioredis.cache-manager-ioredis.CacheManagerIORedis.RedisStoreConstructor,   max :number | undefined,   clusterConfig :cache-manager-ioredis.cache-manager-ioredis.CacheManagerIORedis.ClusterOptions} & cache-manager.cache-manager.CacheOptions */
@js.native
trait RedisStoreClusterConfig extends js.Object {
  
  var clusterConfig: ClusterOptions = js.native
  
  var isCacheableValue: js.UndefOr[js.Function1[/* value */ js.Any, Boolean]] = js.native
  
  var max: js.UndefOr[Double] = js.native
  
  /**
    * Promise library to replace global.Promise
    */
  var promiseDependency: js.UndefOr[js.Any] = js.native
  
  var store: RedisStoreConstructor = js.native
  
  var ttl: Double | TtlFunction = js.native
}
object RedisStoreClusterConfig {
  
  @scala.inline
  def apply(clusterConfig: ClusterOptions, store: RedisStoreConstructor, ttl: Double | TtlFunction): RedisStoreClusterConfig = {
    val __obj = js.Dynamic.literal(clusterConfig = clusterConfig.asInstanceOf[js.Any], store = store.asInstanceOf[js.Any], ttl = ttl.asInstanceOf[js.Any])
    __obj.asInstanceOf[RedisStoreClusterConfig]
  }
  
  @scala.inline
  implicit class RedisStoreClusterConfigOps[Self <: RedisStoreClusterConfig] (val x: Self) extends AnyVal {
    
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
    def setClusterConfig(value: ClusterOptions): Self = this.set("clusterConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStore(value: RedisStoreConstructor): Self = this.set("store", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTtlFunction1(value: /* result */ js.Any => Double): Self = this.set("ttl", js.Any.fromFunction1(value))
    
    @scala.inline
    def setTtl(value: Double | TtlFunction): Self = this.set("ttl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsCacheableValue(value: /* value */ js.Any => Boolean): Self = this.set("isCacheableValue", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteIsCacheableValue: Self = this.set("isCacheableValue", js.undefined)
    
    @scala.inline
    def setMax(value: Double): Self = this.set("max", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMax: Self = this.set("max", js.undefined)
    
    @scala.inline
    def setPromiseDependency(value: js.Any): Self = this.set("promiseDependency", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePromiseDependency: Self = this.set("promiseDependency", js.undefined)
  }
}
