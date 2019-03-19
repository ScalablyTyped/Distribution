package typings
package cesiumLib.cesiumMod.CesiumNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PointGraphics extends js.Object {
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

