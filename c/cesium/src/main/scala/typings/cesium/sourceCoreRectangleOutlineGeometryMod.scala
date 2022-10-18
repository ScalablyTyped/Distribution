package typings.cesium

import typings.cesium.anon.ExtrudedHeightGranularity
import typings.cesium.mod.Geometry
import typings.cesium.mod.RectangleOutlineGeometry
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sourceCoreRectangleOutlineGeometryMod {
  
  @JSImport("cesium/Source/Core/RectangleOutlineGeometry", JSImport.Default)
  @js.native
  open class default protected () extends RectangleOutlineGeometry {
    def this(options: ExtrudedHeightGranularity) = this()
  }
  /* static members */
  object default {
    
    @JSImport("cesium/Source/Core/RectangleOutlineGeometry", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Computes the geometric representation of an outline of a rectangle, including its vertices, indices, and a bounding sphere.
      * @param rectangleGeometry - A description of the rectangle outline.
      * @returns The computed vertices and indices.
      */
    inline def createGeometry(rectangleGeometry: RectangleOutlineGeometry): js.UndefOr[Geometry] = ^.asInstanceOf[js.Dynamic].applyDynamic("createGeometry")(rectangleGeometry.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[Geometry]]
    
    /**
      * Stores the provided instance into the provided array.
      * @param value - The value to pack.
      * @param array - The array to pack into.
      * @param [startingIndex = 0] - The index into the array at which to start packing the elements.
      * @returns The array that was packed into
      */
    inline def pack(value: RectangleOutlineGeometry, array: js.Array[Double]): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("pack")(value.asInstanceOf[js.Any], array.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
    inline def pack(value: RectangleOutlineGeometry, array: js.Array[Double], startingIndex: Double): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("pack")(value.asInstanceOf[js.Any], array.asInstanceOf[js.Any], startingIndex.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
    
    /**
      * The number of elements used to pack the object into an array.
      */
    @JSImport("cesium/Source/Core/RectangleOutlineGeometry", "default.packedLength")
    @js.native
    def packedLength: Double = js.native
    inline def packedLength_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("packedLength")(x.asInstanceOf[js.Any])
    
    /**
      * Retrieves an instance from a packed array.
      * @param array - The packed array.
      * @param [startingIndex = 0] - The starting index of the element to be unpacked.
      * @param [result] - The object into which to store the result.
      * @returns The modified result parameter or a new Quaternion instance if one was not provided.
      */
    inline def unpack(array: js.Array[Double]): RectangleOutlineGeometry = ^.asInstanceOf[js.Dynamic].applyDynamic("unpack")(array.asInstanceOf[js.Any]).asInstanceOf[RectangleOutlineGeometry]
    inline def unpack(array: js.Array[Double], startingIndex: Double): RectangleOutlineGeometry = (^.asInstanceOf[js.Dynamic].applyDynamic("unpack")(array.asInstanceOf[js.Any], startingIndex.asInstanceOf[js.Any])).asInstanceOf[RectangleOutlineGeometry]
    inline def unpack(array: js.Array[Double], startingIndex: Double, result: RectangleOutlineGeometry): RectangleOutlineGeometry = (^.asInstanceOf[js.Dynamic].applyDynamic("unpack")(array.asInstanceOf[js.Any], startingIndex.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[RectangleOutlineGeometry]
    inline def unpack(array: js.Array[Double], startingIndex: Unit, result: RectangleOutlineGeometry): RectangleOutlineGeometry = (^.asInstanceOf[js.Dynamic].applyDynamic("unpack")(array.asInstanceOf[js.Any], startingIndex.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[RectangleOutlineGeometry]
  }
}
