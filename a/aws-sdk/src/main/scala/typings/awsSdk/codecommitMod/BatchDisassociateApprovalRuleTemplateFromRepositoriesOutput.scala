package typings.awsSdk.codecommitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  
  @scala.inline
  implicit class BatchDisassociateApprovalRuleTemplateFromRepositoriesOutputOps[Self <: BatchDisassociateApprovalRuleTemplateFromRepositoriesOutput] (val x: Self) extends AnyVal {
    
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
    def setDisassociatedRepositoryNamesVarargs(value: RepositoryName*): Self = this.set("disassociatedRepositoryNames", js.Array(value :_*))
    
    @scala.inline
    def setDisassociatedRepositoryNames(value: RepositoryNameList): Self = this.set("disassociatedRepositoryNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorsVarargs(value: BatchDisassociateApprovalRuleTemplateFromRepositoriesError*): Self = this.set("errors", js.Array(value :_*))
    
    @scala.inline
    def setErrors(value: BatchDisassociateApprovalRuleTemplateFromRepositoriesErrorsList): Self = this.set("errors", value.asInstanceOf[js.Any])
  }
}
