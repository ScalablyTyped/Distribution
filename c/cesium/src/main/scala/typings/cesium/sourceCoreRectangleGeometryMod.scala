package typings.cesium

import typings.cesium.anon.EllipsoidGranularity
import typings.cesium.anon.Rectangle
import typings.cesium.mod.Geometry
import typings.cesium.mod.RectangleGeometry
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sourceCoreRectangleGeometryMod {
  
  @JSImport("cesium/Source/Core/RectangleGeometry", JSImport.Default)
  @js.native
  open class default protected () extends RectangleGeometry {
    def this(options: Rectangle) = this()
  }
  /* static members */
  object default {
    
    @JSImport("cesium/Source/Core/RectangleGeometry", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Computes the bounding rectangle based on the provided options
      * @param options - Object with the following properties:
      * @param options.rectangle - A cartographic rectangle with north, south, east and west properties in radians.
      * @param [options.ellipsoid = Ellipsoid.WGS84] - The ellipsoid on which the rectangle lies.
      * @param [options.granularity = Math.RADIANS_PER_DEGREE] - The distance, in radians, between each latitude and longitude. Determines the number of positions in the buffer.
      * @param [options.rotation = 0.0] - The rotation of the rectangle, in radians. A positive rotation is counter-clockwise.
      * @param [result] - An object in which to store the result.
      * @returns The result rectangle
      */
    inline def computeRectangle(options: EllipsoidGranularity): typings.cesium.mod.Rectangle = ^.asInstanceOf[js.Dynamic].applyDynamic("computeRectangle")(options.asInstanceOf[js.Any]).asInstanceOf[typings.cesium.mod.Rectangle]
    inline def computeRectangle(options: EllipsoidGranularity, result: typings.cesium.mod.Rectangle): typings.cesium.mod.Rectangle = (^.asInstanceOf[js.Dynamic].applyDynamic("computeRectangle")(options.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[typings.cesium.mod.Rectangle]
    
    /**
      * Computes the geometric representation of a rectangle, including its vertices, indices, and a bounding sphere.
      * @param rectangleGeometry - A description of the rectangle.
      * @returns The computed vertices and indices.
      */
    inline def createGeometry(rectangleGeometry: RectangleGeometry): js.UndefOr[Geometry] = ^.asInstanceOf[js.Dynamic].applyDynamic("createGeometry")(rectangleGeometry.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[Geometry]]
    
    /**
      * Stores the provided instance into the provided array.
      * @param value - The value to pack.
      * @param array - The array to pack into.
      * @param [startingIndex = 0] - The index into the array at which to start packing the elements.
      * @returns The array that was packed into
      */
    inline def pack(value: RectangleGeometry, array: js.Array[Double]): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("pack")(value.asInstanceOf[js.Any], array.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
    inline def pack(value: RectangleGeometry, array: js.Array[Double], startingIndex: Double): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("pack")(value.asInstanceOf[js.Any], array.asInstanceOf[js.Any], startingIndex.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
    
    /**
      * The number of elements used to pack the object into an array.
      */
    @JSImport("cesium/Source/Core/RectangleGeometry", "default.packedLength")
    @js.native
    def packedLength: Double = js.native
    inline def packedLength_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("packedLength")(x.asInstanceOf[js.Any])
    
    /**
      * Retrieves an instance from a packed array.
      * @param array - The packed array.
      * @param [startingIndex = 0] - The starting index of the element to be unpacked.
      * @param [result] - The object into which to store the result.
      * @returns The modified result parameter or a new RectangleGeometry instance if one was not provided.
      */
    inline def unpack(array: js.Array[Double]): RectangleGeometry = ^.asInstanceOf[js.Dynamic].applyDynamic("unpack")(array.asInstanceOf[js.Any]).asInstanceOf[RectangleGeometry]
    inline def unpack(array: js.Array[Double], startingIndex: Double): RectangleGeometry = (^.asInstanceOf[js.Dynamic].applyDynamic("unpack")(array.asInstanceOf[js.Any], startingIndex.asInstanceOf[js.Any])).asInstanceOf[RectangleGeometry]
    inline def unpack(array: js.Array[Double], startingIndex: Double, result: RectangleGeometry): RectangleGeometry = (^.asInstanceOf[js.Dynamic].applyDynamic("unpack")(array.asInstanceOf[js.Any], startingIndex.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[RectangleGeometry]
    inline def unpack(array: js.Array[Double], startingIndex: Unit, result: RectangleGeometry): RectangleGeometry = (^.asInstanceOf[js.Dynamic].applyDynamic("unpack")(array.asInstanceOf[js.Any], startingIndex.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[RectangleGeometry]
  }
}
