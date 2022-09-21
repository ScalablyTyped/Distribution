package typings.cacheManagerRedisStore

import org.scalablytyped.runtime.Shortcut
import typings.cacheManager.mod.Cache
import typings.cacheManager.mod.CacheOptions
import typings.cacheManager.mod.Store
import typings.cacheManager.mod.StoreConfig
import typings.cacheManagerRedisStore.cacheManagerRedisStoreStrings.redis
import typings.cacheManagerRedisStore.mod.CacheManagerRedisStore.RedisCache
import typings.cacheManagerRedisStore.mod.CacheManagerRedisStore.RedisStoreConstructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("cache-manager-redis-store", JSImport.Namespace)
  @js.native
  val ^ : RedisStoreConstructor = js.native
  
  /* augmented module */
  object cacheManagerAugmentingMod {
    
    @JSImport("cache-manager", JSImport.Namespace)
    @js.native
    val ^ : js.Any = js.native
    
    inline def caching(IConfig: StoreConfig & CacheOptions): RedisCache = ^.asInstanceOf[js.Dynamic].applyDynamic("caching")(IConfig.asInstanceOf[js.Any]).asInstanceOf[RedisCache]
  }
  
  object CacheManagerRedisStore {
    
    @js.native
    trait RedisCache
      extends StObject
         with Cache {
      
      @JSName("store")
      var store_RedisCache: RedisStore = js.native
    }
    
    trait RedisStore
      extends StObject
         with Store {
      
      def getClient(): Any
      
      def isCacheableValue(value: Any): Boolean
      
      var name: redis
    }
    object RedisStore {
      
      inline def apply(
        get: /* repeated */ Any => js.Promise[Any],
        getClient: () => Any,
        isCacheableValue: Any => Boolean,
        set: /* repeated */ Any => js.Promise[Any]
      ): RedisStore = {
        val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), getClient = js.Any.fromFunction0(getClient), isCacheableValue = js.Any.fromFunction1(isCacheableValue), name = "redis", set = js.Any.fromFunction1(set))
        __obj.asInstanceOf[RedisStore]
      }
      
      extension [Self <: RedisStore](x: Self) {
        
        inline def setGetClient(value: () => Any): Self = StObject.set(x, "getClient", js.Any.fromFunction0(value))
        
        inline def setIsCacheableValue(value: Any => Boolean): Self = StObject.set(x, "isCacheableValue", js.Any.fromFunction1(value))
        
        inline def setName(value: redis): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      }
    }
    
    @js.native
    trait RedisStoreConstructor extends StObject {
      
      def create(): RedisStore = js.native
      def create(
        options: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Redis.ClientOpts */ Any
      ): RedisStore = js.native
    }
  }
  
  type _To = RedisStoreConstructor
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: RedisStoreConstructor = ^
}
