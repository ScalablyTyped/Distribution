package typings.ckeditor.CKEDITOR.ui.dialog

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("CKEDITOR.ui.dialog.select")
@js.native
class select protected () extends uiElement {
  def this(
    dialog: typings.ckeditor.CKEDITOR.dialog,
    elementDefinition: typings.ckeditor.CKEDITOR.ui.dialog.definitions.select,
    htmlList: js.Array[_]
  ) = this()
  def add(label: String): select = js.native
  def add(label: String, value: String): select = js.native
  def add(label: String, value: String, indexedDB: Double): select = js.native
  def clear(): select = js.native
  def remove(index: Double): select = js.native
}

