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
  def apply(
    artifactRevisions: ArtifactRevisionList = null,
    pipelineExecutionId: PipelineExecutionId = null,
    pipelineName: PipelineName = null,
    pipelineVersion: Int | Double = null,
    status: PipelineExecutionStatus = null
  ): PipelineExecution = {
    val __obj = js.Dynamic.literal()
    if (artifactRevisions != null) __obj.updateDynamic("artifactRevisions")(artifactRevisions.asInstanceOf[js.Any])
    if (pipelineExecutionId != null) __obj.updateDynamic("pipelineExecutionId")(pipelineExecutionId.asInstanceOf[js.Any])
    if (pipelineName != null) __obj.updateDynamic("pipelineName")(pipelineName.asInstanceOf[js.Any])
    if (pipelineVersion != null) __obj.updateDynamic("pipelineVersion")(pipelineVersion.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    __obj.asInstanceOf[PipelineExecution]
  }
}

