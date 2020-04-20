package typings.awsSdk.swfMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WorkflowExecution extends js.Object {
  /**
    * A system-generated unique identifier for the workflow execution.
    */
  var runId: WorkflowRunId = js.native
  /**
    * The user defined identifier associated with the workflow execution.
    */
  var workflowId: WorkflowId = js.native
}

object WorkflowExecution {
  @scala.inline
  def apply(runId: WorkflowRunId, workflowId: WorkflowId): WorkflowExecution = {
    val __obj = js.Dynamic.literal(runId = runId.asInstanceOf[js.Any], workflowId = workflowId.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkflowExecution]
  }
}

