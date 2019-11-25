package typings.bootstrapDashMenu.bootstrapDashMenuMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.bootstrapDashMenu.bootstrapDashMenuStrings.click
  - typings.bootstrapDashMenu.bootstrapDashMenuStrings.`right-click`
  - typings.bootstrapDashMenu.bootstrapDashMenuStrings.hover
*/
trait BootstrapMenuEvent extends js.Object

object BootstrapMenuEvent {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def click: typings.bootstrapDashMenu.bootstrapDashMenuStrings.click = this.cast("click")
  @scala.inline
  def hover: typings.bootstrapDashMenu.bootstrapDashMenuStrings.hover = this.cast("hover")
  @scala.inline
  def `right-click`: typings.bootstrapDashMenu.bootstrapDashMenuStrings.`right-click` = this.cast("right-click")
}

