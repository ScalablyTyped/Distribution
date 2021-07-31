package typings.awsSdk.workdocsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeFolderContentsRequest extends StObject {
  
  /**
    * Amazon WorkDocs authentication token. Not required when using AWS administrator credentials to access the API.
    */
  var AuthenticationToken: js.UndefOr[AuthenticationHeaderType] = js.undefined
  
  /**
    * The ID of the folder.
    */
  var FolderId: ResourceIdType
  
  /**
    * The contents to include. Specify "INITIALIZED" to include initialized documents.
    */
  var Include: js.UndefOr[FieldNamesType] = js.undefined
  
  /**
    * The maximum number of items to return with this call.
    */
  var Limit: js.UndefOr[LimitType] = js.undefined
  
  /**
    * The marker for the next set of results. This marker was received from a previous call.
    */
  var Marker: js.UndefOr[PageMarkerType] = js.undefined
  
  /**
    * The order for the contents of the folder.
    */
  var Order: js.UndefOr[OrderType] = js.undefined
  
  /**
    * The sorting criteria.
    */
  var Sort: js.UndefOr[ResourceSortType] = js.undefined
  
  /**
    * The type of items.
    */
  var Type: js.UndefOr[FolderContentType] = js.undefined
}
object DescribeFolderContentsRequest {
  
  @scala.inline
  def apply(FolderId: ResourceIdType): DescribeFolderContentsRequest = {
    val __obj = js.Dynamic.literal(FolderId = FolderId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeFolderContentsRequest]
  }
  
  @scala.inline
  implicit class DescribeFolderContentsRequestMutableBuilder[Self <: DescribeFolderContentsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuthenticationToken(value: AuthenticationHeaderType): Self = StObject.set(x, "AuthenticationToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthenticationTokenUndefined: Self = StObject.set(x, "AuthenticationToken", js.undefined)
    
    @scala.inline
    def setFolderId(value: ResourceIdType): Self = StObject.set(x, "FolderId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInclude(value: FieldNamesType): Self = StObject.set(x, "Include", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludeUndefined: Self = StObject.set(x, "Include", js.undefined)
    
    @scala.inline
    def setLimit(value: LimitType): Self = StObject.set(x, "Limit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLimitUndefined: Self = StObject.set(x, "Limit", js.undefined)
    
    @scala.inline
    def setMarker(value: PageMarkerType): Self = StObject.set(x, "Marker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarkerUndefined: Self = StObject.set(x, "Marker", js.undefined)
    
    @scala.inline
    def setOrder(value: OrderType): Self = StObject.set(x, "Order", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrderUndefined: Self = StObject.set(x, "Order", js.undefined)
    
    @scala.inline
    def setSort(value: ResourceSortType): Self = StObject.set(x, "Sort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSortUndefined: Self = StObject.set(x, "Sort", js.undefined)
    
    @scala.inline
    def setType(value: FolderContentType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
  }
}
