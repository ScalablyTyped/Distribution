package typings.cacheManagerIoredis.mod.CacheManagerIORedis

import typings.cacheManager.mod.TtlFunction
import typings.cacheManagerIoredis.cacheManagerIoredisNumbers.`1`
import typings.cacheManagerIoredis.cacheManagerIoredisNumbers.`2`
import typings.cacheManagerIoredis.cacheManagerIoredisStrings.master
import typings.cacheManagerIoredis.cacheManagerIoredisStrings.slave
import typings.ioredis.anon.Host
import typings.ioredis.mod.NatMap
import typings.ioredis.mod.PreferredSlaves
import typings.ioredis.mod.SecureContextOptions
import typings.node.tlsMod.ConnectionOptions
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined cache-manager.cache-manager.CachingConfig & ioredis.ioredis.RedisOptions & {  store  :cache-manager-ioredis.cache-manager-ioredis.CacheManagerIORedis.RedisStoreConstructor,   max ? :number} & cache-manager.cache-manager.CacheOptions */
trait RedisStoreSingleNodeConfig extends js.Object {
  /**
    * If true, client will resend unfulfilled commands(e.g. block commands) in the previous connection when reconnected.
    * default: true.
    */
  var autoResendUnfulfilledCommands: js.UndefOr[Boolean] = js.undefined
  /**
    * After reconnected, if the previous connection was in the subscriber mode, client will auto re-subscribe these channels.
    * default: true.
    */
  var autoResubscribe: js.UndefOr[Boolean] = js.undefined
  /**
    * The milliseconds before a timeout occurs during the initial connection to the Redis server.
    * default: 10000.
    */
  var connectTimeout: js.UndefOr[Double] = js.undefined
  var connectionName: js.UndefOr[String] = js.undefined
  /**
    * Database index to use.
    */
  var db: js.UndefOr[Double] = js.undefined
  /**
    * If you are using the hiredis parser, it's highly recommended to enable this option.
    * Create another instance with dropBufferSupport disabled for other commands that you want to return binary instead of string
    */
  var dropBufferSupport: js.UndefOr[Boolean] = js.undefined
  /**
    * By default, if there is no active connection to the Redis server, commands are added to a queue
    * and are executed once the connection is "ready" (when enableReadyCheck is true, "ready" means
    * the Redis server has loaded the database from disk, otherwise means the connection to the Redis
    * server has been established). If this option is false, when execute the command when the connection
    * isn't ready, an error will be returned.
    */
  var enableOfflineQueue: js.UndefOr[Boolean] = js.undefined
  /**
    * When a connection is established to the Redis server, the server might still be loading
    * the database from disk. While loading, the server not respond to any commands.
    * To work around this, when this option is true, ioredis will check the status of the Redis server,
    * and when the Redis server is able to process commands, a ready event will be emitted.
    */
  var enableReadyCheck: js.UndefOr[Boolean] = js.undefined
  /**
    * Whether to support the `tls` option when connecting to Redis via sentinel mode.
    * default: false.
    */
  var enableTLSForSentinelMode: js.UndefOr[Boolean] = js.undefined
  /**
    * 4 (IPv4) or 6 (IPv6), Defaults to 4.
    */
  var family: js.UndefOr[Double] = js.undefined
  var host: js.UndefOr[String] = js.undefined
  var isCacheableValue: js.UndefOr[js.Function1[/* value */ js.Any, Boolean]] = js.undefined
  /**
    * TCP KeepAlive on the socket with a X ms delay before start. Set to a non-number value to disable keepAlive.
    */
  var keepAlive: js.UndefOr[Double] = js.undefined
  var keyPrefix: js.UndefOr[String] = js.undefined
  var lazyConnect: js.UndefOr[Boolean] = js.undefined
  var max: js.UndefOr[Double] = js.undefined
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
  var maxRetriesPerRequest: js.UndefOr[Double | Null] = js.undefined
  /**
    * default: null.
    */
  var name: js.UndefOr[String] = js.undefined
  /**
    * NAT map for sentinel connector.
    * default: null.
    */
  var natMap: js.UndefOr[NatMap] = js.undefined
  /**
    * If set, client will send AUTH command with the value of this option when connected.
    */
  var password: js.UndefOr[String] = js.undefined
  /**
    * Local domain socket path. If set the port, host and family will be ignored.
    */
  var path: js.UndefOr[String] = js.undefined
  var port: js.UndefOr[Double] = js.undefined
  /**
    * Can be used to prefer a particular slave or set of slaves based on priority.
    */
  var preferredSlaves: js.UndefOr[PreferredSlaves] = js.undefined
  /**
    * Promise library to replace global.Promise
    */
  var promiseDependency: js.UndefOr[js.Any] = js.undefined
  /**
    * Enable READONLY mode for the connection. Only available for cluster mode.
    * default: false.
    */
  var readOnly: js.UndefOr[Boolean] = js.undefined
  /**
    * 1/true means reconnect, 2 means reconnect and resend failed command. Returning false will ignore
    * the error and do nothing.
    */
  var reconnectOnError: js.UndefOr[js.Function1[/* error */ Error, Boolean | `1` | `2`]] = js.undefined
  /**
    * When the return value isn't a number, ioredis will stop trying to reconnect.
    * Fixed in: https://github.com/DefinitelyTyped/DefinitelyTyped/pull/15858
    */
  var retryStrategy: js.UndefOr[js.Function1[/* times */ Double, Double | Unit | Null]] = js.undefined
  /**
    * default: "master".
    */
  var role: js.UndefOr[master | slave] = js.undefined
  var sentinelPassword: js.UndefOr[String] = js.undefined
  /**
    * If `sentinelRetryStrategy` returns a valid delay time, ioredis will try to reconnect from scratch.
    * default: function(times) { return Math.min(times * 10, 1000); }
    */
  var sentinelRetryStrategy: js.UndefOr[js.Function1[/* times */ Double, Double | Unit | Null]] = js.undefined
  var sentinelTLS: js.UndefOr[SecureContextOptions] = js.undefined
  var sentinelUsername: js.UndefOr[String] = js.undefined
  var sentinels: js.UndefOr[js.Array[Host]] = js.undefined
  /**
    * Whether to show a friendly error stack. Will decrease the performance significantly.
    */
  var showFriendlyErrorStack: js.UndefOr[Boolean] = js.undefined
  var store: RedisStoreConstructor
  var tls: js.UndefOr[ConnectionOptions] = js.undefined
  var ttl: Double | TtlFunction
  /**
    * Update the given `sentinels` list with new IP addresses when communicating with existing sentinels.
    * default: true.
    */
  var updateSentinels: js.UndefOr[Boolean] = js.undefined
  /**
    * If set, client will send AUTH command with the value of this option as the first argument when connected. The `password` option must be set too. Username should only be set for Redis >=6.
    */
  var username: js.UndefOr[String] = js.undefined
}

