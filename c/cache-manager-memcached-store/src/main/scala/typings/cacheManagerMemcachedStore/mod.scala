package typings.cacheManagerMemcachedStore

import org.scalablytyped.runtime.Shortcut
import typings.cacheManager.distCachingMod.Cache
import typings.cacheManager.distCachingMod.Store
import typings.cacheManager.distCachingMod.StoreConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("cache-manager-memcached-store", JSImport.Namespace)
  @js.native
  val ^ : CacheManagerMemcachedStoreConstructor = js.native
  
  /* augmented module */
  object cacheManagerAugmentingMod {
    
    @JSImport("cache-manager", JSImport.Namespace)
    @js.native
    val ^ : js.Any = js.native
    
    inline def caching(
      IConfig: CacheManagerMemcachedStoreConfig | (StoreConfig & (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CacheOptions */ Any))
    ): Cache[Store] = ^.asInstanceOf[js.Dynamic].applyDynamic("caching")(IConfig.asInstanceOf[js.Any]).asInstanceOf[Cache[Store]]
  }
  
  trait CacheManagerMemcachedStoreConfig extends StObject {
    
    var options: js.UndefOr[CacheManagerMemcachedStoreOptions] = js.undefined
    
    var store: CacheManagerMemcachedStoreConstructor
  }
  object CacheManagerMemcachedStoreConfig {
    
    inline def apply(store: CacheManagerMemcachedStoreConstructor): CacheManagerMemcachedStoreConfig = {
      val __obj = js.Dynamic.literal(store = store.asInstanceOf[js.Any])
      __obj.asInstanceOf[CacheManagerMemcachedStoreConfig]
    }
    
    extension [Self <: CacheManagerMemcachedStoreConfig](x: Self) {
      
      inline def setOptions(value: CacheManagerMemcachedStoreOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
      
      inline def setStore(value: CacheManagerMemcachedStoreConstructor): Self = StObject.set(x, "store", value.asInstanceOf[js.Any])
    }
  }
  
  trait CacheManagerMemcachedStoreConstructor extends StObject {
    
    def create(config: CacheManagerMemcachedStoreConfig): Store
  }
  object CacheManagerMemcachedStoreConstructor {
    
    inline def apply(create: CacheManagerMemcachedStoreConfig => Store): CacheManagerMemcachedStoreConstructor = {
      val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create))
      __obj.asInstanceOf[CacheManagerMemcachedStoreConstructor]
    }
    
    extension [Self <: CacheManagerMemcachedStoreConstructor](x: Self) {
      
      inline def setCreate(value: CacheManagerMemcachedStoreConfig => Store): Self = StObject.set(x, "create", js.Any.fromFunction1(value))
    }
  }
  
  trait CacheManagerMemcachedStoreOptions extends StObject {
    
    var autodiscover: js.UndefOr[Boolean] = js.undefined
    
    var backoffLimit: js.UndefOr[Double] = js.undefined
    
    var bufferBeforeError: js.UndefOr[Double] = js.undefined
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var hosts: js.UndefOr[js.Array[String] | Null] = js.undefined
    
    var maxValueSizes: js.UndefOr[Double] = js.undefined
    
    var netTimeout: js.UndefOr[Double] = js.undefined
    
    var onNetError: js.UndefOr[js.Function1[/* error */ js.Error, Unit]] = js.undefined
    
    var queue: js.UndefOr[Boolean] = js.undefined
    
    var reconnect: js.UndefOr[Boolean] = js.undefined
  }
  object CacheManagerMemcachedStoreOptions {
    
    inline def apply(): CacheManagerMemcachedStoreOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CacheManagerMemcachedStoreOptions]
    }
    
    extension [Self <: CacheManagerMemcachedStoreOptions](x: Self) {
      
      inline def setAutodiscover(value: Boolean): Self = StObject.set(x, "autodiscover", value.asInstanceOf[js.Any])
      
      inline def setAutodiscoverUndefined: Self = StObject.set(x, "autodiscover", js.undefined)
      
      inline def setBackoffLimit(value: Double): Self = StObject.set(x, "backoffLimit", value.asInstanceOf[js.Any])
      
      inline def setBackoffLimitUndefined: Self = StObject.set(x, "backoffLimit", js.undefined)
      
      inline def setBufferBeforeError(value: Double): Self = StObject.set(x, "bufferBeforeError", value.asInstanceOf[js.Any])
      
      inline def setBufferBeforeErrorUndefined: Self = StObject.set(x, "bufferBeforeError", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setHosts(value: js.Array[String]): Self = StObject.set(x, "hosts", value.asInstanceOf[js.Any])
      
      inline def setHostsNull: Self = StObject.set(x, "hosts", null)
      
      inline def setHostsUndefined: Self = StObject.set(x, "hosts", js.undefined)
      
      inline def setHostsVarargs(value: String*): Self = StObject.set(x, "hosts", js.Array(value*))
      
      inline def setMaxValueSizes(value: Double): Self = StObject.set(x, "maxValueSizes", value.asInstanceOf[js.Any])
      
      inline def setMaxValueSizesUndefined: Self = StObject.set(x, "maxValueSizes", js.undefined)
      
      inline def setNetTimeout(value: Double): Self = StObject.set(x, "netTimeout", value.asInstanceOf[js.Any])
      
      inline def setNetTimeoutUndefined: Self = StObject.set(x, "netTimeout", js.undefined)
      
      inline def setOnNetError(value: /* error */ js.Error => Unit): Self = StObject.set(x, "onNetError", js.Any.fromFunction1(value))
      
      inline def setOnNetErrorUndefined: Self = StObject.set(x, "onNetError", js.undefined)
      
      inline def setQueue(value: Boolean): Self = StObject.set(x, "queue", value.asInstanceOf[js.Any])
      
      inline def setQueueUndefined: Self = StObject.set(x, "queue", js.undefined)
      
      inline def setReconnect(value: Boolean): Self = StObject.set(x, "reconnect", value.asInstanceOf[js.Any])
      
      inline def setReconnectUndefined: Self = StObject.set(x, "reconnect", js.undefined)
    }
  }
  
  type _To = CacheManagerMemcachedStoreConstructor
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: CacheManagerMemcachedStoreConstructor = ^
}
