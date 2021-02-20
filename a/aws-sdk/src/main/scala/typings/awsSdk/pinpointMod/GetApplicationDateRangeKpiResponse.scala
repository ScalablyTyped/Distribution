package typings.awsSdk.pinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetApplicationDateRangeKpiResponse extends StObject {
  
  var ApplicationDateRangeKpiResponse: typings.awsSdk.pinpointMod.ApplicationDateRangeKpiResponse = js.native
}
object GetApplicationDateRangeKpiResponse {
  
  @scala.inline
  def apply(ApplicationDateRangeKpiResponse: ApplicationDateRangeKpiResponse): GetApplicationDateRangeKpiResponse = {
    val __obj = js.Dynamic.literal(ApplicationDateRangeKpiResponse = ApplicationDateRangeKpiResponse.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetApplicationDateRangeKpiResponse]
  }
  
  @scala.inline
  implicit class GetApplicationDateRangeKpiResponseMutableBuilder[Self <: GetApplicationDateRangeKpiResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplicationDateRangeKpiResponse(value: ApplicationDateRangeKpiResponse): Self = StObject.set(x, "ApplicationDateRangeKpiResponse", value.asInstanceOf[js.Any])
  }
}
