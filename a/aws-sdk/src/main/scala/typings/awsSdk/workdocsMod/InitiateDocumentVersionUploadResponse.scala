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
  def apply(Metadata: DocumentMetadata = null, UploadMetadata: UploadMetadata = null): InitiateDocumentVersionUploadResponse = {
    val __obj = js.Dynamic.literal()
    if (Metadata != null) __obj.updateDynamic("Metadata")(Metadata.asInstanceOf[js.Any])
    if (UploadMetadata != null) __obj.updateDynamic("UploadMetadata")(UploadMetadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[InitiateDocumentVersionUploadResponse]
  }
}

