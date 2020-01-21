package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EffectivePolicy extends js.Object {
  /**
    * The policy ARN.
    */
  var policyArn: js.UndefOr[PolicyArn] = js.native
  /**
    * The IAM policy document.
    */
  var policyDocument: js.UndefOr[PolicyDocument] = js.native
  /**
    * The policy name.
    */
  var policyName: js.UndefOr[PolicyName] = js.native
}

object EffectivePolicy {
  @scala.inline
  def apply(policyArn: PolicyArn = null, policyDocument: PolicyDocument = null, policyName: PolicyName = null): EffectivePolicy = {
    val __obj = js.Dynamic.literal()
    if (policyArn != null) __obj.updateDynamic("policyArn")(policyArn.asInstanceOf[js.Any])
    if (policyDocument != null) __obj.updateDynamic("policyDocument")(policyDocument.asInstanceOf[js.Any])
    if (policyName != null) __obj.updateDynamic("policyName")(policyName.asInstanceOf[js.Any])
    __obj.asInstanceOf[EffectivePolicy]
  }
}

