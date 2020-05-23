package typings.babylonjs.global.BABYLON

import typings.babylonjs.BABYLON.DeepImmutable
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
class Quaternion ()
  extends typings.babylonjs.BABYLON.Quaternion {
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
  def AreClose(
    quat0: DeepImmutable[typings.babylonjs.BABYLON.Quaternion],
    quat1: DeepImmutable[typings.babylonjs.BABYLON.Quaternion]
  ): Boolean = js.native
  /**
    * Returns the dot product (float) between the quaternions "left" and "right"
    * @param left defines the left operand
    * @param right defines the right operand
    * @returns the dot product
    */
  def Dot(
    left: DeepImmutable[typings.babylonjs.BABYLON.Quaternion],
    right: DeepImmutable[typings.babylonjs.BABYLON.Quaternion]
  ): Double = js.native
  /**
    * Creates a new quaternion from data stored into an array
    * @param array defines the data source
    * @param offset defines the offset in the source array where the data starts
    * @returns a new quaternion
    */
  def FromArray(array: DeepImmutable[ArrayLike[Double]]): typings.babylonjs.BABYLON.Quaternion = js.native
  def FromArray(array: DeepImmutable[ArrayLike[Double]], offset: Double): typings.babylonjs.BABYLON.Quaternion = js.native
  /**
    * Create a quaternion from Euler rotation angles
    * @param x Pitch
    * @param y Yaw
    * @param z Roll
    * @returns the new Quaternion
    */
  def FromEulerAngles(x: Double, y: Double, z: Double): typings.babylonjs.BABYLON.Quaternion = js.native
  /**
    * Updates a quaternion from Euler rotation angles
    * @param x Pitch
    * @param y Yaw
    * @param z Roll
    * @param result the quaternion to store the result
    * @returns the updated quaternion
    */
  def FromEulerAnglesToRef(x: Double, y: Double, z: Double, result: typings.babylonjs.BABYLON.Quaternion): typings.babylonjs.BABYLON.Quaternion = js.native
  /**
    * Create a quaternion from Euler rotation vector
    * @param vec the Euler vector (x Pitch, y Yaw, z Roll)
    * @returns the new Quaternion
    */
  def FromEulerVector(vec: DeepImmutable[typings.babylonjs.BABYLON.Vector3]): typings.babylonjs.BABYLON.Quaternion = js.native
  /**
    * Updates a quaternion from Euler rotation vector
    * @param vec the Euler vector (x Pitch, y Yaw, z Roll)
    * @param result the quaternion to store the result
    * @returns the updated quaternion
    */
  def FromEulerVectorToRef(
    vec: DeepImmutable[typings.babylonjs.BABYLON.Vector3],
    result: typings.babylonjs.BABYLON.Quaternion
  ): typings.babylonjs.BABYLON.Quaternion = js.native
  /**
    * Creates a new quaternion from a rotation matrix
    * @param matrix defines the source matrix
    * @returns a new quaternion created from the given rotation matrix values
    */
  def FromRotationMatrix(matrix: DeepImmutable[typings.babylonjs.BABYLON.Matrix]): typings.babylonjs.BABYLON.Quaternion = js.native
  /**
    * Updates the given quaternion with the given rotation matrix values
    * @param matrix defines the source matrix
    * @param result defines the target quaternion
    */
  def FromRotationMatrixToRef(
    matrix: DeepImmutable[typings.babylonjs.BABYLON.Matrix],
    result: typings.babylonjs.BABYLON.Quaternion
  ): Unit = js.native
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
    value1: DeepImmutable[typings.babylonjs.BABYLON.Quaternion],
    tangent1: DeepImmutable[typings.babylonjs.BABYLON.Quaternion],
    value2: DeepImmutable[typings.babylonjs.BABYLON.Quaternion],
    tangent2: DeepImmutable[typings.babylonjs.BABYLON.Quaternion],
    amount: Double
  ): typings.babylonjs.BABYLON.Quaternion = js.native
  /**
    * Creates an identity quaternion
    * @returns the identity quaternion
    */
  def Identity(): typings.babylonjs.BABYLON.Quaternion = js.native
  /**
    * Inverse a given quaternion
    * @param q defines the source quaternion
    * @returns a new quaternion as the inverted current quaternion
    */
  def Inverse(q: DeepImmutable[typings.babylonjs.BABYLON.Quaternion]): typings.babylonjs.BABYLON.Quaternion = js.native
  /**
    * Inverse a given quaternion
    * @param q defines the source quaternion
    * @param result the quaternion the result will be stored in
    * @returns the result quaternion
    */
  def InverseToRef(q: typings.babylonjs.BABYLON.Quaternion, result: typings.babylonjs.BABYLON.Quaternion): typings.babylonjs.BABYLON.Quaternion = js.native
  /**
    * Gets a boolean indicating if the given quaternion is identity
    * @param quaternion defines the quaternion to check
    * @returns true if the quaternion is identity
    */
  def IsIdentity(quaternion: DeepImmutable[typings.babylonjs.BABYLON.Quaternion]): Boolean = js.native
  /**
    * Creates a new quaternion from the given Euler float angles expressed in z-x-z orientation
    * @param alpha defines the rotation around first axis
    * @param beta defines the rotation around second axis
    * @param gamma defines the rotation around third axis
    * @returns the new quaternion
    */
  def RotationAlphaBetaGamma(alpha: Double, beta: Double, gamma: Double): typings.babylonjs.BABYLON.Quaternion = js.native
  /**
    * Creates a new quaternion from the given Euler float angles expressed in z-x-z orientation and stores it in the target quaternion
    * @param alpha defines the rotation around first axis
    * @param beta defines the rotation around second axis
    * @param gamma defines the rotation around third axis
    * @param result defines the target quaternion
    */
  def RotationAlphaBetaGammaToRef(alpha: Double, beta: Double, gamma: Double, result: typings.babylonjs.BABYLON.Quaternion): Unit = js.native
  /**
    * Creates a quaternion from a rotation around an axis
    * @param axis defines the axis to use
    * @param angle defines the angle to use
    * @returns a new quaternion created from the given axis (Vector3) and angle in radians (float)
    */
  def RotationAxis(axis: DeepImmutable[typings.babylonjs.BABYLON.Vector3], angle: Double): typings.babylonjs.BABYLON.Quaternion = js.native
  /**
    * Creates a rotation around an axis and stores it into the given quaternion
    * @param axis defines the axis to use
    * @param angle defines the angle to use
    * @param result defines the target quaternion
    * @returns the target quaternion
    */
  def RotationAxisToRef(
    axis: DeepImmutable[typings.babylonjs.BABYLON.Vector3],
    angle: Double,
    result: typings.babylonjs.BABYLON.Quaternion
  ): typings.babylonjs.BABYLON.Quaternion = js.native
  /**
    * Creates a new quaternion containing the rotation value to reach the target (axis1, axis2, axis3) orientation as a rotated XYZ system (axis1, axis2 and axis3 are normalized during this operation)
    * @param axis1 defines the first axis
    * @param axis2 defines the second axis
    * @param axis3 defines the third axis
    * @returns the new quaternion
    */
  def RotationQuaternionFromAxis(
    axis1: DeepImmutable[typings.babylonjs.BABYLON.Vector3],
    axis2: DeepImmutable[typings.babylonjs.BABYLON.Vector3],
    axis3: DeepImmutable[typings.babylonjs.BABYLON.Vector3]
  ): typings.babylonjs.BABYLON.Quaternion = js.native
  /**
    * Creates a rotation value to reach the target (axis1, axis2, axis3) orientation as a rotated XYZ system (axis1, axis2 and axis3 are normalized during this operation) and stores it in the target quaternion
    * @param axis1 defines the first axis
    * @param axis2 defines the second axis
    * @param axis3 defines the third axis
    * @param ref defines the target quaternion
    */
  def RotationQuaternionFromAxisToRef(
    axis1: DeepImmutable[typings.babylonjs.BABYLON.Vector3],
    axis2: DeepImmutable[typings.babylonjs.BABYLON.Vector3],
    axis3: DeepImmutable[typings.babylonjs.BABYLON.Vector3],
    ref: typings.babylonjs.BABYLON.Quaternion
  ): Unit = js.native
  /**
    * Creates a new quaternion from the given Euler float angles (y, x, z)
    * @param yaw defines the rotation around Y axis
    * @param pitch defines the rotation around X axis
    * @param roll defines the rotation around Z axis
    * @returns the new quaternion
    */
  def RotationYawPitchRoll(yaw: Double, pitch: Double, roll: Double): typings.babylonjs.BABYLON.Quaternion = js.native
  /**
    * Creates a new rotation from the given Euler float angles (y, x, z) and stores it in the target quaternion
    * @param yaw defines the rotation around Y axis
    * @param pitch defines the rotation around X axis
    * @param roll defines the rotation around Z axis
    * @param result defines the target quaternion
    */
  def RotationYawPitchRollToRef(yaw: Double, pitch: Double, roll: Double, result: typings.babylonjs.BABYLON.Quaternion): Unit = js.native
  /**
    * Interpolates between two quaternions
    * @param left defines first quaternion
    * @param right defines second quaternion
    * @param amount defines the gradient to use
    * @returns the new interpolated quaternion
    */
  def Slerp(
    left: DeepImmutable[typings.babylonjs.BABYLON.Quaternion],
    right: DeepImmutable[typings.babylonjs.BABYLON.Quaternion],
    amount: Double
  ): typings.babylonjs.BABYLON.Quaternion = js.native
  /**
    * Interpolates between two quaternions and stores it into a target quaternion
    * @param left defines first quaternion
    * @param right defines second quaternion
    * @param amount defines the gradient to use
    * @param result defines the target quaternion
    */
  def SlerpToRef(
    left: DeepImmutable[typings.babylonjs.BABYLON.Quaternion],
    right: DeepImmutable[typings.babylonjs.BABYLON.Quaternion],
    amount: Double,
    result: typings.babylonjs.BABYLON.Quaternion
  ): Unit = js.native
  /**
    * Creates an empty quaternion
    * @returns a new quaternion set to (0.0, 0.0, 0.0)
    */
  def Zero(): typings.babylonjs.BABYLON.Quaternion = js.native
}

