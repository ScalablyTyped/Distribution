package typings.awsSdk.groundstationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UntagResourceRequest extends StObject {
  
  /**
    * ARN of a resource.
    */
  var resourceArn: String
  
  /**
    * Keys of a resource tag.
    */
  var tagKeys: TagKeys
}
object UntagResourceRequest {
  
  @scala.inline
  def apply(resourceArn: String, tagKeys: TagKeys): UntagResourceRequest = {
    val __obj = js.Dynamic.literal(resourceArn = resourceArn.asInstanceOf[js.Any], tagKeys = tagKeys.asInstanceOf[js.Any])
    __obj.asInstanceOf[UntagResourceRequest]
  }
  
  @scala.inline
  implicit class UntagResourceRequestMutableBuilder[Self <: UntagResourceRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setResourceArn(value: String): Self = StObject.set(x, "resourceArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagKeys(value: TagKeys): Self = StObject.set(x, "tagKeys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagKeysVarargs(value: String*): Self = StObject.set(x, "tagKeys", js.Array(value :_*))
  }
}
