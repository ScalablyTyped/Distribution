package typings.cesium.mod

import typings.cesium.anon.MaximumHeight
import typings.cesium.anon.MaximumHeights
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cesium", "WallGeometry")
@js.native
open class WallGeometry protected () extends StObject {
  def this(options: MaximumHeights) = this()
  
  /**
    * The number of elements used to pack the object into an array.
    */
  var packedLength: Double = js.native
}
/* static members */
object WallGeometry {
  
  @JSImport("cesium", "WallGeometry")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Computes the geometric representation of a wall, including its vertices, indices, and a bounding sphere.
    * @param wallGeometry - A description of the wall.
    * @returns The computed vertices and indices.
    */
  inline def createGeometry(wallGeometry: WallGeometry): js.UndefOr[Geometry] = ^.asInstanceOf[js.Dynamic].applyDynamic("createGeometry")(wallGeometry.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[Geometry]]
  
  /**
    * A description of a wall, which is similar to a KML line string. A wall is defined by a series of points,
    * which extrude down to the ground. Optionally, they can extrude downwards to a specified height.
    * @example
    * // create a wall that spans from 10000 meters to 20000 meters
    * const wall = Cesium.WallGeometry.fromConstantHeights({
    *   positions : Cesium.Cartesian3.fromDegreesArray([
    *     19.0, 47.0,
    *     19.0, 48.0,
    *     20.0, 48.0,
    *     20.0, 47.0,
    *     19.0, 47.0,
    *   ]),
    *   minimumHeight : 20000.0,
    *   maximumHeight : 10000.0
    * });
    * const geometry = Cesium.WallGeometry.createGeometry(wall);
    * @param options - Object with the following properties:
    * @param options.positions - An array of Cartesian objects, which are the points of the wall.
    * @param [options.maximumHeight] - A constant that defines the maximum height of the
    *        wall at <code>positions</code>. If undefined, the height of each position in used.
    * @param [options.minimumHeight] - A constant that defines the minimum height of the
    *        wall at <code>positions</code>. If undefined, the height at each position is 0.0.
    * @param [options.ellipsoid = Ellipsoid.WGS84] - The ellipsoid for coordinate manipulation
    * @param [options.vertexFormat = VertexFormat.DEFAULT] - The vertex attributes to be computed.
    */
  inline def fromConstantHeights(options: MaximumHeight): WallGeometry = ^.asInstanceOf[js.Dynamic].applyDynamic("fromConstantHeights")(options.asInstanceOf[js.Any]).asInstanceOf[WallGeometry]
  
  /**
    * Stores the provided instance into the provided array.
    * @param value - The value to pack.
    * @param array - The array to pack into.
    * @param [startingIndex = 0] - The index into the array at which to start packing the elements.
    * @returns The array that was packed into
    */
  inline def pack(value: WallGeometry, array: js.Array[Double]): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("pack")(value.asInstanceOf[js.Any], array.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  inline def pack(value: WallGeometry, array: js.Array[Double], startingIndex: Double): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("pack")(value.asInstanceOf[js.Any], array.asInstanceOf[js.Any], startingIndex.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  
  /**
    * Retrieves an instance from a packed array.
    * @param array - The packed array.
    * @param [startingIndex = 0] - The starting index of the element to be unpacked.
    * @param [result] - The object into which to store the result.
    * @returns The modified result parameter or a new WallGeometry instance if one was not provided.
    */
  inline def unpack(array: js.Array[Double]): WallGeometry = ^.asInstanceOf[js.Dynamic].applyDynamic("unpack")(array.asInstanceOf[js.Any]).asInstanceOf[WallGeometry]
  inline def unpack(array: js.Array[Double], startingIndex: Double): WallGeometry = (^.asInstanceOf[js.Dynamic].applyDynamic("unpack")(array.asInstanceOf[js.Any], startingIndex.asInstanceOf[js.Any])).asInstanceOf[WallGeometry]
  inline def unpack(array: js.Array[Double], startingIndex: Double, result: WallGeometry): WallGeometry = (^.asInstanceOf[js.Dynamic].applyDynamic("unpack")(array.asInstanceOf[js.Any], startingIndex.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[WallGeometry]
  inline def unpack(array: js.Array[Double], startingIndex: Unit, result: WallGeometry): WallGeometry = (^.asInstanceOf[js.Dynamic].applyDynamic("unpack")(array.asInstanceOf[js.Any], startingIndex.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[WallGeometry]
}
