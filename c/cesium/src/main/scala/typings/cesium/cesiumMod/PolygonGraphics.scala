package typings.cesium.cesiumMod

import typings.cesium.Anon_ExtrudedHeightFill
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "PolygonGraphics")
@js.native
class PolygonGraphics () extends js.Object {
  def this(options: Anon_ExtrudedHeightFill) = this()
  var definitionChanged: Event[js.Array[_]] = js.native
  var extrudedHeight: Property = js.native
  var fill: Boolean = js.native
  var granularity: Property = js.native
  var height: Property = js.native
  var hierarchy: Property = js.native
  var material: MaterialProperty | Color = js.native
  var outline: Property = js.native
  var outlineColor: Color = js.native
  var outlineWidth: Property = js.native
  var perPositionHeight: Property = js.native
  var positions: Property = js.native
  var show: Property = js.native
  var stRotation: Property = js.native
  def clone(result: PolygonGraphics): PolygonGraphics = js.native
  def merge(source: PolygonGraphics): PolygonGraphics = js.native
}

