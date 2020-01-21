package typings.chromeApps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonLowenergy extends js.Object {
  var low_energy: js.UndefOr[Boolean] = js.undefined
  var peripheral: js.UndefOr[Boolean] = js.undefined
  var socket: js.UndefOr[Boolean] = js.undefined
  var uuids: js.UndefOr[js.Array[String]] = js.undefined
}

object AnonLowenergy {
  @scala.inline
  def apply(
    low_energy: js.UndefOr[Boolean] = js.undefined,
    peripheral: js.UndefOr[Boolean] = js.undefined,
    socket: js.UndefOr[Boolean] = js.undefined,
    uuids: js.Array[String] = null
  ): AnonLowenergy = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(low_energy)) __obj.updateDynamic("low_energy")(low_energy.asInstanceOf[js.Any])
    if (!js.isUndefined(peripheral)) __obj.updateDynamic("peripheral")(peripheral.asInstanceOf[js.Any])
    if (!js.isUndefined(socket)) __obj.updateDynamic("socket")(socket.asInstanceOf[js.Any])
    if (uuids != null) __obj.updateDynamic("uuids")(uuids.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonLowenergy]
  }
}

