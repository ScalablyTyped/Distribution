package typings.cesium

import typings.cesium.anon.ColorsPerVertex
import typings.cesium.mod.Geometry
import typings.cesium.mod.SimplePolylineGeometry
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object simplePolylineGeometryMod {
  
  @JSImport("cesium/Source/Core/SimplePolylineGeometry", JSImport.Default)
  @js.native
  open class default protected () extends SimplePolylineGeometry {
    def this(options: ColorsPerVertex) = this()
  }
  /* static members */
  object default {
    
    @JSImport("cesium/Source/Core/SimplePolylineGeometry", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Computes the geometric representation of a simple polyline, including its vertices, indices, and a bounding sphere.
      * @param simplePolylineGeometry - A description of the polyline.
      * @returns The computed vertices and indices.
      */
    inline def createGeometry(simplePolylineGeometry: SimplePolylineGeometry): js.UndefOr[Geometry] = ^.asInstanceOf[js.Dynamic].applyDynamic("createGeometry")(simplePolylineGeometry.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[Geometry]]
    
    /**
      * Stores the provided instance into the provided array.
      * @param value - The value to pack.
      * @param array - The array to pack into.
      * @param [startingIndex = 0] - The index into the array at which to start packing the elements.
      * @returns The array that was packed into
      */
    inline def pack(value: SimplePolylineGeometry, array: js.Array[Double]): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("pack")(value.asInstanceOf[js.Any], array.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
    inline def pack(value: SimplePolylineGeometry, array: js.Array[Double], startingIndex: Double): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("pack")(value.asInstanceOf[js.Any], array.asInstanceOf[js.Any], startingIndex.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
    
    /**
      * Retrieves an instance from a packed array.
      * @param array - The packed array.
      * @param [startingIndex = 0] - The starting index of the element to be unpacked.
      * @param [result] - The object into which to store the result.
      * @returns The modified result parameter or a new SimplePolylineGeometry instance if one was not provided.
      */
    inline def unpack(array: js.Array[Double]): SimplePolylineGeometry = ^.asInstanceOf[js.Dynamic].applyDynamic("unpack")(array.asInstanceOf[js.Any]).asInstanceOf[SimplePolylineGeometry]
    inline def unpack(array: js.Array[Double], startingIndex: Double): SimplePolylineGeometry = (^.asInstanceOf[js.Dynamic].applyDynamic("unpack")(array.asInstanceOf[js.Any], startingIndex.asInstanceOf[js.Any])).asInstanceOf[SimplePolylineGeometry]
    inline def unpack(array: js.Array[Double], startingIndex: Double, result: SimplePolylineGeometry): SimplePolylineGeometry = (^.asInstanceOf[js.Dynamic].applyDynamic("unpack")(array.asInstanceOf[js.Any], startingIndex.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[SimplePolylineGeometry]
    inline def unpack(array: js.Array[Double], startingIndex: Unit, result: SimplePolylineGeometry): SimplePolylineGeometry = (^.asInstanceOf[js.Dynamic].applyDynamic("unpack")(array.asInstanceOf[js.Any], startingIndex.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[SimplePolylineGeometry]
  }
}
