package typings.awsSdk.codedeployMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetDeploymentTargetOutput extends js.Object {
  /**
    *  A deployment target that contains information about a deployment such as its status, lifecycle events, and when it was last updated. It also contains metadata about the deployment target. The deployment target metadata depends on the deployment target's type (instanceTarget, lambdaTarget, or ecsTarget). 
    */
  var deploymentTarget: js.UndefOr[DeploymentTarget] = js.native
}

object GetDeploymentTargetOutput {
  @scala.inline
  def apply(deploymentTarget: DeploymentTarget = null): GetDeploymentTargetOutput = {
    val __obj = js.Dynamic.literal()
    if (deploymentTarget != null) __obj.updateDynamic("deploymentTarget")(deploymentTarget.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetDeploymentTargetOutput]
  }
}

