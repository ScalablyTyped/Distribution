package typings.awsSdk.codepipelineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PipelineExecutionSummary extends js.Object {
  /**
    * The date and time of the last change to the pipeline execution, in timestamp format.
    */
  var lastUpdateTime: js.UndefOr[Timestamp] = js.native
  /**
    * The ID of the pipeline execution.
    */
  var pipelineExecutionId: js.UndefOr[PipelineExecutionId] = js.native
  /**
    * A list of the source artifact revisions that initiated a pipeline execution.
    */
  var sourceRevisions: js.UndefOr[SourceRevisionList] = js.native
  /**
    * The date and time when the pipeline execution began, in timestamp format.
    */
  var startTime: js.UndefOr[Timestamp] = js.native
  /**
    * The status of the pipeline execution.   InProgress: The pipeline execution is currently running.   Stopped: The pipeline execution was manually stopped. For more information, see Stopped Executions.   Stopping: The pipeline execution received a request to be manually stopped. Depending on the selected stop mode, the execution is either completing or abandoning in-progress actions. For more information, see Stopped Executions.   Succeeded: The pipeline execution was completed successfully.    Superseded: While this pipeline execution was waiting for the next stage to be completed, a newer pipeline execution advanced and continued through the pipeline instead. For more information, see Superseded Executions.   Failed: The pipeline execution was not completed successfully.  
    */
  var status: js.UndefOr[PipelineExecutionStatus] = js.native
  /**
    * The interaction that stopped a pipeline execution.
    */
  var stopTrigger: js.UndefOr[StopExecutionTrigger] = js.native
  /**
    * The interaction or event that started a pipeline execution, such as automated change detection or a StartPipelineExecution API call.
    */
  var trigger: js.UndefOr[ExecutionTrigger] = js.native
}

object PipelineExecutionSummary {
  @scala.inline
  def apply(
    lastUpdateTime: Timestamp = null,
    pipelineExecutionId: PipelineExecutionId = null,
    sourceRevisions: SourceRevisionList = null,
    startTime: Timestamp = null,
    status: PipelineExecutionStatus = null,
    stopTrigger: StopExecutionTrigger = null,
    trigger: ExecutionTrigger = null
  ): PipelineExecutionSummary = {
    val __obj = js.Dynamic.literal()
    if (lastUpdateTime != null) __obj.updateDynamic("lastUpdateTime")(lastUpdateTime.asInstanceOf[js.Any])
    if (pipelineExecutionId != null) __obj.updateDynamic("pipelineExecutionId")(pipelineExecutionId.asInstanceOf[js.Any])
    if (sourceRevisions != null) __obj.updateDynamic("sourceRevisions")(sourceRevisions.asInstanceOf[js.Any])
    if (startTime != null) __obj.updateDynamic("startTime")(startTime.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (stopTrigger != null) __obj.updateDynamic("stopTrigger")(stopTrigger.asInstanceOf[js.Any])
    if (trigger != null) __obj.updateDynamic("trigger")(trigger.asInstanceOf[js.Any])
    __obj.asInstanceOf[PipelineExecutionSummary]
  }
}

