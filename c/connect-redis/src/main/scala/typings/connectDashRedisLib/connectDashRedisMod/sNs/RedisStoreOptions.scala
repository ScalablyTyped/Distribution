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
  var ttl: js.UndefOr[scala.Double] = js.undefined
  var unref: js.UndefOr[scala.Boolean] = js.undefined
  var url: js.UndefOr[java.lang.String] = js.undefined
}

