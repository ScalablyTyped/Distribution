package typings.ckeditor.CKEDITOR.ui

import org.scalablytyped.runtime.StringDictionary
import typings.ckeditor.CKEDITOR.dom.element
import typings.ckeditor.CKEDITOR.ui.panel.block
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait floatPanel extends js.Object {
  
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
  def showAsChild(
    panel: floatPanel,
    blckName: String,
    offsetParent: element,
    corner: Double,
    offsetX: js.UndefOr[scala.Nothing],
    offsetY: Double
  ): Unit = js.native
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
  def showBlock(
    name: String,
    offsetParent: element,
    corner: Double,
    offsetX: js.UndefOr[scala.Nothing],
    offsetY: js.UndefOr[scala.Nothing],
    callback: js.Function0[Unit]
  ): Unit = js.native
  def showBlock(
    name: String,
    offsetParent: element,
    corner: Double,
    offsetX: js.UndefOr[scala.Nothing],
    offsetY: Double
  ): Unit = js.native
  def showBlock(
    name: String,
    offsetParent: element,
    corner: Double,
    offsetX: js.UndefOr[scala.Nothing],
    offsetY: Double,
    callback: js.Function0[Unit]
  ): Unit = js.native
  def showBlock(name: String, offsetParent: element, corner: Double, offsetX: Double): Unit = js.native
  def showBlock(
    name: String,
    offsetParent: element,
    corner: Double,
    offsetX: Double,
    offsetY: js.UndefOr[scala.Nothing],
    callback: js.Function0[Unit]
  ): Unit = js.native
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
