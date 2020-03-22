package typings.awsSdk.workdocsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AbortDocumentVersionUploadRequest extends js.Object {
  /**
    * Amazon WorkDocs authentication token. Not required when using AWS administrator credentials to access the API.
    */
  var AuthenticationToken: js.UndefOr[AuthenticationHeaderType] = js.native
  /**
    * The ID of the document.
    */
  var DocumentId: ResourceIdType = js.native
  /**
    * The ID of the version.
    */
  var VersionId: DocumentVersionIdType = js.native
}

object AbortDocumentVersionUploadRequest {
  @scala.inline
  def apply(
    DocumentId: ResourceIdType,
    VersionId: DocumentVersionIdType,
    AuthenticationToken: AuthenticationHeaderType = null
  ): AbortDocumentVersionUploadRequest = {
    val __obj = js.Dynamic.literal(DocumentId = DocumentId.asInstanceOf[js.Any], VersionId = VersionId.asInstanceOf[js.Any])
    if (AuthenticationToken != null) __obj.updateDynamic("AuthenticationToken")(AuthenticationToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[AbortDocumentVersionUploadRequest]
  }
}

