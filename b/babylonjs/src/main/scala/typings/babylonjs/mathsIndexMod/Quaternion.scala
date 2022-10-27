package typings.babylonjs.mathsIndexMod

import typings.babylonjs.typesMod.DeepImmutable
import typings.std.ArrayLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Maths/index", "Quaternion")
@js.native
/**
  * Creates a new Quaternion from the given floats
  * @param x defines the first component (0 by default)
  * @param y defines the second component (0 by default)
  * @param z defines the third component (0 by default)
  * @param w defines the fourth component (1.0 by default)
  */
open class Quaternion ()
  extends typings.babylonjs.mathsMathMod.Quaternion {
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
  
  @JSImport("babylonjs/Maths/index", "Quaternion")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Checks if the orientations of two rotation quaternions are close to each other
    * Example Playground https://playground.babylonjs.com/#L49EJ7#60
    * @param quat0 defines the first quaternion to check
    * @param quat1 defines the second quaternion to check
    * @param epsilon defines closeness, 0 same orientation, 1 PI apart, default 0.1
    * @returns true if the two quaternions are close to each other within epsilon
    */
  inline def AreClose(
    quat0: DeepImmutable[typings.babylonjs.mathsMathDotvectorMod.Quaternion],
    quat1: DeepImmutable[typings.babylonjs.mathsMathDotvectorMod.Quaternion]
  ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("AreClose")(quat0.asInstanceOf[js.Any], quat1.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def AreClose(
    quat0: DeepImmutable[typings.babylonjs.mathsMathDotvectorMod.Quaternion],
    quat1: DeepImmutable[typings.babylonjs.mathsMathDotvectorMod.Quaternion],
    epsilon: Double
  ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("AreClose")(quat0.asInstanceOf[js.Any], quat1.asInstanceOf[js.Any], epsilon.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  /**
    * Returns the dot product (float) between the quaternions "left" and "right"
    * Example Playground https://playground.babylonjs.com/#L49EJ7#61
    * @param left defines the left operand
    * @param right defines the right operand
    * @returns the dot product
    */
  inline def Dot(
    left: DeepImmutable[typings.babylonjs.mathsMathDotvectorMod.Quaternion],
    right: DeepImmutable[typings.babylonjs.mathsMathDotvectorMod.Quaternion]
  ): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("Dot")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  /**
    * Creates a new quaternion from data stored into an array
    * Example Playground https://playground.babylonjs.com/#L49EJ7#63
    * @param array defines the data source
    * @param offset defines the offset in the source array where the data starts
    * @returns a new quaternion
    */
  inline def FromArray(array: DeepImmutable[ArrayLike[Double]]): typings.babylonjs.mathsMathDotvectorMod.Quaternion = ^.asInstanceOf[js.Dynamic].applyDynamic("FromArray")(array.asInstanceOf[js.Any]).asInstanceOf[typings.babylonjs.mathsMathDotvectorMod.Quaternion]
  inline def FromArray(array: DeepImmutable[ArrayLike[Double]], offset: Double): typings.babylonjs.mathsMathDotvectorMod.Quaternion = (^.asInstanceOf[js.Dynamic].applyDynamic("FromArray")(array.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.mathsMathDotvectorMod.Quaternion]
  
  /**
    * Updates the given quaternion "result" from the starting index of the given array.
    * Example Playground https://playground.babylonjs.com/#L49EJ7#64
    * @param array the array to pull values from
    * @param offset the offset into the array to start at
    * @param result the quaternion to store the result in
    * @returns result input
    */
  inline def FromArrayToRef[T /* <: typings.babylonjs.mathsMathDotvectorMod.Quaternion */](array: DeepImmutable[ArrayLike[Double]], offset: Double, result: T): T = (^.asInstanceOf[js.Dynamic].applyDynamic("FromArrayToRef")(array.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[T]
  
  /**
    * Create a quaternion from Euler rotation angles
    * Example Playground https://playground.babylonjs.com/#L49EJ7#33
    * @param x Pitch
    * @param y Yaw
    * @param z Roll
    * @returns the new Quaternion
    */
  inline def FromEulerAngles(x: Double, y: Double, z: Double): typings.babylonjs.mathsMathDotvectorMod.Quaternion = (^.asInstanceOf[js.Dynamic].applyDynamic("FromEulerAngles")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], z.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.mathsMathDotvectorMod.Quaternion]
  
  /**
    * Updates a quaternion from Euler rotation angles
    * Example Playground https://playground.babylonjs.com/#L49EJ7#34
    * @param x Pitch
    * @param y Yaw
    * @param z Roll
    * @param result the quaternion to store the result
    * @returns the updated quaternion
    */
  inline def FromEulerAnglesToRef[T /* <: typings.babylonjs.mathsMathDotvectorMod.Quaternion */](x: Double, y: Double, z: Double, result: T): T = (^.asInstanceOf[js.Dynamic].applyDynamic("FromEulerAnglesToRef")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], z.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[T]
  
  /**
    * Create a quaternion from Euler rotation vector
    * Example Playground https://playground.babylonjs.com/#L49EJ7#35
    * @param vec the Euler vector (x Pitch, y Yaw, z Roll)
    * @returns the new Quaternion
    */
  inline def FromEulerVector(vec: DeepImmutable[typings.babylonjs.mathsMathDotvectorMod.Vector3]): typings.babylonjs.mathsMathDotvectorMod.Quaternion = ^.asInstanceOf[js.Dynamic].applyDynamic("FromEulerVector")(vec.asInstanceOf[js.Any]).asInstanceOf[typings.babylonjs.mathsMathDotvectorMod.Quaternion]
  
  /**
    * Updates a quaternion from Euler rotation vector
    * Example Playground https://playground.babylonjs.com/#L49EJ7#36
    * @param vec the Euler vector (x Pitch, y Yaw, z Roll)
    * @param result the quaternion to store the result
    * @returns the updated quaternion
    */
  inline def FromEulerVectorToRef[T /* <: typings.babylonjs.mathsMathDotvectorMod.Quaternion */](vec: DeepImmutable[typings.babylonjs.mathsMathDotvectorMod.Vector3], result: T): T = (^.asInstanceOf[js.Dynamic].applyDynamic("FromEulerVectorToRef")(vec.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[T]
  
  /**
    * Creates a new rotation value to orient an object to look towards the given forward direction, the up direction being oriented like "up".
    * This function works in left handed mode
    * Example Playground https://playground.babylonjs.com/#L49EJ7#96
    * @param forward defines the forward direction - Must be normalized and orthogonal to up.
    * @param up defines the up vector for the entity - Must be normalized and orthogonal to forward.
    * @returns A new quaternion oriented toward the specified forward and up.
    */
  inline def FromLookDirectionLH(
    forward: DeepImmutable[typings.babylonjs.mathsMathDotvectorMod.Vector3],
    up: DeepImmutable[typings.babylonjs.mathsMathDotvectorMod.Vector3]
  ): typings.babylonjs.mathsMathDotvectorMod.Quaternion = (^.asInstanceOf[js.Dynamic].applyDynamic("FromLookDirectionLH")(forward.asInstanceOf[js.Any], up.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.mathsMathDotvectorMod.Quaternion]
  
  /**
    * Creates a new rotation value to orient an object to look towards the given forward direction with the up direction being oriented like "up", and stores it in the target quaternion.
    * This function works in left handed mode
    * Example Playground https://playground.babylonjs.com/#L49EJ7#97
    * @param forward defines the forward direction - Must be normalized and orthogonal to up.
    * @param up defines the up vector for the entity - Must be normalized and orthogonal to forward.
    * @param ref defines the target quaternion.
    * @returns result input
    */
  inline def FromLookDirectionLHToRef[T /* <: typings.babylonjs.mathsMathDotvectorMod.Quaternion */](
    forward: DeepImmutable[typings.babylonjs.mathsMathDotvectorMod.Vector3],
    up: DeepImmutable[typings.babylonjs.mathsMathDotvectorMod.Vector3],
    ref: T
  ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("FromLookDirectionLHToRef")(forward.asInstanceOf[js.Any], up.asInstanceOf[js.Any], ref.asInstanceOf[js.Any])).asInstanceOf[T]
  
  /**
    * Creates a new rotation value to orient an object to look towards the given forward direction, the up direction being oriented like "up".
    * This function works in right handed mode
    * Example Playground https://playground.babylonjs.com/#L49EJ7#98
    * @param forward defines the forward direction - Must be normalized and orthogonal to up.
    * @param up defines the up vector for the entity - Must be normalized and orthogonal to forward.
    * @returns A new quaternion oriented toward the specified forward and up.
    */
  inline def FromLookDirectionRH(
    forward: DeepImmutable[typings.babylonjs.mathsMathDotvectorMod.Vector3],
    up: DeepImmutable[typings.babylonjs.mathsMathDotvectorMod.Vector3]
  ): typings.babylonjs.mathsMathDotvectorMod.Quaternion = (^.asInstanceOf[js.Dynamic].applyDynamic("FromLookDirectionRH")(forward.asInstanceOf[js.Any], up.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.mathsMathDotvectorMod.Quaternion]
  
  /**
    * Creates a new rotation value to orient an object to look towards the given forward direction with the up direction being oriented like "up", and stores it in the target quaternion.
    * This function works in right handed mode
    * Example Playground https://playground.babylonjs.com/#L49EJ7#105
    * @param forward defines the forward direction - Must be normalized and orthogonal to up.
    * @param up defines the up vector for the entity - Must be normalized and orthogonal to forward.
    * @param ref defines the target quaternion.
    * @returns result input
    */
  inline def FromLookDirectionRHToRef[T /* <: typings.babylonjs.mathsMathDotvectorMod.Quaternion */](
    forward: DeepImmutable[typings.babylonjs.mathsMathDotvectorMod.Vector3],
    up: DeepImmutable[typings.babylonjs.mathsMathDotvectorMod.Vector3],
    ref: T
  ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("FromLookDirectionRHToRef")(forward.asInstanceOf[js.Any], up.asInstanceOf[js.Any], ref.asInstanceOf[js.Any])).asInstanceOf[T]
  
  /**
    * Creates a new quaternion from a rotation matrix
    * Example Playground https://playground.babylonjs.com/#L49EJ7#101
    * @param matrix defines the source matrix
    * @returns a new quaternion created from the given rotation matrix values
    */
  inline def FromRotationMatrix(matrix: DeepImmutable[typings.babylonjs.mathsMathDotvectorMod.Matrix]): typings.babylonjs.mathsMathDotvectorMod.Quaternion = ^.asInstanceOf[js.Dynamic].applyDynamic("FromRotationMatrix")(matrix.asInstanceOf[js.Any]).asInstanceOf[typings.babylonjs.mathsMathDotvectorMod.Quaternion]
  
  /**
    * Updates the given quaternion with the given rotation matrix values
    * Example Playground https://playground.babylonjs.com/#L49EJ7#102
    * @param matrix defines the source matrix
    * @param result defines the target quaternion
    * @returns result input
    */
  inline def FromRotationMatrixToRef[T /* <: typings.babylonjs.mathsMathDotvectorMod.Quaternion */](matrix: DeepImmutable[typings.babylonjs.mathsMathDotvectorMod.Matrix], result: T): T = (^.asInstanceOf[js.Dynamic].applyDynamic("FromRotationMatrixToRef")(matrix.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[T]
  
  /**
    * Updates a quaternion so that it rotates vector vecFrom to vector vecTo
    * Example Playground - https://playground.babylonjs.com/#L49EJ7#70
    * @param vecFrom defines the direction vector from which to rotate
    * @param vecTo defines the direction vector to which to rotate
    * @param result the quaternion to store the result
    * @returns the updated quaternion
    */
  inline def FromUnitVectorsToRef[T /* <: typings.babylonjs.mathsMathDotvectorMod.Quaternion */](
    vecFrom: DeepImmutable[typings.babylonjs.mathsMathDotvectorMod.Vector3],
    vecTo: DeepImmutable[typings.babylonjs.mathsMathDotvectorMod.Vector3],
    result: T
  ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("FromUnitVectorsToRef")(vecFrom.asInstanceOf[js.Any], vecTo.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[T]
  
  /**
    * Interpolate between two quaternions using Hermite interpolation
    * Example Playground https://playground.babylonjs.com/#L49EJ7#47
    * @see https://doc.babylonjs.com/features/featuresDeepDive/mesh/drawCurves#hermite-quaternion-spline
    * @param value1 defines first quaternion
    * @param tangent1 defines the incoming tangent
    * @param value2 defines second quaternion
    * @param tangent2 defines the outgoing tangent
    * @param amount defines the target quaternion
    * @returns the new interpolated quaternion
    */
  inline def Hermite[T /* <: typings.babylonjs.mathsMathDotvectorMod.Quaternion */](
    value1: DeepImmutable[T],
    tangent1: DeepImmutable[typings.babylonjs.mathsMathDotvectorMod.Quaternion],
    value2: DeepImmutable[typings.babylonjs.mathsMathDotvectorMod.Quaternion],
    tangent2: DeepImmutable[typings.babylonjs.mathsMathDotvectorMod.Quaternion],
    amount: Double
  ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("Hermite")(value1.asInstanceOf[js.Any], tangent1.asInstanceOf[js.Any], value2.asInstanceOf[js.Any], tangent2.asInstanceOf[js.Any], amount.asInstanceOf[js.Any])).asInstanceOf[T]
  
  /**
    * Returns a new Quaternion which is the 1st derivative of the Hermite spline defined by the quaternions "value1", "value2", "tangent1", "tangent2".
    * Example Playground https://playground.babylonjs.com/#L49EJ7#48
    * @param value1 defines the first control point
    * @param tangent1 defines the first tangent
    * @param value2 defines the second control point
    * @param tangent2 defines the second tangent
    * @param time define where the derivative must be done
    * @returns 1st derivative
    */
  inline def Hermite1stDerivative[T /* <: typings.babylonjs.mathsMathDotvectorMod.Quaternion */](
    value1: DeepImmutable[T],
    tangent1: DeepImmutable[typings.babylonjs.mathsMathDotvectorMod.Quaternion],
    value2: DeepImmutable[typings.babylonjs.mathsMathDotvectorMod.Quaternion],
    tangent2: DeepImmutable[typings.babylonjs.mathsMathDotvectorMod.Quaternion],
    time: Double
  ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("Hermite1stDerivative")(value1.asInstanceOf[js.Any], tangent1.asInstanceOf[js.Any], value2.asInstanceOf[js.Any], tangent2.asInstanceOf[js.Any], time.asInstanceOf[js.Any])).asInstanceOf[T]
  
  /**
    * Update a Quaternion with the 1st derivative of the Hermite spline defined by the quaternions "value1", "value2", "tangent1", "tangent2".
    * Example Playground https://playground.babylonjs.com/#L49EJ7#49
    * @param value1 defines the first control point
    * @param tangent1 defines the first tangent
    * @param value2 defines the second control point
    * @param tangent2 defines the second tangent
    * @param time define where the derivative must be done
    * @param result define where to store the derivative
    * @returns result input
    */
  inline def Hermite1stDerivativeToRef[T /* <: typings.babylonjs.mathsMathDotvectorMod.Quaternion */](
    value1: DeepImmutable[typings.babylonjs.mathsMathDotvectorMod.Quaternion],
    tangent1: DeepImmutable[typings.babylonjs.mathsMathDotvectorMod.Quaternion],
    value2: DeepImmutable[typings.babylonjs.mathsMathDotvectorMod.Quaternion],
    tangent2: DeepImmutable[typings.babylonjs.mathsMathDotvectorMod.Quaternion],
    time: Double,
    result: T
  ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("Hermite1stDerivativeToRef")(value1.asInstanceOf[js.Any], tangent1.asInstanceOf[js.Any], value2.asInstanceOf[js.Any], tangent2.asInstanceOf[js.Any], time.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[T]
  
  /**
    * Creates an identity quaternion
    * @returns the identity quaternion
    */
  inline def Identity(): typings.babylonjs.mathsMathDotvectorMod.Quaternion = ^.asInstanceOf[js.Dynamic].applyDynamic("Identity")().asInstanceOf[typings.babylonjs.mathsMathDotvectorMod.Quaternion]
  
  /**
    * Inverse a given quaternion
    * Example Playground https://playground.babylonjs.com/#L49EJ7#103
    * @param q defines the source quaternion
    * @returns a new quaternion as the inverted current quaternion
    */
  inline def Inverse[T /* <: typings.babylonjs.mathsMathDotvectorMod.Quaternion */](q: DeepImmutable[T]): T = ^.asInstanceOf[js.Dynamic].applyDynamic("Inverse")(q.asInstanceOf[js.Any]).asInstanceOf[T]
  
  /**
    * Inverse a given quaternion
    * Example Playground https://playground.babylonjs.com/#L49EJ7#104
    * @param q defines the source quaternion
    * @param result the quaternion the result will be stored in
    * @returns the result quaternion
    */
  inline def InverseToRef[T /* <: typings.babylonjs.mathsMathDotvectorMod.Quaternion */](q: typings.babylonjs.mathsMathDotvectorMod.Quaternion, result: T): T = (^.asInstanceOf[js.Dynamic].applyDynamic("InverseToRef")(q.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[T]
  
  /**
    * Gets a boolean indicating if the given quaternion is identity
    * @param quaternion defines the quaternion to check
    * @returns true if the quaternion is identity
    */
  inline def IsIdentity(quaternion: DeepImmutable[typings.babylonjs.mathsMathDotvectorMod.Quaternion]): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("IsIdentity")(quaternion.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  /**
    * Creates a new quaternion from the given Euler float angles expressed in z-x-z orientation
    * Example Playground https://playground.babylonjs.com/#L49EJ7#68
    * @param alpha defines the rotation around first axis
    * @param beta defines the rotation around second axis
    * @param gamma defines the rotation around third axis
    * @returns the new quaternion
    */
  inline def RotationAlphaBetaGamma(alpha: Double, beta: Double, gamma: Double): typings.babylonjs.mathsMathDotvectorMod.Quaternion = (^.asInstanceOf[js.Dynamic].applyDynamic("RotationAlphaBetaGamma")(alpha.asInstanceOf[js.Any], beta.asInstanceOf[js.Any], gamma.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.mathsMathDotvectorMod.Quaternion]
  
  /**
    * Creates a new quaternion from the given Euler float angles expressed in z-x-z orientation and stores it in the target quaternion
    * Example Playground https://playground.babylonjs.com/#L49EJ7#69
    * @param alpha defines the rotation around first axis
    * @param beta defines the rotation around second axis
    * @param gamma defines the rotation around third axis
    * @param result defines the target quaternion
    * @returns result input
    */
  inline def RotationAlphaBetaGammaToRef[T /* <: typings.babylonjs.mathsMathDotvectorMod.Quaternion */](alpha: Double, beta: Double, gamma: Double, result: T): T = (^.asInstanceOf[js.Dynamic].applyDynamic("RotationAlphaBetaGammaToRef")(alpha.asInstanceOf[js.Any], beta.asInstanceOf[js.Any], gamma.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[T]
  
  /**
    * Creates a quaternion from a rotation around an axis
    * Example Playground https://playground.babylonjs.com/#L49EJ7#72
    * @param axis defines the axis to use
    * @param angle defines the angle to use
    * @returns a new quaternion created from the given axis (Vector3) and angle in radians (float)
    */
  inline def RotationAxis(axis: DeepImmutable[typings.babylonjs.mathsMathDotvectorMod.Vector3], angle: Double): typings.babylonjs.mathsMathDotvectorMod.Quaternion = (^.asInstanceOf[js.Dynamic].applyDynamic("RotationAxis")(axis.asInstanceOf[js.Any], angle.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.mathsMathDotvectorMod.Quaternion]
  
  /**
    * Creates a rotation around an axis and stores it into the given quaternion
    * Example Playground https://playground.babylonjs.com/#L49EJ7#73
    * @param axis defines the axis to use
    * @param angle defines the angle to use
    * @param result defines the target quaternion
    * @returns the target quaternion
    */
  inline def RotationAxisToRef[T /* <: typings.babylonjs.mathsMathDotvectorMod.Quaternion */](axis: DeepImmutable[typings.babylonjs.mathsMathDotvectorMod.Vector3], angle: Double, result: T): T = (^.asInstanceOf[js.Dynamic].applyDynamic("RotationAxisToRef")(axis.asInstanceOf[js.Any], angle.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[T]
  
  /**
    * Creates a new quaternion containing the rotation value to reach the target (axis1, axis2, axis3) orientation as a rotated XYZ system (axis1, axis2 and axis3 are normalized during this operation)
    * Example Playground https://playground.babylonjs.com/#L49EJ7#75
    * @param axis1 defines the first axis
    * @param axis2 defines the second axis
    * @param axis3 defines the third axis
    * @returns the new quaternion
    */
  inline def RotationQuaternionFromAxis(
    axis1: DeepImmutable[typings.babylonjs.mathsMathDotvectorMod.Vector3],
    axis2: DeepImmutable[typings.babylonjs.mathsMathDotvectorMod.Vector3],
    axis3: DeepImmutable[typings.babylonjs.mathsMathDotvectorMod.Vector3]
  ): typings.babylonjs.mathsMathDotvectorMod.Quaternion = (^.asInstanceOf[js.Dynamic].applyDynamic("RotationQuaternionFromAxis")(axis1.asInstanceOf[js.Any], axis2.asInstanceOf[js.Any], axis3.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.mathsMathDotvectorMod.Quaternion]
  
  /**
    * Creates a rotation value to reach the target (axis1, axis2, axis3) orientation as a rotated XYZ system (axis1, axis2 and axis3 are normalized during this operation) and stores it in the target quaternion
    * Example Playground https://playground.babylonjs.com/#L49EJ7#76
    * @param axis1 defines the first axis
    * @param axis2 defines the second axis
    * @param axis3 defines the third axis
    * @param ref defines the target quaternion
    * @returns result input
    */
  inline def RotationQuaternionFromAxisToRef[T /* <: typings.babylonjs.mathsMathDotvectorMod.Quaternion */](
    axis1: DeepImmutable[typings.babylonjs.mathsMathDotvectorMod.Vector3],
    axis2: DeepImmutable[typings.babylonjs.mathsMathDotvectorMod.Vector3],
    axis3: DeepImmutable[typings.babylonjs.mathsMathDotvectorMod.Vector3],
    ref: T
  ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("RotationQuaternionFromAxisToRef")(axis1.asInstanceOf[js.Any], axis2.asInstanceOf[js.Any], axis3.asInstanceOf[js.Any], ref.asInstanceOf[js.Any])).asInstanceOf[T]
  
  /**
    * Creates a new quaternion from the given Euler float angles (y, x, z)
    * Example Playground https://playground.babylonjs.com/#L49EJ7#77
    * @param yaw defines the rotation around Y axis
    * @param pitch defines the rotation around X axis
    * @param roll defines the rotation around Z axis
    * @returns the new quaternion
    */
  inline def RotationYawPitchRoll(yaw: Double, pitch: Double, roll: Double): typings.babylonjs.mathsMathDotvectorMod.Quaternion = (^.asInstanceOf[js.Dynamic].applyDynamic("RotationYawPitchRoll")(yaw.asInstanceOf[js.Any], pitch.asInstanceOf[js.Any], roll.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.mathsMathDotvectorMod.Quaternion]
  
  /**
    * Creates a new rotation from the given Euler float angles (y, x, z) and stores it in the target quaternion
    * Example Playground https://playground.babylonjs.com/#L49EJ7#78
    * @param yaw defines the rotation around Y axis
    * @param pitch defines the rotation around X axis
    * @param roll defines the rotation around Z axis
    * @param result defines the target quaternion
    * @returns result input
    */
  inline def RotationYawPitchRollToRef[T /* <: typings.babylonjs.mathsMathDotvectorMod.Quaternion */](yaw: Double, pitch: Double, roll: Double, result: T): T = (^.asInstanceOf[js.Dynamic].applyDynamic("RotationYawPitchRollToRef")(yaw.asInstanceOf[js.Any], pitch.asInstanceOf[js.Any], roll.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[T]
  
  /**
    * Interpolates between two quaternions
    * Example Playground https://playground.babylonjs.com/#L49EJ7#79
    * @param left defines first quaternion
    * @param right defines second quaternion
    * @param amount defines the gradient to use
    * @returns the new interpolated quaternion
    */
  inline def Slerp(
    left: DeepImmutable[typings.babylonjs.mathsMathDotvectorMod.Quaternion],
    right: DeepImmutable[typings.babylonjs.mathsMathDotvectorMod.Quaternion],
    amount: Double
  ): typings.babylonjs.mathsMathDotvectorMod.Quaternion = (^.asInstanceOf[js.Dynamic].applyDynamic("Slerp")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any], amount.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.mathsMathDotvectorMod.Quaternion]
  
  /**
    * Interpolates between two quaternions and stores it into a target quaternion
    * Example Playground https://playground.babylonjs.com/#L49EJ7#92
    * @param left defines first quaternion
    * @param right defines second quaternion
    * @param amount defines the gradient to use
    * @param result defines the target quaternion
    * @returns result input
    */
  inline def SlerpToRef[T /* <: typings.babylonjs.mathsMathDotvectorMod.Quaternion */](
    left: DeepImmutable[typings.babylonjs.mathsMathDotvectorMod.Quaternion],
    right: DeepImmutable[typings.babylonjs.mathsMathDotvectorMod.Quaternion],
    amount: Double,
    result: T
  ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("SlerpToRef")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any], amount.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[T]
  
  /**
    * Smooth interpolation between two quaternions using Slerp
    * Example Playground https://playground.babylonjs.com/#L49EJ7#93
    * @param source source quaternion
    * @param goal goal quaternion
    * @param deltaTime current interpolation frame
    * @param lerpTime total interpolation time
    * @param result the smoothed quaternion
    */
  inline def SmoothToRef[T /* <: typings.babylonjs.mathsMathDotvectorMod.Quaternion */](
    source: typings.babylonjs.mathsMathDotvectorMod.Quaternion,
    goal: typings.babylonjs.mathsMathDotvectorMod.Quaternion,
    deltaTime: Double,
    lerpTime: Double,
    result: T
  ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("SmoothToRef")(source.asInstanceOf[js.Any], goal.asInstanceOf[js.Any], deltaTime.asInstanceOf[js.Any], lerpTime.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[T]
  
  /**
    * Creates an empty quaternion
    * @returns a new quaternion set to (0.0, 0.0, 0.0)
    */
  inline def Zero(): typings.babylonjs.mathsMathDotvectorMod.Quaternion = ^.asInstanceOf[js.Dynamic].applyDynamic("Zero")().asInstanceOf[typings.babylonjs.mathsMathDotvectorMod.Quaternion]
}
