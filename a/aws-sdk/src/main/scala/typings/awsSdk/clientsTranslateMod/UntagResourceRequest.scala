package typings.awsSdk.clientsTranslateMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UntagResourceRequest extends StObject {
  
  /**
    *  The Amazon Resource Name (ARN) of the given Amazon Translate resource from which you want to remove the tags. 
    */
  var ResourceArn: typings.awsSdk.clientsTranslateMod.ResourceArn
  
  /**
    * The initial part of a key-value pair that forms a tag being removed from a given resource. Keys must be unique and cannot be duplicated for a particular resource. 
    */
  var TagKeys: TagKeyList
}
object UntagResourceRequest {
  
  inline def apply(ResourceArn: ResourceArn, TagKeys: TagKeyList): UntagResourceRequest = {
    val __obj = js.Dynamic.literal(ResourceArn = ResourceArn.asInstanceOf[js.Any], TagKeys = TagKeys.asInstanceOf[js.Any])
    __obj.asInstanceOf[UntagResourceRequest]
  }
  
  extension [Self <: UntagResourceRequest](x: Self) {
    
    inline def setResourceArn(value: ResourceArn): Self = StObject.set(x, "ResourceArn", value.asInstanceOf[js.Any])
    
    inline def setTagKeys(value: TagKeyList): Self = StObject.set(x, "TagKeys", value.asInstanceOf[js.Any])
    
    inline def setTagKeysVarargs(value: TagKey*): Self = StObject.set(x, "TagKeys", js.Array(value*))
  }
}
