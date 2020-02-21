package typings.camundaExternalTaskClientJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.camundaExternalTaskClientJs.camundaExternalTaskClientJsStrings.completeColonsuccess
  - typings.camundaExternalTaskClientJs.camundaExternalTaskClientJsStrings.handleFailureColonsuccess
  - typings.camundaExternalTaskClientJs.camundaExternalTaskClientJsStrings.handleBpmnErrorColonsuccess
  - typings.camundaExternalTaskClientJs.camundaExternalTaskClientJsStrings.extendLockColonsuccess
  - typings.camundaExternalTaskClientJs.camundaExternalTaskClientJsStrings.unlockColonsuccess
*/
trait SuccessWithTaskEvent extends js.Object

object SuccessWithTaskEvent {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def completeColonsuccess: typings.camundaExternalTaskClientJs.camundaExternalTaskClientJsStrings.completeColonsuccess = this.cast("complete:success")
  @scala.inline
  def extendLockColonsuccess: typings.camundaExternalTaskClientJs.camundaExternalTaskClientJsStrings.extendLockColonsuccess = this.cast("extendLock:success")
  @scala.inline
  def handleBpmnErrorColonsuccess: typings.camundaExternalTaskClientJs.camundaExternalTaskClientJsStrings.handleBpmnErrorColonsuccess = this.cast("handleBpmnError:success")
  @scala.inline
  def handleFailureColonsuccess: typings.camundaExternalTaskClientJs.camundaExternalTaskClientJsStrings.handleFailureColonsuccess = this.cast("handleFailure:success")
  @scala.inline
  def unlockColonsuccess: typings.camundaExternalTaskClientJs.camundaExternalTaskClientJsStrings.unlockColonsuccess = this.cast("unlock:success")
}

