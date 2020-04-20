package typings.awsSdk.wafv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetPermissionPolicyRequest extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the rule group for which you want to get the policy.
    */
  var ResourceArn: typings.awsSdk.wafv2Mod.ResourceArn = js.native
}

object GetPermissionPolicyRequest {
  @scala.inline
  def apply(ResourceArn: ResourceArn): GetPermissionPolicyRequest = {
    val __obj = js.Dynamic.literal(ResourceArn = ResourceArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetPermissionPolicyRequest]
  }
}

