package typings.cacheManagerIoredis

import org.scalablytyped.runtime.Shortcut
import typings.cacheManager.mod.Cache
import typings.cacheManager.mod.CacheOptions
import typings.cacheManager.mod.Store
import typings.cacheManager.mod.StoreConfig
import typings.cacheManager.mod.TtlFunction
import typings.cacheManagerIoredis.cacheManagerIoredisNumbers.`1`
import typings.cacheManagerIoredis.cacheManagerIoredisNumbers.`2`
import typings.cacheManagerIoredis.cacheManagerIoredisStrings.master
import typings.cacheManagerIoredis.cacheManagerIoredisStrings.redis
import typings.cacheManagerIoredis.cacheManagerIoredisStrings.slave
import typings.cacheManagerIoredis.mod.CacheManagerIORedis.ClusterCache
import typings.cacheManagerIoredis.mod.CacheManagerIORedis.RedisStoreClusterConfig
import typings.cacheManagerIoredis.mod.CacheManagerIORedis.RedisStoreConstructor
import typings.cacheManagerIoredis.mod.CacheManagerIORedis.RedisStoreSingleNodeConfig
import typings.cacheManagerIoredis.mod.CacheManagerIORedis.SingleNodeCache
import typings.ioredis.anon.Host
import typings.ioredis.anon.Ip
import typings.ioredis.mod.AddressFromResponse
import typings.ioredis.mod.Cluster
import typings.ioredis.mod.ClusterNode
import typings.ioredis.mod.NatMap
import typings.ioredis.mod.PreferredSlaves
import typings.ioredis.mod.Redis
import typings.ioredis.mod.SecureContextOptions
import typings.node.tlsMod.ConnectionOptions
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("cache-manager-ioredis", JSImport.Namespace)
  @js.native
  val ^ : RedisStoreConstructor = js.native
  
  /* augmented module */
  object cacheManagerAugmentingMod {
    
    @JSImport("cache-manager", "caching")
    @js.native
    def caching(IConfig: StoreConfig with CacheOptions): Cache = js.native
    @JSImport("cache-manager", "caching")
    @js.native
    def caching(IConfig: RedisStoreClusterConfig): ClusterCache = js.native
    @JSImport("cache-manager", "caching")
    @js.native
    def caching(IConfig: RedisStoreSingleNodeConfig): SingleNodeCache = js.native
  }
  
  object CacheManagerIORedis {
    
    @js.native
    trait ClusterCache extends Cache {
      
      @JSName("store")
      var store_ClusterCache: RedisClusterStore = js.native
    }
    
    @js.native
    trait ClusterOptions extends StObject {
      
      var nodes: js.Array[ClusterNode] = js.native
      
      var options: typings.ioredis.mod.ClusterOptions = js.native
    }
    object ClusterOptions {
      
      @scala.inline
      def apply(nodes: js.Array[ClusterNode], options: typings.ioredis.mod.ClusterOptions): ClusterOptions = {
        val __obj = js.Dynamic.literal(nodes = nodes.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any])
        __obj.asInstanceOf[ClusterOptions]
      }
      
      @scala.inline
      implicit class ClusterOptionsMutableBuilder[Self <: ClusterOptions] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setNodes(value: js.Array[ClusterNode]): Self = StObject.set(x, "nodes", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setNodesVarargs(value: ClusterNode*): Self = StObject.set(x, "nodes", js.Array(value :_*))
        
        @scala.inline
        def setOptions(value: typings.ioredis.mod.ClusterOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      }
    }
    
    @js.native
    trait RedisClusterStore extends RedisStore
    object RedisClusterStore {
      
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
      ): RedisClusterStore = {
        val __obj = js.Dynamic.literal(del = js.Any.fromFunction1(del), get = js.Any.fromFunction1(get), getClient = js.Any.fromFunction0(getClient), isCacheableValue = js.Any.fromFunction1(isCacheableValue), keys = js.Any.fromFunction1(keys), name = name.asInstanceOf[js.Any], reset = js.Any.fromFunction1(reset), set = js.Any.fromFunction1(set), ttl = js.Any.fromFunction1(ttl))
        __obj.asInstanceOf[RedisClusterStore]
      }
    }
    
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
    
    @js.native
    trait RedisStore extends Store {
      
      @JSName("del")
      def del_MRedisStore(args: js.Any*): js.Promise[_] = js.native
      
      def getClient(): Redis | Cluster = js.native
      
      def isCacheableValue(value: js.Any): Boolean = js.native
      
      @JSName("keys")
      def keys_MRedisStore(args: js.Any*): js.Promise[_] = js.native
      
      var name: redis = js.native
      
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
      implicit class RedisStoreMutableBuilder[Self <: RedisStore] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setDel(value: /* repeated */ js.Any => js.Promise[_]): Self = StObject.set(x, "del", js.Any.fromFunction1(value))
        
        @scala.inline
        def setGetClient(value: () => Redis | Cluster): Self = StObject.set(x, "getClient", js.Any.fromFunction0(value))
        
        @scala.inline
        def setIsCacheableValue(value: js.Any => Boolean): Self = StObject.set(x, "isCacheableValue", js.Any.fromFunction1(value))
        
        @scala.inline
        def setKeys(value: /* repeated */ js.Any => js.Promise[_]): Self = StObject.set(x, "keys", js.Any.fromFunction1(value))
        
        @scala.inline
        def setName(value: redis): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setReset(value: /* repeated */ js.Any => js.Promise[_]): Self = StObject.set(x, "reset", js.Any.fromFunction1(value))
        
        @scala.inline
        def setTtl(value: /* repeated */ js.Any => js.Promise[_]): Self = StObject.set(x, "ttl", js.Any.fromFunction1(value))
      }
    }
    
    /* Inlined cache-manager.cache-manager.CachingConfig & {  store :cache-manager-ioredis.cache-manager-ioredis.CacheManagerIORedis.RedisStoreConstructor,   max :number | undefined,   clusterConfig :cache-manager-ioredis.cache-manager-ioredis.CacheManagerIORedis.ClusterOptions} & cache-manager.cache-manager.CacheOptions */
    @js.native
    trait RedisStoreClusterConfig extends StObject {
      
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
      implicit class RedisStoreClusterConfigMutableBuilder[Self <: RedisStoreClusterConfig] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setClusterConfig(value: ClusterOptions): Self = StObject.set(x, "clusterConfig", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setIsCacheableValue(value: /* value */ js.Any => Boolean): Self = StObject.set(x, "isCacheableValue", js.Any.fromFunction1(value))
        
        @scala.inline
        def setIsCacheableValueUndefined: Self = StObject.set(x, "isCacheableValue", js.undefined)
        
        @scala.inline
        def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
        
        @scala.inline
        def setPromiseDependency(value: js.Any): Self = StObject.set(x, "promiseDependency", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPromiseDependencyUndefined: Self = StObject.set(x, "promiseDependency", js.undefined)
        
        @scala.inline
        def setStore(value: RedisStoreConstructor): Self = StObject.set(x, "store", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTtl(value: Double | TtlFunction): Self = StObject.set(x, "ttl", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTtlFunction1(value: /* result */ js.Any => Double): Self = StObject.set(x, "ttl", js.Any.fromFunction1(value))
      }
    }
    
    @js.native
    trait RedisStoreConstructor extends StObject {
      
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
      implicit class RedisStoreConstructorMutableBuilder[Self <: RedisStoreConstructor] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setCreate(
          value: (/* repeated */ RedisStoreClusterConfig) | (/* repeated */ RedisStoreSingleNodeConfig) => RedisClusterStore | RedisSingleNodeStore
        ): Self = StObject.set(x, "create", js.Any.fromFunction1(value))
      }
    }
    
    /* Inlined cache-manager.cache-manager.CachingConfig & ioredis.ioredis.RedisOptions & {  store :cache-manager-ioredis.cache-manager-ioredis.CacheManagerIORedis.RedisStoreConstructor,   max :number | undefined} & cache-manager.cache-manager.CacheOptions */
    @js.native
    trait RedisStoreSingleNodeConfig extends StObject {
      
      /**
        * If true, client will resend unfulfilled commands(e.g. block commands) in the previous connection when reconnected.
        * default: true.
        */
      var autoResendUnfulfilledCommands: js.UndefOr[Boolean] = js.native
      
      /**
        * After reconnected, if the previous connection was in the subscriber mode, client will auto re-subscribe these channels.
        * default: true.
        */
      var autoResubscribe: js.UndefOr[Boolean] = js.native
      
      /**
        * The milliseconds before a timeout occurs during the initial connection to the Redis server.
        * default: 10000.
        */
      var connectTimeout: js.UndefOr[Double] = js.native
      
      var connectionName: js.UndefOr[String] = js.native
      
      /**
        * Database index to use.
        */
      var db: js.UndefOr[Double] = js.native
      
      /**
        * If you are using the hiredis parser, it's highly recommended to enable this option.
        * Create another instance with dropBufferSupport disabled for other commands that you want to return binary instead of string
        */
      var dropBufferSupport: js.UndefOr[Boolean] = js.native
      
      /**
        * When enabled, all commands issued during an event loop iteration are automatically wrapped in a
        * pipeline and sent to the server at the same time. This can improve performance by 30-50%.
        * default: false.
        */
      var enableAutoPipelining: js.UndefOr[Boolean] = js.native
      
      /**
        * By default, if there is no active connection to the Redis server, commands are added to a queue
        * and are executed once the connection is "ready" (when enableReadyCheck is true, "ready" means
        * the Redis server has loaded the database from disk, otherwise means the connection to the Redis
        * server has been established). If this option is false, when execute the command when the connection
        * isn't ready, an error will be returned.
        */
      var enableOfflineQueue: js.UndefOr[Boolean] = js.native
      
      /**
        * When a connection is established to the Redis server, the server might still be loading
        * the database from disk. While loading, the server not respond to any commands.
        * To work around this, when this option is true, ioredis will check the status of the Redis server,
        * and when the Redis server is able to process commands, a ready event will be emitted.
        */
      var enableReadyCheck: js.UndefOr[Boolean] = js.native
      
      /**
        * Whether to support the `tls` option when connecting to Redis via sentinel mode.
        * default: false.
        */
      var enableTLSForSentinelMode: js.UndefOr[Boolean] = js.native
      
      /**
        * 4 (IPv4) or 6 (IPv6), Defaults to 4.
        */
      var family: js.UndefOr[Double] = js.native
      
      var host: js.UndefOr[String] = js.native
      
      var isCacheableValue: js.UndefOr[js.Function1[/* value */ js.Any, Boolean]] = js.native
      
      /**
        * TCP KeepAlive on the socket with a X ms delay before start. Set to a non-number value to disable keepAlive.
        */
      var keepAlive: js.UndefOr[Double] = js.native
      
      var keyPrefix: js.UndefOr[String] = js.native
      
      var lazyConnect: js.UndefOr[Boolean] = js.native
      
      var max: js.UndefOr[Double] = js.native
      
      /**
        * By default, all pending commands will be flushed with an error every
        * 20 retry attempts. That makes sure commands won't wait forever when
        * the connection is down. You can change this behavior by setting
        * `maxRetriesPerRequest`.
        *
        * Set maxRetriesPerRequest to `null` to disable this behavior, and
        * every command will wait forever until the connection is alive again
        * (which is the default behavior before ioredis v4).
        */
      var maxRetriesPerRequest: js.UndefOr[Double | Null] = js.native
      
      /**
        * default: null.
        */
      var name: js.UndefOr[String] = js.native
      
      /**
        * NAT map for sentinel connector.
        * default: null.
        */
      var natMap: js.UndefOr[NatMap] = js.native
      
      /**
        * If set, client will send AUTH command with the value of this option when connected.
        */
      var password: js.UndefOr[String] = js.native
      
      /**
        * Local domain socket path. If set the port, host and family will be ignored.
        */
      var path: js.UndefOr[String] = js.native
      
      var port: js.UndefOr[Double] = js.native
      
      /**
        * Can be used to prefer a particular slave or set of slaves based on priority.
        */
      var preferredSlaves: js.UndefOr[PreferredSlaves] = js.native
      
      /**
        * Promise library to replace global.Promise
        */
      var promiseDependency: js.UndefOr[js.Any] = js.native
      
      /**
        * Enable READONLY mode for the connection. Only available for cluster mode.
        * default: false.
        */
      var readOnly: js.UndefOr[Boolean] = js.native
      
      /**
        * 1/true means reconnect, 2 means reconnect and resend failed command. Returning false will ignore
        * the error and do nothing.
        */
      var reconnectOnError: js.UndefOr[js.Function1[/* error */ Error, Boolean | `1` | `2`]] = js.native
      
      /**
        * When the return value isn't a number, ioredis will stop trying to reconnect.
        * Fixed in: https://github.com/DefinitelyTyped/DefinitelyTyped/pull/15858
        */
      var retryStrategy: js.UndefOr[js.Function1[/* times */ Double, Double | Unit | Null]] = js.native
      
      /**
        * default: "master".
        */
      var role: js.UndefOr[master | slave] = js.native
      
      var sentinelPassword: js.UndefOr[String] = js.native
      
      /**
        * If `sentinelRetryStrategy` returns a valid delay time, ioredis will try to reconnect from scratch.
        * default: function(times) { return Math.min(times * 10, 1000); }
        */
      var sentinelRetryStrategy: js.UndefOr[js.Function1[/* times */ Double, Double | Unit | Null]] = js.native
      
      var sentinelTLS: js.UndefOr[SecureContextOptions] = js.native
      
      var sentinelUsername: js.UndefOr[String] = js.native
      
      var sentinels: js.UndefOr[js.Array[Host]] = js.native
      
      /**
        * Whether to show a friendly error stack. Will decrease the performance significantly.
        */
      var showFriendlyErrorStack: js.UndefOr[Boolean] = js.native
      
      var store: RedisStoreConstructor = js.native
      
      var tls: js.UndefOr[ConnectionOptions] = js.native
      
      var ttl: Double | TtlFunction = js.native
      
      /**
        * Update the given `sentinels` list with new IP addresses when communicating with existing sentinels.
        * default: true.
        */
      var updateSentinels: js.UndefOr[Boolean] = js.native
      
      /**
        * If set, client will send AUTH command with the value of this option as the first argument when connected. The `password` option must be set too. Username should only be set for Redis >=6.
        */
      var username: js.UndefOr[String] = js.native
    }
    object RedisStoreSingleNodeConfig {
      
      @scala.inline
      def apply(store: RedisStoreConstructor, ttl: Double | TtlFunction): RedisStoreSingleNodeConfig = {
        val __obj = js.Dynamic.literal(store = store.asInstanceOf[js.Any], ttl = ttl.asInstanceOf[js.Any])
        __obj.asInstanceOf[RedisStoreSingleNodeConfig]
      }
      
      @scala.inline
      implicit class RedisStoreSingleNodeConfigMutableBuilder[Self <: RedisStoreSingleNodeConfig] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setAutoResendUnfulfilledCommands(value: Boolean): Self = StObject.set(x, "autoResendUnfulfilledCommands", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAutoResendUnfulfilledCommandsUndefined: Self = StObject.set(x, "autoResendUnfulfilledCommands", js.undefined)
        
        @scala.inline
        def setAutoResubscribe(value: Boolean): Self = StObject.set(x, "autoResubscribe", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAutoResubscribeUndefined: Self = StObject.set(x, "autoResubscribe", js.undefined)
        
        @scala.inline
        def setConnectTimeout(value: Double): Self = StObject.set(x, "connectTimeout", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setConnectTimeoutUndefined: Self = StObject.set(x, "connectTimeout", js.undefined)
        
        @scala.inline
        def setConnectionName(value: String): Self = StObject.set(x, "connectionName", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setConnectionNameUndefined: Self = StObject.set(x, "connectionName", js.undefined)
        
        @scala.inline
        def setDb(value: Double): Self = StObject.set(x, "db", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDbUndefined: Self = StObject.set(x, "db", js.undefined)
        
        @scala.inline
        def setDropBufferSupport(value: Boolean): Self = StObject.set(x, "dropBufferSupport", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDropBufferSupportUndefined: Self = StObject.set(x, "dropBufferSupport", js.undefined)
        
        @scala.inline
        def setEnableAutoPipelining(value: Boolean): Self = StObject.set(x, "enableAutoPipelining", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setEnableAutoPipeliningUndefined: Self = StObject.set(x, "enableAutoPipelining", js.undefined)
        
        @scala.inline
        def setEnableOfflineQueue(value: Boolean): Self = StObject.set(x, "enableOfflineQueue", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setEnableOfflineQueueUndefined: Self = StObject.set(x, "enableOfflineQueue", js.undefined)
        
        @scala.inline
        def setEnableReadyCheck(value: Boolean): Self = StObject.set(x, "enableReadyCheck", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setEnableReadyCheckUndefined: Self = StObject.set(x, "enableReadyCheck", js.undefined)
        
        @scala.inline
        def setEnableTLSForSentinelMode(value: Boolean): Self = StObject.set(x, "enableTLSForSentinelMode", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setEnableTLSForSentinelModeUndefined: Self = StObject.set(x, "enableTLSForSentinelMode", js.undefined)
        
        @scala.inline
        def setFamily(value: Double): Self = StObject.set(x, "family", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFamilyUndefined: Self = StObject.set(x, "family", js.undefined)
        
        @scala.inline
        def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
        
        @scala.inline
        def setIsCacheableValue(value: /* value */ js.Any => Boolean): Self = StObject.set(x, "isCacheableValue", js.Any.fromFunction1(value))
        
        @scala.inline
        def setIsCacheableValueUndefined: Self = StObject.set(x, "isCacheableValue", js.undefined)
        
        @scala.inline
        def setKeepAlive(value: Double): Self = StObject.set(x, "keepAlive", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setKeepAliveUndefined: Self = StObject.set(x, "keepAlive", js.undefined)
        
        @scala.inline
        def setKeyPrefix(value: String): Self = StObject.set(x, "keyPrefix", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setKeyPrefixUndefined: Self = StObject.set(x, "keyPrefix", js.undefined)
        
        @scala.inline
        def setLazyConnect(value: Boolean): Self = StObject.set(x, "lazyConnect", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setLazyConnectUndefined: Self = StObject.set(x, "lazyConnect", js.undefined)
        
        @scala.inline
        def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMaxRetriesPerRequest(value: Double): Self = StObject.set(x, "maxRetriesPerRequest", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMaxRetriesPerRequestNull: Self = StObject.set(x, "maxRetriesPerRequest", null)
        
        @scala.inline
        def setMaxRetriesPerRequestUndefined: Self = StObject.set(x, "maxRetriesPerRequest", js.undefined)
        
        @scala.inline
        def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
        
        @scala.inline
        def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
        
        @scala.inline
        def setNatMap(value: NatMap): Self = StObject.set(x, "natMap", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setNatMapUndefined: Self = StObject.set(x, "natMap", js.undefined)
        
        @scala.inline
        def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPasswordUndefined: Self = StObject.set(x, "password", js.undefined)
        
        @scala.inline
        def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
        
        @scala.inline
        def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
        
        @scala.inline
        def setPreferredSlaves(value: PreferredSlaves): Self = StObject.set(x, "preferredSlaves", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPreferredSlavesFunction1(value: /* slaves */ js.Array[AddressFromResponse] => AddressFromResponse | Null): Self = StObject.set(x, "preferredSlaves", js.Any.fromFunction1(value))
        
        @scala.inline
        def setPreferredSlavesUndefined: Self = StObject.set(x, "preferredSlaves", js.undefined)
        
        @scala.inline
        def setPreferredSlavesVarargs(value: Ip*): Self = StObject.set(x, "preferredSlaves", js.Array(value :_*))
        
        @scala.inline
        def setPromiseDependency(value: js.Any): Self = StObject.set(x, "promiseDependency", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPromiseDependencyUndefined: Self = StObject.set(x, "promiseDependency", js.undefined)
        
        @scala.inline
        def setReadOnly(value: Boolean): Self = StObject.set(x, "readOnly", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setReadOnlyUndefined: Self = StObject.set(x, "readOnly", js.undefined)
        
        @scala.inline
        def setReconnectOnError(value: /* error */ Error => Boolean | `1` | `2`): Self = StObject.set(x, "reconnectOnError", js.Any.fromFunction1(value))
        
        @scala.inline
        def setReconnectOnErrorUndefined: Self = StObject.set(x, "reconnectOnError", js.undefined)
        
        @scala.inline
        def setRetryStrategy(value: /* times */ Double => Double | Unit | Null): Self = StObject.set(x, "retryStrategy", js.Any.fromFunction1(value))
        
        @scala.inline
        def setRetryStrategyUndefined: Self = StObject.set(x, "retryStrategy", js.undefined)
        
        @scala.inline
        def setRole(value: master | slave): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
        
        @scala.inline
        def setSentinelPassword(value: String): Self = StObject.set(x, "sentinelPassword", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSentinelPasswordUndefined: Self = StObject.set(x, "sentinelPassword", js.undefined)
        
        @scala.inline
        def setSentinelRetryStrategy(value: /* times */ Double => Double | Unit | Null): Self = StObject.set(x, "sentinelRetryStrategy", js.Any.fromFunction1(value))
        
        @scala.inline
        def setSentinelRetryStrategyUndefined: Self = StObject.set(x, "sentinelRetryStrategy", js.undefined)
        
        @scala.inline
        def setSentinelTLS(value: SecureContextOptions): Self = StObject.set(x, "sentinelTLS", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSentinelTLSUndefined: Self = StObject.set(x, "sentinelTLS", js.undefined)
        
        @scala.inline
        def setSentinelUsername(value: String): Self = StObject.set(x, "sentinelUsername", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSentinelUsernameUndefined: Self = StObject.set(x, "sentinelUsername", js.undefined)
        
        @scala.inline
        def setSentinels(value: js.Array[Host]): Self = StObject.set(x, "sentinels", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSentinelsUndefined: Self = StObject.set(x, "sentinels", js.undefined)
        
        @scala.inline
        def setSentinelsVarargs(value: Host*): Self = StObject.set(x, "sentinels", js.Array(value :_*))
        
        @scala.inline
        def setShowFriendlyErrorStack(value: Boolean): Self = StObject.set(x, "showFriendlyErrorStack", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setShowFriendlyErrorStackUndefined: Self = StObject.set(x, "showFriendlyErrorStack", js.undefined)
        
        @scala.inline
        def setStore(value: RedisStoreConstructor): Self = StObject.set(x, "store", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTls(value: ConnectionOptions): Self = StObject.set(x, "tls", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTlsUndefined: Self = StObject.set(x, "tls", js.undefined)
        
        @scala.inline
        def setTtl(value: Double | TtlFunction): Self = StObject.set(x, "ttl", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTtlFunction1(value: /* result */ js.Any => Double): Self = StObject.set(x, "ttl", js.Any.fromFunction1(value))
        
        @scala.inline
        def setUpdateSentinels(value: Boolean): Self = StObject.set(x, "updateSentinels", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setUpdateSentinelsUndefined: Self = StObject.set(x, "updateSentinels", js.undefined)
        
        @scala.inline
        def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setUsernameUndefined: Self = StObject.set(x, "username", js.undefined)
      }
    }
    
    @js.native
    trait SingleNodeCache extends Cache {
      
      @JSName("store")
      var store_SingleNodeCache: RedisSingleNodeStore = js.native
    }
  }
  
  type _To = RedisStoreConstructor
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: RedisStoreConstructor = ^
}
