package typings.ckeditor.CKEDITORNs.uiNs

import org.scalablytyped.runtime.StringDictionary
import typings.ckeditor.CKEDITORNs.domNs.element
import typings.ckeditor.CKEDITORNs.editor
import typings.ckeditor.CKEDITORNs.uiNs.panelNs.block
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("CKEDITOR.ui.floatPanel")
@js.native
class floatPanel protected () extends js.Object {
  def this(editor: editor, parentElement: element, definition: StringDictionary[js.Any], level: Double) = this()
  def addBlock(name: String, block: StringDictionary[js.Any]): Unit = js.native
  def addListBlock(name: String, multiSelect: Boolean): Unit = js.native
  def allowBlur(allow: Boolean): Unit = js.native
  def blur(): Unit = js.native
  def focus(): Unit = js.native
  def getBlock(name: String): block = js.native
  def hide(returnFocus: Boolean): Unit = js.native
  def hideChild(restoreFocus: Boolean): Unit = js.native
  def reposition(): Unit = js.native
  def showAsChild(panel: floatPanel, blckName: String, offsetParent: element, corner: Double): Unit = js.native
  def showAsChild(panel: floatPanel, blckName: String, offsetParent: element, corner: Double, offsetX: Double): Unit = js.native
  def showAsChild(
    panel: floatPanel,
    blckName: String,
    offsetParent: element,
    corner: Double,
    offsetX: Double,
    offsetY: Double
  ): Unit = js.native
  def showBlock(name: String, offsetParent: element, corner: Double): Unit = js.native
  def showBlock(name: String, offsetParent: element, corner: Double, offsetX: Double): Unit = js.native
  def showBlock(name: String, offsetParent: element, corner: Double, offsetX: Double, offsetY: Double): Unit = js.native
  def showBlock(
    name: String,
    offsetParent: element,
    corner: Double,
    offsetX: Double,
    offsetY: Double,
    callback: js.Function0[Unit]
  ): Unit = js.native
}

