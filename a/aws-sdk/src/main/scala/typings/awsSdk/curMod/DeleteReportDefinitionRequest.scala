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
  def apply(): DeleteReportDefinitionRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteReportDefinitionRequest]
  }
  @scala.inline
  implicit class DeleteReportDefinitionRequestOps[Self <: DeleteReportDefinitionRequest] (val x: Self) extends AnyVal {
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
    def setReportName(value: ReportName): Self = this.set("ReportName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReportName: Self = this.set("ReportName", js.undefined)
  }
  
}

