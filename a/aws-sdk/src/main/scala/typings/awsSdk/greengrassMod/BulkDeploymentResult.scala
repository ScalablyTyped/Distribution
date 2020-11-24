package typings.awsSdk.greengrassMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BulkDeploymentResult extends js.Object {
  
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
  implicit class BulkDeploymentResultOps[Self <: BulkDeploymentResult] (val x: Self) extends AnyVal {
    
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
    def setCreatedAt(value: string): Self = this.set("CreatedAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreatedAt: Self = this.set("CreatedAt", js.undefined)
    
    @scala.inline
    def setDeploymentArn(value: string): Self = this.set("DeploymentArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeploymentArn: Self = this.set("DeploymentArn", js.undefined)
    
    @scala.inline
    def setDeploymentId(value: string): Self = this.set("DeploymentId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeploymentId: Self = this.set("DeploymentId", js.undefined)
    
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
    def setGroupArn(value: string): Self = this.set("GroupArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGroupArn: Self = this.set("GroupArn", js.undefined)
  }
}
