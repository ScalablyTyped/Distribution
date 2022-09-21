package typings.cesium

import typings.cesium.anon.Colors
import typings.cesium.mod.Geometry
import typings.cesium.mod.PolylineGeometry
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object polylineGeometryMod {
  
  @JSImport("cesium/Source/Core/PolylineGeometry", JSImport.Default)
  @js.native
  open class default protected () extends PolylineGeometry {
    def this(options: Colors) = this()
  }
  /* static members */
  object default {
    
    @JSImport("cesium/Source/Core/PolylineGeometry", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Computes the geometric representation of a polyline, including its vertices, indices, and a bounding sphere.
      * @param polylineGeometry - A description of the polyline.
      * @returns The computed vertices and indices.
      */
    inline def createGeometry(polylineGeometry: PolylineGeometry): js.UndefOr[Geometry] = ^.asInstanceOf[js.Dynamic].applyDynamic("createGeometry")(polylineGeometry.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[Geometry]]
    
    /**
      * Stores the provided instance into the provided array.
      * @param value - The value to pack.
      * @param array - The array to pack into.
      * @param [startingIndex = 0] - The index into the array at which to start packing the elements.
      * @returns The array that was packed into
      */
    inline def pack(value: PolylineGeometry, array: js.Array[Double]): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("pack")(value.asInstanceOf[js.Any], array.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
    inline def pack(value: PolylineGeometry, array: js.Array[Double], startingIndex: Double): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("pack")(value.asInstanceOf[js.Any], array.asInstanceOf[js.Any], startingIndex.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
    
    /**
      * Retrieves an instance from a packed array.
      * @param array - The packed array.
      * @param [startingIndex = 0] - The starting index of the element to be unpacked.
      * @param [result] - The object into which to store the result.
      * @returns The modified result parameter or a new PolylineGeometry instance if one was not provided.
      */
    inline def unpack(array: js.Array[Double]): PolylineGeometry = ^.asInstanceOf[js.Dynamic].applyDynamic("unpack")(array.asInstanceOf[js.Any]).asInstanceOf[PolylineGeometry]
    inline def unpack(array: js.Array[Double], startingIndex: Double): PolylineGeometry = (^.asInstanceOf[js.Dynamic].applyDynamic("unpack")(array.asInstanceOf[js.Any], startingIndex.asInstanceOf[js.Any])).asInstanceOf[PolylineGeometry]
    inline def unpack(array: js.Array[Double], startingIndex: Double, result: PolylineGeometry): PolylineGeometry = (^.asInstanceOf[js.Dynamic].applyDynamic("unpack")(array.asInstanceOf[js.Any], startingIndex.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[PolylineGeometry]
    inline def unpack(array: js.Array[Double], startingIndex: Unit, result: PolylineGeometry): PolylineGeometry = (^.asInstanceOf[js.Dynamic].applyDynamic("unpack")(array.asInstanceOf[js.Any], startingIndex.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[PolylineGeometry]
  }
}
