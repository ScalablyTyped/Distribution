package typings.awsSdk.clientsTextractMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetDocumentAnalysisResponse extends StObject {
  
  /**
    * 
    */
  var AnalyzeDocumentModelVersion: js.UndefOr[String] = js.undefined
  
  /**
    * The results of the text-analysis operation.
    */
  var Blocks: js.UndefOr[BlockList] = js.undefined
  
  /**
    * Information about a document that Amazon Textract processed. DocumentMetadata is returned in every page of paginated responses from an Amazon Textract video operation.
    */
  var DocumentMetadata: js.UndefOr[typings.awsSdk.clientsTextractMod.DocumentMetadata] = js.undefined
  
  /**
    * The current status of the text detection job.
    */
  var JobStatus: js.UndefOr[typings.awsSdk.clientsTextractMod.JobStatus] = js.undefined
  
  /**
    * If the response is truncated, Amazon Textract returns this token. You can use this token in the subsequent request to retrieve the next set of text detection results.
    */
  var NextToken: js.UndefOr[PaginationToken] = js.undefined
  
  /**
    * Returns if the detection job could not be completed. Contains explanation for what error occured.
    */
  var StatusMessage: js.UndefOr[typings.awsSdk.clientsTextractMod.StatusMessage] = js.undefined
  
  /**
    * A list of warnings that occurred during the document-analysis operation.
    */
  var Warnings: js.UndefOr[typings.awsSdk.clientsTextractMod.Warnings] = js.undefined
}
object GetDocumentAnalysisResponse {
  
  inline def apply(): GetDocumentAnalysisResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetDocumentAnalysisResponse]
  }
  
  extension [Self <: GetDocumentAnalysisResponse](x: Self) {
    
    inline def setAnalyzeDocumentModelVersion(value: String): Self = StObject.set(x, "AnalyzeDocumentModelVersion", value.asInstanceOf[js.Any])
    
    inline def setAnalyzeDocumentModelVersionUndefined: Self = StObject.set(x, "AnalyzeDocumentModelVersion", js.undefined)
    
    inline def setBlocks(value: BlockList): Self = StObject.set(x, "Blocks", value.asInstanceOf[js.Any])
    
    inline def setBlocksUndefined: Self = StObject.set(x, "Blocks", js.undefined)
    
    inline def setBlocksVarargs(value: Block*): Self = StObject.set(x, "Blocks", js.Array(value*))
    
    inline def setDocumentMetadata(value: DocumentMetadata): Self = StObject.set(x, "DocumentMetadata", value.asInstanceOf[js.Any])
    
    inline def setDocumentMetadataUndefined: Self = StObject.set(x, "DocumentMetadata", js.undefined)
    
    inline def setJobStatus(value: JobStatus): Self = StObject.set(x, "JobStatus", value.asInstanceOf[js.Any])
    
    inline def setJobStatusUndefined: Self = StObject.set(x, "JobStatus", js.undefined)
    
    inline def setNextToken(value: PaginationToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setStatusMessage(value: StatusMessage): Self = StObject.set(x, "StatusMessage", value.asInstanceOf[js.Any])
    
    inline def setStatusMessageUndefined: Self = StObject.set(x, "StatusMessage", js.undefined)
    
    inline def setWarnings(value: Warnings): Self = StObject.set(x, "Warnings", value.asInstanceOf[js.Any])
    
    inline def setWarningsUndefined: Self = StObject.set(x, "Warnings", js.undefined)
    
    inline def setWarningsVarargs(value: Warning*): Self = StObject.set(x, "Warnings", js.Array(value*))
  }
}
