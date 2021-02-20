package typings.awsSdk.inspectorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetAssessmentReportResponse extends StObject {
  
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
  implicit class GetAssessmentReportResponseMutableBuilder[Self <: GetAssessmentReportResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStatus(value: ReportStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: Url): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
