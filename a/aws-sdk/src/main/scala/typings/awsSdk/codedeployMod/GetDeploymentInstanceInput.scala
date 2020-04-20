package typings.awsSdk.codedeployMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
}

