package typings.bullArena.mod.BullArena

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
  def apply(host: String, db: String = null, password: String = null, port: js.UndefOr[Double] = js.undefined): PortHostConnectionOptions = {
    val __obj = js.Dynamic.literal(host = host.asInstanceOf[js.Any])
    if (db != null) __obj.updateDynamic("db")(db.asInstanceOf[js.Any])
    if (password != null) __obj.updateDynamic("password")(password.asInstanceOf[js.Any])
    if (!js.isUndefined(port)) __obj.updateDynamic("port")(port.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[PortHostConnectionOptions]
  }
}

