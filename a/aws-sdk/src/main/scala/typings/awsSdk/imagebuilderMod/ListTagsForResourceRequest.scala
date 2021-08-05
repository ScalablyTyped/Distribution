package typings.awsSdk.imagebuilderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListTagsForResourceRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the resource whose tags you want to retrieve. 
    */
  var resourceArn: ImageBuilderArn
}
object ListTagsForResourceRequest {
  
  inline def apply(resourceArn: ImageBuilderArn): ListTagsForResourceRequest = {
    val __obj = js.Dynamic.literal(resourceArn = resourceArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListTagsForResourceRequest]
  }
  
  extension [Self <: ListTagsForResourceRequest](x: Self) {
    
    inline def setResourceArn(value: ImageBuilderArn): Self = StObject.set(x, "resourceArn", value.asInstanceOf[js.Any])
  }
}
