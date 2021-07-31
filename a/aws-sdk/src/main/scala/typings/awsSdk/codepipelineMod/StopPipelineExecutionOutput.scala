package typings.awsSdk.codepipelineMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StopPipelineExecutionOutput extends StObject {
  
  /**
    * The unique system-generated ID of the pipeline execution that was stopped.
    */
  var pipelineExecutionId: js.UndefOr[PipelineExecutionId] = js.undefined
}
object StopPipelineExecutionOutput {
  
  @scala.inline
  def apply(): StopPipelineExecutionOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StopPipelineExecutionOutput]
  }
  
  @scala.inline
  implicit class StopPipelineExecutionOutputMutableBuilder[Self <: StopPipelineExecutionOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPipelineExecutionId(value: PipelineExecutionId): Self = StObject.set(x, "pipelineExecutionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPipelineExecutionIdUndefined: Self = StObject.set(x, "pipelineExecutionId", js.undefined)
  }
}
