package typings.atAwsDashSdkClientDashDynamodbDashNode.typesUnderscoreAutoScalingPolicyDescriptionMod

import typings.atAwsDashSdkClientDashDynamodbDashNode.typesUnderscoreAutoScalingTargetTrackingScalingPolicyConfigurationDescriptionMod._UnmarshalledAutoScalingTargetTrackingScalingPolicyConfigurationDescription
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _UnmarshalledAutoScalingPolicyDescription extends _AutoScalingPolicyDescription {
  /**
    * <p>Represents a target tracking scaling policy configuration.</p>
    */
  @JSName("TargetTrackingScalingPolicyConfiguration")
  var TargetTrackingScalingPolicyConfiguration__UnmarshalledAutoScalingPolicyDescription: js.UndefOr[_UnmarshalledAutoScalingTargetTrackingScalingPolicyConfigurationDescription] = js.undefined
}

object _UnmarshalledAutoScalingPolicyDescription {
  @scala.inline
  def apply(
    PolicyName: String = null,
    TargetTrackingScalingPolicyConfiguration: _UnmarshalledAutoScalingTargetTrackingScalingPolicyConfigurationDescription = null
  ): _UnmarshalledAutoScalingPolicyDescription = {
    val __obj = js.Dynamic.literal()
    if (PolicyName != null) __obj.updateDynamic("PolicyName")(PolicyName)
    if (TargetTrackingScalingPolicyConfiguration != null) __obj.updateDynamic("TargetTrackingScalingPolicyConfiguration")(TargetTrackingScalingPolicyConfiguration)
    __obj.asInstanceOf[_UnmarshalledAutoScalingPolicyDescription]
  }
}

