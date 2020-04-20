package typings.awsSdk.codebuildMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
}

