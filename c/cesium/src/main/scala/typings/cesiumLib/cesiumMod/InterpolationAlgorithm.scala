package typings
package cesiumLib.cesiumMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line no-unnecessary-class
@JSImport("cesium", "InterpolationAlgorithm")
@js.native
class InterpolationAlgorithm () extends js.Object

/* static members */
@JSImport("cesium", "InterpolationAlgorithm")
@js.native
object InterpolationAlgorithm extends js.Object {
  var `type`: java.lang.String = js.native
  def getRequiredDataPoints(degree: scala.Double): scala.Double = js.native
  def interpolate(
    x: scala.Double,
    xTable: js.Array[scala.Double],
    yTable: js.Array[scala.Double],
    yStride: scala.Double,
    inputOrder: scala.Double,
    outputOrder: scala.Double
  ): js.Array[scala.Double] = js.native
  def interpolate(
    x: scala.Double,
    xTable: js.Array[scala.Double],
    yTable: js.Array[scala.Double],
    yStride: scala.Double,
    inputOrder: scala.Double,
    outputOrder: scala.Double,
    result: js.Array[scala.Double]
  ): js.Array[scala.Double] = js.native
  def interpolateOrderZero(
    x: scala.Double,
    xTable: js.Array[scala.Double],
    yTable: js.Array[scala.Double],
    yStride: scala.Double
  ): js.Array[scala.Double] = js.native
  def interpolateOrderZero(
    x: scala.Double,
    xTable: js.Array[scala.Double],
    yTable: js.Array[scala.Double],
    yStride: scala.Double,
    result: js.Array[scala.Double]
  ): js.Array[scala.Double] = js.native
}

