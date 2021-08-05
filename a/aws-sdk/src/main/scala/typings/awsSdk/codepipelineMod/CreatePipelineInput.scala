package typings.awsSdk.codepipelineMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreatePipelineInput extends StObject {
  
  /**
    * Represents the structure of actions and stages to be performed in the pipeline. 
    */
  var pipeline: PipelineDeclaration
  
  /**
    * The tags for the pipeline.
    */
  var tags: js.UndefOr[TagList] = js.undefined
}
object CreatePipelineInput {
  
  inline def apply(pipeline: PipelineDeclaration): CreatePipelineInput = {
    val __obj = js.Dynamic.literal(pipeline = pipeline.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreatePipelineInput]
  }
  
  extension [Self <: CreatePipelineInput](x: Self) {
    
    inline def setPipeline(value: PipelineDeclaration): Self = StObject.set(x, "pipeline", value.asInstanceOf[js.Any])
    
    inline def setTags(value: TagList): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "tags", js.Array(value :_*))
  }
}
