package typings.awsSdk.codedeployMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ECSTaskSet extends js.Object {
  /**
    *  The number of tasks in a task set. During a deployment that uses the Amazon ECS compute type, CodeDeploy instructs Amazon ECS to create a new task set and uses this value to determine how many tasks to create. After the updated task set is created, CodeDeploy shifts traffic to the new task set. 
    */
  var desiredCount: js.UndefOr[ECSTaskSetCount] = js.native
  /**
    *  A unique ID of an ECSTaskSet. 
    */
  var identifer: js.UndefOr[ECSTaskSetIdentifier] = js.native
  /**
    *  The number of tasks in the task set that are in the PENDING status during an Amazon ECS deployment. A task in the PENDING state is preparing to enter the RUNNING state. A task set enters the PENDING status when it launches for the first time, or when it is restarted after being in the STOPPED state. 
    */
  var pendingCount: js.UndefOr[ECSTaskSetCount] = js.native
  /**
    *  The number of tasks in the task set that are in the RUNNING status during an Amazon ECS deployment. A task in the RUNNING state is running and ready for use. 
    */
  var runningCount: js.UndefOr[ECSTaskSetCount] = js.native
  /**
    *  The status of the task set. There are three valid task set statuses:     PRIMARY: Indicates the task set is serving production traffic.     ACTIVE: Indicates the task set is not serving production traffic.     DRAINING: Indicates the tasks in the task set are being stopped and their corresponding targets are being deregistered from their target group.   
    */
  var status: js.UndefOr[ECSTaskSetStatus] = js.native
  /**
    *  The target group associated with the task set. The target group is used by AWS CodeDeploy to manage traffic to a task set. 
    */
  var targetGroup: js.UndefOr[TargetGroupInfo] = js.native
  /**
    *  A label that identifies whether the ECS task set is an original target (BLUE) or a replacement target (GREEN). 
    */
  var taskSetLabel: js.UndefOr[TargetLabel] = js.native
  /**
    *  The percentage of traffic served by this task set. 
    */
  var trafficWeight: js.UndefOr[TrafficWeight] = js.native
}

object ECSTaskSet {
  @scala.inline
  def apply(
    desiredCount: js.UndefOr[ECSTaskSetCount] = js.undefined,
    identifer: ECSTaskSetIdentifier = null,
    pendingCount: js.UndefOr[ECSTaskSetCount] = js.undefined,
    runningCount: js.UndefOr[ECSTaskSetCount] = js.undefined,
    status: ECSTaskSetStatus = null,
    targetGroup: TargetGroupInfo = null,
    taskSetLabel: TargetLabel = null,
    trafficWeight: js.UndefOr[TrafficWeight] = js.undefined
  ): ECSTaskSet = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(desiredCount)) __obj.updateDynamic("desiredCount")(desiredCount.get.asInstanceOf[js.Any])
    if (identifer != null) __obj.updateDynamic("identifer")(identifer.asInstanceOf[js.Any])
    if (!js.isUndefined(pendingCount)) __obj.updateDynamic("pendingCount")(pendingCount.get.asInstanceOf[js.Any])
    if (!js.isUndefined(runningCount)) __obj.updateDynamic("runningCount")(runningCount.get.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (targetGroup != null) __obj.updateDynamic("targetGroup")(targetGroup.asInstanceOf[js.Any])
    if (taskSetLabel != null) __obj.updateDynamic("taskSetLabel")(taskSetLabel.asInstanceOf[js.Any])
    if (!js.isUndefined(trafficWeight)) __obj.updateDynamic("trafficWeight")(trafficWeight.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ECSTaskSet]
  }
}

