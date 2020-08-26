package typings.awsSdk.workdocsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeDocumentVersionsResponse extends js.Object {
  /**
    * The document versions.
    */
  var DocumentVersions: js.UndefOr[DocumentVersionMetadataList] = js.native
  /**
    * The marker to use when requesting the next set of results. If there are no additional results, the string is empty.
    */
  var Marker: js.UndefOr[PageMarkerType] = js.native
}

object DescribeDocumentVersionsResponse {
  @scala.inline
  def apply(): DescribeDocumentVersionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeDocumentVersionsResponse]
  }
  @scala.inline
  implicit class DescribeDocumentVersionsResponseOps[Self <: DescribeDocumentVersionsResponse] (val x: Self) extends AnyVal {
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
    def setDocumentVersionsVarargs(value: DocumentVersionMetadata*): Self = this.set("DocumentVersions", js.Array(value :_*))
    @scala.inline
    def setDocumentVersions(value: DocumentVersionMetadataList): Self = this.set("DocumentVersions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDocumentVersions: Self = this.set("DocumentVersions", js.undefined)
    @scala.inline
    def setMarker(value: PageMarkerType): Self = this.set("Marker", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMarker: Self = this.set("Marker", js.undefined)
  }
  
}

