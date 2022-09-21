package typings.awsSdk.inspector2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CancelFindingsReportResponse extends StObject {
  
  /**
    * The ID of the canceled report.
    */
  var reportId: ReportId
}
object CancelFindingsReportResponse {
  
  inline def apply(reportId: ReportId): CancelFindingsReportResponse = {
    val __obj = js.Dynamic.literal(reportId = reportId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CancelFindingsReportResponse]
  }
  
  extension [Self <: CancelFindingsReportResponse](x: Self) {
    
    inline def setReportId(value: ReportId): Self = StObject.set(x, "reportId", value.asInstanceOf[js.Any])
  }
}
