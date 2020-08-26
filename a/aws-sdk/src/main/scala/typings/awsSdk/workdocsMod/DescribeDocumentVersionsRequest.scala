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
  def apply(DocumentId: ResourceIdType): DescribeDocumentVersionsRequest = {
    val __obj = js.Dynamic.literal(DocumentId = DocumentId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeDocumentVersionsRequest]
  }
  @scala.inline
  implicit class DescribeDocumentVersionsRequestOps[Self <: DescribeDocumentVersionsRequest] (val x: Self) extends AnyVal {
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
    def setDocumentId(value: ResourceIdType): Self = this.set("DocumentId", value.asInstanceOf[js.Any])
    @scala.inline
    def setAuthenticationToken(value: AuthenticationHeaderType): Self = this.set("AuthenticationToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAuthenticationToken: Self = this.set("AuthenticationToken", js.undefined)
    @scala.inline
    def setFields(value: FieldNamesType): Self = this.set("Fields", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFields: Self = this.set("Fields", js.undefined)
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
  }
  
}

