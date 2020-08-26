package typings.awsSdk.fsxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeDataRepositoryTasksRequest extends js.Object {
  /**
    * (Optional) You can use filters to narrow the DescribeDataRepositoryTasks response to include just tasks for specific file systems, or tasks in a specific lifecycle state.
    */
  var Filters: js.UndefOr[DataRepositoryTaskFilters] = js.native
  var MaxResults: js.UndefOr[typings.awsSdk.fsxMod.MaxResults] = js.native
  var NextToken: js.UndefOr[typings.awsSdk.fsxMod.NextToken] = js.native
  /**
    * (Optional) IDs of the tasks whose descriptions you want to retrieve (String).
    */
  var TaskIds: js.UndefOr[typings.awsSdk.fsxMod.TaskIds] = js.native
}

object DescribeDataRepositoryTasksRequest {
  @scala.inline
  def apply(): DescribeDataRepositoryTasksRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeDataRepositoryTasksRequest]
  }
  @scala.inline
  implicit class DescribeDataRepositoryTasksRequestOps[Self <: DescribeDataRepositoryTasksRequest] (val x: Self) extends AnyVal {
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
    def setFiltersVarargs(value: DataRepositoryTaskFilter*): Self = this.set("Filters", js.Array(value :_*))
    @scala.inline
    def setFilters(value: DataRepositoryTaskFilters): Self = this.set("Filters", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilters: Self = this.set("Filters", js.undefined)
    @scala.inline
    def setMaxResults(value: MaxResults): Self = this.set("MaxResults", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxResults: Self = this.set("MaxResults", js.undefined)
    @scala.inline
    def setNextToken(value: NextToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
    @scala.inline
    def setTaskIdsVarargs(value: TaskId*): Self = this.set("TaskIds", js.Array(value :_*))
    @scala.inline
    def setTaskIds(value: TaskIds): Self = this.set("TaskIds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTaskIds: Self = this.set("TaskIds", js.undefined)
  }
  
}

