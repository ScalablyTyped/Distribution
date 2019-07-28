package typings.baidumapDashWebDashSdk.BMapNs

import typings.baidumapDashWebDashSdk.Anon_Pixel
import typings.baidumapDashWebDashSdk.Anon_Target
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("BMap.Marker")
@js.native
class Marker protected () extends Overlay {
  def this(point: Point) = this()
  def this(point: Point, opts: MarkerOptions) = this()
  def addContextMenu(menu: ContextMenu): Unit = js.native
  def addEventListener(event: String, handler: Callback): Unit = js.native
  def closeInfoWindow(): Unit = js.native
  def disableDragging(): Unit = js.native
  def disableMassClear(): Unit = js.native
  def enableDragging(): Unit = js.native
  def enableMassClear(): Unit = js.native
  def getIcon(): Icon = js.native
  def getLabel(): Label = js.native
  def getMap(): Map = js.native
  def getOffset(): Size = js.native
  def getPosition(): Point = js.native
  def getRotation(): Double = js.native
  def getShadow(): Unit = js.native
  def getTitle(): String = js.native
  def onclick(event: Anon_Target): Unit = js.native
  def ondblclick(event: Anon_Pixel): Unit = js.native
  def ondragend(event: Anon_Pixel): Unit = js.native
  def ondragging(event: Anon_Pixel): Unit = js.native
  def ondragstart(event: Anon_Target): Unit = js.native
  def oninfowindowclose(event: Anon_Target): Unit = js.native
  def oninfowindowopen(event: Anon_Target): Unit = js.native
  def onmousedown(event: Anon_Pixel): Unit = js.native
  def onmouseout(event: Anon_Pixel): Unit = js.native
  def onmouseover(event: Anon_Pixel): Unit = js.native
  def onmouseup(event: Anon_Pixel): Unit = js.native
  def onremove(event: Anon_Target): Unit = js.native
  def onrightclick(event: Anon_Target): Unit = js.native
  def openInfoWindow(infoWnd: InfoWindow): Unit = js.native
  def removeContextMenu(menu: ContextMenu): Unit = js.native
  def removeEventListener(event: String, handler: Callback): Unit = js.native
  def setAnimation(): Unit = js.native
  def setAnimation(animation: Animation): Unit = js.native
  def setIcon(icon: Icon): Unit = js.native
  def setLabel(label: Label): Unit = js.native
  def setOffset(offset: Size): Unit = js.native
  def setPosition(position: Point): Unit = js.native
  def setRotation(rotation: Double): Unit = js.native
  def setShadow(shadow: Icon): Unit = js.native
  def setTitle(title: String): Unit = js.native
  def setTop(isTop: Boolean): Unit = js.native
  def setZIndex(zIndex: Double): Unit = js.native
}

