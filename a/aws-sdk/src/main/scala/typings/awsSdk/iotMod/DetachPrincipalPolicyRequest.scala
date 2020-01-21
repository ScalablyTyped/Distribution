package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DetachPrincipalPolicyRequest extends js.Object {
  /**
    * The name of the policy to detach.
    */
  var policyName: PolicyName = js.native
  /**
    * The principal. If the principal is a certificate, specify the certificate ARN. If the principal is an Amazon Cognito identity, specify the identity ID.
    */
  var principal: Principal = js.native
}

object DetachPrincipalPolicyRequest {
  @scala.inline
  def apply(policyName: PolicyName, principal: Principal): DetachPrincipalPolicyRequest = {
    val __obj = js.Dynamic.literal(policyName = policyName.asInstanceOf[js.Any], principal = principal.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DetachPrincipalPolicyRequest]
  }
}

