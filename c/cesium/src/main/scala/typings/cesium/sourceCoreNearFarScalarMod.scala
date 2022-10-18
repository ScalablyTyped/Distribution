package typings.cesium

import typings.cesium.mod.NearFarScalar
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sourceCoreNearFarScalarMod {
  
  @JSImport("cesium/Source/Core/NearFarScalar", JSImport.Default)
  @js.native
  open class default () extends NearFarScalar {
    def this(near: Double) = this()
    def this(near: Double, nearValue: Double) = this()
    def this(near: Unit, nearValue: Double) = this()
    def this(near: Double, nearValue: Double, far: Double) = this()
    def this(near: Double, nearValue: Unit, far: Double) = this()
    def this(near: Unit, nearValue: Double, far: Double) = this()
    def this(near: Unit, nearValue: Unit, far: Double) = this()
    def this(near: Double, nearValue: Double, far: Double, farValue: Double) = this()
    def this(near: Double, nearValue: Double, far: Unit, farValue: Double) = this()
    def this(near: Double, nearValue: Unit, far: Double, farValue: Double) = this()
    def this(near: Double, nearValue: Unit, far: Unit, farValue: Double) = this()
    def this(near: Unit, nearValue: Double, far: Double, farValue: Double) = this()
    def this(near: Unit, nearValue: Double, far: Unit, farValue: Double) = this()
    def this(near: Unit, nearValue: Unit, far: Double, farValue: Double) = this()
    def this(near: Unit, nearValue: Unit, far: Unit, farValue: Double) = this()
  }
  /* static members */
  object default {
    
    @JSImport("cesium/Source/Core/NearFarScalar", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Duplicates a NearFarScalar instance.
      * @param nearFarScalar - The NearFarScalar to duplicate.
      * @param [result] - The object onto which to store the result.
      * @returns The modified result parameter or a new NearFarScalar instance if one was not provided. (Returns undefined if nearFarScalar is undefined)
      */
    inline def clone(nearFarScalar: NearFarScalar): NearFarScalar = ^.asInstanceOf[js.Dynamic].applyDynamic("clone")(nearFarScalar.asInstanceOf[js.Any]).asInstanceOf[NearFarScalar]
    inline def clone(nearFarScalar: NearFarScalar, result: NearFarScalar): NearFarScalar = (^.asInstanceOf[js.Dynamic].applyDynamic("clone")(nearFarScalar.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[NearFarScalar]
    
    /**
      * Compares the provided NearFarScalar and returns <code>true</code> if they are equal,
      * <code>false</code> otherwise.
      * @param [left] - The first NearFarScalar.
      * @param [right] - The second NearFarScalar.
      * @returns <code>true</code> if left and right are equal; otherwise <code>false</code>.
      */
    inline def equals(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("equals")().asInstanceOf[Boolean]
    inline def equals(left: Unit, right: NearFarScalar): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def equals(left: NearFarScalar): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("equals")(left.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    inline def equals(left: NearFarScalar, right: NearFarScalar): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    /**
      * Stores the provided instance into the provided array.
      * @param value - The value to pack.
      * @param array - The array to pack into.
      * @param [startingIndex = 0] - The index into the array at which to start packing the elements.
      * @returns The array that was packed into
      */
    inline def pack(value: NearFarScalar, array: js.Array[Double]): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("pack")(value.asInstanceOf[js.Any], array.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
    inline def pack(value: NearFarScalar, array: js.Array[Double], startingIndex: Double): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("pack")(value.asInstanceOf[js.Any], array.asInstanceOf[js.Any], startingIndex.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
    
    /**
      * The number of elements used to pack the object into an array.
      */
    @JSImport("cesium/Source/Core/NearFarScalar", "default.packedLength")
    @js.native
    def packedLength: Double = js.native
    inline def packedLength_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("packedLength")(x.asInstanceOf[js.Any])
    
    /**
      * Retrieves an instance from a packed array.
      * @param array - The packed array.
      * @param [startingIndex = 0] - The starting index of the element to be unpacked.
      * @param [result] - The object into which to store the result.
      * @returns The modified result parameter or a new NearFarScalar instance if one was not provided.
      */
    inline def unpack(array: js.Array[Double]): NearFarScalar = ^.asInstanceOf[js.Dynamic].applyDynamic("unpack")(array.asInstanceOf[js.Any]).asInstanceOf[NearFarScalar]
    inline def unpack(array: js.Array[Double], startingIndex: Double): NearFarScalar = (^.asInstanceOf[js.Dynamic].applyDynamic("unpack")(array.asInstanceOf[js.Any], startingIndex.asInstanceOf[js.Any])).asInstanceOf[NearFarScalar]
    inline def unpack(array: js.Array[Double], startingIndex: Double, result: NearFarScalar): NearFarScalar = (^.asInstanceOf[js.Dynamic].applyDynamic("unpack")(array.asInstanceOf[js.Any], startingIndex.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[NearFarScalar]
    inline def unpack(array: js.Array[Double], startingIndex: Unit, result: NearFarScalar): NearFarScalar = (^.asInstanceOf[js.Dynamic].applyDynamic("unpack")(array.asInstanceOf[js.Any], startingIndex.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[NearFarScalar]
  }
}
