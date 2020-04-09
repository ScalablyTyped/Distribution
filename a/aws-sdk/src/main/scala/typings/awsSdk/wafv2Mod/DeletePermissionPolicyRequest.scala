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
}

