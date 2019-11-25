package typings.blessed.blessedMod.Widgets

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.blessed.blessedStrings.cancel
  - typings.blessed.blessedStrings.action
  - typings.blessed.blessedStrings.`create item`
  - typings.blessed.blessedStrings.`add item`
  - typings.blessed.blessedStrings.`remove item`
  - typings.blessed.blessedStrings.`insert item`
  - typings.blessed.blessedStrings.`set items`
*/
trait ListElementEventType extends js.Object

object ListElementEventType {
  @scala.inline
  def action: typings.blessed.blessedStrings.action = this.cast("action")
  @scala.inline
  def `add item`: typings.blessed.blessedStrings.`add item` = this.cast("add item")
  @scala.inline
  def cancel: typings.blessed.blessedStrings.cancel = this.cast("cancel")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def `create item`: typings.blessed.blessedStrings.`create item` = this.cast("create item")
  @scala.inline
  def `insert item`: typings.blessed.blessedStrings.`insert item` = this.cast("insert item")
  @scala.inline
  def `remove item`: typings.blessed.blessedStrings.`remove item` = this.cast("remove item")
  @scala.inline
  def `set items`: typings.blessed.blessedStrings.`set items` = this.cast("set items")
}

