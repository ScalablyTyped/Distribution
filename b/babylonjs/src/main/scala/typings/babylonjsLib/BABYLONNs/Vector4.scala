package typings
package babylonjsLib.BABYLONNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Vector4 class created for EulerAngle class conversion to Quaternion
  */
@JSGlobal("BABYLON.Vector4")
@js.native
class Vector4 protected () extends js.Object {
  /**
    * Creates a Vector4 object from the given floats.
    * @param x x value of the vector
    * @param y y value of the vector
    * @param z z value of the vector
    * @param w w value of the vector
    */
  def this(/** x value of the vector */
  x: scala.Double, /** y value of the vector */
  y: scala.Double, /** z value of the vector */
  z: scala.Double, /** w value of the vector */
  w: scala.Double) = this()
  /** w value of the vector */
  var w: scala.Double = js.native
  /** x value of the vector */
  var x: scala.Double = js.native
  /** y value of the vector */
  var y: scala.Double = js.native
  /** z value of the vector */
  var z: scala.Double = js.native
  /**
    * Returns a new Vector4 as the result of the addition of the current Vector4 and the given one.
    * @param otherVector the vector to add
    * @returns the resulting vector
    */
  def add(otherVector: Vector4): Vector4 = js.native
  /**
    * Adds the given vector to the current Vector4.
    * @param otherVector the vector to add
    * @returns the updated Vector4.
    */
  def addInPlace(otherVector: Vector4): Vector4 = js.native
  /**
    * Updates the given vector "result" with the result of the addition of the current Vector4 and the given one.
    * @param otherVector the vector to add
    * @param result the vector to store the result
    * @returns the current Vector4.
    */
  def addToRef(otherVector: Vector4, result: Vector4): Vector4 = js.native
  /**
    * Returns a new array populated with 4 elements : the Vector4 coordinates.
    * @returns the resulting array
    */
  def asArray(): js.Array[scala.Double] = js.native
  /**
    * Updates the current Vector4 with the given one coordinates.
    * @param source the source vector to copy from
    * @returns the updated Vector4.
    */
  def copyFrom(source: Vector4): Vector4 = js.native
  /**
    * Updates the current Vector4 coordinates with the given floats.
    * @param x float to copy from
    * @param y float to copy from
    * @param z float to copy from
    * @param w float to copy from
    * @returns the updated Vector4.
    */
  def copyFromFloats(x: scala.Double, y: scala.Double, z: scala.Double, w: scala.Double): Vector4 = js.native
  /**
    * Returns a new Vector4 set with the division result of the current Vector4 by the given one.
    * @param otherVector vector to devide with
    * @returns resulting new vector
    */
  def divide(otherVector: Vector4): Vector4 = js.native
  /**
    * Divides the current Vector3 coordinates by the given ones.
    * @param otherVector vector to devide with
    * @returns the updated Vector3.
    */
  def divideInPlace(otherVector: Vector4): Vector4 = js.native
  /**
    * Updates the given vector "result" with the division result of the current Vector4 by the given one.
    * @param otherVector vector to devide with
    * @param result vector to store the result
    * @returns the current Vector4.
    */
  def divideToRef(otherVector: Vector4, result: Vector4): Vector4 = js.native
  /**
    * Boolean : True if the current Vector4 coordinates are stricly equal to the given ones.
    * @param otherVector the vector to compare against
    * @returns true if they are equal
    */
  def equals(otherVector: Vector4): scala.Boolean = js.native
  /**
    * Boolean : True if the given floats are strictly equal to the current Vector4 coordinates.
    * @param x x value to compare against
    * @param y y value to compare against
    * @param z z value to compare against
    * @param w w value to compare against
    * @returns true if equal
    */
  def equalsToFloats(x: scala.Double, y: scala.Double, z: scala.Double, w: scala.Double): scala.Boolean = js.native
  /**
    * Boolean : True if the current Vector4 coordinates are each beneath the distance "epsilon" from the given vector ones.
    * @param otherVector vector to compare against
    * @param epsilon (Default: very small number)
    * @returns true if they are equal
    */
  def equalsWithEpsilon(otherVector: Vector4): scala.Boolean = js.native
  def equalsWithEpsilon(otherVector: Vector4, epsilon: scala.Double): scala.Boolean = js.native
  /**
    * Gets a new Vector4 from current Vector4 floored values
    * @returns a new Vector4
    */
  def floor(): Vector4 = js.native
  /**
    * Gets a new Vector4 from current Vector3 floored values
    * @returns a new Vector4
    */
  def fract(): Vector4 = js.native
  /**
    * Returns the string "Vector4".
    * @returns "Vector4"
    */
  def getClassName(): java.lang.String = js.native
  /**
    * Returns the Vector4 hash code.
    * @returns a unique hash code
    */
  def getHashCode(): scala.Double = js.native
  /**
    * Returns the Vector4 length (float).
    * @returns the length
    */
  def length(): scala.Double = js.native
  /**
    * Returns the Vector4 squared length (float).
    * @returns the length squared
    */
  def lengthSquared(): scala.Double = js.native
  /**
    * Updates the Vector4 coordinates with the maximum values between its own and the given vector ones
    * @param other defines the second operand
    * @returns the current updated Vector4
    */
  def maximizeInPlace(other: Vector4): Vector4 = js.native
  /**
    * Updates the Vector4 coordinates with the minimum values between its own and the given vector ones
    * @param other defines the second operand
    * @returns the current updated Vector4
    */
  def minimizeInPlace(other: Vector4): Vector4 = js.native
  /**
    * Returns a new Vector4 set with the multiplication result of the current Vector4 and the given one.
    * @param otherVector vector to multiple with
    * @returns resulting new vector
    */
  def multiply(otherVector: Vector4): Vector4 = js.native
  /**
    * Returns a new Vector4 set with the multiplication result of the given floats and the current Vector4 coordinates.
    * @param x x value multiply with
    * @param y y value multiply with
    * @param z z value multiply with
    * @param w w value multiply with
    * @returns resulting new vector
    */
  def multiplyByFloats(x: scala.Double, y: scala.Double, z: scala.Double, w: scala.Double): Vector4 = js.native
  /**
    * Multiplies in place the current Vector4 by the given one.
    * @param otherVector vector to multiple with
    * @returns the updated Vector4.
    */
  def multiplyInPlace(otherVector: Vector4): Vector4 = js.native
  /**
    * Updates the given vector "result" with the multiplication result of the current Vector4 and the given one.
    * @param otherVector vector to multiple with
    * @param result vector to store the result
    * @returns the current Vector4.
    */
  def multiplyToRef(otherVector: Vector4, result: Vector4): Vector4 = js.native
  /**
    * Returns a new Vector4 set with the current Vector4 negated coordinates.
    * @returns a new vector with the negated values
    */
  def negate(): Vector4 = js.native
  /**
    * Normalizes in place the Vector4.
    * @returns the updated Vector4.
    */
  def normalize(): Vector4 = js.native
  /**
    * Returns a new Vector4 set with the current Vector4 coordinates multiplied by scale (float).
    * @param scale the number to scale with
    * @returns a new vector with the result
    */
  def scale(scale: scala.Double): Vector4 = js.native
  /**
    * Scale the current Vector4 values by a factor and add the result to a given Vector4
    * @param scale defines the scale factor
    * @param result defines the Vector4 object where to store the result
    * @returns the unmodified current Vector4
    */
  def scaleAndAddToRef(scale: scala.Double, result: Vector4): Vector4 = js.native
  /**
    * Multiplies the current Vector4 coordinates by scale (float).
    * @param scale the number to scale with
    * @returns the updated Vector4.
    */
  def scaleInPlace(scale: scala.Double): Vector4 = js.native
  /**
    * Sets the given vector "result" with the current Vector4 coordinates multiplied by scale (float).
    * @param scale the number to scale with
    * @param result a vector to store the result in
    * @returns the current Vector4.
    */
  def scaleToRef(scale: scala.Double, result: Vector4): Vector4 = js.native
  /**
    * Updates the current Vector4 coordinates with the given floats.
    * @param x float to set from
    * @param y float to set from
    * @param z float to set from
    * @param w float to set from
    * @returns the updated Vector4.
    */
  def set(x: scala.Double, y: scala.Double, z: scala.Double, w: scala.Double): Vector4 = js.native
  /**
    * Returns a new Vector4 with the result of the subtraction of the given vector from the current Vector4.
    * @param otherVector the vector to add
    * @returns the new vector with the result
    */
  def subtract(otherVector: Vector4): Vector4 = js.native
  /**
    * Returns a new Vector4 set with the result of the subtraction of the given floats from the current Vector4 coordinates.
    */
  /**
    * Returns a new Vector4 set with the result of the subtraction of the given floats from the current Vector4 coordinates.
    * @param x value to subtract
    * @param y value to subtract
    * @param z value to subtract
    * @param w value to subtract
    * @returns new vector containing the result
    */
  def subtractFromFloats(x: scala.Double, y: scala.Double, z: scala.Double, w: scala.Double): Vector4 = js.native
  /**
    * Sets the given vector "result" set with the result of the subtraction of the given floats from the current Vector4 coordinates.
    * @param x value to subtract
    * @param y value to subtract
    * @param z value to subtract
    * @param w value to subtract
    * @param result the vector to store the result in
    * @returns the current Vector4.
    */
  def subtractFromFloatsToRef(x: scala.Double, y: scala.Double, z: scala.Double, w: scala.Double, result: Vector4): Vector4 = js.native
  /**
    * Subtract in place the given vector from the current Vector4.
    * @param otherVector the vector to subtract
    * @returns the updated Vector4.
    */
  def subtractInPlace(otherVector: Vector4): Vector4 = js.native
  /**
    * Sets the given vector "result" with the result of the subtraction of the given vector from the current Vector4.
    * @param otherVector the vector to subtract
    * @param result the vector to store the result
    * @returns the current Vector4.
    */
  def subtractToRef(otherVector: Vector4, result: Vector4): Vector4 = js.native
  /**
    * Populates the given array from the given index with the Vector4 coordinates.
    * @param array array to populate
    * @param index index of the array to start at (default: 0)
    * @returns the Vector4.
    */
  def toArray(array: FloatArray): Vector4 = js.native
  def toArray(array: FloatArray, index: scala.Double): Vector4 = js.native
  /**
    * Returns a new Vector3 from the Vector4 (x, y, z) coordinates.
    * @returns this converted to a new vector3
    */
  def toVector3(): Vector3 = js.native
}

