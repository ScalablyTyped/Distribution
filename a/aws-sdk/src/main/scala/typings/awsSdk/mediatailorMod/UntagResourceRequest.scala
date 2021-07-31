package typings.awsSdk.mediatailorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UntagResourceRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) for the playback configuration. You can get this from the response to any playback configuration request. 
    */
  var ResourceArn: string
  
  /**
    * A comma-separated list of the tag keys to remove from the playback configuration. 
    */
  var TagKeys: listOfString
}
object UntagResourceRequest {
  
  @scala.inline
  def apply(ResourceArn: string, TagKeys: listOfString): UntagResourceRequest = {
    val __obj = js.Dynamic.literal(ResourceArn = ResourceArn.asInstanceOf[js.Any], TagKeys = TagKeys.asInstanceOf[js.Any])
    __obj.asInstanceOf[UntagResourceRequest]
  }
  
  @scala.inline
  implicit class UntagResourceRequestMutableBuilder[Self <: UntagResourceRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setResourceArn(value: string): Self = StObject.set(x, "ResourceArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagKeys(value: listOfString): Self = StObject.set(x, "TagKeys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagKeysVarargs(value: string*): Self = StObject.set(x, "TagKeys", js.Array(value :_*))
  }
}
