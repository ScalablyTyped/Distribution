package typings
package cesiumLib.cesiumMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "PointPrimitive")
@js.native
class PointPrimitive () extends js.Object {
  var color: Color = js.native
  var disableDepthTestDistance: scala.Double = js.native
  var distanceDisplayCondition: DistanceDisplayCondition = js.native
  var id: js.Any = js.native
  var outlineColor: Color = js.native
  var outlineWidth: scala.Double = js.native
  var pixelSize: scala.Double = js.native
  var position: Cartesian3 = js.native
  var scaleByDistance: NearFarScalar = js.native
  var show: scala.Boolean = js.native
  var translucencyByDistance: NearFarScalar = js.native
  def computeScreenSpacePosition(scene: Scene): Cartesian2 = js.native
  def computeScreenSpacePosition(scene: Scene, result: Cartesian2): Cartesian2 = js.native
  def equals(other: PointPrimitive): scala.Boolean = js.native
}

