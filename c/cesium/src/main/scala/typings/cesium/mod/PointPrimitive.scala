package typings.cesium.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "PointPrimitive")
@js.native
class PointPrimitive () extends js.Object {
  var color: Color = js.native
  var disableDepthTestDistance: Double = js.native
  var distanceDisplayCondition: DistanceDisplayCondition = js.native
  var id: js.Any = js.native
  var outlineColor: Color = js.native
  var outlineWidth: Double = js.native
  var pixelSize: Double = js.native
  var position: Cartesian3 = js.native
  var scaleByDistance: NearFarScalar = js.native
  var show: Boolean = js.native
  var translucencyByDistance: NearFarScalar = js.native
  def computeScreenSpacePosition(scene: Scene): Cartesian2 = js.native
  def computeScreenSpacePosition(scene: Scene, result: Cartesian2): Cartesian2 = js.native
  def equals(other: PointPrimitive): Boolean = js.native
}

