package typings.awsSdk.textractMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DetectDocumentTextResponse extends StObject {
  
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
  implicit class DetectDocumentTextResponseMutableBuilder[Self <: DetectDocumentTextResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBlocks(value: BlockList): Self = StObject.set(x, "Blocks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBlocksUndefined: Self = StObject.set(x, "Blocks", js.undefined)
    
    @scala.inline
    def setBlocksVarargs(value: Block*): Self = StObject.set(x, "Blocks", js.Array(value :_*))
    
    @scala.inline
    def setDetectDocumentTextModelVersion(value: String): Self = StObject.set(x, "DetectDocumentTextModelVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDetectDocumentTextModelVersionUndefined: Self = StObject.set(x, "DetectDocumentTextModelVersion", js.undefined)
    
    @scala.inline
    def setDocumentMetadata(value: DocumentMetadata): Self = StObject.set(x, "DocumentMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDocumentMetadataUndefined: Self = StObject.set(x, "DocumentMetadata", js.undefined)
  }
}
