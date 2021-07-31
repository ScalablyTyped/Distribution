package typings.awsSdk.cloudfrontMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListTagsForResourceRequest extends StObject {
  
  /**
    *  An ARN of a CloudFront resource.
    */
  var Resource: ResourceARN
}
object ListTagsForResourceRequest {
  
  @scala.inline
  def apply(Resource: ResourceARN): ListTagsForResourceRequest = {
    val __obj = js.Dynamic.literal(Resource = Resource.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListTagsForResourceRequest]
  }
  
  @scala.inline
  implicit class ListTagsForResourceRequestMutableBuilder[Self <: ListTagsForResourceRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setResource(value: ResourceARN): Self = StObject.set(x, "Resource", value.asInstanceOf[js.Any])
  }
}
