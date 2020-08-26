package typings.awsSdk.discoveryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeImportTasksResponse extends js.Object {
  /**
    * The token to request the next page of results.
    */
  var nextToken: js.UndefOr[NextToken] = js.native
  /**
    * A returned array of import tasks that match any applied filters, up to the specified number of maximum results.
    */
  var tasks: js.UndefOr[ImportTaskList] = js.native
}

object DescribeImportTasksResponse {
  @scala.inline
  def apply(): DescribeImportTasksResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeImportTasksResponse]
  }
  @scala.inline
  implicit class DescribeImportTasksResponseOps[Self <: DescribeImportTasksResponse] (val x: Self) extends AnyVal {
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
    def setTasksVarargs(value: ImportTask*): Self = this.set("tasks", js.Array(value :_*))
    @scala.inline
    def setTasks(value: ImportTaskList): Self = this.set("tasks", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTasks: Self = this.set("tasks", js.undefined)
  }
  
}

