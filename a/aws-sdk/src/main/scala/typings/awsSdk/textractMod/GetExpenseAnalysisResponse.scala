package typings.awsSdk.textractMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetExpenseAnalysisResponse extends StObject {
  
  /**
    * The current model version of AnalyzeExpense.
    */
  var AnalyzeExpenseModelVersion: js.UndefOr[String] = js.undefined
  
  /**
    * Information about a document that Amazon Textract processed. DocumentMetadata is returned in every page of paginated responses from an Amazon Textract operation.
    */
  var DocumentMetadata: js.UndefOr[typings.awsSdk.textractMod.DocumentMetadata] = js.undefined
  
  /**
    * The expenses detected by Amazon Textract.
    */
  var ExpenseDocuments: js.UndefOr[ExpenseDocumentList] = js.undefined
  
  /**
    * The current status of the text detection job.
    */
  var JobStatus: js.UndefOr[typings.awsSdk.textractMod.JobStatus] = js.undefined
  
  /**
    * If the response is truncated, Amazon Textract returns this token. You can use this token in the subsequent request to retrieve the next set of text-detection results.
    */
  var NextToken: js.UndefOr[PaginationToken] = js.undefined
  
  /**
    * Returns if the detection job could not be completed. Contains explanation for what error occured. 
    */
  var StatusMessage: js.UndefOr[typings.awsSdk.textractMod.StatusMessage] = js.undefined
  
  /**
    * A list of warnings that occurred during the text-detection operation for the document.
    */
  var Warnings: js.UndefOr[typings.awsSdk.textractMod.Warnings] = js.undefined
}
object GetExpenseAnalysisResponse {
  
  inline def apply(): GetExpenseAnalysisResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetExpenseAnalysisResponse]
  }
  
  extension [Self <: GetExpenseAnalysisResponse](x: Self) {
    
    inline def setAnalyzeExpenseModelVersion(value: String): Self = StObject.set(x, "AnalyzeExpenseModelVersion", value.asInstanceOf[js.Any])
    
    inline def setAnalyzeExpenseModelVersionUndefined: Self = StObject.set(x, "AnalyzeExpenseModelVersion", js.undefined)
    
    inline def setDocumentMetadata(value: DocumentMetadata): Self = StObject.set(x, "DocumentMetadata", value.asInstanceOf[js.Any])
    
    inline def setDocumentMetadataUndefined: Self = StObject.set(x, "DocumentMetadata", js.undefined)
    
    inline def setExpenseDocuments(value: ExpenseDocumentList): Self = StObject.set(x, "ExpenseDocuments", value.asInstanceOf[js.Any])
    
    inline def setExpenseDocumentsUndefined: Self = StObject.set(x, "ExpenseDocuments", js.undefined)
    
    inline def setExpenseDocumentsVarargs(value: ExpenseDocument*): Self = StObject.set(x, "ExpenseDocuments", js.Array(value*))
    
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
