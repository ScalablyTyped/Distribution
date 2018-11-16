package typings
package cesiumLib.cesiumMod.CesiumNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PolylineGraphics extends js.Object {
  var definitionChanged: Event = js.native
  var followSurface: Property = js.native
  var granularity: Property = js.native
  var material: MaterialProperty = js.native
  var positions: Property = js.native
  var show: Property = js.native
  var width: scala.Double = js.native
  def clone(result: PolylineGraphics): PolylineGraphics = js.native
  def merge(source: PolylineGraphics): PolylineGraphics = js.native
}

