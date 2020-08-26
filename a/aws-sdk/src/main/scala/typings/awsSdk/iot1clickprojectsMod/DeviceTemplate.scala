package typings.awsSdk.iot1clickprojectsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeviceTemplate extends js.Object {
  /**
    * An optional Lambda function to invoke instead of the default Lambda function provided by the placement template.
    */
  var callbackOverrides: js.UndefOr[DeviceCallbackOverrideMap] = js.native
  /**
    * The device type, which currently must be "button".
    */
  var deviceType: js.UndefOr[DeviceType] = js.native
}

object DeviceTemplate {
  @scala.inline
  def apply(): DeviceTemplate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeviceTemplate]
  }
  @scala.inline
  implicit class DeviceTemplateOps[Self <: DeviceTemplate] (val x: Self) extends AnyVal {
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
    def setCallbackOverrides(value: DeviceCallbackOverrideMap): Self = this.set("callbackOverrides", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCallbackOverrides: Self = this.set("callbackOverrides", js.undefined)
    @scala.inline
    def setDeviceType(value: DeviceType): Self = this.set("deviceType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeviceType: Self = this.set("deviceType", js.undefined)
  }
  
}

