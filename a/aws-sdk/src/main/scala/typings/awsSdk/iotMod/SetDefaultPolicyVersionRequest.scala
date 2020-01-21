package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SetDefaultPolicyVersionRequest extends js.Object {
  /**
    * The policy name.
    */
  var policyName: PolicyName = js.native
  /**
    * The policy version ID.
    */
  var policyVersionId: PolicyVersionId = js.native
}

object SetDefaultPolicyVersionRequest {
  @scala.inline
  def apply(policyName: PolicyName, policyVersionId: PolicyVersionId): SetDefaultPolicyVersionRequest = {
    val __obj = js.Dynamic.literal(policyName = policyName.asInstanceOf[js.Any], policyVersionId = policyVersionId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SetDefaultPolicyVersionRequest]
  }
}

