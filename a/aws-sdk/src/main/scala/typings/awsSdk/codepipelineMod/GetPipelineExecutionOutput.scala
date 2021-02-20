package typings.awsSdk.codepipelineMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetPipelineExecutionOutput extends StObject {
  
  /**
    * Represents information about the execution of a pipeline.
    */
  var pipelineExecution: js.UndefOr[PipelineExecution] = js.native
}
object GetPipelineExecutionOutput {
  
  @scala.inline
  def apply(): GetPipelineExecutionOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetPipelineExecutionOutput]
  }
  
  @scala.inline
  implicit class GetPipelineExecutionOutputMutableBuilder[Self <: GetPipelineExecutionOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPipelineExecution(value: PipelineExecution): Self = StObject.set(x, "pipelineExecution", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPipelineExecutionUndefined: Self = StObject.set(x, "pipelineExecution", js.undefined)
  }
}
