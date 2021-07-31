package typings.awsSdk.glueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UntagResourceRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the resource from which to remove the tags.
    */
  var ResourceArn: GlueResourceArn
  
  /**
    * Tags to remove from this resource.
    */
  var TagsToRemove: TagKeysList
}
object UntagResourceRequest {
  
  @scala.inline
  def apply(ResourceArn: GlueResourceArn, TagsToRemove: TagKeysList): UntagResourceRequest = {
    val __obj = js.Dynamic.literal(ResourceArn = ResourceArn.asInstanceOf[js.Any], TagsToRemove = TagsToRemove.asInstanceOf[js.Any])
    __obj.asInstanceOf[UntagResourceRequest]
  }
  
  @scala.inline
  implicit class UntagResourceRequestMutableBuilder[Self <: UntagResourceRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setResourceArn(value: GlueResourceArn): Self = StObject.set(x, "ResourceArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsToRemove(value: TagKeysList): Self = StObject.set(x, "TagsToRemove", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsToRemoveVarargs(value: TagKey*): Self = StObject.set(x, "TagsToRemove", js.Array(value :_*))
  }
}
