package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeExportImageTasksRequest extends js.Object {
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.native
  /**
    * The IDs of the export image tasks.
    */
  var ExportImageTaskIds: js.UndefOr[ExportImageTaskIdList] = js.native
  /**
    * Filter tasks using the task-state filter and one of the following values: active, completed, deleting, or deleted.
    */
  var Filters: js.UndefOr[FilterList] = js.native
  /**
    * The maximum number of results to return in a single call.
    */
  var MaxResults: js.UndefOr[DescribeExportImageTasksMaxResults] = js.native
  /**
    * A token that indicates the next page of results.
    */
  var NextToken: js.UndefOr[typings.awsSdk.ec2Mod.NextToken] = js.native
}

object DescribeExportImageTasksRequest {
  @scala.inline
  def apply(): DescribeExportImageTasksRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeExportImageTasksRequest]
  }
  @scala.inline
  implicit class DescribeExportImageTasksRequestOps[Self <: DescribeExportImageTasksRequest] (val x: Self) extends AnyVal {
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
    def setDryRun(value: Boolean): Self = this.set("DryRun", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDryRun: Self = this.set("DryRun", js.undefined)
    @scala.inline
    def setExportImageTaskIdsVarargs(value: ExportImageTaskId*): Self = this.set("ExportImageTaskIds", js.Array(value :_*))
    @scala.inline
    def setExportImageTaskIds(value: ExportImageTaskIdList): Self = this.set("ExportImageTaskIds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExportImageTaskIds: Self = this.set("ExportImageTaskIds", js.undefined)
    @scala.inline
    def setFiltersVarargs(value: Filter*): Self = this.set("Filters", js.Array(value :_*))
    @scala.inline
    def setFilters(value: FilterList): Self = this.set("Filters", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilters: Self = this.set("Filters", js.undefined)
    @scala.inline
    def setMaxResults(value: DescribeExportImageTasksMaxResults): Self = this.set("MaxResults", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxResults: Self = this.set("MaxResults", js.undefined)
    @scala.inline
    def setNextToken(value: NextToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
  
}

