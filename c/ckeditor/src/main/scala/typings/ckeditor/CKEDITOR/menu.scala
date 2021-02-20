package typings.ckeditor.CKEDITOR

import typings.ckeditor.CKEDITOR.dom.element
import typings.ckeditor.CKEDITOR.dom.elementPath
import typings.ckeditor.CKEDITOR.dom.selection
import typings.ckeditor.anon.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait menu extends StObject {
  
  def add(item: js.Any): Unit = js.native
  
  def addListener(
    listenerFn: js.Function3[/* startElement */ element, /* selection */ selection, /* path */ elementPath, _]
  ): Unit = js.native
  
  def findItemByCommandName(commandName: String): Element = js.native
  
  def hide(): Unit = js.native
  def hide(returnFocus: Boolean): Unit = js.native
  
  def removeAll(): Unit = js.native
  
  def show(offsetParent: element): Unit = js.native
  def show(
    offsetParent: element,
    corner: js.UndefOr[scala.Nothing],
    offsetX: js.UndefOr[scala.Nothing],
    offsetY: Double
  ): Unit = js.native
  def show(offsetParent: element, corner: js.UndefOr[scala.Nothing], offsetX: Double): Unit = js.native
  def show(offsetParent: element, corner: js.UndefOr[scala.Nothing], offsetX: Double, offsetY: Double): Unit = js.native
  def show(offsetParent: element, corner: Double): Unit = js.native
  def show(offsetParent: element, corner: Double, offsetX: js.UndefOr[scala.Nothing], offsetY: Double): Unit = js.native
  def show(offsetParent: element, corner: Double, offsetX: Double): Unit = js.native
  def show(offsetParent: element, corner: Double, offsetX: Double, offsetY: Double): Unit = js.native
}
