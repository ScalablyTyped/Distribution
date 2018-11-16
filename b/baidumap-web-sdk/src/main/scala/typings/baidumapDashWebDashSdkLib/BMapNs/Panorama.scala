package typings
package baidumapDashWebDashSdkLib.BMapNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("BMap.Panorama")
@js.native
class Panorama protected () extends js.Object {
  def this(container: java.lang.String) = this()
  def this(container: stdLib.HTMLElement) = this()
  def this(container: java.lang.String, opts: PanoramaOptions) = this()
  def this(container: stdLib.HTMLElement, opts: PanoramaOptions) = this()
  def addOverlay(overlay: PanoramaLabel): scala.Unit = js.native
  def disableScrollWheelZoom(): scala.Unit = js.native
  def enableScrollWheelZoom(): scala.Unit = js.native
  def getId(): java.lang.String = js.native
  def getLinks(): js.Array[PanoramaLink] = js.native
  def getPosition(): Point = js.native
  def getPov(): PanoramaPov = js.native
  def getSceneType(): PanoramaSceneType = js.native
  def getZoom(): scala.Double = js.native
  def hide(): scala.Unit = js.native
  def onlinks_changed(): scala.Unit = js.native
  def onposition_changed(): scala.Unit = js.native
  def onpov_changed(): scala.Unit = js.native
  def onscene_type_changed(): scala.Unit = js.native
  def onzoom_changed(): scala.Unit = js.native
  def removeOverlay(overlay: PanoramaLabel): scala.Unit = js.native
  def setId(id: java.lang.String): scala.Unit = js.native
  def setOptions(): scala.Unit = js.native
  def setOptions(opts: PanoramaOptions): scala.Unit = js.native
  def setPanoramaPOIType(): PanoramaPOIType = js.native
  def setPosition(position: Point): scala.Unit = js.native
  def setPov(pov: PanoramaPov): scala.Unit = js.native
  def setZoom(zoom: scala.Double): scala.Unit = js.native
  def show(): scala.Unit = js.native
}

