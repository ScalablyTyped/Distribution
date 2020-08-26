package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeImportSnapshotTasksRequest extends js.Object {
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.native
  /**
    * The filters.
    */
  var Filters: js.UndefOr[FilterList] = js.native
  /**
    * A list of import snapshot task IDs.
    */
  var ImportTaskIds: js.UndefOr[ImportSnapshotTaskIdList] = js.native
  /**
    * The maximum number of results to return in a single call. To retrieve the remaining results, make another call with the returned NextToken value.
    */
  var MaxResults: js.UndefOr[Integer] = js.native
  /**
    * A token that indicates the next page of results.
    */
  var NextToken: js.UndefOr[String] = js.native
}

object DescribeImportSnapshotTasksRequest {
  @scala.inline
  def apply(): DescribeImportSnapshotTasksRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeImportSnapshotTasksRequest]
  }
  @scala.inline
  implicit class DescribeImportSnapshotTasksRequestOps[Self <: DescribeImportSnapshotTasksRequest] (val x: Self) extends AnyVal {
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
    def setFiltersVarargs(value: Filter*): Self = this.set("Filters", js.Array(value :_*))
    @scala.inline
    def setFilters(value: FilterList): Self = this.set("Filters", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilters: Self = this.set("Filters", js.undefined)
    @scala.inline
    def setImportTaskIdsVarargs(value: ImportSnapshotTaskId*): Self = this.set("ImportTaskIds", js.Array(value :_*))
    @scala.inline
    def setImportTaskIds(value: ImportSnapshotTaskIdList): Self = this.set("ImportTaskIds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImportTaskIds: Self = this.set("ImportTaskIds", js.undefined)
    @scala.inline
    def setMaxResults(value: Integer): Self = this.set("MaxResults", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxResults: Self = this.set("MaxResults", js.undefined)
    @scala.inline
    def setNextToken(value: String): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
  
}

