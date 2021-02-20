package typings.awsSdk.codecommitMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreatePullRequestApprovalRuleOutput extends StObject {
  
  /**
    * Information about the created approval rule.
    */
  var approvalRule: ApprovalRule = js.native
}
object CreatePullRequestApprovalRuleOutput {
  
  @scala.inline
  def apply(approvalRule: ApprovalRule): CreatePullRequestApprovalRuleOutput = {
    val __obj = js.Dynamic.literal(approvalRule = approvalRule.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreatePullRequestApprovalRuleOutput]
  }
  
  @scala.inline
  implicit class CreatePullRequestApprovalRuleOutputMutableBuilder[Self <: CreatePullRequestApprovalRuleOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApprovalRule(value: ApprovalRule): Self = StObject.set(x, "approvalRule", value.asInstanceOf[js.Any])
  }
}
