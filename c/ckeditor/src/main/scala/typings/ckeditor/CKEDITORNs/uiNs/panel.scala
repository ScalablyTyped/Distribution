package typings.ckeditor.CKEDITORNs.uiNs

import org.scalablytyped.runtime.StringDictionary
import typings.ckeditor.CKEDITORNs.domNs.document
import typings.ckeditor.CKEDITORNs.editor
import typings.ckeditor.CKEDITORNs.uiNs.panelNs.block
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("CKEDITOR.ui.panel")
@js.native
class panel protected () extends js.Object {
  def this(document: document, definition: StringDictionary[js.Any]) = this()
  def addBlock(name: String, block: StringDictionary[js.Any]): Unit = js.native
  def getBlock(name: String): block = js.native
  def render(editor: editor): Unit = js.native
  def render(editor: editor, output: js.Array[String]): Unit = js.native
  def showBlock(name: String): Unit = js.native
}

