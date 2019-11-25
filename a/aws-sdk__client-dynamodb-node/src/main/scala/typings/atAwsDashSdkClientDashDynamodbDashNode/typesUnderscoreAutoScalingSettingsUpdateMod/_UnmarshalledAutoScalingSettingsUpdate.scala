package typings.atAwsDashSdkClientDashDynamodbDashNode.typesUnderscoreAutoScalingSettingsUpdateMod

import typings.atAwsDashSdkClientDashDynamodbDashNode.typesUnderscoreAutoScalingPolicyUpdateMod._UnmarshalledAutoScalingPolicyUpdate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _UnmarshalledAutoScalingSettingsUpdate extends _AutoScalingSettingsUpdate {
  /**
    * <p>The scaling policy to apply for scaling target global table or global secondary index capacity units.</p>
    */
  @JSName("ScalingPolicyUpdate")
  var ScalingPolicyUpdate__UnmarshalledAutoScalingSettingsUpdate: js.UndefOr[_UnmarshalledAutoScalingPolicyUpdate] = js.undefined
}

object _UnmarshalledAutoScalingSettingsUpdate {
  @scala.inline
  def apply(
    AutoScalingDisabled: js.UndefOr[Boolean] = js.undefined,
    AutoScalingRoleArn: String = null,
    MaximumUnits: Int | Double = null,
    MinimumUnits: Int | Double = null,
    ScalingPolicyUpdate: _UnmarshalledAutoScalingPolicyUpdate = null
  ): _UnmarshalledAutoScalingSettingsUpdate = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(AutoScalingDisabled)) __obj.updateDynamic("AutoScalingDisabled")(AutoScalingDisabled.asInstanceOf[js.Any])
    if (AutoScalingRoleArn != null) __obj.updateDynamic("AutoScalingRoleArn")(AutoScalingRoleArn.asInstanceOf[js.Any])
    if (MaximumUnits != null) __obj.updateDynamic("MaximumUnits")(MaximumUnits.asInstanceOf[js.Any])
    if (MinimumUnits != null) __obj.updateDynamic("MinimumUnits")(MinimumUnits.asInstanceOf[js.Any])
    if (ScalingPolicyUpdate != null) __obj.updateDynamic("ScalingPolicyUpdate")(ScalingPolicyUpdate.asInstanceOf[js.Any])
    __obj.asInstanceOf[_UnmarshalledAutoScalingSettingsUpdate]
  }
}

