package typings.awsSdkClientDynamodbBrowser.typesAutoScalingSettingsDescriptionMod

import typings.awsSdkClientDynamodbBrowser.typesAutoScalingPolicyDescriptionMod.UnmarshalledAutoScalingPolicyDescription
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
    MaximumUnits: Int | Double = null,
    MinimumUnits: Int | Double = null,
    ScalingPolicies: js.Array[UnmarshalledAutoScalingPolicyDescription] = null
  ): UnmarshalledAutoScalingSettingsDescription = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(AutoScalingDisabled)) __obj.updateDynamic("AutoScalingDisabled")(AutoScalingDisabled.asInstanceOf[js.Any])
    if (AutoScalingRoleArn != null) __obj.updateDynamic("AutoScalingRoleArn")(AutoScalingRoleArn.asInstanceOf[js.Any])
    if (MaximumUnits != null) __obj.updateDynamic("MaximumUnits")(MaximumUnits.asInstanceOf[js.Any])
    if (MinimumUnits != null) __obj.updateDynamic("MinimumUnits")(MinimumUnits.asInstanceOf[js.Any])
    if (ScalingPolicies != null) __obj.updateDynamic("ScalingPolicies")(ScalingPolicies.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnmarshalledAutoScalingSettingsDescription]
  }
}

