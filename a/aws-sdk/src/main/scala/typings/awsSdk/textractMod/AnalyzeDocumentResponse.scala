package typings.awsSdk.textractMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnalyzeDocumentResponse extends js.Object {
  /**
    * The version of the model used to analyze the document.
    */
  var AnalyzeDocumentModelVersion: js.UndefOr[String] = js.native
  /**
    * The items that are detected and analyzed by AnalyzeDocument.
    */
  var Blocks: js.UndefOr[BlockList] = js.native
  /**
    * Metadata about the analyzed document. An example is the number of pages.
    */
  var DocumentMetadata: js.UndefOr[typings.awsSdk.textractMod.DocumentMetadata] = js.native
  /**
    * Shows the results of the human in the loop evaluation.
    */
  var HumanLoopActivationOutput: js.UndefOr[typings.awsSdk.textractMod.HumanLoopActivationOutput] = js.native
}

object AnalyzeDocumentResponse {
  @scala.inline
  def apply(): AnalyzeDocumentResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnalyzeDocumentResponse]
  }
  @scala.inline
  implicit class AnalyzeDocumentResponseOps[Self <: AnalyzeDocumentResponse] (val x: Self) extends AnyVal {
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
    def setAnalyzeDocumentModelVersion(value: String): Self = this.set("AnalyzeDocumentModelVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnalyzeDocumentModelVersion: Self = this.set("AnalyzeDocumentModelVersion", js.undefined)
    @scala.inline
    def setBlocksVarargs(value: Block*): Self = this.set("Blocks", js.Array(value :_*))
    @scala.inline
    def setBlocks(value: BlockList): Self = this.set("Blocks", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBlocks: Self = this.set("Blocks", js.undefined)
    @scala.inline
    def setDocumentMetadata(value: DocumentMetadata): Self = this.set("DocumentMetadata", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDocumentMetadata: Self = this.set("DocumentMetadata", js.undefined)
    @scala.inline
    def setHumanLoopActivationOutput(value: HumanLoopActivationOutput): Self = this.set("HumanLoopActivationOutput", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHumanLoopActivationOutput: Self = this.set("HumanLoopActivationOutput", js.undefined)
  }
  
}

