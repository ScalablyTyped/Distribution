package typings.awsSdkClientDynamodbNode.typesAutoScalingSettingsUpdateMod

import typings.awsSdkClientDynamodbNode.typesAutoScalingPolicyUpdateMod.UnmarshalledAutoScalingPolicyUpdate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UnmarshalledAutoScalingSettingsUpdate extends AutoScalingSettingsUpdate {
  /**
    * <p>The scaling policy to apply for scaling target global table or global secondary index capacity units.</p>
    */
  @JSName("ScalingPolicyUpdate")
  var ScalingPolicyUpdate_UnmarshalledAutoScalingSettingsUpdate: js.UndefOr[UnmarshalledAutoScalingPolicyUpdate] = js.undefined
}

object UnmarshalledAutoScalingSettingsUpdate {
  @scala.inline
  def apply(
    AutoScalingDisabled: js.UndefOr[Boolean] = js.undefined,
    AutoScalingRoleArn: String = null,
    MaximumUnits: Int | Double = null,
    MinimumUnits: Int | Double = null,
    ScalingPolicyUpdate: UnmarshalledAutoScalingPolicyUpdate = null
  ): UnmarshalledAutoScalingSettingsUpdate = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(AutoScalingDisabled)) __obj.updateDynamic("AutoScalingDisabled")(AutoScalingDisabled.asInstanceOf[js.Any])
    if (AutoScalingRoleArn != null) __obj.updateDynamic("AutoScalingRoleArn")(AutoScalingRoleArn.asInstanceOf[js.Any])
    if (MaximumUnits != null) __obj.updateDynamic("MaximumUnits")(MaximumUnits.asInstanceOf[js.Any])
    if (MinimumUnits != null) __obj.updateDynamic("MinimumUnits")(MinimumUnits.asInstanceOf[js.Any])
    if (ScalingPolicyUpdate != null) __obj.updateDynamic("ScalingPolicyUpdate")(ScalingPolicyUpdate.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnmarshalledAutoScalingSettingsUpdate]
  }
}

