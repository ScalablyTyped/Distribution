package typings.cesium.cesiumMod

import typings.cesium.Anon_CornerTypeFill
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "PolylineVolumeGraphics")
@js.native
class PolylineVolumeGraphics () extends js.Object {
  def this(options: Anon_CornerTypeFill) = this()
  var cornerType: Property = js.native
  var definitionChanged: Event[js.Array[_]] = js.native
  var fill: Property = js.native
  var granularity: Property = js.native
  var material: MaterialProperty = js.native
  var outline: Property = js.native
  var outlineColor: Property = js.native
  var outlineWidth: Property = js.native
  var positions: Property = js.native
  var shape: Property = js.native
  var show: Property = js.native
  def clone(result: PolylineVolumeGraphics): PolylineVolumeGraphics = js.native
  def merge(source: PolylineVolumeGraphics): PolylineVolumeGraphics = js.native
}

