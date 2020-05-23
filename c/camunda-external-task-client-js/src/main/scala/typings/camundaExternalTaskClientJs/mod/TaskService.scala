package typings.camundaExternalTaskClientJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TaskService extends js.Object {
  def complete(task: Task): js.Promise[Unit] = js.native
  def complete(task: Task, processVariables: Variables): js.Promise[Unit] = js.native
  def complete(task: Task, processVariables: Variables, localVariables: Variables): js.Promise[Unit] = js.native
  def extendLock(task: Task, newDuration: Double): js.Promise[Unit] = js.native
  def handleBpmnError(task: Task, errorCode: String): js.Promise[Unit] = js.native
  def handleBpmnError(task: Task, errorCode: String, errorMessage: String): js.Promise[Unit] = js.native
  def handleBpmnError(task: Task, errorCode: String, errorMessage: String, variables: Variables): js.Promise[Unit] = js.native
  def handleFailure(task: Task): js.Promise[Unit] = js.native
  def handleFailure(task: Task, options: HandleFailureOptions): js.Promise[Unit] = js.native
  def unlock(task: Task): js.Promise[Unit] = js.native
}

