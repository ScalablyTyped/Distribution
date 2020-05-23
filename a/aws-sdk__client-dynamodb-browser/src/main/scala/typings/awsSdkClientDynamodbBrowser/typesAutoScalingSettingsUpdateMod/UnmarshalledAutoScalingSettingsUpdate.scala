package typings.awsSdkClientDynamodbBrowser.typesAutoScalingSettingsUpdateMod

import typings.awsSdkClientDynamodbBrowser.typesAutoScalingPolicyUpdateMod.UnmarshalledAutoScalingPolicyUpdate
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
    MaximumUnits: js.UndefOr[Double] = js.undefined,
    MinimumUnits: js.UndefOr[Double] = js.undefined,
    ScalingPolicyUpdate: UnmarshalledAutoScalingPolicyUpdate = null
  ): UnmarshalledAutoScalingSettingsUpdate = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(AutoScalingDisabled)) __obj.updateDynamic("AutoScalingDisabled")(AutoScalingDisabled.get.asInstanceOf[js.Any])
    if (AutoScalingRoleArn != null) __obj.updateDynamic("AutoScalingRoleArn")(AutoScalingRoleArn.asInstanceOf[js.Any])
    if (!js.isUndefined(MaximumUnits)) __obj.updateDynamic("MaximumUnits")(MaximumUnits.get.asInstanceOf[js.Any])
    if (!js.isUndefined(MinimumUnits)) __obj.updateDynamic("MinimumUnits")(MinimumUnits.get.asInstanceOf[js.Any])
    if (ScalingPolicyUpdate != null) __obj.updateDynamic("ScalingPolicyUpdate")(ScalingPolicyUpdate.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnmarshalledAutoScalingSettingsUpdate]
  }
}

