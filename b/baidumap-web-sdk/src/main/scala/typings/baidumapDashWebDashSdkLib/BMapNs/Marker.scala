package typings
package baidumapDashWebDashSdkLib.BMapNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("BMap.Marker")
@js.native
class Marker protected () extends Overlay {
  def this(point: Point) = this()
  def this(point: Point, opts: MarkerOptions) = this()
  def addContextMenu(menu: ContextMenu): scala.Unit = js.native
  def addEventListener(event: java.lang.String, handler: Callback): scala.Unit = js.native
  def closeInfoWindow(): scala.Unit = js.native
  def disableDragging(): scala.Unit = js.native
  def disableMassClear(): scala.Unit = js.native
  def enableDragging(): scala.Unit = js.native
  def enableMassClear(): scala.Unit = js.native
  def getIcon(): Icon = js.native
  def getLabel(): Label = js.native
  def getMap(): Map = js.native
  def getOffset(): Size = js.native
  def getPosition(): Point = js.native
  def getRotation(): scala.Double = js.native
  def getShadow(): scala.Unit = js.native
  def getTitle(): java.lang.String = js.native
  def onclick(event: baidumapDashWebDashSdkLib.Anon_Target): scala.Unit = js.native
  def ondblclick(event: baidumapDashWebDashSdkLib.Anon_Pixel): scala.Unit = js.native
  def ondragend(event: baidumapDashWebDashSdkLib.Anon_Pixel): scala.Unit = js.native
  def ondragging(event: baidumapDashWebDashSdkLib.Anon_Pixel): scala.Unit = js.native
  def ondragstart(event: baidumapDashWebDashSdkLib.Anon_Target): scala.Unit = js.native
  def oninfowindowclose(event: baidumapDashWebDashSdkLib.Anon_Target): scala.Unit = js.native
  def oninfowindowopen(event: baidumapDashWebDashSdkLib.Anon_Target): scala.Unit = js.native
  def onmousedown(event: baidumapDashWebDashSdkLib.Anon_Pixel): scala.Unit = js.native
  def onmouseout(event: baidumapDashWebDashSdkLib.Anon_Pixel): scala.Unit = js.native
  def onmouseover(event: baidumapDashWebDashSdkLib.Anon_Pixel): scala.Unit = js.native
  def onmouseup(event: baidumapDashWebDashSdkLib.Anon_Pixel): scala.Unit = js.native
  def onremove(event: baidumapDashWebDashSdkLib.Anon_Target): scala.Unit = js.native
  def onrightclick(event: baidumapDashWebDashSdkLib.Anon_Target): scala.Unit = js.native
  def openInfoWindow(infoWnd: InfoWindow): scala.Unit = js.native
  def removeContextMenu(menu: ContextMenu): scala.Unit = js.native
  def removeEventListener(event: java.lang.String, handler: Callback): scala.Unit = js.native
  def setAnimation(): scala.Unit = js.native
  def setAnimation(animation: Animation): scala.Unit = js.native
  def setIcon(icon: Icon): scala.Unit = js.native
  def setLabel(label: Label): scala.Unit = js.native
  def setOffset(offset: Size): scala.Unit = js.native
  def setPosition(position: Point): scala.Unit = js.native
  def setRotation(rotation: scala.Double): scala.Unit = js.native
  def setShadow(shadow: Icon): scala.Unit = js.native
  def setTitle(title: java.lang.String): scala.Unit = js.native
  def setTop(isTop: scala.Boolean): scala.Unit = js.native
  def setZIndex(zIndex: scala.Double): scala.Unit = js.native
}

