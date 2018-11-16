package typings
package ckeditorLib.CKEDITORNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("CKEDITOR.focusManager")
@js.native
class focusManager protected () extends js.Object {
  def this(editor: editor) = this()
  var currentActive: ckeditorLib.CKEDITORNs.domNs.domObject = js.native
  var hasFocus: scala.Boolean = js.native
  def add(element: ckeditorLib.CKEDITORNs.domNs.element, isCapture: scala.Boolean): scala.Unit = js.native
  def blur(): scala.Unit = js.native
  def blur(noDelay: scala.Boolean): scala.Unit = js.native
  def focus(): scala.Unit = js.native
  def focus(currentActive: ckeditorLib.CKEDITORNs.domNs.element): scala.Unit = js.native
  def lock(): scala.Unit = js.native
  def remove(element: ckeditorLib.CKEDITORNs.domNs.element): scala.Unit = js.native
  def unlock(): scala.Unit = js.native
}

