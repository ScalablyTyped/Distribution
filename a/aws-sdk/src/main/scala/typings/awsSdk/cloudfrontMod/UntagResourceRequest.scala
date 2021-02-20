package typings.awsSdk.cloudfrontMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UntagResourceRequest extends StObject {
  
  /**
    *  An ARN of a CloudFront resource.
    */
  var Resource: ResourceARN = js.native
  
  /**
    *  A complex type that contains zero or more Tag key elements.
    */
  var TagKeys: typings.awsSdk.cloudfrontMod.TagKeys = js.native
}
object UntagResourceRequest {
  
  @scala.inline
  def apply(Resource: ResourceARN, TagKeys: TagKeys): UntagResourceRequest = {
    val __obj = js.Dynamic.literal(Resource = Resource.asInstanceOf[js.Any], TagKeys = TagKeys.asInstanceOf[js.Any])
    __obj.asInstanceOf[UntagResourceRequest]
  }
  
  @scala.inline
  implicit class UntagResourceRequestMutableBuilder[Self <: UntagResourceRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setResource(value: ResourceARN): Self = StObject.set(x, "Resource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagKeys(value: TagKeys): Self = StObject.set(x, "TagKeys", value.asInstanceOf[js.Any])
  }
}
