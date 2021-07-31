package typings.awsSdk.codecommitMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdatePullRequestApprovalRuleContentOutput extends StObject {
  
  /**
    * Information about the updated approval rule.
    */
  var approvalRule: ApprovalRule
}
object UpdatePullRequestApprovalRuleContentOutput {
  
  @scala.inline
  def apply(approvalRule: ApprovalRule): UpdatePullRequestApprovalRuleContentOutput = {
    val __obj = js.Dynamic.literal(approvalRule = approvalRule.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdatePullRequestApprovalRuleContentOutput]
  }
  
  @scala.inline
  implicit class UpdatePullRequestApprovalRuleContentOutputMutableBuilder[Self <: UpdatePullRequestApprovalRuleContentOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApprovalRule(value: ApprovalRule): Self = StObject.set(x, "approvalRule", value.asInstanceOf[js.Any])
  }
}
