package typings.awsSdk.clientsTextractMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetLendingAnalysisSummaryResponse extends StObject {
  
  /**
    * The current model version of the Analyze Lending API.
    */
  var AnalyzeLendingModelVersion: js.UndefOr[String] = js.undefined
  
  var DocumentMetadata: js.UndefOr[typings.awsSdk.clientsTextractMod.DocumentMetadata] = js.undefined
  
  /**
    *  The current status of the lending analysis job. 
    */
  var JobStatus: js.UndefOr[typings.awsSdk.clientsTextractMod.JobStatus] = js.undefined
  
  /**
    * Returns if the lending analysis could not be completed. Contains explanation for what error occurred.
    */
  var StatusMessage: js.UndefOr[typings.awsSdk.clientsTextractMod.StatusMessage] = js.undefined
  
  /**
    *  Contains summary information for documents grouped by type.
    */
  var Summary: js.UndefOr[LendingSummary] = js.undefined
  
  /**
    * A list of warnings that occurred during the lending analysis operation.
    */
  var Warnings: js.UndefOr[typings.awsSdk.clientsTextractMod.Warnings] = js.undefined
}
object GetLendingAnalysisSummaryResponse {
  
  inline def apply(): GetLendingAnalysisSummaryResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetLendingAnalysisSummaryResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetLendingAnalysisSummaryResponse] (val x: Self) extends AnyVal {
    
    inline def setAnalyzeLendingModelVersion(value: String): Self = StObject.set(x, "AnalyzeLendingModelVersion", value.asInstanceOf[js.Any])
    
    inline def setAnalyzeLendingModelVersionUndefined: Self = StObject.set(x, "AnalyzeLendingModelVersion", js.undefined)
    
    inline def setDocumentMetadata(value: DocumentMetadata): Self = StObject.set(x, "DocumentMetadata", value.asInstanceOf[js.Any])
    
    inline def setDocumentMetadataUndefined: Self = StObject.set(x, "DocumentMetadata", js.undefined)
    
    inline def setJobStatus(value: JobStatus): Self = StObject.set(x, "JobStatus", value.asInstanceOf[js.Any])
    
    inline def setJobStatusUndefined: Self = StObject.set(x, "JobStatus", js.undefined)
    
    inline def setStatusMessage(value: StatusMessage): Self = StObject.set(x, "StatusMessage", value.asInstanceOf[js.Any])
    
    inline def setStatusMessageUndefined: Self = StObject.set(x, "StatusMessage", js.undefined)
    
    inline def setSummary(value: LendingSummary): Self = StObject.set(x, "Summary", value.asInstanceOf[js.Any])
    
    inline def setSummaryUndefined: Self = StObject.set(x, "Summary", js.undefined)
    
    inline def setWarnings(value: Warnings): Self = StObject.set(x, "Warnings", value.asInstanceOf[js.Any])
    
    inline def setWarningsUndefined: Self = StObject.set(x, "Warnings", js.undefined)
    
    inline def setWarningsVarargs(value: Warning*): Self = StObject.set(x, "Warnings", js.Array(value*))
  }
}
