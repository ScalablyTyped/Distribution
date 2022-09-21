package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Quaternion extends StObject {
  
  /** @hidden */
  var _isDirty: Boolean = js.native
  
  /** @hidden */
  var _w: Double = js.native
  
  /** @hidden */
  var _x: Double = js.native
  
  /** @hidden */
  var _y: Double = js.native
  
  /** @hidden */
  var _z: Double = js.native
  
  /**
    * Adds two quaternions
    * @param other defines the second operand
    * @returns a new quaternion as the addition result of the given one and the current quaternion
    */
  def add(other: DeepImmutable[Quaternion]): Quaternion = js.native
  
  /**
    * Add a quaternion to the current one
    * @param other defines the quaternion to add
    * @returns the current quaternion
    */
  def addInPlace(other: DeepImmutable[Quaternion]): Quaternion = js.native
  
  /**
    * Copy the quaternion to an array
    * @returns a new array populated with 4 elements from the quaternion coordinates
    */
  def asArray(): js.Array[Double] = js.native
  
  /**
    * Conjugates in place (1-q) the current quaternion
    * @returns a new quaternion
    */
  def conjugate(): Quaternion = js.native
  
  /**
    * Conjugates in place (1-q) the current quaternion
    * @returns the current updated quaternion
    */
  def conjugateInPlace(): Quaternion = js.native
  
  /**
    * Conjugates (1-q) the current quaternion and stores the result in the given quaternion
    * @param ref defines the target quaternion
    * @returns the current quaternion
    */
  def conjugateToRef(ref: Quaternion): Quaternion = js.native
  
  /**
    * Copy a quaternion to the current one
    * @param other defines the other quaternion
    * @returns the updated current quaternion
    */
  def copyFrom(other: DeepImmutable[Quaternion]): Quaternion = js.native
  
  /**
    * Updates the current quaternion with the given float coordinates
    * @param x defines the x coordinate
    * @param y defines the y coordinate
    * @param z defines the z coordinate
    * @param w defines the w coordinate
    * @returns the updated current quaternion
    */
  def copyFromFloats(x: Double, y: Double, z: Double, w: Double): Quaternion = js.native
  
  /**
    * Check if two quaternions are equals
    * @param otherQuaternion defines the second operand
    * @returns true if the current quaternion and the given one coordinates are strictly equals
    */
  def equals(otherQuaternion: DeepImmutable[Quaternion]): Boolean = js.native
  
  /**
    * Gets a boolean if two quaternions are equals (using an epsilon value)
    * @param otherQuaternion defines the other quaternion
    * @param epsilon defines the minimal distance to consider equality
    * @returns true if the given quaternion coordinates are close to the current ones by a distance of epsilon.
    */
  def equalsWithEpsilon(otherQuaternion: DeepImmutable[Quaternion]): Boolean = js.native
  def equalsWithEpsilon(otherQuaternion: DeepImmutable[Quaternion], epsilon: Double): Boolean = js.native
  
  /**
    * Updates the current quaternion from the given rotation matrix values
    * @param matrix defines the source matrix
    * @returns the current updated quaternion
    */
  def fromRotationMatrix(matrix: DeepImmutable[Matrix]): Quaternion = js.native
  
  /**
    * Gets the class name of the quaternion
    * @returns the string "Quaternion"
    */
  def getClassName(): String = js.native
  
  /**
    * Gets a hash code for this quaternion
    * @returns the quaternion hash code
    */
  def getHashCode(): Double = js.native
  
  /**
    * Returns the inverse of the current quaternion
    * @returns a new quaternion
    */
  def invert(): Quaternion = js.native
  
  /**
    * Invert in place the current quaternion
    * @returns this quaternion
    */
  def invertInPlace(): Quaternion = js.native
  
  /**
    * Gets length of current quaternion
    * @returns the quaternion length (float)
    */
  def length(): Double = js.native
  
  /**
    * Gets squared length of current quaternion
    * @returns the quaternion length (float)
    */
  def lengthSquared(): Double = js.native
  
  /**
    * Multiplies two quaternions
    * @param q1 defines the second operand
    * @returns a new quaternion set as the multiplication result of the current one with the given one "q1"
    */
  def multiply(q1: DeepImmutable[Quaternion]): Quaternion = js.native
  
  /**
    * Updates the current quaternion with the multiplication of itself with the given one "q1"
    * @param q1 defines the second operand
    * @returns the currentupdated quaternion
    */
  def multiplyInPlace(q1: DeepImmutable[Quaternion]): Quaternion = js.native
  
  /**
    * Sets the given "result" as the the multiplication result of the current one with the given one "q1"
    * @param q1 defines the second operand
    * @param result defines the target quaternion
    * @returns the current quaternion
    */
  def multiplyToRef(q1: DeepImmutable[Quaternion], result: Quaternion): Quaternion = js.native
  
  /**
    * Normalize in place the current quaternion
    * @returns the current updated quaternion
    */
  def normalize(): Quaternion = js.native
  
  /**
    * Normalize a copy of the current quaternion
    * @returns the normalized quaternion
    */
  def normalizeToNew(): Quaternion = js.native
  
  /**
    * Multiplies the current quaternion by a scale factor
    * @param value defines the scale factor
    * @returns a new quaternion set by multiplying the current quaternion coordinates by the float "scale"
    */
  def scale(value: Double): Quaternion = js.native
  
  /**
    * Scale the current quaternion values by a factor and add the result to a given quaternion
    * @param scale defines the scale factor
    * @param result defines the Quaternion object where to store the result
    * @returns the unmodified current quaternion
    */
  def scaleAndAddToRef(scale: Double, result: Quaternion): Quaternion = js.native
  
  /**
    * Multiplies in place the current quaternion by a scale factor
    * @param value defines the scale factor
    * @returns the current modified quaternion
    */
  def scaleInPlace(value: Double): Quaternion = js.native
  
  /**
    * Scale the current quaternion values by a factor and stores the result to a given quaternion
    * @param scale defines the scale factor
    * @param result defines the Quaternion object where to store the result
    * @returns the unmodified current quaternion
    */
  def scaleToRef(scale: Double, result: Quaternion): Quaternion = js.native
  
  /**
    * Updates the current quaternion from the given float coordinates
    * @param x defines the x coordinate
    * @param y defines the y coordinate
    * @param z defines the z coordinate
    * @param w defines the w coordinate
    * @returns the updated current quaternion
    */
  def set(x: Double, y: Double, z: Double, w: Double): Quaternion = js.native
  
  /**
    * Subtract two quaternions
    * @param other defines the second operand
    * @returns a new quaternion as the subtraction result of the given one from the current one
    */
  def subtract(other: Quaternion): Quaternion = js.native
  
  /**
    * Subtract a quaternion to the current one
    * @param other defines the quaternion to subtract
    * @returns the current quaternion
    */
  def subtractInPlace(other: DeepImmutable[Quaternion]): Quaternion = js.native
  
  /**
    * Stores from the starting index in the given array the Quaternion successive values
    * @param array defines the array where to store the x,y,z,w components
    * @param index defines an optional index in the target array to define where to start storing values
    * @returns the current Quaternion object
    */
  def toArray(array: FloatArray): Quaternion = js.native
  def toArray(array: FloatArray, index: Double): Quaternion = js.native
  
  /**
    * Returns a new Vector3 set with the Euler angles translated from the current quaternion
    * @returns a new Vector3 containing the Euler angles
    * @see https://doc.babylonjs.com/divingDeeper/mesh/transforms/center_origin/rotation_conventions
    */
  def toEulerAngles(): Vector3 = js.native
  
  /**
    * Sets the given vector3 "result" with the Euler angles translated from the current quaternion
    * @param result defines the vector which will be filled with the Euler angles
    * @returns the current unchanged quaternion
    * @see https://doc.babylonjs.com/divingDeeper/mesh/transforms/center_origin/rotation_conventions
    */
  def toEulerAnglesToRef(result: Vector3): Quaternion = js.native
  
  /**
    * Updates the given rotation matrix with the current quaternion values
    * @param result defines the target matrix
    * @returns the current unchanged quaternion
    */
  def toRotationMatrix(result: Matrix): Quaternion = js.native
  
  /** Gets or sets the w coordinate */
  def w: Double = js.native
  def w_=(value: Double): Unit = js.native
  
  /** Gets or sets the x coordinate */
  def x: Double = js.native
  def x_=(value: Double): Unit = js.native
  
  /** Gets or sets the y coordinate */
  def y: Double = js.native
  def y_=(value: Double): Unit = js.native
  
  /** Gets or sets the z coordinate */
  def z: Double = js.native
  def z_=(value: Double): Unit = js.native
}
