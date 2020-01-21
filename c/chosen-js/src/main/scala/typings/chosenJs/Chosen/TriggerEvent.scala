package typings.chosenJs.Chosen

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.chosenJs.chosenJsStrings.chosenColonupdated
  - typings.chosenJs.chosenJsStrings.chosenColonactivate
  - typings.chosenJs.chosenJsStrings.chosenColonopen
  - typings.chosenJs.chosenJsStrings.chosenColonclose
*/
trait TriggerEvent extends js.Object

object TriggerEvent {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def chosenColonactivate: typings.chosenJs.chosenJsStrings.chosenColonactivate = this.cast("chosen:activate")
  @scala.inline
  def chosenColonclose: typings.chosenJs.chosenJsStrings.chosenColonclose = this.cast("chosen:close")
  @scala.inline
  def chosenColonopen: typings.chosenJs.chosenJsStrings.chosenColonopen = this.cast("chosen:open")
  @scala.inline
  def chosenColonupdated: typings.chosenJs.chosenJsStrings.chosenColonupdated = this.cast("chosen:updated")
}

