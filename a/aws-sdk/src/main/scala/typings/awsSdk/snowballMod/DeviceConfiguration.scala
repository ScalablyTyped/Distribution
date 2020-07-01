package typings.awsSdk.snowballMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeviceConfiguration extends js.Object {
  /**
    * Returns information about the device configuration for an AWS Snowcone job.
    */
  var SnowconeDeviceConfiguration: js.UndefOr[typings.awsSdk.snowballMod.SnowconeDeviceConfiguration] = js.native
}

object DeviceConfiguration {
  @scala.inline
  def apply(SnowconeDeviceConfiguration: SnowconeDeviceConfiguration = null): DeviceConfiguration = {
    val __obj = js.Dynamic.literal()
    if (SnowconeDeviceConfiguration != null) __obj.updateDynamic("SnowconeDeviceConfiguration")(SnowconeDeviceConfiguration.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeviceConfiguration]
  }
}

