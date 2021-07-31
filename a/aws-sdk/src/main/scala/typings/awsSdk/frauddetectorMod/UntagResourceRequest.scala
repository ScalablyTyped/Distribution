package typings.awsSdk.frauddetectorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UntagResourceRequest extends StObject {
  
  /**
    * The ARN of the resource from which to remove the tag.
    */
  var resourceARN: fraudDetectorArn
  
  /**
    * The resource ARN.
    */
  var tagKeys: tagKeyList
}
object UntagResourceRequest {
  
  @scala.inline
  def apply(resourceARN: fraudDetectorArn, tagKeys: tagKeyList): UntagResourceRequest = {
    val __obj = js.Dynamic.literal(resourceARN = resourceARN.asInstanceOf[js.Any], tagKeys = tagKeys.asInstanceOf[js.Any])
    __obj.asInstanceOf[UntagResourceRequest]
  }
  
  @scala.inline
  implicit class UntagResourceRequestMutableBuilder[Self <: UntagResourceRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setResourceARN(value: fraudDetectorArn): Self = StObject.set(x, "resourceARN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagKeys(value: tagKeyList): Self = StObject.set(x, "tagKeys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagKeysVarargs(value: tagKey*): Self = StObject.set(x, "tagKeys", js.Array(value :_*))
  }
}
