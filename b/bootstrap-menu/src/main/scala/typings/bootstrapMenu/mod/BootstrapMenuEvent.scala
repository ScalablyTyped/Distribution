package typings.bootstrapMenu.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.bootstrapMenu.bootstrapMenuStrings.click
  - typings.bootstrapMenu.bootstrapMenuStrings.`right-click`
  - typings.bootstrapMenu.bootstrapMenuStrings.hover
*/
trait BootstrapMenuEvent extends js.Object

object BootstrapMenuEvent {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def click: typings.bootstrapMenu.bootstrapMenuStrings.click = this.cast("click")
  @scala.inline
  def hover: typings.bootstrapMenu.bootstrapMenuStrings.hover = this.cast("hover")
  @scala.inline
  def `right-click`: typings.bootstrapMenu.bootstrapMenuStrings.`right-click` = this.cast("right-click")
}

