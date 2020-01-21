package typings.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Workflow extends js.Object {
  /**
    * The date and time when the workflow was created.
    */
  var CreatedOn: js.UndefOr[TimestampValue] = js.native
  /**
    * A collection of properties to be used as part of each execution of the workflow.
    */
  var DefaultRunProperties: js.UndefOr[WorkflowRunProperties] = js.native
  /**
    * A description of the workflow.
    */
  var Description: js.UndefOr[GenericString] = js.native
  /**
    * The graph representing all the AWS Glue components that belong to the workflow as nodes and directed connections between them as edges.
    */
  var Graph: js.UndefOr[WorkflowGraph] = js.native
  /**
    * The date and time when the workflow was last modified.
    */
  var LastModifiedOn: js.UndefOr[TimestampValue] = js.native
  /**
    * The information about the last execution of the workflow.
    */
  var LastRun: js.UndefOr[WorkflowRun] = js.native
  /**
    * The name of the workflow representing the flow.
    */
  var Name: js.UndefOr[NameString] = js.native
}

object Workflow {
  @scala.inline
  def apply(
    CreatedOn: TimestampValue = null,
    DefaultRunProperties: WorkflowRunProperties = null,
    Description: GenericString = null,
    Graph: WorkflowGraph = null,
    LastModifiedOn: TimestampValue = null,
    LastRun: WorkflowRun = null,
    Name: NameString = null
  ): Workflow = {
    val __obj = js.Dynamic.literal()
    if (CreatedOn != null) __obj.updateDynamic("CreatedOn")(CreatedOn.asInstanceOf[js.Any])
    if (DefaultRunProperties != null) __obj.updateDynamic("DefaultRunProperties")(DefaultRunProperties.asInstanceOf[js.Any])
    if (Description != null) __obj.updateDynamic("Description")(Description.asInstanceOf[js.Any])
    if (Graph != null) __obj.updateDynamic("Graph")(Graph.asInstanceOf[js.Any])
    if (LastModifiedOn != null) __obj.updateDynamic("LastModifiedOn")(LastModifiedOn.asInstanceOf[js.Any])
    if (LastRun != null) __obj.updateDynamic("LastRun")(LastRun.asInstanceOf[js.Any])
    if (Name != null) __obj.updateDynamic("Name")(Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Workflow]
  }
}

