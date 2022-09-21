package typings.awsSdk.opensearchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RemoveTagsRequest extends StObject {
  
  /**
    * The ARN of the domain from which you want to delete the specified tags. 
    */
  var ARN: typings.awsSdk.opensearchMod.ARN
  
  /**
    * The TagKey list you want to remove from the domain. 
    */
  var TagKeys: StringList
}
object RemoveTagsRequest {
  
  inline def apply(ARN: ARN, TagKeys: StringList): RemoveTagsRequest = {
    val __obj = js.Dynamic.literal(ARN = ARN.asInstanceOf[js.Any], TagKeys = TagKeys.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemoveTagsRequest]
  }
  
  extension [Self <: RemoveTagsRequest](x: Self) {
    
    inline def setARN(value: ARN): Self = StObject.set(x, "ARN", value.asInstanceOf[js.Any])
    
    inline def setTagKeys(value: StringList): Self = StObject.set(x, "TagKeys", value.asInstanceOf[js.Any])
    
    inline def setTagKeysVarargs(value: String*): Self = StObject.set(x, "TagKeys", js.Array(value*))
  }
}
