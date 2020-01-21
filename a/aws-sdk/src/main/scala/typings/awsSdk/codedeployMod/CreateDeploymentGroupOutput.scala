package typings.awsSdk.codedeployMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateDeploymentGroupOutput extends js.Object {
  /**
    * A unique deployment group ID.
    */
  var deploymentGroupId: js.UndefOr[DeploymentGroupId] = js.native
}

object CreateDeploymentGroupOutput {
  @scala.inline
  def apply(deploymentGroupId: DeploymentGroupId = null): CreateDeploymentGroupOutput = {
    val __obj = js.Dynamic.literal()
    if (deploymentGroupId != null) __obj.updateDynamic("deploymentGroupId")(deploymentGroupId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateDeploymentGroupOutput]
  }
}

