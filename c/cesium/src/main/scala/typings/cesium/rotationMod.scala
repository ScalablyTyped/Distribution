package typings.cesium

import typings.cesium.mod.Rotation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rotationMod {
  
  object default {
    
    @JSImport("cesium/Source/DataSources/Rotation", JSImport.Default)
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
      * Stores the provided instance into the provided array.
      * @param value - The value to pack.
      * @param array - The array to pack into.
      * @param [startingIndex = 0] - The index into the array at which to start packing the elements.
      * @returns The array that was packed into
      */
    inline def pack(value: Rotation, array: js.Array[Double]): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("pack")(value.asInstanceOf[js.Any], array.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
    inline def pack(value: Rotation, array: js.Array[Double], startingIndex: Double): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("pack")(value.asInstanceOf[js.Any], array.asInstanceOf[js.Any], startingIndex.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
    
    /**
      * The number of elements used to pack the object into an array.
      */
    @JSImport("cesium/Source/DataSources/Rotation", "default.packedLength")
    @js.native
    def packedLength: Double = js.native
    inline def packedLength_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("packedLength")(x.asInstanceOf[js.Any])
    
    /**
      * Retrieves an instance from a packed array.
      * @param array - The packed array.
      * @param [startingIndex = 0] - The starting index of the element to be unpacked.
      * @param [result] - The object into which to store the result.
      * @returns The modified result parameter or a new Rotation instance if one was not provided.
      */
    inline def unpack(array: js.Array[Double]): Rotation = ^.asInstanceOf[js.Dynamic].applyDynamic("unpack")(array.asInstanceOf[js.Any]).asInstanceOf[Rotation]
    inline def unpack(array: js.Array[Double], startingIndex: Double): Rotation = (^.asInstanceOf[js.Dynamic].applyDynamic("unpack")(array.asInstanceOf[js.Any], startingIndex.asInstanceOf[js.Any])).asInstanceOf[Rotation]
    inline def unpack(array: js.Array[Double], startingIndex: Double, result: Rotation): Rotation = (^.asInstanceOf[js.Dynamic].applyDynamic("unpack")(array.asInstanceOf[js.Any], startingIndex.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Rotation]
    inline def unpack(array: js.Array[Double], startingIndex: Unit, result: Rotation): Rotation = (^.asInstanceOf[js.Dynamic].applyDynamic("unpack")(array.asInstanceOf[js.Any], startingIndex.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Rotation]
    
    /**
      * Retrieves an instance from a packed array converted with {@link Rotation.convertPackedArrayForInterpolation}.
      * @param array - The array previously packed for interpolation.
      * @param sourceArray - The original packed array.
      * @param [firstIndex = 0] - The firstIndex used to convert the array.
      * @param [lastIndex = packedArray.length] - The lastIndex used to convert the array.
      * @param [result] - The object into which to store the result.
      * @returns The modified result parameter or a new Rotation instance if one was not provided.
      */
    inline def unpackInterpolationResult(array: js.Array[Double], sourceArray: js.Array[Double]): Rotation = (^.asInstanceOf[js.Dynamic].applyDynamic("unpackInterpolationResult")(array.asInstanceOf[js.Any], sourceArray.asInstanceOf[js.Any])).asInstanceOf[Rotation]
    inline def unpackInterpolationResult(array: js.Array[Double], sourceArray: js.Array[Double], firstIndex: Double): Rotation = (^.asInstanceOf[js.Dynamic].applyDynamic("unpackInterpolationResult")(array.asInstanceOf[js.Any], sourceArray.asInstanceOf[js.Any], firstIndex.asInstanceOf[js.Any])).asInstanceOf[Rotation]
    inline def unpackInterpolationResult(array: js.Array[Double], sourceArray: js.Array[Double], firstIndex: Double, lastIndex: Double): Rotation = (^.asInstanceOf[js.Dynamic].applyDynamic("unpackInterpolationResult")(array.asInstanceOf[js.Any], sourceArray.asInstanceOf[js.Any], firstIndex.asInstanceOf[js.Any], lastIndex.asInstanceOf[js.Any])).asInstanceOf[Rotation]
    inline def unpackInterpolationResult(
      array: js.Array[Double],
      sourceArray: js.Array[Double],
      firstIndex: Double,
      lastIndex: Double,
      result: Rotation
    ): Rotation = (^.asInstanceOf[js.Dynamic].applyDynamic("unpackInterpolationResult")(array.asInstanceOf[js.Any], sourceArray.asInstanceOf[js.Any], firstIndex.asInstanceOf[js.Any], lastIndex.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Rotation]
    inline def unpackInterpolationResult(
      array: js.Array[Double],
      sourceArray: js.Array[Double],
      firstIndex: Double,
      lastIndex: Unit,
      result: Rotation
    ): Rotation = (^.asInstanceOf[js.Dynamic].applyDynamic("unpackInterpolationResult")(array.asInstanceOf[js.Any], sourceArray.asInstanceOf[js.Any], firstIndex.asInstanceOf[js.Any], lastIndex.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Rotation]
    inline def unpackInterpolationResult(array: js.Array[Double], sourceArray: js.Array[Double], firstIndex: Unit, lastIndex: Double): Rotation = (^.asInstanceOf[js.Dynamic].applyDynamic("unpackInterpolationResult")(array.asInstanceOf[js.Any], sourceArray.asInstanceOf[js.Any], firstIndex.asInstanceOf[js.Any], lastIndex.asInstanceOf[js.Any])).asInstanceOf[Rotation]
    inline def unpackInterpolationResult(
      array: js.Array[Double],
      sourceArray: js.Array[Double],
      firstIndex: Unit,
      lastIndex: Double,
      result: Rotation
    ): Rotation = (^.asInstanceOf[js.Dynamic].applyDynamic("unpackInterpolationResult")(array.asInstanceOf[js.Any], sourceArray.asInstanceOf[js.Any], firstIndex.asInstanceOf[js.Any], lastIndex.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Rotation]
    inline def unpackInterpolationResult(
      array: js.Array[Double],
      sourceArray: js.Array[Double],
      firstIndex: Unit,
      lastIndex: Unit,
      result: Rotation
    ): Rotation = (^.asInstanceOf[js.Dynamic].applyDynamic("unpackInterpolationResult")(array.asInstanceOf[js.Any], sourceArray.asInstanceOf[js.Any], firstIndex.asInstanceOf[js.Any], lastIndex.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Rotation]
  }
}
