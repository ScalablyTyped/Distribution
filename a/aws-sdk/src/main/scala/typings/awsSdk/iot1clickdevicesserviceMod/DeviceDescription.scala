package typings.awsSdk.iot1clickdevicesserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeviceDescription extends js.Object {
  /**
    * The ARN of the device.
    */
  var Arn: js.UndefOr[string] = js.native
  /**
    * An array of zero or more elements of DeviceAttribute objects providing
    user specified device attributes.
    */
  var Attributes: js.UndefOr[DeviceAttributes] = js.native
  /**
    * The unique identifier of the device.
    */
  var DeviceId: js.UndefOr[string] = js.native
  /**
    * A Boolean value indicating whether or not the device is enabled.
    */
  var Enabled: js.UndefOr[boolean] = js.native
  /**
    * A value between 0 and 1 inclusive, representing the fraction of life remaining for the
    device.
    */
  var RemainingLife: js.UndefOr[doubleMin0Max100] = js.native
  /**
    * The tags currently associated with the AWS IoT 1-Click device.
    */
  var Tags: js.UndefOr[mapOfString] = js.native
  /**
    * The type of the device, such as "button".
    */
  var Type: js.UndefOr[string] = js.native
}

object DeviceDescription {
  @scala.inline
  def apply(): DeviceDescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeviceDescription]
  }
  @scala.inline
  implicit class DeviceDescriptionOps[Self <: DeviceDescription] (val x: Self) extends AnyVal {
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
    def setArn(value: string): Self = this.set("Arn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArn: Self = this.set("Arn", js.undefined)
    @scala.inline
    def setAttributes(value: DeviceAttributes): Self = this.set("Attributes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAttributes: Self = this.set("Attributes", js.undefined)
    @scala.inline
    def setDeviceId(value: string): Self = this.set("DeviceId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeviceId: Self = this.set("DeviceId", js.undefined)
    @scala.inline
    def setEnabled(value: boolean): Self = this.set("Enabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnabled: Self = this.set("Enabled", js.undefined)
    @scala.inline
    def setRemainingLife(value: doubleMin0Max100): Self = this.set("RemainingLife", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRemainingLife: Self = this.set("RemainingLife", js.undefined)
    @scala.inline
    def setTags(value: mapOfString): Self = this.set("Tags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTags: Self = this.set("Tags", js.undefined)
    @scala.inline
    def setType(value: string): Self = this.set("Type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("Type", js.undefined)
  }
  
}

