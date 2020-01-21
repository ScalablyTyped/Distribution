package typings.awsSdk.codedeployMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateDeploymentConfigOutput extends js.Object {
  /**
    * A unique deployment configuration ID.
    */
  var deploymentConfigId: js.UndefOr[DeploymentConfigId] = js.native
}

object CreateDeploymentConfigOutput {
  @scala.inline
  def apply(deploymentConfigId: DeploymentConfigId = null): CreateDeploymentConfigOutput = {
    val __obj = js.Dynamic.literal()
    if (deploymentConfigId != null) __obj.updateDynamic("deploymentConfigId")(deploymentConfigId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateDeploymentConfigOutput]
  }
}

