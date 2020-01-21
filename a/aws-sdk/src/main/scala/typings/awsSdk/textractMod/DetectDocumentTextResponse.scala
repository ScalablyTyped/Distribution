package typings.awsSdk.textractMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DetectDocumentTextResponse extends js.Object {
  /**
    * An array of Block objects that contain the text that's detected in the document.
    */
  var Blocks: js.UndefOr[BlockList] = js.native
  /**
    * 
    */
  var DetectDocumentTextModelVersion: js.UndefOr[String] = js.native
  /**
    * Metadata about the document. It contains the number of pages that are detected in the document.
    */
  var DocumentMetadata: js.UndefOr[typings.awsSdk.textractMod.DocumentMetadata] = js.native
}

object DetectDocumentTextResponse {
  @scala.inline
  def apply(
    Blocks: BlockList = null,
    DetectDocumentTextModelVersion: String = null,
    DocumentMetadata: DocumentMetadata = null
  ): DetectDocumentTextResponse = {
    val __obj = js.Dynamic.literal()
    if (Blocks != null) __obj.updateDynamic("Blocks")(Blocks.asInstanceOf[js.Any])
    if (DetectDocumentTextModelVersion != null) __obj.updateDynamic("DetectDocumentTextModelVersion")(DetectDocumentTextModelVersion.asInstanceOf[js.Any])
    if (DocumentMetadata != null) __obj.updateDynamic("DocumentMetadata")(DocumentMetadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[DetectDocumentTextResponse]
  }
}

