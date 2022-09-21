package typings.cacheManagerIoredis

import org.scalablytyped.runtime.Shortcut
import typings.cacheManager.mod.Cache
import typings.cacheManager.mod.CacheOptions
import typings.cacheManager.mod.CachingConfig
import typings.cacheManager.mod.Store
import typings.cacheManager.mod.StoreConfig
import typings.cacheManagerIoredis.cacheManagerIoredisStrings.redis
import typings.cacheManagerIoredis.mod.CacheManagerIORedis.ClusterCache
import typings.cacheManagerIoredis.mod.CacheManagerIORedis.RedisStoreClusterConfig
import typings.cacheManagerIoredis.mod.CacheManagerIORedis.RedisStoreConstructor
import typings.cacheManagerIoredis.mod.CacheManagerIORedis.RedisStoreSingleNodeConfig
import typings.cacheManagerIoredis.mod.CacheManagerIORedis.SingleNodeCache
import typings.ioredis.clusterMod.ClusterNode
import typings.ioredis.mod.Cluster
import typings.ioredis.mod.Redis
import typings.ioredis.redisOptionsMod.RedisOptions
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
    
    inline def caching(IConfig: StoreConfig & CacheOptions): Cache = ^.asInstanceOf[js.Dynamic].applyDynamic("caching")(IConfig.asInstanceOf[js.Any]).asInstanceOf[Cache]
    inline def caching(IConfig: RedisStoreClusterConfig): ClusterCache = ^.asInstanceOf[js.Dynamic].applyDynamic("caching")(IConfig.asInstanceOf[js.Any]).asInstanceOf[ClusterCache]
    inline def caching(IConfig: RedisStoreSingleNodeConfig): SingleNodeCache = ^.asInstanceOf[js.Dynamic].applyDynamic("caching")(IConfig.asInstanceOf[js.Any]).asInstanceOf[SingleNodeCache]
  }
  
  object CacheManagerIORedis {
    
    @js.native
    trait ClusterCache
      extends StObject
         with Cache {
      
      @JSName("store")
      var store_ClusterCache: RedisClusterStore = js.native
    }
    
    trait ClusterOptions extends StObject {
      
      var nodes: js.Array[ClusterNode]
      
      var options: typings.ioredis.clusterOptionsMod.ClusterOptions
    }
    object ClusterOptions {
      
      inline def apply(nodes: js.Array[ClusterNode], options: typings.ioredis.clusterOptionsMod.ClusterOptions): ClusterOptions = {
        val __obj = js.Dynamic.literal(nodes = nodes.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any])
        __obj.asInstanceOf[ClusterOptions]
      }
      
      extension [Self <: ClusterOptions](x: Self) {
        
        inline def setNodes(value: js.Array[ClusterNode]): Self = StObject.set(x, "nodes", value.asInstanceOf[js.Any])
        
        inline def setNodesVarargs(value: ClusterNode*): Self = StObject.set(x, "nodes", js.Array(value*))
        
        inline def setOptions(value: typings.ioredis.clusterOptionsMod.ClusterOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      }
    }
    
    trait RedisClusterStore
      extends StObject
         with RedisStore
    object RedisClusterStore {
      
      inline def apply(
        del: /* repeated */ Any => js.Promise[Any],
        get: /* repeated */ Any => js.Promise[Any],
        getClient: () => Redis | Cluster,
        isCacheableValue: Any => Boolean,
        keys: /* repeated */ Any => js.Promise[Any],
        reset: /* repeated */ Any => js.Promise[Any],
        set: /* repeated */ Any => js.Promise[Any],
        ttl: /* repeated */ Any => js.Promise[Any]
      ): RedisClusterStore = {
        val __obj = js.Dynamic.literal(del = js.Any.fromFunction1(del), get = js.Any.fromFunction1(get), getClient = js.Any.fromFunction0(getClient), isCacheableValue = js.Any.fromFunction1(isCacheableValue), keys = js.Any.fromFunction1(keys), name = "redis", reset = js.Any.fromFunction1(reset), set = js.Any.fromFunction1(set), ttl = js.Any.fromFunction1(ttl))
        __obj.asInstanceOf[RedisClusterStore]
      }
    }
    
    trait RedisSingleNodeStore
      extends StObject
         with RedisStore
    object RedisSingleNodeStore {
      
      inline def apply(
        del: /* repeated */ Any => js.Promise[Any],
        get: /* repeated */ Any => js.Promise[Any],
        getClient: () => Redis | Cluster,
        isCacheableValue: Any => Boolean,
        keys: /* repeated */ Any => js.Promise[Any],
        reset: /* repeated */ Any => js.Promise[Any],
        set: /* repeated */ Any => js.Promise[Any],
        ttl: /* repeated */ Any => js.Promise[Any]
      ): RedisSingleNodeStore = {
        val __obj = js.Dynamic.literal(del = js.Any.fromFunction1(del), get = js.Any.fromFunction1(get), getClient = js.Any.fromFunction0(getClient), isCacheableValue = js.Any.fromFunction1(isCacheableValue), keys = js.Any.fromFunction1(keys), name = "redis", reset = js.Any.fromFunction1(reset), set = js.Any.fromFunction1(set), ttl = js.Any.fromFunction1(ttl))
        __obj.asInstanceOf[RedisSingleNodeStore]
      }
    }
    
    trait RedisStore
      extends StObject
         with Store {
      
      @JSName("del")
      def del_MRedisStore(args: Any*): js.Promise[Any]
      
      def getClient(): Redis | Cluster
      
      def isCacheableValue(value: Any): Boolean
      
      @JSName("keys")
      def keys_MRedisStore(args: Any*): js.Promise[Any]
      
      var name: redis
      
      @JSName("reset")
      def reset_MRedisStore(args: Any*): js.Promise[Any]
      
      @JSName("ttl")
      def ttl_MRedisStore(args: Any*): js.Promise[Any]
    }
    object RedisStore {
      
      inline def apply(
        del: /* repeated */ Any => js.Promise[Any],
        get: /* repeated */ Any => js.Promise[Any],
        getClient: () => Redis | Cluster,
        isCacheableValue: Any => Boolean,
        keys: /* repeated */ Any => js.Promise[Any],
        reset: /* repeated */ Any => js.Promise[Any],
        set: /* repeated */ Any => js.Promise[Any],
        ttl: /* repeated */ Any => js.Promise[Any]
      ): RedisStore = {
        val __obj = js.Dynamic.literal(del = js.Any.fromFunction1(del), get = js.Any.fromFunction1(get), getClient = js.Any.fromFunction0(getClient), isCacheableValue = js.Any.fromFunction1(isCacheableValue), keys = js.Any.fromFunction1(keys), name = "redis", reset = js.Any.fromFunction1(reset), set = js.Any.fromFunction1(set), ttl = js.Any.fromFunction1(ttl))
        __obj.asInstanceOf[RedisStore]
      }
      
      extension [Self <: RedisStore](x: Self) {
        
        inline def setDel(value: /* repeated */ Any => js.Promise[Any]): Self = StObject.set(x, "del", js.Any.fromFunction1(value))
        
        inline def setGetClient(value: () => Redis | Cluster): Self = StObject.set(x, "getClient", js.Any.fromFunction0(value))
        
        inline def setIsCacheableValue(value: Any => Boolean): Self = StObject.set(x, "isCacheableValue", js.Any.fromFunction1(value))
        
        inline def setKeys(value: /* repeated */ Any => js.Promise[Any]): Self = StObject.set(x, "keys", js.Any.fromFunction1(value))
        
        inline def setName(value: redis): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
        
        inline def setReset(value: /* repeated */ Any => js.Promise[Any]): Self = StObject.set(x, "reset", js.Any.fromFunction1(value))
        
        inline def setTtl(value: /* repeated */ Any => js.Promise[Any]): Self = StObject.set(x, "ttl", js.Any.fromFunction1(value))
      }
    }
    
    trait RedisStoreClusterConfig
      extends StObject
         with CachingConfig
         with CacheOptions {
      
      var clusterConfig: ClusterOptions
      
      var max: js.UndefOr[Double] = js.undefined
      
      var store: RedisStoreConstructor
    }
    object RedisStoreClusterConfig {
      
      inline def apply(clusterConfig: ClusterOptions, store: RedisStoreConstructor): RedisStoreClusterConfig = {
        val __obj = js.Dynamic.literal(clusterConfig = clusterConfig.asInstanceOf[js.Any], store = store.asInstanceOf[js.Any])
        __obj.asInstanceOf[RedisStoreClusterConfig]
      }
      
      extension [Self <: RedisStoreClusterConfig](x: Self) {
        
        inline def setClusterConfig(value: ClusterOptions): Self = StObject.set(x, "clusterConfig", value.asInstanceOf[js.Any])
        
        inline def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
        
        inline def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
        
        inline def setStore(value: RedisStoreConstructor): Self = StObject.set(x, "store", value.asInstanceOf[js.Any])
      }
    }
    
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
    
    trait RedisStoreSingleNodeConfig
      extends StObject
         with CachingConfig
         with RedisOptions
         with CacheOptions {
      
      var max: js.UndefOr[Double] = js.undefined
      
      var store: RedisStoreConstructor
    }
    object RedisStoreSingleNodeConfig {
      
      inline def apply(keepAlive: js.UndefOr[Double] & js.UndefOr[Boolean], store: RedisStoreConstructor): RedisStoreSingleNodeConfig = {
        val __obj = js.Dynamic.literal(keepAlive = keepAlive.asInstanceOf[js.Any], store = store.asInstanceOf[js.Any])
        __obj.asInstanceOf[RedisStoreSingleNodeConfig]
      }
      
      extension [Self <: RedisStoreSingleNodeConfig](x: Self) {
        
        inline def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
        
        inline def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
        
        inline def setStore(value: RedisStoreConstructor): Self = StObject.set(x, "store", value.asInstanceOf[js.Any])
      }
    }
    
    @js.native
    trait SingleNodeCache
      extends StObject
         with Cache {
      
      @JSName("store")
      var store_SingleNodeCache: RedisSingleNodeStore = js.native
    }
  }
  
  type _To = RedisStoreConstructor
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: RedisStoreConstructor = ^
}
