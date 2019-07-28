package typings.ckeditor.CKEDITORNs.pluginsNs

import typings.ckeditor.CKEDITORNs.domNs.element
import typings.ckeditor.CKEDITORNs.editor
import typings.ckeditor.CKEDITORNs.menu
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("CKEDITOR.plugins.contextMenu")
@js.native
class contextMenu protected () extends menu {
  def this(editor: editor) = this()
  def addTarget(element: element): Unit = js.native
  def addTarget(element: element, nativeContextMenuOnCtrl: Boolean): Unit = js.native
  def open(offsetParent: element): Unit = js.native
  def open(offsetParent: element, corner: Double): Unit = js.native
  def open(offsetParent: element, corner: Double, offsetX: Double): Unit = js.native
  def open(offsetParent: element, corner: Double, offsetX: Double, offsetY: Double): Unit = js.native
}

