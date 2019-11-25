package typings.blessed.blessedMod.Widgets

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.blessed.blessedStrings.error
  - typings.blessed.blessedStrings.submit
  - typings.blessed.blessedStrings.cancel
  - typings.blessed.blessedStrings.action
*/
trait TextareaElementEventType extends js.Object

object TextareaElementEventType {
  @scala.inline
  def action: typings.blessed.blessedStrings.action = this.cast("action")
  @scala.inline
  def cancel: typings.blessed.blessedStrings.cancel = this.cast("cancel")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def error: typings.blessed.blessedStrings.error = this.cast("error")
  @scala.inline
  def submit: typings.blessed.blessedStrings.submit = this.cast("submit")
}

