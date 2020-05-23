package typings.ckeditor.CKEDITOR

import typings.ckeditor.CKEDITOR.dom.domObject
import typings.ckeditor.CKEDITOR.dom.element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait focusManager extends js.Object {
  var currentActive: domObject = js.native
  var hasFocus: Boolean = js.native
  def add(element: element, isCapture: Boolean): Unit = js.native
  def blur(): Unit = js.native
  def blur(noDelay: Boolean): Unit = js.native
  def focus(): Unit = js.native
  def focus(currentActive: element): Unit = js.native
  def lock(): Unit = js.native
  def remove(element: element): Unit = js.native
  def unlock(): Unit = js.native
}

