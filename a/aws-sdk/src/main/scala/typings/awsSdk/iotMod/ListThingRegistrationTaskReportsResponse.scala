package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListThingRegistrationTaskReportsResponse extends js.Object {
  
  /**
    * The token to use to get the next set of results, or null if there are no additional results.
    */
  var nextToken: js.UndefOr[NextToken] = js.native
  
  /**
    * The type of task report.
    */
  var reportType: js.UndefOr[ReportType] = js.native
  
  /**
    * Links to the task resources.
    */
  var resourceLinks: js.UndefOr[S3FileUrlList] = js.native
}
object ListThingRegistrationTaskReportsResponse {
  
  @scala.inline
  def apply(): ListThingRegistrationTaskReportsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListThingRegistrationTaskReportsResponse]
  }
  
  @scala.inline
  implicit class ListThingRegistrationTaskReportsResponseOps[Self <: ListThingRegistrationTaskReportsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setNextToken(value: NextToken): Self = this.set("nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("nextToken", js.undefined)
    
    @scala.inline
    def setReportType(value: ReportType): Self = this.set("reportType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReportType: Self = this.set("reportType", js.undefined)
    
    @scala.inline
    def setResourceLinksVarargs(value: S3FileUrl*): Self = this.set("resourceLinks", js.Array(value :_*))
    
    @scala.inline
    def setResourceLinks(value: S3FileUrlList): Self = this.set("resourceLinks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResourceLinks: Self = this.set("resourceLinks", js.undefined)
  }
}
