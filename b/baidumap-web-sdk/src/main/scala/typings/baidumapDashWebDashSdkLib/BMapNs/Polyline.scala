package typings
package baidumapDashWebDashSdkLib.BMapNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("BMap.Polyline")
@js.native
class Polyline protected () extends Overlay {
  def this(points: js.Array[Point]) = this()
  def this(points: js.Array[Point], opts: PolylineOptions) = this()
  def addEventListener(event: java.lang.String, handler: Callback): scala.Unit = js.native
  def disableEditing(): scala.Unit = js.native
  def disableMassClear(): scala.Unit = js.native
  def enableEditing(): scala.Unit = js.native
  def enableMassClear(): scala.Unit = js.native
  def getBounds(): Bounds = js.native
  def getFillColor(): java.lang.String = js.native
  def getFillOpacity(): scala.Double = js.native
  def getMap(): Map = js.native
  def getPath(): js.Array[Point] = js.native
  def getStrokeColor(): java.lang.String = js.native
  def getStrokeOpacity(): scala.Double = js.native
  def getStrokeStyle(): java.lang.String = js.native
  def getStrokeWeight(): scala.Double = js.native
  def onclick(event: baidumapDashWebDashSdkLib.Anon_Target): scala.Unit = js.native
  def ondblclick(event: baidumapDashWebDashSdkLib.Anon_Pixel): scala.Unit = js.native
  def onlineupdate(event: baidumapDashWebDashSdkLib.Anon_Target): scala.Unit = js.native
  def onmousedown(event: baidumapDashWebDashSdkLib.Anon_Pixel): scala.Unit = js.native
  def onmouseout(event: baidumapDashWebDashSdkLib.Anon_Pixel): scala.Unit = js.native
  def onmouseover(event: baidumapDashWebDashSdkLib.Anon_Pixel): scala.Unit = js.native
  def onmouseup(event: baidumapDashWebDashSdkLib.Anon_Pixel): scala.Unit = js.native
  def onremove(event: baidumapDashWebDashSdkLib.Anon_Target): scala.Unit = js.native
  def removeEventListener(event: java.lang.String, handler: Callback): scala.Unit = js.native
  def setFillColor(color: java.lang.String): scala.Unit = js.native
  def setFillOpacity(opacity: scala.Double): scala.Unit = js.native
  def setPath(path: js.Array[Point]): scala.Unit = js.native
  def setPointAt(index: scala.Double, point: Point): scala.Unit = js.native
  def setPositionAt(index: scala.Double, point: Point): scala.Unit = js.native
  def setStrokeColor(color: java.lang.String): scala.Unit = js.native
  def setStrokeOpacity(opacity: scala.Double): scala.Unit = js.native
  def setStrokeStyle(style: java.lang.String): scala.Unit = js.native
  def setStrokeWeight(weight: scala.Double): scala.Unit = js.native
}

