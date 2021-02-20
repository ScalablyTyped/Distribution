package typings.awsSdk.codecommitMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ApprovalRuleTemplate extends StObject {
  
  /**
    * The content of the approval rule template.
    */
  var approvalRuleTemplateContent: js.UndefOr[ApprovalRuleTemplateContent] = js.native
  
  /**
    * The description of the approval rule template.
    */
  var approvalRuleTemplateDescription: js.UndefOr[ApprovalRuleTemplateDescription] = js.native
  
  /**
    * The system-generated ID of the approval rule template.
    */
  var approvalRuleTemplateId: js.UndefOr[ApprovalRuleTemplateId] = js.native
  
  /**
    * The name of the approval rule template.
    */
  var approvalRuleTemplateName: js.UndefOr[ApprovalRuleTemplateName] = js.native
  
  /**
    * The date the approval rule template was created, in timestamp format.
    */
  var creationDate: js.UndefOr[CreationDate] = js.native
  
  /**
    * The date the approval rule template was most recently changed, in timestamp format.
    */
  var lastModifiedDate: js.UndefOr[LastModifiedDate] = js.native
  
  /**
    * The Amazon Resource Name (ARN) of the user who made the most recent changes to the approval rule template.
    */
  var lastModifiedUser: js.UndefOr[Arn] = js.native
  
  /**
    * The SHA-256 hash signature for the content of the approval rule template.
    */
  var ruleContentSha256: js.UndefOr[RuleContentSha256] = js.native
}
object ApprovalRuleTemplate {
  
  @scala.inline
  def apply(): ApprovalRuleTemplate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ApprovalRuleTemplate]
  }
  
  @scala.inline
  implicit class ApprovalRuleTemplateMutableBuilder[Self <: ApprovalRuleTemplate] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApprovalRuleTemplateContent(value: ApprovalRuleTemplateContent): Self = StObject.set(x, "approvalRuleTemplateContent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApprovalRuleTemplateContentUndefined: Self = StObject.set(x, "approvalRuleTemplateContent", js.undefined)
    
    @scala.inline
    def setApprovalRuleTemplateDescription(value: ApprovalRuleTemplateDescription): Self = StObject.set(x, "approvalRuleTemplateDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApprovalRuleTemplateDescriptionUndefined: Self = StObject.set(x, "approvalRuleTemplateDescription", js.undefined)
    
    @scala.inline
    def setApprovalRuleTemplateId(value: ApprovalRuleTemplateId): Self = StObject.set(x, "approvalRuleTemplateId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApprovalRuleTemplateIdUndefined: Self = StObject.set(x, "approvalRuleTemplateId", js.undefined)
    
    @scala.inline
    def setApprovalRuleTemplateName(value: ApprovalRuleTemplateName): Self = StObject.set(x, "approvalRuleTemplateName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApprovalRuleTemplateNameUndefined: Self = StObject.set(x, "approvalRuleTemplateName", js.undefined)
    
    @scala.inline
    def setCreationDate(value: CreationDate): Self = StObject.set(x, "creationDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreationDateUndefined: Self = StObject.set(x, "creationDate", js.undefined)
    
    @scala.inline
    def setLastModifiedDate(value: LastModifiedDate): Self = StObject.set(x, "lastModifiedDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastModifiedDateUndefined: Self = StObject.set(x, "lastModifiedDate", js.undefined)
    
    @scala.inline
    def setLastModifiedUser(value: Arn): Self = StObject.set(x, "lastModifiedUser", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastModifiedUserUndefined: Self = StObject.set(x, "lastModifiedUser", js.undefined)
    
    @scala.inline
    def setRuleContentSha256(value: RuleContentSha256): Self = StObject.set(x, "ruleContentSha256", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRuleContentSha256Undefined: Self = StObject.set(x, "ruleContentSha256", js.undefined)
  }
}
