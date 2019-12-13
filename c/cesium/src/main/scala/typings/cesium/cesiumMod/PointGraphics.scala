package typings.cesium.cesiumMod

import typings.cesium.Anon_ColorDisableDepthTestDistance
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "PointGraphics")
@js.native
class PointGraphics () extends js.Object {
  def this(options: Anon_ColorDisableDepthTestDistance) = this()
  var color: Property = js.native
  val definitionChanged: Event[js.Array[_]] = js.native
  var disableDepthTestDistance: Property = js.native
  var distanceDisplayCondition: Property = js.native
  var heightReference: Property = js.native
  var outlineColor: Property = js.native
  var outlineWidth: Property = js.native
  var pixelSize: Property = js.native
  var scaleByDistance: Property = js.native
  var show: Property = js.native
  var translucencyByDistance: Property = js.native
  def clone(result: PointGraphics): PointGraphics = js.native
  def merge(source: PointGraphics): PointGraphics = js.native
}

