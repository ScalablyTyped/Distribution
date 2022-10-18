package typings.cacheManagerRedisStore

import org.scalablytyped.runtime.Shortcut
import typings.cacheManager.distCachingMod.Cache
import typings.cacheManager.distCachingMod.Store
import typings.cacheManager.distCachingMod.StoreConfig
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
    
    inline def caching(
      IConfig: StoreConfig & (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CacheOptions */ Any)
    ): RedisCache = ^.asInstanceOf[js.Dynamic].applyDynamic("caching")(IConfig.asInstanceOf[js.Any]).asInstanceOf[RedisCache]
  }
  
  object CacheManagerRedisStore {
    
    @js.native
    trait RedisCache
      extends StObject
         with Cache[Store] {
      
      @JSName("store")
      var store_RedisCache: RedisStore = js.native
    }
    
    @js.native
    trait RedisStore
      extends StObject
         with Store {
      
      def getClient(): Any = js.native
      
      def isCacheableValue(value: Any): Boolean = js.native
      
      var name: redis = js.native
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
