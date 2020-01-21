package typings.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WorkflowRun extends js.Object {
  /**
    * The date and time when the workflow run completed.
    */
  var CompletedOn: js.UndefOr[TimestampValue] = js.native
  /**
    * The graph representing all the AWS Glue components that belong to the workflow as nodes and directed connections between them as edges.
    */
  var Graph: js.UndefOr[WorkflowGraph] = js.native
  /**
    * Name of the workflow which was executed.
    */
  var Name: js.UndefOr[NameString] = js.native
  /**
    * The date and time when the workflow run was started.
    */
  var StartedOn: js.UndefOr[TimestampValue] = js.native
  /**
    * The statistics of the run.
    */
  var Statistics: js.UndefOr[WorkflowRunStatistics] = js.native
  /**
    * The status of the workflow run.
    */
  var Status: js.UndefOr[WorkflowRunStatus] = js.native
  /**
    * The ID of this workflow run.
    */
  var WorkflowRunId: js.UndefOr[IdString] = js.native
  /**
    * The workflow run properties which were set during the run.
    */
  var WorkflowRunProperties: js.UndefOr[typings.awsSdk.glueMod.WorkflowRunProperties] = js.native
}

object WorkflowRun {
  @scala.inline
  def apply(
    CompletedOn: TimestampValue = null,
    Graph: WorkflowGraph = null,
    Name: NameString = null,
    StartedOn: TimestampValue = null,
    Statistics: WorkflowRunStatistics = null,
    Status: WorkflowRunStatus = null,
    WorkflowRunId: IdString = null,
    WorkflowRunProperties: WorkflowRunProperties = null
  ): WorkflowRun = {
    val __obj = js.Dynamic.literal()
    if (CompletedOn != null) __obj.updateDynamic("CompletedOn")(CompletedOn.asInstanceOf[js.Any])
    if (Graph != null) __obj.updateDynamic("Graph")(Graph.asInstanceOf[js.Any])
    if (Name != null) __obj.updateDynamic("Name")(Name.asInstanceOf[js.Any])
    if (StartedOn != null) __obj.updateDynamic("StartedOn")(StartedOn.asInstanceOf[js.Any])
    if (Statistics != null) __obj.updateDynamic("Statistics")(Statistics.asInstanceOf[js.Any])
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    if (WorkflowRunId != null) __obj.updateDynamic("WorkflowRunId")(WorkflowRunId.asInstanceOf[js.Any])
    if (WorkflowRunProperties != null) __obj.updateDynamic("WorkflowRunProperties")(WorkflowRunProperties.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkflowRun]
  }
}

