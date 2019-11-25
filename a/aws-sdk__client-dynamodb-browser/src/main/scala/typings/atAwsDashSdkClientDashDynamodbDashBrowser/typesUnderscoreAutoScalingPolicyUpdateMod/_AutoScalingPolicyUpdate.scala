package typings.atAwsDashSdkClientDashDynamodbDashBrowser.typesUnderscoreAutoScalingPolicyUpdateMod

import typings.atAwsDashSdkClientDashDynamodbDashBrowser.typesUnderscoreAutoScalingTargetTrackingScalingPolicyConfigurationUpdateMod._AutoScalingTargetTrackingScalingPolicyConfigurationUpdate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _AutoScalingPolicyUpdate extends js.Object {
  /**
    * <p>The name of the scaling policy.</p>
    */
  var PolicyName: js.UndefOr[String] = js.undefined
  /**
    * <p>Represents a target tracking scaling policy configuration.</p>
    */
  var TargetTrackingScalingPolicyConfiguration: _AutoScalingTargetTrackingScalingPolicyConfigurationUpdate
}

object _AutoScalingPolicyUpdate {
  @scala.inline
  def apply(
    TargetTrackingScalingPolicyConfiguration: _AutoScalingTargetTrackingScalingPolicyConfigurationUpdate,
    PolicyName: String = null
  ): _AutoScalingPolicyUpdate = {
    val __obj = js.Dynamic.literal(TargetTrackingScalingPolicyConfiguration = TargetTrackingScalingPolicyConfiguration.asInstanceOf[js.Any])
    if (PolicyName != null) __obj.updateDynamic("PolicyName")(PolicyName.asInstanceOf[js.Any])
    __obj.asInstanceOf[_AutoScalingPolicyUpdate]
  }
}

