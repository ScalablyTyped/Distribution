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
}

