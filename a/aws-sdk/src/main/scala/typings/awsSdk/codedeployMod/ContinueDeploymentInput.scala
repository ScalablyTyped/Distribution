package typings.awsSdk.codedeployMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContinueDeploymentInput extends StObject {
  
  /**
    *  The unique ID of a blue/green deployment for which you want to start rerouting traffic to the replacement environment. 
    */
  var deploymentId: js.UndefOr[DeploymentId] = js.undefined
  
  /**
    *  The status of the deployment's waiting period. READY_WAIT indicates that the deployment is ready to start shifting traffic. TERMINATION_WAIT indicates that the traffic is shifted, but the original target is not terminated. 
    */
  var deploymentWaitType: js.UndefOr[DeploymentWaitType] = js.undefined
}
object ContinueDeploymentInput {
  
  @scala.inline
  def apply(): ContinueDeploymentInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContinueDeploymentInput]
  }
  
  @scala.inline
  implicit class ContinueDeploymentInputMutableBuilder[Self <: ContinueDeploymentInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeploymentId(value: DeploymentId): Self = StObject.set(x, "deploymentId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeploymentIdUndefined: Self = StObject.set(x, "deploymentId", js.undefined)
    
    @scala.inline
    def setDeploymentWaitType(value: DeploymentWaitType): Self = StObject.set(x, "deploymentWaitType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeploymentWaitTypeUndefined: Self = StObject.set(x, "deploymentWaitType", js.undefined)
  }
}
