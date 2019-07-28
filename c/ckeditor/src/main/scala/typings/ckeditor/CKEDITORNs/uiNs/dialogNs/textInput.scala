package typings.ckeditor.CKEDITORNs.uiNs.dialogNs

import typings.ckeditor.CKEDITORNs.dialog
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("CKEDITOR.ui.dialog.textInput")
@js.native
class textInput protected () extends labeledElement {
  def this(
    dialog: dialog,
    elementDefinition: typings.ckeditor.CKEDITORNs.uiNs.dialogNs.definitionsNs.textInput,
    htmlList: js.Array[_]
  ) = this()
  def accessKeyUp(): Unit = js.native
  def getDirectionMarker(): String = js.native
  def select(): Unit = js.native
  def setDirectionMarker(dir: String): Unit = js.native
  def setValue(value: String, noChangeEvent: Boolean): textInput = js.native
}

