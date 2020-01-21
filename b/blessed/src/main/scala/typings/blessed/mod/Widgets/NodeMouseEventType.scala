package typings.blessed.mod.Widgets

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.blessed.blessedStrings.mouse
  - typings.blessed.blessedStrings.mouseout
  - typings.blessed.blessedStrings.mouseover
  - typings.blessed.blessedStrings.mousedown
  - typings.blessed.blessedStrings.mouseup
  - typings.blessed.blessedStrings.mousewheel
  - typings.blessed.blessedStrings.wheeldown
  - typings.blessed.blessedStrings.wheelup
  - typings.blessed.blessedStrings.mousemove
*/
trait NodeMouseEventType extends js.Object

object NodeMouseEventType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def mouse: typings.blessed.blessedStrings.mouse = this.cast("mouse")
  @scala.inline
  def mousedown: typings.blessed.blessedStrings.mousedown = this.cast("mousedown")
  @scala.inline
  def mousemove: typings.blessed.blessedStrings.mousemove = this.cast("mousemove")
  @scala.inline
  def mouseout: typings.blessed.blessedStrings.mouseout = this.cast("mouseout")
  @scala.inline
  def mouseover: typings.blessed.blessedStrings.mouseover = this.cast("mouseover")
  @scala.inline
  def mouseup: typings.blessed.blessedStrings.mouseup = this.cast("mouseup")
  @scala.inline
  def mousewheel: typings.blessed.blessedStrings.mousewheel = this.cast("mousewheel")
  @scala.inline
  def wheeldown: typings.blessed.blessedStrings.wheeldown = this.cast("wheeldown")
  @scala.inline
  def wheelup: typings.blessed.blessedStrings.wheelup = this.cast("wheelup")
}

