package typings.ckeditor.CKEDITOR.plugins

import org.scalablytyped.runtime.StringDictionary
import typings.ckeditor.Anon_Key
import typings.ckeditor.CKEDITOR.dom.element
import typings.ckeditor.CKEDITOR.editor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("CKEDITOR.plugins.link")
@js.native
object link extends js.Object {
  // DEPRECATED 4.3.3
  val emptyAnchorFix: Boolean = js.native
  // DEPRECATED 4.3.3
  val fakeAnchor: Boolean = js.native
  // DEPRECATED 4.3.3
  val synAnchorSelector: Boolean = js.native
  def getEditorAnchors(editor: editor): js.Array[element] = js.native
  def getLinkAttributes(editor: editor, data: StringDictionary[js.Any]): Anon_Key = js.native
  def getSelectedLink(editor: editor): element | js.Array[element] = js.native
  def getSelectedLink(editor: editor, returnMultiple: Boolean): element | js.Array[element] = js.native
  def parseLinkAttributes(editor: editor, element: element): StringDictionary[js.Any] = js.native
  def showDisplayTextForElement(element: element, editor: editor): Boolean = js.native
  def tryRestoreFakeAnchor(editor: editor, element: element): element = js.native
}

