package typings.awsSdk.codecommitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListAssociatedApprovalRuleTemplatesForRepositoryOutput extends js.Object {
  
  /**
    * The names of all approval rule templates associated with the repository.
    */
  var approvalRuleTemplateNames: js.UndefOr[ApprovalRuleTemplateNameList] = js.native
  
  /**
    * An enumeration token that allows the operation to batch the next results of the operation.
    */
  var nextToken: js.UndefOr[NextToken] = js.native
}
object ListAssociatedApprovalRuleTemplatesForRepositoryOutput {
  
  @scala.inline
  def apply(): ListAssociatedApprovalRuleTemplatesForRepositoryOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListAssociatedApprovalRuleTemplatesForRepositoryOutput]
  }
  
  @scala.inline
  implicit class ListAssociatedApprovalRuleTemplatesForRepositoryOutputOps[Self <: ListAssociatedApprovalRuleTemplatesForRepositoryOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setApprovalRuleTemplateNamesVarargs(value: ApprovalRuleTemplateName*): Self = this.set("approvalRuleTemplateNames", js.Array(value :_*))
    
    @scala.inline
    def setApprovalRuleTemplateNames(value: ApprovalRuleTemplateNameList): Self = this.set("approvalRuleTemplateNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteApprovalRuleTemplateNames: Self = this.set("approvalRuleTemplateNames", js.undefined)
    
    @scala.inline
    def setNextToken(value: NextToken): Self = this.set("nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("nextToken", js.undefined)
  }
}
