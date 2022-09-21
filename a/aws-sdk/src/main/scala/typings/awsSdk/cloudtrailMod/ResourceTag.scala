package typings.awsSdk.cloudtrailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResourceTag extends StObject {
  
  /**
    * Specifies the ARN of the resource.
    */
  var ResourceId: js.UndefOr[String] = js.undefined
  
  /**
    * A list of tags.
    */
  var TagsList: js.UndefOr[typings.awsSdk.cloudtrailMod.TagsList] = js.undefined
}
object ResourceTag {
  
  inline def apply(): ResourceTag = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResourceTag]
  }
  
  extension [Self <: ResourceTag](x: Self) {
    
    inline def setResourceId(value: String): Self = StObject.set(x, "ResourceId", value.asInstanceOf[js.Any])
    
    inline def setResourceIdUndefined: Self = StObject.set(x, "ResourceId", js.undefined)
    
    inline def setTagsList(value: TagsList): Self = StObject.set(x, "TagsList", value.asInstanceOf[js.Any])
    
    inline def setTagsListUndefined: Self = StObject.set(x, "TagsList", js.undefined)
    
    inline def setTagsListVarargs(value: Tag*): Self = StObject.set(x, "TagsList", js.Array(value*))
  }
}
