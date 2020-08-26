package typings.awsSdk.inspectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetAssessmentReportRequest extends js.Object {
  /**
    * The ARN that specifies the assessment run for which you want to generate a report.
    */
  var assessmentRunArn: Arn = js.native
  /**
    * Specifies the file format (html or pdf) of the assessment report that you want to generate.
    */
  var reportFileFormat: ReportFileFormat = js.native
  /**
    * Specifies the type of the assessment report that you want to generate. There are two types of assessment reports: a finding report and a full report. For more information, see Assessment Reports. 
    */
  var reportType: ReportType = js.native
}

object GetAssessmentReportRequest {
  @scala.inline
  def apply(assessmentRunArn: Arn, reportFileFormat: ReportFileFormat, reportType: ReportType): GetAssessmentReportRequest = {
    val __obj = js.Dynamic.literal(assessmentRunArn = assessmentRunArn.asInstanceOf[js.Any], reportFileFormat = reportFileFormat.asInstanceOf[js.Any], reportType = reportType.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetAssessmentReportRequest]
  }
  @scala.inline
  implicit class GetAssessmentReportRequestOps[Self <: GetAssessmentReportRequest] (val x: Self) extends AnyVal {
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
    def setAssessmentRunArn(value: Arn): Self = this.set("assessmentRunArn", value.asInstanceOf[js.Any])
    @scala.inline
    def setReportFileFormat(value: ReportFileFormat): Self = this.set("reportFileFormat", value.asInstanceOf[js.Any])
    @scala.inline
    def setReportType(value: ReportType): Self = this.set("reportType", value.asInstanceOf[js.Any])
  }
  
}

