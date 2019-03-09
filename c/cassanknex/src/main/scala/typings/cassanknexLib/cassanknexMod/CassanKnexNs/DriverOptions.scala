package typings
package cassanknexLib.cassanknexMod.CassanKnexNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DriverOptions extends js.Object {
  var connection: js.UndefOr[
    cassandraDashDriverLib.cassandraDashDriverMod.Client | cassandraDashDriverLib.cassandraDashDriverMod.ClientOptions
  ] = js.undefined
  var debug: js.UndefOr[scala.Boolean] = js.undefined
}

object DriverOptions {
  @scala.inline
  def apply(
    connection: cassandraDashDriverLib.cassandraDashDriverMod.Client | cassandraDashDriverLib.cassandraDashDriverMod.ClientOptions = null,
    debug: js.UndefOr[scala.Boolean] = js.undefined
  ): DriverOptions = {
    val __obj = js.Dynamic.literal()
    if (connection != null) __obj.updateDynamic("connection")(connection.asInstanceOf[js.Any])
    if (!js.isUndefined(debug)) __obj.updateDynamic("debug")(debug)
    __obj.asInstanceOf[DriverOptions]
  }
}

