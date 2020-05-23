package typings.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HumanLoopConfig extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the human task user interface.
    */
  var HumanTaskUiArn: typings.awsSdk.sagemakerMod.HumanTaskUiArn = js.native
  var PublicWorkforceTaskPrice: js.UndefOr[typings.awsSdk.sagemakerMod.PublicWorkforceTaskPrice] = js.native
  /**
    * The length of time that a task remains available for labeling by human workers.
    */
  var TaskAvailabilityLifetimeInSeconds: js.UndefOr[FlowDefinitionTaskAvailabilityLifetimeInSeconds] = js.native
  /**
    * The number of distinct workers who will perform the same task on each object. For example, if TaskCount is set to 3 for an image classification labeling job, three workers will classify each input image. Increasing TaskCount can improve label accuracy.
    */
  var TaskCount: FlowDefinitionTaskCount = js.native
  /**
    * A description for the human worker task.
    */
  var TaskDescription: FlowDefinitionTaskDescription = js.native
  /**
    * Keywords used to describe the task so that workers can discover the task.
    */
  var TaskKeywords: js.UndefOr[FlowDefinitionTaskKeywords] = js.native
  /**
    * The amount of time that a worker has to complete a task.
    */
  var TaskTimeLimitInSeconds: js.UndefOr[FlowDefinitionTaskTimeLimitInSeconds] = js.native
  /**
    * A title for the human worker task.
    */
  var TaskTitle: FlowDefinitionTaskTitle = js.native
  /**
    * Amazon Resource Name (ARN) of a team of workers.
    */
  var WorkteamArn: typings.awsSdk.sagemakerMod.WorkteamArn = js.native
}

object HumanLoopConfig {
  @scala.inline
  def apply(
    HumanTaskUiArn: HumanTaskUiArn,
    TaskCount: FlowDefinitionTaskCount,
    TaskDescription: FlowDefinitionTaskDescription,
    TaskTitle: FlowDefinitionTaskTitle,
    WorkteamArn: WorkteamArn,
    PublicWorkforceTaskPrice: PublicWorkforceTaskPrice = null,
    TaskAvailabilityLifetimeInSeconds: js.UndefOr[FlowDefinitionTaskAvailabilityLifetimeInSeconds] = js.undefined,
    TaskKeywords: FlowDefinitionTaskKeywords = null,
    TaskTimeLimitInSeconds: js.UndefOr[FlowDefinitionTaskTimeLimitInSeconds] = js.undefined
  ): HumanLoopConfig = {
    val __obj = js.Dynamic.literal(HumanTaskUiArn = HumanTaskUiArn.asInstanceOf[js.Any], TaskCount = TaskCount.asInstanceOf[js.Any], TaskDescription = TaskDescription.asInstanceOf[js.Any], TaskTitle = TaskTitle.asInstanceOf[js.Any], WorkteamArn = WorkteamArn.asInstanceOf[js.Any])
    if (PublicWorkforceTaskPrice != null) __obj.updateDynamic("PublicWorkforceTaskPrice")(PublicWorkforceTaskPrice.asInstanceOf[js.Any])
    if (!js.isUndefined(TaskAvailabilityLifetimeInSeconds)) __obj.updateDynamic("TaskAvailabilityLifetimeInSeconds")(TaskAvailabilityLifetimeInSeconds.get.asInstanceOf[js.Any])
    if (TaskKeywords != null) __obj.updateDynamic("TaskKeywords")(TaskKeywords.asInstanceOf[js.Any])
    if (!js.isUndefined(TaskTimeLimitInSeconds)) __obj.updateDynamic("TaskTimeLimitInSeconds")(TaskTimeLimitInSeconds.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[HumanLoopConfig]
  }
}

