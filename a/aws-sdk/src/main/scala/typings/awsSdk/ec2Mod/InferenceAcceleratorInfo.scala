package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InferenceAcceleratorInfo extends js.Object {
  /**
    * Describes the Inference accelerators for the instance type.
    */
  var Accelerators: js.UndefOr[InferenceDeviceInfoList] = js.native
}

object InferenceAcceleratorInfo {
  @scala.inline
  def apply(): InferenceAcceleratorInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InferenceAcceleratorInfo]
  }
  @scala.inline
  implicit class InferenceAcceleratorInfoOps[Self <: InferenceAcceleratorInfo] (val x: Self) extends AnyVal {
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
    def setAcceleratorsVarargs(value: InferenceDeviceInfo*): Self = this.set("Accelerators", js.Array(value :_*))
    @scala.inline
    def setAccelerators(value: InferenceDeviceInfoList): Self = this.set("Accelerators", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccelerators: Self = this.set("Accelerators", js.undefined)
  }
  
}

