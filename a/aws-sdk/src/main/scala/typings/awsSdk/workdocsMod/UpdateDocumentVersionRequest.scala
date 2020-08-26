package typings.awsSdk.workdocsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateDocumentVersionRequest extends js.Object {
  /**
    * Amazon WorkDocs authentication token. Not required when using AWS administrator credentials to access the API.
    */
  var AuthenticationToken: js.UndefOr[AuthenticationHeaderType] = js.native
  /**
    * The ID of the document.
    */
  var DocumentId: ResourceIdType = js.native
  /**
    * The version ID of the document.
    */
  var VersionId: DocumentVersionIdType = js.native
  /**
    * The status of the version.
    */
  var VersionStatus: js.UndefOr[DocumentVersionStatus] = js.native
}

object UpdateDocumentVersionRequest {
  @scala.inline
  def apply(DocumentId: ResourceIdType, VersionId: DocumentVersionIdType): UpdateDocumentVersionRequest = {
    val __obj = js.Dynamic.literal(DocumentId = DocumentId.asInstanceOf[js.Any], VersionId = VersionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateDocumentVersionRequest]
  }
  @scala.inline
  implicit class UpdateDocumentVersionRequestOps[Self <: UpdateDocumentVersionRequest] (val x: Self) extends AnyVal {
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
    def setVersionId(value: DocumentVersionIdType): Self = this.set("VersionId", value.asInstanceOf[js.Any])
    @scala.inline
    def setAuthenticationToken(value: AuthenticationHeaderType): Self = this.set("AuthenticationToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAuthenticationToken: Self = this.set("AuthenticationToken", js.undefined)
    @scala.inline
    def setVersionStatus(value: DocumentVersionStatus): Self = this.set("VersionStatus", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVersionStatus: Self = this.set("VersionStatus", js.undefined)
  }
  
}

