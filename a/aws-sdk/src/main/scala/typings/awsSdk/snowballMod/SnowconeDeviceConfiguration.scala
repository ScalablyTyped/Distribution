package typings.awsSdk.snowballMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SnowconeDeviceConfiguration extends js.Object {
  /**
    * Configures the wireless connection for the AWS Snowcone device.
    */
  var WirelessConnection: js.UndefOr[typings.awsSdk.snowballMod.WirelessConnection] = js.native
}

object SnowconeDeviceConfiguration {
  @scala.inline
  def apply(WirelessConnection: WirelessConnection = null): SnowconeDeviceConfiguration = {
    val __obj = js.Dynamic.literal()
    if (WirelessConnection != null) __obj.updateDynamic("WirelessConnection")(WirelessConnection.asInstanceOf[js.Any])
    __obj.asInstanceOf[SnowconeDeviceConfiguration]
  }
}

