package typings.cesium.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object PackableForInterpolation {
  
  @JSImport("cesium", "PackableForInterpolation")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Converts a packed array into a form suitable for interpolation.
    * @param packedArray - The packed array.
    * @param [startingIndex = 0] - The index of the first element to be converted.
    * @param [lastIndex = packedArray.length] - The index of the last element to be converted.
    * @param [result] - The object into which to store the result.
    */
  inline def convertPackedArrayForInterpolation(packedArray: js.Array[Double]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("convertPackedArrayForInterpolation")(packedArray.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def convertPackedArrayForInterpolation(packedArray: js.Array[Double], startingIndex: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("convertPackedArrayForInterpolation")(packedArray.asInstanceOf[js.Any], startingIndex.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def convertPackedArrayForInterpolation(packedArray: js.Array[Double], startingIndex: Double, lastIndex: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("convertPackedArrayForInterpolation")(packedArray.asInstanceOf[js.Any], startingIndex.asInstanceOf[js.Any], lastIndex.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def convertPackedArrayForInterpolation(packedArray: js.Array[Double], startingIndex: Double, lastIndex: Double, result: js.Array[Double]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("convertPackedArrayForInterpolation")(packedArray.asInstanceOf[js.Any], startingIndex.asInstanceOf[js.Any], lastIndex.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def convertPackedArrayForInterpolation(packedArray: js.Array[Double], startingIndex: Double, lastIndex: Unit, result: js.Array[Double]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("convertPackedArrayForInterpolation")(packedArray.asInstanceOf[js.Any], startingIndex.asInstanceOf[js.Any], lastIndex.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def convertPackedArrayForInterpolation(packedArray: js.Array[Double], startingIndex: Unit, lastIndex: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("convertPackedArrayForInterpolation")(packedArray.asInstanceOf[js.Any], startingIndex.asInstanceOf[js.Any], lastIndex.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def convertPackedArrayForInterpolation(packedArray: js.Array[Double], startingIndex: Unit, lastIndex: Double, result: js.Array[Double]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("convertPackedArrayForInterpolation")(packedArray.asInstanceOf[js.Any], startingIndex.asInstanceOf[js.Any], lastIndex.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def convertPackedArrayForInterpolation(packedArray: js.Array[Double], startingIndex: Unit, lastIndex: Unit, result: js.Array[Double]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("convertPackedArrayForInterpolation")(packedArray.asInstanceOf[js.Any], startingIndex.asInstanceOf[js.Any], lastIndex.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * The number of elements used to store the object into an array in its interpolatable form.
    */
  @JSImport("cesium", "PackableForInterpolation.packedInterpolationLength")
  @js.native
  def packedInterpolationLength: Double = js.native
  inline def packedInterpolationLength_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("packedInterpolationLength")(x.asInstanceOf[js.Any])
  
  /**
    * Retrieves an instance from a packed array converted with {@link PackableForInterpolation.convertPackedArrayForInterpolation}.
    * @param array - The array previously packed for interpolation.
    * @param sourceArray - The original packed array.
    * @param [startingIndex = 0] - The startingIndex used to convert the array.
    * @param [lastIndex = packedArray.length] - The lastIndex used to convert the array.
    * @param [result] - The object into which to store the result.
    * @returns The modified result parameter or a new Object instance if one was not provided.
    */
  inline def unpackInterpolationResult(array: js.Array[Double], sourceArray: js.Array[Double]): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("unpackInterpolationResult")(array.asInstanceOf[js.Any], sourceArray.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def unpackInterpolationResult(array: js.Array[Double], sourceArray: js.Array[Double], startingIndex: Double): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("unpackInterpolationResult")(array.asInstanceOf[js.Any], sourceArray.asInstanceOf[js.Any], startingIndex.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def unpackInterpolationResult(array: js.Array[Double], sourceArray: js.Array[Double], startingIndex: Double, lastIndex: Double): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("unpackInterpolationResult")(array.asInstanceOf[js.Any], sourceArray.asInstanceOf[js.Any], startingIndex.asInstanceOf[js.Any], lastIndex.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def unpackInterpolationResult(
    array: js.Array[Double],
    sourceArray: js.Array[Double],
    startingIndex: Double,
    lastIndex: Double,
    result: Any
  ): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("unpackInterpolationResult")(array.asInstanceOf[js.Any], sourceArray.asInstanceOf[js.Any], startingIndex.asInstanceOf[js.Any], lastIndex.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def unpackInterpolationResult(
    array: js.Array[Double],
    sourceArray: js.Array[Double],
    startingIndex: Double,
    lastIndex: Unit,
    result: Any
  ): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("unpackInterpolationResult")(array.asInstanceOf[js.Any], sourceArray.asInstanceOf[js.Any], startingIndex.asInstanceOf[js.Any], lastIndex.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def unpackInterpolationResult(array: js.Array[Double], sourceArray: js.Array[Double], startingIndex: Unit, lastIndex: Double): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("unpackInterpolationResult")(array.asInstanceOf[js.Any], sourceArray.asInstanceOf[js.Any], startingIndex.asInstanceOf[js.Any], lastIndex.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def unpackInterpolationResult(
    array: js.Array[Double],
    sourceArray: js.Array[Double],
    startingIndex: Unit,
    lastIndex: Double,
    result: Any
  ): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("unpackInterpolationResult")(array.asInstanceOf[js.Any], sourceArray.asInstanceOf[js.Any], startingIndex.asInstanceOf[js.Any], lastIndex.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def unpackInterpolationResult(
    array: js.Array[Double],
    sourceArray: js.Array[Double],
    startingIndex: Unit,
    lastIndex: Unit,
    result: Any
  ): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("unpackInterpolationResult")(array.asInstanceOf[js.Any], sourceArray.asInstanceOf[js.Any], startingIndex.asInstanceOf[js.Any], lastIndex.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Any]
}
