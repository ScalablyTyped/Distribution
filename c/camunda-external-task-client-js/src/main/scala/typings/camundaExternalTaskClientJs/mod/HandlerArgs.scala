package typings.camundaExternalTaskClientJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HandlerArgs extends js.Object {
  var task: Task
  var taskService: TaskService
}

object HandlerArgs {
  @scala.inline
  def apply(task: Task, taskService: TaskService): HandlerArgs = {
    val __obj = js.Dynamic.literal(task = task.asInstanceOf[js.Any], taskService = taskService.asInstanceOf[js.Any])
    __obj.asInstanceOf[HandlerArgs]
  }
}

