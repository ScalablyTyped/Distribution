package typings.awsSdk.curMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteReportDefinitionRequest extends js.Object {
  var ReportName: js.UndefOr[typings.awsSdk.curMod.ReportName] = js.native
}

object DeleteReportDefinitionRequest {
  @scala.inline
  def apply(ReportName: ReportName = null): DeleteReportDefinitionRequest = {
    val __obj = js.Dynamic.literal()
    if (ReportName != null) __obj.updateDynamic("ReportName")(ReportName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteReportDefinitionRequest]
  }
}

