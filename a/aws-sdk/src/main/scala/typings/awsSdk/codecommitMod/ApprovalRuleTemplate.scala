package typings.awsSdk.codecommitMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApprovalRuleTemplate extends StObject {
  
  /**
    * The content of the approval rule template.
    */
  var approvalRuleTemplateContent: js.UndefOr[ApprovalRuleTemplateContent] = js.undefined
  
  /**
    * The description of the approval rule template.
    */
  var approvalRuleTemplateDescription: js.UndefOr[ApprovalRuleTemplateDescription] = js.undefined
  
  /**
    * The system-generated ID of the approval rule template.
    */
  var approvalRuleTemplateId: js.UndefOr[ApprovalRuleTemplateId] = js.undefined
  
  /**
    * The name of the approval rule template.
    */
  var approvalRuleTemplateName: js.UndefOr[ApprovalRuleTemplateName] = js.undefined
  
  /**
    * The date the approval rule template was created, in timestamp format.
    */
  var creationDate: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The date the approval rule template was most recently changed, in timestamp format.
    */
  var lastModifiedDate: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the user who made the most recent changes to the approval rule template.
    */
  var lastModifiedUser: js.UndefOr[Arn] = js.undefined
  
  /**
    * The SHA-256 hash signature for the content of the approval rule template.
    */
  var ruleContentSha256: js.UndefOr[RuleContentSha256] = js.undefined
}
object ApprovalRuleTemplate {
  
  inline def apply(): ApprovalRuleTemplate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ApprovalRuleTemplate]
  }
  
  extension [Self <: ApprovalRuleTemplate](x: Self) {
    
    inline def setApprovalRuleTemplateContent(value: ApprovalRuleTemplateContent): Self = StObject.set(x, "approvalRuleTemplateContent", value.asInstanceOf[js.Any])
    
    inline def setApprovalRuleTemplateContentUndefined: Self = StObject.set(x, "approvalRuleTemplateContent", js.undefined)
    
    inline def setApprovalRuleTemplateDescription(value: ApprovalRuleTemplateDescription): Self = StObject.set(x, "approvalRuleTemplateDescription", value.asInstanceOf[js.Any])
    
    inline def setApprovalRuleTemplateDescriptionUndefined: Self = StObject.set(x, "approvalRuleTemplateDescription", js.undefined)
    
    inline def setApprovalRuleTemplateId(value: ApprovalRuleTemplateId): Self = StObject.set(x, "approvalRuleTemplateId", value.asInstanceOf[js.Any])
    
    inline def setApprovalRuleTemplateIdUndefined: Self = StObject.set(x, "approvalRuleTemplateId", js.undefined)
    
    inline def setApprovalRuleTemplateName(value: ApprovalRuleTemplateName): Self = StObject.set(x, "approvalRuleTemplateName", value.asInstanceOf[js.Any])
    
    inline def setApprovalRuleTemplateNameUndefined: Self = StObject.set(x, "approvalRuleTemplateName", js.undefined)
    
    inline def setCreationDate(value: js.Date): Self = StObject.set(x, "creationDate", value.asInstanceOf[js.Any])
    
    inline def setCreationDateUndefined: Self = StObject.set(x, "creationDate", js.undefined)
    
    inline def setLastModifiedDate(value: js.Date): Self = StObject.set(x, "lastModifiedDate", value.asInstanceOf[js.Any])
    
    inline def setLastModifiedDateUndefined: Self = StObject.set(x, "lastModifiedDate", js.undefined)
    
    inline def setLastModifiedUser(value: Arn): Self = StObject.set(x, "lastModifiedUser", value.asInstanceOf[js.Any])
    
    inline def setLastModifiedUserUndefined: Self = StObject.set(x, "lastModifiedUser", js.undefined)
    
    inline def setRuleContentSha256(value: RuleContentSha256): Self = StObject.set(x, "ruleContentSha256", value.asInstanceOf[js.Any])
    
    inline def setRuleContentSha256Undefined: Self = StObject.set(x, "ruleContentSha256", js.undefined)
  }
}
