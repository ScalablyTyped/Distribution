package typings.awsSdk.clientsSwfMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UntagResourceInput extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) for the Amazon SWF domain.
    */
  var resourceArn: Arn
  
  /**
    * The list of tags to remove from the Amazon SWF domain.
    */
  var tagKeys: ResourceTagKeyList
}
object UntagResourceInput {
  
  inline def apply(resourceArn: Arn, tagKeys: ResourceTagKeyList): UntagResourceInput = {
    val __obj = js.Dynamic.literal(resourceArn = resourceArn.asInstanceOf[js.Any], tagKeys = tagKeys.asInstanceOf[js.Any])
    __obj.asInstanceOf[UntagResourceInput]
  }
  
  extension [Self <: UntagResourceInput](x: Self) {
    
    inline def setResourceArn(value: Arn): Self = StObject.set(x, "resourceArn", value.asInstanceOf[js.Any])
    
    inline def setTagKeys(value: ResourceTagKeyList): Self = StObject.set(x, "tagKeys", value.asInstanceOf[js.Any])
    
    inline def setTagKeysVarargs(value: ResourceTagKey*): Self = StObject.set(x, "tagKeys", js.Array(value*))
  }
}
