package typings.ckeditor.CKEDITORNs.uiNs.dialogNs

import typings.ckeditor.CKEDITORNs.dialog
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("CKEDITOR.ui.dialog.select")
@js.native
class select protected () extends uiElement {
  def this(
    dialog: dialog,
    elementDefinition: typings.ckeditor.CKEDITORNs.uiNs.dialogNs.definitionsNs.select,
    htmlList: js.Array[_]
  ) = this()
  def add(label: String): select = js.native
  def add(label: String, value: String): select = js.native
  def add(label: String, value: String, indexedDB: Double): select = js.native
  def clear(): select = js.native
  def remove(index: Double): select = js.native
}

