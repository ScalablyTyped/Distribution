package typings.awsSdk.discoveryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeExportTasksResponse extends StObject {
  
  /**
    * Contains one or more sets of export request details. When the status of a request is SUCCEEDED, the response includes a URL for an Amazon S3 bucket where you can view the data in a CSV file.
    */
  var exportsInfo: js.UndefOr[ExportsInfo] = js.native
  
  /**
    * The nextToken value to include in a future DescribeExportTasks request. When the results of a DescribeExportTasks request exceed maxResults, this value can be used to retrieve the next page of results. This value is null when there are no more results to return.
    */
  var nextToken: js.UndefOr[NextToken] = js.native
}
object DescribeExportTasksResponse {
  
  @scala.inline
  def apply(): DescribeExportTasksResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeExportTasksResponse]
  }
  
  @scala.inline
  implicit class DescribeExportTasksResponseMutableBuilder[Self <: DescribeExportTasksResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExportsInfo(value: ExportsInfo): Self = StObject.set(x, "exportsInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExportsInfoUndefined: Self = StObject.set(x, "exportsInfo", js.undefined)
    
    @scala.inline
    def setExportsInfoVarargs(value: ExportInfo*): Self = StObject.set(x, "exportsInfo", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
