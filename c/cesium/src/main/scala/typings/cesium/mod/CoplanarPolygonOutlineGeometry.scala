package typings.cesium.mod

import typings.cesium.anon.PolygonHierarchyPolygonHierarchy
import typings.cesium.anon.PositionsArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cesium", "CoplanarPolygonOutlineGeometry")
@js.native
open class CoplanarPolygonOutlineGeometry protected () extends StObject {
  def this(options: PolygonHierarchyPolygonHierarchy) = this()
  
  /**
    * The number of elements used to pack the object into an array.
    */
  var packedLength: Double = js.native
}
/* static members */
object CoplanarPolygonOutlineGeometry {
  
  @JSImport("cesium", "CoplanarPolygonOutlineGeometry")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Computes the geometric representation of an arbitrary coplanar polygon, including its vertices, indices, and a bounding sphere.
    * @param polygonGeometry - A description of the polygon.
    * @returns The computed vertices and indices.
    */
  inline def createGeometry(polygonGeometry: CoplanarPolygonOutlineGeometry): js.UndefOr[Geometry] = ^.asInstanceOf[js.Dynamic].applyDynamic("createGeometry")(polygonGeometry.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[Geometry]]
  
  /**
    * A description of a coplanar polygon outline from an array of positions.
    * @param options - Object with the following properties:
    * @param options.positions - An array of positions that defined the corner points of the polygon.
    */
  inline def fromPositions(options: PositionsArray): CoplanarPolygonOutlineGeometry = ^.asInstanceOf[js.Dynamic].applyDynamic("fromPositions")(options.asInstanceOf[js.Any]).asInstanceOf[CoplanarPolygonOutlineGeometry]
  
  /**
    * Stores the provided instance into the provided array.
    * @param value - The value to pack.
    * @param array - The array to pack into.
    * @param [startingIndex = 0] - The index into the array at which to start packing the elements.
    * @returns The array that was packed into
    */
  inline def pack(value: CoplanarPolygonOutlineGeometry, array: js.Array[Double]): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("pack")(value.asInstanceOf[js.Any], array.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  inline def pack(value: CoplanarPolygonOutlineGeometry, array: js.Array[Double], startingIndex: Double): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("pack")(value.asInstanceOf[js.Any], array.asInstanceOf[js.Any], startingIndex.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  
  /**
    * Retrieves an instance from a packed array.
    * @param array - The packed array.
    * @param [startingIndex = 0] - The starting index of the element to be unpacked.
    * @param [result] - The object into which to store the result.
    * @returns The modified result parameter or a new CoplanarPolygonOutlineGeometry instance if one was not provided.
    */
  inline def unpack(array: js.Array[Double]): CoplanarPolygonOutlineGeometry = ^.asInstanceOf[js.Dynamic].applyDynamic("unpack")(array.asInstanceOf[js.Any]).asInstanceOf[CoplanarPolygonOutlineGeometry]
  inline def unpack(array: js.Array[Double], startingIndex: Double): CoplanarPolygonOutlineGeometry = (^.asInstanceOf[js.Dynamic].applyDynamic("unpack")(array.asInstanceOf[js.Any], startingIndex.asInstanceOf[js.Any])).asInstanceOf[CoplanarPolygonOutlineGeometry]
  inline def unpack(array: js.Array[Double], startingIndex: Double, result: CoplanarPolygonOutlineGeometry): CoplanarPolygonOutlineGeometry = (^.asInstanceOf[js.Dynamic].applyDynamic("unpack")(array.asInstanceOf[js.Any], startingIndex.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[CoplanarPolygonOutlineGeometry]
  inline def unpack(array: js.Array[Double], startingIndex: Unit, result: CoplanarPolygonOutlineGeometry): CoplanarPolygonOutlineGeometry = (^.asInstanceOf[js.Dynamic].applyDynamic("unpack")(array.asInstanceOf[js.Any], startingIndex.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[CoplanarPolygonOutlineGeometry]
}
