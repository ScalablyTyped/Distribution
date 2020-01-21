package typings.awsSdk.codecommitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BatchAssociateApprovalRuleTemplateWithRepositoriesOutput extends js.Object {
  /**
    * A list of names of the repositories that have been associated with the template.
    */
  var associatedRepositoryNames: RepositoryNameList = js.native
  /**
    * A list of any errors that might have occurred while attempting to create the association between the template and the repositories.
    */
  var errors: BatchAssociateApprovalRuleTemplateWithRepositoriesErrorsList = js.native
}

object BatchAssociateApprovalRuleTemplateWithRepositoriesOutput {
  @scala.inline
  def apply(
    associatedRepositoryNames: RepositoryNameList,
    errors: BatchAssociateApprovalRuleTemplateWithRepositoriesErrorsList
  ): BatchAssociateApprovalRuleTemplateWithRepositoriesOutput = {
    val __obj = js.Dynamic.literal(associatedRepositoryNames = associatedRepositoryNames.asInstanceOf[js.Any], errors = errors.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[BatchAssociateApprovalRuleTemplateWithRepositoriesOutput]
  }
}

