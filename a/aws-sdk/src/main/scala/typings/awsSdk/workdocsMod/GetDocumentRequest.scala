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
  def apply(DocumentId: ResourceIdType): GetDocumentRequest = {
    val __obj = js.Dynamic.literal(DocumentId = DocumentId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetDocumentRequest]
  }
  @scala.inline
  implicit class GetDocumentRequestOps[Self <: GetDocumentRequest] (val x: Self) extends AnyVal {
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
    def setIncludeCustomMetadata(value: BooleanType): Self = this.set("IncludeCustomMetadata", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIncludeCustomMetadata: Self = this.set("IncludeCustomMetadata", js.undefined)
  }
  
}

