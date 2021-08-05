package typings.awsSdk.codecommitMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Evaluation extends StObject {
  
  /**
    * The names of the approval rules that have not had their conditions met.
    */
  var approvalRulesNotSatisfied: js.UndefOr[ApprovalRulesNotSatisfiedList] = js.undefined
  
  /**
    * The names of the approval rules that have had their conditions met.
    */
  var approvalRulesSatisfied: js.UndefOr[ApprovalRulesSatisfiedList] = js.undefined
  
  /**
    * Whether the state of the pull request is approved.
    */
  var approved: js.UndefOr[Approved] = js.undefined
  
  /**
    * Whether the approval rule requirements for the pull request have been overridden and no longer need to be met.
    */
  var overridden: js.UndefOr[Overridden] = js.undefined
}
object Evaluation {
  
  inline def apply(): Evaluation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Evaluation]
  }
  
  extension [Self <: Evaluation](x: Self) {
    
    inline def setApprovalRulesNotSatisfied(value: ApprovalRulesNotSatisfiedList): Self = StObject.set(x, "approvalRulesNotSatisfied", value.asInstanceOf[js.Any])
    
    inline def setApprovalRulesNotSatisfiedUndefined: Self = StObject.set(x, "approvalRulesNotSatisfied", js.undefined)
    
    inline def setApprovalRulesNotSatisfiedVarargs(value: ApprovalRuleName*): Self = StObject.set(x, "approvalRulesNotSatisfied", js.Array(value :_*))
    
    inline def setApprovalRulesSatisfied(value: ApprovalRulesSatisfiedList): Self = StObject.set(x, "approvalRulesSatisfied", value.asInstanceOf[js.Any])
    
    inline def setApprovalRulesSatisfiedUndefined: Self = StObject.set(x, "approvalRulesSatisfied", js.undefined)
    
    inline def setApprovalRulesSatisfiedVarargs(value: ApprovalRuleName*): Self = StObject.set(x, "approvalRulesSatisfied", js.Array(value :_*))
    
    inline def setApproved(value: Approved): Self = StObject.set(x, "approved", value.asInstanceOf[js.Any])
    
    inline def setApprovedUndefined: Self = StObject.set(x, "approved", js.undefined)
    
    inline def setOverridden(value: Overridden): Self = StObject.set(x, "overridden", value.asInstanceOf[js.Any])
    
    inline def setOverriddenUndefined: Self = StObject.set(x, "overridden", js.undefined)
  }
}
