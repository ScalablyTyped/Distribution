package typings.awsSdk.emrMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AutoScalingPolicyDescription extends StObject {
  
  /**
    * The upper and lower EC2 instance limits for an automatic scaling policy. Automatic scaling activity will not cause an instance group to grow above or below these limits.
    */
  var Constraints: js.UndefOr[ScalingConstraints] = js.undefined
  
  /**
    * The scale-in and scale-out rules that comprise the automatic scaling policy.
    */
  var Rules: js.UndefOr[ScalingRuleList] = js.undefined
  
  /**
    * The status of an automatic scaling policy. 
    */
  var Status: js.UndefOr[AutoScalingPolicyStatus] = js.undefined
}
object AutoScalingPolicyDescription {
  
  @scala.inline
  def apply(): AutoScalingPolicyDescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AutoScalingPolicyDescription]
  }
  
  @scala.inline
  implicit class AutoScalingPolicyDescriptionMutableBuilder[Self <: AutoScalingPolicyDescription] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConstraints(value: ScalingConstraints): Self = StObject.set(x, "Constraints", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConstraintsUndefined: Self = StObject.set(x, "Constraints", js.undefined)
    
    @scala.inline
    def setRules(value: ScalingRuleList): Self = StObject.set(x, "Rules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRulesUndefined: Self = StObject.set(x, "Rules", js.undefined)
    
    @scala.inline
    def setRulesVarargs(value: ScalingRule*): Self = StObject.set(x, "Rules", js.Array(value :_*))
    
    @scala.inline
    def setStatus(value: AutoScalingPolicyStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
