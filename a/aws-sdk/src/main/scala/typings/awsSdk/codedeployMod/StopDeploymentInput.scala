package typings.awsSdk.codedeployMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StopDeploymentInput extends js.Object {
  /**
    *  Indicates, when a deployment is stopped, whether instances that have been updated should be rolled back to the previous version of the application revision. 
    */
  var autoRollbackEnabled: js.UndefOr[NullableBoolean] = js.native
  /**
    *  The unique ID of a deployment. 
    */
  var deploymentId: DeploymentId = js.native
}

object StopDeploymentInput {
  @scala.inline
  def apply(deploymentId: DeploymentId, autoRollbackEnabled: js.UndefOr[scala.Boolean] = js.undefined): StopDeploymentInput = {
    val __obj = js.Dynamic.literal(deploymentId = deploymentId.asInstanceOf[js.Any])
    if (!js.isUndefined(autoRollbackEnabled)) __obj.updateDynamic("autoRollbackEnabled")(autoRollbackEnabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[StopDeploymentInput]
  }
}

