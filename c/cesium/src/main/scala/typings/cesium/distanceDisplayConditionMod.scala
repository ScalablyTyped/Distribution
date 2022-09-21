package typings.cesium

import typings.cesium.mod.DistanceDisplayCondition
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distanceDisplayConditionMod {
  
  @JSImport("cesium/Source/Core/DistanceDisplayCondition", JSImport.Default)
  @js.native
  open class default () extends DistanceDisplayCondition {
    def this(near: Double) = this()
    def this(near: Double, far: Double) = this()
    def this(near: Unit, far: Double) = this()
  }
  /* static members */
  object default {
    
    @JSImport("cesium/Source/Core/DistanceDisplayCondition", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    inline def clone(value: Unit, result: DistanceDisplayCondition): DistanceDisplayCondition = (^.asInstanceOf[js.Dynamic].applyDynamic("clone")(value.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[DistanceDisplayCondition]
    inline def clone(value: DistanceDisplayCondition): DistanceDisplayCondition = ^.asInstanceOf[js.Dynamic].applyDynamic("clone")(value.asInstanceOf[js.Any]).asInstanceOf[DistanceDisplayCondition]
    inline def clone(value: DistanceDisplayCondition, result: DistanceDisplayCondition): DistanceDisplayCondition = (^.asInstanceOf[js.Dynamic].applyDynamic("clone")(value.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[DistanceDisplayCondition]
    
    /**
      * Determines if two distance display conditions are equal.
      * @param left - A distance display condition.
      * @param right - Another distance display condition.
      * @returns Whether the two distance display conditions are equal.
      */
    inline def equals(left: DistanceDisplayCondition, right: DistanceDisplayCondition): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    /**
      * Stores the provided instance into the provided array.
      * @param value - The value to pack.
      * @param array - The array to pack into.
      * @param [startingIndex = 0] - The index into the array at which to start packing the elements.
      * @returns The array that was packed into
      */
    inline def pack(value: DistanceDisplayCondition, array: js.Array[Double]): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("pack")(value.asInstanceOf[js.Any], array.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
    inline def pack(value: DistanceDisplayCondition, array: js.Array[Double], startingIndex: Double): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("pack")(value.asInstanceOf[js.Any], array.asInstanceOf[js.Any], startingIndex.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
    
    /**
      * The number of elements used to pack the object into an array.
      */
    @JSImport("cesium/Source/Core/DistanceDisplayCondition", "default.packedLength")
    @js.native
    def packedLength: Double = js.native
    inline def packedLength_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("packedLength")(x.asInstanceOf[js.Any])
    
    /**
      * Retrieves an instance from a packed array.
      * @param array - The packed array.
      * @param [startingIndex = 0] - The starting index of the element to be unpacked.
      * @param [result] - The object into which to store the result.
      * @returns The modified result parameter or a new DistanceDisplayCondition instance if one was not provided.
      */
    inline def unpack(array: js.Array[Double]): DistanceDisplayCondition = ^.asInstanceOf[js.Dynamic].applyDynamic("unpack")(array.asInstanceOf[js.Any]).asInstanceOf[DistanceDisplayCondition]
    inline def unpack(array: js.Array[Double], startingIndex: Double): DistanceDisplayCondition = (^.asInstanceOf[js.Dynamic].applyDynamic("unpack")(array.asInstanceOf[js.Any], startingIndex.asInstanceOf[js.Any])).asInstanceOf[DistanceDisplayCondition]
    inline def unpack(array: js.Array[Double], startingIndex: Double, result: DistanceDisplayCondition): DistanceDisplayCondition = (^.asInstanceOf[js.Dynamic].applyDynamic("unpack")(array.asInstanceOf[js.Any], startingIndex.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[DistanceDisplayCondition]
    inline def unpack(array: js.Array[Double], startingIndex: Unit, result: DistanceDisplayCondition): DistanceDisplayCondition = (^.asInstanceOf[js.Dynamic].applyDynamic("unpack")(array.asInstanceOf[js.Any], startingIndex.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[DistanceDisplayCondition]
  }
}
