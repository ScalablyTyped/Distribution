package typings.baidumapWebSdk.BMap

import typings.baidumapWebSdk.AnonOverlay
import typings.baidumapWebSdk.AnonPixel
import typings.baidumapWebSdk.AnonPoint
import typings.baidumapWebSdk.AnonSize
import typings.baidumapWebSdk.AnonSpots
import typings.baidumapWebSdk.AnonTarget
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
  def addEventListener(event: String, handler: Callback): Unit = js.native
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
  def onaddcontrol(event: AnonTarget): Unit = js.native
  def onaddoverlay(event: AnonTarget): Unit = js.native
  def onaddtilelayer(event: AnonTarget): Unit = js.native
  def onclearoverlays(event: AnonTarget): Unit = js.native
  def onclick(event: AnonOverlay): Unit = js.native
  def ondblclick(event: AnonPixel): Unit = js.native
  def ondragend(event: AnonPixel): Unit = js.native
  def ondragging(event: AnonPixel): Unit = js.native
  def ondragstart(event: AnonPixel): Unit = js.native
  def onhotspotclick(event: AnonSpots): Unit = js.native
  def onhotspotout(event: AnonSpots): Unit = js.native
  def onhotspotover(event: AnonSpots): Unit = js.native
  def onload(event: AnonPoint): Unit = js.native
  def onlongpress(event: AnonPixel): Unit = js.native
  def onmaptypechange(event: AnonTarget): Unit = js.native
  def onmousemove(event: AnonOverlay): Unit = js.native
  def onmouseout(event: AnonTarget): Unit = js.native
  def onmouseover(event: AnonTarget): Unit = js.native
  def onmoveend(event: AnonTarget): Unit = js.native
  def onmovestart(event: AnonTarget): Unit = js.native
  def onmoving(event: AnonTarget): Unit = js.native
  def onremovecontrol(event: AnonTarget): Unit = js.native
  def onremoveoverlay(event: AnonTarget): Unit = js.native
  def onremovetilelayer(event: AnonTarget): Unit = js.native
  def onresize(event: AnonSize): Unit = js.native
  def onrightclick(event: AnonOverlay): Unit = js.native
  def onrightdblclick(event: AnonOverlay): Unit = js.native
  def ontilesloaded(event: AnonTarget): Unit = js.native
  def ontouchend(event: AnonPixel): Unit = js.native
  def ontouchmove(event: AnonPixel): Unit = js.native
  def ontouchstart(event: AnonPixel): Unit = js.native
  def onzoomend(event: AnonTarget): Unit = js.native
  def onzoomstart(event: AnonTarget): Unit = js.native
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
  def removeEventListener(event: String, handler: Callback): Unit = js.native
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
  def setMapStyle2(style: MapStyleV2): Unit = js.native
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

