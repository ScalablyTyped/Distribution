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
  def apply(
    FolderId: ResourceIdType,
    AuthenticationToken: AuthenticationHeaderType = null,
    Include: FieldNamesType = null,
    Limit: Int | Double = null,
    Marker: PageMarkerType = null,
    Order: OrderType = null,
    Sort: ResourceSortType = null,
    Type: FolderContentType = null
  ): DescribeFolderContentsRequest = {
    val __obj = js.Dynamic.literal(FolderId = FolderId.asInstanceOf[js.Any])
    if (AuthenticationToken != null) __obj.updateDynamic("AuthenticationToken")(AuthenticationToken.asInstanceOf[js.Any])
    if (Include != null) __obj.updateDynamic("Include")(Include.asInstanceOf[js.Any])
    if (Limit != null) __obj.updateDynamic("Limit")(Limit.asInstanceOf[js.Any])
    if (Marker != null) __obj.updateDynamic("Marker")(Marker.asInstanceOf[js.Any])
    if (Order != null) __obj.updateDynamic("Order")(Order.asInstanceOf[js.Any])
    if (Sort != null) __obj.updateDynamic("Sort")(Sort.asInstanceOf[js.Any])
    if (Type != null) __obj.updateDynamic("Type")(Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeFolderContentsRequest]
  }
}

