package typings.awsSdk.organizationsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EffectivePolicy extends js.Object {
  /**
    * The time of the last update to this policy.
    */
  var LastUpdatedTimestamp: js.UndefOr[Timestamp] = js.native
  /**
    * The text content of the policy.
    */
  var PolicyContent: js.UndefOr[typings.awsSdk.organizationsMod.PolicyContent] = js.native
  /**
    * The policy type.
    */
  var PolicyType: js.UndefOr[EffectivePolicyType] = js.native
  /**
    * The account ID of the policy target. 
    */
  var TargetId: js.UndefOr[PolicyTargetId] = js.native
}

object EffectivePolicy {
  @scala.inline
  def apply(
    LastUpdatedTimestamp: Timestamp = null,
    PolicyContent: PolicyContent = null,
    PolicyType: EffectivePolicyType = null,
    TargetId: PolicyTargetId = null
  ): EffectivePolicy = {
    val __obj = js.Dynamic.literal()
    if (LastUpdatedTimestamp != null) __obj.updateDynamic("LastUpdatedTimestamp")(LastUpdatedTimestamp.asInstanceOf[js.Any])
    if (PolicyContent != null) __obj.updateDynamic("PolicyContent")(PolicyContent.asInstanceOf[js.Any])
    if (PolicyType != null) __obj.updateDynamic("PolicyType")(PolicyType.asInstanceOf[js.Any])
    if (TargetId != null) __obj.updateDynamic("TargetId")(TargetId.asInstanceOf[js.Any])
    __obj.asInstanceOf[EffectivePolicy]
  }
}

