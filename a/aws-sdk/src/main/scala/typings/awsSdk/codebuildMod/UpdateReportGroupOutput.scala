package typings.awsSdk.codebuildMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateReportGroupOutput extends js.Object {
  /**
    *  Information about the updated report group. 
    */
  var reportGroup: js.UndefOr[ReportGroup] = js.native
}

object UpdateReportGroupOutput {
  @scala.inline
  def apply(reportGroup: ReportGroup = null): UpdateReportGroupOutput = {
    val __obj = js.Dynamic.literal()
    if (reportGroup != null) __obj.updateDynamic("reportGroup")(reportGroup.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateReportGroupOutput]
  }
}

