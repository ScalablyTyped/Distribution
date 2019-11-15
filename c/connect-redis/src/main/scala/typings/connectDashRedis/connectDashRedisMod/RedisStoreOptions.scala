package typings.connectDashRedis.connectDashRedisMod

import typings.expressDashSession.expressDashSessionMod._Global_.Express.SessionData
import typings.ioredis.ioredisMod.Redis
import typings.redis.redisMod.RedisClient
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
    db: Int | Double = null,
    disableTTL: js.UndefOr[Boolean] = js.undefined,
    disableTouch: js.UndefOr[Boolean] = js.undefined,
    host: String = null,
    logErrors: Boolean | (js.Function1[/* error */ String, Unit]) = null,
    pass: String = null,
    port: Int | Double = null,
    prefix: String = null,
    scanCount: Int | Double = null,
    serializer: Serializer | JSON = null,
    socket: String = null,
    ttl: Double | String | (js.Function3[/* store */ RedisStore, /* sess */ SessionData, /* sid */ String, Double]) = null,
    unref: js.UndefOr[Boolean] = js.undefined,
    url: String = null
  ): RedisStoreOptions = {
    val __obj = js.Dynamic.literal()
    if (client != null) __obj.updateDynamic("client")(client.asInstanceOf[js.Any])
    if (db != null) __obj.updateDynamic("db")(db.asInstanceOf[js.Any])
    if (!js.isUndefined(disableTTL)) __obj.updateDynamic("disableTTL")(disableTTL)
    if (!js.isUndefined(disableTouch)) __obj.updateDynamic("disableTouch")(disableTouch)
    if (host != null) __obj.updateDynamic("host")(host)
    if (logErrors != null) __obj.updateDynamic("logErrors")(logErrors.asInstanceOf[js.Any])
    if (pass != null) __obj.updateDynamic("pass")(pass)
    if (port != null) __obj.updateDynamic("port")(port.asInstanceOf[js.Any])
    if (prefix != null) __obj.updateDynamic("prefix")(prefix)
    if (scanCount != null) __obj.updateDynamic("scanCount")(scanCount.asInstanceOf[js.Any])
    if (serializer != null) __obj.updateDynamic("serializer")(serializer.asInstanceOf[js.Any])
    if (socket != null) __obj.updateDynamic("socket")(socket)
    if (ttl != null) __obj.updateDynamic("ttl")(ttl.asInstanceOf[js.Any])
    if (!js.isUndefined(unref)) __obj.updateDynamic("unref")(unref)
    if (url != null) __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[RedisStoreOptions]
  }
}

