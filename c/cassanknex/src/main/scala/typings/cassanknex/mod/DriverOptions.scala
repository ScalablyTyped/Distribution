package typings.cassanknex.mod

import typings.cassandraDriver.mod.Client
import typings.cassandraDriver.mod.ClientOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DriverOptions extends js.Object {
  var connection: js.UndefOr[Client | ClientOptions] = js.undefined
  var debug: js.UndefOr[Boolean] = js.undefined
}

object DriverOptions {
  @scala.inline
  def apply(connection: Client | ClientOptions = null, debug: js.UndefOr[Boolean] = js.undefined): DriverOptions = {
    val __obj = js.Dynamic.literal()
    if (connection != null) __obj.updateDynamic("connection")(connection.asInstanceOf[js.Any])
    if (!js.isUndefined(debug)) __obj.updateDynamic("debug")(debug.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[DriverOptions]
  }
}

