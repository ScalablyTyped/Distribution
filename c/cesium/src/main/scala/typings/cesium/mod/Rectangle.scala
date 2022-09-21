package typings.cesium.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cesium", "Rectangle")
@js.native
open class Rectangle () extends StObject {
  def this(west: Double) = this()
  def this(west: Double, south: Double) = this()
  def this(west: Unit, south: Double) = this()
  def this(west: Double, south: Double, east: Double) = this()
  def this(west: Double, south: Unit, east: Double) = this()
  def this(west: Unit, south: Double, east: Double) = this()
  def this(west: Unit, south: Unit, east: Double) = this()
  def this(west: Double, south: Double, east: Double, north: Double) = this()
  def this(west: Double, south: Double, east: Unit, north: Double) = this()
  def this(west: Double, south: Unit, east: Double, north: Double) = this()
  def this(west: Double, south: Unit, east: Unit, north: Double) = this()
  def this(west: Unit, south: Double, east: Double, north: Double) = this()
  def this(west: Unit, south: Double, east: Unit, north: Double) = this()
  def this(west: Unit, south: Unit, east: Double, north: Double) = this()
  def this(west: Unit, south: Unit, east: Unit, north: Double) = this()
  
  def clone(result: Rectangle): Rectangle = js.native
  
  /**
    * The easternmost longitude in radians in the range [-Pi, Pi].
    */
  var east: Double = js.native
  
  /**
    * Compares the provided Rectangle with this Rectangle componentwise and returns
    * <code>true</code> if they are equal, <code>false</code> otherwise.
    * @param [other] - The Rectangle to compare.
    * @returns <code>true</code> if the Rectangles are equal, <code>false</code> otherwise.
    */
  def equals(): Boolean = js.native
  def equals(other: Rectangle): Boolean = js.native
  
  /**
    * Compares the provided Rectangle with this Rectangle componentwise and returns
    * <code>true</code> if they are within the provided epsilon,
    * <code>false</code> otherwise.
    * @param [other] - The Rectangle to compare.
    * @param [epsilon = 0] - The epsilon to use for equality testing.
    * @returns <code>true</code> if the Rectangles are within the provided epsilon, <code>false</code> otherwise.
    */
  def equalsEpsilon(): Boolean = js.native
  def equalsEpsilon(other: Unit, epsilon: Double): Boolean = js.native
  def equalsEpsilon(other: Rectangle): Boolean = js.native
  def equalsEpsilon(other: Rectangle, epsilon: Double): Boolean = js.native
  
  /**
    * Gets the height of the rectangle in radians.
    */
  val height: Double = js.native
  
  /**
    * The northernmost latitude in radians in the range [-Pi/2, Pi/2].
    */
  var north: Double = js.native
  
  /**
    * The southernmost latitude in radians in the range [-Pi/2, Pi/2].
    */
  var south: Double = js.native
  
  /**
    * The westernmost longitude in radians in the range [-Pi, Pi].
    */
  var west: Double = js.native
  
  /**
    * Gets the width of the rectangle in radians.
    */
  val width: Double = js.native
}
/* static members */
object Rectangle {
  
  @JSImport("cesium", "Rectangle")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * The largest possible rectangle.
    */
  @JSImport("cesium", "Rectangle.MAX_VALUE")
  @js.native
  val MAX_VALUE: Rectangle = js.native
  
