package typings.ckeditor.global.CKEDITOR.plugins

import org.scalablytyped.runtime.StringDictionary
import typings.ckeditor.CKEDITOR.dom.element
import typings.ckeditor.CKEDITOR.editor
import typings.ckeditor.anon.Set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("CKEDITOR.plugins.link")
@js.native
object link extends js.Object {
  
  // DEPRECATED 4.3.3
  val emptyAnchorFix: Boolean = js.native
  
  // DEPRECATED 4.3.3
  val fakeAnchor: Boolean = js.native
  
  def getEditorAnchors(editor: editor): js.Array[element] = js.native
  
  def getLinkAttributes(editor: editor, data: StringDictionary[js.Any]): Set = js.native
  
  def getSelectedLink(editor: editor): element | js.Array[element] = js.native
  def getSelectedLink(editor: editor, returnMultiple: Boolean): element | js.Array[element] = js.native
  
  def parseLinkAttributes(editor: editor, element: element): StringDictionary[js.Any] = js.native
  
  def showDisplayTextForElement(element: element, editor: editor): Boolean = js.native
  
  // DEPRECATED 4.3.3
  val synAnchorSelector: Boolean = js.native
  
  def tryRestoreFakeAnchor(editor: editor, element: element): element = js.native
}
