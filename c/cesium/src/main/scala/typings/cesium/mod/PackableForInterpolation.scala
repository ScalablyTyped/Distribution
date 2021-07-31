package typings.cesium.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait PackableForInterpolation extends StObject
@JSImport("cesium", "PackableForInterpolation")
@js.native
object PackableForInterpolation extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PackableForInterpolation & Double] = js.native
  
  def convertPackedArrayForInterpolation(packedArray: js.Array[Double]): js.Array[Double] = js.native
  def convertPackedArrayForInterpolation(packedArray: js.Array[Double], startingIndex: Double): js.Array[Double] = js.native
  def convertPackedArrayForInterpolation(packedArray: js.Array[Double], startingIndex: Double, lastIndex: Double): js.Array[Double] = js.native
  def convertPackedArrayForInterpolation(packedArray: js.Array[Double], startingIndex: Double, lastIndex: Double, result: js.Array[Double]): js.Array[Double] = js.native
  def convertPackedArrayForInterpolation(packedArray: js.Array[Double], startingIndex: Double, lastIndex: Unit, result: js.Array[Double]): js.Array[Double] = js.native
  def convertPackedArrayForInterpolation(packedArray: js.Array[Double], startingIndex: Unit, lastIndex: Double): js.Array[Double] = js.native
  def convertPackedArrayForInterpolation(packedArray: js.Array[Double], startingIndex: Unit, lastIndex: Double, result: js.Array[Double]): js.Array[Double] = js.native
  def convertPackedArrayForInterpolation(packedArray: js.Array[Double], startingIndex: Unit, lastIndex: Unit, result: js.Array[Double]): js.Array[Double] = js.native
  
  @js.native
  sealed trait packedInterpolationLength
    extends StObject
       with PackableForInterpolation
  /* 0 */ val packedInterpolationLength: typings.cesium.mod.PackableForInterpolation.packedInterpolationLength & Double = js.native
  
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
  def unpackInterpolationResult(
    array: js.Array[Double],
    sourceArray: js.Array[Double],
    startingIndex: Double,
    lastIndex: Unit,
    result: js.Any
  ): js.Any = js.native
  def unpackInterpolationResult(array: js.Array[Double], sourceArray: js.Array[Double], startingIndex: Unit, lastIndex: Double): js.Any = js.native
  def unpackInterpolationResult(
    array: js.Array[Double],
    sourceArray: js.Array[Double],
    startingIndex: Unit,
    lastIndex: Double,
    result: js.Any
  ): js.Any = js.native
  def unpackInterpolationResult(
    array: js.Array[Double],
    sourceArray: js.Array[Double],
    startingIndex: Unit,
    lastIndex: Unit,
    result: js.Any
  ): js.Any = js.native
}
