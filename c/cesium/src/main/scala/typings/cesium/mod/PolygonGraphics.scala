package typings.cesium.mod

import typings.cesium.AnonArcTypeClassificationType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "PolygonGraphics")
@js.native
class PolygonGraphics () extends js.Object {
  def this(options: AnonArcTypeClassificationType) = this()
  var arcType: Property = js.native
  var classificationType: Property = js.native
  var closeBottom: Property = js.native
  var closeTop: Property = js.native
  var definitionChanged: Event[js.Array[_]] = js.native
  var distanceDisplayCondition: Property = js.native
  var extrudedHeight: Property = js.native
  var extrudedHeightReference: Property = js.native
  var fill: Boolean = js.native
  var granularity: Property = js.native
  var height: Property = js.native
  var heightReference: Property = js.native
  var hierarchy: Property = js.native
  var material: MaterialProperty | Color = js.native
  var outline: Property = js.native
  var outlineColor: Color = js.native
  var outlineWidth: Property = js.native
  var perPositionHeight: Property = js.native
  var shadows: Property = js.native
  var show: Property = js.native
  var stRotation: Property = js.native
  var zIndex: ConstantProperty = js.native
  def clone(result: PolygonGraphics): PolygonGraphics = js.native
  def merge(source: PolygonGraphics): PolygonGraphics = js.native
}

