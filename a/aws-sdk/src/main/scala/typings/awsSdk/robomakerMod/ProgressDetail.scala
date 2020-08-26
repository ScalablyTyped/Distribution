package typings.awsSdk.robomakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProgressDetail extends js.Object {
  /**
    * The current progress status.  Validating  Validating the deployment.  DownloadingExtracting  Downloading and extracting the bundle on the robot.  ExecutingPreLaunch  Executing pre-launch script(s) if provided.  Launching  Launching the robot application.  ExecutingPostLaunch  Executing post-launch script(s) if provided.  Finished  Deployment is complete.  
    */
  var currentProgress: js.UndefOr[RobotDeploymentStep] = js.native
  /**
    * Estimated amount of time in seconds remaining in the step. This currently only applies to the Downloading/Extracting step of the deployment. It is empty for other steps.
    */
  var estimatedTimeRemainingSeconds: js.UndefOr[GenericInteger] = js.native
  /**
    * Precentage of the step that is done. This currently only applies to the Downloading/Extracting step of the deployment. It is empty for other steps.
    */
  var percentDone: js.UndefOr[PercentDone] = js.native
  /**
    * The Amazon Resource Name (ARN) of the deployment job.
    */
  var targetResource: js.UndefOr[GenericString] = js.native
}

object ProgressDetail {
  @scala.inline
  def apply(): ProgressDetail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProgressDetail]
  }
  @scala.inline
  implicit class ProgressDetailOps[Self <: ProgressDetail] (val x: Self) extends AnyVal {
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
    def setCurrentProgress(value: RobotDeploymentStep): Self = this.set("currentProgress", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCurrentProgress: Self = this.set("currentProgress", js.undefined)
    @scala.inline
    def setEstimatedTimeRemainingSeconds(value: GenericInteger): Self = this.set("estimatedTimeRemainingSeconds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEstimatedTimeRemainingSeconds: Self = this.set("estimatedTimeRemainingSeconds", js.undefined)
    @scala.inline
    def setPercentDone(value: PercentDone): Self = this.set("percentDone", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePercentDone: Self = this.set("percentDone", js.undefined)
    @scala.inline
    def setTargetResource(value: GenericString): Self = this.set("targetResource", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTargetResource: Self = this.set("targetResource", js.undefined)
  }
  
}

