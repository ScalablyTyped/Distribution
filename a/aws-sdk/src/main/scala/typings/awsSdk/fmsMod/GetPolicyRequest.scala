package typings.awsSdk.fmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetPolicyRequest extends js.Object {
  /**
    * The ID of the AWS Firewall Manager policy that you want the details for.
    */
  var PolicyId: typings.awsSdk.fmsMod.PolicyId = js.native
}

object GetPolicyRequest {
  @scala.inline
  def apply(PolicyId: PolicyId): GetPolicyRequest = {
    val __obj = js.Dynamic.literal(PolicyId = PolicyId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetPolicyRequest]
  }
}

