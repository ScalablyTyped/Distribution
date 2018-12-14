package typings
package ckeditorLib.CKEDITORNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("CKEDITOR.ui.balloonToolbar")
@js.native
class balloonToolbar protected () extends js.Object {
  def this(editor: ckeditorLib.CKEDITORNs.editor, definition: org.scalablytyped.runtime.StringDictionary[js.Any]) = this()
  def addItem(name: java.lang.String, element: button): scala.Unit = js.native
  def addItem(name: java.lang.String, element: richCombo): scala.Unit = js.native
  def addItems(elements: org.scalablytyped.runtime.StringDictionary[button | richCombo]): scala.Unit = js.native
  def deleteItem(name: java.lang.String): scala.Unit = js.native
  def destroy(): scala.Unit = js.native
  def getItem(name: java.lang.String): button | richCombo = js.native
  def hide(): scala.Unit = js.native
  def refresh(): scala.Unit = js.native
  def show(): scala.Unit = js.native
}

