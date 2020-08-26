package typings.awsSdk.robomakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RobotDeployment extends js.Object {
  /**
    * The robot deployment Amazon Resource Name (ARN).
    */
  var arn: js.UndefOr[Arn] = js.native
  /**
    * The time, in milliseconds since the epoch, when the deployment finished.
    */
  var deploymentFinishTime: js.UndefOr[CreatedAt] = js.native
  /**
    * The time, in milliseconds since the epoch, when the deployment was started.
    */
  var deploymentStartTime: js.UndefOr[CreatedAt] = js.native
  /**
    * The robot deployment failure code.
    */
  var failureCode: js.UndefOr[DeploymentJobErrorCode] = js.native
  /**
    * A short description of the reason why the robot deployment failed.
    */
  var failureReason: js.UndefOr[GenericString] = js.native
  /**
    * Information about how the deployment is progressing.
    */
  var progressDetail: js.UndefOr[ProgressDetail] = js.native
  /**
    * The status of the robot deployment.
    */
  var status: js.UndefOr[RobotStatus] = js.native
}

object RobotDeployment {
  @scala.inline
  def apply(): RobotDeployment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RobotDeployment]
  }
  @scala.inline
  implicit class RobotDeploymentOps[Self <: RobotDeployment] (val x: Self) extends AnyVal {
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
    def setArn(value: Arn): Self = this.set("arn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArn: Self = this.set("arn", js.undefined)
    @scala.inline
    def setDeploymentFinishTime(value: CreatedAt): Self = this.set("deploymentFinishTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeploymentFinishTime: Self = this.set("deploymentFinishTime", js.undefined)
    @scala.inline
    def setDeploymentStartTime(value: CreatedAt): Self = this.set("deploymentStartTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeploymentStartTime: Self = this.set("deploymentStartTime", js.undefined)
    @scala.inline
    def setFailureCode(value: DeploymentJobErrorCode): Self = this.set("failureCode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFailureCode: Self = this.set("failureCode", js.undefined)
    @scala.inline
    def setFailureReason(value: GenericString): Self = this.set("failureReason", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFailureReason: Self = this.set("failureReason", js.undefined)
    @scala.inline
    def setProgressDetail(value: ProgressDetail): Self = this.set("progressDetail", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProgressDetail: Self = this.set("progressDetail", js.undefined)
    @scala.inline
    def setStatus(value: RobotStatus): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
  }
  
}

