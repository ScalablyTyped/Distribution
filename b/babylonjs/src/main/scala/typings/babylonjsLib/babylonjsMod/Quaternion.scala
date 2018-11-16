package typings
package babylonjsLib.babylonjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * Class used to store quaternion data
     * @see https://en.wikipedia.org/wiki/Quaternion
     * @see http://doc.babylonjs.com/features/position,_rotation,_scaling
     */
@JSImport("babylonjs", "Quaternion")
@js.native
class Quaternion ()
  extends babylonjsLib.BABYLONNs.Quaternion {
  /**
           * Creates a new Quaternion from the given floats
           * @param x defines the first component (0 by default)
           * @param y defines the second component (0 by default)
           * @param z defines the third component (0 by default)
           * @param w defines the fourth component (1.0 by default)
           */
  def this(/** defines the first component (0 by default) */
  x: scala.Double) = this()
  /**
           * Creates a new Quaternion from the given floats
           * @param x defines the first component (0 by default)
           * @param y defines the second component (0 by default)
           * @param z defines the third component (0 by default)
           * @param w defines the fourth component (1.0 by default)
           */
  def this(/** defines the first component (0 by default) */
  x: scala.Double, /** defines the second component (0 by default) */
  y: scala.Double) = this()
  /**
           * Creates a new Quaternion from the given floats
           * @param x defines the first component (0 by default)
           * @param y defines the second component (0 by default)
           * @param z defines the third component (0 by default)
           * @param w defines the fourth component (1.0 by default)
           */
  def this(/** defines the first component (0 by default) */
  x: scala.Double, /** defines the second component (0 by default) */
  y: scala.Double, /** defines the third component (0 by default) */
  z: scala.Double) = this()
  /**
           * Creates a new Quaternion from the given floats
           * @param x defines the first component (0 by default)
           * @param y defines the second component (0 by default)
           * @param z defines the third component (0 by default)
           * @param w defines the fourth component (1.0 by default)
           */
  def this(/** defines the first component (0 by default) */
  x: scala.Double, /** defines the second component (0 by default) */
  y: scala.Double, /** defines the third component (0 by default) */
  z: scala.Double, /** defines the fourth component (1.0 by default) */
  w: scala.Double) = this()
}

/**
     * Class used to store quaternion data
     * @see https://en.wikipedia.org/wiki/Quaternion
     * @see http://doc.babylonjs.com/features/position,_rotation,_scaling
     */
