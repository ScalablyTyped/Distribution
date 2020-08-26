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
  def apply(): SnowconeDeviceConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SnowconeDeviceConfiguration]
  }
  @scala.inline
  implicit class SnowconeDeviceConfigurationOps[Self <: SnowconeDeviceConfiguration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setWirelessConnection(value: WirelessConnection): Self = this.set("WirelessConnection", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWirelessConnection: Self = this.set("WirelessConnection", js.undefined)
  }
  
}

