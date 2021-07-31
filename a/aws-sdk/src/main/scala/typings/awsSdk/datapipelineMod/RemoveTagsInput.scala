package typings.awsSdk.datapipelineMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RemoveTagsInput extends StObject {
  
  /**
    * The ID of the pipeline.
    */
  var pipelineId: id
  
  /**
    * The keys of the tags to remove.
    */
  var tagKeys: stringList
}
object RemoveTagsInput {
  
  @scala.inline
  def apply(pipelineId: id, tagKeys: stringList): RemoveTagsInput = {
    val __obj = js.Dynamic.literal(pipelineId = pipelineId.asInstanceOf[js.Any], tagKeys = tagKeys.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemoveTagsInput]
  }
  
  @scala.inline
  implicit class RemoveTagsInputMutableBuilder[Self <: RemoveTagsInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPipelineId(value: id): Self = StObject.set(x, "pipelineId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagKeys(value: stringList): Self = StObject.set(x, "tagKeys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagKeysVarargs(value: String*): Self = StObject.set(x, "tagKeys", js.Array(value :_*))
  }
}
