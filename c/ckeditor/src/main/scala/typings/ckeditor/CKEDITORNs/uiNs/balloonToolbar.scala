package typings.ckeditor.CKEDITORNs.uiNs

import org.scalablytyped.runtime.StringDictionary
import typings.ckeditor.CKEDITORNs.editor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("CKEDITOR.ui.balloonToolbar")
@js.native
class balloonToolbar protected () extends js.Object {
  def this(editor: editor, definition: StringDictionary[js.Any]) = this()
  def addItem(name: String, element: button): Unit = js.native
  def addItem(name: String, element: richCombo): Unit = js.native
  def addItems(elements: StringDictionary[button | richCombo]): Unit = js.native
  def deleteItem(name: String): Unit = js.native
  def destroy(): Unit = js.native
  def getItem(name: String): button | richCombo = js.native
  def hide(): Unit = js.native
  def refresh(): Unit = js.native
  def show(): Unit = js.native
}

