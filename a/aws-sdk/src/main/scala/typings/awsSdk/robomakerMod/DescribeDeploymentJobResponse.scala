package typings.awsSdk.robomakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeDeploymentJobResponse extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the deployment job.
    */
  var arn: js.UndefOr[Arn] = js.native
  /**
    * The time, in milliseconds since the epoch, when the deployment job was created.
    */
  var createdAt: js.UndefOr[CreatedAt] = js.native
  /**
    * The deployment application configuration.
    */
  var deploymentApplicationConfigs: js.UndefOr[DeploymentApplicationConfigs] = js.native
  /**
    * The deployment configuration.
    */
  var deploymentConfig: js.UndefOr[DeploymentConfig] = js.native
  /**
    * The deployment job failure code.
    */
  var failureCode: js.UndefOr[DeploymentJobErrorCode] = js.native
  /**
    * A short description of the reason why the deployment job failed.
    */
  var failureReason: js.UndefOr[GenericString] = js.native
  /**
    * The Amazon Resource Name (ARN) of the fleet.
    */
  var fleet: js.UndefOr[Arn] = js.native
  /**
    * A list of robot deployment summaries.
    */
  var robotDeploymentSummary: js.UndefOr[RobotDeploymentSummary] = js.native
  /**
    * The status of the deployment job.
    */
  var status: js.UndefOr[DeploymentStatus] = js.native
  /**
    * The list of all tags added to the specified deployment job.
    */
  var tags: js.UndefOr[TagMap] = js.native
}

object DescribeDeploymentJobResponse {
  @scala.inline
  def apply(): DescribeDeploymentJobResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeDeploymentJobResponse]
  }
  @scala.inline
  implicit class DescribeDeploymentJobResponseOps[Self <: DescribeDeploymentJobResponse] (val x: Self) extends AnyVal {
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
    def setCreatedAt(value: CreatedAt): Self = this.set("createdAt", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreatedAt: Self = this.set("createdAt", js.undefined)
    @scala.inline
    def setDeploymentApplicationConfigsVarargs(value: DeploymentApplicationConfig*): Self = this.set("deploymentApplicationConfigs", js.Array(value :_*))
    @scala.inline
    def setDeploymentApplicationConfigs(value: DeploymentApplicationConfigs): Self = this.set("deploymentApplicationConfigs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeploymentApplicationConfigs: Self = this.set("deploymentApplicationConfigs", js.undefined)
    @scala.inline
    def setDeploymentConfig(value: DeploymentConfig): Self = this.set("deploymentConfig", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeploymentConfig: Self = this.set("deploymentConfig", js.undefined)
    @scala.inline
    def setFailureCode(value: DeploymentJobErrorCode): Self = this.set("failureCode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFailureCode: Self = this.set("failureCode", js.undefined)
    @scala.inline
    def setFailureReason(value: GenericString): Self = this.set("failureReason", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFailureReason: Self = this.set("failureReason", js.undefined)
    @scala.inline
    def setFleet(value: Arn): Self = this.set("fleet", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFleet: Self = this.set("fleet", js.undefined)
    @scala.inline
    def setRobotDeploymentSummaryVarargs(value: RobotDeployment*): Self = this.set("robotDeploymentSummary", js.Array(value :_*))
    @scala.inline
    def setRobotDeploymentSummary(value: RobotDeploymentSummary): Self = this.set("robotDeploymentSummary", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRobotDeploymentSummary: Self = this.set("robotDeploymentSummary", js.undefined)
    @scala.inline
    def setStatus(value: DeploymentStatus): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
    @scala.inline
    def setTags(value: TagMap): Self = this.set("tags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
  }
  
}

