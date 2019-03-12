package typings
package cesiumLib.cesiumMod.CesiumNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Frustum extends js.Object {
  var far: scala.Double
  var near: scala.Double
  val projectionMatrix: Matrix4
  def computeCullingVolume(position: Cartesian3, direction: Cartesian3, up: Cartesian3): CullingVolume
  def getPixelDimensions(
    drawingBufferWidth: scala.Double,
    drawingBufferHeight: scala.Double,
    distance: scala.Double,
    result: Cartesian2
  ): Cartesian2
}

object Frustum {
  @scala.inline
  def apply(
    computeCullingVolume: (Cartesian3, Cartesian3, Cartesian3) => CullingVolume,
    far: scala.Double,
    getPixelDimensions: (scala.Double, scala.Double, scala.Double, Cartesian2) => Cartesian2,
    near: scala.Double,
    projectionMatrix: Matrix4
  ): Frustum = {
    val __obj = js.Dynamic.literal(computeCullingVolume = js.Any.fromFunction3(computeCullingVolume), far = far, getPixelDimensions = js.Any.fromFunction4(getPixelDimensions), near = near, projectionMatrix = projectionMatrix)
  
    __obj.asInstanceOf[Frustum]
  }
}

