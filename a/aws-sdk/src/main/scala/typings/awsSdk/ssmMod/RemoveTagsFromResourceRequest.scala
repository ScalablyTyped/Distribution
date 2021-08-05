package typings.awsSdk.ssmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RemoveTagsFromResourceRequest extends StObject {
  
  /**
    * The ID of the resource from which you want to remove tags. For example: ManagedInstance: mi-012345abcde MaintenanceWindow: mw-012345abcde PatchBaseline: pb-012345abcde For the Document and Parameter values, use the name of the resource.  The ManagedInstance type for this API action is only for on-premises managed instances. Specify the name of the managed instance in the following format: mi-ID_number. For example, mi-1a2b3c4d5e6f. 
    */
  var ResourceId: typings.awsSdk.ssmMod.ResourceId
  
  /**
    * The type of resource from which you want to remove a tag.  The ManagedInstance type for this API action is only for on-premises managed instances. Specify the name of the managed instance in the following format: mi-ID_number. For example, mi-1a2b3c4d5e6f. 
    */
  var ResourceType: ResourceTypeForTagging
  
  /**
    * Tag keys that you want to remove from the specified resource.
    */
  var TagKeys: KeyList
}
object RemoveTagsFromResourceRequest {
  
  inline def apply(ResourceId: ResourceId, ResourceType: ResourceTypeForTagging, TagKeys: KeyList): RemoveTagsFromResourceRequest = {
    val __obj = js.Dynamic.literal(ResourceId = ResourceId.asInstanceOf[js.Any], ResourceType = ResourceType.asInstanceOf[js.Any], TagKeys = TagKeys.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemoveTagsFromResourceRequest]
  }
  
  extension [Self <: RemoveTagsFromResourceRequest](x: Self) {
    
    inline def setResourceId(value: ResourceId): Self = StObject.set(x, "ResourceId", value.asInstanceOf[js.Any])
    
    inline def setResourceType(value: ResourceTypeForTagging): Self = StObject.set(x, "ResourceType", value.asInstanceOf[js.Any])
    
    inline def setTagKeys(value: KeyList): Self = StObject.set(x, "TagKeys", value.asInstanceOf[js.Any])
    
    inline def setTagKeysVarargs(value: TagKey*): Self = StObject.set(x, "TagKeys", js.Array(value :_*))
  }
}
