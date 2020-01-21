package typings.awsSdk.codedeployMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ECSTarget extends js.Object {
  /**
    *  The unique ID of a deployment. 
    */
  var deploymentId: js.UndefOr[DeploymentId] = js.native
  /**
    *  The date and time when the target Amazon ECS application was updated by a deployment. 
    */
  var lastUpdatedAt: js.UndefOr[Time] = js.native
  /**
    *  The lifecycle events of the deployment to this target Amazon ECS application. 
    */
  var lifecycleEvents: js.UndefOr[LifecycleEventList] = js.native
  /**
    *  The status an Amazon ECS deployment's target ECS application. 
    */
  var status: js.UndefOr[TargetStatus] = js.native
  /**
    *  The ARN of the target. 
    */
  var targetArn: js.UndefOr[TargetArn] = js.native
  /**
    *  The unique ID of a deployment target that has a type of ecsTarget. 
    */
  var targetId: js.UndefOr[TargetId] = js.native
  /**
    *  The ECSTaskSet objects associated with the ECS target. 
    */
  var taskSetsInfo: js.UndefOr[ECSTaskSetList] = js.native
}

object ECSTarget {
  @scala.inline
  def apply(
    deploymentId: DeploymentId = null,
    lastUpdatedAt: Time = null,
    lifecycleEvents: LifecycleEventList = null,
    status: TargetStatus = null,
    targetArn: TargetArn = null,
    targetId: TargetId = null,
    taskSetsInfo: ECSTaskSetList = null
  ): ECSTarget = {
    val __obj = js.Dynamic.literal()
    if (deploymentId != null) __obj.updateDynamic("deploymentId")(deploymentId.asInstanceOf[js.Any])
    if (lastUpdatedAt != null) __obj.updateDynamic("lastUpdatedAt")(lastUpdatedAt.asInstanceOf[js.Any])
    if (lifecycleEvents != null) __obj.updateDynamic("lifecycleEvents")(lifecycleEvents.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (targetArn != null) __obj.updateDynamic("targetArn")(targetArn.asInstanceOf[js.Any])
    if (targetId != null) __obj.updateDynamic("targetId")(targetId.asInstanceOf[js.Any])
    if (taskSetsInfo != null) __obj.updateDynamic("taskSetsInfo")(taskSetsInfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[ECSTarget]
  }
}

