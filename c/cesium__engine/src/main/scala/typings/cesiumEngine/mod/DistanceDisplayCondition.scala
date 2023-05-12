package typings.cesiumEngine.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@cesium/engine", "DistanceDisplayCondition")
@js.native
open class DistanceDisplayCondition () extends StObject {
  def this(near: Double) = this()
  def this(near: Double, far: Double) = this()
  def this(near: Unit, far: Double) = this()
  
  def clone(result: DistanceDisplayCondition): DistanceDisplayCondition = js.native
  
  /**
    * Determines if this distance display condition is equal to another.
    * @param other - Another distance display condition.
    * @returns Whether this distance display condition is equal to the other.
    */
  def equals(other: DistanceDisplayCondition): Boolean = js.native
  
  /**
    * The largest distance in the interval where the object is visible.
    */
  var far: Double = js.native
  
  /**
    * The smallest distance in the interval where the object is visible.
    */
  var near: Double = js.native
}
/* static members */
object DistanceDisplayCondition {
  
  @JSImport("@cesium/engine", "DistanceDisplayCondition")
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
  @JSImport("@cesium/engine", "DistanceDisplayCondition.packedLength")
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
