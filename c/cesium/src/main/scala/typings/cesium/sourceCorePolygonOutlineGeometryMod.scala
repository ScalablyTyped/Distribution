package typings.cesium

import typings.cesium.anon.EllipsoidExtrudedHeight
import typings.cesium.anon.PerPositionHeight
import typings.cesium.mod.Geometry
import typings.cesium.mod.PolygonOutlineGeometry
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sourceCorePolygonOutlineGeometryMod {
  
  @JSImport("cesium/Source/Core/PolygonOutlineGeometry", JSImport.Default)
  @js.native
  open class default protected () extends PolygonOutlineGeometry {
    def this(options: PerPositionHeight) = this()
  }
  /* static members */
  object default {
    
    @JSImport("cesium/Source/Core/PolygonOutlineGeometry", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Computes the geometric representation of a polygon outline, including its vertices, indices, and a bounding sphere.
      * @param polygonGeometry - A description of the polygon outline.
      * @returns The computed vertices and indices.
      */
    inline def createGeometry(polygonGeometry: PolygonOutlineGeometry): js.UndefOr[Geometry] = ^.asInstanceOf[js.Dynamic].applyDynamic("createGeometry")(polygonGeometry.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[Geometry]]
    
    /**
      * A description of a polygon outline from an array of positions.
      * @example
      * // create a polygon from points
      * const polygon = Cesium.PolygonOutlineGeometry.fromPositions({
      *   positions : Cesium.Cartesian3.fromDegreesArray([
      *     -72.0, 40.0,
      *     -70.0, 35.0,
      *     -75.0, 30.0,
      *     -70.0, 30.0,
      *     -68.0, 40.0
      *   ])
      * });
      * const geometry = Cesium.PolygonOutlineGeometry.createGeometry(polygon);
      * @param options - Object with the following properties:
      * @param options.positions - An array of positions that defined the corner points of the polygon.
      * @param [options.height = 0.0] - The height of the polygon.
      * @param [options.extrudedHeight] - The height of the polygon extrusion.
      * @param [options.ellipsoid = Ellipsoid.WGS84] - The ellipsoid to be used as a reference.
      * @param [options.granularity = Math.RADIANS_PER_DEGREE] - The distance, in radians, between each latitude and longitude. Determines the number of positions in the buffer.
      * @param [options.perPositionHeight = false] - Use the height of options.positions for each position instead of using options.height to determine the height.
      * @param [options.arcType = ArcType.GEODESIC] - The type of path the outline must follow. Valid options are {@link LinkType.GEODESIC} and {@link ArcType.RHUMB}.
      */
    inline def fromPositions(options: EllipsoidExtrudedHeight): PolygonOutlineGeometry = ^.asInstanceOf[js.Dynamic].applyDynamic("fromPositions")(options.asInstanceOf[js.Any]).asInstanceOf[PolygonOutlineGeometry]
    
    /**
      * Stores the provided instance into the provided array.
      * @param value - The value to pack.
      * @param array - The array to pack into.
      * @param [startingIndex = 0] - The index into the array at which to start packing the elements.
      * @returns The array that was packed into
      */
    inline def pack(value: PolygonOutlineGeometry, array: js.Array[Double]): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("pack")(value.asInstanceOf[js.Any], array.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
    inline def pack(value: PolygonOutlineGeometry, array: js.Array[Double], startingIndex: Double): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("pack")(value.asInstanceOf[js.Any], array.asInstanceOf[js.Any], startingIndex.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
    
    /**
      * Retrieves an instance from a packed array.
      * @param array - The packed array.
      * @param [startingIndex = 0] - The starting index of the element to be unpacked.
      * @param [result] - The object into which to store the result.
      * @returns The modified result parameter or a new PolygonOutlineGeometry instance if one was not provided.
      */
    inline def unpack(array: js.Array[Double]): PolygonOutlineGeometry = ^.asInstanceOf[js.Dynamic].applyDynamic("unpack")(array.asInstanceOf[js.Any]).asInstanceOf[PolygonOutlineGeometry]
    inline def unpack(array: js.Array[Double], startingIndex: Double): PolygonOutlineGeometry = (^.asInstanceOf[js.Dynamic].applyDynamic("unpack")(array.asInstanceOf[js.Any], startingIndex.asInstanceOf[js.Any])).asInstanceOf[PolygonOutlineGeometry]
    inline def unpack(array: js.Array[Double], startingIndex: Double, result: PolygonOutlineGeometry): PolygonOutlineGeometry = (^.asInstanceOf[js.Dynamic].applyDynamic("unpack")(array.asInstanceOf[js.Any], startingIndex.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[PolygonOutlineGeometry]
    inline def unpack(array: js.Array[Double], startingIndex: Unit, result: PolygonOutlineGeometry): PolygonOutlineGeometry = (^.asInstanceOf[js.Dynamic].applyDynamic("unpack")(array.asInstanceOf[js.Any], startingIndex.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[PolygonOutlineGeometry]
  }
}
