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
  def apply(): DetectDocumentTextResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DetectDocumentTextResponse]
  }
  @scala.inline
  implicit class DetectDocumentTextResponseOps[Self <: DetectDocumentTextResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setBlocksVarargs(value: Block*): Self = this.set("Blocks", js.Array(value :_*))
    @scala.inline
    def setBlocks(value: BlockList): Self = this.set("Blocks", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBlocks: Self = this.set("Blocks", js.undefined)
    @scala.inline
    def setDetectDocumentTextModelVersion(value: String): Self = this.set("DetectDocumentTextModelVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDetectDocumentTextModelVersion: Self = this.set("DetectDocumentTextModelVersion", js.undefined)
    @scala.inline
    def setDocumentMetadata(value: DocumentMetadata): Self = this.set("DocumentMetadata", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDocumentMetadata: Self = this.set("DocumentMetadata", js.undefined)
  }
  
}

