package typings.awsSdk.clientsSwfMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListTagsForResourceInput extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) for the Amazon SWF domain.
    */
  var resourceArn: Arn
}
object ListTagsForResourceInput {
  
  inline def apply(resourceArn: Arn): ListTagsForResourceInput = {
    val __obj = js.Dynamic.literal(resourceArn = resourceArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListTagsForResourceInput]
  }
  
  extension [Self <: ListTagsForResourceInput](x: Self) {
    
    inline def setResourceArn(value: Arn): Self = StObject.set(x, "resourceArn", value.asInstanceOf[js.Any])
  }
}
