package typings.awsSdk.datasyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListTasksResponse extends js.Object {
  /**
    * An opaque string that indicates the position at which to begin returning the next list of tasks.
    */
  var NextToken: js.UndefOr[typings.awsSdk.datasyncMod.NextToken] = js.native
  /**
    * A list of all the tasks that are returned.
    */
  var Tasks: js.UndefOr[TaskList] = js.native
}

object ListTasksResponse {
  @scala.inline
  def apply(): ListTasksResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListTasksResponse]
  }
  @scala.inline
  implicit class ListTasksResponseOps[Self <: ListTasksResponse] (val x: Self) extends AnyVal {
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
    def setNextToken(value: NextToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
    @scala.inline
    def setTasksVarargs(value: TaskListEntry*): Self = this.set("Tasks", js.Array(value :_*))
    @scala.inline
    def setTasks(value: TaskList): Self = this.set("Tasks", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTasks: Self = this.set("Tasks", js.undefined)
  }
  
}

