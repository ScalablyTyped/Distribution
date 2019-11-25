package typings.atAwsDashSdkClientDashDynamodbDashNode.typesUnderscoreAutoScalingPolicyUpdateMod

import typings.atAwsDashSdkClientDashDynamodbDashNode.typesUnderscoreAutoScalingTargetTrackingScalingPolicyConfigurationUpdateMod._UnmarshalledAutoScalingTargetTrackingScalingPolicyConfigurationUpdate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _UnmarshalledAutoScalingPolicyUpdate extends _AutoScalingPolicyUpdate {
  /**
    * <p>Represents a target tracking scaling policy configuration.</p>
    */
  @JSName("TargetTrackingScalingPolicyConfiguration")
  var TargetTrackingScalingPolicyConfiguration__UnmarshalledAutoScalingPolicyUpdate: _UnmarshalledAutoScalingTargetTrackingScalingPolicyConfigurationUpdate
}

object _UnmarshalledAutoScalingPolicyUpdate {
  @scala.inline
  def apply(
    TargetTrackingScalingPolicyConfiguration: _UnmarshalledAutoScalingTargetTrackingScalingPolicyConfigurationUpdate,
    PolicyName: String = null
  ): _UnmarshalledAutoScalingPolicyUpdate = {
    val __obj = js.Dynamic.literal(TargetTrackingScalingPolicyConfiguration = TargetTrackingScalingPolicyConfiguration.asInstanceOf[js.Any])
    if (PolicyName != null) __obj.updateDynamic("PolicyName")(PolicyName.asInstanceOf[js.Any])
    __obj.asInstanceOf[_UnmarshalledAutoScalingPolicyUpdate]
  }
}

