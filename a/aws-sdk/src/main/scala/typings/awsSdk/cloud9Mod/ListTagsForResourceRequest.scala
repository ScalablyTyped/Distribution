package typings.awsSdk.cloud9Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListTagsForResourceRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the Cloud9 development environment to get the tags for.
    */
  var ResourceARN: EnvironmentArn
}
object ListTagsForResourceRequest {
  
  inline def apply(ResourceARN: EnvironmentArn): ListTagsForResourceRequest = {
    val __obj = js.Dynamic.literal(ResourceARN = ResourceARN.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListTagsForResourceRequest]
  }
  
  extension [Self <: ListTagsForResourceRequest](x: Self) {
    
    inline def setResourceARN(value: EnvironmentArn): Self = StObject.set(x, "ResourceARN", value.asInstanceOf[js.Any])
  }
}
