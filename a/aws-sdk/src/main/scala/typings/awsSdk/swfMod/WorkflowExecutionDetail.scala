package typings.awsSdk.swfMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WorkflowExecutionDetail extends js.Object {
  /**
    * The configuration settings for this workflow execution including timeout values, tasklist etc.
    */
  var executionConfiguration: WorkflowExecutionConfiguration = js.native
  /**
    * Information about the workflow execution.
    */
  var executionInfo: WorkflowExecutionInfo = js.native
  /**
    * The time when the last activity task was scheduled for this workflow execution. You can use this information to determine if the workflow has not made progress for an unusually long period of time and might require a corrective action.
    */
  var latestActivityTaskTimestamp: js.UndefOr[Timestamp] = js.native
  /**
    * The latest executionContext provided by the decider for this workflow execution. A decider can provide an executionContext (a free-form string) when closing a decision task using RespondDecisionTaskCompleted.
    */
  var latestExecutionContext: js.UndefOr[Data] = js.native
  /**
    * The number of tasks for this workflow execution. This includes open and closed tasks of all types.
    */
  var openCounts: WorkflowExecutionOpenCounts = js.native
}

object WorkflowExecutionDetail {
  @scala.inline
  def apply(
    executionConfiguration: WorkflowExecutionConfiguration,
    executionInfo: WorkflowExecutionInfo,
    openCounts: WorkflowExecutionOpenCounts
  ): WorkflowExecutionDetail = {
    val __obj = js.Dynamic.literal(executionConfiguration = executionConfiguration.asInstanceOf[js.Any], executionInfo = executionInfo.asInstanceOf[js.Any], openCounts = openCounts.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkflowExecutionDetail]
  }
  @scala.inline
  implicit class WorkflowExecutionDetailOps[Self <: WorkflowExecutionDetail] (val x: Self) extends AnyVal {
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
    def setExecutionConfiguration(value: WorkflowExecutionConfiguration): Self = this.set("executionConfiguration", value.asInstanceOf[js.Any])
    @scala.inline
    def setExecutionInfo(value: WorkflowExecutionInfo): Self = this.set("executionInfo", value.asInstanceOf[js.Any])
    @scala.inline
    def setOpenCounts(value: WorkflowExecutionOpenCounts): Self = this.set("openCounts", value.asInstanceOf[js.Any])
    @scala.inline
    def setLatestActivityTaskTimestamp(value: Timestamp): Self = this.set("latestActivityTaskTimestamp", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLatestActivityTaskTimestamp: Self = this.set("latestActivityTaskTimestamp", js.undefined)
    @scala.inline
    def setLatestExecutionContext(value: Data): Self = this.set("latestExecutionContext", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLatestExecutionContext: Self = this.set("latestExecutionContext", js.undefined)
  }
  
}

