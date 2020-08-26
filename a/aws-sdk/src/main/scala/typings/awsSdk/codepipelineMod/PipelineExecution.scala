package typings.awsSdk.codepipelineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PipelineExecution extends js.Object {
  /**
    * A list of ArtifactRevision objects included in a pipeline execution.
    */
  var artifactRevisions: js.UndefOr[ArtifactRevisionList] = js.native
  /**
    * The ID of the pipeline execution.
    */
  var pipelineExecutionId: js.UndefOr[PipelineExecutionId] = js.native
  /**
    * The name of the pipeline with the specified pipeline execution.
    */
  var pipelineName: js.UndefOr[PipelineName] = js.native
  /**
    * The version number of the pipeline with the specified pipeline execution.
    */
  var pipelineVersion: js.UndefOr[PipelineVersion] = js.native
  /**
    * The status of the pipeline execution.   InProgress: The pipeline execution is currently running.   Stopped: The pipeline execution was manually stopped. For more information, see Stopped Executions.   Stopping: The pipeline execution received a request to be manually stopped. Depending on the selected stop mode, the execution is either completing or abandoning in-progress actions. For more information, see Stopped Executions.   Succeeded: The pipeline execution was completed successfully.    Superseded: While this pipeline execution was waiting for the next stage to be completed, a newer pipeline execution advanced and continued through the pipeline instead. For more information, see Superseded Executions.   Failed: The pipeline execution was not completed successfully.  
    */
  var status: js.UndefOr[PipelineExecutionStatus] = js.native
}

object PipelineExecution {
  @scala.inline
  def apply(): PipelineExecution = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PipelineExecution]
  }
  @scala.inline
  implicit class PipelineExecutionOps[Self <: PipelineExecution] (val x: Self) extends AnyVal {
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
    def setArtifactRevisionsVarargs(value: ArtifactRevision*): Self = this.set("artifactRevisions", js.Array(value :_*))
    @scala.inline
    def setArtifactRevisions(value: ArtifactRevisionList): Self = this.set("artifactRevisions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArtifactRevisions: Self = this.set("artifactRevisions", js.undefined)
    @scala.inline
    def setPipelineExecutionId(value: PipelineExecutionId): Self = this.set("pipelineExecutionId", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePipelineExecutionId: Self = this.set("pipelineExecutionId", js.undefined)
    @scala.inline
    def setPipelineName(value: PipelineName): Self = this.set("pipelineName", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePipelineName: Self = this.set("pipelineName", js.undefined)
    @scala.inline
    def setPipelineVersion(value: PipelineVersion): Self = this.set("pipelineVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePipelineVersion: Self = this.set("pipelineVersion", js.undefined)
    @scala.inline
    def setStatus(value: PipelineExecutionStatus): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
  }
  
}