object RedisStoreSingleNodeConfig {
  @scala.inline
  def apply(
    store: RedisStoreConstructor,
    ttl: Double | TtlFunction,
    autoResendUnfulfilledCommands: js.UndefOr[Boolean] = js.undefined,
    autoResubscribe: js.UndefOr[Boolean] = js.undefined,
    connectTimeout: js.UndefOr[Double] = js.undefined,
    connectionName: String = null,
    db: js.UndefOr[Double] = js.undefined,
    dropBufferSupport: js.UndefOr[Boolean] = js.undefined,
    enableOfflineQueue: js.UndefOr[Boolean] = js.undefined,
    enableReadyCheck: js.UndefOr[Boolean] = js.undefined,
    enableTLSForSentinelMode: js.UndefOr[Boolean] = js.undefined,
    family: js.UndefOr[Double] = js.undefined,
    host: String = null,
    isCacheableValue: /* value */ js.Any => Boolean = null,
    keepAlive: js.UndefOr[Double] = js.undefined,
    keyPrefix: String = null,
    lazyConnect: js.UndefOr[Boolean] = js.undefined,
    max: js.UndefOr[Double] = js.undefined,
    maxRetriesPerRequest: js.UndefOr[Null | Double] = js.undefined,
    name: String = null,
    natMap: NatMap = null,
    password: String = null,
    path: String = null,
    port: js.UndefOr[Double] = js.undefined,
    preferredSlaves: PreferredSlaves = null,
    promiseDependency: js.Any = null,
    readOnly: js.UndefOr[Boolean] = js.undefined,
    reconnectOnError: /* error */ Error => Boolean | `1` | `2` = null,
    retryStrategy: /* times */ Double => Double | Unit | Null = null,
    role: master | slave = null,
    sentinelPassword: String = null,
    sentinelRetryStrategy: /* times */ Double => Double | Unit | Null = null,
    sentinelTLS: SecureContextOptions = null,
    sentinelUsername: String = null,
    sentinels: js.Array[Host] = null,
    showFriendlyErrorStack: js.UndefOr[Boolean] = js.undefined,
    tls: ConnectionOptions = null,
    updateSentinels: js.UndefOr[Boolean] = js.undefined,
    username: String = null
  ): RedisStoreSingleNodeConfig = {
    val __obj = js.Dynamic.literal(store = store.asInstanceOf[js.Any], ttl = ttl.asInstanceOf[js.Any])
    if (!js.isUndefined(autoResendUnfulfilledCommands)) __obj.updateDynamic("autoResendUnfulfilledCommands")(autoResendUnfulfilledCommands.get.asInstanceOf[js.Any])
    if (!js.isUndefined(autoResubscribe)) __obj.updateDynamic("autoResubscribe")(autoResubscribe.get.asInstanceOf[js.Any])
    if (!js.isUndefined(connectTimeout)) __obj.updateDynamic("connectTimeout")(connectTimeout.get.asInstanceOf[js.Any])
    if (connectionName != null) __obj.updateDynamic("connectionName")(connectionName.asInstanceOf[js.Any])
    if (!js.isUndefined(db)) __obj.updateDynamic("db")(db.get.asInstanceOf[js.Any])
    if (!js.isUndefined(dropBufferSupport)) __obj.updateDynamic("dropBufferSupport")(dropBufferSupport.get.asInstanceOf[js.Any])
    if (!js.isUndefined(enableOfflineQueue)) __obj.updateDynamic("enableOfflineQueue")(enableOfflineQueue.get.asInstanceOf[js.Any])
    if (!js.isUndefined(enableReadyCheck)) __obj.updateDynamic("enableReadyCheck")(enableReadyCheck.get.asInstanceOf[js.Any])
    if (!js.isUndefined(enableTLSForSentinelMode)) __obj.updateDynamic("enableTLSForSentinelMode")(enableTLSForSentinelMode.get.asInstanceOf[js.Any])
    if (!js.isUndefined(family)) __obj.updateDynamic("family")(family.get.asInstanceOf[js.Any])
    if (host != null) __obj.updateDynamic("host")(host.asInstanceOf[js.Any])
    if (isCacheableValue != null) __obj.updateDynamic("isCacheableValue")(js.Any.fromFunction1(isCacheableValue))
    if (!js.isUndefined(keepAlive)) __obj.updateDynamic("keepAlive")(keepAlive.get.asInstanceOf[js.Any])
    if (keyPrefix != null) __obj.updateDynamic("keyPrefix")(keyPrefix.asInstanceOf[js.Any])
    if (!js.isUndefined(lazyConnect)) __obj.updateDynamic("lazyConnect")(lazyConnect.get.asInstanceOf[js.Any])
    if (!js.isUndefined(max)) __obj.updateDynamic("max")(max.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxRetriesPerRequest)) __obj.updateDynamic("maxRetriesPerRequest")(maxRetriesPerRequest.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (natMap != null) __obj.updateDynamic("natMap")(natMap.asInstanceOf[js.Any])
    if (password != null) __obj.updateDynamic("password")(password.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    if (!js.isUndefined(port)) __obj.updateDynamic("port")(port.get.asInstanceOf[js.Any])
    if (preferredSlaves != null) __obj.updateDynamic("preferredSlaves")(preferredSlaves.asInstanceOf[js.Any])
    if (promiseDependency != null) __obj.updateDynamic("promiseDependency")(promiseDependency.asInstanceOf[js.Any])
    if (!js.isUndefined(readOnly)) __obj.updateDynamic("readOnly")(readOnly.get.asInstanceOf[js.Any])
    if (reconnectOnError != null) __obj.updateDynamic("reconnectOnError")(js.Any.fromFunction1(reconnectOnError))
    if (retryStrategy != null) __obj.updateDynamic("retryStrategy")(js.Any.fromFunction1(retryStrategy))
    if (role != null) __obj.updateDynamic("role")(role.asInstanceOf[js.Any])
    if (sentinelPassword != null) __obj.updateDynamic("sentinelPassword")(sentinelPassword.asInstanceOf[js.Any])
    if (sentinelRetryStrategy != null) __obj.updateDynamic("sentinelRetryStrategy")(js.Any.fromFunction1(sentinelRetryStrategy))
    if (sentinelTLS != null) __obj.updateDynamic("sentinelTLS")(sentinelTLS.asInstanceOf[js.Any])
    if (sentinelUsername != null) __obj.updateDynamic("sentinelUsername")(sentinelUsername.asInstanceOf[js.Any])
    if (sentinels != null) __obj.updateDynamic("sentinels")(sentinels.asInstanceOf[js.Any])
    if (!js.isUndefined(showFriendlyErrorStack)) __obj.updateDynamic("showFriendlyErrorStack")(showFriendlyErrorStack.get.asInstanceOf[js.Any])
    if (tls != null) __obj.updateDynamic("tls")(tls.asInstanceOf[js.Any])
    if (!js.isUndefined(updateSentinels)) __obj.updateDynamic("updateSentinels")(updateSentinels.get.asInstanceOf[js.Any])
    if (username != null) __obj.updateDynamic("username")(username.asInstanceOf[js.Any])
    __obj.asInstanceOf[RedisStoreSingleNodeConfig]
  }
}

