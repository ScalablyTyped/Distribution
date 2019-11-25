package typings.chosenDashJs.Chosen

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.chosenDashJs.chosenDashJsStrings.`chosen:updated`
  - typings.chosenDashJs.chosenDashJsStrings.`chosen:activate`
  - typings.chosenDashJs.chosenDashJsStrings.`chosen:open`
  - typings.chosenDashJs.chosenDashJsStrings.`chosen:close`
*/
trait TriggerEvent extends js.Object

object TriggerEvent {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def `chosen:activate`: typings.chosenDashJs.chosenDashJsStrings.`chosen:activate` = this.cast("chosen:activate")
  @scala.inline
  def `chosen:close`: typings.chosenDashJs.chosenDashJsStrings.`chosen:close` = this.cast("chosen:close")
  @scala.inline
  def `chosen:open`: typings.chosenDashJs.chosenDashJsStrings.`chosen:open` = this.cast("chosen:open")
  @scala.inline
  def `chosen:updated`: typings.chosenDashJs.chosenDashJsStrings.`chosen:updated` = this.cast("chosen:updated")
}

