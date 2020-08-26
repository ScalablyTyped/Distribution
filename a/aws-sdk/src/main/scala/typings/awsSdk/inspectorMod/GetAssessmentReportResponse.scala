package typings.awsSdk.inspectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetAssessmentReportResponse extends js.Object {
  /**
    * Specifies the status of the request to generate an assessment report. 
    */
  var status: ReportStatus = js.native
  /**
    * Specifies the URL where you can find the generated assessment report. This parameter is only returned if the report is successfully generated.
    */
  var url: js.UndefOr[Url] = js.native
}

object GetAssessmentReportResponse {
  @scala.inline
  def apply(status: ReportStatus): GetAssessmentReportResponse = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetAssessmentReportResponse]
  }
  @scala.inline
  implicit class GetAssessmentReportResponseOps[Self <: GetAssessmentReportResponse] (val x: Self) extends AnyVal {
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
    def setStatus(value: ReportStatus): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def setUrl(value: Url): Self = this.set("url", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
  }
  
}

