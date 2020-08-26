package typings.awsSdk.swfMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CountPendingActivityTasksInput extends js.Object {
  /**
    * The name of the domain that contains the task list.
    */
  var domain: DomainName = js.native
  /**
    * The name of the task list.
    */
  var taskList: TaskList = js.native
}

object CountPendingActivityTasksInput {
  @scala.inline
  def apply(domain: DomainName, taskList: TaskList): CountPendingActivityTasksInput = {
    val __obj = js.Dynamic.literal(domain = domain.asInstanceOf[js.Any], taskList = taskList.asInstanceOf[js.Any])
    __obj.asInstanceOf[CountPendingActivityTasksInput]
  }
  @scala.inline
  implicit class CountPendingActivityTasksInputOps[Self <: CountPendingActivityTasksInput] (val x: Self) extends AnyVal {
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
    def setDomain(value: DomainName): Self = this.set("domain", value.asInstanceOf[js.Any])
    @scala.inline
    def setTaskList(value: TaskList): Self = this.set("taskList", value.asInstanceOf[js.Any])
  }
  
}

