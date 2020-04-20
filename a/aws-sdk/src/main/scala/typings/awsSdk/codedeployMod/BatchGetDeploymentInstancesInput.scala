package typings.awsSdk.codedeployMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BatchGetDeploymentInstancesInput extends js.Object {
  /**
    *  The unique ID of a deployment. 
    */
  var deploymentId: DeploymentId = js.native
  /**
    * The unique IDs of instances used in the deployment. The maximum number of instance IDs you can specify is 25.
    */
  var instanceIds: InstancesList = js.native
}

object BatchGetDeploymentInstancesInput {
  @scala.inline
  def apply(deploymentId: DeploymentId, instanceIds: InstancesList): BatchGetDeploymentInstancesInput = {
    val __obj = js.Dynamic.literal(deploymentId = deploymentId.asInstanceOf[js.Any], instanceIds = instanceIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchGetDeploymentInstancesInput]
  }
}

