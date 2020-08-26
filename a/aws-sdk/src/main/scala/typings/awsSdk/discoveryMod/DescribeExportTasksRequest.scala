package typings.awsSdk.discoveryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeExportTasksRequest extends js.Object {
  /**
    * One or more unique identifiers used to query the status of an export request.
    */
  var exportIds: js.UndefOr[ExportIds] = js.native
  /**
    * One or more filters.    AgentId - ID of the agent whose collected data will be exported  
    */
  var filters: js.UndefOr[ExportFilters] = js.native
  /**
    * The maximum number of volume results returned by DescribeExportTasks in paginated output. When this parameter is used, DescribeExportTasks only returns maxResults results in a single page along with a nextToken response element.
    */
  var maxResults: js.UndefOr[Integer] = js.native
  /**
    * The nextToken value returned from a previous paginated DescribeExportTasks request where maxResults was used and the results exceeded the value of that parameter. Pagination continues from the end of the previous results that returned the nextToken value. This value is null when there are no more results to return.
    */
  var nextToken: js.UndefOr[NextToken] = js.native
}

object DescribeExportTasksRequest {
  @scala.inline
  def apply(): DescribeExportTasksRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeExportTasksRequest]
  }
  @scala.inline
  implicit class DescribeExportTasksRequestOps[Self <: DescribeExportTasksRequest] (val x: Self) extends AnyVal {
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
    def setExportIdsVarargs(value: ConfigurationsExportId*): Self = this.set("exportIds", js.Array(value :_*))
    @scala.inline
    def setExportIds(value: ExportIds): Self = this.set("exportIds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExportIds: Self = this.set("exportIds", js.undefined)
    @scala.inline
    def setFiltersVarargs(value: ExportFilter*): Self = this.set("filters", js.Array(value :_*))
    @scala.inline
    def setFilters(value: ExportFilters): Self = this.set("filters", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilters: Self = this.set("filters", js.undefined)
    @scala.inline
    def setMaxResults(value: Integer): Self = this.set("maxResults", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxResults: Self = this.set("maxResults", js.undefined)
    @scala.inline
    def setNextToken(value: NextToken): Self = this.set("nextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("nextToken", js.undefined)
  }
  
}

