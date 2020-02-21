package typings.camundaExternalTaskClientJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.camundaExternalTaskClientJs.camundaExternalTaskClientJsStrings.pollColonstart
  - typings.camundaExternalTaskClientJs.camundaExternalTaskClientJsStrings.pollColonstop
*/
trait PollEvent extends js.Object

object PollEvent {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def pollColonstart: typings.camundaExternalTaskClientJs.camundaExternalTaskClientJsStrings.pollColonstart = this.cast("poll:start")
  @scala.inline
  def pollColonstop: typings.camundaExternalTaskClientJs.camundaExternalTaskClientJsStrings.pollColonstop = this.cast("poll:stop")
}

