package typings.awsSdk.dynamodbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AutoScalingSettingsDescription extends js.Object {
  /**
    * Disabled auto scaling for this global table or global secondary index.
    */
  var AutoScalingDisabled: js.UndefOr[BooleanObject] = js.native
  /**
    * Role ARN used for configuring the auto scaling policy.
    */
  var AutoScalingRoleArn: js.UndefOr[String] = js.native
  /**
    * The maximum capacity units that a global table or global secondary index should be scaled up to.
    */
  var MaximumUnits: js.UndefOr[PositiveLongObject] = js.native
  /**
    * The minimum capacity units that a global table or global secondary index should be scaled down to.
    */
  var MinimumUnits: js.UndefOr[PositiveLongObject] = js.native
  /**
    * Information about the scaling policies.
    */
  var ScalingPolicies: js.UndefOr[AutoScalingPolicyDescriptionList] = js.native
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
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAutoScalingDisabled(value: BooleanObject): Self = this.set("AutoScalingDisabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoScalingDisabled: Self = this.set("AutoScalingDisabled", js.undefined)
    @scala.inline
    def setAutoScalingRoleArn(value: String): Self = this.set("AutoScalingRoleArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoScalingRoleArn: Self = this.set("AutoScalingRoleArn", js.undefined)
    @scala.inline
    def setMaximumUnits(value: PositiveLongObject): Self = this.set("MaximumUnits", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaximumUnits: Self = this.set("MaximumUnits", js.undefined)
    @scala.inline
    def setMinimumUnits(value: PositiveLongObject): Self = this.set("MinimumUnits", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinimumUnits: Self = this.set("MinimumUnits", js.undefined)
    @scala.inline
    def setScalingPoliciesVarargs(value: AutoScalingPolicyDescription*): Self = this.set("ScalingPolicies", js.Array(value :_*))
    @scala.inline
    def setScalingPolicies(value: AutoScalingPolicyDescriptionList): Self = this.set("ScalingPolicies", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScalingPolicies: Self = this.set("ScalingPolicies", js.undefined)
  }
  
}

