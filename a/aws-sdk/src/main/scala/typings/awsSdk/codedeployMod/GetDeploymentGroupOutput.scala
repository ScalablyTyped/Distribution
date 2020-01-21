package typings.awsSdk.codedeployMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetDeploymentGroupOutput extends js.Object {
  /**
    * Information about the deployment group.
    */
  var deploymentGroupInfo: js.UndefOr[DeploymentGroupInfo] = js.native
}

object GetDeploymentGroupOutput {
  @scala.inline
  def apply(deploymentGroupInfo: DeploymentGroupInfo = null): GetDeploymentGroupOutput = {
    val __obj = js.Dynamic.literal()
    if (deploymentGroupInfo != null) __obj.updateDynamic("deploymentGroupInfo")(deploymentGroupInfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetDeploymentGroupOutput]
  }
}

