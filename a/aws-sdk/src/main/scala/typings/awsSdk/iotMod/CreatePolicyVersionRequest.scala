package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreatePolicyVersionRequest extends js.Object {
  /**
    * The JSON document that describes the policy. Minimum length of 1. Maximum length of 2048, excluding whitespace.
    */
  var policyDocument: PolicyDocument = js.native
  /**
    * The policy name.
    */
  var policyName: PolicyName = js.native
  /**
    * Specifies whether the policy version is set as the default. When this parameter is true, the new policy version becomes the operative version (that is, the version that is in effect for the certificates to which the policy is attached).
    */
  var setAsDefault: js.UndefOr[SetAsDefault] = js.native
}

object CreatePolicyVersionRequest {
  @scala.inline
  def apply(
    policyDocument: PolicyDocument,
    policyName: PolicyName,
    setAsDefault: js.UndefOr[SetAsDefault] = js.undefined
  ): CreatePolicyVersionRequest = {
    val __obj = js.Dynamic.literal(policyDocument = policyDocument.asInstanceOf[js.Any], policyName = policyName.asInstanceOf[js.Any])
    if (!js.isUndefined(setAsDefault)) __obj.updateDynamic("setAsDefault")(setAsDefault.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreatePolicyVersionRequest]
  }
}

