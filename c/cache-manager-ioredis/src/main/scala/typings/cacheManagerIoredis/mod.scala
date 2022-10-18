package typings.cacheManagerIoredis

import org.scalablytyped.runtime.Shortcut
import typings.cacheManager.distCachingMod.Cache
import typings.cacheManager.distCachingMod.CachingConfig
import typings.cacheManager.distCachingMod.Store
import typings.cacheManager.distCachingMod.StoreConfig
import typings.cacheManagerIoredis.anon.ClusterConfig
import typings.cacheManagerIoredis.anon.Max
import typings.cacheManagerIoredis.cacheManagerIoredisStrings.redis
import typings.cacheManagerIoredis.mod.CacheManagerIORedis.ClusterCache
import typings.cacheManagerIoredis.mod.CacheManagerIORedis.RedisStoreClusterConfig
import typings.cacheManagerIoredis.mod.CacheManagerIORedis.RedisStoreConstructor
import typings.cacheManagerIoredis.mod.CacheManagerIORedis.RedisStoreSingleNodeConfig
import typings.cacheManagerIoredis.mod.CacheManagerIORedis.SingleNodeCache
import typings.ioredis.builtClusterMod.ClusterNode
import typings.ioredis.builtRedisRedisOptionsMod.RedisOptions
import typings.ioredis.mod.Cluster
import typings.ioredis.mod.Redis
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("cache-manager-ioredis", JSImport.Namespace)
  @js.native
  val ^ : RedisStoreConstructor = js.native
  
  /* augmented module */
  object cacheManagerAugmentingMod {
    
    @JSImport("cache-manager", JSImport.Namespace)
    @js.native
    val ^ : js.Any = js.native
    
    inline def caching(
      IConfig: StoreConfig & (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CacheOptions */ Any)
    ): Cache[Store] = ^.asInstanceOf[js.Dynamic].applyDynamic("caching")(IConfig.asInstanceOf[js.Any]).asInstanceOf[Cache[Store]]
    
    inline def caching_ClusterCache(IConfig: RedisStoreClusterConfig): ClusterCache = ^.asInstanceOf[js.Dynamic].applyDynamic("caching")(IConfig.asInstanceOf[js.Any]).asInstanceOf[ClusterCache]
    
    inline def caching_SingleNodeCache(IConfig: RedisStoreSingleNodeConfig): SingleNodeCache = ^.asInstanceOf[js.Dynamic].applyDynamic("caching")(IConfig.asInstanceOf[js.Any]).asInstanceOf[SingleNodeCache]
  }
  
  object CacheManagerIORedis {
    
    @js.native
    trait ClusterCache
      extends StObject
         with Cache[Store] {
      
      @JSName("store")
      var store_ClusterCache: RedisClusterStore = js.native
    }
    
    trait ClusterOptions extends StObject {
      
      var nodes: js.Array[ClusterNode]
      
      var options: typings.ioredis.builtClusterClusterOptionsMod.ClusterOptions
    }
    object ClusterOptions {
      
      inline def apply(
        nodes: js.Array[ClusterNode],
        options: typings.ioredis.builtClusterClusterOptionsMod.ClusterOptions
      ): ClusterOptions = {
        val __obj = js.Dynamic.literal(nodes = nodes.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any])
        __obj.asInstanceOf[ClusterOptions]
      }
      
      extension [Self <: ClusterOptions](x: Self) {
        
        inline def setNodes(value: js.Array[ClusterNode]): Self = StObject.set(x, "nodes", value.asInstanceOf[js.Any])
        
        inline def setNodesVarargs(value: ClusterNode*): Self = StObject.set(x, "nodes", js.Array(value*))
        
        inline def setOptions(value: typings.ioredis.builtClusterClusterOptionsMod.ClusterOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      }
    }
    
    @js.native
    trait RedisClusterStore
      extends StObject
         with RedisStore
    
    @js.native
    trait RedisSingleNodeStore
      extends StObject
         with RedisStore
    
    @js.native
    trait RedisStore
      extends StObject
         with Store {
      
      def del(args: Any*): js.Promise[Any] = js.native
      
      def getClient(): Redis | Cluster = js.native
      
      def isCacheableValue(value: Any): Boolean = js.native
      
      def keys(args: Any*): js.Promise[Any] = js.native
      
      var name: redis = js.native
      
      def reset(args: Any*): js.Promise[Any] = js.native
      
      def ttl(args: Any*): js.Promise[Any] = js.native
    }
    
    type RedisStoreClusterConfig = (CachingConfig[
        /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for T */ Any
      ]) & ClusterConfig & (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CacheOptions */ Any)
    
    trait RedisStoreConstructor extends StObject {
      
      var create: js.Function1[
            (/* repeated */ RedisStoreClusterConfig) | (/* repeated */ RedisStoreSingleNodeConfig), 
            RedisClusterStore | RedisSingleNodeStore
          ]
    }
    object RedisStoreConstructor {
      
      inline def apply(
        create: (/* repeated */ RedisStoreClusterConfig) | (/* repeated */ RedisStoreSingleNodeConfig) => RedisClusterStore | RedisSingleNodeStore
      ): RedisStoreConstructor = {
        val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create))
        __obj.asInstanceOf[RedisStoreConstructor]
      }
      
      extension [Self <: RedisStoreConstructor](x: Self) {
        
        inline def setCreate(
          value: (/* repeated */ RedisStoreClusterConfig) | (/* repeated */ RedisStoreSingleNodeConfig) => RedisClusterStore | RedisSingleNodeStore
        ): Self = StObject.set(x, "create", js.Any.fromFunction1(value))
      }
    }
    
    type RedisStoreSingleNodeConfig = (CachingConfig[
        /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for T */ Any
      ]) & RedisOptions & Max & (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CacheOptions */ Any)
    
    @js.native
    trait SingleNodeCache
      extends StObject
         with Cache[Store] {
      
      @JSName("store")
      var store_SingleNodeCache: RedisSingleNodeStore = js.native
    }
  }
  
  type _To = RedisStoreConstructor
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: RedisStoreConstructor = ^
}
