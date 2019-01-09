package typings
package ckeditorLib.CKEDITORNs.pluginsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("CKEDITOR.plugins.link")
@js.native
object linkNs extends js.Object {
  // DEPRECATED 4.3.3
  val emptyAnchorFix: scala.Boolean = js.native
  // DEPRECATED 4.3.3
  val fakeAnchor: scala.Boolean = js.native
  // DEPRECATED 4.3.3
  val synAnchorSelector: scala.Boolean = js.native
  def getEditorAnchors(editor: ckeditorLib.CKEDITORNs.editor): js.Array[ckeditorLib.CKEDITORNs.domNs.element] = js.native
  def getLinkAttributes(editor: ckeditorLib.CKEDITORNs.editor, data: org.scalablytyped.runtime.StringDictionary[js.Any]): ckeditorLib.Anon_Key = js.native
  def getSelectedLink(editor: ckeditorLib.CKEDITORNs.editor): ckeditorLib.CKEDITORNs.domNs.element | js.Array[ckeditorLib.CKEDITORNs.domNs.element] = js.native
  def getSelectedLink(editor: ckeditorLib.CKEDITORNs.editor, returnMultiple: scala.Boolean): ckeditorLib.CKEDITORNs.domNs.element | js.Array[ckeditorLib.CKEDITORNs.domNs.element] = js.native
  def parseLinkAttributes(editor: ckeditorLib.CKEDITORNs.editor, element: ckeditorLib.CKEDITORNs.domNs.element): org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
  def showDisplayTextForElement(element: ckeditorLib.CKEDITORNs.domNs.element, editor: ckeditorLib.CKEDITORNs.editor): scala.Boolean = js.native
  def tryRestoreFakeAnchor(editor: ckeditorLib.CKEDITORNs.editor, element: ckeditorLib.CKEDITORNs.domNs.element): ckeditorLib.CKEDITORNs.domNs.element = js.native
}

