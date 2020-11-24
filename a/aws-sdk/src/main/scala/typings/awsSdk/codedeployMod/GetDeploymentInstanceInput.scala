package typings.awsSdk.codedeployMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetDeploymentInstanceInput extends js.Object {
  
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
  implicit class GetDeploymentInstanceInputOps[Self <: GetDeploymentInstanceInput] (val x: Self) extends AnyVal {
    
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
    def setDeploymentId(value: DeploymentId): Self = this.set("deploymentId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceId(value: InstanceId): Self = this.set("instanceId", value.asInstanceOf[js.Any])
  }
}
