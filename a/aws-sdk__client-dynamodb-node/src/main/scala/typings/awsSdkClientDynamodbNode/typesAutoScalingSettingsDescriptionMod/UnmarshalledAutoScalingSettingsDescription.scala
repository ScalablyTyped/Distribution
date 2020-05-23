package typings.awsSdkClientDynamodbNode.typesAutoScalingSettingsDescriptionMod

import typings.awsSdkClientDynamodbNode.typesAutoScalingPolicyDescriptionMod.UnmarshalledAutoScalingPolicyDescription
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UnmarshalledAutoScalingSettingsDescription extends AutoScalingSettingsDescription {
  /**
    * <p>Information about the scaling policies.</p>
    */
  @JSName("ScalingPolicies")
  var ScalingPolicies_UnmarshalledAutoScalingSettingsDescription: js.UndefOr[js.Array[UnmarshalledAutoScalingPolicyDescription]] = js.undefined
}

object UnmarshalledAutoScalingSettingsDescription {
  @scala.inline
  def apply(
    AutoScalingDisabled: js.UndefOr[Boolean] = js.undefined,
    AutoScalingRoleArn: String = null,
    MaximumUnits: js.UndefOr[Double] = js.undefined,
    MinimumUnits: js.UndefOr[Double] = js.undefined,
    ScalingPolicies: js.Array[UnmarshalledAutoScalingPolicyDescription] = null
  ): UnmarshalledAutoScalingSettingsDescription = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(AutoScalingDisabled)) __obj.updateDynamic("AutoScalingDisabled")(AutoScalingDisabled.get.asInstanceOf[js.Any])
    if (AutoScalingRoleArn != null) __obj.updateDynamic("AutoScalingRoleArn")(AutoScalingRoleArn.asInstanceOf[js.Any])
    if (!js.isUndefined(MaximumUnits)) __obj.updateDynamic("MaximumUnits")(MaximumUnits.get.asInstanceOf[js.Any])
    if (!js.isUndefined(MinimumUnits)) __obj.updateDynamic("MinimumUnits")(MinimumUnits.get.asInstanceOf[js.Any])
    if (ScalingPolicies != null) __obj.updateDynamic("ScalingPolicies")(ScalingPolicies.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnmarshalledAutoScalingSettingsDescription]
  }
}

