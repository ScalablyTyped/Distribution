package typings
package babylonjsLib.BABYLONNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * Classed used to store (x,y,z) vector representation
     * A Vector3 is the main object used in 3D geometry
     * It can represent etiher the coordinates of a point the space, either a direction
     * Reminder: Babylon.js uses a left handed forward facing system
     */
@JSGlobal("BABYLON.Vector3")
@js.native
class Vector3 () extends js.Object {
  /**
           * Creates a new Vector3 object from the given x, y, z (floats) coordinates.
           * @param x defines the first coordinates (on X axis)
           * @param y defines the second coordinates (on Y axis)
           * @param z defines the third coordinates (on Z axis)
           */
  def this(/**
           * Defines the first coordinates (on X axis)
           */
  x: scala.Double) = this()
  /**
           * Creates a new Vector3 object from the given x, y, z (floats) coordinates.
           * @param x defines the first coordinates (on X axis)
           * @param y defines the second coordinates (on Y axis)
           * @param z defines the third coordinates (on Z axis)
           */
  def this(/**
           * Defines the first coordinates (on X axis)
           */
  x: scala.Double, /**
           * Defines the second coordinates (on Y axis)
           */
  y: scala.Double) = this()
  /**
           * Creates a new Vector3 object from the given x, y, z (floats) coordinates.
           * @param x defines the first coordinates (on X axis)
           * @param y defines the second coordinates (on Y axis)
           * @param z defines the third coordinates (on Z axis)
           */
  def this(/**
           * Defines the first coordinates (on X axis)
           */
  x: scala.Double, /**
           * Defines the second coordinates (on Y axis)
           */
  y: scala.Double, /**
           * Defines the third coordinates (on Z axis)
           */
  z: scala.Double) = this()
  /**
           * Gets a boolean indicating that the vector is non uniform meaning x, y or z are not all the same
           */
  val isNonUniform: scala.Boolean = js.native
  /**
           * Defines the first coordinates (on X axis)
           */
  var x: scala.Double = js.native
  /**
           * Defines the second coordinates (on Y axis)
           */
  var y: scala.Double = js.native
  /**
           * Defines the third coordinates (on Z axis)
           */
  var z: scala.Double = js.native
  /**
           * Gets a new Vector3, result of the addition the current Vector3 and the given vector
           * @param otherVector defines the second operand
           * @returns the resulting Vector3
           */
  def add(otherVector: Vector3): Vector3 = js.native
  /**
           * Adds the given vector to the current Vector3
           * @param otherVector defines the second operand
           * @returns the current updated Vector3
           */
  def addInPlace(otherVector: Vector3): Vector3 = js.native
  /**
           * Adds the current Vector3 to the given one and stores the result in the vector "result"
           * @param otherVector defines the second operand
           * @param result defines the Vector3 object where to store the result
           * @returns the current Vector3
           */
  def addToRef(otherVector: Vector3, result: Vector3): Vector3 = js.native
  /**
           * Creates an array containing three elements : the coordinates of the Vector3
           * @returns a new array of numbers
           */
  def asArray(): js.Array[scala.Double] = js.native
  /**
           * Copies the given vector coordinates to the current Vector3 ones
           * @param source defines the source Vector3
           * @returns the current updated Vector3
           */
  def copyFrom(source: Vector3): Vector3 = js.native
  /**
           * Copies the given floats to the current Vector3 coordinates
           * @param x defines the x coordinate of the operand
           * @param y defines the y coordinate of the operand
           * @param z defines the z coordinate of the operand
           * @returns the current updated Vector3
           */
  def copyFromFloats(x: scala.Double, y: scala.Double, z: scala.Double): Vector3 = js.native
  /**
           * Returns a new Vector3 set with the result of the division of the current Vector3 coordinates by the given ones
           * @param otherVector defines the second operand
           * @returns the new Vector3
           */
  def divide(otherVector: Vector3): Vector3 = js.native
  /**
           * Divides the current Vector3 coordinates by the given ones.
           * @param otherVector defines the second operand
           * @returns the current updated Vector3
           */
  def divideInPlace(otherVector: Vector3): Vector3 = js.native
  /**
           * Divides the current Vector3 coordinates by the given ones and stores the result in the given vector "result"
           * @param otherVector defines the second operand
           * @param result defines the Vector3 object where to store the result
           * @returns the current Vector3
           */
  def divideToRef(otherVector: Vector3, result: Vector3): Vector3 = js.native
  /**
           * Returns true if the current Vector3 and the given vector coordinates are strictly equal
           * @param otherVector defines the second operand
           * @returns true if both vectors are equals
           */
  def equals(otherVector: Vector3): scala.Boolean = js.native
  /**
           * Returns true if the current Vector3 coordinates equals the given floats
           * @param x defines the x coordinate of the operand
           * @param y defines the y coordinate of the operand
           * @param z defines the z coordinate of the operand
           * @returns true if both vectors are equals
           */
  def equalsToFloats(x: scala.Double, y: scala.Double, z: scala.Double): scala.Boolean = js.native
  /**
           * Returns true if the current Vector3 and the given vector coordinates are distant less than epsilon
           * @param otherVector defines the second operand
           * @param epsilon defines the minimal distance to define values as equals
           * @returns true if both vectors are distant less than epsilon
           */
  def equalsWithEpsilon(otherVector: Vector3): scala.Boolean = js.native
  /**
           * Returns true if the current Vector3 and the given vector coordinates are distant less than epsilon
           * @param otherVector defines the second operand
           * @param epsilon defines the minimal distance to define values as equals
           * @returns true if both vectors are distant less than epsilon
           */
  def equalsWithEpsilon(otherVector: Vector3, epsilon: scala.Double): scala.Boolean = js.native
  /**
           * Gets a new Vector3 from current Vector3 floored values
           * @returns a new Vector3
           */
  def floor(): Vector3 = js.native
  /**
           * Gets a new Vector3 from current Vector3 floored values
           * @returns a new Vector3
           */
  def fract(): Vector3 = js.native
  /**
           * Gets the class name
           * @returns the string "Vector3"
           */
  def getClassName(): java.lang.String = js.native
  /**
           * Creates the Vector3 hash code
           * @returns a number which tends to be unique between Vector3 instances
           */
  def getHashCode(): scala.Double = js.native
  /**
           * Gets the length of the Vector3
           * @returns the length of the Vecto3
           */
  def length(): scala.Double = js.native
  /**
           * Gets the squared length of the Vector3
           * @returns squared length of the Vector3
           */
  def lengthSquared(): scala.Double = js.native
  /**
           * Updates the current Vector3 with the maximal coordinate values between its and the given vector ones.
           * @param other defines the second operand
           * @returns the current updated Vector3
           */
  def maximizeInPlace(other: Vector3): Vector3 = js.native
  /**
           * Updates the current Vector3 with the maximal coordinate values between its and the given coordinates.
           * @param x defines the x coordinate of the operand
           * @param y defines the y coordinate of the operand
           * @param z defines the z coordinate of the operand
           * @returns the current updated Vector3
           */
  def maximizeInPlaceFromFloats(x: scala.Double, y: scala.Double, z: scala.Double): Vector3 = js.native
  /**
           * Updates the current Vector3 with the minimal coordinate values between its and the given vector ones
           * @param other defines the second operand
           * @returns the current updated Vector3
           */
  def minimizeInPlace(other: Vector3): Vector3 = js.native
  /**
           * Updates the current Vector3 with the minimal coordinate values between its and the given coordinates
           * @param x defines the x coordinate of the operand
           * @param y defines the y coordinate of the operand
           * @param z defines the z coordinate of the operand
           * @returns the current updated Vector3
           */
  def minimizeInPlaceFromFloats(x: scala.Double, y: scala.Double, z: scala.Double): Vector3 = js.native
  /**
           * Returns a new Vector3, result of the multiplication of the current Vector3 by the given vector
           * @param otherVector defines the second operand
           * @returns the new Vector3
           */
  def multiply(otherVector: Vector3): Vector3 = js.native
  /**
           * Returns a new Vector3 set with the result of the mulliplication of the current Vector3 coordinates by the given floats
           * @param x defines the x coordinate of the operand
           * @param y defines the y coordinate of the operand
           * @param z defines the z coordinate of the operand
           * @returns the new Vector3
           */
  def multiplyByFloats(x: scala.Double, y: scala.Double, z: scala.Double): Vector3 = js.native
  /**
           * Multiplies the current Vector3 coordinates by the given ones
           * @param otherVector defines the second operand
           * @returns the current updated Vector3
           */
  def multiplyInPlace(otherVector: Vector3): Vector3 = js.native
  /**
           * Multiplies the current Vector3 by the given one and stores the result in the given vector "result"
           * @param otherVector defines the second operand
           * @param result defines the Vector3 object where to store the result
           * @returns the current Vector3
           */
  def multiplyToRef(otherVector: Vector3, result: Vector3): Vector3 = js.native
  /**
           * Gets a new Vector3 set with the current Vector3 negated coordinates
           * @returns a new Vector3
           */
  def negate(): Vector3 = js.native
  /**
           * Normalize the current Vector3.
           * Please note that this is an in place operation.
           * @returns the current updated Vector3
           */
  def normalize(): Vector3 = js.native
  /**
           * Normalize the current Vector3 to a new vector
           * @returns the new Vector3
           */
  def normalizeToNew(): Vector3 = js.native
  /**
           * Normalize the current Vector3 to the reference
           * @param reference define the Vector3 to update
           * @returns the updated Vector3
           */
  def normalizeToRef(reference: Vector3): Vector3 = js.native
  /**
           * Returns a new Vector3 set with the current Vector3 coordinates multiplied by the float "scale"
           * @param scale defines the multiplier factor
           * @returns a new Vector3
           */
  def scale(scale: scala.Double): Vector3 = js.native
  /**
           * Scale the current Vector3 values by a factor and add the result to a given Vector3
           * @param scale defines the scale factor
           * @param result defines the Vector3 object where to store the result
           * @returns the unmodified current Vector3
           */
  def scaleAndAddToRef(scale: scala.Double, result: Vector3): Vector3 = js.native
  /**
           * Multiplies the Vector3 coordinates by the float "scale"
           * @param scale defines the multiplier factor
           * @returns the current updated Vector3
           */
  def scaleInPlace(scale: scala.Double): Vector3 = js.native
  /**
           * Multiplies the current Vector3 coordinates by the float "scale" and stores the result in the given vector "result" coordinates
           * @param scale defines the multiplier factor
           * @param result defines the Vector3 object where to store the result
           * @returns the current Vector3
           */
  def scaleToRef(scale: scala.Double, result: Vector3): Vector3 = js.native
  /**
           * Copies the given floats to the current Vector3 coordinates
           * @param x defines the x coordinate of the operand
           * @param y defines the y coordinate of the operand
           * @param z defines the z coordinate of the operand
           * @returns the current updated Vector3
           */
  def set(x: scala.Double, y: scala.Double, z: scala.Double): Vector3 = js.native
  /**
           * Returns a new Vector3, result of the subtraction of the given vector from the current Vector3
           * @param otherVector defines the second operand
           * @returns the resulting Vector3
           */
  def subtract(otherVector: Vector3): Vector3 = js.native
  /**
           * Returns a new Vector3 set with the subtraction of the given floats from the current Vector3 coordinates
           * @param x defines the x coordinate of the operand
           * @param y defines the y coordinate of the operand
           * @param z defines the z coordinate of the operand
           * @returns the resulting Vector3
           */
  def subtractFromFloats(x: scala.Double, y: scala.Double, z: scala.Double): Vector3 = js.native
  /**
           * Subtracts the given floats from the current Vector3 coordinates and set the given vector "result" with this result
           * @param x defines the x coordinate of the operand
           * @param y defines the y coordinate of the operand
           * @param z defines the z coordinate of the operand
           * @param result defines the Vector3 object where to store the result
           * @returns the current Vector3
           */
  def subtractFromFloatsToRef(x: scala.Double, y: scala.Double, z: scala.Double, result: Vector3): Vector3 = js.native
  /**
           * Subtract the given vector from the current Vector3
           * @param otherVector defines the second operand
           * @returns the current updated Vector3
           */
  def subtractInPlace(otherVector: Vector3): Vector3 = js.native
  /**
           * Subtracts the given vector from the current Vector3 and stores the result in the vector "result".
           * @param otherVector defines the second operand
           * @param result defines the Vector3 object where to store the result
           * @returns the current Vector3
           */
  def subtractToRef(otherVector: Vector3, result: Vector3): Vector3 = js.native
  /**
           * Populates the given array or Float32Array from the given index with the successive coordinates of the Vector3
           * @param array defines the destination array
           * @param index defines the offset in the destination array
           * @returns the current Vector3
           */
  def toArray(array: FloatArray): Vector3 = js.native
  /**
           * Populates the given array or Float32Array from the given index with the successive coordinates of the Vector3
           * @param array defines the destination array
           * @param index defines the offset in the destination array
           * @returns the current Vector3
           */
  def toArray(array: FloatArray, index: scala.Double): Vector3 = js.native
  /**
           * Converts the current Vector3 into a quaternion (considering that the Vector3 contains Euler angles representation of a rotation)
           * @returns a new Quaternion object, computed from the Vector3 coordinates
           */
  def toQuaternion(): Quaternion = js.native
}

