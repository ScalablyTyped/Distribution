package typings.awsSdk.codepipelineMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreatePipelineOutput extends StObject {
  
  /**
    * Represents the structure of actions and stages to be performed in the pipeline. 
    */
  var pipeline: js.UndefOr[PipelineDeclaration] = js.native
  
  /**
    * Specifies the tags applied to the pipeline.
    */
  var tags: js.UndefOr[TagList] = js.native
}
object CreatePipelineOutput {
  
  @scala.inline
  def apply(): CreatePipelineOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreatePipelineOutput]
  }
  
  @scala.inline
  implicit class CreatePipelineOutputMutableBuilder[Self <: CreatePipelineOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPipeline(value: PipelineDeclaration): Self = StObject.set(x, "pipeline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPipelineUndefined: Self = StObject.set(x, "pipeline", js.undefined)
    
    @scala.inline
    def setTags(value: TagList): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = StObject.set(x, "tags", js.Array(value :_*))
  }
}
