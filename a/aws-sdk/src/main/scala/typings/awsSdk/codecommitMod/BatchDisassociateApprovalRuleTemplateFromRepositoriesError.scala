package typings.awsSdk.codecommitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BatchDisassociateApprovalRuleTemplateFromRepositoriesError extends js.Object {
  
  /**
    * An error code that specifies whether the repository name was not valid or not found.
    */
  var errorCode: js.UndefOr[ErrorCode] = js.native
  
  /**
    * An error message that provides details about why the repository name was either not found or not valid.
    */
  var errorMessage: js.UndefOr[ErrorMessage] = js.native
  
  /**
    * The name of the repository where the association with the template was not able to be removed.
    */
  var repositoryName: js.UndefOr[RepositoryName] = js.native
}
object BatchDisassociateApprovalRuleTemplateFromRepositoriesError {
  
  @scala.inline
  def apply(): BatchDisassociateApprovalRuleTemplateFromRepositoriesError = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchDisassociateApprovalRuleTemplateFromRepositoriesError]
  }
  
  @scala.inline
  implicit class BatchDisassociateApprovalRuleTemplateFromRepositoriesErrorOps[Self <: BatchDisassociateApprovalRuleTemplateFromRepositoriesError] (val x: Self) extends AnyVal {
    
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
    def setErrorCode(value: ErrorCode): Self = this.set("errorCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteErrorCode: Self = this.set("errorCode", js.undefined)
    
    @scala.inline
    def setErrorMessage(value: ErrorMessage): Self = this.set("errorMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteErrorMessage: Self = this.set("errorMessage", js.undefined)
    
    @scala.inline
    def setRepositoryName(value: RepositoryName): Self = this.set("repositoryName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRepositoryName: Self = this.set("repositoryName", js.undefined)
  }
}
