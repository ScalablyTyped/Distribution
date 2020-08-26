package typings.awsSdk.medialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteInputSecurityGroupRequest extends js.Object {
  /**
    * The Input Security Group to delete
    */
  var InputSecurityGroupId: string = js.native
}

object DeleteInputSecurityGroupRequest {
  @scala.inline
  def apply(InputSecurityGroupId: string): DeleteInputSecurityGroupRequest = {
    val __obj = js.Dynamic.literal(InputSecurityGroupId = InputSecurityGroupId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteInputSecurityGroupRequest]
  }
  @scala.inline
  implicit class DeleteInputSecurityGroupRequestOps[Self <: DeleteInputSecurityGroupRequest] (val x: Self) extends AnyVal {
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
    def setInputSecurityGroupId(value: string): Self = this.set("InputSecurityGroupId", value.asInstanceOf[js.Any])
  }
  
}

