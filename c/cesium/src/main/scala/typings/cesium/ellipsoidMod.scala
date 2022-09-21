package typings.cesium

import typings.cesium.mod.Cartesian3
import typings.cesium.mod.Ellipsoid
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ellipsoidMod {
  
  @JSImport("cesium/Source/Core/Ellipsoid", JSImport.Default)
  @js.native
  open class default () extends Ellipsoid {
    def this(x: Double) = this()
    def this(x: Double, y: Double) = this()
    def this(x: Unit, y: Double) = this()
    def this(x: Double, y: Double, z: Double) = this()
    def this(x: Double, y: Unit, z: Double) = this()
    def this(x: Unit, y: Double, z: Double) = this()
    def this(x: Unit, y: Unit, z: Double) = this()
  }
  /* static members */
  object default {
    
    @JSImport("cesium/Source/Core/Ellipsoid", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * An Ellipsoid instance initialized to a sphere with the lunar radius.
      */
    @JSImport("cesium/Source/Core/Ellipsoid", "default.MOON")
    @js.native
    val MOON: Ellipsoid = js.native
    
    /**
      * An Ellipsoid instance initialized to radii of (1.0, 1.0, 1.0).
      */
    @JSImport("cesium/Source/Core/Ellipsoid", "default.UNIT_SPHERE")
    @js.native
    val UNIT_SPHERE: Ellipsoid = js.native
    
    /**
      * An Ellipsoid instance initialized to the WGS84 standard.
      */
    @JSImport("cesium/Source/Core/Ellipsoid", "default.WGS84")
    @js.native
    val WGS84: Ellipsoid = js.native
    
    /**
      * Duplicates an Ellipsoid instance.
      * @param ellipsoid - The ellipsoid to duplicate.
      * @param [result] - The object onto which to store the result, or undefined if a new
      *                    instance should be created.
      * @returns The cloned Ellipsoid. (Returns undefined if ellipsoid is undefined)
      */
    inline def clone(ellipsoid: Ellipsoid): Ellipsoid = ^.asInstanceOf[js.Dynamic].applyDynamic("clone")(ellipsoid.asInstanceOf[js.Any]).asInstanceOf[Ellipsoid]
    inline def clone(ellipsoid: Ellipsoid, result: Ellipsoid): Ellipsoid = (^.asInstanceOf[js.Dynamic].applyDynamic("clone")(ellipsoid.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Ellipsoid]
    
    /**
      * Computes an Ellipsoid from a Cartesian specifying the radii in x, y, and z directions.
      * @param [cartesian = Cartesian3.ZERO] - The ellipsoid's radius in the x, y, and z directions.
      * @param [result] - The object onto which to store the result, or undefined if a new
      *                    instance should be created.
      * @returns A new Ellipsoid instance.
      */
    inline def fromCartesian3(): Ellipsoid = ^.asInstanceOf[js.Dynamic].applyDynamic("fromCartesian3")().asInstanceOf[Ellipsoid]
    inline def fromCartesian3(cartesian: Unit, result: Ellipsoid): Ellipsoid = (^.asInstanceOf[js.Dynamic].applyDynamic("fromCartesian3")(cartesian.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Ellipsoid]
    inline def fromCartesian3(cartesian: Cartesian3): Ellipsoid = ^.asInstanceOf[js.Dynamic].applyDynamic("fromCartesian3")(cartesian.asInstanceOf[js.Any]).asInstanceOf[Ellipsoid]
    inline def fromCartesian3(cartesian: Cartesian3, result: Ellipsoid): Ellipsoid = (^.asInstanceOf[js.Dynamic].applyDynamic("fromCartesian3")(cartesian.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Ellipsoid]
    
    /**
      * Stores the provided instance into the provided array.
      * @param value - The value to pack.
      * @param array - The array to pack into.
      * @param [startingIndex = 0] - The index into the array at which to start packing the elements.
      * @returns The array that was packed into
      */
    inline def pack(value: Ellipsoid, array: js.Array[Double]): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("pack")(value.asInstanceOf[js.Any], array.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
    inline def pack(value: Ellipsoid, array: js.Array[Double], startingIndex: Double): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("pack")(value.asInstanceOf[js.Any], array.asInstanceOf[js.Any], startingIndex.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
    
    /**
      * The number of elements used to pack the object into an array.
      */
    @JSImport("cesium/Source/Core/Ellipsoid", "default.packedLength")
    @js.native
    def packedLength: Double = js.native
    inline def packedLength_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("packedLength")(x.asInstanceOf[js.Any])
    
    /**
      * Retrieves an instance from a packed array.
      * @param array - The packed array.
      * @param [startingIndex = 0] - The starting index of the element to be unpacked.
      * @param [result] - The object into which to store the result.
      * @returns The modified result parameter or a new Ellipsoid instance if one was not provided.
      */
    inline def unpack(array: js.Array[Double]): Ellipsoid = ^.asInstanceOf[js.Dynamic].applyDynamic("unpack")(array.asInstanceOf[js.Any]).asInstanceOf[Ellipsoid]
    inline def unpack(array: js.Array[Double], startingIndex: Double): Ellipsoid = (^.asInstanceOf[js.Dynamic].applyDynamic("unpack")(array.asInstanceOf[js.Any], startingIndex.asInstanceOf[js.Any])).asInstanceOf[Ellipsoid]
    inline def unpack(array: js.Array[Double], startingIndex: Double, result: Ellipsoid): Ellipsoid = (^.asInstanceOf[js.Dynamic].applyDynamic("unpack")(array.asInstanceOf[js.Any], startingIndex.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Ellipsoid]
    inline def unpack(array: js.Array[Double], startingIndex: Unit, result: Ellipsoid): Ellipsoid = (^.asInstanceOf[js.Dynamic].applyDynamic("unpack")(array.asInstanceOf[js.Any], startingIndex.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Ellipsoid]
  }
}
