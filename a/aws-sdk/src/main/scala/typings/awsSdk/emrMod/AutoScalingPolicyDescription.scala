package typings.awsSdk.emrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AutoScalingPolicyDescription extends js.Object {
  /**
    * The upper and lower EC2 instance limits for an automatic scaling policy. Automatic scaling activity will not cause an instance group to grow above or below these limits.
    */
  var Constraints: js.UndefOr[ScalingConstraints] = js.native
  /**
    * The scale-in and scale-out rules that comprise the automatic scaling policy.
    */
  var Rules: js.UndefOr[ScalingRuleList] = js.native
  /**
    * The status of an automatic scaling policy. 
    */
  var Status: js.UndefOr[AutoScalingPolicyStatus] = js.native
}

object AutoScalingPolicyDescription {
  @scala.inline
  def apply(): AutoScalingPolicyDescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AutoScalingPolicyDescription]
  }
  @scala.inline
  implicit class AutoScalingPolicyDescriptionOps[Self <: AutoScalingPolicyDescription] (val x: Self) extends AnyVal {
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
    def setConstraints(value: ScalingConstraints): Self = this.set("Constraints", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConstraints: Self = this.set("Constraints", js.undefined)
    @scala.inline
    def setRulesVarargs(value: ScalingRule*): Self = this.set("Rules", js.Array(value :_*))
    @scala.inline
    def setRules(value: ScalingRuleList): Self = this.set("Rules", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRules: Self = this.set("Rules", js.undefined)
    @scala.inline
    def setStatus(value: AutoScalingPolicyStatus): Self = this.set("Status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("Status", js.undefined)
  }
  
}

