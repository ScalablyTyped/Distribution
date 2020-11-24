package typings.awsSdk.codedeployMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ContinueDeploymentInput extends js.Object {
  
  /**
    *  The unique ID of a blue/green deployment for which you want to start rerouting traffic to the replacement environment. 
    */
  var deploymentId: js.UndefOr[DeploymentId] = js.native
  
  /**
    *  The status of the deployment's waiting period. READY_WAIT indicates that the deployment is ready to start shifting traffic. TERMINATION_WAIT indicates that the traffic is shifted, but the original target is not terminated. 
    */
  var deploymentWaitType: js.UndefOr[DeploymentWaitType] = js.native
}
object ContinueDeploymentInput {
  
  @scala.inline
  def apply(): ContinueDeploymentInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContinueDeploymentInput]
  }
  
  @scala.inline
  implicit class ContinueDeploymentInputOps[Self <: ContinueDeploymentInput] (val x: Self) extends AnyVal {
    
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
    def deleteDeploymentId: Self = this.set("deploymentId", js.undefined)
    
    @scala.inline
    def setDeploymentWaitType(value: DeploymentWaitType): Self = this.set("deploymentWaitType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeploymentWaitType: Self = this.set("deploymentWaitType", js.undefined)
  }
}
