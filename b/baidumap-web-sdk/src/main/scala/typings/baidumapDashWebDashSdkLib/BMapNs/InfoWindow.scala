package typings
package baidumapDashWebDashSdkLib.BMapNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("BMap.InfoWindow")
@js.native
class InfoWindow protected () extends Overlay {
  def this(content: java.lang.String) = this()
  def this(content: stdLib.HTMLElement) = this()
  def this(content: java.lang.String, opts: InfoWindowOptions) = this()
  def this(content: stdLib.HTMLElement, opts: InfoWindowOptions) = this()
  def addEventListener(event: java.lang.String, handler: js.Function): scala.Unit = js.native
  def disableAutoPan(): scala.Unit = js.native
  def disableCloseOnClick(): scala.Unit = js.native
  def disableMaximize(): scala.Unit = js.native
  def enableAutoPan(): scala.Unit = js.native
  def enableCloseOnClick(): scala.Unit = js.native
  def enableMaximize(): scala.Unit = js.native
  def getContent(): java.lang.String | stdLib.HTMLElement = js.native
  def getPosition(): Point = js.native
  def getTitle(): java.lang.String | stdLib.HTMLElement = js.native
  def isOpen(): scala.Boolean = js.native
  def maximize(): scala.Unit = js.native
  def onclickclose(event: baidumapDashWebDashSdkLib.Anon_TypeTarget): scala.Unit = js.native
  def onclose(event: baidumapDashWebDashSdkLib.Anon_Type): scala.Unit = js.native
  def onmaximize(event: baidumapDashWebDashSdkLib.Anon_TypeTarget): scala.Unit = js.native
  def onopen(event: baidumapDashWebDashSdkLib.Anon_Type): scala.Unit = js.native
  def onrestore(event: baidumapDashWebDashSdkLib.Anon_TypeTarget): scala.Unit = js.native
  def redraw(): scala.Unit = js.native
  def removeEventListener(event: java.lang.String, handler: js.Function): scala.Unit = js.native
  def restore(): scala.Unit = js.native
  def setContent(content: java.lang.String): scala.Unit = js.native
  def setContent(content: stdLib.HTMLElement): scala.Unit = js.native
  def setHeight(height: scala.Double): scala.Unit = js.native
  def setMaxContent(content: java.lang.String): scala.Unit = js.native
  def setTitle(title: java.lang.String): scala.Unit = js.native
  def setTitle(title: stdLib.HTMLElement): scala.Unit = js.native
  def setWidth(width: scala.Double): scala.Unit = js.native
}

