package typings.awsSdk.pinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetJourneyExecutionMetricsResponse extends js.Object {
  
  var JourneyExecutionMetricsResponse: typings.awsSdk.pinpointMod.JourneyExecutionMetricsResponse = js.native
}
object GetJourneyExecutionMetricsResponse {
  
  @scala.inline
  def apply(JourneyExecutionMetricsResponse: JourneyExecutionMetricsResponse): GetJourneyExecutionMetricsResponse = {
    val __obj = js.Dynamic.literal(JourneyExecutionMetricsResponse = JourneyExecutionMetricsResponse.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetJourneyExecutionMetricsResponse]
  }
  
  @scala.inline
  implicit class GetJourneyExecutionMetricsResponseOps[Self <: GetJourneyExecutionMetricsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setJourneyExecutionMetricsResponse(value: JourneyExecutionMetricsResponse): Self = this.set("JourneyExecutionMetricsResponse", value.asInstanceOf[js.Any])
  }
}
