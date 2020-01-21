package typings.awsSdk.codedeployMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LastDeploymentInfo extends js.Object {
  /**
    * A timestamp that indicates when the most recent deployment to the deployment group started.
    */
  var createTime: js.UndefOr[Timestamp] = js.native
  /**
    *  The unique ID of a deployment. 
    */
  var deploymentId: js.UndefOr[DeploymentId] = js.native
  /**
    * A timestamp that indicates when the most recent deployment to the deployment group was complete.
    */
  var endTime: js.UndefOr[Timestamp] = js.native
  /**
    * The status of the most recent deployment.
    */
  var status: js.UndefOr[DeploymentStatus] = js.native
}

object LastDeploymentInfo {
  @scala.inline
  def apply(
    createTime: Timestamp = null,
    deploymentId: DeploymentId = null,
    endTime: Timestamp = null,
    status: DeploymentStatus = null
  ): LastDeploymentInfo = {
    val __obj = js.Dynamic.literal()
    if (createTime != null) __obj.updateDynamic("createTime")(createTime.asInstanceOf[js.Any])
    if (deploymentId != null) __obj.updateDynamic("deploymentId")(deploymentId.asInstanceOf[js.Any])
    if (endTime != null) __obj.updateDynamic("endTime")(endTime.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    __obj.asInstanceOf[LastDeploymentInfo]
  }
}

