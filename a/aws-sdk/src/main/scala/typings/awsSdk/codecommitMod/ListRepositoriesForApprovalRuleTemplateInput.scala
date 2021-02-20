package typings.awsSdk.codecommitMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListRepositoriesForApprovalRuleTemplateInput extends StObject {
  
  /**
    * The name of the approval rule template for which you want to list repositories that are associated with that template.
    */
  var approvalRuleTemplateName: ApprovalRuleTemplateName = js.native
  
  /**
    * A non-zero, non-negative integer used to limit the number of returned results.
    */
  var maxResults: js.UndefOr[MaxResults] = js.native
  
  /**
    * An enumeration token that, when provided in a request, returns the next batch of the results.
    */
  var nextToken: js.UndefOr[NextToken] = js.native
}
object ListRepositoriesForApprovalRuleTemplateInput {
  
  @scala.inline
  def apply(approvalRuleTemplateName: ApprovalRuleTemplateName): ListRepositoriesForApprovalRuleTemplateInput = {
    val __obj = js.Dynamic.literal(approvalRuleTemplateName = approvalRuleTemplateName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListRepositoriesForApprovalRuleTemplateInput]
  }
  
  @scala.inline
  implicit class ListRepositoriesForApprovalRuleTemplateInputMutableBuilder[Self <: ListRepositoriesForApprovalRuleTemplateInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApprovalRuleTemplateName(value: ApprovalRuleTemplateName): Self = StObject.set(x, "approvalRuleTemplateName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResults(value: MaxResults): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
