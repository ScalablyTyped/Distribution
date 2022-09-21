package typings.cesium

import typings.cesium.anon.PolygonHierarchy
import typings.cesium.anon.Positions
import typings.cesium.mod.CoplanarPolygonGeometry
import typings.cesium.mod.Geometry
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object coplanarPolygonGeometryMod {
  
  @JSImport("cesium/Source/Core/CoplanarPolygonGeometry", JSImport.Default)
  @js.native
  open class default protected () extends CoplanarPolygonGeometry {
    def this(options: PolygonHierarchy) = this()
  }
  /* static members */
  object default {
    
    @JSImport("cesium/Source/Core/CoplanarPolygonGeometry", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Computes the geometric representation of an arbitrary coplanar polygon, including its vertices, indices, and a bounding sphere.
      * @param polygonGeometry - A description of the polygon.
      * @returns The computed vertices and indices.
      */
    inline def createGeometry(polygonGeometry: CoplanarPolygonGeometry): js.UndefOr[Geometry] = ^.asInstanceOf[js.Dynamic].applyDynamic("createGeometry")(polygonGeometry.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[Geometry]]
    
    /**
      * A description of a coplanar polygon from an array of positions.
      * @example
      * // create a polygon from points
      * const polygon = Cesium.CoplanarPolygonGeometry.fromPositions({
      *   positions : Cesium.Cartesian3.fromDegreesArray([
      *     -72.0, 40.0,
      *     -70.0, 35.0,
      *     -75.0, 30.0,
      *     -70.0, 30.0,
      *     -68.0, 40.0
      *   ])
      * });
      * const geometry = Cesium.PolygonGeometry.createGeometry(polygon);
      * @param options - Object with the following properties:
      * @param options.positions - An array of positions that defined the corner points of the polygon.
      * @param [options.vertexFormat = VertexFormat.DEFAULT] - The vertex attributes to be computed.
      * @param [options.stRotation = 0.0] - The rotation of the texture coordinates, in radians. A positive rotation is counter-clockwise.
      * @param [options.ellipsoid = Ellipsoid.WGS84] - The ellipsoid to be used as a reference.
      * @param [options.textureCoordinates] - Texture coordinates as a {@link PolygonHierarchy} of {@link Cartesian2} points.
      */
    inline def fromPositions(options: Positions): CoplanarPolygonGeometry = ^.asInstanceOf[js.Dynamic].applyDynamic("fromPositions")(options.asInstanceOf[js.Any]).asInstanceOf[CoplanarPolygonGeometry]
    
    /**
      * Stores the provided instance into the provided array.
      * @param value - The value to pack.
      * @param array - The array to pack into.
      * @param [startingIndex = 0] - The index into the array at which to start packing the elements.
      * @returns The array that was packed into
      */
    inline def pack(value: CoplanarPolygonGeometry, array: js.Array[Double]): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("pack")(value.asInstanceOf[js.Any], array.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
    inline def pack(value: CoplanarPolygonGeometry, array: js.Array[Double], startingIndex: Double): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("pack")(value.asInstanceOf[js.Any], array.asInstanceOf[js.Any], startingIndex.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
    
    /**
      * Retrieves an instance from a packed array.
      * @param array - The packed array.
      * @param [startingIndex = 0] - The starting index of the element to be unpacked.
      * @param [result] - The object into which to store the result.
      * @returns The modified result parameter or a new CoplanarPolygonGeometry instance if one was not provided.
      */
    inline def unpack(array: js.Array[Double]): CoplanarPolygonGeometry = ^.asInstanceOf[js.Dynamic].applyDynamic("unpack")(array.asInstanceOf[js.Any]).asInstanceOf[CoplanarPolygonGeometry]
    inline def unpack(array: js.Array[Double], startingIndex: Double): CoplanarPolygonGeometry = (^.asInstanceOf[js.Dynamic].applyDynamic("unpack")(array.asInstanceOf[js.Any], startingIndex.asInstanceOf[js.Any])).asInstanceOf[CoplanarPolygonGeometry]
    inline def unpack(array: js.Array[Double], startingIndex: Double, result: CoplanarPolygonGeometry): CoplanarPolygonGeometry = (^.asInstanceOf[js.Dynamic].applyDynamic("unpack")(array.asInstanceOf[js.Any], startingIndex.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[CoplanarPolygonGeometry]
    inline def unpack(array: js.Array[Double], startingIndex: Unit, result: CoplanarPolygonGeometry): CoplanarPolygonGeometry = (^.asInstanceOf[js.Dynamic].applyDynamic("unpack")(array.asInstanceOf[js.Any], startingIndex.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[CoplanarPolygonGeometry]
  }
}
