package typings.awsSdk.clientsTranslateMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListTagsForResourceRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the given Amazon Translate resource you are querying. 
    */
  var ResourceArn: typings.awsSdk.clientsTranslateMod.ResourceArn
}
object ListTagsForResourceRequest {
  
  inline def apply(ResourceArn: ResourceArn): ListTagsForResourceRequest = {
    val __obj = js.Dynamic.literal(ResourceArn = ResourceArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListTagsForResourceRequest]
  }
  
  extension [Self <: ListTagsForResourceRequest](x: Self) {
    
    inline def setResourceArn(value: ResourceArn): Self = StObject.set(x, "ResourceArn", value.asInstanceOf[js.Any])
  }
}
