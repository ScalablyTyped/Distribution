package typings.cesiumEngine.mod

import typings.cesiumEngine.anon.ArcTypeEllipsoid
import typings.cesiumEngine.anon.CloseBottom
import typings.cesiumEngine.anon.CloseTop
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@cesium/engine", "PolygonGeometry")
@js.native
open class PolygonGeometry protected () extends StObject {
  def this(options: CloseBottom) = this()
  
  /**
    * The number of elements used to pack the object into an array.
    */
  var packedLength: Double = js.native
}
/* static members */
object PolygonGeometry {
  
  @JSImport("@cesium/engine", "PolygonGeometry")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Returns the bounding rectangle given the provided options
    * @param options - Object with the following properties:
    * @param options.polygonHierarchy - A polygon hierarchy that can include holes.
    * @param [options.granularity = Math.RADIANS_PER_DEGREE] - The distance, in radians, between each latitude and longitude. Determines the number of positions sampled.
    * @param [options.arcType = ArcType.GEODESIC] - The type of line the polygon edges must follow. Valid options are {@link ArcType.GEODESIC} and {@link ArcType.RHUMB}.
    * @param [options.ellipsoid = Ellipsoid.WGS84] - The ellipsoid to be used as a reference.
    * @param [result] - An object in which to store the result.
    * @returns The result rectangle
    */
  inline def computeRectangle(options: ArcTypeEllipsoid): Rectangle = ^.asInstanceOf[js.Dynamic].applyDynamic("computeRectangle")(options.asInstanceOf[js.Any]).asInstanceOf[Rectangle]
  inline def computeRectangle(options: ArcTypeEllipsoid, result: Rectangle): Rectangle = (^.asInstanceOf[js.Dynamic].applyDynamic("computeRectangle")(options.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Rectangle]
  
  /**
    * Computes the geometric representation of a polygon, including its vertices, indices, and a bounding sphere.
    * @param polygonGeometry - A description of the polygon.
    * @returns The computed vertices and indices.
    */
  inline def createGeometry(polygonGeometry: PolygonGeometry): js.UndefOr[Geometry] = ^.asInstanceOf[js.Dynamic].applyDynamic("createGeometry")(polygonGeometry.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[Geometry]]
  
  /**
    * A description of a polygon from an array of positions. Polygon geometry can be rendered with both {@link Primitive} and {@link GroundPrimitive}.
    * @example
    * // create a polygon from points
    * const polygon = Cesium.PolygonGeometry.fromPositions({
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
    * @param [options.height = 0.0] - The height of the polygon.
    * @param [options.extrudedHeight] - The height of the polygon extrusion.
    * @param [options.vertexFormat = VertexFormat.DEFAULT] - The vertex attributes to be computed.
    * @param [options.stRotation = 0.0] - The rotation of the texture coordinates, in radians. A positive rotation is counter-clockwise.
    * @param [options.ellipsoid = Ellipsoid.WGS84] - The ellipsoid to be used as a reference.
    * @param [options.granularity = Math.RADIANS_PER_DEGREE] - The distance, in radians, between each latitude and longitude. Determines the number of positions in the buffer.
    * @param [options.perPositionHeight = false] - Use the height of options.positions for each position instead of using options.height to determine the height.
    * @param [options.closeTop = true] - When false, leaves off the top of an extruded polygon open.
    * @param [options.closeBottom = true] - When false, leaves off the bottom of an extruded polygon open.
    * @param [options.arcType = ArcType.GEODESIC] - The type of line the polygon edges must follow. Valid options are {@link ArcType.GEODESIC} and {@link ArcType.RHUMB}.
    * @param [options.textureCoordinates] - Texture coordinates as a {@link PolygonHierarchy} of {@link Cartesian2} points. Has no effect for ground primitives.
    */
  inline def fromPositions(options: CloseTop): PolygonGeometry = ^.asInstanceOf[js.Dynamic].applyDynamic("fromPositions")(options.asInstanceOf[js.Any]).asInstanceOf[PolygonGeometry]
  
  /**
    * Stores the provided instance into the provided array.
    * @param value - The value to pack.
    * @param array - The array to pack into.
    * @param [startingIndex = 0] - The index into the array at which to start packing the elements.
    * @returns The array that was packed into
    */
  inline def pack(value: PolygonGeometry, array: js.Array[Double]): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("pack")(value.asInstanceOf[js.Any], array.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  inline def pack(value: PolygonGeometry, array: js.Array[Double], startingIndex: Double): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("pack")(value.asInstanceOf[js.Any], array.asInstanceOf[js.Any], startingIndex.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  
  /**
    * Retrieves an instance from a packed array.
    * @param array - The packed array.
    * @param [startingIndex = 0] - The starting index of the element to be unpacked.
    * @param [result] - The object into which to store the result.
    */
  inline def unpack(array: js.Array[Double]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("unpack")(array.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def unpack(array: js.Array[Double], startingIndex: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("unpack")(array.asInstanceOf[js.Any], startingIndex.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def unpack(array: js.Array[Double], startingIndex: Double, result: PolygonGeometry): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("unpack")(array.asInstanceOf[js.Any], startingIndex.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def unpack(array: js.Array[Double], startingIndex: Unit, result: PolygonGeometry): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("unpack")(array.asInstanceOf[js.Any], startingIndex.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
