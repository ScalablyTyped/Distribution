package typings.cacheManagerIoredis.mod.CacheManagerIORedis

import typings.cacheManager.mod.TtlFunction
import typings.cacheManagerIoredis.cacheManagerIoredisNumbers.`1`
import typings.cacheManagerIoredis.cacheManagerIoredisNumbers.`2`
import typings.cacheManagerIoredis.cacheManagerIoredisStrings.master
import typings.cacheManagerIoredis.cacheManagerIoredisStrings.slave
import typings.ioredis.anon.Host
import typings.ioredis.anon.Ip
import typings.ioredis.mod.AddressFromResponse
import typings.ioredis.mod.NatMap
import typings.ioredis.mod.PreferredSlaves
import typings.ioredis.mod.SecureContextOptions
import typings.node.tlsMod.ConnectionOptions
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined cache-manager.cache-manager.CachingConfig & ioredis.ioredis.RedisOptions & {  store :cache-manager-ioredis.cache-manager-ioredis.CacheManagerIORedis.RedisStoreConstructor,   max :number | undefined} & cache-manager.cache-manager.CacheOptions */
@js.native
trait RedisStoreSingleNodeConfig extends js.Object {
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
  implicit class RedisStoreSingleNodeConfigOps[Self <: RedisStoreSingleNodeConfig] (val x: Self) extends AnyVal {
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
    def setStore(value: RedisStoreConstructor): Self = this.set("store", value.asInstanceOf[js.Any])
    @scala.inline
    def setTtlFunction1(value: /* result */ js.Any => Double): Self = this.set("ttl", js.Any.fromFunction1(value))
    @scala.inline
    def setTtl(value: Double | TtlFunction): Self = this.set("ttl", value.asInstanceOf[js.Any])
    @scala.inline
    def setAutoResendUnfulfilledCommands(value: Boolean): Self = this.set("autoResendUnfulfilledCommands", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoResendUnfulfilledCommands: Self = this.set("autoResendUnfulfilledCommands", js.undefined)
    @scala.inline
    def setAutoResubscribe(value: Boolean): Self = this.set("autoResubscribe", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoResubscribe: Self = this.set("autoResubscribe", js.undefined)
    @scala.inline
    def setConnectTimeout(value: Double): Self = this.set("connectTimeout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConnectTimeout: Self = this.set("connectTimeout", js.undefined)
    @scala.inline
    def setConnectionName(value: String): Self = this.set("connectionName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConnectionName: Self = this.set("connectionName", js.undefined)
    @scala.inline
    def setDb(value: Double): Self = this.set("db", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDb: Self = this.set("db", js.undefined)
    @scala.inline
    def setDropBufferSupport(value: Boolean): Self = this.set("dropBufferSupport", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDropBufferSupport: Self = this.set("dropBufferSupport", js.undefined)
    @scala.inline
    def setEnableOfflineQueue(value: Boolean): Self = this.set("enableOfflineQueue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnableOfflineQueue: Self = this.set("enableOfflineQueue", js.undefined)
    @scala.inline
    def setEnableReadyCheck(value: Boolean): Self = this.set("enableReadyCheck", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnableReadyCheck: Self = this.set("enableReadyCheck", js.undefined)
    @scala.inline
    def setEnableTLSForSentinelMode(value: Boolean): Self = this.set("enableTLSForSentinelMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnableTLSForSentinelMode: Self = this.set("enableTLSForSentinelMode", js.undefined)
    @scala.inline
    def setFamily(value: Double): Self = this.set("family", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFamily: Self = this.set("family", js.undefined)
    @scala.inline
    def setHost(value: String): Self = this.set("host", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHost: Self = this.set("host", js.undefined)
    @scala.inline
    def setIsCacheableValue(value: /* value */ js.Any => Boolean): Self = this.set("isCacheableValue", js.Any.fromFunction1(value))
    @scala.inline
    def deleteIsCacheableValue: Self = this.set("isCacheableValue", js.undefined)
    @scala.inline
    def setKeepAlive(value: Double): Self = this.set("keepAlive", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKeepAlive: Self = this.set("keepAlive", js.undefined)
    @scala.inline
    def setKeyPrefix(value: String): Self = this.set("keyPrefix", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKeyPrefix: Self = this.set("keyPrefix", js.undefined)
    @scala.inline
    def setLazyConnect(value: Boolean): Self = this.set("lazyConnect", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLazyConnect: Self = this.set("lazyConnect", js.undefined)
    @scala.inline
    def setMax(value: Double): Self = this.set("max", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMax: Self = this.set("max", js.undefined)
    @scala.inline
    def setMaxRetriesPerRequest(value: Double): Self = this.set("maxRetriesPerRequest", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxRetriesPerRequest: Self = this.set("maxRetriesPerRequest", js.undefined)
    @scala.inline
    def setMaxRetriesPerRequestNull: Self = this.set("maxRetriesPerRequest", null)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setNatMap(value: NatMap): Self = this.set("natMap", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNatMap: Self = this.set("natMap", js.undefined)
    @scala.inline
    def setPassword(value: String): Self = this.set("password", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePassword: Self = this.set("password", js.undefined)
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePath: Self = this.set("path", js.undefined)
    @scala.inline
    def setPort(value: Double): Self = this.set("port", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePort: Self = this.set("port", js.undefined)
    @scala.inline
    def setPreferredSlavesVarargs(value: Ip*): Self = this.set("preferredSlaves", js.Array(value :_*))
    @scala.inline
    def setPreferredSlavesFunction1(value: /* slaves */ js.Array[AddressFromResponse] => AddressFromResponse | Null): Self = this.set("preferredSlaves", js.Any.fromFunction1(value))
    @scala.inline
    def setPreferredSlaves(value: PreferredSlaves): Self = this.set("preferredSlaves", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePreferredSlaves: Self = this.set("preferredSlaves", js.undefined)
    @scala.inline
    def setPromiseDependency(value: js.Any): Self = this.set("promiseDependency", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePromiseDependency: Self = this.set("promiseDependency", js.undefined)
    @scala.inline
    def setReadOnly(value: Boolean): Self = this.set("readOnly", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReadOnly: Self = this.set("readOnly", js.undefined)
    @scala.inline
    def setReconnectOnError(value: /* error */ Error => Boolean | `1` | `2`): Self = this.set("reconnectOnError", js.Any.fromFunction1(value))
    @scala.inline
    def deleteReconnectOnError: Self = this.set("reconnectOnError", js.undefined)
    @scala.inline
    def setRetryStrategy(value: /* times */ Double => Double | Unit | Null): Self = this.set("retryStrategy", js.Any.fromFunction1(value))
    @scala.inline
    def deleteRetryStrategy: Self = this.set("retryStrategy", js.undefined)
    @scala.inline
    def setRole(value: master | slave): Self = this.set("role", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRole: Self = this.set("role", js.undefined)
    @scala.inline
    def setSentinelPassword(value: String): Self = this.set("sentinelPassword", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSentinelPassword: Self = this.set("sentinelPassword", js.undefined)
    @scala.inline
    def setSentinelRetryStrategy(value: /* times */ Double => Double | Unit | Null): Self = this.set("sentinelRetryStrategy", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSentinelRetryStrategy: Self = this.set("sentinelRetryStrategy", js.undefined)
    @scala.inline
    def setSentinelTLS(value: SecureContextOptions): Self = this.set("sentinelTLS", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSentinelTLS: Self = this.set("sentinelTLS", js.undefined)
    @scala.inline
    def setSentinelUsername(value: String): Self = this.set("sentinelUsername", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSentinelUsername: Self = this.set("sentinelUsername", js.undefined)
    @scala.inline
    def setSentinelsVarargs(value: Host*): Self = this.set("sentinels", js.Array(value :_*))
    @scala.inline
    def setSentinels(value: js.Array[Host]): Self = this.set("sentinels", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSentinels: Self = this.set("sentinels", js.undefined)
    @scala.inline
    def setShowFriendlyErrorStack(value: Boolean): Self = this.set("showFriendlyErrorStack", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowFriendlyErrorStack: Self = this.set("showFriendlyErrorStack", js.undefined)
    @scala.inline
    def setTls(value: ConnectionOptions): Self = this.set("tls", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTls: Self = this.set("tls", js.undefined)
    @scala.inline
    def setUpdateSentinels(value: Boolean): Self = this.set("updateSentinels", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUpdateSentinels: Self = this.set("updateSentinels", js.undefined)
    @scala.inline
    def setUsername(value: String): Self = this.set("username", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUsername: Self = this.set("username", js.undefined)
  }
  
}

