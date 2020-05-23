package typings.ckeditor.CKEDITOR.plugins.balloontoolbar

import typings.ckeditor.CKEDITOR.dom.element
import typings.ckeditor.CKEDITOR.ui.balloonToolbar
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait context extends js.Object {
  var editor: typings.ckeditor.CKEDITOR.editor = js.native
  var options: contextDefinition = js.native
  var toolbar: balloonToolbar = js.native
  def destroy(): Unit = js.native
  def hide(): Unit = js.native
  def refresh(): Unit = js.native
  def show(): Unit = js.native
  def show(pointedElement: element): Unit = js.native
}

