package typings.awsSdkClientDynamodbBrowser.typesAutoScalingPolicyDescriptionMod

import typings.awsSdkClientDynamodbBrowser.typesAutoScalingTargetTrackingScalingPolicyConfigurationDescriptionMod.AutoScalingTargetTrackingScalingPolicyConfigurationDescription
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AutoScalingPolicyDescription extends js.Object {
  /**
    * <p>The name of the scaling policy.</p>
    */
  var PolicyName: js.UndefOr[String] = js.undefined
  /**
    * <p>Represents a target tracking scaling policy configuration.</p>
    */
  var TargetTrackingScalingPolicyConfiguration: js.UndefOr[AutoScalingTargetTrackingScalingPolicyConfigurationDescription] = js.undefined
}

object AutoScalingPolicyDescription {
  @scala.inline
  def apply(
    PolicyName: String = null,
    TargetTrackingScalingPolicyConfiguration: AutoScalingTargetTrackingScalingPolicyConfigurationDescription = null
  ): AutoScalingPolicyDescription = {
    val __obj = js.Dynamic.literal()
    if (PolicyName != null) __obj.updateDynamic("PolicyName")(PolicyName.asInstanceOf[js.Any])
    if (TargetTrackingScalingPolicyConfiguration != null) __obj.updateDynamic("TargetTrackingScalingPolicyConfiguration")(TargetTrackingScalingPolicyConfiguration.asInstanceOf[js.Any])
    __obj.asInstanceOf[AutoScalingPolicyDescription]
  }
}

