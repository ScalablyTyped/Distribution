package typings.awsSdk.datapipelineMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AddTagsInput extends StObject {
  
  /**
    * The ID of the pipeline.
    */
  var pipelineId: id = js.native
  
  /**
    * The tags to add, as key/value pairs.
    */
  var tags: tagList = js.native
}
object AddTagsInput {
  
  @scala.inline
  def apply(pipelineId: id, tags: tagList): AddTagsInput = {
    val __obj = js.Dynamic.literal(pipelineId = pipelineId.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddTagsInput]
  }
  
  @scala.inline
  implicit class AddTagsInputMutableBuilder[Self <: AddTagsInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPipelineId(value: id): Self = StObject.set(x, "pipelineId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTags(value: tagList): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = StObject.set(x, "tags", js.Array(value :_*))
  }
}
