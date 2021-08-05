package typings.awsSdk.pinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetJourneyDateRangeKpiResponse extends StObject {
  
  var JourneyDateRangeKpiResponse: typings.awsSdk.pinpointMod.JourneyDateRangeKpiResponse
}
object GetJourneyDateRangeKpiResponse {
  
  inline def apply(JourneyDateRangeKpiResponse: JourneyDateRangeKpiResponse): GetJourneyDateRangeKpiResponse = {
    val __obj = js.Dynamic.literal(JourneyDateRangeKpiResponse = JourneyDateRangeKpiResponse.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetJourneyDateRangeKpiResponse]
  }
  
  extension [Self <: GetJourneyDateRangeKpiResponse](x: Self) {
    
    inline def setJourneyDateRangeKpiResponse(value: JourneyDateRangeKpiResponse): Self = StObject.set(x, "JourneyDateRangeKpiResponse", value.asInstanceOf[js.Any])
  }
}
