package typings.awsSdk.codecommitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BatchDisassociateApprovalRuleTemplateFromRepositoriesOutput extends js.Object {
  /**
    * A list of repository names that have had their association with the template removed.
    */
  var disassociatedRepositoryNames: RepositoryNameList = js.native
  /**
    * A list of any errors that might have occurred while attempting to remove the association between the template and the repositories.
    */
  var errors: BatchDisassociateApprovalRuleTemplateFromRepositoriesErrorsList = js.native
}

object BatchDisassociateApprovalRuleTemplateFromRepositoriesOutput {
  @scala.inline
  def apply(
    disassociatedRepositoryNames: RepositoryNameList,
    errors: BatchDisassociateApprovalRuleTemplateFromRepositoriesErrorsList
  ): BatchDisassociateApprovalRuleTemplateFromRepositoriesOutput = {
    val __obj = js.Dynamic.literal(disassociatedRepositoryNames = disassociatedRepositoryNames.asInstanceOf[js.Any], errors = errors.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[BatchDisassociateApprovalRuleTemplateFromRepositoriesOutput]
  }
}

