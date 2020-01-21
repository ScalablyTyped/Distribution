package typings.awsSdk.codedeployMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetDeploymentConfigOutput extends js.Object {
  /**
    * Information about the deployment configuration.
    */
  var deploymentConfigInfo: js.UndefOr[DeploymentConfigInfo] = js.native
}

object GetDeploymentConfigOutput {
  @scala.inline
  def apply(deploymentConfigInfo: DeploymentConfigInfo = null): GetDeploymentConfigOutput = {
    val __obj = js.Dynamic.literal()
    if (deploymentConfigInfo != null) __obj.updateDynamic("deploymentConfigInfo")(deploymentConfigInfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetDeploymentConfigOutput]
  }
}

