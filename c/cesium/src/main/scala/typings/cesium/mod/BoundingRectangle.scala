package typings.cesium.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cesium", "BoundingRectangle")
@js.native
open class BoundingRectangle () extends StObject {
  def this(x: Double) = this()
  def this(x: Double, y: Double) = this()
  def this(x: Unit, y: Double) = this()
  def this(x: Double, y: Double, width: Double) = this()
  def this(x: Double, y: Unit, width: Double) = this()
  def this(x: Unit, y: Double, width: Double) = this()
  def this(x: Unit, y: Unit, width: Double) = this()
  def this(x: Double, y: Double, width: Double, height: Double) = this()
  def this(x: Double, y: Double, width: Unit, height: Double) = this()
  def this(x: Double, y: Unit, width: Double, height: Double) = this()
  def this(x: Double, y: Unit, width: Unit, height: Double) = this()
  def this(x: Unit, y: Double, width: Double, height: Double) = this()
  def this(x: Unit, y: Double, width: Unit, height: Double) = this()
  def this(x: Unit, y: Unit, width: Double, height: Double) = this()
  def this(x: Unit, y: Unit, width: Unit, height: Double) = this()
  
  def clone(result: BoundingRectangle): BoundingRectangle = js.native
  
  /**
    * Compares this BoundingRectangle against the provided BoundingRectangle componentwise and returns
    * <code>true</code> if they are equal, <code>false</code> otherwise.
    * @param [right] - The right hand side BoundingRectangle.
    * @returns <code>true</code> if they are equal, <code>false</code> otherwise.
    */
  def equals(): Boolean = js.native
  def equals(right: BoundingRectangle): Boolean = js.native
  
  /**
    * The height of the rectangle.
    */
  var height: Double = js.native
  
  /**
    * Determines if this rectangle intersects with another.
    * @param right - A rectangle to check for intersection.
    * @returns <code>Intersect.INTERSECTING</code> if the rectangles intersect, <code>Intersect.OUTSIDE</code> otherwise.
    */
  def intersect(right: BoundingRectangle): Intersect = js.native
  
  /**
    * The width of the rectangle.
    */
  var width: Double = js.native
  
  /**
    * The x coordinate of the rectangle.
    */
  var x: Double = js.native
  
  /**
    * The y coordinate of the rectangle.
    */
  var y: Double = js.native
}
/* static members */
object BoundingRectangle {
  
