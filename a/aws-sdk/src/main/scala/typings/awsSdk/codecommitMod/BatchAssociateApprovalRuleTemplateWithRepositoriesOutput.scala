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
  @scala.inline
  implicit class BatchAssociateApprovalRuleTemplateWithRepositoriesOutputOps[Self <: BatchAssociateApprovalRuleTemplateWithRepositoriesOutput] (val x: Self) extends AnyVal {
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
    def setAssociatedRepositoryNamesVarargs(value: RepositoryName*): Self = this.set("associatedRepositoryNames", js.Array(value :_*))
    @scala.inline
    def setAssociatedRepositoryNames(value: RepositoryNameList): Self = this.set("associatedRepositoryNames", value.asInstanceOf[js.Any])
    @scala.inline
    def setErrorsVarargs(value: BatchAssociateApprovalRuleTemplateWithRepositoriesError*): Self = this.set("errors", js.Array(value :_*))
    @scala.inline
    def setErrors(value: BatchAssociateApprovalRuleTemplateWithRepositoriesErrorsList): Self = this.set("errors", value.asInstanceOf[js.Any])
  }
  
}

