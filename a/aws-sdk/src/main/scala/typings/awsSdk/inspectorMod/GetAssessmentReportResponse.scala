package typings.awsSdk.inspectorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetAssessmentReportResponse extends StObject {
  
  /**
    * Specifies the status of the request to generate an assessment report. 
    */
  var status: ReportStatus
  
  /**
    * Specifies the URL where you can find the generated assessment report. This parameter is only returned if the report is successfully generated.
    */
  var url: js.UndefOr[Url] = js.undefined
}
object GetAssessmentReportResponse {
  
  inline def apply(status: ReportStatus): GetAssessmentReportResponse = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetAssessmentReportResponse]
  }
  
  extension [Self <: GetAssessmentReportResponse](x: Self) {
    
    inline def setStatus(value: ReportStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: Url): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
