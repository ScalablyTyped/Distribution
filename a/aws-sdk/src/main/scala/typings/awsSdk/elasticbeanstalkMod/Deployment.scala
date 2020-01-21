package typings.awsSdk.elasticbeanstalkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Deployment extends js.Object {
  /**
    * The ID of the deployment. This number increases by one each time that you deploy source code or change instance configuration settings.
    */
  var DeploymentId: js.UndefOr[NullableLong] = js.native
  /**
    * For in-progress deployments, the time that the deployment started. For completed deployments, the time that the deployment ended.
    */
  var DeploymentTime: js.UndefOr[DeploymentTimestamp] = js.native
  /**
    * The status of the deployment:    In Progress : The deployment is in progress.    Deployed : The deployment succeeded.    Failed : The deployment failed.  
    */
  var Status: js.UndefOr[String] = js.native
  /**
    * The version label of the application version in the deployment.
    */
  var VersionLabel: js.UndefOr[String] = js.native
}

object Deployment {
  @scala.inline
  def apply(
    DeploymentId: Int | Double = null,
    DeploymentTime: DeploymentTimestamp = null,
    Status: String = null,
    VersionLabel: String = null
  ): Deployment = {
    val __obj = js.Dynamic.literal()
    if (DeploymentId != null) __obj.updateDynamic("DeploymentId")(DeploymentId.asInstanceOf[js.Any])
    if (DeploymentTime != null) __obj.updateDynamic("DeploymentTime")(DeploymentTime.asInstanceOf[js.Any])
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    if (VersionLabel != null) __obj.updateDynamic("VersionLabel")(VersionLabel.asInstanceOf[js.Any])
    __obj.asInstanceOf[Deployment]
  }
}

