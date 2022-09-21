package typings.awsSdk.codegurureviewerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UntagResourceRequest extends StObject {
  
  /**
    * A list of the keys for each tag you want to remove from an associated repository.
    */
  var TagKeys: TagKeyList
  
  /**
    * The Amazon Resource Name (ARN) of the RepositoryAssociation object. You can retrieve this ARN by calling ListRepositoryAssociations.
    */
  var resourceArn: AssociationArn
}
object UntagResourceRequest {
  
  inline def apply(TagKeys: TagKeyList, resourceArn: AssociationArn): UntagResourceRequest = {
    val __obj = js.Dynamic.literal(TagKeys = TagKeys.asInstanceOf[js.Any], resourceArn = resourceArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[UntagResourceRequest]
  }
  
  extension [Self <: UntagResourceRequest](x: Self) {
    
    inline def setResourceArn(value: AssociationArn): Self = StObject.set(x, "resourceArn", value.asInstanceOf[js.Any])
    
    inline def setTagKeys(value: TagKeyList): Self = StObject.set(x, "TagKeys", value.asInstanceOf[js.Any])
    
    inline def setTagKeysVarargs(value: TagKey*): Self = StObject.set(x, "TagKeys", js.Array(value*))
  }
}
