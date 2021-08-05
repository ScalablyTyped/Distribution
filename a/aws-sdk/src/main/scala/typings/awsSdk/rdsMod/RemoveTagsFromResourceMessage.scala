package typings.awsSdk.rdsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RemoveTagsFromResourceMessage extends StObject {
  
  /**
    * The Amazon RDS resource that the tags are removed from. This value is an Amazon Resource Name (ARN). For information about creating an ARN, see  Constructing an ARN for Amazon RDS in the Amazon RDS User Guide. 
    */
  var ResourceName: String
  
  /**
    * The tag key (name) of the tag to be removed.
    */
  var TagKeys: KeyList
}
object RemoveTagsFromResourceMessage {
  
  inline def apply(ResourceName: String, TagKeys: KeyList): RemoveTagsFromResourceMessage = {
    val __obj = js.Dynamic.literal(ResourceName = ResourceName.asInstanceOf[js.Any], TagKeys = TagKeys.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemoveTagsFromResourceMessage]
  }
  
  extension [Self <: RemoveTagsFromResourceMessage](x: Self) {
    
    inline def setResourceName(value: String): Self = StObject.set(x, "ResourceName", value.asInstanceOf[js.Any])
    
    inline def setTagKeys(value: KeyList): Self = StObject.set(x, "TagKeys", value.asInstanceOf[js.Any])
    
    inline def setTagKeysVarargs(value: String*): Self = StObject.set(x, "TagKeys", js.Array(value :_*))
  }
}
