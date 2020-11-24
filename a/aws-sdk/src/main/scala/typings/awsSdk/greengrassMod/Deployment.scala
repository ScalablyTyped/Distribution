package typings.awsSdk.greengrassMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Deployment extends js.Object {
  
  /**
    * The time, in milliseconds since the epoch, when the deployment was created.
    */
  var CreatedAt: js.UndefOr[string] = js.native
  
  /**
    * The ARN of the deployment.
    */
  var DeploymentArn: js.UndefOr[string] = js.native
  
  /**
    * The ID of the deployment.
    */
  var DeploymentId: js.UndefOr[string] = js.native
  
  /**
    * The type of the deployment.
    */
  var DeploymentType: js.UndefOr[typings.awsSdk.greengrassMod.DeploymentType] = js.native
  
  /**
    * The ARN of the group for this deployment.
    */
  var GroupArn: js.UndefOr[string] = js.native
}
object Deployment {
  
  @scala.inline
  def apply(): Deployment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Deployment]
  }
  
  @scala.inline
  implicit class DeploymentOps[Self <: Deployment] (val x: Self) extends AnyVal {
    
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
    def setDeploymentType(value: DeploymentType): Self = this.set("DeploymentType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeploymentType: Self = this.set("DeploymentType", js.undefined)
    
    @scala.inline
    def setGroupArn(value: string): Self = this.set("GroupArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGroupArn: Self = this.set("GroupArn", js.undefined)
  }
}
