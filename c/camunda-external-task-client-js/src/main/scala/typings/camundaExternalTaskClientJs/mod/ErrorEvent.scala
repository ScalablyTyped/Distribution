package typings.camundaExternalTaskClientJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.camundaExternalTaskClientJs.camundaExternalTaskClientJsStrings.pollColonerror
  - typings.camundaExternalTaskClientJs.camundaExternalTaskClientJsStrings.completeColonerror
*/
trait ErrorEvent extends js.Object

object ErrorEvent {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def completeColonerror: typings.camundaExternalTaskClientJs.camundaExternalTaskClientJsStrings.completeColonerror = this.cast("complete:error")
  @scala.inline
  def pollColonerror: typings.camundaExternalTaskClientJs.camundaExternalTaskClientJsStrings.pollColonerror = this.cast("poll:error")
}

