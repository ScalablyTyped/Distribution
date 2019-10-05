package typings.ckeditor.CKEDITOR.dom

import typings.ckeditor.Window
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("CKEDITOR.dom.window")
@js.native
class window protected () extends domObject {
  def this(domWindow: Window) = this()
  def focus(): Unit = js.native
  def getFrame(): element = js.native
  def getScrollPosition(): position = js.native
  def getViewPaneSize(): widthAndHeight = js.native
}

