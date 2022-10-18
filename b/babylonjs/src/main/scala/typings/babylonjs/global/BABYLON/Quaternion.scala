package typings.babylonjs.global.BABYLON

import typings.babylonjs.BABYLON.DeepImmutable
import typings.std.ArrayLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.Quaternion")
@js.native
/**
  * Creates a new Quaternion from the given floats
  * @param x defines the first component (0 by default)
  * @param y defines the second component (0 by default)
  * @param z defines the third component (0 by default)
  * @param w defines the fourth component (1.0 by default)
  */
open class Quaternion ()
  extends StObject
     with typings.babylonjs.BABYLON.Quaternion {
  def this(x: Double) = this()
  def this(x: Double, y: Double) = this()
  def this(x: Unit, y: Double) = this()
  def this(x: Double, y: Double, z: Double) = this()
  def this(x: Double, y: Unit, z: Double) = this()
  def this(x: Unit, y: Double, z: Double) = this()
  def this(x: Unit, y: Unit, z: Double) = this()
  def this(x: Double, y: Double, z: Double, w: Double) = this()
  def this(x: Double, y: Double, z: Unit, w: Double) = this()
  def this(x: Double, y: Unit, z: Double, w: Double) = this()
  def this(x: Double, y: Unit, z: Unit, w: Double) = this()
  def this(x: Unit, y: Double, z: Double, w: Double) = this()
  def this(x: Unit, y: Double, z: Unit, w: Double) = this()
  def this(x: Unit, y: Unit, z: Double, w: Double) = this()
  def this(x: Unit, y: Unit, z: Unit, w: Double) = this()
}
/* static members */
object Quaternion {
  
