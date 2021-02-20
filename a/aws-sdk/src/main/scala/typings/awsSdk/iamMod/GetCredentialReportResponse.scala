package typings.awsSdk.iamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetCredentialReportResponse extends StObject {
  
  /**
    * Contains the credential report. The report is Base64-encoded.
    */
  var Content: js.UndefOr[ReportContentType] = js.native
  
  /**
    *  The date and time when the credential report was created, in ISO 8601 date-time format.
    */
  var GeneratedTime: js.UndefOr[dateType] = js.native
  
  /**
    * The format (MIME type) of the credential report.
    */
  var ReportFormat: js.UndefOr[ReportFormatType] = js.native
}
object GetCredentialReportResponse {
  
  @scala.inline
  def apply(): GetCredentialReportResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetCredentialReportResponse]
  }
  
  @scala.inline
  implicit class GetCredentialReportResponseMutableBuilder[Self <: GetCredentialReportResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContent(value: ReportContentType): Self = StObject.set(x, "Content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentUndefined: Self = StObject.set(x, "Content", js.undefined)
    
    @scala.inline
    def setGeneratedTime(value: dateType): Self = StObject.set(x, "GeneratedTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGeneratedTimeUndefined: Self = StObject.set(x, "GeneratedTime", js.undefined)
    
    @scala.inline
    def setReportFormat(value: ReportFormatType): Self = StObject.set(x, "ReportFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReportFormatUndefined: Self = StObject.set(x, "ReportFormat", js.undefined)
  }
}
