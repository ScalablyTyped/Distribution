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
  def apply(): Deployment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Deployment]
  }
  @scala.inline
  implicit class DeploymentOps[Self <: Deployment] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDeploymentId(value: NullableLong): Self = this.set("DeploymentId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeploymentId: Self = this.set("DeploymentId", js.undefined)
    @scala.inline
    def setDeploymentTime(value: DeploymentTimestamp): Self = this.set("DeploymentTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeploymentTime: Self = this.set("DeploymentTime", js.undefined)
    @scala.inline
    def setStatus(value: String): Self = this.set("Status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("Status", js.undefined)
    @scala.inline
    def setVersionLabel(value: String): Self = this.set("VersionLabel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVersionLabel: Self = this.set("VersionLabel", js.undefined)
  }
  
}

