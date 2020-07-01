package typings.awsSdk.snowballMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WirelessConnection extends js.Object {
  /**
    * Enables the Wi-Fi adapter on an AWS Snowcone device.
    */
  var IsWifiEnabled: js.UndefOr[Boolean] = js.native
}

object WirelessConnection {
  @scala.inline
  def apply(IsWifiEnabled: js.UndefOr[Boolean] = js.undefined): WirelessConnection = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(IsWifiEnabled)) __obj.updateDynamic("IsWifiEnabled")(IsWifiEnabled.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[WirelessConnection]
  }
}

