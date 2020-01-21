package typings.awsSdk.codecommitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BatchAssociateApprovalRuleTemplateWithRepositoriesInput extends js.Object {
  /**
    * The name of the template you want to associate with one or more repositories.
    */
  var approvalRuleTemplateName: ApprovalRuleTemplateName = js.native
  /**
    * The names of the repositories you want to associate with the template.  The length constraint limit is for each string in the array. The array itself can be empty. 
    */
  var repositoryNames: RepositoryNameList = js.native
}

object BatchAssociateApprovalRuleTemplateWithRepositoriesInput {
  @scala.inline
  def apply(approvalRuleTemplateName: ApprovalRuleTemplateName, repositoryNames: RepositoryNameList): BatchAssociateApprovalRuleTemplateWithRepositoriesInput = {
    val __obj = js.Dynamic.literal(approvalRuleTemplateName = approvalRuleTemplateName.asInstanceOf[js.Any], repositoryNames = repositoryNames.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[BatchAssociateApprovalRuleTemplateWithRepositoriesInput]
  }
}

