package typings.awsSdk.iotanalyticsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeletePipelineRequest extends StObject {
  
  /**
    * The name of the pipeline to delete.
    */
  var pipelineName: PipelineName
}
object DeletePipelineRequest {
  
  @scala.inline
  def apply(pipelineName: PipelineName): DeletePipelineRequest = {
    val __obj = js.Dynamic.literal(pipelineName = pipelineName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeletePipelineRequest]
  }
  
  @scala.inline
  implicit class DeletePipelineRequestMutableBuilder[Self <: DeletePipelineRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPipelineName(value: PipelineName): Self = StObject.set(x, "pipelineName", value.asInstanceOf[js.Any])
  }
}
