package typings.awsSdk.documentClientMod.DocumentClient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AutoScalingSettingsDescription extends js.Object {
  /**
    * Disabled auto scaling for this global table or global secondary index.
    */
  var AutoScalingDisabled: js.UndefOr[BooleanObject] = js.native
  /**
    * Role ARN used for configuring the auto scaling policy.
    */
  var AutoScalingRoleArn: js.UndefOr[String] = js.native
  /**
    * The maximum capacity units that a global table or global secondary index should be scaled up to.
    */
  var MaximumUnits: js.UndefOr[PositiveLongObject] = js.native
  /**
    * The minimum capacity units that a global table or global secondary index should be scaled down to.
    */
  var MinimumUnits: js.UndefOr[PositiveLongObject] = js.native
  /**
    * Information about the scaling policies.
    */
  var ScalingPolicies: js.UndefOr[AutoScalingPolicyDescriptionList] = js.native
}

object AutoScalingSettingsDescription {
  @scala.inline
  def apply(
    AutoScalingDisabled: js.UndefOr[BooleanObject] = js.undefined,
    AutoScalingRoleArn: String = null,
    MaximumUnits: js.UndefOr[PositiveLongObject] = js.undefined,
    MinimumUnits: js.UndefOr[PositiveLongObject] = js.undefined,
    ScalingPolicies: AutoScalingPolicyDescriptionList = null
  ): AutoScalingSettingsDescription = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(AutoScalingDisabled)) __obj.updateDynamic("AutoScalingDisabled")(AutoScalingDisabled.get.asInstanceOf[js.Any])
    if (AutoScalingRoleArn != null) __obj.updateDynamic("AutoScalingRoleArn")(AutoScalingRoleArn.asInstanceOf[js.Any])
    if (!js.isUndefined(MaximumUnits)) __obj.updateDynamic("MaximumUnits")(MaximumUnits.get.asInstanceOf[js.Any])
    if (!js.isUndefined(MinimumUnits)) __obj.updateDynamic("MinimumUnits")(MinimumUnits.get.asInstanceOf[js.Any])
    if (ScalingPolicies != null) __obj.updateDynamic("ScalingPolicies")(ScalingPolicies.asInstanceOf[js.Any])
    __obj.asInstanceOf[AutoScalingSettingsDescription]
  }
}

