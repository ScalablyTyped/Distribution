package typings.atAwsDashSdkClientDashDynamodbDashNode.typesUnderscoreAutoScalingPolicyDescriptionMod

import typings.atAwsDashSdkClientDashDynamodbDashNode.typesUnderscoreAutoScalingTargetTrackingScalingPolicyConfigurationDescriptionMod._AutoScalingTargetTrackingScalingPolicyConfigurationDescription
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _AutoScalingPolicyDescription extends js.Object {
  /**
    * <p>The name of the scaling policy.</p>
    */
  var PolicyName: js.UndefOr[String] = js.undefined
  /**
    * <p>Represents a target tracking scaling policy configuration.</p>
    */
  var TargetTrackingScalingPolicyConfiguration: js.UndefOr[_AutoScalingTargetTrackingScalingPolicyConfigurationDescription] = js.undefined
}

object _AutoScalingPolicyDescription {
  @scala.inline
  def apply(
    PolicyName: String = null,
    TargetTrackingScalingPolicyConfiguration: _AutoScalingTargetTrackingScalingPolicyConfigurationDescription = null
  ): _AutoScalingPolicyDescription = {
    val __obj = js.Dynamic.literal()
    if (PolicyName != null) __obj.updateDynamic("PolicyName")(PolicyName.asInstanceOf[js.Any])
    if (TargetTrackingScalingPolicyConfiguration != null) __obj.updateDynamic("TargetTrackingScalingPolicyConfiguration")(TargetTrackingScalingPolicyConfiguration.asInstanceOf[js.Any])
    __obj.asInstanceOf[_AutoScalingPolicyDescription]
  }
}

