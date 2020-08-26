package typings.awsSdk.globalacceleratorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateAcceleratorResponse extends js.Object {
  /**
    * The accelerator that is created by specifying a listener and the supported IP address types.
    */
  var Accelerator: js.UndefOr[typings.awsSdk.globalacceleratorMod.Accelerator] = js.native
}

object CreateAcceleratorResponse {
  @scala.inline
  def apply(): CreateAcceleratorResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateAcceleratorResponse]
  }
  @scala.inline
  implicit class CreateAcceleratorResponseOps[Self <: CreateAcceleratorResponse] (val x: Self) extends AnyVal {
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
    def setAccelerator(value: Accelerator): Self = this.set("Accelerator", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccelerator: Self = this.set("Accelerator", js.undefined)
  }
  
}

