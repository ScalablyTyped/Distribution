package typings.awsSdk.docdbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AddTagsToResourceMessage extends StObject {
  
  /**
    * The Amazon DocumentDB resource that the tags are added to. This value is an Amazon Resource Name .
    */
  var ResourceName: String
  
  /**
    * The tags to be assigned to the Amazon DocumentDB resource.
    */
  var Tags: TagList
}
object AddTagsToResourceMessage {
  
  inline def apply(ResourceName: String, Tags: TagList): AddTagsToResourceMessage = {
    val __obj = js.Dynamic.literal(ResourceName = ResourceName.asInstanceOf[js.Any], Tags = Tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddTagsToResourceMessage]
  }
  
  extension [Self <: AddTagsToResourceMessage](x: Self) {
    
    inline def setResourceName(value: String): Self = StObject.set(x, "ResourceName", value.asInstanceOf[js.Any])
    
    inline def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value :_*))
  }
}
