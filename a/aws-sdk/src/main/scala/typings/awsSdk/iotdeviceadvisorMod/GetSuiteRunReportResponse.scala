package typings.awsSdk.iotdeviceadvisorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetSuiteRunReportResponse extends StObject {
  
  /**
    * Download URL of the qualification report.
    */
  var qualificationReportDownloadUrl: js.UndefOr[QualificationReportDownloadUrl] = js.undefined
}
object GetSuiteRunReportResponse {
  
  inline def apply(): GetSuiteRunReportResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetSuiteRunReportResponse]
  }
  
  extension [Self <: GetSuiteRunReportResponse](x: Self) {
    
    inline def setQualificationReportDownloadUrl(value: QualificationReportDownloadUrl): Self = StObject.set(x, "qualificationReportDownloadUrl", value.asInstanceOf[js.Any])
    
    inline def setQualificationReportDownloadUrlUndefined: Self = StObject.set(x, "qualificationReportDownloadUrl", js.undefined)
  }
}
