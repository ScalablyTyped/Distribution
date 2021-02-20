package typings.awsSdk.inspectorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetAssessmentReportRequest extends StObject {
  
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
  implicit class GetAssessmentReportRequestMutableBuilder[Self <: GetAssessmentReportRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAssessmentRunArn(value: Arn): Self = StObject.set(x, "assessmentRunArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReportFileFormat(value: ReportFileFormat): Self = StObject.set(x, "reportFileFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReportType(value: ReportType): Self = StObject.set(x, "reportType", value.asInstanceOf[js.Any])
  }
}
