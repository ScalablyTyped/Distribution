package typings.awsSdk.globalacceleratorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteAcceleratorRequest extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of an accelerator.
    */
  var AcceleratorArn: GenericString = js.native
}

object DeleteAcceleratorRequest {
  @scala.inline
  def apply(AcceleratorArn: GenericString): DeleteAcceleratorRequest = {
    val __obj = js.Dynamic.literal(AcceleratorArn = AcceleratorArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteAcceleratorRequest]
  }
  @scala.inline
  implicit class DeleteAcceleratorRequestOps[Self <: DeleteAcceleratorRequest] (val x: Self) extends AnyVal {
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
    def setAcceleratorArn(value: GenericString): Self = this.set("AcceleratorArn", value.asInstanceOf[js.Any])
  }
  
}

