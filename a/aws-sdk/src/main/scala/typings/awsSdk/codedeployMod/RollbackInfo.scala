package typings.awsSdk.codedeployMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RollbackInfo extends StObject {
  
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
  implicit class RollbackInfoMutableBuilder[Self <: RollbackInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRollbackDeploymentId(value: DeploymentId): Self = StObject.set(x, "rollbackDeploymentId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRollbackDeploymentIdUndefined: Self = StObject.set(x, "rollbackDeploymentId", js.undefined)
    
    @scala.inline
    def setRollbackMessage(value: Description): Self = StObject.set(x, "rollbackMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRollbackMessageUndefined: Self = StObject.set(x, "rollbackMessage", js.undefined)
    
    @scala.inline
    def setRollbackTriggeringDeploymentId(value: DeploymentId): Self = StObject.set(x, "rollbackTriggeringDeploymentId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRollbackTriggeringDeploymentIdUndefined: Self = StObject.set(x, "rollbackTriggeringDeploymentId", js.undefined)
  }
}
