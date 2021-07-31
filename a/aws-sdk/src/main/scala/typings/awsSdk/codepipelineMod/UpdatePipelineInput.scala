package typings.awsSdk.codepipelineMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdatePipelineInput extends StObject {
  
  /**
    * The name of the pipeline to be updated.
    */
  var pipeline: PipelineDeclaration
}
object UpdatePipelineInput {
  
  @scala.inline
  def apply(pipeline: PipelineDeclaration): UpdatePipelineInput = {
    val __obj = js.Dynamic.literal(pipeline = pipeline.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdatePipelineInput]
  }
  
  @scala.inline
  implicit class UpdatePipelineInputMutableBuilder[Self <: UpdatePipelineInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPipeline(value: PipelineDeclaration): Self = StObject.set(x, "pipeline", value.asInstanceOf[js.Any])
  }
}
