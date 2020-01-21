package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreatePolicyRequest extends js.Object {
  /**
    * The JSON document that describes the policy. policyDocument must have a minimum length of 1, with a maximum length of 2048, excluding whitespace.
    */
  var policyDocument: PolicyDocument = js.native
  /**
    * The policy name.
    */
  var policyName: PolicyName = js.native
}

object CreatePolicyRequest {
  @scala.inline
  def apply(policyDocument: PolicyDocument, policyName: PolicyName): CreatePolicyRequest = {
    val __obj = js.Dynamic.literal(policyDocument = policyDocument.asInstanceOf[js.Any], policyName = policyName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CreatePolicyRequest]
  }
}

