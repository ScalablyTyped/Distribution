package typings.baidumapWebSdk.BMap

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("BMap.Panorama")
@js.native
class Panorama protected () extends js.Object {
  def this(container: String) = this()
  def this(container: HTMLElement) = this()
  def this(container: String, opts: PanoramaOptions) = this()
  def this(container: HTMLElement, opts: PanoramaOptions) = this()
  def addOverlay(overlay: PanoramaLabel): Unit = js.native
  def disableScrollWheelZoom(): Unit = js.native
  def enableScrollWheelZoom(): Unit = js.native
  def getId(): String = js.native
  def getLinks(): js.Array[PanoramaLink] = js.native
  def getPosition(): Point = js.native
  def getPov(): PanoramaPov = js.native
  def getSceneType(): PanoramaSceneType = js.native
  def getZoom(): Double = js.native
  def hide(): Unit = js.native
  def onlinks_changed(): Unit = js.native
  def onposition_changed(): Unit = js.native
  def onpov_changed(): Unit = js.native
  def onscene_type_changed(): Unit = js.native
  def onzoom_changed(): Unit = js.native
  def removeOverlay(overlay: PanoramaLabel): Unit = js.native
  def setId(id: String): Unit = js.native
  def setOptions(): Unit = js.native
  def setOptions(opts: PanoramaOptions): Unit = js.native
  def setPanoramaPOIType(): PanoramaPOIType = js.native
  def setPosition(position: Point): Unit = js.native
  def setPov(pov: PanoramaPov): Unit = js.native
  def setZoom(zoom: Double): Unit = js.native
  def show(): Unit = js.native
}

