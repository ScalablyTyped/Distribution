package typings.awsSdk.pinpointemailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetDeliverabilityTestReportRequest extends js.Object {
  /**
    * A unique string that identifies the predictive inbox placement test.
    */
  var ReportId: typings.awsSdk.pinpointemailMod.ReportId = js.native
}

object GetDeliverabilityTestReportRequest {
  @scala.inline
  def apply(ReportId: ReportId): GetDeliverabilityTestReportRequest = {
    val __obj = js.Dynamic.literal(ReportId = ReportId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetDeliverabilityTestReportRequest]
  }
  @scala.inline
  implicit class GetDeliverabilityTestReportRequestOps[Self <: GetDeliverabilityTestReportRequest] (val x: Self) extends AnyVal {
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
    def setReportId(value: ReportId): Self = this.set("ReportId", value.asInstanceOf[js.Any])
  }
  
}

