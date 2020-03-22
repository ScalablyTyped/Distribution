package typings.awsSdk.workdocsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeDocumentVersionsRequest extends js.Object {
  /**
    * Amazon WorkDocs authentication token. Not required when using AWS administrator credentials to access the API.
    */
  var AuthenticationToken: js.UndefOr[AuthenticationHeaderType] = js.native
  /**
    * The ID of the document.
    */
  var DocumentId: ResourceIdType = js.native
  /**
    * Specify "SOURCE" to include initialized versions and a URL for the source document.
    */
  var Fields: js.UndefOr[FieldNamesType] = js.native
  /**
    * A comma-separated list of values. Specify "INITIALIZED" to include incomplete versions.
    */
  var Include: js.UndefOr[FieldNamesType] = js.native
  /**
    * The maximum number of versions to return with this call.
    */
  var Limit: js.UndefOr[LimitType] = js.native
  /**
    * The marker for the next set of results. (You received this marker from a previous call.)
    */
  var Marker: js.UndefOr[PageMarkerType] = js.native
}

object DescribeDocumentVersionsRequest {
  @scala.inline
  def apply(
    DocumentId: ResourceIdType,
    AuthenticationToken: AuthenticationHeaderType = null,
    Fields: FieldNamesType = null,
    Include: FieldNamesType = null,
    Limit: Int | Double = null,
    Marker: PageMarkerType = null
  ): DescribeDocumentVersionsRequest = {
    val __obj = js.Dynamic.literal(DocumentId = DocumentId.asInstanceOf[js.Any])
    if (AuthenticationToken != null) __obj.updateDynamic("AuthenticationToken")(AuthenticationToken.asInstanceOf[js.Any])
    if (Fields != null) __obj.updateDynamic("Fields")(Fields.asInstanceOf[js.Any])
    if (Include != null) __obj.updateDynamic("Include")(Include.asInstanceOf[js.Any])
    if (Limit != null) __obj.updateDynamic("Limit")(Limit.asInstanceOf[js.Any])
    if (Marker != null) __obj.updateDynamic("Marker")(Marker.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeDocumentVersionsRequest]
  }
}

