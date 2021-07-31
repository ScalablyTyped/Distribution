package typings.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListThingRegistrationTaskReportsResponse extends StObject {
  
  /**
    * The token to use to get the next set of results, or null if there are no additional results.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
  
  /**
    * The type of task report.
    */
  var reportType: js.UndefOr[ReportType] = js.undefined
  
  /**
    * Links to the task resources.
    */
  var resourceLinks: js.UndefOr[S3FileUrlList] = js.undefined
}
object ListThingRegistrationTaskReportsResponse {
  
  @scala.inline
  def apply(): ListThingRegistrationTaskReportsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListThingRegistrationTaskReportsResponse]
  }
  
  @scala.inline
  implicit class ListThingRegistrationTaskReportsResponseMutableBuilder[Self <: ListThingRegistrationTaskReportsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    @scala.inline
    def setReportType(value: ReportType): Self = StObject.set(x, "reportType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReportTypeUndefined: Self = StObject.set(x, "reportType", js.undefined)
    
    @scala.inline
    def setResourceLinks(value: S3FileUrlList): Self = StObject.set(x, "resourceLinks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceLinksUndefined: Self = StObject.set(x, "resourceLinks", js.undefined)
    
    @scala.inline
    def setResourceLinksVarargs(value: S3FileUrl*): Self = StObject.set(x, "resourceLinks", js.Array(value :_*))
  }
}
