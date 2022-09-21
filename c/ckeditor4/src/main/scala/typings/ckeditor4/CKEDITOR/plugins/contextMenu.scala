package typings.ckeditor4.CKEDITOR.plugins

import typings.ckeditor4.CKEDITOR.dom.element
import typings.ckeditor4.CKEDITOR.menu
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait contextMenu
  extends StObject
     with menu {
  
  def addTarget(element: element): Unit = js.native
  def addTarget(element: element, nativeContextMenuOnCtrl: Boolean): Unit = js.native
  
  def open(offsetParent: element): Unit = js.native
  def open(offsetParent: element, corner: Double): Unit = js.native
  def open(offsetParent: element, corner: Double, offsetX: Double): Unit = js.native
  def open(offsetParent: element, corner: Double, offsetX: Double, offsetY: Double): Unit = js.native
  def open(offsetParent: element, corner: Double, offsetX: Unit, offsetY: Double): Unit = js.native
  def open(offsetParent: element, corner: Unit, offsetX: Double): Unit = js.native
  def open(offsetParent: element, corner: Unit, offsetX: Double, offsetY: Double): Unit = js.native
  def open(offsetParent: element, corner: Unit, offsetX: Unit, offsetY: Double): Unit = js.native
}
