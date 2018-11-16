package typings
package ckeditorLib.CKEDITORNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("CKEDITOR.menu")
@js.native
class menu () extends js.Object {
  def add(item: js.Any): scala.Unit = js.native
  def addListener(
    listenerFn: js.Function3[
      /* startElement */ ckeditorLib.CKEDITORNs.domNs.element, 
      /* selection */ ckeditorLib.CKEDITORNs.domNs.selection, 
      /* path */ ckeditorLib.CKEDITORNs.domNs.elementPath, 
      _
    ]
  ): scala.Unit = js.native
  def findItemByCommandName(commandName: java.lang.String): ckeditorLib.Anon_Item = js.native
  def hide(): scala.Unit = js.native
  def hide(returnFocus: scala.Boolean): scala.Unit = js.native
  def removeAll(): scala.Unit = js.native
  def show(offsetParent: ckeditorLib.CKEDITORNs.domNs.element): scala.Unit = js.native
  def show(offsetParent: ckeditorLib.CKEDITORNs.domNs.element, corner: scala.Double): scala.Unit = js.native
  def show(offsetParent: ckeditorLib.CKEDITORNs.domNs.element, corner: scala.Double, offsetX: scala.Double): scala.Unit = js.native
  def show(
    offsetParent: ckeditorLib.CKEDITORNs.domNs.element,
    corner: scala.Double,
    offsetX: scala.Double,
    offsetY: scala.Double
  ): scala.Unit = js.native
}

