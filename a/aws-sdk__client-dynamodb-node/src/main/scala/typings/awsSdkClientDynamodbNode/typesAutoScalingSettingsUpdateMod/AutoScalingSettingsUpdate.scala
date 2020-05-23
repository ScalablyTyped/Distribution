package typings.awsSdkClientDynamodbNode.typesAutoScalingSettingsUpdateMod

import typings.awsSdkClientDynamodbNode.typesAutoScalingPolicyUpdateMod.AutoScalingPolicyUpdate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AutoScalingSettingsUpdate extends js.Object {
  /**
    * <p>Disabled autoscaling for this global table or global secondary index.</p>
    */
  var AutoScalingDisabled: js.UndefOr[Boolean] = js.undefined
  /**
    * <p>Role ARN used for configuring autoscaling policy.</p>
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
    * <p>The scaling policy to apply for scaling target global table or global secondary index capacity units.</p>
    */
  var ScalingPolicyUpdate: js.UndefOr[AutoScalingPolicyUpdate] = js.undefined
}

object AutoScalingSettingsUpdate {
  @scala.inline
  def apply(
    AutoScalingDisabled: js.UndefOr[Boolean] = js.undefined,
    AutoScalingRoleArn: String = null,
    MaximumUnits: js.UndefOr[Double] = js.undefined,
    MinimumUnits: js.UndefOr[Double] = js.undefined,
    ScalingPolicyUpdate: AutoScalingPolicyUpdate = null
  ): AutoScalingSettingsUpdate = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(AutoScalingDisabled)) __obj.updateDynamic("AutoScalingDisabled")(AutoScalingDisabled.get.asInstanceOf[js.Any])
    if (AutoScalingRoleArn != null) __obj.updateDynamic("AutoScalingRoleArn")(AutoScalingRoleArn.asInstanceOf[js.Any])
    if (!js.isUndefined(MaximumUnits)) __obj.updateDynamic("MaximumUnits")(MaximumUnits.get.asInstanceOf[js.Any])
    if (!js.isUndefined(MinimumUnits)) __obj.updateDynamic("MinimumUnits")(MinimumUnits.get.asInstanceOf[js.Any])
    if (ScalingPolicyUpdate != null) __obj.updateDynamic("ScalingPolicyUpdate")(ScalingPolicyUpdate.asInstanceOf[js.Any])
    __obj.asInstanceOf[AutoScalingSettingsUpdate]
  }
}

