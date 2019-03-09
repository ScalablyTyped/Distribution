package typings
package connectDashRedisLib.connectDashRedisMod.sNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RedisStoreOptions extends js.Object {
  var client: js.UndefOr[redisLib.redisMod.RedisClient] = js.undefined
  var db: js.UndefOr[scala.Double] = js.undefined
  var disableTTL: js.UndefOr[scala.Boolean] = js.undefined
  var host: js.UndefOr[java.lang.String] = js.undefined
  var logErrors: js.UndefOr[scala.Boolean | (js.Function1[/* error */ java.lang.String, scala.Unit])] = js.undefined
  var pass: js.UndefOr[java.lang.String] = js.undefined
  var port: js.UndefOr[scala.Double] = js.undefined
  var prefix: js.UndefOr[java.lang.String] = js.undefined
  var scanCount: js.UndefOr[scala.Double] = js.undefined
  var serializer: js.UndefOr[Serializer | stdLib.JSON] = js.undefined
  var socket: js.UndefOr[java.lang.String] = js.undefined
  var ttl: js.UndefOr[
    scala.Double | java.lang.String | (js.Function3[
      /* store */ RedisStore, 
      /* sess */ expressDashSessionLib.expressDashSessionMod.Global.ExpressNs.SessionData, 
      /* sid */ java.lang.String, 
      scala.Double
    ])
  ] = js.undefined
  var unref: js.UndefOr[scala.Boolean] = js.undefined
  var url: js.UndefOr[java.lang.String] = js.undefined
}

object RedisStoreOptions {
  @scala.inline
  def apply(
    client: redisLib.redisMod.RedisClient = null,
    db: scala.Int | scala.Double = null,
    disableTTL: js.UndefOr[scala.Boolean] = js.undefined,
    host: java.lang.String = null,
    logErrors: scala.Boolean | (js.Function1[/* error */ java.lang.String, scala.Unit]) = null,
    pass: java.lang.String = null,
    port: scala.Int | scala.Double = null,
    prefix: java.lang.String = null,
    scanCount: scala.Int | scala.Double = null,
    serializer: Serializer | stdLib.JSON = null,
    socket: java.lang.String = null,
    ttl: scala.Double | java.lang.String | (js.Function3[
      /* store */ RedisStore, 
      /* sess */ expressDashSessionLib.expressDashSessionMod.Global.ExpressNs.SessionData, 
      /* sid */ java.lang.String, 
      scala.Double
    ]) = null,
    unref: js.UndefOr[scala.Boolean] = js.undefined,
    url: java.lang.String = null
  ): RedisStoreOptions = {
    val __obj = js.Dynamic.literal()
    if (client != null) __obj.updateDynamic("client")(client)
    if (db != null) __obj.updateDynamic("db")(db.asInstanceOf[js.Any])
    if (!js.isUndefined(disableTTL)) __obj.updateDynamic("disableTTL")(disableTTL)
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

