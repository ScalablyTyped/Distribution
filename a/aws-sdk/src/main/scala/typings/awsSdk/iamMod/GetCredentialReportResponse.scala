package typings.awsSdk.iamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetCredentialReportResponse extends StObject {
  
  /**
    * Contains the credential report. The report is Base64-encoded.
    */
  var Content: js.UndefOr[ReportContentType] = js.undefined
  
  /**
    *  The date and time when the credential report was created, in ISO 8601 date-time format.
    */
  var GeneratedTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The format (MIME type) of the credential report.
    */
  var ReportFormat: js.UndefOr[ReportFormatType] = js.undefined
}
object GetCredentialReportResponse {
  
  inline def apply(): GetCredentialReportResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetCredentialReportResponse]
  }
  
  extension [Self <: GetCredentialReportResponse](x: Self) {
    
    inline def setContent(value: ReportContentType): Self = StObject.set(x, "Content", value.asInstanceOf[js.Any])
    
    inline def setContentUndefined: Self = StObject.set(x, "Content", js.undefined)
    
    inline def setGeneratedTime(value: js.Date): Self = StObject.set(x, "GeneratedTime", value.asInstanceOf[js.Any])
    
    inline def setGeneratedTimeUndefined: Self = StObject.set(x, "GeneratedTime", js.undefined)
    
    inline def setReportFormat(value: ReportFormatType): Self = StObject.set(x, "ReportFormat", value.asInstanceOf[js.Any])
    
    inline def setReportFormatUndefined: Self = StObject.set(x, "ReportFormat", js.undefined)
  }
}
