package typings.awsSdk.cloudhsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteHapgRequest extends js.Object {
  /**
    * The ARN of the high-availability partition group to delete.
    */
  var HapgArn: typings.awsSdk.cloudhsmMod.HapgArn = js.native
}

object DeleteHapgRequest {
  @scala.inline
  def apply(HapgArn: HapgArn): DeleteHapgRequest = {
    val __obj = js.Dynamic.literal(HapgArn = HapgArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteHapgRequest]
  }
  @scala.inline
  implicit class DeleteHapgRequestOps[Self <: DeleteHapgRequest] (val x: Self) extends AnyVal {
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
    def setHapgArn(value: HapgArn): Self = this.set("HapgArn", value.asInstanceOf[js.Any])
  }
  
}

