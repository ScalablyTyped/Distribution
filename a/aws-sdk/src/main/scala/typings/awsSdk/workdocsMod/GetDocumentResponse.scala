package typings.awsSdk.workdocsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetDocumentResponse extends js.Object {
  /**
    * The custom metadata on the document.
    */
  var CustomMetadata: js.UndefOr[CustomMetadataMap] = js.native
  /**
    * The metadata details of the document.
    */
  var Metadata: js.UndefOr[DocumentMetadata] = js.native
}

object GetDocumentResponse {
  @scala.inline
  def apply(): GetDocumentResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetDocumentResponse]
  }
  @scala.inline
  implicit class GetDocumentResponseOps[Self <: GetDocumentResponse] (val x: Self) extends AnyVal {
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
    def setCustomMetadata(value: CustomMetadataMap): Self = this.set("CustomMetadata", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCustomMetadata: Self = this.set("CustomMetadata", js.undefined)
    @scala.inline
    def setMetadata(value: DocumentMetadata): Self = this.set("Metadata", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMetadata: Self = this.set("Metadata", js.undefined)
  }
  
}

