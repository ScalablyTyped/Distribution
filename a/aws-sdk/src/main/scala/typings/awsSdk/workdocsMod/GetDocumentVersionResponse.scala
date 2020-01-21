package typings.awsSdk.workdocsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetDocumentVersionResponse extends js.Object {
  /**
    * The custom metadata on the document version.
    */
  var CustomMetadata: js.UndefOr[CustomMetadataMap] = js.native
  /**
    * The version metadata.
    */
  var Metadata: js.UndefOr[DocumentVersionMetadata] = js.native
}

object GetDocumentVersionResponse {
  @scala.inline
  def apply(CustomMetadata: CustomMetadataMap = null, Metadata: DocumentVersionMetadata = null): GetDocumentVersionResponse = {
    val __obj = js.Dynamic.literal()
    if (CustomMetadata != null) __obj.updateDynamic("CustomMetadata")(CustomMetadata.asInstanceOf[js.Any])
    if (Metadata != null) __obj.updateDynamic("Metadata")(Metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetDocumentVersionResponse]
  }
}

