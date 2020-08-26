package typings.awsSdk.robomakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeploymentConfig extends js.Object {
  /**
    * The percentage of robots receiving the deployment at the same time.
    */
  var concurrentDeploymentPercentage: js.UndefOr[Percentage] = js.native
  /**
    * The download condition file.
    */
  var downloadConditionFile: js.UndefOr[S3Object] = js.native
  /**
    * The percentage of deployments that need to fail before stopping deployment.
    */
  var failureThresholdPercentage: js.UndefOr[Percentage] = js.native
  /**
    * The amount of time, in seconds, to wait for deployment to a single robot to complete. Choose a time between 1 minute and 7 days. The default is 5 hours.
    */
  var robotDeploymentTimeoutInSeconds: js.UndefOr[DeploymentTimeout] = js.native
}

object DeploymentConfig {
  @scala.inline
  def apply(): DeploymentConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeploymentConfig]
  }
  @scala.inline
  implicit class DeploymentConfigOps[Self <: DeploymentConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setConcurrentDeploymentPercentage(value: Percentage): Self = this.set("concurrentDeploymentPercentage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConcurrentDeploymentPercentage: Self = this.set("concurrentDeploymentPercentage", js.undefined)
    @scala.inline
    def setDownloadConditionFile(value: S3Object): Self = this.set("downloadConditionFile", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDownloadConditionFile: Self = this.set("downloadConditionFile", js.undefined)
    @scala.inline
    def setFailureThresholdPercentage(value: Percentage): Self = this.set("failureThresholdPercentage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFailureThresholdPercentage: Self = this.set("failureThresholdPercentage", js.undefined)
    @scala.inline
    def setRobotDeploymentTimeoutInSeconds(value: DeploymentTimeout): Self = this.set("robotDeploymentTimeoutInSeconds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRobotDeploymentTimeoutInSeconds: Self = this.set("robotDeploymentTimeoutInSeconds", js.undefined)
  }
  
}

