package typings.awsSdk.cloudwatcheventsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListTagsForResourceRequest extends StObject {
  
  /**
    * The ARN of the EventBridge resource for which you want to view tags.
    */
  var ResourceARN: Arn
}
object ListTagsForResourceRequest {
  
  inline def apply(ResourceARN: Arn): ListTagsForResourceRequest = {
    val __obj = js.Dynamic.literal(ResourceARN = ResourceARN.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListTagsForResourceRequest]
  }
  
  extension [Self <: ListTagsForResourceRequest](x: Self) {
    
    inline def setResourceARN(value: Arn): Self = StObject.set(x, "ResourceARN", value.asInstanceOf[js.Any])
  }
}
