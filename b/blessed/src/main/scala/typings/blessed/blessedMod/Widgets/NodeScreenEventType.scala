package typings.blessed.blessedMod.Widgets

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.blessed.blessedStrings.focus
  - typings.blessed.blessedStrings.blur
  - typings.blessed.blessedStrings.click
  - typings.blessed.blessedStrings.`element click`
  - typings.blessed.blessedStrings.`element mouseover`
  - typings.blessed.blessedStrings.`element mouseout`
  - typings.blessed.blessedStrings.`element mouseup`
*/
trait NodeScreenEventType extends js.Object

object NodeScreenEventType {
  @scala.inline
  def blur: typings.blessed.blessedStrings.blur = this.cast("blur")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def click: typings.blessed.blessedStrings.click = this.cast("click")
  @scala.inline
  def `element click`: typings.blessed.blessedStrings.`element click` = this.cast("element click")
  @scala.inline
  def `element mouseout`: typings.blessed.blessedStrings.`element mouseout` = this.cast("element mouseout")
  @scala.inline
  def `element mouseover`: typings.blessed.blessedStrings.`element mouseover` = this.cast("element mouseover")
  @scala.inline
  def `element mouseup`: typings.blessed.blessedStrings.`element mouseup` = this.cast("element mouseup")
  @scala.inline
  def focus: typings.blessed.blessedStrings.focus = this.cast("focus")
}