@JSImport("babylonjs", "Quaternion")
@js.native
object Quaternion extends js.Object {
  /**
           * Checks if the two quaternions are close to each other
           * @param quat0 defines the first quaternion to check
           * @param quat1 defines the second quaternion to check
           * @returns true if the two quaternions are close to each other
           */
  def AreClose(quat0: babylonjsLib.BABYLONNs.Quaternion, quat1: babylonjsLib.BABYLONNs.Quaternion): scala.Boolean = js.native
  /**
           * Returns the dot product (float) between the quaternions "left" and "right"
           * @param left defines the left operand
           * @param right defines the right operand
           * @returns the dot product
           */
  def Dot(left: babylonjsLib.BABYLONNs.Quaternion, right: babylonjsLib.BABYLONNs.Quaternion): scala.Double = js.native
  /**
           * Creates a new quaternion from data stored into an array
           * @param array defines the data source
           * @param offset defines the offset in the source array where the data starts
           * @returns a new quaternion
           */
  def FromArray(array: stdLib.ArrayLike[scala.Double]): babylonjsLib.BABYLONNs.Quaternion = js.native
  /**
           * Creates a new quaternion from data stored into an array
           * @param array defines the data source
           * @param offset defines the offset in the source array where the data starts
           * @returns a new quaternion
           */
  def FromArray(array: stdLib.ArrayLike[scala.Double], offset: scala.Double): babylonjsLib.BABYLONNs.Quaternion = js.native
  /**
           * Creates a new quaternion from a rotation matrix
           * @param matrix defines the source matrix
           * @returns a new quaternion created from the given rotation matrix values
           */
  def FromRotationMatrix(matrix: babylonjsLib.BABYLONNs.Matrix): babylonjsLib.BABYLONNs.Quaternion = js.native
  /**
           * Updates the given quaternion with the given rotation matrix values
           * @param matrix defines the source matrix
           * @param result defines the target quaternion
           */
  def FromRotationMatrixToRef(matrix: babylonjsLib.BABYLONNs.Matrix, result: babylonjsLib.BABYLONNs.Quaternion): scala.Unit = js.native
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
    value1: babylonjsLib.BABYLONNs.Quaternion,
    tangent1: babylonjsLib.BABYLONNs.Quaternion,
    value2: babylonjsLib.BABYLONNs.Quaternion,
    tangent2: babylonjsLib.BABYLONNs.Quaternion,
    amount: scala.Double
  ): babylonjsLib.BABYLONNs.Quaternion = js.native
  /**
           * Creates an identity quaternion
           * @returns the identity quaternion
           */
  def Identity(): babylonjsLib.BABYLONNs.Quaternion = js.native
  /**
           * Inverse a given quaternion
           * @param q defines the source quaternion
           * @returns a new quaternion as the inverted current quaternion
           */
  def Inverse(q: babylonjsLib.BABYLONNs.Quaternion): babylonjsLib.BABYLONNs.Quaternion = js.native
  /**
           * Gets a boolean indicating if the given quaternion is identity
           * @param quaternion defines the quaternion to check
           * @returns true if the quaternion is identity
           */
  def IsIdentity(quaternion: babylonjsLib.BABYLONNs.Quaternion): scala.Boolean = js.native
  /**
           * Creates a new quaternion from the given Euler float angles expressed in z-x-z orientation
           * @param alpha defines the rotation around first axis
           * @param beta defines the rotation around second axis
           * @param gamma defines the rotation around third axis
           * @returns the new quaternion
           */
  def RotationAlphaBetaGamma(alpha: scala.Double, beta: scala.Double, gamma: scala.Double): babylonjsLib.BABYLONNs.Quaternion = js.native
  /**
           * Creates a new quaternion from the given Euler float angles expressed in z-x-z orientation and stores it in the target quaternion
           * @param alpha defines the rotation around first axis
           * @param beta defines the rotation around second axis
           * @param gamma defines the rotation around third axis
           * @param result defines the target quaternion
           */
  def RotationAlphaBetaGammaToRef(
    alpha: scala.Double,
    beta: scala.Double,
    gamma: scala.Double,
    result: babylonjsLib.BABYLONNs.Quaternion
  ): scala.Unit = js.native
  /**
           * Creates a quaternion from a rotation around an axis
           * @param axis defines the axis to use
           * @param angle defines the angle to use
           * @returns a new quaternion created from the given axis (Vector3) and angle in radians (float)
           */
  def RotationAxis(axis: babylonjsLib.BABYLONNs.Vector3, angle: scala.Double): babylonjsLib.BABYLONNs.Quaternion = js.native
  /**
           * Creates a rotation around an axis and stores it into the given quaternion
           * @param axis defines the axis to use
           * @param angle defines the angle to use
           * @param result defines the target quaternion
           * @returns the target quaternion
           */
  def RotationAxisToRef(
    axis: babylonjsLib.BABYLONNs.Vector3,
    angle: scala.Double,
    result: babylonjsLib.BABYLONNs.Quaternion
  ): babylonjsLib.BABYLONNs.Quaternion = js.native
  /**
           * Creates a new quaternion containing the rotation value to reach the target (axis1, axis2, axis3) orientation as a rotated XYZ system (axis1, axis2 and axis3 are normalized during this operation)
           * @param axis1 defines the first axis
           * @param axis2 defines the second axis
           * @param axis3 defines the third axis
           * @returns the new quaternion
           */
  def RotationQuaternionFromAxis(
    axis1: babylonjsLib.BABYLONNs.Vector3,
    axis2: babylonjsLib.BABYLONNs.Vector3,
    axis3: babylonjsLib.BABYLONNs.Vector3
  ): babylonjsLib.BABYLONNs.Quaternion = js.native
  /**
           * Creates a rotation value to reach the target (axis1, axis2, axis3) orientation as a rotated XYZ system (axis1, axis2 and axis3 are normalized during this operation) and stores it in the target quaternion
           * @param axis1 defines the first axis
           * @param axis2 defines the second axis
           * @param axis3 defines the third axis
           * @param ref defines the target quaternion
           */
  def RotationQuaternionFromAxisToRef(
    axis1: babylonjsLib.BABYLONNs.Vector3,
    axis2: babylonjsLib.BABYLONNs.Vector3,
    axis3: babylonjsLib.BABYLONNs.Vector3,
    ref: babylonjsLib.BABYLONNs.Quaternion
  ): scala.Unit = js.native
  /**
           * Creates a new quaternion from the given Euler float angles (y, x, z)
           * @param yaw defines the rotation around Y axis
           * @param pitch defines the rotation around X axis
           * @param roll defines the rotation around Z axis
           * @returns the new quaternion
           */
  def RotationYawPitchRoll(yaw: scala.Double, pitch: scala.Double, roll: scala.Double): babylonjsLib.BABYLONNs.Quaternion = js.native
  /**
           * Creates a new rotation from the given Euler float angles (y, x, z) and stores it in the target quaternion
           * @param yaw defines the rotation around Y axis
           * @param pitch defines the rotation around X axis
           * @param roll defines the rotation around Z axis
           * @param result defines the target quaternion
           */
  def RotationYawPitchRollToRef(
    yaw: scala.Double,
    pitch: scala.Double,
    roll: scala.Double,
    result: babylonjsLib.BABYLONNs.Quaternion
  ): scala.Unit = js.native
  /**
           * Interpolates between two quaternions
           * @param left defines first quaternion
           * @param right defines second quaternion
           * @param amount defines the gradient to use
           * @returns the new interpolated quaternion
           */
  def Slerp(
    left: babylonjsLib.BABYLONNs.Quaternion,
    right: babylonjsLib.BABYLONNs.Quaternion,
    amount: scala.Double
  ): babylonjsLib.BABYLONNs.Quaternion = js.native
  /**
           * Interpolates between two quaternions and stores it into a target quaternion
           * @param left defines first quaternion
           * @param right defines second quaternion
           * @param amount defines the gradient to use
           * @param result defines the target quaternion
           */
  def SlerpToRef(
    left: babylonjsLib.BABYLONNs.Quaternion,
    right: babylonjsLib.BABYLONNs.Quaternion,
    amount: scala.Double,
    result: babylonjsLib.BABYLONNs.Quaternion
  ): scala.Unit = js.native
  /**
           * Creates an empty quaternion
           * @returns a new quaternion set to (0.0, 0.0, 0.0)
           */
  def Zero(): babylonjsLib.BABYLONNs.Quaternion = js.native
}

