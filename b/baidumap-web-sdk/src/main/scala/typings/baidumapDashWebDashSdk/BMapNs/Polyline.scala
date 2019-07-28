package typings.baidumapDashWebDashSdk.BMapNs

import typings.baidumapDashWebDashSdk.Anon_Pixel
import typings.baidumapDashWebDashSdk.Anon_Target
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("BMap.Polyline")
@js.native
class Polyline protected () extends Overlay {
  def this(points: js.Array[Point]) = this()
  def this(points: js.Array[Point], opts: PolylineOptions) = this()
  def addEventListener(event: String, handler: Callback): Unit = js.native
  def disableEditing(): Unit = js.native
  def disableMassClear(): Unit = js.native
  def enableEditing(): Unit = js.native
  def enableMassClear(): Unit = js.native
  def getBounds(): Bounds = js.native
  def getFillColor(): String = js.native
  def getFillOpacity(): Double = js.native
  def getMap(): Map = js.native
  def getPath(): js.Array[Point] = js.native
  def getStrokeColor(): String = js.native
  def getStrokeOpacity(): Double = js.native
  def getStrokeStyle(): String = js.native
  def getStrokeWeight(): Double = js.native
  def onclick(event: Anon_Target): Unit = js.native
  def ondblclick(event: Anon_Pixel): Unit = js.native
  def onlineupdate(event: Anon_Target): Unit = js.native
  def onmousedown(event: Anon_Pixel): Unit = js.native
  def onmouseout(event: Anon_Pixel): Unit = js.native
  def onmouseover(event: Anon_Pixel): Unit = js.native
  def onmouseup(event: Anon_Pixel): Unit = js.native
  def onremove(event: Anon_Target): Unit = js.native
  def removeEventListener(event: String, handler: Callback): Unit = js.native
  def setFillColor(color: String): Unit = js.native
  def setFillOpacity(opacity: Double): Unit = js.native
  def setPath(path: js.Array[Point]): Unit = js.native
  def setPointAt(index: Double, point: Point): Unit = js.native
  def setPositionAt(index: Double, point: Point): Unit = js.native
  def setStrokeColor(color: String): Unit = js.native
  def setStrokeOpacity(opacity: Double): Unit = js.native
  def setStrokeStyle(style: String): Unit = js.native
  def setStrokeWeight(weight: Double): Unit = js.native
}

