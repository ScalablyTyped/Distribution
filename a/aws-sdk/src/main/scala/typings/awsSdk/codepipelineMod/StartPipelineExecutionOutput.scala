package typings.awsSdk.codepipelineMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StartPipelineExecutionOutput extends StObject {
  
  /**
    * The unique system-generated ID of the pipeline execution that was started.
    */
  var pipelineExecutionId: js.UndefOr[PipelineExecutionId] = js.native
}
object StartPipelineExecutionOutput {
  
  @scala.inline
  def apply(): StartPipelineExecutionOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StartPipelineExecutionOutput]
  }
  
  @scala.inline
  implicit class StartPipelineExecutionOutputMutableBuilder[Self <: StartPipelineExecutionOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPipelineExecutionId(value: PipelineExecutionId): Self = StObject.set(x, "pipelineExecutionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPipelineExecutionIdUndefined: Self = StObject.set(x, "pipelineExecutionId", js.undefined)
  }
}