/* static members */
@JSGlobal("BABYLON.Vector4")
@js.native
object Vector4 extends js.Object {
  /**
    * Returns a new Vector4 located at the center between the vectors "value1" and "value2".
    * @param value1 value to calulate the center between
    * @param value2 value to calulate the center between
    * @return the center between the two vectors
    */
  def Center(value1: babylonjsLib.BABYLONNs.Vector4, value2: babylonjsLib.BABYLONNs.Vector4): babylonjsLib.BABYLONNs.Vector4 = js.native
  /**
    * Returns the distance (float) between the vectors "value1" and "value2".
    * @param value1 value to calulate the distance between
    * @param value2 value to calulate the distance between
    * @return the distance between the two vectors
    */
  def Distance(value1: babylonjsLib.BABYLONNs.Vector4, value2: babylonjsLib.BABYLONNs.Vector4): scala.Double = js.native
  /**
    * Returns the squared distance (float) between the vectors "value1" and "value2".
    * @param value1 value to calulate the distance between
    * @param value2 value to calulate the distance between
    * @return the distance between the two vectors squared
    */
  def DistanceSquared(value1: babylonjsLib.BABYLONNs.Vector4, value2: babylonjsLib.BABYLONNs.Vector4): scala.Double = js.native
  /**
    * Returns a new Vector4 set from the starting index of the given array.
    * @param array the array to pull values from
    * @param offset the offset into the array to start at
    * @returns the new vector
    */
  def FromArray(array: stdLib.ArrayLike[scala.Double]): babylonjsLib.BABYLONNs.Vector4 = js.native
  def FromArray(array: stdLib.ArrayLike[scala.Double], offset: scala.Double): babylonjsLib.BABYLONNs.Vector4 = js.native
  /**
    * Updates the given vector "result" from the starting index of the given array.
    * @param array the array to pull values from
    * @param offset the offset into the array to start at
    * @param result the vector to store the result in
    */
  def FromArrayToRef(
    array: stdLib.ArrayLike[scala.Double],
    offset: scala.Double,
    result: babylonjsLib.BABYLONNs.Vector4
  ): scala.Unit = js.native
  /**
    * Updates the given vector "result" from the starting index of the given Float32Array.
    * @param array the array to pull values from
    * @param offset the offset into the array to start at
    * @param result the vector to store the result in
    */
  def FromFloatArrayToRef(array: stdLib.Float32Array, offset: scala.Double, result: babylonjsLib.BABYLONNs.Vector4): scala.Unit = js.native
  /**
    * Updates the given vector "result" coordinates from the given floats.
    * @param x float to set from
    * @param y float to set from
    * @param z float to set from
    * @param w float to set from
    * @param result the vector to the floats in
    */
  def FromFloatsToRef(
    x: scala.Double,
    y: scala.Double,
    z: scala.Double,
    w: scala.Double,
    result: babylonjsLib.BABYLONNs.Vector4
  ): scala.Unit = js.native
  /**
    * Returns a vector with the maximum values from the left and right vectors
    * @param left left vector to maximize
    * @param right right vector to maximize
    * @returns a new vector with the maximum of the left and right vector values
    */
  def Maximize(left: babylonjsLib.BABYLONNs.Vector4, right: babylonjsLib.BABYLONNs.Vector4): babylonjsLib.BABYLONNs.Vector4 = js.native
  /**
    * Returns a vector with the minimum values from the left and right vectors
    * @param left left vector to minimize
    * @param right right vector to minimize
    * @returns a new vector with the minimum of the left and right vector values
    */
  def Minimize(left: babylonjsLib.BABYLONNs.Vector4, right: babylonjsLib.BABYLONNs.Vector4): babylonjsLib.BABYLONNs.Vector4 = js.native
  /**
    * Returns a new normalized Vector4 from the given one.
    * @param vector the vector to normalize
    * @returns the vector
    */
  def Normalize(vector: babylonjsLib.BABYLONNs.Vector4): babylonjsLib.BABYLONNs.Vector4 = js.native
  /**
    * Updates the given vector "result" from the normalization of the given one.
    * @param vector the vector to normalize
    * @param result the vector to store the result in
    */
  def NormalizeToRef(vector: babylonjsLib.BABYLONNs.Vector4, result: babylonjsLib.BABYLONNs.Vector4): scala.Unit = js.native
  /**
    * Returns a new Vector4 set to (1.0, 1.0, 1.0, 1.0)
    * @returns the new vector
    */
  def One(): babylonjsLib.BABYLONNs.Vector4 = js.native
  /**
    * Returns a new Vector4 set with the result of the normal transformation by the given matrix of the given vector.
    * This methods computes transformed normalized direction vectors only.
    * @param vector the vector to transform
    * @param transformation the transformation matrix to apply
    * @returns the new vector
    */
  def TransformNormal(vector: babylonjsLib.BABYLONNs.Vector4, transformation: babylonjsLib.BABYLONNs.Matrix): babylonjsLib.BABYLONNs.Vector4 = js.native
  /**
    * Sets the given vector "result" with the result of the normal transformation by the given matrix of the given floats (x, y, z, w).
    * This methods computes transformed normalized direction vectors only.
    * @param x value to transform
    * @param y value to transform
    * @param z value to transform
    * @param w value to transform
    * @param transformation the transformation matrix to apply
    * @param result the vector to store the results in
    */
  def TransformNormalFromFloatsToRef(
    x: scala.Double,
    y: scala.Double,
    z: scala.Double,
    w: scala.Double,
    transformation: babylonjsLib.BABYLONNs.Matrix,
    result: babylonjsLib.BABYLONNs.Vector4
  ): scala.Unit = js.native
  /**
    * Sets the given vector "result" with the result of the normal transformation by the given matrix of the given vector.
    * This methods computes transformed normalized direction vectors only.
    * @param vector the vector to transform
    * @param transformation the transformation matrix to apply
    * @param result the vector to store the result in
    */
  def TransformNormalToRef(
    vector: babylonjsLib.BABYLONNs.Vector4,
    transformation: babylonjsLib.BABYLONNs.Matrix,
    result: babylonjsLib.BABYLONNs.Vector4
  ): scala.Unit = js.native
  /**
    * Returns a new Vector4 set to (0.0, 0.0, 0.0, 0.0)
    * @returns the new vector
    */
  def Zero(): babylonjsLib.BABYLONNs.Vector4 = js.native
}

