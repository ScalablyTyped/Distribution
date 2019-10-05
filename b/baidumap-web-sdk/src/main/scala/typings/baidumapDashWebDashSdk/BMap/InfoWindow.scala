package typings.baidumapDashWebDashSdk.BMap

import typings.baidumapDashWebDashSdk.Anon_Point
import typings.baidumapDashWebDashSdk.Anon_Target
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("BMap.InfoWindow")
@js.native
class InfoWindow protected () extends Overlay {
  def this(content: String) = this()
  def this(content: HTMLElement) = this()
  def this(content: String, opts: InfoWindowOptions) = this()
  def this(content: HTMLElement, opts: InfoWindowOptions) = this()
  def addEventListener(event: String, handler: Callback): Unit = js.native
  def disableAutoPan(): Unit = js.native
  def disableCloseOnClick(): Unit = js.native
  def disableMaximize(): Unit = js.native
  def enableAutoPan(): Unit = js.native
  def enableCloseOnClick(): Unit = js.native
  def enableMaximize(): Unit = js.native
  def getContent(): String | HTMLElement = js.native
  def getPosition(): Point = js.native
  def getTitle(): String | HTMLElement = js.native
  def isOpen(): Boolean = js.native
  def maximize(): Unit = js.native
  def onclickclose(event: Anon_Target): Unit = js.native
  def onclose(event: Anon_Point): Unit = js.native
  def onmaximize(event: Anon_Target): Unit = js.native
  def onopen(event: Anon_Point): Unit = js.native
  def onrestore(event: Anon_Target): Unit = js.native
  def redraw(): Unit = js.native
  def removeEventListener(event: String, handler: Callback): Unit = js.native
  def restore(): Unit = js.native
  def setContent(content: String): Unit = js.native
  def setContent(content: HTMLElement): Unit = js.native
  def setHeight(height: Double): Unit = js.native
  def setMaxContent(content: String): Unit = js.native
  def setTitle(title: String): Unit = js.native
  def setTitle(title: HTMLElement): Unit = js.native
  def setWidth(width: Double): Unit = js.native
}

