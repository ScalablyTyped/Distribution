package typings.babylonjs.BABYLON

import typings.std.ArrayLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("BABYLON.Quaternion")
@js.native
/**
  * Creates a new Quaternion from the given floats
  * @param x defines the first component (0 by default)
  * @param y defines the second component (0 by default)
  * @param z defines the third component (0 by default)
  * @param w defines the fourth component (1.0 by default)
  */
class Quaternion () extends js.Object {
  def this(/** defines the first component (0 by default) */
  x: Double) = this()
  def this(
    /** defines the first component (0 by default) */
  x: Double,
    /** defines the second component (0 by default) */
  y: Double
  ) = this()
  def this(
    /** defines the first component (0 by default) */
  x: Double,
    /** defines the second component (0 by default) */
  y: Double,
    /** defines the third component (0 by default) */
  z: Double
  ) = this()
  def this(
    /** defines the first component (0 by default) */
  x: Double,
    /** defines the second component (0 by default) */
  y: Double,
    /** defines the third component (0 by default) */
  z: Double,
    /** defines the fourth component (1.0 by default) */
  w: Double
  ) = this()
  /** defines the fourth component (1.0 by default) */
  var w: Double = js.native
  /** defines the first component (0 by default) */
  var x: Double = js.native
  /** defines the second component (0 by default) */
  var y: Double = js.native
  /** defines the third component (0 by default) */
  var z: Double = js.native
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
    * @return true if the current quaternion and the given one coordinates are strictly equals
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
    * Gets length of current quaternion
    * @returns the quaternion length (float)
    */
  def length(): Double = js.native
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
    * Returns a new Vector3 set with the Euler angles translated from the current quaternion
    * @param order is a reserved parameter and is ignore for now
    * @returns a new Vector3 containing the Euler angles
    */
  def toEulerAngles(): Vector3 = js.native
  def toEulerAngles(order: String): Vector3 = js.native
  /**
    * Sets the given vector3 "result" with the Euler angles translated from the current quaternion
    * @param result defines the vector which will be filled with the Euler angles
    * @param order is a reserved parameter and is ignore for now
    * @returns the current unchanged quaternion
    */
  def toEulerAnglesToRef(result: Vector3): Quaternion = js.native
  /**
    * Updates the given rotation matrix with the current quaternion values
    * @param result defines the target matrix
    * @returns the current unchanged quaternion
    */
  def toRotationMatrix(result: Matrix): Quaternion = js.native
}

