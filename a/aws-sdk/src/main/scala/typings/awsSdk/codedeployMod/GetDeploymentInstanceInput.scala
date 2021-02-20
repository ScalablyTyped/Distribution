package typings.awsSdk.codedeployMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetDeploymentInstanceInput extends StObject {
  
  /**
    *  The unique ID of a deployment. 
    */
  var deploymentId: DeploymentId = js.native
  
  /**
    *  The unique ID of an instance in the deployment group. 
    */
  var instanceId: InstanceId = js.native
}
object GetDeploymentInstanceInput {
  
  @scala.inline
  def apply(deploymentId: DeploymentId, instanceId: InstanceId): GetDeploymentInstanceInput = {
    val __obj = js.Dynamic.literal(deploymentId = deploymentId.asInstanceOf[js.Any], instanceId = instanceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetDeploymentInstanceInput]
  }
  
  @scala.inline
  implicit class GetDeploymentInstanceInputMutableBuilder[Self <: GetDeploymentInstanceInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeploymentId(value: DeploymentId): Self = StObject.set(x, "deploymentId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceId(value: InstanceId): Self = StObject.set(x, "instanceId", value.asInstanceOf[js.Any])
  }
}
