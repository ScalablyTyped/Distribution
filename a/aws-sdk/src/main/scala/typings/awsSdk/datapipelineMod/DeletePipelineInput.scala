package typings.awsSdk.datapipelineMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeletePipelineInput extends StObject {
  
  /**
    * The ID of the pipeline.
    */
  var pipelineId: id = js.native
}
object DeletePipelineInput {
  
  @scala.inline
  def apply(pipelineId: id): DeletePipelineInput = {
    val __obj = js.Dynamic.literal(pipelineId = pipelineId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeletePipelineInput]
  }
  
  @scala.inline
  implicit class DeletePipelineInputMutableBuilder[Self <: DeletePipelineInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPipelineId(value: id): Self = StObject.set(x, "pipelineId", value.asInstanceOf[js.Any])
  }
}
