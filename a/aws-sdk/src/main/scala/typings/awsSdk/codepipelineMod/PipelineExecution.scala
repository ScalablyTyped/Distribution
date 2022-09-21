package typings.awsSdk.codepipelineMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PipelineExecution extends StObject {
  
  /**
    * A list of ArtifactRevision objects included in a pipeline execution.
    */
  var artifactRevisions: js.UndefOr[ArtifactRevisionList] = js.undefined
  
  /**
    * The ID of the pipeline execution.
    */
  var pipelineExecutionId: js.UndefOr[PipelineExecutionId] = js.undefined
  
  /**
    * The name of the pipeline with the specified pipeline execution.
    */
  var pipelineName: js.UndefOr[PipelineName] = js.undefined
  
  /**
    * The version number of the pipeline with the specified pipeline execution.
    */
  var pipelineVersion: js.UndefOr[PipelineVersion] = js.undefined
  
  /**
    * The status of the pipeline execution.   Cancelled: The pipeline’s definition was updated before the pipeline execution could be completed.   InProgress: The pipeline execution is currently running.   Stopped: The pipeline execution was manually stopped. For more information, see Stopped Executions.   Stopping: The pipeline execution received a request to be manually stopped. Depending on the selected stop mode, the execution is either completing or abandoning in-progress actions. For more information, see Stopped Executions.   Succeeded: The pipeline execution was completed successfully.    Superseded: While this pipeline execution was waiting for the next stage to be completed, a newer pipeline execution advanced and continued through the pipeline instead. For more information, see Superseded Executions.   Failed: The pipeline execution was not completed successfully.  
    */
  var status: js.UndefOr[PipelineExecutionStatus] = js.undefined
  
  /**
    * A summary that contains a description of the pipeline execution status.
    */
  var statusSummary: js.UndefOr[PipelineExecutionStatusSummary] = js.undefined
}
object PipelineExecution {
  
  inline def apply(): PipelineExecution = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PipelineExecution]
  }
  
  extension [Self <: PipelineExecution](x: Self) {
    
    inline def setArtifactRevisions(value: ArtifactRevisionList): Self = StObject.set(x, "artifactRevisions", value.asInstanceOf[js.Any])
    
    inline def setArtifactRevisionsUndefined: Self = StObject.set(x, "artifactRevisions", js.undefined)
    
    inline def setArtifactRevisionsVarargs(value: ArtifactRevision*): Self = StObject.set(x, "artifactRevisions", js.Array(value*))
    
    inline def setPipelineExecutionId(value: PipelineExecutionId): Self = StObject.set(x, "pipelineExecutionId", value.asInstanceOf[js.Any])
    
    inline def setPipelineExecutionIdUndefined: Self = StObject.set(x, "pipelineExecutionId", js.undefined)
    
    inline def setPipelineName(value: PipelineName): Self = StObject.set(x, "pipelineName", value.asInstanceOf[js.Any])
    
    inline def setPipelineNameUndefined: Self = StObject.set(x, "pipelineName", js.undefined)
    
    inline def setPipelineVersion(value: PipelineVersion): Self = StObject.set(x, "pipelineVersion", value.asInstanceOf[js.Any])
    
    inline def setPipelineVersionUndefined: Self = StObject.set(x, "pipelineVersion", js.undefined)
    
    inline def setStatus(value: PipelineExecutionStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusSummary(value: PipelineExecutionStatusSummary): Self = StObject.set(x, "statusSummary", value.asInstanceOf[js.Any])
    
    inline def setStatusSummaryUndefined: Self = StObject.set(x, "statusSummary", js.undefined)
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
