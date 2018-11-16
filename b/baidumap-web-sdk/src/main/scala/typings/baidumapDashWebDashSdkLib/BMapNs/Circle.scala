package typings
package baidumapDashWebDashSdkLib.BMapNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("BMap.Circle")
@js.native
class Circle protected () extends Overlay {
  def this(center: Point, radius: scala.Double) = this()
  def this(center: Point, radius: scala.Double, opts: CircleOptions) = this()
  def addEventListener(event: java.lang.String, handler: js.Function): scala.Unit = js.native
  def disableEditing(): scala.Unit = js.native
  def disableMassClear(): scala.Unit = js.native
  def enableEditing(): scala.Unit = js.native
  def enableMassClear(): scala.Unit = js.native
  def getBounds(): Bounds = js.native
  def getCenter(): Point = js.native
  def getFillColor(): java.lang.String = js.native
  def getFillOpacity(): scala.Double = js.native
  def getMap(): Map = js.native
  def getRadius(): scala.Double = js.native
  def getStrokeColor(): java.lang.String = js.native
  def getStrokeOpacity(): scala.Double = js.native
  def getStrokeStyle(): java.lang.String = js.native
  def getStrokeWeight(): scala.Double = js.native
  def onclick(event: baidumapDashWebDashSdkLib.Anon_TypeTarget): scala.Unit = js.native
  def ondblclick(event: baidumapDashWebDashSdkLib.Anon_TypeTargetPixel): scala.Unit = js.native
  def onlineupdate(event: baidumapDashWebDashSdkLib.Anon_TypeTarget): scala.Unit = js.native
  def onmousedown(event: baidumapDashWebDashSdkLib.Anon_TypeTargetPixel): scala.Unit = js.native
  def onmouseout(event: baidumapDashWebDashSdkLib.Anon_TypeTargetPixel): scala.Unit = js.native
  def onmouseover(event: baidumapDashWebDashSdkLib.Anon_TypeTargetPixel): scala.Unit = js.native
  def onmouseup(event: baidumapDashWebDashSdkLib.Anon_TypeTargetPixel): scala.Unit = js.native
  def onremove(event: baidumapDashWebDashSdkLib.Anon_TypeTarget): scala.Unit = js.native
  def removeEventListener(event: java.lang.String, handler: js.Function): scala.Unit = js.native
  def setCenter(center: Point): scala.Unit = js.native
  def setFillColor(color: java.lang.String): scala.Unit = js.native
  def setFillOpacity(opacity: scala.Double): scala.Unit = js.native
  def setRadius(radius: scala.Double): scala.Unit = js.native
  def setStrokeColor(color: java.lang.String): scala.Unit = js.native
  def setStrokeOpacity(opacity: scala.Double): scala.Unit = js.native
  def setStrokeStyle(style: java.lang.String): scala.Unit = js.native
  def setStrokeWeight(weight: scala.Double): scala.Unit = js.native
}

