package typings.awsSdk.greengrassMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BulkDeploymentResult extends StObject {
  
  /**
    * The time, in ISO format, when the deployment was created.
    */
  var CreatedAt: js.UndefOr[string] = js.native
  
  /**
    * The ARN of the group deployment.
    */
  var DeploymentArn: js.UndefOr[string] = js.native
  
  /**
    * The ID of the group deployment.
    */
  var DeploymentId: js.UndefOr[string] = js.native
  
  /**
    * The current status of the group deployment: ''InProgress'', ''Building'', ''Success'', or ''Failure''.
    */
  var DeploymentStatus: js.UndefOr[string] = js.native
  
  /**
    * The type of the deployment.
    */
  var DeploymentType: js.UndefOr[typings.awsSdk.greengrassMod.DeploymentType] = js.native
  
  /**
    * Details about the error.
    */
  var ErrorDetails: js.UndefOr[typings.awsSdk.greengrassMod.ErrorDetails] = js.native
  
  /**
    * The error message for a failed deployment
    */
  var ErrorMessage: js.UndefOr[string] = js.native
  
  /**
    * The ARN of the Greengrass group.
    */
  var GroupArn: js.UndefOr[string] = js.native
}
object BulkDeploymentResult {
  
  @scala.inline
  def apply(): BulkDeploymentResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BulkDeploymentResult]
  }
  
  @scala.inline
  implicit class BulkDeploymentResultMutableBuilder[Self <: BulkDeploymentResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreatedAt(value: string): Self = StObject.set(x, "CreatedAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedAtUndefined: Self = StObject.set(x, "CreatedAt", js.undefined)
    
    @scala.inline
    def setDeploymentArn(value: string): Self = StObject.set(x, "DeploymentArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeploymentArnUndefined: Self = StObject.set(x, "DeploymentArn", js.undefined)
    
    @scala.inline
    def setDeploymentId(value: string): Self = StObject.set(x, "DeploymentId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeploymentIdUndefined: Self = StObject.set(x, "DeploymentId", js.undefined)
    
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
    def setGroupArn(value: string): Self = StObject.set(x, "GroupArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupArnUndefined: Self = StObject.set(x, "GroupArn", js.undefined)
  }
}
