package typings.ckeditor.CKEDITORNs

import typings.ckeditor.CKEDITORNs.domNs.domObject
import typings.ckeditor.CKEDITORNs.domNs.element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("CKEDITOR.focusManager")
@js.native
class focusManager protected () extends js.Object {
  def this(editor: editor) = this()
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

