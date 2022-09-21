package typings.awsSdk.inspector2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CancelFindingsReportRequest extends StObject {
  
  /**
    * The ID of the report to be canceled.
    */
  var reportId: ReportId
}
object CancelFindingsReportRequest {
  
  inline def apply(reportId: ReportId): CancelFindingsReportRequest = {
    val __obj = js.Dynamic.literal(reportId = reportId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CancelFindingsReportRequest]
  }
  
  extension [Self <: CancelFindingsReportRequest](x: Self) {
    
    inline def setReportId(value: ReportId): Self = StObject.set(x, "reportId", value.asInstanceOf[js.Any])
  }
}
