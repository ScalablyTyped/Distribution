package typings
package babylonjsLib.babylonjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * Class representing a vector containing 2 coordinates
     */
@JSImport("babylonjs", "Vector2")
@js.native
class Vector2 ()
  extends babylonjsLib.BABYLONNs.Vector2 {
  /**
           * Creates a new Vector2 from the given x and y coordinates
           * @param x defines the first coordinate
           * @param y defines the second coordinate
           */
  def this(/** defines the first coordinate */
  x: scala.Double) = this()
  /**
           * Creates a new Vector2 from the given x and y coordinates
           * @param x defines the first coordinate
           * @param y defines the second coordinate
           */
  def this(/** defines the first coordinate */
  x: scala.Double, /** defines the second coordinate */
  y: scala.Double) = this()
}

/**
     * Class representing a vector containing 2 coordinates
     */
@JSImport("babylonjs", "Vector2")
@js.native
object Vector2 extends js.Object {
  /**
           * Gets a new Vector2 located for "amount" (float) on the CatmullRom spline defined by the given four Vector2
           * @param value1 defines 1st point of control
           * @param value2 defines 2nd point of control
           * @param value3 defines 3rd point of control
           * @param value4 defines 4th point of control
           * @param amount defines the interpolation factor
           * @returns a new Vector2
           */
  def CatmullRom(
    value1: babylonjsLib.BABYLONNs.Vector2,
    value2: babylonjsLib.BABYLONNs.Vector2,
    value3: babylonjsLib.BABYLONNs.Vector2,
    value4: babylonjsLib.BABYLONNs.Vector2,
    amount: scala.Double
  ): babylonjsLib.BABYLONNs.Vector2 = js.native
  /**
           * Gets a new Vector2 located at the center of the vectors "value1" and "value2"
           * @param value1 defines first vector
           * @param value2 defines second vector
           * @returns a new Vector2
           */
  def Center(value1: babylonjsLib.BABYLONNs.Vector2, value2: babylonjsLib.BABYLONNs.Vector2): babylonjsLib.BABYLONNs.Vector2 = js.native
  /**
           * Returns a new Vector2 set with same the coordinates than "value" ones if the vector "value" is in the square defined by "min" and "max".
           * If a coordinate of "value" is lower than "min" coordinates, the returned Vector2 is given this "min" coordinate.
           * If a coordinate of "value" is greater than "max" coordinates, the returned Vector2 is given this "max" coordinate
           * @param value defines the value to clamp
           * @param min defines the lower limit
           * @param max defines the upper limit
           * @returns a new Vector2
           */
  def Clamp(
    value: babylonjsLib.BABYLONNs.Vector2,
    min: babylonjsLib.BABYLONNs.Vector2,
    max: babylonjsLib.BABYLONNs.Vector2
  ): babylonjsLib.BABYLONNs.Vector2 = js.native
  /**
           * Gets the distance between the vectors "value1" and "value2"
           * @param value1 defines first vector
           * @param value2 defines second vector
           * @returns the distance between vectors
           */
  def Distance(value1: babylonjsLib.BABYLONNs.Vector2, value2: babylonjsLib.BABYLONNs.Vector2): scala.Double = js.native
  /**
           * Gets the shortest distance (float) between the point "p" and the segment defined by the two points "segA" and "segB".
           * @param p defines the middle point
           * @param segA defines one point of the segment
           * @param segB defines the other point of the segment
           * @returns the shortest distance
           */
  def DistanceOfPointFromSegment(
    p: babylonjsLib.BABYLONNs.Vector2,
    segA: babylonjsLib.BABYLONNs.Vector2,
    segB: babylonjsLib.BABYLONNs.Vector2
  ): scala.Double = js.native
  /**
           * Returns the squared distance between the vectors "value1" and "value2"
           * @param value1 defines first vector
           * @param value2 defines second vector
           * @returns the squared distance between vectors
           */
  def DistanceSquared(value1: babylonjsLib.BABYLONNs.Vector2, value2: babylonjsLib.BABYLONNs.Vector2): scala.Double = js.native
  /**
           * Gets the dot product of the vector "left" and the vector "right"
           * @param left defines first vector
           * @param right defines second vector
           * @returns the dot product (float)
           */
  def Dot(left: babylonjsLib.BABYLONNs.Vector2, right: babylonjsLib.BABYLONNs.Vector2): scala.Double = js.native
  /**
           * Gets a new Vector2 set from the given index element of the given array
           * @param array defines the data source
           * @param offset defines the offset in the data source
           * @returns a new Vector2
           */
  def FromArray(array: stdLib.ArrayLike[scala.Double]): babylonjsLib.BABYLONNs.Vector2 = js.native
  /**
           * Gets a new Vector2 set from the given index element of the given array
           * @param array defines the data source
           * @param offset defines the offset in the data source
           * @returns a new Vector2
           */
  def FromArray(array: stdLib.ArrayLike[scala.Double], offset: scala.Double): babylonjsLib.BABYLONNs.Vector2 = js.native
  /**
           * Sets "result" from the given index element of the given array
           * @param array defines the data source
           * @param offset defines the offset in the data source
           * @param result defines the target vector
           */
  def FromArrayToRef(
    array: stdLib.ArrayLike[scala.Double],
    offset: scala.Double,
    result: babylonjsLib.BABYLONNs.Vector2
  ): scala.Unit = js.native
  /**
           * Returns a new Vector2 located for "amount" (float) on the Hermite spline defined by the vectors "value1", "value3", "tangent1", "tangent2"
           * @param value1 defines the 1st control point
           * @param tangent1 defines the outgoing tangent
           * @param value2 defines the 2nd control point
           * @param tangent2 defines the incoming tangent
           * @param amount defines the interpolation factor
           * @returns a new Vector2
           */
  def Hermite(
    value1: babylonjsLib.BABYLONNs.Vector2,
    tangent1: babylonjsLib.BABYLONNs.Vector2,
    value2: babylonjsLib.BABYLONNs.Vector2,
    tangent2: babylonjsLib.BABYLONNs.Vector2,
    amount: scala.Double
  ): babylonjsLib.BABYLONNs.Vector2 = js.native
  /**
           * Returns a new Vector2 located for "amount" (float) on the linear interpolation between the vector "start" adn the vector "end".
           * @param start defines the start vector
           * @param end defines the end vector
           * @param amount defines the interpolation factor
           * @returns a new Vector2
           */
  def Lerp(start: babylonjsLib.BABYLONNs.Vector2, end: babylonjsLib.BABYLONNs.Vector2, amount: scala.Double): babylonjsLib.BABYLONNs.Vector2 = js.native
  /**
           * Gets a new Vecto2 set with the maximal coordinate values from the "left" and "right" vectors
           * @param left defines 1st vector
           * @param right defines 2nd vector
           * @returns a new Vector2
           */
  def Maximize(left: babylonjsLib.BABYLONNs.Vector2, right: babylonjsLib.BABYLONNs.Vector2): babylonjsLib.BABYLONNs.Vector2 = js.native
  /**
           * Gets a new Vector2 set with the minimal coordinate values from the "left" and "right" vectors
           * @param left defines 1st vector
           * @param right defines 2nd vector
           * @returns a new Vector2
           */
  def Minimize(left: babylonjsLib.BABYLONNs.Vector2, right: babylonjsLib.BABYLONNs.Vector2): babylonjsLib.BABYLONNs.Vector2 = js.native
  /**
           * Returns a new Vector2 equal to the normalized given vector
           * @param vector defines the vector to normalize
           * @returns a new Vector2
           */
  def Normalize(vector: babylonjsLib.BABYLONNs.Vector2): babylonjsLib.BABYLONNs.Vector2 = js.native
  /**
           * Gets a new Vector2(1, 1)
           * @returns a new Vector2
           */
  def One(): babylonjsLib.BABYLONNs.Vector2 = js.native
  /**
           * Determines if a given vector is included in a triangle
           * @param p defines the vector to test
           * @param p0 defines 1st triangle point
           * @param p1 defines 2nd triangle point
           * @param p2 defines 3rd triangle point
           * @returns true if the point "p" is in the triangle defined by the vertors "p0", "p1", "p2"
           */
  def PointInTriangle(
    p: babylonjsLib.BABYLONNs.Vector2,
    p0: babylonjsLib.BABYLONNs.Vector2,
    p1: babylonjsLib.BABYLONNs.Vector2,
    p2: babylonjsLib.BABYLONNs.Vector2
  ): scala.Boolean = js.native
  /**
           * Gets a new Vector2 set with the transformed coordinates of the given vector by the given transformation matrix
           * @param vector defines the vector to transform
           * @param transformation defines the matrix to apply
           * @returns a new Vector2
           */
  def Transform(vector: babylonjsLib.BABYLONNs.Vector2, transformation: babylonjsLib.BABYLONNs.Matrix): babylonjsLib.BABYLONNs.Vector2 = js.native
  /**
           * Transforms the given vector coordinates by the given transformation matrix and stores the result in the vector "result" coordinates
           * @param vector defines the vector to transform
           * @param transformation defines the matrix to apply
           * @param result defines the target vector
           */
  def TransformToRef(
    vector: babylonjsLib.BABYLONNs.Vector2,
    transformation: babylonjsLib.BABYLONNs.Matrix,
    result: babylonjsLib.BABYLONNs.Vector2
  ): scala.Unit = js.native
  /**
           * Gets a new Vector2(0, 0)
           * @returns a new Vector2
           */
  def Zero(): babylonjsLib.BABYLONNs.Vector2 = js.native
}

