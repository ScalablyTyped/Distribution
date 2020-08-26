package typings.awsSdk.pinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetApplicationDateRangeKpiResponse extends js.Object {
  var ApplicationDateRangeKpiResponse: typings.awsSdk.pinpointMod.ApplicationDateRangeKpiResponse = js.native
}

object GetApplicationDateRangeKpiResponse {
  @scala.inline
  def apply(ApplicationDateRangeKpiResponse: ApplicationDateRangeKpiResponse): GetApplicationDateRangeKpiResponse = {
    val __obj = js.Dynamic.literal(ApplicationDateRangeKpiResponse = ApplicationDateRangeKpiResponse.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetApplicationDateRangeKpiResponse]
  }
  @scala.inline
  implicit class GetApplicationDateRangeKpiResponseOps[Self <: GetApplicationDateRangeKpiResponse] (val x: Self) extends AnyVal {
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
    def setApplicationDateRangeKpiResponse(value: ApplicationDateRangeKpiResponse): Self = this.set("ApplicationDateRangeKpiResponse", value.asInstanceOf[js.Any])
  }
  
}

