package typings.awsSdk.servicecatalogMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListResourcesForTagOptionInput extends StObject {
  
  /**
    * The maximum number of items to return with this call.
    */
  var PageSize: js.UndefOr[typings.awsSdk.servicecatalogMod.PageSize] = js.undefined
  
  /**
    * The page token for the next set of results. To retrieve the first set of results, use null.
    */
  var PageToken: js.UndefOr[typings.awsSdk.servicecatalogMod.PageToken] = js.undefined
  
  /**
    * The resource type.    Portfolio     Product   
    */
  var ResourceType: js.UndefOr[typings.awsSdk.servicecatalogMod.ResourceType] = js.undefined
  
  /**
    * The TagOption identifier.
    */
  var TagOptionId: typings.awsSdk.servicecatalogMod.TagOptionId
}
object ListResourcesForTagOptionInput {
  
  @scala.inline
  def apply(TagOptionId: TagOptionId): ListResourcesForTagOptionInput = {
    val __obj = js.Dynamic.literal(TagOptionId = TagOptionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListResourcesForTagOptionInput]
  }
  
  @scala.inline
  implicit class ListResourcesForTagOptionInputMutableBuilder[Self <: ListResourcesForTagOptionInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPageSize(value: PageSize): Self = StObject.set(x, "PageSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageSizeUndefined: Self = StObject.set(x, "PageSize", js.undefined)
    
    @scala.inline
    def setPageToken(value: PageToken): Self = StObject.set(x, "PageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageTokenUndefined: Self = StObject.set(x, "PageToken", js.undefined)
    
    @scala.inline
    def setResourceType(value: ResourceType): Self = StObject.set(x, "ResourceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceTypeUndefined: Self = StObject.set(x, "ResourceType", js.undefined)
    
    @scala.inline
    def setTagOptionId(value: TagOptionId): Self = StObject.set(x, "TagOptionId", value.asInstanceOf[js.Any])
  }
}
