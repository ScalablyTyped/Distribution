package typings.awsSdk.pinpointemailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetDeliverabilityTestReportRequest extends StObject {
  
  /**
    * A unique string that identifies the predictive inbox placement test.
    */
  var ReportId: typings.awsSdk.pinpointemailMod.ReportId
}
object GetDeliverabilityTestReportRequest {
  
  inline def apply(ReportId: ReportId): GetDeliverabilityTestReportRequest = {
    val __obj = js.Dynamic.literal(ReportId = ReportId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetDeliverabilityTestReportRequest]
  }
  
  extension [Self <: GetDeliverabilityTestReportRequest](x: Self) {
    
    inline def setReportId(value: ReportId): Self = StObject.set(x, "ReportId", value.asInstanceOf[js.Any])
  }
}