/* static members */
@JSGlobal("BABYLON.Quaternion")
@js.native
object Quaternion extends js.Object {
  /**
    * Checks if the two quaternions are close to each other
    * @param quat0 defines the first quaternion to check
    * @param quat1 defines the second quaternion to check
    * @returns true if the two quaternions are close to each other
    */
  def AreClose(quat0: DeepImmutable[Quaternion], quat1: DeepImmutable[Quaternion]): Boolean = js.native
  /**
    * Returns the dot product (float) between the quaternions "left" and "right"
    * @param left defines the left operand
    * @param right defines the right operand
    * @returns the dot product
    */
  def Dot(left: DeepImmutable[Quaternion], right: DeepImmutable[Quaternion]): Double = js.native
  /**
    * Creates a new quaternion from data stored into an array
    * @param array defines the data source
    * @param offset defines the offset in the source array where the data starts
    * @returns a new quaternion
    */
  def FromArray(array: DeepImmutable[ArrayLike[Double]]): Quaternion = js.native
  def FromArray(array: DeepImmutable[ArrayLike[Double]], offset: Double): Quaternion = js.native
  /**
    * Create a quaternion from Euler rotation angles
    * @param x Pitch
    * @param y Yaw
    * @param z Roll
    * @returns the new Quaternion
    */
  def FromEulerAngles(x: Double, y: Double, z: Double): Quaternion = js.native
  /**
    * Updates a quaternion from Euler rotation angles
    * @param x Pitch
    * @param y Yaw
    * @param z Roll
    * @param result the quaternion to store the result
    * @returns the updated quaternion
    */
  def FromEulerAnglesToRef(x: Double, y: Double, z: Double, result: Quaternion): Quaternion = js.native
  /**
    * Create a quaternion from Euler rotation vector
    * @param vec the Euler vector (x Pitch, y Yaw, z Roll)
    * @returns the new Quaternion
    */
  def FromEulerVector(vec: DeepImmutable[Vector3]): Quaternion = js.native
  /**
    * Updates a quaternion from Euler rotation vector
    * @param vec the Euler vector (x Pitch, y Yaw, z Roll)
    * @param result the quaternion to store the result
    * @returns the updated quaternion
    */
  def FromEulerVectorToRef(vec: DeepImmutable[Vector3], result: Quaternion): Quaternion = js.native
  /**
    * Creates a new quaternion from a rotation matrix
    * @param matrix defines the source matrix
    * @returns a new quaternion created from the given rotation matrix values
    */
  def FromRotationMatrix(matrix: DeepImmutable[Matrix]): Quaternion = js.native
  /**
    * Updates the given quaternion with the given rotation matrix values
    * @param matrix defines the source matrix
    * @param result defines the target quaternion
    */
  def FromRotationMatrixToRef(matrix: DeepImmutable[Matrix], result: Quaternion): Unit = js.native
  /**
    * Interpolate between two quaternions using Hermite interpolation
    * @param value1 defines first quaternion
    * @param tangent1 defines the incoming tangent
    * @param value2 defines second quaternion
    * @param tangent2 defines the outgoing tangent
    * @param amount defines the target quaternion
    * @returns the new interpolated quaternion
    */
  def Hermite(
    value1: DeepImmutable[Quaternion],
    tangent1: DeepImmutable[Quaternion],
    value2: DeepImmutable[Quaternion],
    tangent2: DeepImmutable[Quaternion],
    amount: Double
  ): Quaternion = js.native
  /**
    * Creates an identity quaternion
    * @returns the identity quaternion
    */
  def Identity(): Quaternion = js.native
  /**
    * Inverse a given quaternion
    * @param q defines the source quaternion
    * @returns a new quaternion as the inverted current quaternion
    */
  def Inverse(q: DeepImmutable[Quaternion]): Quaternion = js.native
  /**
    * Inverse a given quaternion
    * @param q defines the source quaternion
    * @param result the quaternion the result will be stored in
    * @returns the result quaternion
    */
  def InverseToRef(q: Quaternion, result: Quaternion): Quaternion = js.native
  /**
    * Gets a boolean indicating if the given quaternion is identity
    * @param quaternion defines the quaternion to check
    * @returns true if the quaternion is identity
    */
  def IsIdentity(quaternion: DeepImmutable[Quaternion]): Boolean = js.native
  /**
    * Creates a new quaternion from the given Euler float angles expressed in z-x-z orientation
    * @param alpha defines the rotation around first axis
    * @param beta defines the rotation around second axis
    * @param gamma defines the rotation around third axis
    * @returns the new quaternion
    */
  def RotationAlphaBetaGamma(alpha: Double, beta: Double, gamma: Double): Quaternion = js.native
  /**
    * Creates a new quaternion from the given Euler float angles expressed in z-x-z orientation and stores it in the target quaternion
    * @param alpha defines the rotation around first axis
    * @param beta defines the rotation around second axis
    * @param gamma defines the rotation around third axis
    * @param result defines the target quaternion
    */
  def RotationAlphaBetaGammaToRef(alpha: Double, beta: Double, gamma: Double, result: Quaternion): Unit = js.native
  /**
    * Creates a quaternion from a rotation around an axis
    * @param axis defines the axis to use
    * @param angle defines the angle to use
    * @returns a new quaternion created from the given axis (Vector3) and angle in radians (float)
    */
  def RotationAxis(axis: DeepImmutable[Vector3], angle: Double): Quaternion = js.native
  /**
    * Creates a rotation around an axis and stores it into the given quaternion
    * @param axis defines the axis to use
    * @param angle defines the angle to use
    * @param result defines the target quaternion
    * @returns the target quaternion
    */
  def RotationAxisToRef(axis: DeepImmutable[Vector3], angle: Double, result: Quaternion): Quaternion = js.native
  /**
    * Creates a new quaternion containing the rotation value to reach the target (axis1, axis2, axis3) orientation as a rotated XYZ system (axis1, axis2 and axis3 are normalized during this operation)
    * @param axis1 defines the first axis
    * @param axis2 defines the second axis
    * @param axis3 defines the third axis
    * @returns the new quaternion
    */
  def RotationQuaternionFromAxis(axis1: DeepImmutable[Vector3], axis2: DeepImmutable[Vector3], axis3: DeepImmutable[Vector3]): Quaternion = js.native
  /**
    * Creates a rotation value to reach the target (axis1, axis2, axis3) orientation as a rotated XYZ system (axis1, axis2 and axis3 are normalized during this operation) and stores it in the target quaternion
    * @param axis1 defines the first axis
    * @param axis2 defines the second axis
    * @param axis3 defines the third axis
    * @param ref defines the target quaternion
    */
  def RotationQuaternionFromAxisToRef(
    axis1: DeepImmutable[Vector3],
    axis2: DeepImmutable[Vector3],
    axis3: DeepImmutable[Vector3],
    ref: Quaternion
  ): Unit = js.native
  /**
    * Creates a new quaternion from the given Euler float angles (y, x, z)
    * @param yaw defines the rotation around Y axis
    * @param pitch defines the rotation around X axis
    * @param roll defines the rotation around Z axis
    * @returns the new quaternion
    */
  def RotationYawPitchRoll(yaw: Double, pitch: Double, roll: Double): Quaternion = js.native
  /**
    * Creates a new rotation from the given Euler float angles (y, x, z) and stores it in the target quaternion
    * @param yaw defines the rotation around Y axis
    * @param pitch defines the rotation around X axis
    * @param roll defines the rotation around Z axis
    * @param result defines the target quaternion
    */
  def RotationYawPitchRollToRef(yaw: Double, pitch: Double, roll: Double, result: Quaternion): Unit = js.native
  /**
    * Interpolates between two quaternions
    * @param left defines first quaternion
    * @param right defines second quaternion
    * @param amount defines the gradient to use
    * @returns the new interpolated quaternion
    */
  def Slerp(left: DeepImmutable[Quaternion], right: DeepImmutable[Quaternion], amount: Double): Quaternion = js.native
  /**
    * Interpolates between two quaternions and stores it into a target quaternion
    * @param left defines first quaternion
    * @param right defines second quaternion
    * @param amount defines the gradient to use
    * @param result defines the target quaternion
    */
  def SlerpToRef(
    left: DeepImmutable[Quaternion],
    right: DeepImmutable[Quaternion],
    amount: Double,
    result: Quaternion
  ): Unit = js.native
  /**
    * Creates an empty quaternion
    * @returns a new quaternion set to (0.0, 0.0, 0.0)
    */
  def Zero(): Quaternion = js.native
}

