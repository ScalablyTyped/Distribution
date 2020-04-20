package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListPolicyVersionsRequest extends js.Object {
  /**
    * The policy name.
    */
  var policyName: PolicyName = js.native
}

object ListPolicyVersionsRequest {
  @scala.inline
  def apply(policyName: PolicyName): ListPolicyVersionsRequest = {
    val __obj = js.Dynamic.literal(policyName = policyName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListPolicyVersionsRequest]
  }
}

