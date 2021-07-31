package typings.awsSdk.codecommitMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApprovalRuleEventMetadata extends StObject {
  
  /**
    * The content of the approval rule.
    */
  var approvalRuleContent: js.UndefOr[ApprovalRuleContent] = js.undefined
  
  /**
    * The system-generated ID of the approval rule.
    */
  var approvalRuleId: js.UndefOr[ApprovalRuleId] = js.undefined
  
  /**
    * The name of the approval rule.
    */
  var approvalRuleName: js.UndefOr[ApprovalRuleName] = js.undefined
}
object ApprovalRuleEventMetadata {
  
  @scala.inline
  def apply(): ApprovalRuleEventMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ApprovalRuleEventMetadata]
  }
  
  @scala.inline
  implicit class ApprovalRuleEventMetadataMutableBuilder[Self <: ApprovalRuleEventMetadata] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApprovalRuleContent(value: ApprovalRuleContent): Self = StObject.set(x, "approvalRuleContent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApprovalRuleContentUndefined: Self = StObject.set(x, "approvalRuleContent", js.undefined)
    
    @scala.inline
    def setApprovalRuleId(value: ApprovalRuleId): Self = StObject.set(x, "approvalRuleId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApprovalRuleIdUndefined: Self = StObject.set(x, "approvalRuleId", js.undefined)
    
    @scala.inline
    def setApprovalRuleName(value: ApprovalRuleName): Self = StObject.set(x, "approvalRuleName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApprovalRuleNameUndefined: Self = StObject.set(x, "approvalRuleName", js.undefined)
  }
}
