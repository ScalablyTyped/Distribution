package typings.awsSdkClientDynamodbBrowser.typesAutoScalingSettingsDescriptionMod

import typings.awsSdkClientDynamodbBrowser.typesAutoScalingPolicyDescriptionMod.AutoScalingPolicyDescription
import typings.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AutoScalingSettingsDescription extends js.Object {
  /**
    * <p>Disabled autoscaling for this global table or global secondary index.</p>
    */
  var AutoScalingDisabled: js.UndefOr[Boolean] = js.undefined
  /**
    * <p>Role ARN used for configuring autoScaling policy.</p>
    */
  var AutoScalingRoleArn: js.UndefOr[String] = js.undefined
  /**
    * <p>The maximum capacity units that a global table or global secondary index should be scaled up to.</p>
    */
  var MaximumUnits: js.UndefOr[Double] = js.undefined
  /**
    * <p>The minimum capacity units that a global table or global secondary index should be scaled down to.</p>
    */
  var MinimumUnits: js.UndefOr[Double] = js.undefined
  /**
    * <p>Information about the scaling policies.</p>
    */
  var ScalingPolicies: js.UndefOr[js.Array[AutoScalingPolicyDescription] | Iterable[AutoScalingPolicyDescription]] = js.undefined
}

object AutoScalingSettingsDescription {
  @scala.inline
  def apply(
    AutoScalingDisabled: js.UndefOr[Boolean] = js.undefined,
    AutoScalingRoleArn: String = null,
    MaximumUnits: js.UndefOr[Double] = js.undefined,
    MinimumUnits: js.UndefOr[Double] = js.undefined,
    ScalingPolicies: js.Array[AutoScalingPolicyDescription] | Iterable[AutoScalingPolicyDescription] = null
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

