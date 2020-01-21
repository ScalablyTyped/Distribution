package typings.awsSdk.workdocsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateDocumentVersionRequest extends js.Object {
  /**
    * Amazon WorkDocs authentication token. Do not set this field when using administrative API actions, as in accessing the API using AWS credentials.
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
  def apply(
    DocumentId: ResourceIdType,
    VersionId: DocumentVersionIdType,
    AuthenticationToken: AuthenticationHeaderType = null,
    VersionStatus: DocumentVersionStatus = null
  ): UpdateDocumentVersionRequest = {
    val __obj = js.Dynamic.literal(DocumentId = DocumentId.asInstanceOf[js.Any], VersionId = VersionId.asInstanceOf[js.Any])
    if (AuthenticationToken != null) __obj.updateDynamic("AuthenticationToken")(AuthenticationToken.asInstanceOf[js.Any])
    if (VersionStatus != null) __obj.updateDynamic("VersionStatus")(VersionStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateDocumentVersionRequest]
  }
}

