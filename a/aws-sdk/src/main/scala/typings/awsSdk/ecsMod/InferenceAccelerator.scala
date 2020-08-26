package typings.awsSdk.ecsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InferenceAccelerator extends js.Object {
  /**
    * The Elastic Inference accelerator device name. The deviceName must also be referenced in a container definition as a ResourceRequirement.
    */
  var deviceName: String = js.native
  /**
    * The Elastic Inference accelerator type to use.
    */
  var deviceType: String = js.native
}

object InferenceAccelerator {
  @scala.inline
  def apply(deviceName: String, deviceType: String): InferenceAccelerator = {
    val __obj = js.Dynamic.literal(deviceName = deviceName.asInstanceOf[js.Any], deviceType = deviceType.asInstanceOf[js.Any])
    __obj.asInstanceOf[InferenceAccelerator]
  }
  @scala.inline
  implicit class InferenceAcceleratorOps[Self <: InferenceAccelerator] (val x: Self) extends AnyVal {
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
    def setDeviceType(value: String): Self = this.set("deviceType", value.asInstanceOf[js.Any])
  }
  
}