  @JSGlobal("BABYLON.Quaternion")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Checks if the orientations of two rotation quaternions are close to each other
    * @param quat0 defines the first quaternion to check
    * @param quat1 defines the second quaternion to check
    * @param epsilon defines closeness, 0 same orientation, 1 PI apart, default 0.1
    * @returns true if the two quaternions are close to each other within epsilon
    */
  inline def AreClose(
    quat0: DeepImmutable[typings.babylonjs.BABYLON.Quaternion],
    quat1: DeepImmutable[typings.babylonjs.BABYLON.Quaternion]
  ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("AreClose")(quat0.asInstanceOf[js.Any], quat1.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def AreClose(
    quat0: DeepImmutable[typings.babylonjs.BABYLON.Quaternion],
    quat1: DeepImmutable[typings.babylonjs.BABYLON.Quaternion],
    epsilon: Double
  ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("AreClose")(quat0.asInstanceOf[js.Any], quat1.asInstanceOf[js.Any], epsilon.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  /**
    * Returns the dot product (float) between the quaternions "left" and "right"
    * @param left defines the left operand
    * @param right defines the right operand
    * @returns the dot product
    */
  inline def Dot(
    left: DeepImmutable[typings.babylonjs.BABYLON.Quaternion],
    right: DeepImmutable[typings.babylonjs.BABYLON.Quaternion]
  ): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("Dot")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  /**
    * Creates a new quaternion from data stored into an array
    * @param array defines the data source
    * @param offset defines the offset in the source array where the data starts
    * @returns a new quaternion
    */
  inline def FromArray(array: DeepImmutable[ArrayLike[Double]]): typings.babylonjs.BABYLON.Quaternion = ^.asInstanceOf[js.Dynamic].applyDynamic("FromArray")(array.asInstanceOf[js.Any]).asInstanceOf[typings.babylonjs.BABYLON.Quaternion]
  inline def FromArray(array: DeepImmutable[ArrayLike[Double]], offset: Double): typings.babylonjs.BABYLON.Quaternion = (^.asInstanceOf[js.Dynamic].applyDynamic("FromArray")(array.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.BABYLON.Quaternion]
  
  /**
    * Updates the given quaternion "result" from the starting index of the given array.
    * @param array the array to pull values from
    * @param offset the offset into the array to start at
    * @param result the quaternion to store the result in
    */
  inline def FromArrayToRef(
    array: DeepImmutable[ArrayLike[Double]],
    offset: Double,
    result: typings.babylonjs.BABYLON.Quaternion
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("FromArrayToRef")(array.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Create a quaternion from Euler rotation angles
    * @param x Pitch
    * @param y Yaw
    * @param z Roll
    * @returns the new Quaternion
    */
  inline def FromEulerAngles(x: Double, y: Double, z: Double): typings.babylonjs.BABYLON.Quaternion = (^.asInstanceOf[js.Dynamic].applyDynamic("FromEulerAngles")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], z.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.BABYLON.Quaternion]
  
  /**
    * Updates a quaternion from Euler rotation angles
    * @param x Pitch
    * @param y Yaw
    * @param z Roll
    * @param result the quaternion to store the result
    * @returns the updated quaternion
    */
  inline def FromEulerAnglesToRef(x: Double, y: Double, z: Double, result: typings.babylonjs.BABYLON.Quaternion): typings.babylonjs.BABYLON.Quaternion = (^.asInstanceOf[js.Dynamic].applyDynamic("FromEulerAnglesToRef")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], z.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.BABYLON.Quaternion]
  
  /**
    * Create a quaternion from Euler rotation vector
    * @param vec the Euler vector (x Pitch, y Yaw, z Roll)
    * @returns the new Quaternion
    */
  inline def FromEulerVector(vec: DeepImmutable[typings.babylonjs.BABYLON.Vector3]): typings.babylonjs.BABYLON.Quaternion = ^.asInstanceOf[js.Dynamic].applyDynamic("FromEulerVector")(vec.asInstanceOf[js.Any]).asInstanceOf[typings.babylonjs.BABYLON.Quaternion]
  
  /**
    * Updates a quaternion from Euler rotation vector
    * @param vec the Euler vector (x Pitch, y Yaw, z Roll)
    * @param result the quaternion to store the result
    * @returns the updated quaternion
    */
  inline def FromEulerVectorToRef(
    vec: DeepImmutable[typings.babylonjs.BABYLON.Vector3],
    result: typings.babylonjs.BABYLON.Quaternion
  ): typings.babylonjs.BABYLON.Quaternion = (^.asInstanceOf[js.Dynamic].applyDynamic("FromEulerVectorToRef")(vec.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.BABYLON.Quaternion]
  
  /**
    * Creates a new rotation value to orient an object to look towards the given forward direction, the up direction being oriented like "up".
    * This function works in left handed mode
    * @param forward defines the forward direction - Must be normalized and orthogonal to up.
    * @param up defines the up vector for the entity - Must be normalized and orthogonal to forward.
    * @returns A new quaternion oriented toward the specified forward and up.
    */
  inline def FromLookDirectionLH(
    forward: DeepImmutable[typings.babylonjs.BABYLON.Vector3],
    up: DeepImmutable[typings.babylonjs.BABYLON.Vector3]
  ): typings.babylonjs.BABYLON.Quaternion = (^.asInstanceOf[js.Dynamic].applyDynamic("FromLookDirectionLH")(forward.asInstanceOf[js.Any], up.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.BABYLON.Quaternion]
  
  /**
    * Creates a new rotation value to orient an object to look towards the given forward direction with the up direction being oriented like "up", and stores it in the target quaternion.
    * This function works in left handed mode
    * @param forward defines the forward direction - Must be normalized and orthogonal to up.
    * @param up defines the up vector for the entity - Must be normalized and orthogonal to forward.
    * @param ref defines the target quaternion.
    */
  inline def FromLookDirectionLHToRef(
    forward: DeepImmutable[typings.babylonjs.BABYLON.Vector3],
    up: DeepImmutable[typings.babylonjs.BABYLON.Vector3],
    ref: typings.babylonjs.BABYLON.Quaternion
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("FromLookDirectionLHToRef")(forward.asInstanceOf[js.Any], up.asInstanceOf[js.Any], ref.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Creates a new rotation value to orient an object to look towards the given forward direction, the up direction being oriented like "up".
    * This function works in right handed mode
    * @param forward defines the forward direction - Must be normalized and orthogonal to up.
    * @param up defines the up vector for the entity - Must be normalized and orthogonal to forward.
    * @returns A new quaternion oriented toward the specified forward and up.
    */
  inline def FromLookDirectionRH(
    forward: DeepImmutable[typings.babylonjs.BABYLON.Vector3],
    up: DeepImmutable[typings.babylonjs.BABYLON.Vector3]
  ): typings.babylonjs.BABYLON.Quaternion = (^.asInstanceOf[js.Dynamic].applyDynamic("FromLookDirectionRH")(forward.asInstanceOf[js.Any], up.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.BABYLON.Quaternion]
  
  /**
    * Creates a new rotation value to orient an object to look towards the given forward direction with the up direction being oriented like "up", and stores it in the target quaternion.
    * This function works in right handed mode
    * @param forward defines the forward direction - Must be normalized and orthogonal to up.
    * @param up defines the up vector for the entity - Must be normalized and orthogonal to forward.
    * @param ref defines the target quaternion.
    */
  inline def FromLookDirectionRHToRef(
    forward: DeepImmutable[typings.babylonjs.BABYLON.Vector3],
    up: DeepImmutable[typings.babylonjs.BABYLON.Vector3],
    ref: typings.babylonjs.BABYLON.Quaternion
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("FromLookDirectionRHToRef")(forward.asInstanceOf[js.Any], up.asInstanceOf[js.Any], ref.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Creates a new quaternion from a rotation matrix
    * @param matrix defines the source matrix
    * @returns a new quaternion created from the given rotation matrix values
    */
  inline def FromRotationMatrix(matrix: DeepImmutable[typings.babylonjs.BABYLON.Matrix]): typings.babylonjs.BABYLON.Quaternion = ^.asInstanceOf[js.Dynamic].applyDynamic("FromRotationMatrix")(matrix.asInstanceOf[js.Any]).asInstanceOf[typings.babylonjs.BABYLON.Quaternion]
  
  /**
    * Updates the given quaternion with the given rotation matrix values
    * @param matrix defines the source matrix
    * @param result defines the target quaternion
    */
  inline def FromRotationMatrixToRef(
    matrix: DeepImmutable[typings.babylonjs.BABYLON.Matrix],
    result: typings.babylonjs.BABYLON.Quaternion
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("FromRotationMatrixToRef")(matrix.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Updates a quaternion so that it rotates vector vecFrom to vector vecTo
    * @param vecFrom defines the direction vector from which to rotate
    * @param vecTo defines the direction vector to which to rotate
    * @param result the quaternion to store the result
    * @returns the updated quaternion
    */
  inline def FromUnitVectorsToRef(
    vecFrom: DeepImmutable[typings.babylonjs.BABYLON.Vector3],
    vecTo: DeepImmutable[typings.babylonjs.BABYLON.Vector3],
    result: typings.babylonjs.BABYLON.Quaternion
  ): typings.babylonjs.BABYLON.Quaternion = (^.asInstanceOf[js.Dynamic].applyDynamic("FromUnitVectorsToRef")(vecFrom.asInstanceOf[js.Any], vecTo.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.BABYLON.Quaternion]
  
  /**
    * Interpolate between two quaternions using Hermite interpolation
    * @param value1 defines first quaternion
    * @param tangent1 defines the incoming tangent
    * @param value2 defines second quaternion
    * @param tangent2 defines the outgoing tangent
    * @param amount defines the target quaternion
    * @returns the new interpolated quaternion
    */
  inline def Hermite(
    value1: DeepImmutable[typings.babylonjs.BABYLON.Quaternion],
    tangent1: DeepImmutable[typings.babylonjs.BABYLON.Quaternion],
    value2: DeepImmutable[typings.babylonjs.BABYLON.Quaternion],
    tangent2: DeepImmutable[typings.babylonjs.BABYLON.Quaternion],
    amount: Double
  ): typings.babylonjs.BABYLON.Quaternion = (^.asInstanceOf[js.Dynamic].applyDynamic("Hermite")(value1.asInstanceOf[js.Any], tangent1.asInstanceOf[js.Any], value2.asInstanceOf[js.Any], tangent2.asInstanceOf[js.Any], amount.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.BABYLON.Quaternion]
  
  /**
    * Returns a new Quaternion which is the 1st derivative of the Hermite spline defined by the quaternions "value1", "value2", "tangent1", "tangent2".
    * @param value1 defines the first control point
    * @param tangent1 defines the first tangent
    * @param value2 defines the second control point
    * @param tangent2 defines the second tangent
    * @param time define where the derivative must be done
    * @returns 1st derivative
    */
  inline def Hermite1stDerivative(
    value1: DeepImmutable[typings.babylonjs.BABYLON.Quaternion],
    tangent1: DeepImmutable[typings.babylonjs.BABYLON.Quaternion],
    value2: DeepImmutable[typings.babylonjs.BABYLON.Quaternion],
    tangent2: DeepImmutable[typings.babylonjs.BABYLON.Quaternion],
    time: Double
  ): typings.babylonjs.BABYLON.Quaternion = (^.asInstanceOf[js.Dynamic].applyDynamic("Hermite1stDerivative")(value1.asInstanceOf[js.Any], tangent1.asInstanceOf[js.Any], value2.asInstanceOf[js.Any], tangent2.asInstanceOf[js.Any], time.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.BABYLON.Quaternion]
  
  /**
    * Update a Quaternion with the 1st derivative of the Hermite spline defined by the quaternions "value1", "value2", "tangent1", "tangent2".
    * @param value1 defines the first control point
    * @param tangent1 defines the first tangent
    * @param value2 defines the second control point
    * @param tangent2 defines the second tangent
    * @param time define where the derivative must be done
    * @param result define where to store the derivative
    */
  inline def Hermite1stDerivativeToRef(
    value1: DeepImmutable[typings.babylonjs.BABYLON.Quaternion],
    tangent1: DeepImmutable[typings.babylonjs.BABYLON.Quaternion],
    value2: DeepImmutable[typings.babylonjs.BABYLON.Quaternion],
    tangent2: DeepImmutable[typings.babylonjs.BABYLON.Quaternion],
    time: Double,
    result: typings.babylonjs.BABYLON.Quaternion
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("Hermite1stDerivativeToRef")(value1.asInstanceOf[js.Any], tangent1.asInstanceOf[js.Any], value2.asInstanceOf[js.Any], tangent2.asInstanceOf[js.Any], time.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Creates an identity quaternion
    * @returns the identity quaternion
    */
  inline def Identity(): typings.babylonjs.BABYLON.Quaternion = ^.asInstanceOf[js.Dynamic].applyDynamic("Identity")().asInstanceOf[typings.babylonjs.BABYLON.Quaternion]
  
  /**
    * Inverse a given quaternion
    * @param q defines the source quaternion
    * @returns a new quaternion as the inverted current quaternion
    */
  inline def Inverse(q: DeepImmutable[typings.babylonjs.BABYLON.Quaternion]): typings.babylonjs.BABYLON.Quaternion = ^.asInstanceOf[js.Dynamic].applyDynamic("Inverse")(q.asInstanceOf[js.Any]).asInstanceOf[typings.babylonjs.BABYLON.Quaternion]
  
  /**
    * Inverse a given quaternion
    * @param q defines the source quaternion
    * @param result the quaternion the result will be stored in
    * @returns the result quaternion
    */
  inline def InverseToRef(q: typings.babylonjs.BABYLON.Quaternion, result: typings.babylonjs.BABYLON.Quaternion): typings.babylonjs.BABYLON.Quaternion = (^.asInstanceOf[js.Dynamic].applyDynamic("InverseToRef")(q.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.BABYLON.Quaternion]
  
  /**
    * Gets a boolean indicating if the given quaternion is identity
    * @param quaternion defines the quaternion to check
    * @returns true if the quaternion is identity
    */
  inline def IsIdentity(quaternion: DeepImmutable[typings.babylonjs.BABYLON.Quaternion]): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("IsIdentity")(quaternion.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  /**
    * Creates a new quaternion from the given Euler float angles expressed in z-x-z orientation
    * @param alpha defines the rotation around first axis
    * @param beta defines the rotation around second axis
    * @param gamma defines the rotation around third axis
    * @returns the new quaternion
    */
  inline def RotationAlphaBetaGamma(alpha: Double, beta: Double, gamma: Double): typings.babylonjs.BABYLON.Quaternion = (^.asInstanceOf[js.Dynamic].applyDynamic("RotationAlphaBetaGamma")(alpha.asInstanceOf[js.Any], beta.asInstanceOf[js.Any], gamma.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.BABYLON.Quaternion]
  
  /**
    * Creates a new quaternion from the given Euler float angles expressed in z-x-z orientation and stores it in the target quaternion
    * @param alpha defines the rotation around first axis
    * @param beta defines the rotation around second axis
    * @param gamma defines the rotation around third axis
    * @param result defines the target quaternion
    */
  inline def RotationAlphaBetaGammaToRef(alpha: Double, beta: Double, gamma: Double, result: typings.babylonjs.BABYLON.Quaternion): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("RotationAlphaBetaGammaToRef")(alpha.asInstanceOf[js.Any], beta.asInstanceOf[js.Any], gamma.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Creates a quaternion from a rotation around an axis
    * @param axis defines the axis to use
    * @param angle defines the angle to use
    * @returns a new quaternion created from the given axis (Vector3) and angle in radians (float)
    */
  inline def RotationAxis(axis: DeepImmutable[typings.babylonjs.BABYLON.Vector3], angle: Double): typings.babylonjs.BABYLON.Quaternion = (^.asInstanceOf[js.Dynamic].applyDynamic("RotationAxis")(axis.asInstanceOf[js.Any], angle.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.BABYLON.Quaternion]
  
  /**
    * Creates a rotation around an axis and stores it into the given quaternion
    * @param axis defines the axis to use
    * @param angle defines the angle to use
    * @param result defines the target quaternion
    * @returns the target quaternion
    */
  inline def RotationAxisToRef(
    axis: DeepImmutable[typings.babylonjs.BABYLON.Vector3],
    angle: Double,
    result: typings.babylonjs.BABYLON.Quaternion
  ): typings.babylonjs.BABYLON.Quaternion = (^.asInstanceOf[js.Dynamic].applyDynamic("RotationAxisToRef")(axis.asInstanceOf[js.Any], angle.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.BABYLON.Quaternion]
  
  /**
    * Creates a new quaternion containing the rotation value to reach the target (axis1, axis2, axis3) orientation as a rotated XYZ system (axis1, axis2 and axis3 are normalized during this operation)
    * @param axis1 defines the first axis
    * @param axis2 defines the second axis
    * @param axis3 defines the third axis
    * @returns the new quaternion
    */
  inline def RotationQuaternionFromAxis(
    axis1: DeepImmutable[typings.babylonjs.BABYLON.Vector3],
    axis2: DeepImmutable[typings.babylonjs.BABYLON.Vector3],
    axis3: DeepImmutable[typings.babylonjs.BABYLON.Vector3]
  ): typings.babylonjs.BABYLON.Quaternion = (^.asInstanceOf[js.Dynamic].applyDynamic("RotationQuaternionFromAxis")(axis1.asInstanceOf[js.Any], axis2.asInstanceOf[js.Any], axis3.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.BABYLON.Quaternion]
  
  /**
    * Creates a rotation value to reach the target (axis1, axis2, axis3) orientation as a rotated XYZ system (axis1, axis2 and axis3 are normalized during this operation) and stores it in the target quaternion
    * @param axis1 defines the first axis
    * @param axis2 defines the second axis
    * @param axis3 defines the third axis
    * @param ref defines the target quaternion
    */
  inline def RotationQuaternionFromAxisToRef(
    axis1: DeepImmutable[typings.babylonjs.BABYLON.Vector3],
    axis2: DeepImmutable[typings.babylonjs.BABYLON.Vector3],
    axis3: DeepImmutable[typings.babylonjs.BABYLON.Vector3],
    ref: typings.babylonjs.BABYLON.Quaternion
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("RotationQuaternionFromAxisToRef")(axis1.asInstanceOf[js.Any], axis2.asInstanceOf[js.Any], axis3.asInstanceOf[js.Any], ref.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Creates the rotation quaternion needed to rotate from one Vector3 onto another Vector3
    * Example PG https://playground.babylonjs.com/#L49EJ7#2
    * @param fromVector the starting vector
    * @param toVector the ending vector
    * @returns the rotation quaternion needed
    */
  inline def RotationQuaternionFromOnto(
    fromVector: DeepImmutable[typings.babylonjs.BABYLON.Vector3],
    toVector: DeepImmutable[typings.babylonjs.BABYLON.Vector3]
  ): typings.babylonjs.BABYLON.Quaternion = (^.asInstanceOf[js.Dynamic].applyDynamic("RotationQuaternionFromOnto")(fromVector.asInstanceOf[js.Any], toVector.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.BABYLON.Quaternion]
  
  /**
    * Creates the rotation quaternion needed to rotate from one Vector3 onto another Vector3 and stores in a result Quaternion
    * Example PG https://playground.babylonjs.com/#L49EJ7#3
    * @param fromVector the starting vector
    * @param toVector the ending vector
    * @param result the rotation quaternion needed
    * @returns the result
    */
  inline def RotationQuaternionFromOntoToRef(
    fromVector: DeepImmutable[typings.babylonjs.BABYLON.Vector3],
    toVector: DeepImmutable[typings.babylonjs.BABYLON.Vector3],
    result: DeepImmutable[typings.babylonjs.BABYLON.Quaternion]
  ): typings.babylonjs.BABYLON.Quaternion = (^.asInstanceOf[js.Dynamic].applyDynamic("RotationQuaternionFromOntoToRef")(fromVector.asInstanceOf[js.Any], toVector.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.BABYLON.Quaternion]
  
  /**
    * Creates a new quaternion from the given Euler float angles (y, x, z)
    * @param yaw defines the rotation around Y axis
    * @param pitch defines the rotation around X axis
    * @param roll defines the rotation around Z axis
    * @returns the new quaternion
    */
  inline def RotationYawPitchRoll(yaw: Double, pitch: Double, roll: Double): typings.babylonjs.BABYLON.Quaternion = (^.asInstanceOf[js.Dynamic].applyDynamic("RotationYawPitchRoll")(yaw.asInstanceOf[js.Any], pitch.asInstanceOf[js.Any], roll.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.BABYLON.Quaternion]
  
  /**
    * Creates a new rotation from the given Euler float angles (y, x, z) and stores it in the target quaternion
    * @param yaw defines the rotation around Y axis
    * @param pitch defines the rotation around X axis
    * @param roll defines the rotation around Z axis
    * @param result defines the target quaternion
    */
  inline def RotationYawPitchRollToRef(yaw: Double, pitch: Double, roll: Double, result: typings.babylonjs.BABYLON.Quaternion): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("RotationYawPitchRollToRef")(yaw.asInstanceOf[js.Any], pitch.asInstanceOf[js.Any], roll.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Interpolates between two quaternions
    * @param left defines first quaternion
    * @param right defines second quaternion
    * @param amount defines the gradient to use
    * @returns the new interpolated quaternion
    */
  inline def Slerp(
    left: DeepImmutable[typings.babylonjs.BABYLON.Quaternion],
    right: DeepImmutable[typings.babylonjs.BABYLON.Quaternion],
    amount: Double
  ): typings.babylonjs.BABYLON.Quaternion = (^.asInstanceOf[js.Dynamic].applyDynamic("Slerp")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any], amount.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.BABYLON.Quaternion]
  
  /**
    * Interpolates between two quaternions and stores it into a target quaternion
    * @param left defines first quaternion
    * @param right defines second quaternion
    * @param amount defines the gradient to use
    * @param result defines the target quaternion
    */
  inline def SlerpToRef(
    left: DeepImmutable[typings.babylonjs.BABYLON.Quaternion],
    right: DeepImmutable[typings.babylonjs.BABYLON.Quaternion],
    amount: Double,
    result: typings.babylonjs.BABYLON.Quaternion
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("SlerpToRef")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any], amount.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Smooth interpolation between two quaternions using Slerp
    *
    * @param source source quaternion
    * @param goal goal quaternion
    * @param deltaTime current interpolation frame
    * @param lerpTime total interpolation time
    * @param result the smoothed quaternion
    */
  inline def SmoothToRef(
    source: typings.babylonjs.BABYLON.Quaternion,
    goal: typings.babylonjs.BABYLON.Quaternion,
    deltaTime: Double,
    lerpTime: Double,
    result: typings.babylonjs.BABYLON.Quaternion
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("SmoothToRef")(source.asInstanceOf[js.Any], goal.asInstanceOf[js.Any], deltaTime.asInstanceOf[js.Any], lerpTime.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Creates an empty quaternion
    * @returns a new quaternion set to (0.0, 0.0, 0.0)
    */
  inline def Zero(): typings.babylonjs.BABYLON.Quaternion = ^.asInstanceOf[js.Dynamic].applyDynamic("Zero")().asInstanceOf[typings.babylonjs.BABYLON.Quaternion]
}
