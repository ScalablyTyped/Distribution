package typings.connectRedis.mod

import typings.expressSession.mod.global.Express.SessionData
import typings.ioredis.mod.Redis
import typings.redis.mod.RedisClient
import typings.std.JSON
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RedisStoreOptions extends js.Object {
  var client: js.UndefOr[RedisClient | Redis] = js.undefined
  var db: js.UndefOr[Double] = js.undefined
  var disableTTL: js.UndefOr[Boolean] = js.undefined
  var disableTouch: js.UndefOr[Boolean] = js.undefined
  var host: js.UndefOr[String] = js.undefined
  var logErrors: js.UndefOr[Boolean | (js.Function1[/* error */ String, Unit])] = js.undefined
  var pass: js.UndefOr[String] = js.undefined
  var port: js.UndefOr[Double] = js.undefined
  var prefix: js.UndefOr[String] = js.undefined
  var scanCount: js.UndefOr[Double] = js.undefined
  var serializer: js.UndefOr[Serializer | JSON] = js.undefined
  var socket: js.UndefOr[String] = js.undefined
  var ttl: js.UndefOr[
    Double | String | (js.Function3[/* store */ RedisStore, /* sess */ SessionData, /* sid */ String, Double])
  ] = js.undefined
  var unref: js.UndefOr[Boolean] = js.undefined
  var url: js.UndefOr[String] = js.undefined
}

object RedisStoreOptions {
  @scala.inline
  def apply(
    client: RedisClient | Redis = null,
    db: js.UndefOr[Double] = js.undefined,
    disableTTL: js.UndefOr[Boolean] = js.undefined,
    disableTouch: js.UndefOr[Boolean] = js.undefined,
    host: String = null,
    logErrors: Boolean | (js.Function1[/* error */ String, Unit]) = null,
    pass: String = null,
    port: js.UndefOr[Double] = js.undefined,
    prefix: String = null,
    scanCount: js.UndefOr[Double] = js.undefined,
    serializer: Serializer | JSON = null,
    socket: String = null,
    ttl: Double | String | (js.Function3[/* store */ RedisStore, /* sess */ SessionData, /* sid */ String, Double]) = null,
    unref: js.UndefOr[Boolean] = js.undefined,
    url: String = null
  ): RedisStoreOptions = {
    val __obj = js.Dynamic.literal()
    if (client != null) __obj.updateDynamic("client")(client.asInstanceOf[js.Any])
    if (!js.isUndefined(db)) __obj.updateDynamic("db")(db.get.asInstanceOf[js.Any])
    if (!js.isUndefined(disableTTL)) __obj.updateDynamic("disableTTL")(disableTTL.get.asInstanceOf[js.Any])
    if (!js.isUndefined(disableTouch)) __obj.updateDynamic("disableTouch")(disableTouch.get.asInstanceOf[js.Any])
    if (host != null) __obj.updateDynamic("host")(host.asInstanceOf[js.Any])
    if (logErrors != null) __obj.updateDynamic("logErrors")(logErrors.asInstanceOf[js.Any])
    if (pass != null) __obj.updateDynamic("pass")(pass.asInstanceOf[js.Any])
    if (!js.isUndefined(port)) __obj.updateDynamic("port")(port.get.asInstanceOf[js.Any])
    if (prefix != null) __obj.updateDynamic("prefix")(prefix.asInstanceOf[js.Any])
    if (!js.isUndefined(scanCount)) __obj.updateDynamic("scanCount")(scanCount.get.asInstanceOf[js.Any])
    if (serializer != null) __obj.updateDynamic("serializer")(serializer.asInstanceOf[js.Any])
    if (socket != null) __obj.updateDynamic("socket")(socket.asInstanceOf[js.Any])
    if (ttl != null) __obj.updateDynamic("ttl")(ttl.asInstanceOf[js.Any])
    if (!js.isUndefined(unref)) __obj.updateDynamic("unref")(unref.get.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    __obj.asInstanceOf[RedisStoreOptions]
  }
}

