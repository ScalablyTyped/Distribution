package typings
package cesiumLib.cesiumMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "Frustum")
@js.native
abstract class Frustum () extends js.Object {
  var far: scala.Double = js.native
  var near: scala.Double = js.native
  val projectionMatrix: Matrix4 = js.native
  def computeCullingVolume(position: Cartesian3, direction: Cartesian3, up: Cartesian3): CullingVolume = js.native
  def getPixelDimensions(
    drawingBufferWidth: scala.Double,
    drawingBufferHeight: scala.Double,
    distance: scala.Double,
    result: Cartesian2
  ): Cartesian2 = js.native
}

