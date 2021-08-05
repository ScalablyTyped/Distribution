package typings.awsSdk.machinelearningMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteTagsInput extends StObject {
  
  /**
    * The ID of the tagged ML object. For example, exampleModelId.
    */
  var ResourceId: EntityId
  
  /**
    * The type of the tagged ML object.
    */
  var ResourceType: TaggableResourceType
  
  /**
    * One or more tags to delete.
    */
  var TagKeys: TagKeyList
}
object DeleteTagsInput {
  
  inline def apply(ResourceId: EntityId, ResourceType: TaggableResourceType, TagKeys: TagKeyList): DeleteTagsInput = {
    val __obj = js.Dynamic.literal(ResourceId = ResourceId.asInstanceOf[js.Any], ResourceType = ResourceType.asInstanceOf[js.Any], TagKeys = TagKeys.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteTagsInput]
  }
  
  extension [Self <: DeleteTagsInput](x: Self) {
    
    inline def setResourceId(value: EntityId): Self = StObject.set(x, "ResourceId", value.asInstanceOf[js.Any])
    
    inline def setResourceType(value: TaggableResourceType): Self = StObject.set(x, "ResourceType", value.asInstanceOf[js.Any])
    
    inline def setTagKeys(value: TagKeyList): Self = StObject.set(x, "TagKeys", value.asInstanceOf[js.Any])
    
    inline def setTagKeysVarargs(value: TagKey*): Self = StObject.set(x, "TagKeys", js.Array(value :_*))
  }
}
