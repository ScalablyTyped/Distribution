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
  def apply(): LastDeploymentInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LastDeploymentInfo]
  }
  @scala.inline
  implicit class LastDeploymentInfoOps[Self <: LastDeploymentInfo] (val x: Self) extends AnyVal {
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
    def setCreateTime(value: Timestamp): Self = this.set("createTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreateTime: Self = this.set("createTime", js.undefined)
    @scala.inline
    def setDeploymentId(value: DeploymentId): Self = this.set("deploymentId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeploymentId: Self = this.set("deploymentId", js.undefined)
    @scala.inline
    def setEndTime(value: Timestamp): Self = this.set("endTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEndTime: Self = this.set("endTime", js.undefined)
    @scala.inline
    def setStatus(value: DeploymentStatus): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
  }
  
}

