package typings.ckeditor.CKEDITORNs.uiNs

import org.scalablytyped.runtime.NumberDictionary
import typings.ckeditor.Anon_FocusElement
import typings.ckeditor.Anon_RemoveListenerListenerRegistration
import typings.ckeditor.CKEDITORNs.domNs.element
import typings.ckeditor.CKEDITORNs.listenerRegistration
import typings.ckeditor.ckeditorStrings.bottom
import typings.ckeditor.ckeditorStrings.left
import typings.ckeditor.ckeditorStrings.right
import typings.ckeditor.ckeditorStrings.top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("CKEDITOR.ui.balloonPanel")
@js.native
class balloonPanel () extends js.Object {
  var activeShowListeners: NumberDictionary[Anon_RemoveListenerListenerRegistration] = js.native
  var editor: typings.ckeditor.CKEDITORNs.editor = js.native
  var focusables: NumberDictionary[element] = js.native
  var height: String = js.native
  var parts: typings.ckeditor.CKEDITORNs.uiNs.balloonPanelNs.parts = js.native
  var rect: typings.ckeditor.CKEDITORNs.uiNs.balloonPanelNs.rect = js.native
  var showListeners: NumberDictionary[js.Function0[listenerRegistration]] = js.native
  var templateDefinitions: typings.ckeditor.CKEDITORNs.uiNs.balloonPanelNs.templateDefinitions = js.native
  var templates: typings.ckeditor.CKEDITORNs.uiNs.balloonPanelNs.templates = js.native
  var triangleHeight: Double = js.native
  var triangleMinDistance: Double = js.native
  var triangleWidth: Double = js.native
  var width: Double = js.native
  def activateShowListeners(): Unit = js.native
  def activeShowListener(id: Double): Unit = js.native
  def addShowListener(listener: js.Function0[listenerRegistration]): listenerRegistration = js.native
  def attach(element: element): Unit = js.native
  def attach(element: element, options: Boolean): Unit = js.native
  def attach(element: element, options: Anon_FocusElement): Unit = js.native
  def attach(element: element, options: element): Unit = js.native
  def blur(): Unit = js.native
  def build(): Unit = js.native
  def deactivateShowListener(id: Double): Unit = js.native
  def deregisterFocusable(element: element): Unit = js.native
  def destroy(): Unit = js.native
  def getHeight(): Double = js.native
  def getWidth(): Double = js.native
  def hide(): Unit = js.native
  def move(top: Double, left: Double): Unit = js.native
  def registerFocusable(element: element): Unit = js.native
  def removeShowListener(id: Double): Unit = js.native
  def resize(width: Double, height: Double): Unit = js.native
  def setTitle(title: String): Unit = js.native
  @JSName("setTriangle")
  def setTriangle_bottom(side: bottom): Unit = js.native
  @JSName("setTriangle")
  def setTriangle_left(side: left): Unit = js.native
  @JSName("setTriangle")
  def setTriangle_right(side: right): Unit = js.native
  @JSName("setTriangle")
  def setTriangle_top(side: top): Unit = js.native
  def show(): Unit = js.native
}

