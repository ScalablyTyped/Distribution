package typings.awsSdk.workdocsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetDocumentRequest extends js.Object {
  /**
    * Amazon WorkDocs authentication token. Not required when using AWS administrator credentials to access the API.
    */
  var AuthenticationToken: js.UndefOr[AuthenticationHeaderType] = js.native
  /**
    * The ID of the document.
    */
  var DocumentId: ResourceIdType = js.native
  /**
    * Set this to TRUE to include custom metadata in the response.
    */
  var IncludeCustomMetadata: js.UndefOr[BooleanType] = js.native
}

object GetDocumentRequest {
  @scala.inline
  def apply(
    DocumentId: ResourceIdType,
    AuthenticationToken: AuthenticationHeaderType = null,
    IncludeCustomMetadata: js.UndefOr[BooleanType] = js.undefined
  ): GetDocumentRequest = {
    val __obj = js.Dynamic.literal(DocumentId = DocumentId.asInstanceOf[js.Any])
    if (AuthenticationToken != null) __obj.updateDynamic("AuthenticationToken")(AuthenticationToken.asInstanceOf[js.Any])
    if (!js.isUndefined(IncludeCustomMetadata)) __obj.updateDynamic("IncludeCustomMetadata")(IncludeCustomMetadata.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetDocumentRequest]
  }
}

