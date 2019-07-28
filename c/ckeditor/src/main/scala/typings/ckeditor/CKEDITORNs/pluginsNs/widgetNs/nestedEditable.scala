package typings.ckeditor.CKEDITORNs.pluginsNs.widgetNs

import typings.ckeditor.Anon_Filter
import typings.ckeditor.CKEDITORNs.domNs.element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("CKEDITOR.plugins.widget.nestedEditable")
@js.native
class nestedEditable protected () extends element {
  def this(editor: typings.ckeditor.CKEDITORNs.editor, element: element, config: Anon_Filter) = this()
  val editor: typings.ckeditor.CKEDITORNs.editor = js.native
  val enterMode: Double = js.native
  val filter: typings.ckeditor.CKEDITORNs.filter = js.native
  val shiftEnterMode: Double = js.native
  def getData(): String = js.native
  def setData(data: String): Unit = js.native
}

