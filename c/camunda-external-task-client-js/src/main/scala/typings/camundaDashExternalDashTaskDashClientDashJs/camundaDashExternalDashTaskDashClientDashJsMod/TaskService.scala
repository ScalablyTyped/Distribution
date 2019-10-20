package typings.camundaDashExternalDashTaskDashClientDashJs.camundaDashExternalDashTaskDashClientDashJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TaskService extends js.Object {
  def complete(task: Task): Unit = js.native
  def complete(task: Task, processVariables: Variables): Unit = js.native
  def complete(task: Task, processVariables: Variables, localVariables: Variables): Unit = js.native
  def extendLock(task: Task, newDuration: Double): Unit = js.native
  def handleBpmnError(task: Task, errorCode: String): Unit = js.native
  def handleBpmnError(task: Task, errorCode: String, errorMessage: String): Unit = js.native
  def handleBpmnError(task: Task, errorCode: String, errorMessage: String, variables: Variables): Unit = js.native
  def handleFailure(task: Task): Unit = js.native
  def handleFailure(task: Task, options: HandleFailureOptions): Unit = js.native
  def unlock(task: Task): Unit = js.native
}

