package typings.baidumapWebSdk.BMap

import typings.baidumapWebSdk.AnonPixel
import typings.baidumapWebSdk.AnonTarget
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
  def onclick(event: AnonTarget): Unit = js.native
  def ondblclick(event: AnonPixel): Unit = js.native
  def ondragend(event: AnonPixel): Unit = js.native
  def ondragging(event: AnonPixel): Unit = js.native
  def ondragstart(event: AnonTarget): Unit = js.native
  def oninfowindowclose(event: AnonTarget): Unit = js.native
  def oninfowindowopen(event: AnonTarget): Unit = js.native
  def onmousedown(event: AnonPixel): Unit = js.native
  def onmouseout(event: AnonPixel): Unit = js.native
  def onmouseover(event: AnonPixel): Unit = js.native
  def onmouseup(event: AnonPixel): Unit = js.native
  def onremove(event: AnonTarget): Unit = js.native
  def onrightclick(event: AnonTarget): Unit = js.native
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

