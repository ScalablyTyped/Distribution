package typings.ckeditor4.CKEDITOR

import typings.ckeditor4.CKEDITOR.dom.element
import typings.ckeditor4.CKEDITOR.dom.elementPath
import typings.ckeditor4.CKEDITOR.dom.selection
import typings.ckeditor4.anon.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait menu extends StObject {
  
  def add(item: Any): Unit = js.native
  
  def addListener(
    listenerFn: js.Function3[/* startElement */ element, /* selection */ selection, /* path */ elementPath, Any]
  ): Unit = js.native
  
  def findItemByCommandName(commandName: String): Element = js.native
  
  def hide(): Unit = js.native
  def hide(returnFocus: Boolean): Unit = js.native
  
  def removeAll(): Unit = js.native
  
  def show(offsetParent: element): Unit = js.native
  def show(offsetParent: element, corner: Double): Unit = js.native
  def show(offsetParent: element, corner: Double, offsetX: Double): Unit = js.native
  def show(offsetParent: element, corner: Double, offsetX: Double, offsetY: Double): Unit = js.native
  def show(offsetParent: element, corner: Double, offsetX: Unit, offsetY: Double): Unit = js.native
  def show(offsetParent: element, corner: Unit, offsetX: Double): Unit = js.native
  def show(offsetParent: element, corner: Unit, offsetX: Double, offsetY: Double): Unit = js.native
  def show(offsetParent: element, corner: Unit, offsetX: Unit, offsetY: Double): Unit = js.native
}
