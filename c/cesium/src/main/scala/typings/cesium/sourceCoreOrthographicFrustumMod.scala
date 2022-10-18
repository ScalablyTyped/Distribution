package typings.cesium

import typings.cesium.anon.AspectRatio
import typings.cesium.mod.OrthographicFrustum
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sourceCoreOrthographicFrustumMod {
  
  @JSImport("cesium/Source/Core/OrthographicFrustum", JSImport.Default)
  @js.native
  open class default () extends OrthographicFrustum {
    def this(options: AspectRatio) = this()
  }
  /* static members */
  object default {
    
    @JSImport("cesium/Source/Core/OrthographicFrustum", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Stores the provided instance into the provided array.
      * @param value - The value to pack.
      * @param array - The array to pack into.
      * @param [startingIndex = 0] - The index into the array at which to start packing the elements.
      * @returns The array that was packed into
      */
    inline def pack(value: OrthographicFrustum, array: js.Array[Double]): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("pack")(value.asInstanceOf[js.Any], array.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
    inline def pack(value: OrthographicFrustum, array: js.Array[Double], startingIndex: Double): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("pack")(value.asInstanceOf[js.Any], array.asInstanceOf[js.Any], startingIndex.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
    
    /**
      * The number of elements used to pack the object into an array.
      */
    @JSImport("cesium/Source/Core/OrthographicFrustum", "default.packedLength")
    @js.native
    def packedLength: Double = js.native
    inline def packedLength_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("packedLength")(x.asInstanceOf[js.Any])
    
    /**
      * Retrieves an instance from a packed array.
      * @param array - The packed array.
      * @param [startingIndex = 0] - The starting index of the element to be unpacked.
      * @param [result] - The object into which to store the result.
      * @returns The modified result parameter or a new OrthographicFrustum instance if one was not provided.
      */
    inline def unpack(array: js.Array[Double]): OrthographicFrustum = ^.asInstanceOf[js.Dynamic].applyDynamic("unpack")(array.asInstanceOf[js.Any]).asInstanceOf[OrthographicFrustum]
    inline def unpack(array: js.Array[Double], startingIndex: Double): OrthographicFrustum = (^.asInstanceOf[js.Dynamic].applyDynamic("unpack")(array.asInstanceOf[js.Any], startingIndex.asInstanceOf[js.Any])).asInstanceOf[OrthographicFrustum]
    inline def unpack(array: js.Array[Double], startingIndex: Double, result: OrthographicFrustum): OrthographicFrustum = (^.asInstanceOf[js.Dynamic].applyDynamic("unpack")(array.asInstanceOf[js.Any], startingIndex.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[OrthographicFrustum]
    inline def unpack(array: js.Array[Double], startingIndex: Unit, result: OrthographicFrustum): OrthographicFrustum = (^.asInstanceOf[js.Dynamic].applyDynamic("unpack")(array.asInstanceOf[js.Any], startingIndex.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[OrthographicFrustum]
  }
}
