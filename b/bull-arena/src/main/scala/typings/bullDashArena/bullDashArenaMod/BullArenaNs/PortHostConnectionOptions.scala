package typings.bullDashArena.bullDashArenaMod.BullArenaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PortHostConnectionOptions extends ConnectionOptions {
  var db: js.UndefOr[String] = js.undefined
  var host: String
  var password: js.UndefOr[String] = js.undefined
  var port: js.UndefOr[Double] = js.undefined
}

object PortHostConnectionOptions {
  @scala.inline
  def apply(host: String, db: String = null, password: String = null, port: Int | Double = null): PortHostConnectionOptions = {
    val __obj = js.Dynamic.literal(host = host)
    if (db != null) __obj.updateDynamic("db")(db)
    if (password != null) __obj.updateDynamic("password")(password)
    if (port != null) __obj.updateDynamic("port")(port.asInstanceOf[js.Any])
    __obj.asInstanceOf[PortHostConnectionOptions]
  }
}