/**
     * Classed used to store (x,y,z) vector representation
     * A Vector3 is the main object used in 3D geometry
     * It can represent etiher the coordinates of a point the space, either a direction
     * Reminder: Babylon.js uses a left handed forward facing system
     */
@JSGlobal("BABYLON.Vector3")
@js.native
object Vector3 extends js.Object {
  var _viewportMatrixCache: js.Any = js.native
  /**
           * Returns a new Vector3 set to (0.0, 0.0, -1.0)
           * @returns a new forward Vector3
           */
  def Backward(): babylonjsLib.BABYLONNs.Vector3 = js.native
  /**
           * Returns a new Vector3 located for "amount" on the CatmullRom interpolation spline defined by the vectors "value1", "value2", "value3", "value4"
           * @param value1 defines the first control point
           * @param value2 defines the second control point
           * @param value3 defines the third control point
           * @param value4 defines the fourth control point
           * @param amount defines the amount on the spline to use
           * @returns the new Vector3
           */
  def CatmullRom(
    value1: babylonjsLib.BABYLONNs.Vector3,
    value2: babylonjsLib.BABYLONNs.Vector3,
    value3: babylonjsLib.BABYLONNs.Vector3,
    value4: babylonjsLib.BABYLONNs.Vector3,
    amount: scala.Double
  ): babylonjsLib.BABYLONNs.Vector3 = js.native
  /**
           * Returns a new Vector3 located at the center between "value1" and "value2"
           * @param value1 defines the first operand
           * @param value2 defines the second operand
           * @returns the new Vector3
           */
  def Center(value1: babylonjsLib.BABYLONNs.Vector3, value2: babylonjsLib.BABYLONNs.Vector3): babylonjsLib.BABYLONNs.Vector3 = js.native
  /**
           * Returns a new Vector3 set with the coordinates of "value", if the vector "value" is in the cube defined by the vectors "min" and "max"
           * If a coordinate value of "value" is lower than one of the "min" coordinate, then this "value" coordinate is set with the "min" one
           * If a coordinate value of "value" is greater than one of the "max" coordinate, then this "value" coordinate is set with the "max" one
           * @param value defines the current value
           * @param min defines the lower range value
           * @param max defines the upper range value
           * @returns the new Vector3
           */
  def Clamp(
    value: babylonjsLib.BABYLONNs.Vector3,
    min: babylonjsLib.BABYLONNs.Vector3,
    max: babylonjsLib.BABYLONNs.Vector3
  ): babylonjsLib.BABYLONNs.Vector3 = js.native
  /**
           * Returns a new Vector3 as the cross product of the vectors "left" and "right"
           * The cross product is then orthogonal to both "left" and "right"
           * @param left defines the left operand
           * @param right defines the right operand
           * @returns the cross product
           */
  def Cross(left: babylonjsLib.BABYLONNs.Vector3, right: babylonjsLib.BABYLONNs.Vector3): babylonjsLib.BABYLONNs.Vector3 = js.native
  /**
           * Sets the given vector "result" with the cross product of "left" and "right"
           * The cross product is then orthogonal to both "left" and "right"
           * @param left defines the left operand
           * @param right defines the right operand
           * @param result defines the Vector3 where to store the result
           */
  def CrossToRef(
    left: babylonjsLib.BABYLONNs.Vector3,
    right: babylonjsLib.BABYLONNs.Vector3,
    result: babylonjsLib.BABYLONNs.Vector3
  ): scala.Unit = js.native
  /**
           * Returns the distance between the vectors "value1" and "value2"
           * @param value1 defines the first operand
           * @param value2 defines the second operand
           * @returns the distance
           */
  def Distance(value1: babylonjsLib.BABYLONNs.Vector3, value2: babylonjsLib.BABYLONNs.Vector3): scala.Double = js.native
  /**
           * Returns the squared distance between the vectors "value1" and "value2"
           * @param value1 defines the first operand
           * @param value2 defines the second operand
           * @returns the squared distance
           */
  def DistanceSquared(value1: babylonjsLib.BABYLONNs.Vector3, value2: babylonjsLib.BABYLONNs.Vector3): scala.Double = js.native
  /**
           * Returns the dot product (float) between the vectors "left" and "right"
           * @param left defines the left operand
           * @param right defines the right operand
           * @returns the dot product
           */
  def Dot(left: babylonjsLib.BABYLONNs.Vector3, right: babylonjsLib.BABYLONNs.Vector3): scala.Double = js.native
  /**
           * Returns a new Vector3 set to (0.0, -1.0, 0.0)
           * @returns a new down Vector3
           */
  def Down(): babylonjsLib.BABYLONNs.Vector3 = js.native
  /**
           * Returns a new Vector3 set to (0.0, 0.0, 1.0)
           * @returns a new forward Vector3
           */
  def Forward(): babylonjsLib.BABYLONNs.Vector3 = js.native
  /**
           * Returns a new Vector3 set from the index "offset" of the given array
           * @param array defines the source array
           * @param offset defines the offset in the source array
           * @returns the new Vector3
           */
  def FromArray(array: stdLib.ArrayLike[scala.Double]): babylonjsLib.BABYLONNs.Vector3 = js.native
  /**
           * Returns a new Vector3 set from the index "offset" of the given array
           * @param array defines the source array
           * @param offset defines the offset in the source array
           * @returns the new Vector3
           */
  def FromArray(array: stdLib.ArrayLike[scala.Double], offset: scala.Double): babylonjsLib.BABYLONNs.Vector3 = js.native
  /**
           * Sets the given vector "result" with the element values from the index "offset" of the given array
           * @param array defines the source array
           * @param offset defines the offset in the source array
           * @param result defines the Vector3 where to store the result
           */
  def FromArrayToRef(
    array: stdLib.ArrayLike[scala.Double],
    offset: scala.Double,
    result: babylonjsLib.BABYLONNs.Vector3
  ): scala.Unit = js.native
  /**
           * Returns a new Vector3 set from the index "offset" of the given Float32Array
           * This function is deprecated.  Use FromArray instead
           * @param array defines the source array
           * @param offset defines the offset in the source array
           * @returns the new Vector3
           */
  def FromFloatArray(array: stdLib.Float32Array): babylonjsLib.BABYLONNs.Vector3 = js.native
  /**
           * Returns a new Vector3 set from the index "offset" of the given Float32Array
           * This function is deprecated.  Use FromArray instead
           * @param array defines the source array
           * @param offset defines the offset in the source array
           * @returns the new Vector3
           */
  def FromFloatArray(array: stdLib.Float32Array, offset: scala.Double): babylonjsLib.BABYLONNs.Vector3 = js.native
  /**
           * Sets the given vector "result" with the element values from the index "offset" of the given Float32Array
           * This function is deprecated.  Use FromArrayToRef instead.
           * @param array defines the source array
           * @param offset defines the offset in the source array
           * @param result defines the Vector3 where to store the result
           */
  def FromFloatArrayToRef(array: stdLib.Float32Array, offset: scala.Double, result: babylonjsLib.BABYLONNs.Vector3): scala.Unit = js.native
  /**
           * Sets the given vector "result" with the given floats.
           * @param x defines the x coordinate of the source
           * @param y defines the y coordinate of the source
           * @param z defines the z coordinate of the source
           * @param result defines the Vector3 where to store the result
           */
  def FromFloatsToRef(x: scala.Double, y: scala.Double, z: scala.Double, result: babylonjsLib.BABYLONNs.Vector3): scala.Unit = js.native
  /**
           * Get angle between two vectors
           * @param vector0 angle between vector0 and vector1
           * @param vector1 angle between vector0 and vector1
           * @param normal direction of the normal
           * @return the angle between vector0 and vector1
           */
  def GetAngleBetweenVectors(
    vector0: babylonjsLib.BABYLONNs.Vector3,
    vector1: babylonjsLib.BABYLONNs.Vector3,
    normal: babylonjsLib.BABYLONNs.Vector3
  ): scala.Double = js.native
  /**
           * Get the clip factor between two vectors
           * @param vector0 defines the first operand
           * @param vector1 defines the second operand
           * @param axis defines the axis to use
           * @param size defines the size along the axis
           * @returns the clip factor
           */
  def GetClipFactor(
    vector0: babylonjsLib.BABYLONNs.Vector3,
    vector1: babylonjsLib.BABYLONNs.Vector3,
    axis: babylonjsLib.BABYLONNs.Vector3,
    size: scala.Double
  ): scala.Double = js.native
  /**
           * Returns a new Vector3 located for "amount" (float) on the Hermite interpolation spline defined by the vectors "value1", "tangent1", "value2", "tangent2"
           * @param value1 defines the first control point
           * @param tangent1 defines the first tangent vector
           * @param value2 defines the second control point
           * @param tangent2 defines the second tangent vector
           * @param amount defines the amount on the interpolation spline (between 0 and 1)
           * @returns the new Vector3
           */
  def Hermite(
    value1: babylonjsLib.BABYLONNs.Vector3,
    tangent1: babylonjsLib.BABYLONNs.Vector3,
    value2: babylonjsLib.BABYLONNs.Vector3,
    tangent2: babylonjsLib.BABYLONNs.Vector3,
    amount: scala.Double
  ): babylonjsLib.BABYLONNs.Vector3 = js.native
  /**
           * Returns a new Vector3 set to (-1.0, 0.0, 0.0)
           * @returns a new left Vector3
           */
  def Left(): babylonjsLib.BABYLONNs.Vector3 = js.native
  /**
           * Returns a new Vector3 located for "amount" (float) on the linear interpolation between the vectors "start" and "end"
           * @param start defines the start value
           * @param end defines the end value
           * @param amount max defines amount between both (between 0 and 1)
           * @returns the new Vector3
           */
  def Lerp(start: babylonjsLib.BABYLONNs.Vector3, end: babylonjsLib.BABYLONNs.Vector3, amount: scala.Double): babylonjsLib.BABYLONNs.Vector3 = js.native
  /**
           * Sets the given vector "result" with the result of the linear interpolation from the vector "start" for "amount" to the vector "end"
           * @param start defines the start value
           * @param end defines the end value
           * @param amount max defines amount between both (between 0 and 1)
           * @param result defines the Vector3 where to store the result
           */
  def LerpToRef(
    start: babylonjsLib.BABYLONNs.Vector3,
    end: babylonjsLib.BABYLONNs.Vector3,
    amount: scala.Double,
    result: babylonjsLib.BABYLONNs.Vector3
  ): scala.Unit = js.native
  /**
           * Gets the maximal coordinate values between two Vector3
           * @param left defines the first operand
           * @param right defines the second operand
           * @returns the new Vector3
           */
  def Maximize(left: babylonjsLib.BABYLONNs.Vector3, right: babylonjsLib.BABYLONNs.Vector3): babylonjsLib.BABYLONNs.Vector3 = js.native
  /**
           * Gets the minimal coordinate values between two Vector3
           * @param left defines the first operand
           * @param right defines the second operand
           * @returns the new Vector3
           */
  def Minimize(left: babylonjsLib.BABYLONNs.Vector3, right: babylonjsLib.BABYLONNs.Vector3): babylonjsLib.BABYLONNs.Vector3 = js.native
  /**
           * Returns a new Vector3 as the normalization of the given vector
           * @param vector defines the Vector3 to normalize
           * @returns the new Vector3
           */
  def Normalize(vector: babylonjsLib.BABYLONNs.Vector3): babylonjsLib.BABYLONNs.Vector3 = js.native
  /**
           * Sets the given vector "result" with the normalization of the given first vector
           * @param vector defines the Vector3 to normalize
           * @param result defines the Vector3 where to store the result
           */
  def NormalizeToRef(vector: babylonjsLib.BABYLONNs.Vector3, result: babylonjsLib.BABYLONNs.Vector3): scala.Unit = js.native
  /**
           * Returns a new Vector3 set to (1.0, 1.0, 1.0)
           * @returns a new unit Vector3
           */
  def One(): babylonjsLib.BABYLONNs.Vector3 = js.native
  /**
           * Project a Vector3 onto screen space
           * @param vector defines the Vector3 to project
           * @param world defines the world matrix to use
           * @param transform defines the transform (view x projection) matrix to use
           * @param viewport defines the screen viewport to use
           * @returns the new Vector3
           */
  def Project(
    vector: babylonjsLib.BABYLONNs.Vector3,
    world: babylonjsLib.BABYLONNs.Matrix,
    transform: babylonjsLib.BABYLONNs.Matrix,
    viewport: babylonjsLib.BABYLONNs.Viewport
  ): babylonjsLib.BABYLONNs.Vector3 = js.native
  /**
           * Returns a new Vector3 set to (1.0, 0.0, 0.0)
           * @returns a new right Vector3
           */
  def Right(): babylonjsLib.BABYLONNs.Vector3 = js.native
  /**
           * Given three orthogonal normalized left-handed oriented Vector3 axis in space (target system),
           * RotationFromAxis() returns the rotation Euler angles (ex : rotation.x, rotation.y, rotation.z) to apply
           * to something in order to rotate it from its local system to the given target system
           * Note: axis1, axis2 and axis3 are normalized during this operation
           * @param axis1 defines the first axis
           * @param axis2 defines the second axis
           * @param axis3 defines the third axis
           * @returns a new Vector3
           */
  def RotationFromAxis(
    axis1: babylonjsLib.BABYLONNs.Vector3,
    axis2: babylonjsLib.BABYLONNs.Vector3,
    axis3: babylonjsLib.BABYLONNs.Vector3
  ): babylonjsLib.BABYLONNs.Vector3 = js.native
  /**
           * The same than RotationFromAxis but updates the given ref Vector3 parameter instead of returning a new Vector3
           * @param axis1 defines the first axis
           * @param axis2 defines the second axis
           * @param axis3 defines the third axis
           * @param ref defines the Vector3 where to store the result
           */
  def RotationFromAxisToRef(
    axis1: babylonjsLib.BABYLONNs.Vector3,
    axis2: babylonjsLib.BABYLONNs.Vector3,
    axis3: babylonjsLib.BABYLONNs.Vector3,
    ref: babylonjsLib.BABYLONNs.Vector3
  ): scala.Unit = js.native
  /**
           * Returns a new Vector3 set with the result of the transformation by the given matrix of the given vector.
           * This method computes tranformed coordinates only, not transformed direction vectors (ie. it takes translation in account)
           * @param vector defines the Vector3 to transform
           * @param transformation defines the transformation matrix
           * @returns the transformed Vector3
           */
  def TransformCoordinates(vector: babylonjsLib.BABYLONNs.Vector3, transformation: babylonjsLib.BABYLONNs.Matrix): babylonjsLib.BABYLONNs.Vector3 = js.native
  /**
           * Sets the given vector "result" coordinates with the result of the transformation by the given matrix of the given floats (x, y, z)
           * This method computes tranformed coordinates only, not transformed direction vectors
           * @param x define the x coordinate of the source vector
           * @param y define the y coordinate of the source vector
           * @param z define the z coordinate of the source vector
           * @param transformation defines the transformation matrix
           * @param result defines the Vector3 where to store the result
           */
  def TransformCoordinatesFromFloatsToRef(
    x: scala.Double,
    y: scala.Double,
    z: scala.Double,
    transformation: babylonjsLib.BABYLONNs.Matrix,
    result: babylonjsLib.BABYLONNs.Vector3
  ): scala.Unit = js.native
  /**
           * Sets the given vector "result" coordinates with the result of the transformation by the given matrix of the given vector
           * This method computes tranformed coordinates only, not transformed direction vectors (ie. it takes translation in account)
           * @param vector defines the Vector3 to transform
           * @param transformation defines the transformation matrix
           * @param result defines the Vector3 where to store the result
           */
  def TransformCoordinatesToRef(
    vector: babylonjsLib.BABYLONNs.Vector3,
    transformation: babylonjsLib.BABYLONNs.Matrix,
    result: babylonjsLib.BABYLONNs.Vector3
  ): scala.Unit = js.native
  /**
           * Returns a new Vector3 set with the result of the normal transformation by the given matrix of the given vector
           * This methods computes transformed normalized direction vectors only (ie. it does not apply translation)
           * @param vector defines the Vector3 to transform
           * @param transformation defines the transformation matrix
           * @returns the new Vector3
           */
  def TransformNormal(vector: babylonjsLib.BABYLONNs.Vector3, transformation: babylonjsLib.BABYLONNs.Matrix): babylonjsLib.BABYLONNs.Vector3 = js.native
  /**
           * Sets the given vector "result" with the result of the normal transformation by the given matrix of the given floats (x, y, z)
           * This methods computes transformed normalized direction vectors only (ie. it does not apply translation)
           * @param x define the x coordinate of the source vector
           * @param y define the y coordinate of the source vector
           * @param z define the z coordinate of the source vector
           * @param transformation defines the transformation matrix
           * @param result defines the Vector3 where to store the result
           */
  def TransformNormalFromFloatsToRef(
    x: scala.Double,
    y: scala.Double,
    z: scala.Double,
    transformation: babylonjsLib.BABYLONNs.Matrix,
    result: babylonjsLib.BABYLONNs.Vector3
  ): scala.Unit = js.native
  /**
           * Sets the given vector "result" with the result of the normal transformation by the given matrix of the given vector
           * This methods computes transformed normalized direction vectors only (ie. it does not apply translation)
           * @param vector defines the Vector3 to transform
           * @param transformation defines the transformation matrix
           * @param result defines the Vector3 where to store the result
           */
  def TransformNormalToRef(
    vector: babylonjsLib.BABYLONNs.Vector3,
    transformation: babylonjsLib.BABYLONNs.Matrix,
    result: babylonjsLib.BABYLONNs.Vector3
  ): scala.Unit = js.native
  /**
           * Unproject from screen space to object space
           * @param source defines the screen space Vector3 to use
           * @param viewportWidth defines the current width of the viewport
           * @param viewportHeight defines the current height of the viewport
           * @param world defines the world matrix to use (can be set to Identity to go to world space)
           * @param view defines the view matrix to use
           * @param projection defines the projection matrix to use
           * @returns the new Vector3
           */
  def Unproject(
    source: babylonjsLib.BABYLONNs.Vector3,
    viewportWidth: scala.Double,
    viewportHeight: scala.Double,
    world: babylonjsLib.BABYLONNs.Matrix,
    view: babylonjsLib.BABYLONNs.Matrix,
    projection: babylonjsLib.BABYLONNs.Matrix
  ): babylonjsLib.BABYLONNs.Vector3 = js.native
  /**
           * Unproject from screen space to object space
           * @param sourceX defines the screen space x coordinate to use
           * @param sourceY defines the screen space y coordinate to use
           * @param sourceZ defines the screen space z coordinate to use
           * @param viewportWidth defines the current width of the viewport
           * @param viewportHeight defines the current height of the viewport
           * @param world defines the world matrix to use (can be set to Identity to go to world space)
           * @param view defines the view matrix to use
           * @param projection defines the projection matrix to use
           * @param result defines the Vector3 where to store the result
           */
  def UnprojectFloatsToRef(
    sourceX: babylonjsLib.BABYLONNs.float,
    sourceY: babylonjsLib.BABYLONNs.float,
    sourceZ: babylonjsLib.BABYLONNs.float,
    viewportWidth: scala.Double,
    viewportHeight: scala.Double,
    world: babylonjsLib.BABYLONNs.Matrix,
    view: babylonjsLib.BABYLONNs.Matrix,
    projection: babylonjsLib.BABYLONNs.Matrix,
    result: babylonjsLib.BABYLONNs.Vector3
  ): scala.Unit = js.native
  /**
           * Unproject from screen space to object space
           * @param source defines the screen space Vector3 to use
           * @param viewportWidth defines the current width of the viewport
           * @param viewportHeight defines the current height of the viewport
           * @param world defines the world matrix to use (can be set to Identity to go to world space)
           * @param transform defines the transform (view x projection) matrix to use
           * @returns the new Vector3
           */
  def UnprojectFromTransform(
    source: babylonjsLib.BABYLONNs.Vector3,
    viewportWidth: scala.Double,
    viewportHeight: scala.Double,
    world: babylonjsLib.BABYLONNs.Matrix,
    transform: babylonjsLib.BABYLONNs.Matrix
  ): babylonjsLib.BABYLONNs.Vector3 = js.native
  /**
           * Unproject from screen space to object space
           * @param source defines the screen space Vector3 to use
           * @param viewportWidth defines the current width of the viewport
           * @param viewportHeight defines the current height of the viewport
           * @param world defines the world matrix to use (can be set to Identity to go to world space)
           * @param view defines the view matrix to use
           * @param projection defines the projection matrix to use
           * @param result defines the Vector3 where to store the result
           */
  def UnprojectToRef(
    source: babylonjsLib.BABYLONNs.Vector3,
    viewportWidth: scala.Double,
    viewportHeight: scala.Double,
    world: babylonjsLib.BABYLONNs.Matrix,
    view: babylonjsLib.BABYLONNs.Matrix,
    projection: babylonjsLib.BABYLONNs.Matrix,
    result: babylonjsLib.BABYLONNs.Vector3
  ): scala.Unit = js.native
  /**
           * Returns a new Vector3 set to (0.0, 1.0, 0.0)
           * @returns a new up Vector3
           */
  def Up(): babylonjsLib.BABYLONNs.Vector3 = js.native
  /**
           * Returns a new Vector3 set to (0.0, 0.0, 0.0)
           * @returns a new empty Vector3
           */
  def Zero(): babylonjsLib.BABYLONNs.Vector3 = js.native
}

