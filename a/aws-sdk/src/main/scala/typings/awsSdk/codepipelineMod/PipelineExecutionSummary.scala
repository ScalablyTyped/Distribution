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
  def apply(): PipelineExecutionSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PipelineExecutionSummary]
  }
  @scala.inline
  implicit class PipelineExecutionSummaryOps[Self <: PipelineExecutionSummary] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setLastUpdateTime(value: Timestamp): Self = this.set("lastUpdateTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLastUpdateTime: Self = this.set("lastUpdateTime", js.undefined)
    @scala.inline
    def setPipelineExecutionId(value: PipelineExecutionId): Self = this.set("pipelineExecutionId", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePipelineExecutionId: Self = this.set("pipelineExecutionId", js.undefined)
    @scala.inline
    def setSourceRevisionsVarargs(value: SourceRevision*): Self = this.set("sourceRevisions", js.Array(value :_*))
    @scala.inline
    def setSourceRevisions(value: SourceRevisionList): Self = this.set("sourceRevisions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSourceRevisions: Self = this.set("sourceRevisions", js.undefined)
    @scala.inline
    def setStartTime(value: Timestamp): Self = this.set("startTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStartTime: Self = this.set("startTime", js.undefined)
    @scala.inline
    def setStatus(value: PipelineExecutionStatus): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
    @scala.inline
    def setStopTrigger(value: StopExecutionTrigger): Self = this.set("stopTrigger", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStopTrigger: Self = this.set("stopTrigger", js.undefined)
    @scala.inline
    def setTrigger(value: ExecutionTrigger): Self = this.set("trigger", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTrigger: Self = this.set("trigger", js.undefined)
  }
  
}

