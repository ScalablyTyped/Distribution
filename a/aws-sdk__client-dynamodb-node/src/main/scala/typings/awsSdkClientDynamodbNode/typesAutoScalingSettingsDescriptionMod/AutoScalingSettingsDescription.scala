package typings.awsSdkClientDynamodbNode.typesAutoScalingSettingsDescriptionMod

import typings.awsSdkClientDynamodbNode.typesAutoScalingPolicyDescriptionMod.AutoScalingPolicyDescription
import typings.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AutoScalingSettingsDescription extends js.Object {
  /**
    * <p>Disabled autoscaling for this global table or global secondary index.</p>
    */
  var AutoScalingDisabled: js.UndefOr[Boolean] = js.native
  /**
    * <p>Role ARN used for configuring autoScaling policy.</p>
    */
  var AutoScalingRoleArn: js.UndefOr[String] = js.native
  /**
    * <p>The maximum capacity units that a global table or global secondary index should be scaled up to.</p>
    */
  var MaximumUnits: js.UndefOr[Double] = js.native
  /**
    * <p>The minimum capacity units that a global table or global secondary index should be scaled down to.</p>
    */
  var MinimumUnits: js.UndefOr[Double] = js.native
  /**
    * <p>Information about the scaling policies.</p>
    */
  var ScalingPolicies: js.UndefOr[js.Array[AutoScalingPolicyDescription] | Iterable[AutoScalingPolicyDescription]] = js.native
}

object AutoScalingSettingsDescription {
  @scala.inline
  def apply(): AutoScalingSettingsDescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AutoScalingSettingsDescription]
  }
  @scala.inline
  implicit class AutoScalingSettingsDescriptionOps[Self <: AutoScalingSettingsDescription] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAutoScalingDisabled(value: Boolean): Self = this.set("AutoScalingDisabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoScalingDisabled: Self = this.set("AutoScalingDisabled", js.undefined)
    @scala.inline
    def setAutoScalingRoleArn(value: String): Self = this.set("AutoScalingRoleArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoScalingRoleArn: Self = this.set("AutoScalingRoleArn", js.undefined)
    @scala.inline
    def setMaximumUnits(value: Double): Self = this.set("MaximumUnits", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaximumUnits: Self = this.set("MaximumUnits", js.undefined)
    @scala.inline
    def setMinimumUnits(value: Double): Self = this.set("MinimumUnits", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinimumUnits: Self = this.set("MinimumUnits", js.undefined)
    @scala.inline
    def setScalingPoliciesVarargs(value: AutoScalingPolicyDescription*): Self = this.set("ScalingPolicies", js.Array(value :_*))
    @scala.inline
    def setScalingPolicies(value: js.Array[AutoScalingPolicyDescription] | Iterable[AutoScalingPolicyDescription]): Self = this.set("ScalingPolicies", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScalingPolicies: Self = this.set("ScalingPolicies", js.undefined)
  }
  
}

