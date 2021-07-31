package typings.awsSdk.textractMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnalyzeDocumentResponse extends StObject {
  
  /**
    * The version of the model used to analyze the document.
    */
  var AnalyzeDocumentModelVersion: js.UndefOr[String] = js.undefined
  
  /**
    * The items that are detected and analyzed by AnalyzeDocument.
    */
  var Blocks: js.UndefOr[BlockList] = js.undefined
  
  /**
    * Metadata about the analyzed document. An example is the number of pages.
    */
  var DocumentMetadata: js.UndefOr[typings.awsSdk.textractMod.DocumentMetadata] = js.undefined
  
  /**
    * Shows the results of the human in the loop evaluation.
    */
  var HumanLoopActivationOutput: js.UndefOr[typings.awsSdk.textractMod.HumanLoopActivationOutput] = js.undefined
}
object AnalyzeDocumentResponse {
  
  @scala.inline
  def apply(): AnalyzeDocumentResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnalyzeDocumentResponse]
  }
  
  @scala.inline
  implicit class AnalyzeDocumentResponseMutableBuilder[Self <: AnalyzeDocumentResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnalyzeDocumentModelVersion(value: String): Self = StObject.set(x, "AnalyzeDocumentModelVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnalyzeDocumentModelVersionUndefined: Self = StObject.set(x, "AnalyzeDocumentModelVersion", js.undefined)
    
    @scala.inline
    def setBlocks(value: BlockList): Self = StObject.set(x, "Blocks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBlocksUndefined: Self = StObject.set(x, "Blocks", js.undefined)
    
    @scala.inline
    def setBlocksVarargs(value: Block*): Self = StObject.set(x, "Blocks", js.Array(value :_*))
    
    @scala.inline
    def setDocumentMetadata(value: DocumentMetadata): Self = StObject.set(x, "DocumentMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDocumentMetadataUndefined: Self = StObject.set(x, "DocumentMetadata", js.undefined)
    
    @scala.inline
    def setHumanLoopActivationOutput(value: HumanLoopActivationOutput): Self = StObject.set(x, "HumanLoopActivationOutput", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHumanLoopActivationOutputUndefined: Self = StObject.set(x, "HumanLoopActivationOutput", js.undefined)
  }
}
