package typings.awsSdk.iamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetCredentialReportResponse extends js.Object {
  
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
  implicit class GetCredentialReportResponseOps[Self <: GetCredentialReportResponse] (val x: Self) extends AnyVal {
    
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
    def setContent(value: ReportContentType): Self = this.set("Content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContent: Self = this.set("Content", js.undefined)
    
    @scala.inline
    def setGeneratedTime(value: dateType): Self = this.set("GeneratedTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGeneratedTime: Self = this.set("GeneratedTime", js.undefined)
    
    @scala.inline
    def setReportFormat(value: ReportFormatType): Self = this.set("ReportFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReportFormat: Self = this.set("ReportFormat", js.undefined)
  }
}
