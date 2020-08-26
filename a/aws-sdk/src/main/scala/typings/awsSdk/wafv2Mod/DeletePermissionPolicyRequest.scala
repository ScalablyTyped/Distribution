package typings.awsSdk.wafv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeletePermissionPolicyRequest extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the rule group from which you want to delete the policy. You must be the owner of the rule group to perform this operation.
    */
  var ResourceArn: typings.awsSdk.wafv2Mod.ResourceArn = js.native
}

object DeletePermissionPolicyRequest {
  @scala.inline
  def apply(ResourceArn: ResourceArn): DeletePermissionPolicyRequest = {
    val __obj = js.Dynamic.literal(ResourceArn = ResourceArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeletePermissionPolicyRequest]
  }
  @scala.inline
  implicit class DeletePermissionPolicyRequestOps[Self <: DeletePermissionPolicyRequest] (val x: Self) extends AnyVal {
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
    def setResourceArn(value: ResourceArn): Self = this.set("ResourceArn", value.asInstanceOf[js.Any])
  }
  
}

