package typings.awsSdk.clientsTextractMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetLendingAnalysisResponse extends StObject {
  
  /**
    *  The current model version of the Analyze Lending API.
    */
  var AnalyzeLendingModelVersion: js.UndefOr[String] = js.undefined
  
  var DocumentMetadata: js.UndefOr[typings.awsSdk.clientsTextractMod.DocumentMetadata] = js.undefined
  
  /**
    *  The current status of the lending analysis job.
    */
  var JobStatus: js.UndefOr[typings.awsSdk.clientsTextractMod.JobStatus] = js.undefined
  
  /**
    * If the response is truncated, Amazon Textract returns this token. You can use this token in the subsequent request to retrieve the next set of lending results.
    */
  var NextToken: js.UndefOr[PaginationToken] = js.undefined
  
  /**
    *  Holds the information returned by one of AmazonTextract's document analysis operations for the pinstripe.
    */
  var Results: js.UndefOr[LendingResultList] = js.undefined
  
  /**
    *  Returns if the lending analysis job could not be completed. Contains explanation for what error occurred. 
    */
  var StatusMessage: js.UndefOr[typings.awsSdk.clientsTextractMod.StatusMessage] = js.undefined
  
  /**
    *  A list of warnings that occurred during the lending analysis operation. 
    */
  var Warnings: js.UndefOr[typings.awsSdk.clientsTextractMod.Warnings] = js.undefined
}
object GetLendingAnalysisResponse {
  
  inline def apply(): GetLendingAnalysisResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetLendingAnalysisResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetLendingAnalysisResponse] (val x: Self) extends AnyVal {
    
    inline def setAnalyzeLendingModelVersion(value: String): Self = StObject.set(x, "AnalyzeLendingModelVersion", value.asInstanceOf[js.Any])
    
    inline def setAnalyzeLendingModelVersionUndefined: Self = StObject.set(x, "AnalyzeLendingModelVersion", js.undefined)
    
    inline def setDocumentMetadata(value: DocumentMetadata): Self = StObject.set(x, "DocumentMetadata", value.asInstanceOf[js.Any])
    
    inline def setDocumentMetadataUndefined: Self = StObject.set(x, "DocumentMetadata", js.undefined)
    
    inline def setJobStatus(value: JobStatus): Self = StObject.set(x, "JobStatus", value.asInstanceOf[js.Any])
    
    inline def setJobStatusUndefined: Self = StObject.set(x, "JobStatus", js.undefined)
    
    inline def setNextToken(value: PaginationToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setResults(value: LendingResultList): Self = StObject.set(x, "Results", value.asInstanceOf[js.Any])
    
    inline def setResultsUndefined: Self = StObject.set(x, "Results", js.undefined)
    
    inline def setResultsVarargs(value: LendingResult*): Self = StObject.set(x, "Results", js.Array(value*))
    
    inline def setStatusMessage(value: StatusMessage): Self = StObject.set(x, "StatusMessage", value.asInstanceOf[js.Any])
    
    inline def setStatusMessageUndefined: Self = StObject.set(x, "StatusMessage", js.undefined)
    
    inline def setWarnings(value: Warnings): Self = StObject.set(x, "Warnings", value.asInstanceOf[js.Any])
    
    inline def setWarningsUndefined: Self = StObject.set(x, "Warnings", js.undefined)
    
    inline def setWarningsVarargs(value: Warning*): Self = StObject.set(x, "Warnings", js.Array(value*))
  }
}
