package typings.awsSdk.workdocsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeFolderContentsRequest extends js.Object {
  /**
    * Amazon WorkDocs authentication token. Not required when using AWS administrator credentials to access the API.
    */
  var AuthenticationToken: js.UndefOr[AuthenticationHeaderType] = js.native
  /**
    * The ID of the folder.
    */
  var FolderId: ResourceIdType = js.native
  /**
    * The contents to include. Specify "INITIALIZED" to include initialized documents.
    */
  var Include: js.UndefOr[FieldNamesType] = js.native
  /**
    * The maximum number of items to return with this call.
    */
  var Limit: js.UndefOr[LimitType] = js.native
  /**
    * The marker for the next set of results. This marker was received from a previous call.
    */
  var Marker: js.UndefOr[PageMarkerType] = js.native
  /**
    * The order for the contents of the folder.
    */
  var Order: js.UndefOr[OrderType] = js.native
  /**
    * The sorting criteria.
    */
  var Sort: js.UndefOr[ResourceSortType] = js.native
  /**
    * The type of items.
    */
  var Type: js.UndefOr[FolderContentType] = js.native
}

object DescribeFolderContentsRequest {
  @scala.inline
  def apply(FolderId: ResourceIdType): DescribeFolderContentsRequest = {
    val __obj = js.Dynamic.literal(FolderId = FolderId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeFolderContentsRequest]
  }
  @scala.inline
  implicit class DescribeFolderContentsRequestOps[Self <: DescribeFolderContentsRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setFolderId(value: ResourceIdType): Self = this.set("FolderId", value.asInstanceOf[js.Any])
    @scala.inline
    def setAuthenticationToken(value: AuthenticationHeaderType): Self = this.set("AuthenticationToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAuthenticationToken: Self = this.set("AuthenticationToken", js.undefined)
    @scala.inline
    def setInclude(value: FieldNamesType): Self = this.set("Include", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInclude: Self = this.set("Include", js.undefined)
    @scala.inline
    def setLimit(value: LimitType): Self = this.set("Limit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLimit: Self = this.set("Limit", js.undefined)
    @scala.inline
    def setMarker(value: PageMarkerType): Self = this.set("Marker", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMarker: Self = this.set("Marker", js.undefined)
    @scala.inline
    def setOrder(value: OrderType): Self = this.set("Order", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOrder: Self = this.set("Order", js.undefined)
    @scala.inline
    def setSort(value: ResourceSortType): Self = this.set("Sort", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSort: Self = this.set("Sort", js.undefined)
    @scala.inline
    def setType(value: FolderContentType): Self = this.set("Type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("Type", js.undefined)
  }
  
}

