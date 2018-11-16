package typings
package cesiumLib.cesiumMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "PackableForInterpolation")
@js.native
object PackableForInterpolationNs extends js.Object {
  def convertPackedArrayForInterpolation(packedArray: js.Array[scala.Double]): js.Array[scala.Double] = js.native
  def convertPackedArrayForInterpolation(packedArray: js.Array[scala.Double], startingIndex: scala.Double): js.Array[scala.Double] = js.native
  def convertPackedArrayForInterpolation(packedArray: js.Array[scala.Double], startingIndex: scala.Double, lastIndex: scala.Double): js.Array[scala.Double] = js.native
  def convertPackedArrayForInterpolation(
    packedArray: js.Array[scala.Double],
    startingIndex: scala.Double,
    lastIndex: scala.Double,
    result: js.Array[scala.Double]
  ): js.Array[scala.Double] = js.native
  def unpackInterpolationResult(array: js.Array[scala.Double], sourceArray: js.Array[scala.Double]): js.Any = js.native
  def unpackInterpolationResult(array: js.Array[scala.Double], sourceArray: js.Array[scala.Double], startingIndex: scala.Double): js.Any = js.native
  def unpackInterpolationResult(
    array: js.Array[scala.Double],
    sourceArray: js.Array[scala.Double],
    startingIndex: scala.Double,
    lastIndex: scala.Double
  ): js.Any = js.native
  def unpackInterpolationResult(
    array: js.Array[scala.Double],
    sourceArray: js.Array[scala.Double],
    startingIndex: scala.Double,
    lastIndex: scala.Double,
    result: js.Any
  ): js.Any = js.native
}

