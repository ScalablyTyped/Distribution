package typings
package babylonjsLib.BABYLONNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Class representing a vector containing 2 coordinates
  */
@JSGlobal("BABYLON.Vector2")
@js.native
/**
  * Creates a new Vector2 from the given x and y coordinates
  * @param x defines the first coordinate
  * @param y defines the second coordinate
  */
class Vector2 () extends js.Object {
  def this(/** defines the first coordinate */
  x: scala.Double) = this()
  def this(/** defines the first coordinate */
  x: scala.Double, /** defines the second coordinate */
  y: scala.Double) = this()
  /** defines the first coordinate */
  var x: scala.Double = js.native
  /** defines the second coordinate */
  var y: scala.Double = js.native
  /**
    * Add another vector with the current one
    * @param otherVector defines the other vector
    * @returns a new Vector2 set with the addition of the current Vector2 and the given one coordinates
    */
  def add(otherVector: Vector2): Vector2 = js.native
  /**
    * Set the Vector2 coordinates by adding the given Vector2 coordinates
    * @param otherVector defines the other vector
    * @returns the current updated Vector2
    */
  def addInPlace(otherVector: Vector2): Vector2 = js.native
  /**
    * Sets the "result" coordinates with the addition of the current Vector2 and the given one coordinates
    * @param otherVector defines the other vector
    * @param result defines the target vector
    * @returns the unmodified current Vector2
    */
  def addToRef(otherVector: Vector2, result: Vector2): Vector2 = js.native
  /**
    * Gets a new Vector2 by adding the current Vector2 coordinates to the given Vector3 x, y coordinates
    * @param otherVector defines the other vector
    * @returns a new Vector2
    */
  def addVector3(otherVector: Vector3): Vector2 = js.native
  /**
    * Copy the current vector to an array
    * @returns a new array with 2 elements: the Vector2 coordinates.
    */
  def asArray(): js.Array[scala.Double] = js.native
  /**
    * Sets the Vector2 coordinates with the given Vector2 coordinates
    * @param source defines the source Vector2
    * @returns the current updated Vector2
    */
  def copyFrom(source: Vector2): Vector2 = js.native
  /**
    * Sets the Vector2 coordinates with the given floats
    * @param x defines the first coordinate
    * @param y defines the second coordinate
    * @returns the current updated Vector2
    */
  def copyFromFloats(x: scala.Double, y: scala.Double): Vector2 = js.native
  /**
    * Returns a new Vector2 set with the Vector2 coordinates divided by the given one coordinates
    * @param otherVector defines the other vector
    * @returns a new Vector2
    */
  def divide(otherVector: Vector2): Vector2 = js.native
  /**
    * Divides the current Vector2 coordinates by the given ones
    * @param otherVector defines the other vector
    * @returns the current updated Vector2
    */
  def divideInPlace(otherVector: Vector2): Vector2 = js.native
  /**
    * Sets the "result" coordinates with the Vector2 divided by the given one coordinates
    * @param otherVector defines the other vector
    * @param result defines the target vector
    * @returns the unmodified current Vector2
    */
  def divideToRef(otherVector: Vector2, result: Vector2): Vector2 = js.native
  /**
    * Gets a boolean if two vectors are equals
    * @param otherVector defines the other vector
    * @returns true if the given vector coordinates strictly equal the current Vector2 ones
    */
  def equals(otherVector: Vector2): scala.Boolean = js.native
  /**
    * Gets a boolean if two vectors are equals (using an epsilon value)
    * @param otherVector defines the other vector
    * @param epsilon defines the minimal distance to consider equality
    * @returns true if the given vector coordinates are close to the current ones by a distance of epsilon.
    */
  def equalsWithEpsilon(otherVector: Vector2): scala.Boolean = js.native
  def equalsWithEpsilon(otherVector: Vector2, epsilon: scala.Double): scala.Boolean = js.native
  /**
    * Gets a new Vector2 from current Vector2 floored values
    * @returns a new Vector2
    */
  def floor(): Vector2 = js.native
  /**
    * Gets a new Vector2 from current Vector2 floored values
    * @returns a new Vector2
    */
  def fract(): Vector2 = js.native
  /**
    * Gets class name
    * @returns the string "Vector2"
    */
  def getClassName(): java.lang.String = js.native
  /**
    * Gets current vector hash code
    * @returns the Vector2 hash code as a number
    */
  def getHashCode(): scala.Double = js.native
  /**
    * Gets the length of the vector
    * @returns the vector length (float)
    */
  def length(): scala.Double = js.native
  /**
    * Gets the vector squared length
    * @returns the vector squared length (float)
    */
  def lengthSquared(): scala.Double = js.native
  /**
    * Returns a new Vector2 set with the multiplication of the current Vector2 and the given one coordinates
    * @param otherVector defines the other vector
    * @returns a new Vector2
    */
  def multiply(otherVector: Vector2): Vector2 = js.native
  /**
    * Gets a new Vector2 set with the Vector2 coordinates multiplied by the given floats
    * @param x defines the first coordinate
    * @param y defines the second coordinate
    * @returns a new Vector2
    */
  def multiplyByFloats(x: scala.Double, y: scala.Double): Vector2 = js.native
  /**
    * Multiplies in place the current Vector2 coordinates by the given ones
    * @param otherVector defines the other vector
    * @returns the current updated Vector2
    */
  def multiplyInPlace(otherVector: Vector2): Vector2 = js.native
  /**
    * Sets "result" coordinates with the multiplication of the current Vector2 and the given one coordinates
    * @param otherVector defines the other vector
    * @param result defines the target vector
    * @returns the unmodified current Vector2
    */
  def multiplyToRef(otherVector: Vector2, result: Vector2): Vector2 = js.native
  /**
    * Gets a new Vector2 with current Vector2 negated coordinates
    * @returns a new Vector2
    */
  def negate(): Vector2 = js.native
  /**
    * Normalize the vector
    * @returns the current updated Vector2
    */
  def normalize(): Vector2 = js.native
  /**
    * Returns a new Vector2 scaled by "scale" from the current Vector2
    * @param scale defines the scaling factor
    * @returns a new Vector2
    */
  def scale(scale: scala.Double): Vector2 = js.native
  /**
    * Scale the current Vector2 values by a factor and add the result to a given Vector2
    * @param scale defines the scale factor
    * @param result defines the Vector2 object where to store the result
    * @returns the unmodified current Vector2
    */
  def scaleAndAddToRef(scale: scala.Double, result: Vector2): Vector2 = js.native
  /**
    * Multiply the Vector2 coordinates by scale
    * @param scale defines the scaling factor
    * @returns the current updated Vector2
    */
  def scaleInPlace(scale: scala.Double): Vector2 = js.native
  /**
    * Scale the current Vector2 values by a factor to a given Vector2
    * @param scale defines the scale factor
    * @param result defines the Vector2 object where to store the result
    * @returns the unmodified current Vector2
    */
  def scaleToRef(scale: scala.Double, result: Vector2): Vector2 = js.native
  /**
    * Sets the Vector2 coordinates with the given floats
    * @param x defines the first coordinate
    * @param y defines the second coordinate
    * @returns the current updated Vector2
    */
  def set(x: scala.Double, y: scala.Double): Vector2 = js.native
  /**
    * Gets a new Vector2 set with the subtracted coordinates of the given one from the current Vector2
    * @param otherVector defines the other vector
    * @returns a new Vector2
    */
  def subtract(otherVector: Vector2): Vector2 = js.native
  /**
    * Sets the current Vector2 coordinates by subtracting from it the given one coordinates
    * @param otherVector defines the other vector
    * @returns the current updated Vector2
    */
  def subtractInPlace(otherVector: Vector2): Vector2 = js.native
  /**
    * Sets the "result" coordinates with the subtraction of the given one from the current Vector2 coordinates.
    * @param otherVector defines the other vector
    * @param result defines the target vector
    * @returns the unmodified current Vector2
    */
  def subtractToRef(otherVector: Vector2, result: Vector2): Vector2 = js.native
  /**
    * Sets the Vector2 coordinates in the given array or Float32Array from the given index.
    * @param array defines the source array
    * @param index defines the offset in source array
    * @returns the current Vector2
    */
  def toArray(array: FloatArray): Vector2 = js.native
  def toArray(array: FloatArray, index: scala.Double): Vector2 = js.native
}

/**
  * Class representing a vector containing 2 coordinates
  */
@JSGlobal("BABYLON.Vector2")
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

