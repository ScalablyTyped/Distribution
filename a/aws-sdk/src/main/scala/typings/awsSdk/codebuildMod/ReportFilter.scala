package typings.awsSdk.codebuildMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReportFilter extends js.Object {
  /**
    *  The status used to filter reports. You can filter using one status only. 
    */
  var status: js.UndefOr[ReportStatusType] = js.native
}

object ReportFilter {
  @scala.inline
  def apply(status: ReportStatusType = null): ReportFilter = {
    val __obj = js.Dynamic.literal()
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReportFilter]
  }
}

