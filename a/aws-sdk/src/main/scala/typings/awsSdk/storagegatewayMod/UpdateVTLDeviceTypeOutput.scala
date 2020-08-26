package typings.awsSdk.storagegatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateVTLDeviceTypeOutput extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the medium changer you have selected.
    */
  var VTLDeviceARN: js.UndefOr[typings.awsSdk.storagegatewayMod.VTLDeviceARN] = js.native
}

object UpdateVTLDeviceTypeOutput {
  @scala.inline
  def apply(): UpdateVTLDeviceTypeOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateVTLDeviceTypeOutput]
  }
  @scala.inline
  implicit class UpdateVTLDeviceTypeOutputOps[Self <: UpdateVTLDeviceTypeOutput] (val x: Self) extends AnyVal {
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
    def setVTLDeviceARN(value: VTLDeviceARN): Self = this.set("VTLDeviceARN", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVTLDeviceARN: Self = this.set("VTLDeviceARN", js.undefined)
  }
  
}

