package typings.awsSdk.greengrassMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetDeploymentStatusResponse extends StObject {
  
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
  implicit class GetDeploymentStatusResponseMutableBuilder[Self <: GetDeploymentStatusResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeploymentStatus(value: string): Self = StObject.set(x, "DeploymentStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeploymentStatusUndefined: Self = StObject.set(x, "DeploymentStatus", js.undefined)
    
    @scala.inline
    def setDeploymentType(value: DeploymentType): Self = StObject.set(x, "DeploymentType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeploymentTypeUndefined: Self = StObject.set(x, "DeploymentType", js.undefined)
    
    @scala.inline
    def setErrorDetails(value: ErrorDetails): Self = StObject.set(x, "ErrorDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorDetailsUndefined: Self = StObject.set(x, "ErrorDetails", js.undefined)
    
    @scala.inline
    def setErrorDetailsVarargs(value: ErrorDetail*): Self = StObject.set(x, "ErrorDetails", js.Array(value :_*))
    
    @scala.inline
    def setErrorMessage(value: string): Self = StObject.set(x, "ErrorMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorMessageUndefined: Self = StObject.set(x, "ErrorMessage", js.undefined)
    
    @scala.inline
    def setUpdatedAt(value: string): Self = StObject.set(x, "UpdatedAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdatedAtUndefined: Self = StObject.set(x, "UpdatedAt", js.undefined)
  }
}
