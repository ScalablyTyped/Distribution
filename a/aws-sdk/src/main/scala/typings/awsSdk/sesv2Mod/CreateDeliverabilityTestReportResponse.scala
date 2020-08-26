package typings.awsSdk.sesv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateDeliverabilityTestReportResponse extends js.Object {
  /**
    * The status of the predictive inbox placement test. If the status is IN_PROGRESS, then the predictive inbox placement test is currently running. Predictive inbox placement tests are usually complete within 24 hours of creating the test. If the status is COMPLETE, then the test is finished, and you can use the GetDeliverabilityTestReport to view the results of the test.
    */
  var DeliverabilityTestStatus: typings.awsSdk.sesv2Mod.DeliverabilityTestStatus = js.native
  /**
    * A unique string that identifies the predictive inbox placement test.
    */
  var ReportId: typings.awsSdk.sesv2Mod.ReportId = js.native
}

object CreateDeliverabilityTestReportResponse {
  @scala.inline
  def apply(DeliverabilityTestStatus: DeliverabilityTestStatus, ReportId: ReportId): CreateDeliverabilityTestReportResponse = {
    val __obj = js.Dynamic.literal(DeliverabilityTestStatus = DeliverabilityTestStatus.asInstanceOf[js.Any], ReportId = ReportId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateDeliverabilityTestReportResponse]
  }
  @scala.inline
  implicit class CreateDeliverabilityTestReportResponseOps[Self <: CreateDeliverabilityTestReportResponse] (val x: Self) extends AnyVal {
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
    def setDeliverabilityTestStatus(value: DeliverabilityTestStatus): Self = this.set("DeliverabilityTestStatus", value.asInstanceOf[js.Any])
    @scala.inline
    def setReportId(value: ReportId): Self = this.set("ReportId", value.asInstanceOf[js.Any])
  }
  
}

