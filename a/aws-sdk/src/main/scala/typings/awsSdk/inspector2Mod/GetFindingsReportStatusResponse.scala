package typings.awsSdk.inspector2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetFindingsReportStatusResponse extends StObject {
  
  /**
    * The destination of the report.
    */
  var destination: js.UndefOr[Destination] = js.undefined
  
  /**
    * The error code of the report.
    */
  var errorCode: js.UndefOr[ReportingErrorCode] = js.undefined
  
  /**
    * The error message of the report.
    */
  var errorMessage: js.UndefOr[ErrorMessage] = js.undefined
  
  /**
    * The filter criteria associated with the report.
    */
  var filterCriteria: js.UndefOr[FilterCriteria] = js.undefined
  
  /**
    * The ID of the report.
    */
  var reportId: js.UndefOr[ReportId] = js.undefined
  
  /**
    * The status of the report.
    */
  var status: js.UndefOr[ExternalReportStatus] = js.undefined
}
object GetFindingsReportStatusResponse {
  
  inline def apply(): GetFindingsReportStatusResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetFindingsReportStatusResponse]
  }
  
  extension [Self <: GetFindingsReportStatusResponse](x: Self) {
    
    inline def setDestination(value: Destination): Self = StObject.set(x, "destination", value.asInstanceOf[js.Any])
    
    inline def setDestinationUndefined: Self = StObject.set(x, "destination", js.undefined)
    
    inline def setErrorCode(value: ReportingErrorCode): Self = StObject.set(x, "errorCode", value.asInstanceOf[js.Any])
    
    inline def setErrorCodeUndefined: Self = StObject.set(x, "errorCode", js.undefined)
    
    inline def setErrorMessage(value: ErrorMessage): Self = StObject.set(x, "errorMessage", value.asInstanceOf[js.Any])
    
    inline def setErrorMessageUndefined: Self = StObject.set(x, "errorMessage", js.undefined)
    
    inline def setFilterCriteria(value: FilterCriteria): Self = StObject.set(x, "filterCriteria", value.asInstanceOf[js.Any])
    
    inline def setFilterCriteriaUndefined: Self = StObject.set(x, "filterCriteria", js.undefined)
    
    inline def setReportId(value: ReportId): Self = StObject.set(x, "reportId", value.asInstanceOf[js.Any])
    
    inline def setReportIdUndefined: Self = StObject.set(x, "reportId", js.undefined)
    
    inline def setStatus(value: ExternalReportStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
