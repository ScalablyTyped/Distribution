package typings
package ckeditorLib.CKEDITORNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("CKEDITOR.ui.floatPanel")
@js.native
class floatPanel protected () extends js.Object {
  def this(editor: ckeditorLib.CKEDITORNs.editor, parentElement: ckeditorLib.CKEDITORNs.domNs.element, definition: ScalablyTyped.runtime.StringDictionary[js.Any], level: scala.Double) = this()
  def addBlock(name: java.lang.String, block: ScalablyTyped.runtime.StringDictionary[js.Any]): scala.Unit = js.native
  def addListBlock(name: java.lang.String, multiSelect: scala.Boolean): scala.Unit = js.native
  def allowBlur(allow: scala.Boolean): scala.Unit = js.native
  def blur(): scala.Unit = js.native
  def focus(): scala.Unit = js.native
  def getBlock(name: java.lang.String): ckeditorLib.CKEDITORNs.uiNs.panelNs.block = js.native
  def hide(returnFocus: scala.Boolean): scala.Unit = js.native
  def hideChild(restoreFocus: scala.Boolean): scala.Unit = js.native
  def reposition(): scala.Unit = js.native
  def showAsChild(
    panel: floatPanel,
    blckName: java.lang.String,
    offsetParent: ckeditorLib.CKEDITORNs.domNs.element,
    corner: scala.Double
  ): scala.Unit = js.native
  def showAsChild(
    panel: floatPanel,
    blckName: java.lang.String,
    offsetParent: ckeditorLib.CKEDITORNs.domNs.element,
    corner: scala.Double,
    offsetX: scala.Double
  ): scala.Unit = js.native
  def showAsChild(
    panel: floatPanel,
    blckName: java.lang.String,
    offsetParent: ckeditorLib.CKEDITORNs.domNs.element,
    corner: scala.Double,
    offsetX: scala.Double,
    offsetY: scala.Double
  ): scala.Unit = js.native
  def showBlock(name: java.lang.String, offsetParent: ckeditorLib.CKEDITORNs.domNs.element, corner: scala.Double): scala.Unit = js.native
  def showBlock(
    name: java.lang.String,
    offsetParent: ckeditorLib.CKEDITORNs.domNs.element,
    corner: scala.Double,
    offsetX: scala.Double
  ): scala.Unit = js.native
  def showBlock(
    name: java.lang.String,
    offsetParent: ckeditorLib.CKEDITORNs.domNs.element,
    corner: scala.Double,
    offsetX: scala.Double,
    offsetY: scala.Double
  ): scala.Unit = js.native
  def showBlock(
    name: java.lang.String,
    offsetParent: ckeditorLib.CKEDITORNs.domNs.element,
    corner: scala.Double,
    offsetX: scala.Double,
    offsetY: scala.Double,
    callback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
}

