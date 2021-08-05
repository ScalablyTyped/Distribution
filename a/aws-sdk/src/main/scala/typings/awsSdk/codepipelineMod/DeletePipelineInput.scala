package typings.awsSdk.codepipelineMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeletePipelineInput extends StObject {
  
  /**
    * The name of the pipeline to be deleted.
    */
  var name: PipelineName
}
object DeletePipelineInput {
  
  inline def apply(name: PipelineName): DeletePipelineInput = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeletePipelineInput]
  }
  
  extension [Self <: DeletePipelineInput](x: Self) {
    
    inline def setName(value: PipelineName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
