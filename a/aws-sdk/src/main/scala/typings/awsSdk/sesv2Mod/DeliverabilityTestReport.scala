package typings.awsSdk.sesv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeliverabilityTestReport extends js.Object {
  /**
    * The date and time when the predictive inbox placement test was created, in Unix time format.
    */
  var CreateDate: js.UndefOr[Timestamp] = js.native
  /**
    * The status of the predictive inbox placement test. If the status is IN_PROGRESS, then the predictive inbox placement test is currently running. Predictive inbox placement tests are usually complete within 24 hours of creating the test. If the status is COMPLETE, then the test is finished, and you can use the GetDeliverabilityTestReport to view the results of the test.
    */
  var DeliverabilityTestStatus: js.UndefOr[typings.awsSdk.sesv2Mod.DeliverabilityTestStatus] = js.native
  /**
    * The sender address that you specified for the predictive inbox placement test.
    */
  var FromEmailAddress: js.UndefOr[EmailAddress] = js.native
  /**
    * A unique string that identifies the predictive inbox placement test.
    */
  var ReportId: js.UndefOr[typings.awsSdk.sesv2Mod.ReportId] = js.native
  /**
    * A name that helps you identify a predictive inbox placement test report.
    */
  var ReportName: js.UndefOr[typings.awsSdk.sesv2Mod.ReportName] = js.native
  /**
    * The subject line for an email that you submitted in a predictive inbox placement test.
    */
  var Subject: js.UndefOr[DeliverabilityTestSubject] = js.native
}

object DeliverabilityTestReport {
  @scala.inline
  def apply(): DeliverabilityTestReport = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeliverabilityTestReport]
  }
  @scala.inline
  implicit class DeliverabilityTestReportOps[Self <: DeliverabilityTestReport] (val x: Self) extends AnyVal {
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
    def setCreateDate(value: Timestamp): Self = this.set("CreateDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreateDate: Self = this.set("CreateDate", js.undefined)
    @scala.inline
    def setDeliverabilityTestStatus(value: DeliverabilityTestStatus): Self = this.set("DeliverabilityTestStatus", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeliverabilityTestStatus: Self = this.set("DeliverabilityTestStatus", js.undefined)
    @scala.inline
    def setFromEmailAddress(value: EmailAddress): Self = this.set("FromEmailAddress", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFromEmailAddress: Self = this.set("FromEmailAddress", js.undefined)
    @scala.inline
    def setReportId(value: ReportId): Self = this.set("ReportId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReportId: Self = this.set("ReportId", js.undefined)
    @scala.inline
    def setReportName(value: ReportName): Self = this.set("ReportName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReportName: Self = this.set("ReportName", js.undefined)
    @scala.inline
    def setSubject(value: DeliverabilityTestSubject): Self = this.set("Subject", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSubject: Self = this.set("Subject", js.undefined)
  }
  
}

