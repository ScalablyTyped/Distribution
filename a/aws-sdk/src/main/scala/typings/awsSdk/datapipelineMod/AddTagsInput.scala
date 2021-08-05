package typings.awsSdk.datapipelineMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AddTagsInput extends StObject {
  
  /**
    * The ID of the pipeline.
    */
  var pipelineId: id
  
  /**
    * The tags to add, as key/value pairs.
    */
  var tags: tagList
}
object AddTagsInput {
  
  inline def apply(pipelineId: id, tags: tagList): AddTagsInput = {
    val __obj = js.Dynamic.literal(pipelineId = pipelineId.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddTagsInput]
  }
  
  extension [Self <: AddTagsInput](x: Self) {
    
    inline def setPipelineId(value: id): Self = StObject.set(x, "pipelineId", value.asInstanceOf[js.Any])
    
    inline def setTags(value: tagList): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "tags", js.Array(value :_*))
  }
}
