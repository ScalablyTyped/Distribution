package typings.awsSdk.curMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModifyReportDefinitionRequest extends js.Object {
  var ReportDefinition: typings.awsSdk.curMod.ReportDefinition = js.native
  var ReportName: typings.awsSdk.curMod.ReportName = js.native
}

object ModifyReportDefinitionRequest {
  @scala.inline
  def apply(ReportDefinition: ReportDefinition, ReportName: ReportName): ModifyReportDefinitionRequest = {
    val __obj = js.Dynamic.literal(ReportDefinition = ReportDefinition.asInstanceOf[js.Any], ReportName = ReportName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModifyReportDefinitionRequest]
  }
  @scala.inline
  implicit class ModifyReportDefinitionRequestOps[Self <: ModifyReportDefinitionRequest] (val x: Self) extends AnyVal {
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
    def setReportDefinition(value: ReportDefinition): Self = this.set("ReportDefinition", value.asInstanceOf[js.Any])
    @scala.inline
    def setReportName(value: ReportName): Self = this.set("ReportName", value.asInstanceOf[js.Any])
  }
  
}

