package typings.awsSdk.codecommitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BatchDisassociateApprovalRuleTemplateFromRepositoriesInput extends js.Object {
  /**
    * The name of the template that you want to disassociate from one or more repositories.
    */
  var approvalRuleTemplateName: ApprovalRuleTemplateName = js.native
  /**
    * The repository names that you want to disassociate from the approval rule template.  The length constraint limit is for each string in the array. The array itself can be empty. 
    */
  var repositoryNames: RepositoryNameList = js.native
}

object BatchDisassociateApprovalRuleTemplateFromRepositoriesInput {
  @scala.inline
  def apply(approvalRuleTemplateName: ApprovalRuleTemplateName, repositoryNames: RepositoryNameList): BatchDisassociateApprovalRuleTemplateFromRepositoriesInput = {
    val __obj = js.Dynamic.literal(approvalRuleTemplateName = approvalRuleTemplateName.asInstanceOf[js.Any], repositoryNames = repositoryNames.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchDisassociateApprovalRuleTemplateFromRepositoriesInput]
  }
  @scala.inline
  implicit class BatchDisassociateApprovalRuleTemplateFromRepositoriesInputOps[Self <: BatchDisassociateApprovalRuleTemplateFromRepositoriesInput] (val x: Self) extends AnyVal {
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
    def setApprovalRuleTemplateName(value: ApprovalRuleTemplateName): Self = this.set("approvalRuleTemplateName", value.asInstanceOf[js.Any])
    @scala.inline
    def setRepositoryNamesVarargs(value: RepositoryName*): Self = this.set("repositoryNames", js.Array(value :_*))
    @scala.inline
    def setRepositoryNames(value: RepositoryNameList): Self = this.set("repositoryNames", value.asInstanceOf[js.Any])
  }
  
}

