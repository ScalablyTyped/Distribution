package typings.awsSdk.ecsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InferenceAcceleratorOverride extends js.Object {
  /**
    * The Elastic Inference accelerator device name to override for the task. This parameter must match a deviceName specified in the task definition.
    */
  var deviceName: js.UndefOr[String] = js.native
  /**
    * The Elastic Inference accelerator type to use.
    */
  var deviceType: js.UndefOr[String] = js.native
}

object InferenceAcceleratorOverride {
  @scala.inline
  def apply(): InferenceAcceleratorOverride = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InferenceAcceleratorOverride]
  }
  @scala.inline
  implicit class InferenceAcceleratorOverrideOps[Self <: InferenceAcceleratorOverride] (val x: Self) extends AnyVal {
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
    def setDeviceName(value: String): Self = this.set("deviceName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeviceName: Self = this.set("deviceName", js.undefined)
    @scala.inline
    def setDeviceType(value: String): Self = this.set("deviceType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeviceType: Self = this.set("deviceType", js.undefined)
  }
  
}

