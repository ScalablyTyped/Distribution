package typings.awsSdk.route53Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChangeTagsForResourceRequest extends StObject {
  
  /**
    * A complex type that contains a list of the tags that you want to add to the specified health check or hosted zone and/or the tags that you want to edit Value for. You can add a maximum of 10 tags to a health check or a hosted zone.
    */
  var AddTags: js.UndefOr[TagList] = js.undefined
  
  /**
    * A complex type that contains a list of the tags that you want to delete from the specified health check or hosted zone. You can specify up to 10 keys.
    */
  var RemoveTagKeys: js.UndefOr[TagKeyList] = js.undefined
  
  /**
    * The ID of the resource for which you want to add, change, or delete tags.
    */
  var ResourceId: TagResourceId
  
  /**
    * The type of the resource.   The resource type for health checks is healthcheck.   The resource type for hosted zones is hostedzone.  
    */
  var ResourceType: TagResourceType
}
object ChangeTagsForResourceRequest {
  
  @scala.inline
  def apply(ResourceId: TagResourceId, ResourceType: TagResourceType): ChangeTagsForResourceRequest = {
    val __obj = js.Dynamic.literal(ResourceId = ResourceId.asInstanceOf[js.Any], ResourceType = ResourceType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChangeTagsForResourceRequest]
  }
  
  @scala.inline
  implicit class ChangeTagsForResourceRequestMutableBuilder[Self <: ChangeTagsForResourceRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddTags(value: TagList): Self = StObject.set(x, "AddTags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddTagsUndefined: Self = StObject.set(x, "AddTags", js.undefined)
    
    @scala.inline
    def setAddTagsVarargs(value: Tag*): Self = StObject.set(x, "AddTags", js.Array(value :_*))
    
    @scala.inline
    def setRemoveTagKeys(value: TagKeyList): Self = StObject.set(x, "RemoveTagKeys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemoveTagKeysUndefined: Self = StObject.set(x, "RemoveTagKeys", js.undefined)
    
    @scala.inline
    def setRemoveTagKeysVarargs(value: TagKey*): Self = StObject.set(x, "RemoveTagKeys", js.Array(value :_*))
    
    @scala.inline
    def setResourceId(value: TagResourceId): Self = StObject.set(x, "ResourceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceType(value: TagResourceType): Self = StObject.set(x, "ResourceType", value.asInstanceOf[js.Any])
  }
}
