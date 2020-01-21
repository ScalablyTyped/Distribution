package typings.awsSdkClientDynamodbNode.typesAutoScalingPolicyDescriptionMod

import typings.awsSdkClientDynamodbNode.typesAutoScalingTargetTrackingScalingPolicyConfigurationDescriptionMod.UnmarshalledAutoScalingTargetTrackingScalingPolicyConfigurationDescription
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UnmarshalledAutoScalingPolicyDescription extends AutoScalingPolicyDescription {
  /**
    * <p>Represents a target tracking scaling policy configuration.</p>
    */
  @JSName("TargetTrackingScalingPolicyConfiguration")
  var TargetTrackingScalingPolicyConfiguration_UnmarshalledAutoScalingPolicyDescription: js.UndefOr[UnmarshalledAutoScalingTargetTrackingScalingPolicyConfigurationDescription] = js.undefined
}

object UnmarshalledAutoScalingPolicyDescription {
  @scala.inline
  def apply(
    PolicyName: String = null,
    TargetTrackingScalingPolicyConfiguration: UnmarshalledAutoScalingTargetTrackingScalingPolicyConfigurationDescription = null
  ): UnmarshalledAutoScalingPolicyDescription = {
    val __obj = js.Dynamic.literal()
    if (PolicyName != null) __obj.updateDynamic("PolicyName")(PolicyName.asInstanceOf[js.Any])
    if (TargetTrackingScalingPolicyConfiguration != null) __obj.updateDynamic("TargetTrackingScalingPolicyConfiguration")(TargetTrackingScalingPolicyConfiguration.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnmarshalledAutoScalingPolicyDescription]
  }
}

