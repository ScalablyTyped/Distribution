package typings.awsSdk.curMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PutReportDefinitionRequest extends js.Object {
  /**
    * Represents the output of the PutReportDefinition operation. The content consists of the detailed metadata and data file information. 
    */
  var ReportDefinition: typings.awsSdk.curMod.ReportDefinition = js.native
}

object PutReportDefinitionRequest {
  @scala.inline
  def apply(ReportDefinition: ReportDefinition): PutReportDefinitionRequest = {
    val __obj = js.Dynamic.literal(ReportDefinition = ReportDefinition.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutReportDefinitionRequest]
  }
  @scala.inline
  implicit class PutReportDefinitionRequestOps[Self <: PutReportDefinitionRequest] (val x: Self) extends AnyVal {
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
  }
  
}

