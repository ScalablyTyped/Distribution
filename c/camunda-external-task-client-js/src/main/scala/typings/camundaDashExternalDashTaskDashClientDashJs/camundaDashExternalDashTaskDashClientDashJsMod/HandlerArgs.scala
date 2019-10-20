package typings.camundaDashExternalDashTaskDashClientDashJs.camundaDashExternalDashTaskDashClientDashJsMod

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
    val __obj = js.Dynamic.literal(task = task, taskService = taskService)
  
    __obj.asInstanceOf[HandlerArgs]
  }
}

