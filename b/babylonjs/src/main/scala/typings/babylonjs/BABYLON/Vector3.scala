package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Vector3 extends js.Object {
  /**
    * Defines the first coordinates (on X axis)
    */
  var x: Double = js.native
  /**
    * Defines the second coordinates (on Y axis)
    */
  var y: Double = js.native
  /**
    * Defines the third coordinates (on Z axis)
    */
  var z: Double = js.native
  /**
    * Gets a new Vector3, result of the addition the current Vector3 and the given vector
    * @param otherVector defines the second operand
    * @returns the resulting Vector3
    */
  def add(otherVector: DeepImmutable[Vector3]): Vector3 = js.native
  /**
    * Adds the given vector to the current Vector3
    * @param otherVector defines the second operand
    * @returns the current updated Vector3
    */
  def addInPlace(otherVector: DeepImmutable[Vector3]): Vector3 = js.native
  /**
    * Adds the given coordinates to the current Vector3
    * @param x defines the x coordinate of the operand
    * @param y defines the y coordinate of the operand
    * @param z defines the z coordinate of the operand
    * @returns the current updated Vector3
    */
  def addInPlaceFromFloats(x: Double, y: Double, z: Double): Vector3 = js.native
  /**
    * Adds the current Vector3 to the given one and stores the result in the vector "result"
    * @param otherVector defines the second operand
    * @param result defines the Vector3 object where to store the result
    * @returns the current Vector3
    */
  def addToRef(otherVector: DeepImmutable[Vector3], result: Vector3): Vector3 = js.native
  /**
    * Creates an array containing three elements : the coordinates of the Vector3
    * @returns a new array of numbers
    */
  def asArray(): js.Array[Double] = js.native
  /**
    * Copies the given vector coordinates to the current Vector3 ones
    * @param source defines the source Vector3
    * @returns the current updated Vector3
    */
  def copyFrom(source: DeepImmutable[Vector3]): Vector3 = js.native
  /**
    * Copies the given floats to the current Vector3 coordinates
    * @param x defines the x coordinate of the operand
    * @param y defines the y coordinate of the operand
    * @param z defines the z coordinate of the operand
    * @returns the current updated Vector3
    */
  def copyFromFloats(x: Double, y: Double, z: Double): Vector3 = js.native
  /**
    * Returns a new Vector3 as the cross product of the current vector and the "other" one
    * The cross product is then orthogonal to both current and "other"
    * @param other defines the right operand
    * @returns the cross product
    */
  def cross(other: Vector3): Vector3 = js.native
  /**
    * Returns a new Vector3 set with the result of the division of the current Vector3 coordinates by the given ones
    * @param otherVector defines the second operand
    * @returns the new Vector3
    */
  def divide(otherVector: DeepImmutable[Vector3]): Vector3 = js.native
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
  def divideToRef(otherVector: DeepImmutable[Vector3], result: Vector3): Vector3 = js.native
  /**
    * Returns true if the current Vector3 and the given vector coordinates are strictly equal
    * @param otherVector defines the second operand
    * @returns true if both vectors are equals
    */
  def equals(otherVector: DeepImmutable[Vector3]): Boolean = js.native
  /**
    * Returns true if the current Vector3 coordinates equals the given floats
    * @param x defines the x coordinate of the operand
    * @param y defines the y coordinate of the operand
    * @param z defines the z coordinate of the operand
    * @returns true if both vectors are equals
    */
  def equalsToFloats(x: Double, y: Double, z: Double): Boolean = js.native
  /**
    * Returns true if the current Vector3 and the given vector coordinates are distant less than epsilon
    * @param otherVector defines the second operand
    * @param epsilon defines the minimal distance to define values as equals
    * @returns true if both vectors are distant less than epsilon
    */
  def equalsWithEpsilon(otherVector: DeepImmutable[Vector3]): Boolean = js.native
  def equalsWithEpsilon(otherVector: DeepImmutable[Vector3], epsilon: Double): Boolean = js.native
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
  def getClassName(): String = js.native
  /**
    * Creates the Vector3 hash code
    * @returns a number which tends to be unique between Vector3 instances
    */
  def getHashCode(): Double = js.native
  /**
    * Gets a boolean indicating that the vector is non uniform meaning x, y or z are not all the same
    */
  def isNonUniform: Boolean = js.native
  /**
    * Due to float precision, scale of a mesh could be uniform but float values are off by a small fraction
    * Check if is non uniform within a certain amount of decimal places to account for this
    * @param epsilon the amount the values can differ
    * @returns if the the vector is non uniform to a certain number of decimal places
    */
  def isNonUniformWithinEpsilon(epsilon: Double): Boolean = js.native
  /**
    * Gets the length of the Vector3
    * @returns the length of the Vector3
    */
  def length(): Double = js.native
  /**
    * Gets the squared length of the Vector3
    * @returns squared length of the Vector3
    */
  def lengthSquared(): Double = js.native
  /**
    * Updates the current Vector3 with the maximal coordinate values between its and the given vector ones.
    * @param other defines the second operand
    * @returns the current updated Vector3
    */
  def maximizeInPlace(other: DeepImmutable[Vector3]): Vector3 = js.native
  /**
    * Updates the current Vector3 with the maximal coordinate values between its and the given coordinates.
    * @param x defines the x coordinate of the operand
    * @param y defines the y coordinate of the operand
    * @param z defines the z coordinate of the operand
    * @returns the current updated Vector3
    */
  def maximizeInPlaceFromFloats(x: Double, y: Double, z: Double): Vector3 = js.native
  /**
    * Updates the current Vector3 with the minimal coordinate values between its and the given vector ones
    * @param other defines the second operand
    * @returns the current updated Vector3
    */
  def minimizeInPlace(other: DeepImmutable[Vector3]): Vector3 = js.native
  /**
    * Updates the current Vector3 with the minimal coordinate values between its and the given coordinates
    * @param x defines the x coordinate of the operand
    * @param y defines the y coordinate of the operand
    * @param z defines the z coordinate of the operand
    * @returns the current updated Vector3
    */
  def minimizeInPlaceFromFloats(x: Double, y: Double, z: Double): Vector3 = js.native
  /**
    * Returns a new Vector3, result of the multiplication of the current Vector3 by the given vector
    * @param otherVector defines the second operand
    * @returns the new Vector3
    */
  def multiply(otherVector: DeepImmutable[Vector3]): Vector3 = js.native
  /**
    * Returns a new Vector3 set with the result of the mulliplication of the current Vector3 coordinates by the given floats
    * @param x defines the x coordinate of the operand
    * @param y defines the y coordinate of the operand
    * @param z defines the z coordinate of the operand
    * @returns the new Vector3
    */
  def multiplyByFloats(x: Double, y: Double, z: Double): Vector3 = js.native
  /**
    * Multiplies the current Vector3 coordinates by the given ones
    * @param otherVector defines the second operand
    * @returns the current updated Vector3
    */
  def multiplyInPlace(otherVector: DeepImmutable[Vector3]): Vector3 = js.native
  /**
    * Multiplies the current Vector3 by the given one and stores the result in the given vector "result"
    * @param otherVector defines the second operand
    * @param result defines the Vector3 object where to store the result
    * @returns the current Vector3
    */
  def multiplyToRef(otherVector: DeepImmutable[Vector3], result: Vector3): Vector3 = js.native
  /**
    * Gets a new Vector3 set with the current Vector3 negated coordinates
    * @returns a new Vector3
    */
  def negate(): Vector3 = js.native
  /**
    * Negate this vector in place
    * @returns this
    */
  def negateInPlace(): Vector3 = js.native
  /**
    * Negate the current Vector3 and stores the result in the given vector "result" coordinates
    * @param result defines the Vector3 object where to store the result
    * @returns the current Vector3
    */
  def negateToRef(result: Vector3): Vector3 = js.native
  /**
    * Normalize the current Vector3.
    * Please note that this is an in place operation.
    * @returns the current updated Vector3
    */
  def normalize(): Vector3 = js.native
  /**
    * Normalize the current Vector3 with the given input length.
    * Please note that this is an in place operation.
    * @param len the length of the vector
    * @returns the current updated Vector3
    */
  def normalizeFromLength(len: Double): Vector3 = js.native
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
  def normalizeToRef(reference: DeepImmutable[Vector3]): Vector3 = js.native
  /**
    * Reorders the x y z properties of the vector in place
    * @param order new ordering of the properties (eg. for vector 1,2,3 with "ZYX" will produce 3,2,1)
    * @returns the current updated vector
    */
  def reorderInPlace(order: String): this.type = js.native
  /**
    * Rotates a vector around a given point
    * @param quaternion the rotation quaternion
    * @param point the point to rotate around
    * @param result vector to store the result
    * @returns the resulting vector
    */
  def rotateByQuaternionAroundPointToRef(quaternion: Quaternion, point: Vector3, result: Vector3): Vector3 = js.native
  /**
    * Rotates the vector around 0,0,0 by a quaternion
    * @param quaternion the rotation quaternion
    * @param result vector to store the result
    * @returns the resulting vector
    */
  def rotateByQuaternionToRef(quaternion: Quaternion, result: Vector3): Vector3 = js.native
  /**
    * Returns a new Vector3 set with the current Vector3 coordinates multiplied by the float "scale"
    * @param scale defines the multiplier factor
    * @returns a new Vector3
    */
  def scale(scale: Double): Vector3 = js.native
  /**
    * Scale the current Vector3 values by a factor and add the result to a given Vector3
    * @param scale defines the scale factor
    * @param result defines the Vector3 object where to store the result
    * @returns the unmodified current Vector3
    */
  def scaleAndAddToRef(scale: Double, result: Vector3): Vector3 = js.native
  /**
    * Multiplies the Vector3 coordinates by the float "scale"
    * @param scale defines the multiplier factor
    * @returns the current updated Vector3
    */
  def scaleInPlace(scale: Double): Vector3 = js.native
  /**
    * Multiplies the current Vector3 coordinates by the float "scale" and stores the result in the given vector "result" coordinates
    * @param scale defines the multiplier factor
    * @param result defines the Vector3 object where to store the result
    * @returns the current Vector3
    */
  def scaleToRef(scale: Double, result: Vector3): Vector3 = js.native
  /**
    * Copies the given floats to the current Vector3 coordinates
    * @param x defines the x coordinate of the operand
    * @param y defines the y coordinate of the operand
    * @param z defines the z coordinate of the operand
    * @returns the current updated Vector3
    */
  def set(x: Double, y: Double, z: Double): Vector3 = js.native
  /**
    * Copies the given float to the current Vector3 coordinates
    * @param v defines the x, y and z coordinates of the operand
    * @returns the current updated Vector3
    */
  def setAll(v: Double): Vector3 = js.native
  /**
    * Returns a new Vector3, result of the subtraction of the given vector from the current Vector3
    * @param otherVector defines the second operand
    * @returns the resulting Vector3
    */
  def subtract(otherVector: DeepImmutable[Vector3]): Vector3 = js.native
  /**
    * Returns a new Vector3 set with the subtraction of the given floats from the current Vector3 coordinates
    * @param x defines the x coordinate of the operand
    * @param y defines the y coordinate of the operand
    * @param z defines the z coordinate of the operand
    * @returns the resulting Vector3
    */
  def subtractFromFloats(x: Double, y: Double, z: Double): Vector3 = js.native
  /**
    * Subtracts the given floats from the current Vector3 coordinates and set the given vector "result" with this result
    * @param x defines the x coordinate of the operand
    * @param y defines the y coordinate of the operand
    * @param z defines the z coordinate of the operand
    * @param result defines the Vector3 object where to store the result
    * @returns the current Vector3
    */
  def subtractFromFloatsToRef(x: Double, y: Double, z: Double, result: Vector3): Vector3 = js.native
  /**
    * Subtract the given vector from the current Vector3
    * @param otherVector defines the second operand
    * @returns the current updated Vector3
    */
  def subtractInPlace(otherVector: DeepImmutable[Vector3]): Vector3 = js.native
  /**
    * Subtracts the given vector from the current Vector3 and stores the result in the vector "result".
    * @param otherVector defines the second operand
    * @param result defines the Vector3 object where to store the result
    * @returns the current Vector3
    */
  def subtractToRef(otherVector: DeepImmutable[Vector3], result: Vector3): Vector3 = js.native
  /**
    * Populates the given array or Float32Array from the given index with the successive coordinates of the Vector3
    * @param array defines the destination array
    * @param index defines the offset in the destination array
    * @returns the current Vector3
    */
  def toArray(array: FloatArray): Vector3 = js.native
  def toArray(array: FloatArray, index: Double): Vector3 = js.native
  /**
    * Converts the current Vector3 into a quaternion (considering that the Vector3 contains Euler angles representation of a rotation)
    * @returns a new Quaternion object, computed from the Vector3 coordinates
    */
  def toQuaternion(): Quaternion = js.native
}

