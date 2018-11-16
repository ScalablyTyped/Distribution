package typings
package ckeditorLib.CKEDITORNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("CKEDITOR.ui.balloonPanel")
@js.native
class balloonPanel () extends js.Object {
  var activeShowListeners: ScalablyTyped.runtime.NumberDictionary[ckeditorLib.Anon_RemoveListenerListenerRegistration] = js.native
  var editor: ckeditorLib.CKEDITORNs.editor = js.native
  var focusables: ScalablyTyped.runtime.NumberDictionary[ckeditorLib.CKEDITORNs.domNs.element] = js.native
  var height: java.lang.String = js.native
  var parts: ckeditorLib.CKEDITORNs.uiNs.balloonPanelNs.parts = js.native
  var rect: ckeditorLib.CKEDITORNs.uiNs.balloonPanelNs.rect = js.native
  var showListeners: ScalablyTyped.runtime.NumberDictionary[js.Function0[ckeditorLib.CKEDITORNs.listenerRegistration]] = js.native
  var templateDefinitions: ckeditorLib.CKEDITORNs.uiNs.balloonPanelNs.templateDefinitions = js.native
  var templates: ckeditorLib.CKEDITORNs.uiNs.balloonPanelNs.templates = js.native
  var triangleHeight: scala.Double = js.native
  var triangleMinDistance: scala.Double = js.native
  var triangleWidth: scala.Double = js.native
  var width: scala.Double = js.native
  def activateShowListeners(): scala.Unit = js.native
  def activeShowListener(id: scala.Double): scala.Unit = js.native
  def addShowListener(listener: js.Function0[ckeditorLib.CKEDITORNs.listenerRegistration]): ckeditorLib.CKEDITORNs.listenerRegistration = js.native
  def attach(element: ckeditorLib.CKEDITORNs.domNs.element): scala.Unit = js.native
  def attach(element: ckeditorLib.CKEDITORNs.domNs.element, options: ckeditorLib.Anon_FocusElement): scala.Unit = js.native
  def attach(element: ckeditorLib.CKEDITORNs.domNs.element, options: ckeditorLib.CKEDITORNs.domNs.element): scala.Unit = js.native
  def attach(element: ckeditorLib.CKEDITORNs.domNs.element, options: scala.Boolean): scala.Unit = js.native
  def blur(): scala.Unit = js.native
  def build(): scala.Unit = js.native
  def deactivateShowListener(id: scala.Double): scala.Unit = js.native
  def deregisterFocusable(element: ckeditorLib.CKEDITORNs.domNs.element): scala.Unit = js.native
  def destroy(): scala.Unit = js.native
  def getHeight(): scala.Double = js.native
  def getWidth(): scala.Double = js.native
  def hide(): scala.Unit = js.native
  def move(top: scala.Double, left: scala.Double): scala.Unit = js.native
  def registerFocusable(element: ckeditorLib.CKEDITORNs.domNs.element): scala.Unit = js.native
  def removeShowListener(id: scala.Double): scala.Unit = js.native
  def resize(width: scala.Double, height: scala.Double): scala.Unit = js.native
  def setTitle(title: java.lang.String): scala.Unit = js.native
  @JSName("setTriangle")
  def setTriangle_bottom(side: ckeditorLib.ckeditorLibStrings.bottom): scala.Unit = js.native
  @JSName("setTriangle")
  def setTriangle_left(side: ckeditorLib.ckeditorLibStrings.left): scala.Unit = js.native
  @JSName("setTriangle")
  def setTriangle_right(side: ckeditorLib.ckeditorLibStrings.right): scala.Unit = js.native
  @JSName("setTriangle")
  def setTriangle_top(side: ckeditorLib.ckeditorLibStrings.top): scala.Unit = js.native
  def show(): scala.Unit = js.native
}

