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

