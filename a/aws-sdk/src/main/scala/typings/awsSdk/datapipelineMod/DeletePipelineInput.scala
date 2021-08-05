package typings.awsSdk.datapipelineMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeletePipelineInput extends StObject {
  
  /**
    * The ID of the pipeline.
    */
  var pipelineId: id
}
object DeletePipelineInput {
  
  inline def apply(pipelineId: id): DeletePipelineInput = {
    val __obj = js.Dynamic.literal(pipelineId = pipelineId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeletePipelineInput]
  }
  
  extension [Self <: DeletePipelineInput](x: Self) {
    
    inline def setPipelineId(value: id): Self = StObject.set(x, "pipelineId", value.asInstanceOf[js.Any])
  }
}
