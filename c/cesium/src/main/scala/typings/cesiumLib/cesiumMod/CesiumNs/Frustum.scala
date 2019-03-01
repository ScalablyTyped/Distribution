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
    computeCullingVolume: js.Function3[Cartesian3, Cartesian3, Cartesian3, CullingVolume],
    far: scala.Double,
    getPixelDimensions: js.Function4[scala.Double, scala.Double, scala.Double, Cartesian2, Cartesian2],
    near: scala.Double,
    projectionMatrix: Matrix4
  ): Frustum = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("computeCullingVolume")(computeCullingVolume)
    __obj.updateDynamic("far")(far)
    __obj.updateDynamic("getPixelDimensions")(getPixelDimensions)
    __obj.updateDynamic("near")(near)
    __obj.updateDynamic("projectionMatrix")(projectionMatrix)
    __obj.asInstanceOf[Frustum]
  }
}

