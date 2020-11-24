package typings.awsSdk.emrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AutoScalingPolicy extends js.Object {
  
  /**
    * The upper and lower EC2 instance limits for an automatic scaling policy. Automatic scaling activity will not cause an instance group to grow above or below these limits.
    */
  var Constraints: ScalingConstraints = js.native
  
  /**
    * The scale-in and scale-out rules that comprise the automatic scaling policy.
    */
  var Rules: ScalingRuleList = js.native
}
object AutoScalingPolicy {
  
  @scala.inline
  def apply(Constraints: ScalingConstraints, Rules: ScalingRuleList): AutoScalingPolicy = {
    val __obj = js.Dynamic.literal(Constraints = Constraints.asInstanceOf[js.Any], Rules = Rules.asInstanceOf[js.Any])
    __obj.asInstanceOf[AutoScalingPolicy]
  }
  
  @scala.inline
  implicit class AutoScalingPolicyOps[Self <: AutoScalingPolicy] (val x: Self) extends AnyVal {
    
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
    def setRulesVarargs(value: ScalingRule*): Self = this.set("Rules", js.Array(value :_*))
    
    @scala.inline
    def setRules(value: ScalingRuleList): Self = this.set("Rules", value.asInstanceOf[js.Any])
  }
}
