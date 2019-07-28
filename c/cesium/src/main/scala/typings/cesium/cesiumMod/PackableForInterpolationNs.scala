package typings.cesium.cesiumMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "PackableForInterpolation")
@js.native
object PackableForInterpolationNs extends js.Object {
  def convertPackedArrayForInterpolation(packedArray: js.Array[Double]): js.Array[Double] = js.native
  def convertPackedArrayForInterpolation(packedArray: js.Array[Double], startingIndex: Double): js.Array[Double] = js.native
  def convertPackedArrayForInterpolation(packedArray: js.Array[Double], startingIndex: Double, lastIndex: Double): js.Array[Double] = js.native
  def convertPackedArrayForInterpolation(packedArray: js.Array[Double], startingIndex: Double, lastIndex: Double, result: js.Array[Double]): js.Array[Double] = js.native
  def unpackInterpolationResult(array: js.Array[Double], sourceArray: js.Array[Double]): js.Any = js.native
  def unpackInterpolationResult(array: js.Array[Double], sourceArray: js.Array[Double], startingIndex: Double): js.Any = js.native
  def unpackInterpolationResult(array: js.Array[Double], sourceArray: js.Array[Double], startingIndex: Double, lastIndex: Double): js.Any = js.native
  def unpackInterpolationResult(
    array: js.Array[Double],
    sourceArray: js.Array[Double],
    startingIndex: Double,
    lastIndex: Double,
    result: js.Any
  ): js.Any = js.native
}

