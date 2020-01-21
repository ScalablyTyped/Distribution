package typings.bootstrap.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.bootstrap.bootstrapStrings.click
  - typings.bootstrap.bootstrapStrings.hover
  - typings.bootstrap.bootstrapStrings.focus
  - typings.bootstrap.bootstrapStrings.manual
  - typings.bootstrap.bootstrapStrings.`click hover`
  - typings.bootstrap.bootstrapStrings.`click focus`
  - typings.bootstrap.bootstrapStrings.`hover focus`
  - typings.bootstrap.bootstrapStrings.`click hover focus`
*/
trait Trigger extends js.Object

object Trigger {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def click: typings.bootstrap.bootstrapStrings.click = this.cast("click")
  @scala.inline
  def `click focus`: typings.bootstrap.bootstrapStrings.`click focus` = this.cast("click focus")
  @scala.inline
  def `click hover`: typings.bootstrap.bootstrapStrings.`click hover` = this.cast("click hover")
  @scala.inline
  def `click hover focus`: typings.bootstrap.bootstrapStrings.`click hover focus` = this.cast("click hover focus")
  @scala.inline
  def focus: typings.bootstrap.bootstrapStrings.focus = this.cast("focus")
  @scala.inline
  def hover: typings.bootstrap.bootstrapStrings.hover = this.cast("hover")
  @scala.inline
  def `hover focus`: typings.bootstrap.bootstrapStrings.`hover focus` = this.cast("hover focus")
  @scala.inline
  def manual: typings.bootstrap.bootstrapStrings.manual = this.cast("manual")
}

