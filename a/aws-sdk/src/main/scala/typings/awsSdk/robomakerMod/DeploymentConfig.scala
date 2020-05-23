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
  def apply(
    concurrentDeploymentPercentage: js.UndefOr[Percentage] = js.undefined,
    downloadConditionFile: S3Object = null,
    failureThresholdPercentage: js.UndefOr[Percentage] = js.undefined,
    robotDeploymentTimeoutInSeconds: js.UndefOr[DeploymentTimeout] = js.undefined
  ): DeploymentConfig = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(concurrentDeploymentPercentage)) __obj.updateDynamic("concurrentDeploymentPercentage")(concurrentDeploymentPercentage.get.asInstanceOf[js.Any])
    if (downloadConditionFile != null) __obj.updateDynamic("downloadConditionFile")(downloadConditionFile.asInstanceOf[js.Any])
    if (!js.isUndefined(failureThresholdPercentage)) __obj.updateDynamic("failureThresholdPercentage")(failureThresholdPercentage.get.asInstanceOf[js.Any])
    if (!js.isUndefined(robotDeploymentTimeoutInSeconds)) __obj.updateDynamic("robotDeploymentTimeoutInSeconds")(robotDeploymentTimeoutInSeconds.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeploymentConfig]
  }
}

