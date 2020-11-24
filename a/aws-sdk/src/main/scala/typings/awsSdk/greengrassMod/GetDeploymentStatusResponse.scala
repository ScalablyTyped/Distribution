package typings.awsSdk.greengrassMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetDeploymentStatusResponse extends js.Object {
  
  /**
    * The status of the deployment: ''InProgress'', ''Building'', ''Success'', or ''Failure''.
    */
  var DeploymentStatus: js.UndefOr[string] = js.native
  
  /**
    * The type of the deployment.
    */
  var DeploymentType: js.UndefOr[typings.awsSdk.greengrassMod.DeploymentType] = js.native
  
  /**
    * Error details
    */
  var ErrorDetails: js.UndefOr[typings.awsSdk.greengrassMod.ErrorDetails] = js.native
  
  /**
    * Error message
    */
  var ErrorMessage: js.UndefOr[string] = js.native
  
  /**
    * The time, in milliseconds since the epoch, when the deployment status was updated.
    */
  var UpdatedAt: js.UndefOr[string] = js.native
}
object GetDeploymentStatusResponse {
  
  @scala.inline
  def apply(): GetDeploymentStatusResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetDeploymentStatusResponse]
  }
  
  @scala.inline
  implicit class GetDeploymentStatusResponseOps[Self <: GetDeploymentStatusResponse] (val x: Self) extends AnyVal {
    
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
    def setDeploymentStatus(value: string): Self = this.set("DeploymentStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeploymentStatus: Self = this.set("DeploymentStatus", js.undefined)
    
    @scala.inline
    def setDeploymentType(value: DeploymentType): Self = this.set("DeploymentType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeploymentType: Self = this.set("DeploymentType", js.undefined)
    
    @scala.inline
    def setErrorDetailsVarargs(value: ErrorDetail*): Self = this.set("ErrorDetails", js.Array(value :_*))
    
    @scala.inline
    def setErrorDetails(value: ErrorDetails): Self = this.set("ErrorDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteErrorDetails: Self = this.set("ErrorDetails", js.undefined)
    
    @scala.inline
    def setErrorMessage(value: string): Self = this.set("ErrorMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteErrorMessage: Self = this.set("ErrorMessage", js.undefined)
    
    @scala.inline
    def setUpdatedAt(value: string): Self = this.set("UpdatedAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUpdatedAt: Self = this.set("UpdatedAt", js.undefined)
  }
}
