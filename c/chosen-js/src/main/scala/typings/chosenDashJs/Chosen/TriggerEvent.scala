package typings.chosenDashJs.Chosen

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.chosenDashJs.chosenDashJsStrings.chosenColonupdated
  - typings.chosenDashJs.chosenDashJsStrings.chosenColonactivate
  - typings.chosenDashJs.chosenDashJsStrings.chosenColonopen
  - typings.chosenDashJs.chosenDashJsStrings.chosenColonclose
*/
trait TriggerEvent extends js.Object

object TriggerEvent {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def chosenColonactivate: typings.chosenDashJs.chosenDashJsStrings.chosenColonactivate = this.cast("chosen:activate")
  @scala.inline
  def chosenColonclose: typings.chosenDashJs.chosenDashJsStrings.chosenColonclose = this.cast("chosen:close")
  @scala.inline
  def chosenColonopen: typings.chosenDashJs.chosenDashJsStrings.chosenColonopen = this.cast("chosen:open")
  @scala.inline
  def chosenColonupdated: typings.chosenDashJs.chosenDashJsStrings.chosenColonupdated = this.cast("chosen:updated")
}

