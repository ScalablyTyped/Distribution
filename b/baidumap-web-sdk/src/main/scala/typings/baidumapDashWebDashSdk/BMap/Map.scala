package typings.baidumapDashWebDashSdk.BMap

import typings.baidumapDashWebDashSdk.Anon_Overlay
import typings.baidumapDashWebDashSdk.Anon_Pixel
import typings.baidumapDashWebDashSdk.Anon_PixelPoint
import typings.baidumapDashWebDashSdk.Anon_Size
import typings.baidumapDashWebDashSdk.Anon_Spots
import typings.baidumapDashWebDashSdk.Anon_Target
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("BMap.Map")
@js.native
class Map protected () extends js.Object {
  def this(container: String) = this()
  def this(container: HTMLElement) = this()
  def this(container: String, opts: MapOptions) = this()
  def this(container: HTMLElement, opts: MapOptions) = this()
  def addContextMenu(menu: ContextMenu): Unit = js.native
  def addControl(control: Control): Unit = js.native
  def addHotspot(hotspot: Hotspot): Unit = js.native
  def addOverlay(overlay: Overlay): Unit = js.native
  def addTileLayer(tileLayer: TileLayer): Unit = js.native
  def centerAndZoom(center: Point, zoom: Double): Unit = js.native
  def centerAndZoom(city: String): Unit = js.native
  def clearHotspots(): Unit = js.native
  def clearOverlays(): Unit = js.native
  def closeInfoWindow(): Unit = js.native
  def disable3DBuilding(): Unit = js.native
  def disableAutoResize(): Unit = js.native
  def disableContinuousZoom(): Unit = js.native
  def disableDoubleClickZoom(): Unit = js.native
  def disableDragging(): Unit = js.native
  def disableInertialDragging(): Unit = js.native
  def disableKeyboard(): Unit = js.native
  def disablePinchToZoom(): Unit = js.native
  def disableScrollWheelZoom(): Unit = js.native
  def enableAutoResize(): Unit = js.native
  def enableContinuousZoom(): Unit = js.native
  def enableDoubleClickZoom(): Unit = js.native
  def enableDragging(): Unit = js.native
  def enableInertialDragging(): Unit = js.native
  def enableKeyboard(): Unit = js.native
  def enablePinchToZoom(): Unit = js.native
  def enableScrollWheelZoom(): Unit = js.native
  def getBounds(): Bounds = js.native
  def getCenter(): Point = js.native
  def getContainer(): HTMLElement = js.native
  def getDefaultCursor(): String = js.native
  def getDistance(start: Point, end: Point): Double = js.native
  def getDraggingCursor(): String = js.native
  def getInfoWindow(): InfoWindow = js.native
  def getMapType(): MapType = js.native
  def getOverlays(): js.Array[Overlay] = js.native
  def getPanes(): MapPanes = js.native
  def getPanorama(): Panorama = js.native
  def getSize(): Size = js.native
  def getTileLayer(mapType: String): TileLayer = js.native
  def getViewport(view: js.Array[Point]): Viewport = js.native
  def getViewport(view: js.Array[Point], viewportOptions: ViewportOptions): Viewport = js.native
  def getZoom(): Double = js.native
  def highResolutionEnabled(): Boolean = js.native
  def onaddcontrol(event: Anon_Target): Unit = js.native
  def onaddoverlay(event: Anon_Target): Unit = js.native
  def onaddtilelayer(event: Anon_Target): Unit = js.native
  def onclearoverlays(event: Anon_Target): Unit = js.native
  def onclick(event: Anon_Overlay): Unit = js.native
  def ondblclick(event: Anon_Pixel): Unit = js.native
  def ondragend(event: Anon_Pixel): Unit = js.native
  def ondragging(event: Anon_Pixel): Unit = js.native
  def ondragstart(event: Anon_Pixel): Unit = js.native
  def onhotspotclick(event: Anon_Spots): Unit = js.native
  def onhotspotout(event: Anon_Spots): Unit = js.native
  def onhotspotover(event: Anon_Spots): Unit = js.native
  def onload(event: Anon_PixelPoint): Unit = js.native
  def onlongpress(event: Anon_Pixel): Unit = js.native
  def onmaptypechange(event: Anon_Target): Unit = js.native
  def onmousemove(event: Anon_Overlay): Unit = js.native
  def onmouseout(event: Anon_Target): Unit = js.native
  def onmouseover(event: Anon_Target): Unit = js.native
  def onmoveend(event: Anon_Target): Unit = js.native
  def onmovestart(event: Anon_Target): Unit = js.native
  def onmoving(event: Anon_Target): Unit = js.native
  def onremovecontrol(event: Anon_Target): Unit = js.native
  def onremoveoverlay(event: Anon_Target): Unit = js.native
  def onremovetilelayer(event: Anon_Target): Unit = js.native
  def onresize(event: Anon_Size): Unit = js.native
  def onrightclick(event: Anon_Overlay): Unit = js.native
  def onrightdblclick(event: Anon_Overlay): Unit = js.native
  def ontilesloaded(event: Anon_Target): Unit = js.native
  def ontouchend(event: Anon_Pixel): Unit = js.native
  def ontouchmove(event: Anon_Pixel): Unit = js.native
  def ontouchstart(event: Anon_Pixel): Unit = js.native
  def onzoomend(event: Anon_Target): Unit = js.native
  def onzoomstart(event: Anon_Target): Unit = js.native
  def openInfoWindow(infoWnd: InfoWindow, point: Point): Unit = js.native
  def overlayPixelToPoint(pixel: Pixel): Point = js.native
  def panBy(x: Double, y: Double): Unit = js.native
  def panBy(x: Double, y: Double, opts: PanOptions): Unit = js.native
  def panTo(center: Point): Unit = js.native
  def panTo(center: Point, opts: PanOptions): Unit = js.native
  def pixelToPoint(pixel: Pixel): Point = js.native
  def pointToOverlayPixel(point: Point): Pixel = js.native
  def pointToPixel(point: Point): Pixel = js.native
  def removeContextMenu(menu: ContextMenu): Unit = js.native
  def removeControl(control: Control): Unit = js.native
  def removeHotspot(hotspot: Hotspot): Unit = js.native
  def removeOverlay(overlay: Overlay): Unit = js.native
  def removeTileLayer(tilelayer: TileLayer): Unit = js.native
  def reset(): Unit = js.native
  def setCenter(center: String): Unit = js.native
  def setCenter(center: Point): Unit = js.native
  def setCurrentCity(city: String): Unit = js.native
  def setDefaultCursor(cursor: String): Unit = js.native
  def setDraggingCursor(cursor: String): Unit = js.native
  def setMapStyle(mapStyle: MapStyle): Unit = js.native
  def setMapType(mapType: MapType): Unit = js.native
  def setMaxZoom(zoom: Double): Unit = js.native
  def setMinZoom(zoom: Double): Unit = js.native
  def setPanorama(pano: Panorama): Unit = js.native
  def setViewport(view: js.Array[Point]): Unit = js.native
  def setViewport(view: js.Array[Point], viewportOptions: ViewportOptions): Unit = js.native
  def setZoom(zoom: Double): Unit = js.native
  def zoomIn(): Unit = js.native
  def zoomOut(): Unit = js.native
}

