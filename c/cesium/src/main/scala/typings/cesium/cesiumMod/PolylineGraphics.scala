package typings.cesium.cesiumMod

import typings.cesium.Anon_FollowSurface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "PolylineGraphics")
@js.native
class PolylineGraphics () extends js.Object {
  def this(options: Anon_FollowSurface) = this()
  var definitionChanged: Event[js.Array[_]] = js.native
  var followSurface: Property = js.native
  var granularity: Property = js.native
  var material: MaterialProperty = js.native
  var positions: Property = js.native
  var show: Property = js.native
  var width: Double = js.native
  def clone(result: PolylineGraphics): PolylineGraphics = js.native
  def merge(source: PolylineGraphics): PolylineGraphics = js.native
}

