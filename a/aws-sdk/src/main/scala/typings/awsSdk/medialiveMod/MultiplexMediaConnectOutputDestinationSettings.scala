package typings.awsSdk.medialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MultiplexMediaConnectOutputDestinationSettings extends js.Object {
  /**
    * The MediaConnect entitlement ARN available as a Flow source.
    */
  var EntitlementArn: js.UndefOr[stringMin1] = js.native
}

object MultiplexMediaConnectOutputDestinationSettings {
  @scala.inline
  def apply(): MultiplexMediaConnectOutputDestinationSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MultiplexMediaConnectOutputDestinationSettings]
  }
  @scala.inline
  implicit class MultiplexMediaConnectOutputDestinationSettingsOps[Self <: MultiplexMediaConnectOutputDestinationSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setEntitlementArn(value: stringMin1): Self = this.set("EntitlementArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEntitlementArn: Self = this.set("EntitlementArn", js.undefined)
  }
  
}

