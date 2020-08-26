package typings.awsSdk.greengrassMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AssociateServiceRoleToAccountRequest extends js.Object {
  /**
    * The ARN of the service role you wish to associate with your account.
    */
  var RoleArn: string = js.native
}

object AssociateServiceRoleToAccountRequest {
  @scala.inline
  def apply(RoleArn: string): AssociateServiceRoleToAccountRequest = {
    val __obj = js.Dynamic.literal(RoleArn = RoleArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssociateServiceRoleToAccountRequest]
  }
  @scala.inline
  implicit class AssociateServiceRoleToAccountRequestOps[Self <: AssociateServiceRoleToAccountRequest] (val x: Self) extends AnyVal {
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
    def setRoleArn(value: string): Self = this.set("RoleArn", value.asInstanceOf[js.Any])
  }
  
}

