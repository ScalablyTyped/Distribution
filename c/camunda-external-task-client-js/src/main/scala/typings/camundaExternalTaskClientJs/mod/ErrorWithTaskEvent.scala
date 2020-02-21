package typings.camundaExternalTaskClientJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.camundaExternalTaskClientJs.camundaExternalTaskClientJsStrings.handleFailureColonerror
  - typings.camundaExternalTaskClientJs.camundaExternalTaskClientJsStrings.handleBpmnErrorColonerror
  - typings.camundaExternalTaskClientJs.camundaExternalTaskClientJsStrings.extendLockColonerror
  - typings.camundaExternalTaskClientJs.camundaExternalTaskClientJsStrings.unlockColonerror
*/
trait ErrorWithTaskEvent extends js.Object

object ErrorWithTaskEvent {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def extendLockColonerror: typings.camundaExternalTaskClientJs.camundaExternalTaskClientJsStrings.extendLockColonerror = this.cast("extendLock:error")
  @scala.inline
  def handleBpmnErrorColonerror: typings.camundaExternalTaskClientJs.camundaExternalTaskClientJsStrings.handleBpmnErrorColonerror = this.cast("handleBpmnError:error")
  @scala.inline
  def handleFailureColonerror: typings.camundaExternalTaskClientJs.camundaExternalTaskClientJsStrings.handleFailureColonerror = this.cast("handleFailure:error")
  @scala.inline
  def unlockColonerror: typings.camundaExternalTaskClientJs.camundaExternalTaskClientJsStrings.unlockColonerror = this.cast("unlock:error")
}

