package typings.cesium

import typings.cesium.anon.SlicePartitions
import typings.cesium.mod.Geometry
import typings.cesium.mod.SphereOutlineGeometry
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sphereOutlineGeometryMod {
  
  @JSImport("cesium/Source/Core/SphereOutlineGeometry", JSImport.Default)
  @js.native
  open class default () extends SphereOutlineGeometry {
    def this(options: SlicePartitions) = this()
  }
  /* static members */
  object default {
    
    @JSImport("cesium/Source/Core/SphereOutlineGeometry", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Computes the geometric representation of an outline of a sphere, including its vertices, indices, and a bounding sphere.
      * @param sphereGeometry - A description of the sphere outline.
      * @returns The computed vertices and indices.
      */
    inline def createGeometry(sphereGeometry: SphereOutlineGeometry): js.UndefOr[Geometry] = ^.asInstanceOf[js.Dynamic].applyDynamic("createGeometry")(sphereGeometry.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[Geometry]]
    
    /**
      * Stores the provided instance into the provided array.
      * @param value - The value to pack.
      * @param array - The array to pack into.
      * @param [startingIndex = 0] - The index into the array at which to start packing the elements.
      * @returns The array that was packed into
      */
    inline def pack(value: SphereOutlineGeometry, array: js.Array[Double]): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("pack")(value.asInstanceOf[js.Any], array.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
    inline def pack(value: SphereOutlineGeometry, array: js.Array[Double], startingIndex: Double): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("pack")(value.asInstanceOf[js.Any], array.asInstanceOf[js.Any], startingIndex.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
    
    /**
      * The number of elements used to pack the object into an array.
      */
    @JSImport("cesium/Source/Core/SphereOutlineGeometry", "default.packedLength")
    @js.native
    def packedLength: Double = js.native
    inline def packedLength_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("packedLength")(x.asInstanceOf[js.Any])
    
    /**
      * Retrieves an instance from a packed array.
      * @param array - The packed array.
      * @param [startingIndex = 0] - The starting index of the element to be unpacked.
      * @param [result] - The object into which to store the result.
      * @returns The modified result parameter or a new SphereOutlineGeometry instance if one was not provided.
      */
    inline def unpack(array: js.Array[Double]): SphereOutlineGeometry = ^.asInstanceOf[js.Dynamic].applyDynamic("unpack")(array.asInstanceOf[js.Any]).asInstanceOf[SphereOutlineGeometry]
    inline def unpack(array: js.Array[Double], startingIndex: Double): SphereOutlineGeometry = (^.asInstanceOf[js.Dynamic].applyDynamic("unpack")(array.asInstanceOf[js.Any], startingIndex.asInstanceOf[js.Any])).asInstanceOf[SphereOutlineGeometry]
    inline def unpack(array: js.Array[Double], startingIndex: Double, result: SphereOutlineGeometry): SphereOutlineGeometry = (^.asInstanceOf[js.Dynamic].applyDynamic("unpack")(array.asInstanceOf[js.Any], startingIndex.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[SphereOutlineGeometry]
    inline def unpack(array: js.Array[Double], startingIndex: Unit, result: SphereOutlineGeometry): SphereOutlineGeometry = (^.asInstanceOf[js.Dynamic].applyDynamic("unpack")(array.asInstanceOf[js.Any], startingIndex.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[SphereOutlineGeometry]
  }
}
