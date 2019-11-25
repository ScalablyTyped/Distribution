package typings.atAwsDashSdkClientDashDynamodbDashBrowser.typesUnderscoreAutoScalingSettingsDescriptionMod

import typings.atAwsDashSdkClientDashDynamodbDashBrowser.typesUnderscoreAutoScalingPolicyDescriptionMod._AutoScalingPolicyDescription
import typings.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _AutoScalingSettingsDescription extends js.Object {
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
  var ScalingPolicies: js.UndefOr[
    js.Array[_AutoScalingPolicyDescription] | Iterable[_AutoScalingPolicyDescription]
  ] = js.undefined
}

object _AutoScalingSettingsDescription {
  @scala.inline
  def apply(
    AutoScalingDisabled: js.UndefOr[Boolean] = js.undefined,
    AutoScalingRoleArn: String = null,
    MaximumUnits: Int | Double = null,
    MinimumUnits: Int | Double = null,
    ScalingPolicies: js.Array[_AutoScalingPolicyDescription] | Iterable[_AutoScalingPolicyDescription] = null
  ): _AutoScalingSettingsDescription = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(AutoScalingDisabled)) __obj.updateDynamic("AutoScalingDisabled")(AutoScalingDisabled.asInstanceOf[js.Any])
    if (AutoScalingRoleArn != null) __obj.updateDynamic("AutoScalingRoleArn")(AutoScalingRoleArn.asInstanceOf[js.Any])
    if (MaximumUnits != null) __obj.updateDynamic("MaximumUnits")(MaximumUnits.asInstanceOf[js.Any])
    if (MinimumUnits != null) __obj.updateDynamic("MinimumUnits")(MinimumUnits.asInstanceOf[js.Any])
    if (ScalingPolicies != null) __obj.updateDynamic("ScalingPolicies")(ScalingPolicies.asInstanceOf[js.Any])
    __obj.asInstanceOf[_AutoScalingSettingsDescription]
  }
}

