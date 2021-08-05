package typings.awsSdk.pinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetApplicationDateRangeKpiResponse extends StObject {
  
  var ApplicationDateRangeKpiResponse: typings.awsSdk.pinpointMod.ApplicationDateRangeKpiResponse
}
object GetApplicationDateRangeKpiResponse {
  
  inline def apply(ApplicationDateRangeKpiResponse: ApplicationDateRangeKpiResponse): GetApplicationDateRangeKpiResponse = {
    val __obj = js.Dynamic.literal(ApplicationDateRangeKpiResponse = ApplicationDateRangeKpiResponse.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetApplicationDateRangeKpiResponse]
  }
  
  extension [Self <: GetApplicationDateRangeKpiResponse](x: Self) {
    
    inline def setApplicationDateRangeKpiResponse(value: ApplicationDateRangeKpiResponse): Self = StObject.set(x, "ApplicationDateRangeKpiResponse", value.asInstanceOf[js.Any])
  }
}