  /**
    * Computes the center of a rectangle.
    * @param rectangle - The rectangle for which to find the center
    * @param [result] - The object onto which to store the result.
    * @returns The modified result parameter or a new Cartographic instance if none was provided.
    */
  inline def center(rectangle: Rectangle): Cartographic = ^.asInstanceOf[js.Dynamic].applyDynamic("center")(rectangle.asInstanceOf[js.Any]).asInstanceOf[Cartographic]
  inline def center(rectangle: Rectangle, result: Cartographic): Cartographic = (^.asInstanceOf[js.Dynamic].applyDynamic("center")(rectangle.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Cartographic]
  
  /**
    * Duplicates a Rectangle.
    * @param rectangle - The rectangle to clone.
    * @param [result] - The object onto which to store the result, or undefined if a new instance should be created.
    * @returns The modified result parameter or a new Rectangle instance if none was provided. (Returns undefined if rectangle is undefined)
    */
  inline def clone(rectangle: Rectangle): Rectangle = ^.asInstanceOf[js.Dynamic].applyDynamic("clone")(rectangle.asInstanceOf[js.Any]).asInstanceOf[Rectangle]
  inline def clone(rectangle: Rectangle, result: Rectangle): Rectangle = (^.asInstanceOf[js.Dynamic].applyDynamic("clone")(rectangle.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Rectangle]
  
  /**
    * Computes the height of a rectangle in radians.
    * @param rectangle - The rectangle to compute the height of.
    * @returns The height.
    */
  inline def computeHeight(rectangle: Rectangle): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("computeHeight")(rectangle.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  /**
    * Computes the width of a rectangle in radians.
    * @param rectangle - The rectangle to compute the width of.
    * @returns The width.
    */
  inline def computeWidth(rectangle: Rectangle): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("computeWidth")(rectangle.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  /**
    * Returns true if the cartographic is on or inside the rectangle, false otherwise.
    * @param rectangle - The rectangle
    * @param cartographic - The cartographic to test.
    * @returns true if the provided cartographic is inside the rectangle, false otherwise.
    */
  inline def contains(rectangle: Rectangle, cartographic: Cartographic): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("contains")(rectangle.asInstanceOf[js.Any], cartographic.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  /**
    * Compares the provided rectangles and returns <code>true</code> if they are equal,
    * <code>false</code> otherwise.
    * @param [left] - The first Rectangle.
    * @param [right] - The second Rectangle.
    * @returns <code>true</code> if left and right are equal; otherwise <code>false</code>.
    */
  inline def equals(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("equals")().asInstanceOf[Boolean]
  inline def equals(left: Unit, right: Rectangle): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def equals(left: Rectangle): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("equals")(left.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def equals(left: Rectangle, right: Rectangle): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  /**
    * Compares the provided Rectangles componentwise and returns
    * <code>true</code> if they pass an absolute or relative tolerance test,
    * <code>false</code> otherwise.
    * @param [left] - The first Rectangle.
    * @param [right] - The second Rectangle.
    * @param [absoluteEpsilon = 0] - The absolute epsilon tolerance to use for equality testing.
    * @returns <code>true</code> if left and right are within the provided epsilon, <code>false</code> otherwise.
    */
  inline def equalsEpsilon(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("equalsEpsilon")().asInstanceOf[Boolean]
  inline def equalsEpsilon(left: Unit, right: Unit, absoluteEpsilon: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equalsEpsilon")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any], absoluteEpsilon.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def equalsEpsilon(left: Unit, right: Rectangle): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equalsEpsilon")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def equalsEpsilon(left: Unit, right: Rectangle, absoluteEpsilon: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equalsEpsilon")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any], absoluteEpsilon.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def equalsEpsilon(left: Rectangle): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("equalsEpsilon")(left.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def equalsEpsilon(left: Rectangle, right: Unit, absoluteEpsilon: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equalsEpsilon")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any], absoluteEpsilon.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def equalsEpsilon(left: Rectangle, right: Rectangle): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equalsEpsilon")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def equalsEpsilon(left: Rectangle, right: Rectangle, absoluteEpsilon: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equalsEpsilon")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any], absoluteEpsilon.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  /**
    * Computes a rectangle by enlarging the provided rectangle until it contains the provided cartographic.
    * @param rectangle - A rectangle to expand.
    * @param cartographic - A cartographic to enclose in a rectangle.
    * @param [result] - The object onto which to store the result.
    * @returns The modified result parameter or a new Rectangle instance if one was not provided.
    */
  inline def expand(rectangle: Rectangle, cartographic: Cartographic): Rectangle = (^.asInstanceOf[js.Dynamic].applyDynamic("expand")(rectangle.asInstanceOf[js.Any], cartographic.asInstanceOf[js.Any])).asInstanceOf[Rectangle]
  inline def expand(rectangle: Rectangle, cartographic: Cartographic, result: Rectangle): Rectangle = (^.asInstanceOf[js.Dynamic].applyDynamic("expand")(rectangle.asInstanceOf[js.Any], cartographic.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Rectangle]
  
  /**
    * Creates the smallest possible Rectangle that encloses all positions in the provided array.
    * @param cartesians - The list of Cartesian instances.
    * @param [ellipsoid = Ellipsoid.WGS84] - The ellipsoid the cartesians are on.
    * @param [result] - The object onto which to store the result, or undefined if a new instance should be created.
    * @returns The modified result parameter or a new Rectangle instance if none was provided.
    */
  inline def fromCartesianArray(cartesians: js.Array[Cartesian3]): Rectangle = ^.asInstanceOf[js.Dynamic].applyDynamic("fromCartesianArray")(cartesians.asInstanceOf[js.Any]).asInstanceOf[Rectangle]
  inline def fromCartesianArray(cartesians: js.Array[Cartesian3], ellipsoid: Unit, result: Rectangle): Rectangle = (^.asInstanceOf[js.Dynamic].applyDynamic("fromCartesianArray")(cartesians.asInstanceOf[js.Any], ellipsoid.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Rectangle]
  inline def fromCartesianArray(cartesians: js.Array[Cartesian3], ellipsoid: Ellipsoid): Rectangle = (^.asInstanceOf[js.Dynamic].applyDynamic("fromCartesianArray")(cartesians.asInstanceOf[js.Any], ellipsoid.asInstanceOf[js.Any])).asInstanceOf[Rectangle]
  inline def fromCartesianArray(cartesians: js.Array[Cartesian3], ellipsoid: Ellipsoid, result: Rectangle): Rectangle = (^.asInstanceOf[js.Dynamic].applyDynamic("fromCartesianArray")(cartesians.asInstanceOf[js.Any], ellipsoid.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Rectangle]
  
  /**
    * Creates the smallest possible Rectangle that encloses all positions in the provided array.
    * @param cartographics - The list of Cartographic instances.
    * @param [result] - The object onto which to store the result, or undefined if a new instance should be created.
    * @returns The modified result parameter or a new Rectangle instance if none was provided.
    */
  inline def fromCartographicArray(cartographics: js.Array[Cartographic]): Rectangle = ^.asInstanceOf[js.Dynamic].applyDynamic("fromCartographicArray")(cartographics.asInstanceOf[js.Any]).asInstanceOf[Rectangle]
  inline def fromCartographicArray(cartographics: js.Array[Cartographic], result: Rectangle): Rectangle = (^.asInstanceOf[js.Dynamic].applyDynamic("fromCartographicArray")(cartographics.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Rectangle]
  
  /**
    * Creates a rectangle given the boundary longitude and latitude in degrees.
    * @example
    * const rectangle = Cesium.Rectangle.fromDegrees(0.0, 20.0, 10.0, 30.0);
    * @param [west = 0.0] - The westernmost longitude in degrees in the range [-180.0, 180.0].
    * @param [south = 0.0] - The southernmost latitude in degrees in the range [-90.0, 90.0].
    * @param [east = 0.0] - The easternmost longitude in degrees in the range [-180.0, 180.0].
    * @param [north = 0.0] - The northernmost latitude in degrees in the range [-90.0, 90.0].
    * @param [result] - The object onto which to store the result, or undefined if a new instance should be created.
    * @returns The modified result parameter or a new Rectangle instance if none was provided.
    */
  inline def fromDegrees(): Rectangle = ^.asInstanceOf[js.Dynamic].applyDynamic("fromDegrees")().asInstanceOf[Rectangle]
  inline def fromDegrees(west: Double): Rectangle = ^.asInstanceOf[js.Dynamic].applyDynamic("fromDegrees")(west.asInstanceOf[js.Any]).asInstanceOf[Rectangle]
  inline def fromDegrees(west: Double, south: Double): Rectangle = (^.asInstanceOf[js.Dynamic].applyDynamic("fromDegrees")(west.asInstanceOf[js.Any], south.asInstanceOf[js.Any])).asInstanceOf[Rectangle]
  inline def fromDegrees(west: Double, south: Double, east: Double): Rectangle = (^.asInstanceOf[js.Dynamic].applyDynamic("fromDegrees")(west.asInstanceOf[js.Any], south.asInstanceOf[js.Any], east.asInstanceOf[js.Any])).asInstanceOf[Rectangle]
  inline def fromDegrees(west: Double, south: Double, east: Double, north: Double): Rectangle = (^.asInstanceOf[js.Dynamic].applyDynamic("fromDegrees")(west.asInstanceOf[js.Any], south.asInstanceOf[js.Any], east.asInstanceOf[js.Any], north.asInstanceOf[js.Any])).asInstanceOf[Rectangle]
  inline def fromDegrees(west: Double, south: Double, east: Double, north: Double, result: Rectangle): Rectangle = (^.asInstanceOf[js.Dynamic].applyDynamic("fromDegrees")(west.asInstanceOf[js.Any], south.asInstanceOf[js.Any], east.asInstanceOf[js.Any], north.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Rectangle]
  inline def fromDegrees(west: Double, south: Double, east: Double, north: Unit, result: Rectangle): Rectangle = (^.asInstanceOf[js.Dynamic].applyDynamic("fromDegrees")(west.asInstanceOf[js.Any], south.asInstanceOf[js.Any], east.asInstanceOf[js.Any], north.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Rectangle]
  inline def fromDegrees(west: Double, south: Double, east: Unit, north: Double): Rectangle = (^.asInstanceOf[js.Dynamic].applyDynamic("fromDegrees")(west.asInstanceOf[js.Any], south.asInstanceOf[js.Any], east.asInstanceOf[js.Any], north.asInstanceOf[js.Any])).asInstanceOf[Rectangle]
  inline def fromDegrees(west: Double, south: Double, east: Unit, north: Double, result: Rectangle): Rectangle = (^.asInstanceOf[js.Dynamic].applyDynamic("fromDegrees")(west.asInstanceOf[js.Any], south.asInstanceOf[js.Any], east.asInstanceOf[js.Any], north.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Rectangle]
  inline def fromDegrees(west: Double, south: Double, east: Unit, north: Unit, result: Rectangle): Rectangle = (^.asInstanceOf[js.Dynamic].applyDynamic("fromDegrees")(west.asInstanceOf[js.Any], south.asInstanceOf[js.Any], east.asInstanceOf[js.Any], north.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Rectangle]
  inline def fromDegrees(west: Double, south: Unit, east: Double): Rectangle = (^.asInstanceOf[js.Dynamic].applyDynamic("fromDegrees")(west.asInstanceOf[js.Any], south.asInstanceOf[js.Any], east.asInstanceOf[js.Any])).asInstanceOf[Rectangle]
  inline def fromDegrees(west: Double, south: Unit, east: Double, north: Double): Rectangle = (^.asInstanceOf[js.Dynamic].applyDynamic("fromDegrees")(west.asInstanceOf[js.Any], south.asInstanceOf[js.Any], east.asInstanceOf[js.Any], north.asInstanceOf[js.Any])).asInstanceOf[Rectangle]
  inline def fromDegrees(west: Double, south: Unit, east: Double, north: Double, result: Rectangle): Rectangle = (^.asInstanceOf[js.Dynamic].applyDynamic("fromDegrees")(west.asInstanceOf[js.Any], south.asInstanceOf[js.Any], east.asInstanceOf[js.Any], north.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Rectangle]
  inline def fromDegrees(west: Double, south: Unit, east: Double, north: Unit, result: Rectangle): Rectangle = (^.asInstanceOf[js.Dynamic].applyDynamic("fromDegrees")(west.asInstanceOf[js.Any], south.asInstanceOf[js.Any], east.asInstanceOf[js.Any], north.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Rectangle]
  inline def fromDegrees(west: Double, south: Unit, east: Unit, north: Double): Rectangle = (^.asInstanceOf[js.Dynamic].applyDynamic("fromDegrees")(west.asInstanceOf[js.Any], south.asInstanceOf[js.Any], east.asInstanceOf[js.Any], north.asInstanceOf[js.Any])).asInstanceOf[Rectangle]
  inline def fromDegrees(west: Double, south: Unit, east: Unit, north: Double, result: Rectangle): Rectangle = (^.asInstanceOf[js.Dynamic].applyDynamic("fromDegrees")(west.asInstanceOf[js.Any], south.asInstanceOf[js.Any], east.asInstanceOf[js.Any], north.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Rectangle]
  inline def fromDegrees(west: Double, south: Unit, east: Unit, north: Unit, result: Rectangle): Rectangle = (^.asInstanceOf[js.Dynamic].applyDynamic("fromDegrees")(west.asInstanceOf[js.Any], south.asInstanceOf[js.Any], east.asInstanceOf[js.Any], north.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Rectangle]
  inline def fromDegrees(west: Unit, south: Double): Rectangle = (^.asInstanceOf[js.Dynamic].applyDynamic("fromDegrees")(west.asInstanceOf[js.Any], south.asInstanceOf[js.Any])).asInstanceOf[Rectangle]
  inline def fromDegrees(west: Unit, south: Double, east: Double): Rectangle = (^.asInstanceOf[js.Dynamic].applyDynamic("fromDegrees")(west.asInstanceOf[js.Any], south.asInstanceOf[js.Any], east.asInstanceOf[js.Any])).asInstanceOf[Rectangle]
  inline def fromDegrees(west: Unit, south: Double, east: Double, north: Double): Rectangle = (^.asInstanceOf[js.Dynamic].applyDynamic("fromDegrees")(west.asInstanceOf[js.Any], south.asInstanceOf[js.Any], east.asInstanceOf[js.Any], north.asInstanceOf[js.Any])).asInstanceOf[Rectangle]
  inline def fromDegrees(west: Unit, south: Double, east: Double, north: Double, result: Rectangle): Rectangle = (^.asInstanceOf[js.Dynamic].applyDynamic("fromDegrees")(west.asInstanceOf[js.Any], south.asInstanceOf[js.Any], east.asInstanceOf[js.Any], north.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Rectangle]
  inline def fromDegrees(west: Unit, south: Double, east: Double, north: Unit, result: Rectangle): Rectangle = (^.asInstanceOf[js.Dynamic].applyDynamic("fromDegrees")(west.asInstanceOf[js.Any], south.asInstanceOf[js.Any], east.asInstanceOf[js.Any], north.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Rectangle]
  inline def fromDegrees(west: Unit, south: Double, east: Unit, north: Double): Rectangle = (^.asInstanceOf[js.Dynamic].applyDynamic("fromDegrees")(west.asInstanceOf[js.Any], south.asInstanceOf[js.Any], east.asInstanceOf[js.Any], north.asInstanceOf[js.Any])).asInstanceOf[Rectangle]
  inline def fromDegrees(west: Unit, south: Double, east: Unit, north: Double, result: Rectangle): Rectangle = (^.asInstanceOf[js.Dynamic].applyDynamic("fromDegrees")(west.asInstanceOf[js.Any], south.asInstanceOf[js.Any], east.asInstanceOf[js.Any], north.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Rectangle]
  inline def fromDegrees(west: Unit, south: Double, east: Unit, north: Unit, result: Rectangle): Rectangle = (^.asInstanceOf[js.Dynamic].applyDynamic("fromDegrees")(west.asInstanceOf[js.Any], south.asInstanceOf[js.Any], east.asInstanceOf[js.Any], north.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Rectangle]
  inline def fromDegrees(west: Unit, south: Unit, east: Double): Rectangle = (^.asInstanceOf[js.Dynamic].applyDynamic("fromDegrees")(west.asInstanceOf[js.Any], south.asInstanceOf[js.Any], east.asInstanceOf[js.Any])).asInstanceOf[Rectangle]
  inline def fromDegrees(west: Unit, south: Unit, east: Double, north: Double): Rectangle = (^.asInstanceOf[js.Dynamic].applyDynamic("fromDegrees")(west.asInstanceOf[js.Any], south.asInstanceOf[js.Any], east.asInstanceOf[js.Any], north.asInstanceOf[js.Any])).asInstanceOf[Rectangle]
  inline def fromDegrees(west: Unit, south: Unit, east: Double, north: Double, result: Rectangle): Rectangle = (^.asInstanceOf[js.Dynamic].applyDynamic("fromDegrees")(west.asInstanceOf[js.Any], south.asInstanceOf[js.Any], east.asInstanceOf[js.Any], north.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Rectangle]
  inline def fromDegrees(west: Unit, south: Unit, east: Double, north: Unit, result: Rectangle): Rectangle = (^.asInstanceOf[js.Dynamic].applyDynamic("fromDegrees")(west.asInstanceOf[js.Any], south.asInstanceOf[js.Any], east.asInstanceOf[js.Any], north.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Rectangle]
  inline def fromDegrees(west: Unit, south: Unit, east: Unit, north: Double): Rectangle = (^.asInstanceOf[js.Dynamic].applyDynamic("fromDegrees")(west.asInstanceOf[js.Any], south.asInstanceOf[js.Any], east.asInstanceOf[js.Any], north.asInstanceOf[js.Any])).asInstanceOf[Rectangle]
  inline def fromDegrees(west: Unit, south: Unit, east: Unit, north: Double, result: Rectangle): Rectangle = (^.asInstanceOf[js.Dynamic].applyDynamic("fromDegrees")(west.asInstanceOf[js.Any], south.asInstanceOf[js.Any], east.asInstanceOf[js.Any], north.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Rectangle]
  inline def fromDegrees(west: Unit, south: Unit, east: Unit, north: Unit, result: Rectangle): Rectangle = (^.asInstanceOf[js.Dynamic].applyDynamic("fromDegrees")(west.asInstanceOf[js.Any], south.asInstanceOf[js.Any], east.asInstanceOf[js.Any], north.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Rectangle]
  
  /**
    * Creates a rectangle given the boundary longitude and latitude in radians.
    * @example
    * const rectangle = Cesium.Rectangle.fromRadians(0.0, Math.PI/4, Math.PI/8, 3*Math.PI/4);
    * @param [west = 0.0] - The westernmost longitude in radians in the range [-Math.PI, Math.PI].
    * @param [south = 0.0] - The southernmost latitude in radians in the range [-Math.PI/2, Math.PI/2].
    * @param [east = 0.0] - The easternmost longitude in radians in the range [-Math.PI, Math.PI].
    * @param [north = 0.0] - The northernmost latitude in radians in the range [-Math.PI/2, Math.PI/2].
    * @param [result] - The object onto which to store the result, or undefined if a new instance should be created.
    * @returns The modified result parameter or a new Rectangle instance if none was provided.
    */
  inline def fromRadians(): Rectangle = ^.asInstanceOf[js.Dynamic].applyDynamic("fromRadians")().asInstanceOf[Rectangle]
  inline def fromRadians(west: Double): Rectangle = ^.asInstanceOf[js.Dynamic].applyDynamic("fromRadians")(west.asInstanceOf[js.Any]).asInstanceOf[Rectangle]
  inline def fromRadians(west: Double, south: Double): Rectangle = (^.asInstanceOf[js.Dynamic].applyDynamic("fromRadians")(west.asInstanceOf[js.Any], south.asInstanceOf[js.Any])).asInstanceOf[Rectangle]
  inline def fromRadians(west: Double, south: Double, east: Double): Rectangle = (^.asInstanceOf[js.Dynamic].applyDynamic("fromRadians")(west.asInstanceOf[js.Any], south.asInstanceOf[js.Any], east.asInstanceOf[js.Any])).asInstanceOf[Rectangle]
  inline def fromRadians(west: Double, south: Double, east: Double, north: Double): Rectangle = (^.asInstanceOf[js.Dynamic].applyDynamic("fromRadians")(west.asInstanceOf[js.Any], south.asInstanceOf[js.Any], east.asInstanceOf[js.Any], north.asInstanceOf[js.Any])).asInstanceOf[Rectangle]
  inline def fromRadians(west: Double, south: Double, east: Double, north: Double, result: Rectangle): Rectangle = (^.asInstanceOf[js.Dynamic].applyDynamic("fromRadians")(west.asInstanceOf[js.Any], south.asInstanceOf[js.Any], east.asInstanceOf[js.Any], north.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Rectangle]
  inline def fromRadians(west: Double, south: Double, east: Double, north: Unit, result: Rectangle): Rectangle = (^.asInstanceOf[js.Dynamic].applyDynamic("fromRadians")(west.asInstanceOf[js.Any], south.asInstanceOf[js.Any], east.asInstanceOf[js.Any], north.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Rectangle]
  inline def fromRadians(west: Double, south: Double, east: Unit, north: Double): Rectangle = (^.asInstanceOf[js.Dynamic].applyDynamic("fromRadians")(west.asInstanceOf[js.Any], south.asInstanceOf[js.Any], east.asInstanceOf[js.Any], north.asInstanceOf[js.Any])).asInstanceOf[Rectangle]
  inline def fromRadians(west: Double, south: Double, east: Unit, north: Double, result: Rectangle): Rectangle = (^.asInstanceOf[js.Dynamic].applyDynamic("fromRadians")(west.asInstanceOf[js.Any], south.asInstanceOf[js.Any], east.asInstanceOf[js.Any], north.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Rectangle]
  inline def fromRadians(west: Double, south: Double, east: Unit, north: Unit, result: Rectangle): Rectangle = (^.asInstanceOf[js.Dynamic].applyDynamic("fromRadians")(west.asInstanceOf[js.Any], south.asInstanceOf[js.Any], east.asInstanceOf[js.Any], north.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Rectangle]
  inline def fromRadians(west: Double, south: Unit, east: Double): Rectangle = (^.asInstanceOf[js.Dynamic].applyDynamic("fromRadians")(west.asInstanceOf[js.Any], south.asInstanceOf[js.Any], east.asInstanceOf[js.Any])).asInstanceOf[Rectangle]
  inline def fromRadians(west: Double, south: Unit, east: Double, north: Double): Rectangle = (^.asInstanceOf[js.Dynamic].applyDynamic("fromRadians")(west.asInstanceOf[js.Any], south.asInstanceOf[js.Any], east.asInstanceOf[js.Any], north.asInstanceOf[js.Any])).asInstanceOf[Rectangle]
  inline def fromRadians(west: Double, south: Unit, east: Double, north: Double, result: Rectangle): Rectangle = (^.asInstanceOf[js.Dynamic].applyDynamic("fromRadians")(west.asInstanceOf[js.Any], south.asInstanceOf[js.Any], east.asInstanceOf[js.Any], north.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Rectangle]
  inline def fromRadians(west: Double, south: Unit, east: Double, north: Unit, result: Rectangle): Rectangle = (^.asInstanceOf[js.Dynamic].applyDynamic("fromRadians")(west.asInstanceOf[js.Any], south.asInstanceOf[js.Any], east.asInstanceOf[js.Any], north.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Rectangle]
  inline def fromRadians(west: Double, south: Unit, east: Unit, north: Double): Rectangle = (^.asInstanceOf[js.Dynamic].applyDynamic("fromRadians")(west.asInstanceOf[js.Any], south.asInstanceOf[js.Any], east.asInstanceOf[js.Any], north.asInstanceOf[js.Any])).asInstanceOf[Rectangle]
  inline def fromRadians(west: Double, south: Unit, east: Unit, north: Double, result: Rectangle): Rectangle = (^.asInstanceOf[js.Dynamic].applyDynamic("fromRadians")(west.asInstanceOf[js.Any], south.asInstanceOf[js.Any], east.asInstanceOf[js.Any], north.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Rectangle]
  inline def fromRadians(west: Double, south: Unit, east: Unit, north: Unit, result: Rectangle): Rectangle = (^.asInstanceOf[js.Dynamic].applyDynamic("fromRadians")(west.asInstanceOf[js.Any], south.asInstanceOf[js.Any], east.asInstanceOf[js.Any], north.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Rectangle]
  inline def fromRadians(west: Unit, south: Double): Rectangle = (^.asInstanceOf[js.Dynamic].applyDynamic("fromRadians")(west.asInstanceOf[js.Any], south.asInstanceOf[js.Any])).asInstanceOf[Rectangle]
  inline def fromRadians(west: Unit, south: Double, east: Double): Rectangle = (^.asInstanceOf[js.Dynamic].applyDynamic("fromRadians")(west.asInstanceOf[js.Any], south.asInstanceOf[js.Any], east.asInstanceOf[js.Any])).asInstanceOf[Rectangle]
  inline def fromRadians(west: Unit, south: Double, east: Double, north: Double): Rectangle = (^.asInstanceOf[js.Dynamic].applyDynamic("fromRadians")(west.asInstanceOf[js.Any], south.asInstanceOf[js.Any], east.asInstanceOf[js.Any], north.asInstanceOf[js.Any])).asInstanceOf[Rectangle]
  inline def fromRadians(west: Unit, south: Double, east: Double, north: Double, result: Rectangle): Rectangle = (^.asInstanceOf[js.Dynamic].applyDynamic("fromRadians")(west.asInstanceOf[js.Any], south.asInstanceOf[js.Any], east.asInstanceOf[js.Any], north.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Rectangle]
  inline def fromRadians(west: Unit, south: Double, east: Double, north: Unit, result: Rectangle): Rectangle = (^.asInstanceOf[js.Dynamic].applyDynamic("fromRadians")(west.asInstanceOf[js.Any], south.asInstanceOf[js.Any], east.asInstanceOf[js.Any], north.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Rectangle]
  inline def fromRadians(west: Unit, south: Double, east: Unit, north: Double): Rectangle = (^.asInstanceOf[js.Dynamic].applyDynamic("fromRadians")(west.asInstanceOf[js.Any], south.asInstanceOf[js.Any], east.asInstanceOf[js.Any], north.asInstanceOf[js.Any])).asInstanceOf[Rectangle]
  inline def fromRadians(west: Unit, south: Double, east: Unit, north: Double, result: Rectangle): Rectangle = (^.asInstanceOf[js.Dynamic].applyDynamic("fromRadians")(west.asInstanceOf[js.Any], south.asInstanceOf[js.Any], east.asInstanceOf[js.Any], north.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Rectangle]
  inline def fromRadians(west: Unit, south: Double, east: Unit, north: Unit, result: Rectangle): Rectangle = (^.asInstanceOf[js.Dynamic].applyDynamic("fromRadians")(west.asInstanceOf[js.Any], south.asInstanceOf[js.Any], east.asInstanceOf[js.Any], north.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Rectangle]
  inline def fromRadians(west: Unit, south: Unit, east: Double): Rectangle = (^.asInstanceOf[js.Dynamic].applyDynamic("fromRadians")(west.asInstanceOf[js.Any], south.asInstanceOf[js.Any], east.asInstanceOf[js.Any])).asInstanceOf[Rectangle]
  inline def fromRadians(west: Unit, south: Unit, east: Double, north: Double): Rectangle = (^.asInstanceOf[js.Dynamic].applyDynamic("fromRadians")(west.asInstanceOf[js.Any], south.asInstanceOf[js.Any], east.asInstanceOf[js.Any], north.asInstanceOf[js.Any])).asInstanceOf[Rectangle]
  inline def fromRadians(west: Unit, south: Unit, east: Double, north: Double, result: Rectangle): Rectangle = (^.asInstanceOf[js.Dynamic].applyDynamic("fromRadians")(west.asInstanceOf[js.Any], south.asInstanceOf[js.Any], east.asInstanceOf[js.Any], north.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Rectangle]
  inline def fromRadians(west: Unit, south: Unit, east: Double, north: Unit, result: Rectangle): Rectangle = (^.asInstanceOf[js.Dynamic].applyDynamic("fromRadians")(west.asInstanceOf[js.Any], south.asInstanceOf[js.Any], east.asInstanceOf[js.Any], north.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Rectangle]
  inline def fromRadians(west: Unit, south: Unit, east: Unit, north: Double): Rectangle = (^.asInstanceOf[js.Dynamic].applyDynamic("fromRadians")(west.asInstanceOf[js.Any], south.asInstanceOf[js.Any], east.asInstanceOf[js.Any], north.asInstanceOf[js.Any])).asInstanceOf[Rectangle]
  inline def fromRadians(west: Unit, south: Unit, east: Unit, north: Double, result: Rectangle): Rectangle = (^.asInstanceOf[js.Dynamic].applyDynamic("fromRadians")(west.asInstanceOf[js.Any], south.asInstanceOf[js.Any], east.asInstanceOf[js.Any], north.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Rectangle]
  inline def fromRadians(west: Unit, south: Unit, east: Unit, north: Unit, result: Rectangle): Rectangle = (^.asInstanceOf[js.Dynamic].applyDynamic("fromRadians")(west.asInstanceOf[js.Any], south.asInstanceOf[js.Any], east.asInstanceOf[js.Any], north.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Rectangle]
  
  /**
    * Computes the intersection of two rectangles.  This function assumes that the rectangle's coordinates are
    * latitude and longitude in radians and produces a correct intersection, taking into account the fact that
    * the same angle can be represented with multiple values as well as the wrapping of longitude at the
    * anti-meridian.  For a simple intersection that ignores these factors and can be used with projected
    * coordinates, see {@link Rectangle.simpleIntersection}.
    * @param rectangle - On rectangle to find an intersection
    * @param otherRectangle - Another rectangle to find an intersection
    * @param [result] - The object onto which to store the result.
    * @returns The modified result parameter, a new Rectangle instance if none was provided or undefined if there is no intersection.
    */
  inline def intersection(rectangle: Rectangle, otherRectangle: Rectangle): js.UndefOr[Rectangle] = (^.asInstanceOf[js.Dynamic].applyDynamic("intersection")(rectangle.asInstanceOf[js.Any], otherRectangle.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Rectangle]]
  inline def intersection(rectangle: Rectangle, otherRectangle: Rectangle, result: Rectangle): js.UndefOr[Rectangle] = (^.asInstanceOf[js.Dynamic].applyDynamic("intersection")(rectangle.asInstanceOf[js.Any], otherRectangle.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Rectangle]]
  
  /**
    * Computes the northeast corner of a rectangle.
    * @param rectangle - The rectangle for which to find the corner
    * @param [result] - The object onto which to store the result.
    * @returns The modified result parameter or a new Cartographic instance if none was provided.
    */
  inline def northeast(rectangle: Rectangle): Cartographic = ^.asInstanceOf[js.Dynamic].applyDynamic("northeast")(rectangle.asInstanceOf[js.Any]).asInstanceOf[Cartographic]
  inline def northeast(rectangle: Rectangle, result: Cartographic): Cartographic = (^.asInstanceOf[js.Dynamic].applyDynamic("northeast")(rectangle.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Cartographic]
  
  /**
    * Computes the northwest corner of a rectangle.
    * @param rectangle - The rectangle for which to find the corner
    * @param [result] - The object onto which to store the result.
    * @returns The modified result parameter or a new Cartographic instance if none was provided.
    */
  inline def northwest(rectangle: Rectangle): Cartographic = ^.asInstanceOf[js.Dynamic].applyDynamic("northwest")(rectangle.asInstanceOf[js.Any]).asInstanceOf[Cartographic]
  inline def northwest(rectangle: Rectangle, result: Cartographic): Cartographic = (^.asInstanceOf[js.Dynamic].applyDynamic("northwest")(rectangle.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Cartographic]
  
  /**
    * Stores the provided instance into the provided array.
    * @param value - The value to pack.
    * @param array - The array to pack into.
    * @param [startingIndex = 0] - The index into the array at which to start packing the elements.
    * @returns The array that was packed into
    */
  inline def pack(value: Rectangle, array: js.Array[Double]): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("pack")(value.asInstanceOf[js.Any], array.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  inline def pack(value: Rectangle, array: js.Array[Double], startingIndex: Double): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("pack")(value.asInstanceOf[js.Any], array.asInstanceOf[js.Any], startingIndex.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  
  /**
    * The number of elements used to pack the object into an array.
    */
  @JSImport("cesium", "Rectangle.packedLength")
  @js.native
  def packedLength: Double = js.native
  inline def packedLength_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("packedLength")(x.asInstanceOf[js.Any])
  
  /**
    * Computes a simple intersection of two rectangles.  Unlike {@link Rectangle.intersection}, this function
    * does not attempt to put the angular coordinates into a consistent range or to account for crossing the
    * anti-meridian.  As such, it can be used for rectangles where the coordinates are not simply latitude
    * and longitude (i.e. projected coordinates).
    * @param rectangle - On rectangle to find an intersection
    * @param otherRectangle - Another rectangle to find an intersection
    * @param [result] - The object onto which to store the result.
    * @returns The modified result parameter, a new Rectangle instance if none was provided or undefined if there is no intersection.
    */
  inline def simpleIntersection(rectangle: Rectangle, otherRectangle: Rectangle): js.UndefOr[Rectangle] = (^.asInstanceOf[js.Dynamic].applyDynamic("simpleIntersection")(rectangle.asInstanceOf[js.Any], otherRectangle.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Rectangle]]
  inline def simpleIntersection(rectangle: Rectangle, otherRectangle: Rectangle, result: Rectangle): js.UndefOr[Rectangle] = (^.asInstanceOf[js.Dynamic].applyDynamic("simpleIntersection")(rectangle.asInstanceOf[js.Any], otherRectangle.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Rectangle]]
  
  /**
    * Computes the southeast corner of a rectangle.
    * @param rectangle - The rectangle for which to find the corner
    * @param [result] - The object onto which to store the result.
    * @returns The modified result parameter or a new Cartographic instance if none was provided.
    */
  inline def southeast(rectangle: Rectangle): Cartographic = ^.asInstanceOf[js.Dynamic].applyDynamic("southeast")(rectangle.asInstanceOf[js.Any]).asInstanceOf[Cartographic]
  inline def southeast(rectangle: Rectangle, result: Cartographic): Cartographic = (^.asInstanceOf[js.Dynamic].applyDynamic("southeast")(rectangle.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Cartographic]
  
  /**
    * Computes the southwest corner of a rectangle.
    * @param rectangle - The rectangle for which to find the corner
    * @param [result] - The object onto which to store the result.
    * @returns The modified result parameter or a new Cartographic instance if none was provided.
    */
  inline def southwest(rectangle: Rectangle): Cartographic = ^.asInstanceOf[js.Dynamic].applyDynamic("southwest")(rectangle.asInstanceOf[js.Any]).asInstanceOf[Cartographic]
  inline def southwest(rectangle: Rectangle, result: Cartographic): Cartographic = (^.asInstanceOf[js.Dynamic].applyDynamic("southwest")(rectangle.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Cartographic]
  
  /**
    * Samples a rectangle so that it includes a list of Cartesian points suitable for passing to
    * {@link BoundingSphere#fromPoints}.  Sampling is necessary to account
    * for rectangles that cover the poles or cross the equator.
    * @param rectangle - The rectangle to subsample.
    * @param [ellipsoid = Ellipsoid.WGS84] - The ellipsoid to use.
    * @param [surfaceHeight = 0.0] - The height of the rectangle above the ellipsoid.
    * @param [result] - The array of Cartesians onto which to store the result.
    * @returns The modified result parameter or a new Array of Cartesians instances if none was provided.
    */
  inline def subsample(rectangle: Rectangle): js.Array[Cartesian3] = ^.asInstanceOf[js.Dynamic].applyDynamic("subsample")(rectangle.asInstanceOf[js.Any]).asInstanceOf[js.Array[Cartesian3]]
  inline def subsample(rectangle: Rectangle, ellipsoid: Unit, surfaceHeight: Double): js.Array[Cartesian3] = (^.asInstanceOf[js.Dynamic].applyDynamic("subsample")(rectangle.asInstanceOf[js.Any], ellipsoid.asInstanceOf[js.Any], surfaceHeight.asInstanceOf[js.Any])).asInstanceOf[js.Array[Cartesian3]]
  inline def subsample(rectangle: Rectangle, ellipsoid: Unit, surfaceHeight: Double, result: js.Array[Cartesian3]): js.Array[Cartesian3] = (^.asInstanceOf[js.Dynamic].applyDynamic("subsample")(rectangle.asInstanceOf[js.Any], ellipsoid.asInstanceOf[js.Any], surfaceHeight.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[js.Array[Cartesian3]]
  inline def subsample(rectangle: Rectangle, ellipsoid: Unit, surfaceHeight: Unit, result: js.Array[Cartesian3]): js.Array[Cartesian3] = (^.asInstanceOf[js.Dynamic].applyDynamic("subsample")(rectangle.asInstanceOf[js.Any], ellipsoid.asInstanceOf[js.Any], surfaceHeight.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[js.Array[Cartesian3]]
  inline def subsample(rectangle: Rectangle, ellipsoid: Ellipsoid): js.Array[Cartesian3] = (^.asInstanceOf[js.Dynamic].applyDynamic("subsample")(rectangle.asInstanceOf[js.Any], ellipsoid.asInstanceOf[js.Any])).asInstanceOf[js.Array[Cartesian3]]
  inline def subsample(rectangle: Rectangle, ellipsoid: Ellipsoid, surfaceHeight: Double): js.Array[Cartesian3] = (^.asInstanceOf[js.Dynamic].applyDynamic("subsample")(rectangle.asInstanceOf[js.Any], ellipsoid.asInstanceOf[js.Any], surfaceHeight.asInstanceOf[js.Any])).asInstanceOf[js.Array[Cartesian3]]
  inline def subsample(rectangle: Rectangle, ellipsoid: Ellipsoid, surfaceHeight: Double, result: js.Array[Cartesian3]): js.Array[Cartesian3] = (^.asInstanceOf[js.Dynamic].applyDynamic("subsample")(rectangle.asInstanceOf[js.Any], ellipsoid.asInstanceOf[js.Any], surfaceHeight.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[js.Array[Cartesian3]]
  inline def subsample(rectangle: Rectangle, ellipsoid: Ellipsoid, surfaceHeight: Unit, result: js.Array[Cartesian3]): js.Array[Cartesian3] = (^.asInstanceOf[js.Dynamic].applyDynamic("subsample")(rectangle.asInstanceOf[js.Any], ellipsoid.asInstanceOf[js.Any], surfaceHeight.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[js.Array[Cartesian3]]
  
  /**
    * Computes a subsection of a rectangle from normalized coordinates in the range [0.0, 1.0].
    * @param rectangle - The rectangle to subsection.
    * @param westLerp - The west interpolation factor in the range [0.0, 1.0]. Must be less than or equal to eastLerp.
    * @param southLerp - The south interpolation factor in the range [0.0, 1.0]. Must be less than or equal to northLerp.
    * @param eastLerp - The east interpolation factor in the range [0.0, 1.0]. Must be greater than or equal to westLerp.
    * @param northLerp - The north interpolation factor in the range [0.0, 1.0]. Must be greater than or equal to southLerp.
    * @param [result] - The object onto which to store the result.
    * @returns The modified result parameter or a new Rectangle instance if none was provided.
    */
  inline def subsection(rectangle: Rectangle, westLerp: Double, southLerp: Double, eastLerp: Double, northLerp: Double): Rectangle = (^.asInstanceOf[js.Dynamic].applyDynamic("subsection")(rectangle.asInstanceOf[js.Any], westLerp.asInstanceOf[js.Any], southLerp.asInstanceOf[js.Any], eastLerp.asInstanceOf[js.Any], northLerp.asInstanceOf[js.Any])).asInstanceOf[Rectangle]
  inline def subsection(
    rectangle: Rectangle,
    westLerp: Double,
    southLerp: Double,
    eastLerp: Double,
    northLerp: Double,
    result: Rectangle
  ): Rectangle = (^.asInstanceOf[js.Dynamic].applyDynamic("subsection")(rectangle.asInstanceOf[js.Any], westLerp.asInstanceOf[js.Any], southLerp.asInstanceOf[js.Any], eastLerp.asInstanceOf[js.Any], northLerp.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Rectangle]
  
  /**
    * Computes a rectangle that is the union of two rectangles.
    * @param rectangle - A rectangle to enclose in rectangle.
    * @param otherRectangle - A rectangle to enclose in a rectangle.
    * @param [result] - The object onto which to store the result.
    * @returns The modified result parameter or a new Rectangle instance if none was provided.
    */
  inline def union(rectangle: Rectangle, otherRectangle: Rectangle): Rectangle = (^.asInstanceOf[js.Dynamic].applyDynamic("union")(rectangle.asInstanceOf[js.Any], otherRectangle.asInstanceOf[js.Any])).asInstanceOf[Rectangle]
  inline def union(rectangle: Rectangle, otherRectangle: Rectangle, result: Rectangle): Rectangle = (^.asInstanceOf[js.Dynamic].applyDynamic("union")(rectangle.asInstanceOf[js.Any], otherRectangle.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Rectangle]
  
  /**
    * Retrieves an instance from a packed array.
    * @param array - The packed array.
    * @param [startingIndex = 0] - The starting index of the element to be unpacked.
    * @param [result] - The object into which to store the result.
    * @returns The modified result parameter or a new Rectangle instance if one was not provided.
    */
  inline def unpack(array: js.Array[Double]): Rectangle = ^.asInstanceOf[js.Dynamic].applyDynamic("unpack")(array.asInstanceOf[js.Any]).asInstanceOf[Rectangle]
  inline def unpack(array: js.Array[Double], startingIndex: Double): Rectangle = (^.asInstanceOf[js.Dynamic].applyDynamic("unpack")(array.asInstanceOf[js.Any], startingIndex.asInstanceOf[js.Any])).asInstanceOf[Rectangle]
  inline def unpack(array: js.Array[Double], startingIndex: Double, result: Rectangle): Rectangle = (^.asInstanceOf[js.Dynamic].applyDynamic("unpack")(array.asInstanceOf[js.Any], startingIndex.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Rectangle]
  inline def unpack(array: js.Array[Double], startingIndex: Unit, result: Rectangle): Rectangle = (^.asInstanceOf[js.Dynamic].applyDynamic("unpack")(array.asInstanceOf[js.Any], startingIndex.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Rectangle]
  
  /**
    * Checks a Rectangle's properties and throws if they are not in valid ranges.
    * @param rectangle - The rectangle to validate
    */
  inline def validate(rectangle: Rectangle): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("validate")(rectangle.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
