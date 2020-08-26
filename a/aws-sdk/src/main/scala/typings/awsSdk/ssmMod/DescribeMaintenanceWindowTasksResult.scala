package typings.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeMaintenanceWindowTasksResult extends js.Object {
  /**
    * The token to use when requesting the next set of items. If there are no additional items to return, the string is empty.
    */
  var NextToken: js.UndefOr[typings.awsSdk.ssmMod.NextToken] = js.native
  /**
    * Information about the tasks in the maintenance window.
    */
  var Tasks: js.UndefOr[MaintenanceWindowTaskList] = js.native
}

object DescribeMaintenanceWindowTasksResult {
  @scala.inline
  def apply(): DescribeMaintenanceWindowTasksResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeMaintenanceWindowTasksResult]
  }
  @scala.inline
  implicit class DescribeMaintenanceWindowTasksResultOps[Self <: DescribeMaintenanceWindowTasksResult] (val x: Self) extends AnyVal {
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
    def setNextToken(value: NextToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
    @scala.inline
    def setTasksVarargs(value: MaintenanceWindowTask*): Self = this.set("Tasks", js.Array(value :_*))
    @scala.inline
    def setTasks(value: MaintenanceWindowTaskList): Self = this.set("Tasks", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTasks: Self = this.set("Tasks", js.undefined)
  }
  
}

