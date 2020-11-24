package typings.awsSdk.codebuildMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TestReportSummary extends js.Object {
  
  /**
    *  The number of nanoseconds it took to run all of the test cases in this report. 
    */
  var durationInNanoSeconds: WrapperLong = js.native
  
  /**
    *  A map that contains the number of each type of status returned by the test results in this TestReportSummary. 
    */
  var statusCounts: ReportStatusCounts = js.native
  
  /**
    *  The number of test cases in this TestReportSummary. The total includes truncated test cases. 
    */
  var total: WrapperInt = js.native
}
object TestReportSummary {
  
  @scala.inline
  def apply(durationInNanoSeconds: WrapperLong, statusCounts: ReportStatusCounts, total: WrapperInt): TestReportSummary = {
    val __obj = js.Dynamic.literal(durationInNanoSeconds = durationInNanoSeconds.asInstanceOf[js.Any], statusCounts = statusCounts.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestReportSummary]
  }
  
  @scala.inline
  implicit class TestReportSummaryOps[Self <: TestReportSummary] (val x: Self) extends AnyVal {
    
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
    def setDurationInNanoSeconds(value: WrapperLong): Self = this.set("durationInNanoSeconds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusCounts(value: ReportStatusCounts): Self = this.set("statusCounts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotal(value: WrapperInt): Self = this.set("total", value.asInstanceOf[js.Any])
  }
}
