package typings.awsSdk.swfMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WorkflowExecutionOpenCounts extends js.Object {
  /**
    * The count of activity tasks whose status is OPEN.
    */
  var openActivityTasks: Count = js.native
  /**
    * The count of child workflow executions whose status is OPEN.
    */
  var openChildWorkflowExecutions: Count = js.native
  /**
    * The count of decision tasks whose status is OPEN. A workflow execution can have at most one open decision task.
    */
  var openDecisionTasks: OpenDecisionTasksCount = js.native
  /**
    * The count of Lambda tasks whose status is OPEN.
    */
  var openLambdaFunctions: js.UndefOr[Count] = js.native
  /**
    * The count of timers started by this workflow execution that have not fired yet.
    */
  var openTimers: Count = js.native
}

object WorkflowExecutionOpenCounts {
  @scala.inline
  def apply(
    openActivityTasks: Count,
    openChildWorkflowExecutions: Count,
    openDecisionTasks: OpenDecisionTasksCount,
    openTimers: Count
  ): WorkflowExecutionOpenCounts = {
    val __obj = js.Dynamic.literal(openActivityTasks = openActivityTasks.asInstanceOf[js.Any], openChildWorkflowExecutions = openChildWorkflowExecutions.asInstanceOf[js.Any], openDecisionTasks = openDecisionTasks.asInstanceOf[js.Any], openTimers = openTimers.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkflowExecutionOpenCounts]
  }
  @scala.inline
  implicit class WorkflowExecutionOpenCountsOps[Self <: WorkflowExecutionOpenCounts] (val x: Self) extends AnyVal {
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
    def setOpenActivityTasks(value: Count): Self = this.set("openActivityTasks", value.asInstanceOf[js.Any])
    @scala.inline
    def setOpenChildWorkflowExecutions(value: Count): Self = this.set("openChildWorkflowExecutions", value.asInstanceOf[js.Any])
    @scala.inline
    def setOpenDecisionTasks(value: OpenDecisionTasksCount): Self = this.set("openDecisionTasks", value.asInstanceOf[js.Any])
    @scala.inline
    def setOpenTimers(value: Count): Self = this.set("openTimers", value.asInstanceOf[js.Any])
    @scala.inline
    def setOpenLambdaFunctions(value: Count): Self = this.set("openLambdaFunctions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOpenLambdaFunctions: Self = this.set("openLambdaFunctions", js.undefined)
  }
  
}

