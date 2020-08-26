package typings.awsSdk.workdocsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InitiateDocumentVersionUploadResponse extends js.Object {
  /**
    * The document metadata.
    */
  var Metadata: js.UndefOr[DocumentMetadata] = js.native
  /**
    * The upload metadata.
    */
  var UploadMetadata: js.UndefOr[typings.awsSdk.workdocsMod.UploadMetadata] = js.native
}

object InitiateDocumentVersionUploadResponse {
  @scala.inline
  def apply(): InitiateDocumentVersionUploadResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InitiateDocumentVersionUploadResponse]
  }
  @scala.inline
  implicit class InitiateDocumentVersionUploadResponseOps[Self <: InitiateDocumentVersionUploadResponse] (val x: Self) extends AnyVal {
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
    def setMetadata(value: DocumentMetadata): Self = this.set("Metadata", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMetadata: Self = this.set("Metadata", js.undefined)
    @scala.inline
    def setUploadMetadata(value: UploadMetadata): Self = this.set("UploadMetadata", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUploadMetadata: Self = this.set("UploadMetadata", js.undefined)
  }
  
}

