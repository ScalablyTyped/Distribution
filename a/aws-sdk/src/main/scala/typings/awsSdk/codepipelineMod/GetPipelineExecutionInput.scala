package typings.awsSdk.codepipelineMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetPipelineExecutionInput extends StObject {
  
  /**
    * The ID of the pipeline execution about which you want to get execution details.
    */
  var pipelineExecutionId: PipelineExecutionId
  
  /**
    * The name of the pipeline about which you want to get execution details.
    */
  var pipelineName: PipelineName
}
object GetPipelineExecutionInput {
  
  @scala.inline
  def apply(pipelineExecutionId: PipelineExecutionId, pipelineName: PipelineName): GetPipelineExecutionInput = {
    val __obj = js.Dynamic.literal(pipelineExecutionId = pipelineExecutionId.asInstanceOf[js.Any], pipelineName = pipelineName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetPipelineExecutionInput]
  }
  
  @scala.inline
  implicit class GetPipelineExecutionInputMutableBuilder[Self <: GetPipelineExecutionInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPipelineExecutionId(value: PipelineExecutionId): Self = StObject.set(x, "pipelineExecutionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPipelineName(value: PipelineName): Self = StObject.set(x, "pipelineName", value.asInstanceOf[js.Any])
  }
}
