package typings.awsSdk.codedeployMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InstanceTarget extends js.Object {
  /**
    *  The unique ID of a deployment. 
    */
  var deploymentId: js.UndefOr[DeploymentId] = js.native
  /**
    *  A label that identifies whether the instance is an original target (BLUE) or a replacement target (GREEN). 
    */
  var instanceLabel: js.UndefOr[TargetLabel] = js.native
  /**
    *  The date and time when the target instance was updated by a deployment. 
    */
  var lastUpdatedAt: js.UndefOr[Time] = js.native
  /**
    *  The lifecycle events of the deployment to this target instance. 
    */
  var lifecycleEvents: js.UndefOr[LifecycleEventList] = js.native
  /**
    *  The status an EC2/On-premises deployment's target instance. 
    */
  var status: js.UndefOr[TargetStatus] = js.native
  /**
    *  The Amazon Resource Name (ARN) of the target. 
    */
  var targetArn: js.UndefOr[TargetArn] = js.native
  /**
    *  The unique ID of a deployment target that has a type of instanceTarget. 
    */
  var targetId: js.UndefOr[TargetId] = js.native
}

object InstanceTarget {
  @scala.inline
  def apply(): InstanceTarget = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InstanceTarget]
  }
  @scala.inline
  implicit class InstanceTargetOps[Self <: InstanceTarget] (val x: Self) extends AnyVal {
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
    def setDeploymentId(value: DeploymentId): Self = this.set("deploymentId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeploymentId: Self = this.set("deploymentId", js.undefined)
    @scala.inline
    def setInstanceLabel(value: TargetLabel): Self = this.set("instanceLabel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInstanceLabel: Self = this.set("instanceLabel", js.undefined)
    @scala.inline
    def setLastUpdatedAt(value: Time): Self = this.set("lastUpdatedAt", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLastUpdatedAt: Self = this.set("lastUpdatedAt", js.undefined)
    @scala.inline
    def setLifecycleEventsVarargs(value: LifecycleEvent*): Self = this.set("lifecycleEvents", js.Array(value :_*))
    @scala.inline
    def setLifecycleEvents(value: LifecycleEventList): Self = this.set("lifecycleEvents", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLifecycleEvents: Self = this.set("lifecycleEvents", js.undefined)
    @scala.inline
    def setStatus(value: TargetStatus): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
    @scala.inline
    def setTargetArn(value: TargetArn): Self = this.set("targetArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTargetArn: Self = this.set("targetArn", js.undefined)
    @scala.inline
    def setTargetId(value: TargetId): Self = this.set("targetId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTargetId: Self = this.set("targetId", js.undefined)
  }
  
}

