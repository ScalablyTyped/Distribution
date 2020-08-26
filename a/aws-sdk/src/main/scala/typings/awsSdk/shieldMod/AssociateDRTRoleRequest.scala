package typings.awsSdk.shieldMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AssociateDRTRoleRequest extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the role the DRT will use to access your AWS account. Prior to making the AssociateDRTRole request, you must attach the AWSShieldDRTAccessPolicy managed policy to this role. For more information see Attaching and Detaching IAM Policies.
    */
  var RoleArn: typings.awsSdk.shieldMod.RoleArn = js.native
}

object AssociateDRTRoleRequest {
  @scala.inline
  def apply(RoleArn: RoleArn): AssociateDRTRoleRequest = {
    val __obj = js.Dynamic.literal(RoleArn = RoleArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssociateDRTRoleRequest]
  }
  @scala.inline
  implicit class AssociateDRTRoleRequestOps[Self <: AssociateDRTRoleRequest] (val x: Self) extends AnyVal {
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
    def setRoleArn(value: RoleArn): Self = this.set("RoleArn", value.asInstanceOf[js.Any])
  }
  
}

