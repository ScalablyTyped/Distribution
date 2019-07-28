package typings.cesium.cesiumMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "Frustum")
@js.native
abstract class Frustum () extends js.Object {
  var far: Double = js.native
  var near: Double = js.native
  val projectionMatrix: Matrix4 = js.native
  def computeCullingVolume(position: Cartesian3, direction: Cartesian3, up: Cartesian3): CullingVolume = js.native
  def getPixelDimensions(drawingBufferWidth: Double, drawingBufferHeight: Double, distance: Double, result: Cartesian2): Cartesian2 = js.native
}

