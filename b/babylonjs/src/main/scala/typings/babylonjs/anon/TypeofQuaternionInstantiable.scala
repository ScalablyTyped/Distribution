package typings.babylonjs.anon

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable3
import org.scalablytyped.runtime.Instantiable4
import typings.babylonjs.BABYLON.DeepImmutable
import typings.babylonjs.BABYLON.Matrix
import typings.babylonjs.BABYLON.Quaternion
import typings.babylonjs.BABYLON.Vector3
import typings.std.ArrayLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofQuaternionInstantiable
  extends StObject
     with Instantiable0[Quaternion]
     with Instantiable1[/* x */ Double, Quaternion]
     with Instantiable2[(/* x */ Double) | (/* x */ Unit), /* y */ Double, Quaternion]
     with Instantiable3[
      (/* x */ Double) | (/* x */ Unit), 
      (/* y */ Double) | (/* y */ Unit), 
      /* z */ Double, 
      Quaternion
    ]
     with Instantiable4[
      (/* x */ Double) | (/* x */ Unit), 
      (/* y */ Double) | (/* y */ Unit), 
      (/* z */ Double) | (/* z */ Unit), 
      /* w */ Double, 
      Quaternion
    ] {
  
  /**
    * Checks if the orientations of two rotation quaternions are close to each other
    * @param quat0 defines the first quaternion to check
    * @param quat1 defines the second quaternion to check
    * @param epsilon defines closeness, 0 same orientation, 1 PI apart, default 0.1
    * @returns true if the two quaternions are close to each other within epsilon
    */
  def AreClose(quat0: DeepImmutable[Quaternion], quat1: DeepImmutable[Quaternion]): Boolean = js.native
  def AreClose(quat0: DeepImmutable[Quaternion], quat1: DeepImmutable[Quaternion], epsilon: Double): Boolean = js.native
  
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
    * Updates the given quaternion "result" from the starting index of the given array.
    * @param array the array to pull values from
    * @param offset the offset into the array to start at
    * @param result the quaternion to store the result in
    * @returns result input
    */
  def FromArrayToRef[T /* <: Quaternion */](array: DeepImmutable[ArrayLike[Double]], offset: Double, result: T): T = js.native
  
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
  def FromEulerAnglesToRef[T /* <: Quaternion */](x: Double, y: Double, z: Double, result: T): T = js.native
  
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
  def FromEulerVectorToRef[T /* <: Quaternion */](vec: DeepImmutable[Vector3], result: T): T = js.native
  
  /**
    * Creates a new rotation value to orient an object to look towards the given forward direction, the up direction being oriented like "up".
    * This function works in left handed mode
    * @param forward defines the forward direction - Must be normalized and orthogonal to up.
    * @param up defines the up vector for the entity - Must be normalized and orthogonal to forward.
    * @returns A new quaternion oriented toward the specified forward and up.
    */
  def FromLookDirectionLH(forward: DeepImmutable[Vector3], up: DeepImmutable[Vector3]): Quaternion = js.native
  
  /**
    * Creates a new rotation value to orient an object to look towards the given forward direction with the up direction being oriented like "up", and stores it in the target quaternion.
    * This function works in left handed mode
    * @param forward defines the forward direction - Must be normalized and orthogonal to up.
    * @param up defines the up vector for the entity - Must be normalized and orthogonal to forward.
    * @param ref defines the target quaternion.
    * @returns result input
    */
  def FromLookDirectionLHToRef[T /* <: Quaternion */](forward: DeepImmutable[Vector3], up: DeepImmutable[Vector3], ref: T): T = js.native
  
  /**
    * Creates a new rotation value to orient an object to look towards the given forward direction, the up direction being oriented like "up".
    * This function works in right handed mode
    * @param forward defines the forward direction - Must be normalized and orthogonal to up.
    * @param up defines the up vector for the entity - Must be normalized and orthogonal to forward.
    * @returns A new quaternion oriented toward the specified forward and up.
    */
  def FromLookDirectionRH(forward: DeepImmutable[Vector3], up: DeepImmutable[Vector3]): Quaternion = js.native
  
  /**
    * Creates a new rotation value to orient an object to look towards the given forward direction with the up direction being oriented like "up", and stores it in the target quaternion.
    * This function works in right handed mode
    * @param forward defines the forward direction - Must be normalized and orthogonal to up.
    * @param up defines the up vector for the entity - Must be normalized and orthogonal to forward.
    * @param ref defines the target quaternion.
    * @returns result input
    */
  def FromLookDirectionRHToRef[T /* <: Quaternion */](forward: DeepImmutable[Vector3], up: DeepImmutable[Vector3], ref: T): T = js.native
  
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
    * @returns result input
    */
  def FromRotationMatrixToRef[T /* <: Quaternion */](matrix: DeepImmutable[Matrix], result: T): T = js.native
  
  /**
    * Updates a quaternion so that it rotates vector vecFrom to vector vecTo
    * @param vecFrom defines the direction vector from which to rotate
    * @param vecTo defines the direction vector to which to rotate
    * @param result the quaternion to store the result
    * @returns the updated quaternion
    */
  def FromUnitVectorsToRef[T /* <: Quaternion */](vecFrom: DeepImmutable[Vector3], vecTo: DeepImmutable[Vector3], result: T): T = js.native
  
  /**
    * Interpolate between two quaternions using Hermite interpolation
    * @param value1 defines first quaternion
    * @param tangent1 defines the incoming tangent
    * @param value2 defines second quaternion
    * @param tangent2 defines the outgoing tangent
    * @param amount defines the target quaternion
    * @returns the new interpolated quaternion
    */
  def Hermite[T /* <: Quaternion */](
    value1: DeepImmutable[T],
    tangent1: DeepImmutable[Quaternion],
    value2: DeepImmutable[Quaternion],
    tangent2: DeepImmutable[Quaternion],
    amount: Double
  ): T = js.native
  
  /**
    * Returns a new Quaternion which is the 1st derivative of the Hermite spline defined by the quaternions "value1", "value2", "tangent1", "tangent2".
    * @param value1 defines the first control point
    * @param tangent1 defines the first tangent
    * @param value2 defines the second control point
    * @param tangent2 defines the second tangent
    * @param time define where the derivative must be done
    * @returns 1st derivative
    */
  def Hermite1stDerivative[T /* <: Quaternion */](
    value1: DeepImmutable[T],
    tangent1: DeepImmutable[Quaternion],
    value2: DeepImmutable[Quaternion],
    tangent2: DeepImmutable[Quaternion],
    time: Double
  ): T = js.native
  
  /**
    * Update a Quaternion with the 1st derivative of the Hermite spline defined by the quaternions "value1", "value2", "tangent1", "tangent2".
    * @param value1 defines the first control point
    * @param tangent1 defines the first tangent
    * @param value2 defines the second control point
    * @param tangent2 defines the second tangent
    * @param time define where the derivative must be done
    * @param result define where to store the derivative
    * @returns result input
    */
  def Hermite1stDerivativeToRef[T /* <: Quaternion */](
    value1: DeepImmutable[Quaternion],
    tangent1: DeepImmutable[Quaternion],
    value2: DeepImmutable[Quaternion],
    tangent2: DeepImmutable[Quaternion],
    time: Double,
    result: T
  ): T = js.native
  
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
  def Inverse[T /* <: Quaternion */](q: DeepImmutable[T]): T = js.native
  
  /**
    * Inverse a given quaternion
    * @param q defines the source quaternion
    * @param result the quaternion the result will be stored in
    * @returns the result quaternion
    */
  def InverseToRef[T /* <: Quaternion */](q: Quaternion, result: T): T = js.native
  
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
    * @returns result input
    */
  def RotationAlphaBetaGammaToRef[T /* <: Quaternion */](alpha: Double, beta: Double, gamma: Double, result: T): T = js.native
  
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
  def RotationAxisToRef[T /* <: Quaternion */](axis: DeepImmutable[Vector3], angle: Double, result: T): T = js.native
  
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
    * @returns result input
    */
  def RotationQuaternionFromAxisToRef[T /* <: Quaternion */](
    axis1: DeepImmutable[Vector3],
    axis2: DeepImmutable[Vector3],
    axis3: DeepImmutable[Vector3],
    ref: T
  ): T = js.native
  
  /**
    * Creates the rotation quaternion needed to rotate from one Vector3 onto another Vector3
    * Example PG https://playground.babylonjs.com/#L49EJ7#2
    * @param fromVector the starting vector
    * @param toVector the ending vector
    * @returns the rotation quaternion needed
    */
  def RotationQuaternionFromOnto(fromVector: DeepImmutable[Vector3], toVector: DeepImmutable[Vector3]): DeepImmutableObjectQuaterAddInPlace = js.native
  
  /**
    * Creates the rotation quaternion needed to rotate from one Vector3 onto another Vector3 and stores in a result Quaternion
    * Example PG https://playground.babylonjs.com/#L49EJ7#3
    * @param fromVector the starting vector
    * @param toVector the ending vector
    * @param result the rotation quaternion needed
    * @returns the result
    */
  def RotationQuaternionFromOntoToRef(
    fromVector: DeepImmutable[Vector3],
    toVector: DeepImmutable[Vector3],
    result: DeepImmutable[Quaternion]
  ): DeepImmutableObjectQuaterAddInPlace = js.native
  
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
    * @returns result input
    */
  def RotationYawPitchRollToRef[T /* <: Quaternion */](yaw: Double, pitch: Double, roll: Double, result: T): T = js.native
  
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
    * @returns result input
    */
  def SlerpToRef[T /* <: Quaternion */](left: DeepImmutable[Quaternion], right: DeepImmutable[Quaternion], amount: Double, result: T): T = js.native
  
  /**
    * Smooth interpolation between two quaternions using Slerp
    *
    * @param source source quaternion
    * @param goal goal quaternion
    * @param deltaTime current interpolation frame
    * @param lerpTime total interpolation time
    * @param result the smoothed quaternion
    */
  def SmoothToRef[T /* <: Quaternion */](source: Quaternion, goal: Quaternion, deltaTime: Double, lerpTime: Double, result: T): T = js.native
  
  /**
    * Creates an empty quaternion
    * @returns a new quaternion set to (0.0, 0.0, 0.0)
    */
  def Zero(): Quaternion = js.native
}
