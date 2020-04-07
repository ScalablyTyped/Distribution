package typings.babylonjs.BABYLON

import typings.std.ArrayLike
import typings.std.Float32Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("BABYLON.Vector3")
@js.native
/**
  * Creates a new Vector3 object from the given x, y, z (floats) coordinates.
  * @param x defines the first coordinates (on X axis)
  * @param y defines the second coordinates (on Y axis)
  * @param z defines the third coordinates (on Z axis)
  */
class Vector3 () extends js.Object {
  def this(/**
    * Defines the first coordinates (on X axis)
    */
  x: Double) = this()
  def this(
    /**
    * Defines the first coordinates (on X axis)
    */
  x: Double,
    /**
    * Defines the second coordinates (on Y axis)
    */
  y: Double
  ) = this()
  def this(
    /**
    * Defines the first coordinates (on X axis)
    */
  x: Double,
    /**
    * Defines the second coordinates (on Y axis)
    */
  y: Double,
    /**
    * Defines the third coordinates (on Z axis)
    */
  z: Double
  ) = this()
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
  def isNonUniform(): Boolean = js.native
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

/* static members */
@JSGlobal("BABYLON.Vector3")
@js.native
object Vector3 extends js.Object {
  var _UpReadOnly: js.Any = js.native
  var _ZeroReadOnly: js.Any = js.native
  /**
    * Returns a new Vector3 set to (0.0, 0.0, -1.0)
    * @returns a new forward Vector3
    */
  def Backward(): Vector3 = js.native
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
    value1: DeepImmutable[Vector3],
    value2: DeepImmutable[Vector3],
    value3: DeepImmutable[Vector3],
    value4: DeepImmutable[Vector3],
    amount: Double
  ): Vector3 = js.native
  /**
    * Returns a new Vector3 located at the center between "value1" and "value2"
    * @param value1 defines the first operand
    * @param value2 defines the second operand
    * @returns the new Vector3
    */
  def Center(value1: DeepImmutable[Vector3], value2: DeepImmutable[Vector3]): Vector3 = js.native
  /**
    * Checks if a given vector is inside a specific range
    * @param v defines the vector to test
    * @param min defines the minimum range
    * @param max defines the maximum range
    */
  def CheckExtends(v: Vector3, min: Vector3, max: Vector3): Unit = js.native
  /**
    * Returns a new Vector3 set with the coordinates of "value", if the vector "value" is in the cube defined by the vectors "min" and "max"
    * If a coordinate value of "value" is lower than one of the "min" coordinate, then this "value" coordinate is set with the "min" one
    * If a coordinate value of "value" is greater than one of the "max" coordinate, then this "value" coordinate is set with the "max" one
    * @param value defines the current value
    * @param min defines the lower range value
    * @param max defines the upper range value
    * @returns the new Vector3
    */
  def Clamp(value: DeepImmutable[Vector3], min: DeepImmutable[Vector3], max: DeepImmutable[Vector3]): Vector3 = js.native
  /**
    * Sets the given vector "result" with the coordinates of "value", if the vector "value" is in the cube defined by the vectors "min" and "max"
    * If a coordinate value of "value" is lower than one of the "min" coordinate, then this "value" coordinate is set with the "min" one
    * If a coordinate value of "value" is greater than one of the "max" coordinate, then this "value" coordinate is set with the "max" one
    * @param value defines the current value
    * @param min defines the lower range value
    * @param max defines the upper range value
    * @param result defines the Vector3 where to store the result
    */
  def ClampToRef(
    value: DeepImmutable[Vector3],
    min: DeepImmutable[Vector3],
    max: DeepImmutable[Vector3],
    result: Vector3
  ): Unit = js.native
  /**
    * Returns a new Vector3 as the cross product of the vectors "left" and "right"
    * The cross product is then orthogonal to both "left" and "right"
    * @param left defines the left operand
    * @param right defines the right operand
    * @returns the cross product
    */
  def Cross(left: DeepImmutable[Vector3], right: DeepImmutable[Vector3]): Vector3 = js.native
  /**
    * Sets the given vector "result" with the cross product of "left" and "right"
    * The cross product is then orthogonal to both "left" and "right"
    * @param left defines the left operand
    * @param right defines the right operand
    * @param result defines the Vector3 where to store the result
    */
  def CrossToRef(left: Vector3, right: Vector3, result: Vector3): Unit = js.native
  /**
    * Returns the distance between the vectors "value1" and "value2"
    * @param value1 defines the first operand
    * @param value2 defines the second operand
    * @returns the distance
    */
  def Distance(value1: DeepImmutable[Vector3], value2: DeepImmutable[Vector3]): Double = js.native
  /**
    * Returns the squared distance between the vectors "value1" and "value2"
    * @param value1 defines the first operand
    * @param value2 defines the second operand
    * @returns the squared distance
    */
  def DistanceSquared(value1: DeepImmutable[Vector3], value2: DeepImmutable[Vector3]): Double = js.native
  /**
    * Returns the dot product (float) between the vectors "left" and "right"
    * @param left defines the left operand
    * @param right defines the right operand
    * @returns the dot product
    */
  def Dot(left: DeepImmutable[Vector3], right: DeepImmutable[Vector3]): Double = js.native
  /**
    * Returns a new Vector3 set to (0.0, -1.0, 0.0)
    * @returns a new down Vector3
    */
  def Down(): Vector3 = js.native
  /**
    * Returns a new Vector3 set to (0.0, 0.0, 1.0)
    * @returns a new forward Vector3
    */
  def Forward(): Vector3 = js.native
  /**
    * Returns a new Vector3 set from the index "offset" of the given array
    * @param array defines the source array
    * @param offset defines the offset in the source array
    * @returns the new Vector3
    */
  def FromArray(array: DeepImmutable[ArrayLike[Double]]): Vector3 = js.native
  def FromArray(array: DeepImmutable[ArrayLike[Double]], offset: Double): Vector3 = js.native
  /**
    * Sets the given vector "result" with the element values from the index "offset" of the given array
    * @param array defines the source array
    * @param offset defines the offset in the source array
    * @param result defines the Vector3 where to store the result
    */
  def FromArrayToRef(array: DeepImmutable[ArrayLike[Double]], offset: Double, result: Vector3): Unit = js.native
  /**
    * Returns a new Vector3 set from the index "offset" of the given Float32Array
    * @param array defines the source array
    * @param offset defines the offset in the source array
    * @returns the new Vector3
    * @deprecated Please use FromArray instead.
    */
  def FromFloatArray(array: DeepImmutable[Float32Array]): Vector3 = js.native
  def FromFloatArray(array: DeepImmutable[Float32Array], offset: Double): Vector3 = js.native
  /**
    * Sets the given vector "result" with the element values from the index "offset" of the given Float32Array
    * @param array defines the source array
    * @param offset defines the offset in the source array
    * @param result defines the Vector3 where to store the result
    * @deprecated Please use FromArrayToRef instead.
    */
  def FromFloatArrayToRef(array: DeepImmutable[Float32Array], offset: Double, result: Vector3): Unit = js.native
  /**
    * Sets the given vector "result" with the given floats.
    * @param x defines the x coordinate of the source
    * @param y defines the y coordinate of the source
    * @param z defines the z coordinate of the source
    * @param result defines the Vector3 where to store the result
    */
  def FromFloatsToRef(x: Double, y: Double, z: Double, result: Vector3): Unit = js.native
  /**
    * Get angle between two vectors
    * @param vector0 angle between vector0 and vector1
    * @param vector1 angle between vector0 and vector1
    * @param normal direction of the normal
    * @return the angle between vector0 and vector1
    */
  def GetAngleBetweenVectors(vector0: DeepImmutable[Vector3], vector1: DeepImmutable[Vector3], normal: DeepImmutable[Vector3]): Double = js.native
  /**
    * Get the clip factor between two vectors
    * @param vector0 defines the first operand
    * @param vector1 defines the second operand
    * @param axis defines the axis to use
    * @param size defines the size along the axis
    * @returns the clip factor
    */
  def GetClipFactor(
    vector0: DeepImmutable[Vector3],
    vector1: DeepImmutable[Vector3],
    axis: DeepImmutable[Vector3],
    size: Double
  ): Double = js.native
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
    value1: DeepImmutable[Vector3],
    tangent1: DeepImmutable[Vector3],
    value2: DeepImmutable[Vector3],
    tangent2: DeepImmutable[Vector3],
    amount: Double
  ): Vector3 = js.native
  /**
    * Returns a new Vector3 set to (-1.0, 0.0, 0.0)
    * @returns a new left Vector3
    */
  def Left(): Vector3 = js.native
  /**
    * Returns a new Vector3 located for "amount" (float) on the linear interpolation between the vectors "start" and "end"
    * @param start defines the start value
    * @param end defines the end value
    * @param amount max defines amount between both (between 0 and 1)
    * @returns the new Vector3
    */
  def Lerp(start: DeepImmutable[Vector3], end: DeepImmutable[Vector3], amount: Double): Vector3 = js.native
  /**
    * Sets the given vector "result" with the result of the linear interpolation from the vector "start" for "amount" to the vector "end"
    * @param start defines the start value
    * @param end defines the end value
    * @param amount max defines amount between both (between 0 and 1)
    * @param result defines the Vector3 where to store the result
    */
  def LerpToRef(start: DeepImmutable[Vector3], end: DeepImmutable[Vector3], amount: Double, result: Vector3): Unit = js.native
  /**
    * Gets the maximal coordinate values between two Vector3
    * @param left defines the first operand
    * @param right defines the second operand
    * @returns the new Vector3
    */
  def Maximize(left: DeepImmutable[Vector3], right: DeepImmutable[Vector3]): Vector3 = js.native
  /**
    * Gets the minimal coordinate values between two Vector3
    * @param left defines the first operand
    * @param right defines the second operand
    * @returns the new Vector3
    */
  def Minimize(left: DeepImmutable[Vector3], right: DeepImmutable[Vector3]): Vector3 = js.native
  /**
    * Returns a new Vector3 as the normalization of the given vector
    * @param vector defines the Vector3 to normalize
    * @returns the new Vector3
    */
  def Normalize(vector: DeepImmutable[Vector3]): Vector3 = js.native
  /**
    * Sets the given vector "result" with the normalization of the given first vector
    * @param vector defines the Vector3 to normalize
    * @param result defines the Vector3 where to store the result
    */
  def NormalizeToRef(vector: DeepImmutable[Vector3], result: Vector3): Unit = js.native
  /**
    * Returns a new Vector3 set to (1.0, 1.0, 1.0)
    * @returns a new unit Vector3
    */
  def One(): Vector3 = js.native
  /**
    * Project a Vector3 onto screen space
    * @param vector defines the Vector3 to project
    * @param world defines the world matrix to use
    * @param transform defines the transform (view x projection) matrix to use
    * @param viewport defines the screen viewport to use
    * @returns the new Vector3
    */
  def Project(
    vector: DeepImmutable[Vector3],
    world: DeepImmutable[Matrix],
    transform: DeepImmutable[Matrix],
    viewport: DeepImmutable[Viewport]
  ): Vector3 = js.native
  /**
    * Returns a new Vector3 set to (1.0, 0.0, 0.0)
    * @returns a new right Vector3
    */
  def Right(): Vector3 = js.native
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
  def RotationFromAxis(axis1: DeepImmutable[Vector3], axis2: DeepImmutable[Vector3], axis3: DeepImmutable[Vector3]): Vector3 = js.native
  /**
    * The same than RotationFromAxis but updates the given ref Vector3 parameter instead of returning a new Vector3
    * @param axis1 defines the first axis
    * @param axis2 defines the second axis
    * @param axis3 defines the third axis
    * @param ref defines the Vector3 where to store the result
    */
  def RotationFromAxisToRef(
    axis1: DeepImmutable[Vector3],
    axis2: DeepImmutable[Vector3],
    axis3: DeepImmutable[Vector3],
    ref: Vector3
  ): Unit = js.native
  /**
    * Returns a new Vector3 set with the result of the transformation by the given matrix of the given vector.
    * This method computes tranformed coordinates only, not transformed direction vectors (ie. it takes translation in account)
    * @param vector defines the Vector3 to transform
    * @param transformation defines the transformation matrix
    * @returns the transformed Vector3
    */
  def TransformCoordinates(vector: DeepImmutable[Vector3], transformation: DeepImmutable[Matrix]): Vector3 = js.native
  /**
    * Sets the given vector "result" coordinates with the result of the transformation by the given matrix of the given floats (x, y, z)
    * This method computes tranformed coordinates only, not transformed direction vectors
    * @param x define the x coordinate of the source vector
    * @param y define the y coordinate of the source vector
    * @param z define the z coordinate of the source vector
    * @param transformation defines the transformation matrix
    * @param result defines the Vector3 where to store the result
    */
  def TransformCoordinatesFromFloatsToRef(x: Double, y: Double, z: Double, transformation: DeepImmutable[Matrix], result: Vector3): Unit = js.native
  /**
    * Sets the given vector "result" coordinates with the result of the transformation by the given matrix of the given vector
    * This method computes tranformed coordinates only, not transformed direction vectors (ie. it takes translation in account)
    * @param vector defines the Vector3 to transform
    * @param transformation defines the transformation matrix
    * @param result defines the Vector3 where to store the result
    */
  def TransformCoordinatesToRef(vector: DeepImmutable[Vector3], transformation: DeepImmutable[Matrix], result: Vector3): Unit = js.native
  /**
    * Returns a new Vector3 set with the result of the normal transformation by the given matrix of the given vector
    * This methods computes transformed normalized direction vectors only (ie. it does not apply translation)
    * @param vector defines the Vector3 to transform
    * @param transformation defines the transformation matrix
    * @returns the new Vector3
    */
  def TransformNormal(vector: DeepImmutable[Vector3], transformation: DeepImmutable[Matrix]): Vector3 = js.native
  /**
    * Sets the given vector "result" with the result of the normal transformation by the given matrix of the given floats (x, y, z)
    * This methods computes transformed normalized direction vectors only (ie. it does not apply translation)
    * @param x define the x coordinate of the source vector
    * @param y define the y coordinate of the source vector
    * @param z define the z coordinate of the source vector
    * @param transformation defines the transformation matrix
    * @param result defines the Vector3 where to store the result
    */
  def TransformNormalFromFloatsToRef(x: Double, y: Double, z: Double, transformation: DeepImmutable[Matrix], result: Vector3): Unit = js.native
  /**
    * Sets the given vector "result" with the result of the normal transformation by the given matrix of the given vector
    * This methods computes transformed normalized direction vectors only (ie. it does not apply translation)
    * @param vector defines the Vector3 to transform
    * @param transformation defines the transformation matrix
    * @param result defines the Vector3 where to store the result
    */
  def TransformNormalToRef(vector: DeepImmutable[Vector3], transformation: DeepImmutable[Matrix], result: Vector3): Unit = js.native
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
    source: DeepImmutable[Vector3],
    viewportWidth: Double,
    viewportHeight: Double,
    world: DeepImmutable[Matrix],
    view: DeepImmutable[Matrix],
    projection: DeepImmutable[Matrix]
  ): Vector3 = js.native
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
    sourceX: float,
    sourceY: float,
    sourceZ: float,
    viewportWidth: Double,
    viewportHeight: Double,
    world: DeepImmutable[Matrix],
    view: DeepImmutable[Matrix],
    projection: DeepImmutable[Matrix],
    result: Vector3
  ): Unit = js.native
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
    source: Vector3,
    viewportWidth: Double,
    viewportHeight: Double,
    world: DeepImmutable[Matrix],
    transform: DeepImmutable[Matrix]
  ): Vector3 = js.native
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
    source: DeepImmutable[Vector3],
    viewportWidth: Double,
    viewportHeight: Double,
    world: DeepImmutable[Matrix],
    view: DeepImmutable[Matrix],
    projection: DeepImmutable[Matrix],
    result: Vector3
  ): Unit = js.native
  /**
    * Returns a new Vector3 set to (0.0, 1.0, 0.0)
    * @returns a new up Vector3
    */
  def Up(): Vector3 = js.native
  /**
    * Gets a up Vector3 that must not be updated
    */
  def UpReadOnly(): DeepImmutable[Vector3] = js.native
  /**
    * Returns a new Vector3 set to (0.0, 0.0, 0.0)
    * @returns a new empty Vector3
    */
  def Zero(): Vector3 = js.native
  /**
    * Gets a zero Vector3 that must not be updated
    */
  def ZeroReadOnly(): DeepImmutable[Vector3] = js.native
  /** @hidden */
  def _UnprojectFromInvertedMatrixToRef(source: DeepImmutable[Vector3], matrix: DeepImmutable[Matrix], result: Vector3): Unit = js.native
}

