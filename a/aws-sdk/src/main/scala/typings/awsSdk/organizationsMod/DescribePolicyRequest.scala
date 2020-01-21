package typings.awsSdk.organizationsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribePolicyRequest extends js.Object {
  /**
    * The unique identifier (ID) of the policy that you want details about. You can get the ID from the ListPolicies or ListPoliciesForTarget operations. The regex pattern for a policy ID string requires "p-" followed by from 8 to 128 lowercase or uppercase letters, digits, or the underscore character (_).
    */
  var PolicyId: typings.awsSdk.organizationsMod.PolicyId = js.native
}

object DescribePolicyRequest {
  @scala.inline
  def apply(PolicyId: PolicyId): DescribePolicyRequest = {
    val __obj = js.Dynamic.literal(PolicyId = PolicyId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DescribePolicyRequest]
  }
}

