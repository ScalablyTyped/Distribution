package typings.awsSdk.codedeployMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StopDeploymentInput extends StObject {
  
  /**
    *  Indicates, when a deployment is stopped, whether instances that have been updated should be rolled back to the previous version of the application revision. 
    */
  var autoRollbackEnabled: js.UndefOr[NullableBoolean] = js.undefined
  
  /**
    *  The unique ID of a deployment. 
    */
  var deploymentId: DeploymentId
}
object StopDeploymentInput {
  
  @scala.inline
  def apply(deploymentId: DeploymentId): StopDeploymentInput = {
    val __obj = js.Dynamic.literal(deploymentId = deploymentId.asInstanceOf[js.Any])
    __obj.asInstanceOf[StopDeploymentInput]
  }
  
  @scala.inline
  implicit class StopDeploymentInputMutableBuilder[Self <: StopDeploymentInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAutoRollbackEnabled(value: NullableBoolean): Self = StObject.set(x, "autoRollbackEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoRollbackEnabledUndefined: Self = StObject.set(x, "autoRollbackEnabled", js.undefined)
    
    @scala.inline
    def setDeploymentId(value: DeploymentId): Self = StObject.set(x, "deploymentId", value.asInstanceOf[js.Any])
  }
}
