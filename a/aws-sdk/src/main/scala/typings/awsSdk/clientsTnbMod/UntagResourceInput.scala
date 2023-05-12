package typings.awsSdk.clientsTnbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UntagResourceInput extends StObject {
  
  /**
    * Resource ARN.
    */
  var resourceArn: TNBResourceArn
  
  /**
    * Tag keys.
    */
  var tagKeys: TagKeys
}
object UntagResourceInput {
  
  inline def apply(resourceArn: TNBResourceArn, tagKeys: TagKeys): UntagResourceInput = {
    val __obj = js.Dynamic.literal(resourceArn = resourceArn.asInstanceOf[js.Any], tagKeys = tagKeys.asInstanceOf[js.Any])
    __obj.asInstanceOf[UntagResourceInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UntagResourceInput] (val x: Self) extends AnyVal {
    
    inline def setResourceArn(value: TNBResourceArn): Self = StObject.set(x, "resourceArn", value.asInstanceOf[js.Any])
    
    inline def setTagKeys(value: TagKeys): Self = StObject.set(x, "tagKeys", value.asInstanceOf[js.Any])
    
    inline def setTagKeysVarargs(value: TagKey*): Self = StObject.set(x, "tagKeys", js.Array(value*))
  }
}
