package typings.cesium

import typings.cesium.anon.Granularity
import typings.cesium.mod.CorridorOutlineGeometry
import typings.cesium.mod.Geometry
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sourceCoreCorridorOutlineGeometryMod {
  
  @JSImport("cesium/Source/Core/CorridorOutlineGeometry", JSImport.Default)
  @js.native
  open class default protected () extends CorridorOutlineGeometry {
    def this(options: Granularity) = this()
  }
  /* static members */
  object default {
    
    @JSImport("cesium/Source/Core/CorridorOutlineGeometry", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Computes the geometric representation of a corridor, including its vertices, indices, and a bounding sphere.
      * @param corridorOutlineGeometry - A description of the corridor.
      * @returns The computed vertices and indices.
      */
    inline def createGeometry(corridorOutlineGeometry: CorridorOutlineGeometry): js.UndefOr[Geometry] = ^.asInstanceOf[js.Dynamic].applyDynamic("createGeometry")(corridorOutlineGeometry.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[Geometry]]
    
    /**
      * Stores the provided instance into the provided array.
      * @param value - The value to pack.
      * @param array - The array to pack into.
      * @param [startingIndex = 0] - The index into the array at which to start packing the elements.
      * @returns The array that was packed into
      */
    inline def pack(value: CorridorOutlineGeometry, array: js.Array[Double]): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("pack")(value.asInstanceOf[js.Any], array.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
    inline def pack(value: CorridorOutlineGeometry, array: js.Array[Double], startingIndex: Double): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("pack")(value.asInstanceOf[js.Any], array.asInstanceOf[js.Any], startingIndex.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
    
    /**
      * Retrieves an instance from a packed array.
      * @param array - The packed array.
      * @param [startingIndex = 0] - The starting index of the element to be unpacked.
      * @param [result] - The object into which to store the result.
      * @returns The modified result parameter or a new CorridorOutlineGeometry instance if one was not provided.
      */
    inline def unpack(array: js.Array[Double]): CorridorOutlineGeometry = ^.asInstanceOf[js.Dynamic].applyDynamic("unpack")(array.asInstanceOf[js.Any]).asInstanceOf[CorridorOutlineGeometry]
    inline def unpack(array: js.Array[Double], startingIndex: Double): CorridorOutlineGeometry = (^.asInstanceOf[js.Dynamic].applyDynamic("unpack")(array.asInstanceOf[js.Any], startingIndex.asInstanceOf[js.Any])).asInstanceOf[CorridorOutlineGeometry]
    inline def unpack(array: js.Array[Double], startingIndex: Double, result: CorridorOutlineGeometry): CorridorOutlineGeometry = (^.asInstanceOf[js.Dynamic].applyDynamic("unpack")(array.asInstanceOf[js.Any], startingIndex.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[CorridorOutlineGeometry]
    inline def unpack(array: js.Array[Double], startingIndex: Unit, result: CorridorOutlineGeometry): CorridorOutlineGeometry = (^.asInstanceOf[js.Dynamic].applyDynamic("unpack")(array.asInstanceOf[js.Any], startingIndex.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[CorridorOutlineGeometry]
  }
}
