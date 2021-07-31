package typings.awsSdk.ssmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AddTagsToResourceRequest extends StObject {
  
  /**
    * The resource ID you want to tag. Use the ID of the resource. Here are some examples: ManagedInstance: mi-012345abcde MaintenanceWindow: mw-012345abcde PatchBaseline: pb-012345abcde For the Document and Parameter values, use the name of the resource.  The ManagedInstance type for this API action is only for on-premises managed instances. You must specify the name of the managed instance in the following format: mi-ID_number. For example, mi-1a2b3c4d5e6f. 
    */
  var ResourceId: typings.awsSdk.ssmMod.ResourceId
  
  /**
    * Specifies the type of resource you are tagging.  The ManagedInstance type for this API action is for on-premises managed instances. You must specify the name of the managed instance in the following format: mi-ID_number. For example, mi-1a2b3c4d5e6f. 
    */
  var ResourceType: ResourceTypeForTagging
  
  /**
    *  One or more tags. The value parameter is required, but if you don't want the tag to have a value, specify the parameter with no value, and we set the value to an empty string.   Do not enter personally identifiable information in this field. 
    */
  var Tags: TagList
}
object AddTagsToResourceRequest {
  
  @scala.inline
  def apply(ResourceId: ResourceId, ResourceType: ResourceTypeForTagging, Tags: TagList): AddTagsToResourceRequest = {
    val __obj = js.Dynamic.literal(ResourceId = ResourceId.asInstanceOf[js.Any], ResourceType = ResourceType.asInstanceOf[js.Any], Tags = Tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddTagsToResourceRequest]
  }
  
  @scala.inline
  implicit class AddTagsToResourceRequestMutableBuilder[Self <: AddTagsToResourceRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setResourceId(value: ResourceId): Self = StObject.set(x, "ResourceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceType(value: ResourceTypeForTagging): Self = StObject.set(x, "ResourceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value :_*))
  }
}
