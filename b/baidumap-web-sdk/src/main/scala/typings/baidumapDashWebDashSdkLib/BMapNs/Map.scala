package typings
package baidumapDashWebDashSdkLib.BMapNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("BMap.Map")
@js.native
class Map protected () extends js.Object {
  def this(container: java.lang.String) = this()
  def this(container: stdLib.HTMLElement) = this()
  def this(container: java.lang.String, opts: MapOptions) = this()
  def this(container: stdLib.HTMLElement, opts: MapOptions) = this()
  def addContextMenu(menu: ContextMenu): scala.Unit = js.native
  def addControl(control: Control): scala.Unit = js.native
  def addHotspot(hotspot: Hotspot): scala.Unit = js.native
  def addOverlay(overlay: Overlay): scala.Unit = js.native
  def addTileLayer(tileLayer: TileLayer): scala.Unit = js.native
  def centerAndZoom(center: Point, zoom: scala.Double): scala.Unit = js.native
  def centerAndZoom(city: java.lang.String): scala.Unit = js.native
  def clearHotspots(): scala.Unit = js.native
  def clearOverlays(): scala.Unit = js.native
  def closeInfoWindow(): scala.Unit = js.native
  def disable3DBuilding(): scala.Unit = js.native
  def disableAutoResize(): scala.Unit = js.native
  def disableContinuousZoom(): scala.Unit = js.native
  def disableDoubleClickZoom(): scala.Unit = js.native
  def disableDragging(): scala.Unit = js.native
  def disableInertialDragging(): scala.Unit = js.native
  def disableKeyboard(): scala.Unit = js.native
  def disablePinchToZoom(): scala.Unit = js.native
  def disableScrollWheelZoom(): scala.Unit = js.native
  def enableAutoResize(): scala.Unit = js.native
  def enableContinuousZoom(): scala.Unit = js.native
  def enableDoubleClickZoom(): scala.Unit = js.native
  def enableDragging(): scala.Unit = js.native
  def enableInertialDragging(): scala.Unit = js.native
  def enableKeyboard(): scala.Unit = js.native
  def enablePinchToZoom(): scala.Unit = js.native
  def enableScrollWheelZoom(): scala.Unit = js.native
  def getBounds(): Bounds = js.native
  def getCenter(): Point = js.native
  def getContainer(): stdLib.HTMLElement = js.native
  def getDefaultCursor(): java.lang.String = js.native
  def getDistance(start: Point, end: Point): scala.Double = js.native
  def getDraggingCursor(): java.lang.String = js.native
  def getInfoWindow(): InfoWindow = js.native
  def getMapType(): MapType = js.native
  def getOverlays(): js.Array[Overlay] = js.native
  def getPanes(): MapPanes = js.native
  def getPanorama(): Panorama = js.native
  def getSize(): Size = js.native
  def getTileLayer(mapType: java.lang.String): TileLayer = js.native
  def getViewport(view: js.Array[Point]): Viewport = js.native
  def getViewport(view: js.Array[Point], viewportOptions: ViewportOptions): Viewport = js.native
  def getZoom(): scala.Double = js.native
  def highResolutionEnabled(): scala.Boolean = js.native
  def onaddcontrol(event: baidumapDashWebDashSdkLib.Anon_Target): scala.Unit = js.native
  def onaddoverlay(event: baidumapDashWebDashSdkLib.Anon_Target): scala.Unit = js.native
  def onaddtilelayer(event: baidumapDashWebDashSdkLib.Anon_Target): scala.Unit = js.native
  def onclearoverlays(event: baidumapDashWebDashSdkLib.Anon_Target): scala.Unit = js.native
  def onclick(event: baidumapDashWebDashSdkLib.Anon_Overlay): scala.Unit = js.native
  def ondblclick(event: baidumapDashWebDashSdkLib.Anon_Pixel): scala.Unit = js.native
  def ondragend(event: baidumapDashWebDashSdkLib.Anon_Pixel): scala.Unit = js.native
  def ondragging(event: baidumapDashWebDashSdkLib.Anon_Pixel): scala.Unit = js.native
  def ondragstart(event: baidumapDashWebDashSdkLib.Anon_Pixel): scala.Unit = js.native
  def onhotspotclick(event: baidumapDashWebDashSdkLib.Anon_Spots): scala.Unit = js.native
  def onhotspotout(event: baidumapDashWebDashSdkLib.Anon_Spots): scala.Unit = js.native
  def onhotspotover(event: baidumapDashWebDashSdkLib.Anon_Spots): scala.Unit = js.native
  def onload(event: baidumapDashWebDashSdkLib.Anon_PixelPoint): scala.Unit = js.native
  def onlongpress(event: baidumapDashWebDashSdkLib.Anon_Pixel): scala.Unit = js.native
  def onmaptypechange(event: baidumapDashWebDashSdkLib.Anon_Target): scala.Unit = js.native
  def onmousemove(event: baidumapDashWebDashSdkLib.Anon_Overlay): scala.Unit = js.native
  def onmouseout(event: baidumapDashWebDashSdkLib.Anon_Target): scala.Unit = js.native
  def onmouseover(event: baidumapDashWebDashSdkLib.Anon_Target): scala.Unit = js.native
  def onmoveend(event: baidumapDashWebDashSdkLib.Anon_Target): scala.Unit = js.native
  def onmovestart(event: baidumapDashWebDashSdkLib.Anon_Target): scala.Unit = js.native
  def onmoving(event: baidumapDashWebDashSdkLib.Anon_Target): scala.Unit = js.native
  def onremovecontrol(event: baidumapDashWebDashSdkLib.Anon_Target): scala.Unit = js.native
  def onremoveoverlay(event: baidumapDashWebDashSdkLib.Anon_Target): scala.Unit = js.native
  def onremovetilelayer(event: baidumapDashWebDashSdkLib.Anon_Target): scala.Unit = js.native
  def onresize(event: baidumapDashWebDashSdkLib.Anon_Size): scala.Unit = js.native
  def onrightclick(event: baidumapDashWebDashSdkLib.Anon_Overlay): scala.Unit = js.native
  def onrightdblclick(event: baidumapDashWebDashSdkLib.Anon_Overlay): scala.Unit = js.native
  def ontilesloaded(event: baidumapDashWebDashSdkLib.Anon_Target): scala.Unit = js.native
  def ontouchend(event: baidumapDashWebDashSdkLib.Anon_Pixel): scala.Unit = js.native
  def ontouchmove(event: baidumapDashWebDashSdkLib.Anon_Pixel): scala.Unit = js.native
  def ontouchstart(event: baidumapDashWebDashSdkLib.Anon_Pixel): scala.Unit = js.native
  def onzoomend(event: baidumapDashWebDashSdkLib.Anon_Target): scala.Unit = js.native
  def onzoomstart(event: baidumapDashWebDashSdkLib.Anon_Target): scala.Unit = js.native
  def openInfoWindow(infoWnd: InfoWindow, point: Point): scala.Unit = js.native
  def overlayPixelToPoint(pixel: Pixel): Point = js.native
  def panBy(x: scala.Double, y: scala.Double): scala.Unit = js.native
  def panBy(x: scala.Double, y: scala.Double, opts: PanOptions): scala.Unit = js.native
  def panTo(center: Point): scala.Unit = js.native
  def panTo(center: Point, opts: PanOptions): scala.Unit = js.native
  def pixelToPoint(pixel: Pixel): Point = js.native
  def pointToOverlayPixel(point: Point): Pixel = js.native
  def pointToPixel(point: Point): Pixel = js.native
  def removeContextMenu(menu: ContextMenu): scala.Unit = js.native
  def removeControl(control: Control): scala.Unit = js.native
  def removeHotspot(hotspot: Hotspot): scala.Unit = js.native
  def removeOverlay(overlay: Overlay): scala.Unit = js.native
  def removeTileLayer(tilelayer: TileLayer): scala.Unit = js.native
  def reset(): scala.Unit = js.native
  def setCenter(center: Point): scala.Unit = js.native
  def setCenter(center: java.lang.String): scala.Unit = js.native
  def setCurrentCity(city: java.lang.String): scala.Unit = js.native
  def setDefaultCursor(cursor: java.lang.String): scala.Unit = js.native
  def setDraggingCursor(cursor: java.lang.String): scala.Unit = js.native
  def setMapStyle(mapStyle: MapStyle): scala.Unit = js.native
  def setMapType(mapType: MapType): scala.Unit = js.native
  def setMaxZoom(zoom: scala.Double): scala.Unit = js.native
  def setMinZoom(zoom: scala.Double): scala.Unit = js.native
  def setPanorama(pano: Panorama): scala.Unit = js.native
  def setViewport(view: js.Array[Point]): scala.Unit = js.native
  def setViewport(view: js.Array[Point], viewportOptions: ViewportOptions): scala.Unit = js.native
  def setZoom(zoom: scala.Double): scala.Unit = js.native
  def zoomIn(): scala.Unit = js.native
  def zoomOut(): scala.Unit = js.native
}

