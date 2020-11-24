package typings.awsSdk.codedeployMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RollbackInfo extends js.Object {
  
  /**
    * The ID of the deployment rollback.
    */
  var rollbackDeploymentId: js.UndefOr[DeploymentId] = js.native
  
  /**
    * Information that describes the status of a deployment rollback (for example, whether the deployment can't be rolled back, is in progress, failed, or succeeded). 
    */
  var rollbackMessage: js.UndefOr[Description] = js.native
  
  /**
    * The deployment ID of the deployment that was underway and triggered a rollback deployment because it failed or was stopped.
    */
  var rollbackTriggeringDeploymentId: js.UndefOr[DeploymentId] = js.native
}
object RollbackInfo {
  
  @scala.inline
  def apply(): RollbackInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RollbackInfo]
  }
  
  @scala.inline
  implicit class RollbackInfoOps[Self <: RollbackInfo] (val x: Self) extends AnyVal {
    
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
    def setRollbackDeploymentId(value: DeploymentId): Self = this.set("rollbackDeploymentId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRollbackDeploymentId: Self = this.set("rollbackDeploymentId", js.undefined)
    
    @scala.inline
    def setRollbackMessage(value: Description): Self = this.set("rollbackMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRollbackMessage: Self = this.set("rollbackMessage", js.undefined)
    
    @scala.inline
    def setRollbackTriggeringDeploymentId(value: DeploymentId): Self = this.set("rollbackTriggeringDeploymentId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRollbackTriggeringDeploymentId: Self = this.set("rollbackTriggeringDeploymentId", js.undefined)
  }
}
