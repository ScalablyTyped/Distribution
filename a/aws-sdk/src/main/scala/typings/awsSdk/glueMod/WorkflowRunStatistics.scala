package typings.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WorkflowRunStatistics extends js.Object {
  /**
    * Total number of Actions which have failed.
    */
  var FailedActions: js.UndefOr[IntegerValue] = js.native
  /**
    * Total number Actions in running state.
    */
  var RunningActions: js.UndefOr[IntegerValue] = js.native
  /**
    * Total number of Actions which have stopped.
    */
  var StoppedActions: js.UndefOr[IntegerValue] = js.native
  /**
    * Total number of Actions which have succeeded.
    */
  var SucceededActions: js.UndefOr[IntegerValue] = js.native
  /**
    * Total number of Actions which timed out.
    */
  var TimeoutActions: js.UndefOr[IntegerValue] = js.native
  /**
    * Total number of Actions in the workflow run.
    */
  var TotalActions: js.UndefOr[IntegerValue] = js.native
}

object WorkflowRunStatistics {
  @scala.inline
  def apply(
    FailedActions: js.UndefOr[IntegerValue] = js.undefined,
    RunningActions: js.UndefOr[IntegerValue] = js.undefined,
    StoppedActions: js.UndefOr[IntegerValue] = js.undefined,
    SucceededActions: js.UndefOr[IntegerValue] = js.undefined,
    TimeoutActions: js.UndefOr[IntegerValue] = js.undefined,
    TotalActions: js.UndefOr[IntegerValue] = js.undefined
  ): WorkflowRunStatistics = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(FailedActions)) __obj.updateDynamic("FailedActions")(FailedActions.get.asInstanceOf[js.Any])
    if (!js.isUndefined(RunningActions)) __obj.updateDynamic("RunningActions")(RunningActions.get.asInstanceOf[js.Any])
    if (!js.isUndefined(StoppedActions)) __obj.updateDynamic("StoppedActions")(StoppedActions.get.asInstanceOf[js.Any])
    if (!js.isUndefined(SucceededActions)) __obj.updateDynamic("SucceededActions")(SucceededActions.get.asInstanceOf[js.Any])
    if (!js.isUndefined(TimeoutActions)) __obj.updateDynamic("TimeoutActions")(TimeoutActions.get.asInstanceOf[js.Any])
    if (!js.isUndefined(TotalActions)) __obj.updateDynamic("TotalActions")(TotalActions.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkflowRunStatistics]
  }
}

