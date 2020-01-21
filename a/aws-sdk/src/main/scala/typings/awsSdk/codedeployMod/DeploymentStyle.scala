package typings.awsSdk.codedeployMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeploymentStyle extends js.Object {
  /**
    * Indicates whether to route deployment traffic behind a load balancer.
    */
  var deploymentOption: js.UndefOr[DeploymentOption] = js.native
  /**
    * Indicates whether to run an in-place deployment or a blue/green deployment.
    */
  var deploymentType: js.UndefOr[DeploymentType] = js.native
}

object DeploymentStyle {
  @scala.inline
  def apply(deploymentOption: DeploymentOption = null, deploymentType: DeploymentType = null): DeploymentStyle = {
    val __obj = js.Dynamic.literal()
    if (deploymentOption != null) __obj.updateDynamic("deploymentOption")(deploymentOption.asInstanceOf[js.Any])
    if (deploymentType != null) __obj.updateDynamic("deploymentType")(deploymentType.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeploymentStyle]
  }
}

