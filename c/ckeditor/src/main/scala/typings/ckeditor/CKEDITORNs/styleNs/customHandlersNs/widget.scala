package typings.ckeditor.CKEDITORNs.styleNs.customHandlersNs

import typings.ckeditor.CKEDITORNs.domNs.element
import typings.ckeditor.CKEDITORNs.editor
import typings.ckeditor.CKEDITORNs.style
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("CKEDITOR.style.customHandlers.widget")
@js.native
class widget () extends style {
  var group: js.Array[_] = js.native
  var widget: String = js.native
  def checkElement(element: element): Boolean = js.native
  def getClassesArray(): js.Array[String] = js.native
  def removeStylesFromSameGroup(editor: editor): Boolean = js.native
}

