package typings
package bullDashArenaLib.bullDashArenaMod.BullArenaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PortHostConnectionOptions extends ConnectionOptions {
  var db: js.UndefOr[java.lang.String] = js.undefined
  var host: java.lang.String
  var password: js.UndefOr[java.lang.String] = js.undefined
  var port: js.UndefOr[scala.Double] = js.undefined
}

object PortHostConnectionOptions {
  @scala.inline
  def apply(
    host: java.lang.String,
    db: java.lang.String = null,
    password: java.lang.String = null,
    port: scala.Int | scala.Double = null
  ): PortHostConnectionOptions = {
    val __obj = js.Dynamic.literal(host = host)
    if (db != null) __obj.updateDynamic("db")(db)
    if (password != null) __obj.updateDynamic("password")(password)
    if (port != null) __obj.updateDynamic("port")(port.asInstanceOf[js.Any])
    __obj.asInstanceOf[PortHostConnectionOptions]
  }
}

