package typings.awsSdk.workdocsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetDocumentVersionRequest extends js.Object {
  /**
    * Amazon WorkDocs authentication token. Not required when using AWS administrator credentials to access the API.
    */
  var AuthenticationToken: js.UndefOr[AuthenticationHeaderType] = js.native
  /**
    * The ID of the document.
    */
  var DocumentId: ResourceIdType = js.native
  /**
    * A comma-separated list of values. Specify "SOURCE" to include a URL for the source document.
    */
  var Fields: js.UndefOr[FieldNamesType] = js.native
  /**
    * Set this to TRUE to include custom metadata in the response.
    */
  var IncludeCustomMetadata: js.UndefOr[BooleanType] = js.native
  /**
    * The version ID of the document.
    */
  var VersionId: DocumentVersionIdType = js.native
}

object GetDocumentVersionRequest {
  @scala.inline
  def apply(
    DocumentId: ResourceIdType,
    VersionId: DocumentVersionIdType,
    AuthenticationToken: AuthenticationHeaderType = null,
    Fields: FieldNamesType = null,
    IncludeCustomMetadata: js.UndefOr[BooleanType] = js.undefined
  ): GetDocumentVersionRequest = {
    val __obj = js.Dynamic.literal(DocumentId = DocumentId.asInstanceOf[js.Any], VersionId = VersionId.asInstanceOf[js.Any])
    if (AuthenticationToken != null) __obj.updateDynamic("AuthenticationToken")(AuthenticationToken.asInstanceOf[js.Any])
    if (Fields != null) __obj.updateDynamic("Fields")(Fields.asInstanceOf[js.Any])
    if (!js.isUndefined(IncludeCustomMetadata)) __obj.updateDynamic("IncludeCustomMetadata")(IncludeCustomMetadata.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetDocumentVersionRequest]
  }
}

