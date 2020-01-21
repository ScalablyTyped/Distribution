package typings.blessed.mod.Widgets

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.blessed.blessedStrings.resize
  - typings.blessed.blessedStrings.prerender
  - typings.blessed.blessedStrings.render
  - typings.blessed.blessedStrings.destroy
  - typings.blessed.blessedStrings.move
  - typings.blessed.blessedStrings.show
  - typings.blessed.blessedStrings.hide
  - typings.blessed.blessedStrings.`set content`
  - typings.blessed.blessedStrings.`parsed content`
*/
trait NodeGenericEventType extends js.Object

object NodeGenericEventType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def destroy: typings.blessed.blessedStrings.destroy = this.cast("destroy")
  @scala.inline
  def hide: typings.blessed.blessedStrings.hide = this.cast("hide")
  @scala.inline
  def move: typings.blessed.blessedStrings.move = this.cast("move")
  @scala.inline
  def `parsed content`: typings.blessed.blessedStrings.`parsed content` = this.cast("parsed content")
  @scala.inline
  def prerender: typings.blessed.blessedStrings.prerender = this.cast("prerender")
  @scala.inline
  def render: typings.blessed.blessedStrings.render = this.cast("render")
  @scala.inline
  def resize: typings.blessed.blessedStrings.resize = this.cast("resize")
  @scala.inline
  def `set content`: typings.blessed.blessedStrings.`set content` = this.cast("set content")
  @scala.inline
  def show: typings.blessed.blessedStrings.show = this.cast("show")
}

