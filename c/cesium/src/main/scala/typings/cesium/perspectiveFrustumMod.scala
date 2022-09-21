package typings.cesium

import typings.cesium.anon.Far
import typings.cesium.mod.PerspectiveFrustum
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object perspectiveFrustumMod {
  
  @JSImport("cesium/Source/Core/PerspectiveFrustum", JSImport.Default)
  @js.native
  open class default () extends PerspectiveFrustum {
    def this(options: Far) = this()
  }
  /* static members */
  object default {
    
    @JSImport("cesium/Source/Core/PerspectiveFrustum", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Stores the provided instance into the provided array.
      * @param value - The value to pack.
      * @param array - The array to pack into.
      * @param [startingIndex = 0] - The index into the array at which to start packing the elements.
      * @returns The array that was packed into
      */
    inline def pack(value: PerspectiveFrustum, array: js.Array[Double]): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("pack")(value.asInstanceOf[js.Any], array.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
    inline def pack(value: PerspectiveFrustum, array: js.Array[Double], startingIndex: Double): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("pack")(value.asInstanceOf[js.Any], array.asInstanceOf[js.Any], startingIndex.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
    
    /**
      * The number of elements used to pack the object into an array.
      */
    @JSImport("cesium/Source/Core/PerspectiveFrustum", "default.packedLength")
    @js.native
    def packedLength: Double = js.native
    inline def packedLength_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("packedLength")(x.asInstanceOf[js.Any])
    
    /**
      * Retrieves an instance from a packed array.
      * @param array - The packed array.
      * @param [startingIndex = 0] - The starting index of the element to be unpacked.
      * @param [result] - The object into which to store the result.
      * @returns The modified result parameter or a new PerspectiveFrustum instance if one was not provided.
      */
    inline def unpack(array: js.Array[Double]): PerspectiveFrustum = ^.asInstanceOf[js.Dynamic].applyDynamic("unpack")(array.asInstanceOf[js.Any]).asInstanceOf[PerspectiveFrustum]
    inline def unpack(array: js.Array[Double], startingIndex: Double): PerspectiveFrustum = (^.asInstanceOf[js.Dynamic].applyDynamic("unpack")(array.asInstanceOf[js.Any], startingIndex.asInstanceOf[js.Any])).asInstanceOf[PerspectiveFrustum]
    inline def unpack(array: js.Array[Double], startingIndex: Double, result: PerspectiveFrustum): PerspectiveFrustum = (^.asInstanceOf[js.Dynamic].applyDynamic("unpack")(array.asInstanceOf[js.Any], startingIndex.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[PerspectiveFrustum]
    inline def unpack(array: js.Array[Double], startingIndex: Unit, result: PerspectiveFrustum): PerspectiveFrustum = (^.asInstanceOf[js.Dynamic].applyDynamic("unpack")(array.asInstanceOf[js.Any], startingIndex.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[PerspectiveFrustum]
  }
}