  @JSImport("cesium", "BoundingRectangle")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Duplicates a BoundingRectangle instance.
    * @param rectangle - The bounding rectangle to duplicate.
    * @param [result] - The object onto which to store the result.
    * @returns The modified result parameter or a new BoundingRectangle instance if one was not provided. (Returns undefined if rectangle is undefined)
    */
  inline def clone(rectangle: BoundingRectangle): BoundingRectangle = ^.asInstanceOf[js.Dynamic].applyDynamic("clone")(rectangle.asInstanceOf[js.Any]).asInstanceOf[BoundingRectangle]
  inline def clone(rectangle: BoundingRectangle, result: BoundingRectangle): BoundingRectangle = (^.asInstanceOf[js.Dynamic].applyDynamic("clone")(rectangle.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[BoundingRectangle]
  
  /**
    * Compares the provided BoundingRectangles componentwise and returns
    * <code>true</code> if they are equal, <code>false</code> otherwise.
    * @param [left] - The first BoundingRectangle.
    * @param [right] - The second BoundingRectangle.
    * @returns <code>true</code> if left and right are equal, <code>false</code> otherwise.
    */
  inline def equals(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("equals")().asInstanceOf[Boolean]
  inline def equals(left: Unit, right: BoundingRectangle): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def equals(left: BoundingRectangle): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("equals")(left.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def equals(left: BoundingRectangle, right: BoundingRectangle): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  /**
    * Computes a bounding rectangle by enlarging the provided rectangle until it contains the provided point.
    * @param rectangle - A rectangle to expand.
    * @param point - A point to enclose in a bounding rectangle.
    * @param [result] - The object onto which to store the result.
    * @returns The modified result parameter or a new BoundingRectangle instance if one was not provided.
    */
  inline def expand(rectangle: BoundingRectangle, point: Cartesian2): BoundingRectangle = (^.asInstanceOf[js.Dynamic].applyDynamic("expand")(rectangle.asInstanceOf[js.Any], point.asInstanceOf[js.Any])).asInstanceOf[BoundingRectangle]
  inline def expand(rectangle: BoundingRectangle, point: Cartesian2, result: BoundingRectangle): BoundingRectangle = (^.asInstanceOf[js.Dynamic].applyDynamic("expand")(rectangle.asInstanceOf[js.Any], point.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[BoundingRectangle]
  
  /**
    * Computes a bounding rectangle enclosing the list of 2D points.
    * The rectangle is oriented with the corner at the bottom left.
    * @param positions - List of points that the bounding rectangle will enclose.  Each point must have <code>x</code> and <code>y</code> properties.
    * @param [result] - The object onto which to store the result.
    * @returns The modified result parameter or a new BoundingRectangle instance if one was not provided.
    */
  inline def fromPoints(positions: js.Array[Cartesian2]): BoundingRectangle = ^.asInstanceOf[js.Dynamic].applyDynamic("fromPoints")(positions.asInstanceOf[js.Any]).asInstanceOf[BoundingRectangle]
  inline def fromPoints(positions: js.Array[Cartesian2], result: BoundingRectangle): BoundingRectangle = (^.asInstanceOf[js.Dynamic].applyDynamic("fromPoints")(positions.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[BoundingRectangle]
  
  /**
    * Computes a bounding rectangle from a rectangle.
    * @param rectangle - The valid rectangle used to create a bounding rectangle.
    * @param [projection = GeographicProjection] - The projection used to project the rectangle into 2D.
    * @param [result] - The object onto which to store the result.
    * @returns The modified result parameter or a new BoundingRectangle instance if one was not provided.
    */
  inline def fromRectangle(rectangle: Rectangle): BoundingRectangle = ^.asInstanceOf[js.Dynamic].applyDynamic("fromRectangle")(rectangle.asInstanceOf[js.Any]).asInstanceOf[BoundingRectangle]
  inline def fromRectangle(rectangle: Rectangle, projection: Any): BoundingRectangle = (^.asInstanceOf[js.Dynamic].applyDynamic("fromRectangle")(rectangle.asInstanceOf[js.Any], projection.asInstanceOf[js.Any])).asInstanceOf[BoundingRectangle]
  inline def fromRectangle(rectangle: Rectangle, projection: Any, result: BoundingRectangle): BoundingRectangle = (^.asInstanceOf[js.Dynamic].applyDynamic("fromRectangle")(rectangle.asInstanceOf[js.Any], projection.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[BoundingRectangle]
  inline def fromRectangle(rectangle: Rectangle, projection: Unit, result: BoundingRectangle): BoundingRectangle = (^.asInstanceOf[js.Dynamic].applyDynamic("fromRectangle")(rectangle.asInstanceOf[js.Any], projection.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[BoundingRectangle]
  
  /**
    * Determines if two rectangles intersect.
    * @param left - A rectangle to check for intersection.
    * @param right - The other rectangle to check for intersection.
    * @returns <code>Intersect.INTERSECTING</code> if the rectangles intersect, <code>Intersect.OUTSIDE</code> otherwise.
    */
  inline def intersect(left: BoundingRectangle, right: BoundingRectangle): Intersect = (^.asInstanceOf[js.Dynamic].applyDynamic("intersect")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[Intersect]
  
  /**
    * Stores the provided instance into the provided array.
    * @param value - The value to pack.
    * @param array - The array to pack into.
    * @param [startingIndex = 0] - The index into the array at which to start packing the elements.
    * @returns The array that was packed into
    */
  inline def pack(value: BoundingRectangle, array: js.Array[Double]): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("pack")(value.asInstanceOf[js.Any], array.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  inline def pack(value: BoundingRectangle, array: js.Array[Double], startingIndex: Double): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("pack")(value.asInstanceOf[js.Any], array.asInstanceOf[js.Any], startingIndex.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  
  /**
    * The number of elements used to pack the object into an array.
    */
  @JSImport("cesium", "BoundingRectangle.packedLength")
  @js.native
  def packedLength: Double = js.native
  inline def packedLength_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("packedLength")(x.asInstanceOf[js.Any])
  
  /**
    * Computes a bounding rectangle that is the union of the left and right bounding rectangles.
    * @param left - A rectangle to enclose in bounding rectangle.
    * @param right - A rectangle to enclose in a bounding rectangle.
    * @param [result] - The object onto which to store the result.
    * @returns The modified result parameter or a new BoundingRectangle instance if one was not provided.
    */
  inline def union(left: BoundingRectangle, right: BoundingRectangle): BoundingRectangle = (^.asInstanceOf[js.Dynamic].applyDynamic("union")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[BoundingRectangle]
  inline def union(left: BoundingRectangle, right: BoundingRectangle, result: BoundingRectangle): BoundingRectangle = (^.asInstanceOf[js.Dynamic].applyDynamic("union")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[BoundingRectangle]
  
  /**
    * Retrieves an instance from a packed array.
    * @param array - The packed array.
    * @param [startingIndex = 0] - The starting index of the element to be unpacked.
    * @param [result] - The object into which to store the result.
    * @returns The modified result parameter or a new BoundingRectangle instance if one was not provided.
    */
  inline def unpack(array: js.Array[Double]): BoundingRectangle = ^.asInstanceOf[js.Dynamic].applyDynamic("unpack")(array.asInstanceOf[js.Any]).asInstanceOf[BoundingRectangle]
  inline def unpack(array: js.Array[Double], startingIndex: Double): BoundingRectangle = (^.asInstanceOf[js.Dynamic].applyDynamic("unpack")(array.asInstanceOf[js.Any], startingIndex.asInstanceOf[js.Any])).asInstanceOf[BoundingRectangle]
  inline def unpack(array: js.Array[Double], startingIndex: Double, result: BoundingRectangle): BoundingRectangle = (^.asInstanceOf[js.Dynamic].applyDynamic("unpack")(array.asInstanceOf[js.Any], startingIndex.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[BoundingRectangle]
  inline def unpack(array: js.Array[Double], startingIndex: Unit, result: BoundingRectangle): BoundingRectangle = (^.asInstanceOf[js.Dynamic].applyDynamic("unpack")(array.asInstanceOf[js.Any], startingIndex.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[BoundingRectangle]
}
