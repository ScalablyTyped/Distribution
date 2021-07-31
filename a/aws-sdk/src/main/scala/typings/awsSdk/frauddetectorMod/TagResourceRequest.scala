package typings.awsSdk.frauddetectorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TagResourceRequest extends StObject {
  
  /**
    * The resource ARN.
    */
  var resourceARN: fraudDetectorArn
  
  /**
    * The tags to assign to the resource.
    */
  var tags: tagList
}
object TagResourceRequest {
  
  @scala.inline
  def apply(resourceARN: fraudDetectorArn, tags: tagList): TagResourceRequest = {
    val __obj = js.Dynamic.literal(resourceARN = resourceARN.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[TagResourceRequest]
  }
  
  @scala.inline
  implicit class TagResourceRequestMutableBuilder[Self <: TagResourceRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setResourceARN(value: fraudDetectorArn): Self = StObject.set(x, "resourceARN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTags(value: tagList): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = StObject.set(x, "tags", js.Array(value :_*))
  }
}
