package typings.awsSdk.codebuildMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BatchGetReportsOutput extends js.Object {
  /**
    *  The array of Report objects returned by BatchGetReports. 
    */
  var reports: js.UndefOr[Reports] = js.native
  /**
    *  An array of ARNs passed to BatchGetReportGroups that are not associated with a Report. 
    */
  var reportsNotFound: js.UndefOr[ReportArns] = js.native
}

object BatchGetReportsOutput {
  @scala.inline
  def apply(): BatchGetReportsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchGetReportsOutput]
  }
  @scala.inline
  implicit class BatchGetReportsOutputOps[Self <: BatchGetReportsOutput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setReportsVarargs(value: Report*): Self = this.set("reports", js.Array(value :_*))
    @scala.inline
    def setReports(value: Reports): Self = this.set("reports", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReports: Self = this.set("reports", js.undefined)
    @scala.inline
    def setReportsNotFoundVarargs(value: NonEmptyString*): Self = this.set("reportsNotFound", js.Array(value :_*))
    @scala.inline
    def setReportsNotFound(value: ReportArns): Self = this.set("reportsNotFound", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReportsNotFound: Self = this.set("reportsNotFound", js.undefined)
  }
  
}

