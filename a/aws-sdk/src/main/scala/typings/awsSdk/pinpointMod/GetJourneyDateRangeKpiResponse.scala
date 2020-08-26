package typings.awsSdk.pinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetJourneyDateRangeKpiResponse extends js.Object {
  var JourneyDateRangeKpiResponse: typings.awsSdk.pinpointMod.JourneyDateRangeKpiResponse = js.native
}

object GetJourneyDateRangeKpiResponse {
  @scala.inline
  def apply(JourneyDateRangeKpiResponse: JourneyDateRangeKpiResponse): GetJourneyDateRangeKpiResponse = {
    val __obj = js.Dynamic.literal(JourneyDateRangeKpiResponse = JourneyDateRangeKpiResponse.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetJourneyDateRangeKpiResponse]
  }
  @scala.inline
  implicit class GetJourneyDateRangeKpiResponseOps[Self <: GetJourneyDateRangeKpiResponse] (val x: Self) extends AnyVal {
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
    def setJourneyDateRangeKpiResponse(value: JourneyDateRangeKpiResponse): Self = this.set("JourneyDateRangeKpiResponse", value.asInstanceOf[js.Any])
  }
  
}

