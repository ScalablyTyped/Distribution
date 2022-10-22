package typings.babylonjs.anon

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable3
import typings.babylonjs.mathsMathDotvectorMod.Matrix
import typings.babylonjs.mathsMathDotvectorMod.Vector3
import typings.babylonjs.mathsMathDotviewportMod.Viewport
import typings.babylonjs.typesMod.DeepImmutable
import typings.babylonjs.typesMod.float
import typings.std.ArrayLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofVector3
  extends StObject
     with Instantiable0[Vector3]
     with Instantiable1[/* x */ Double, Vector3]
     with Instantiable2[(/* x */ Double) | (/* x */ Unit), /* y */ Double, Vector3]
     with Instantiable3[
      (/* x */ Double) | (/* x */ Unit), 
      (/* y */ Double) | (/* y */ Unit), 
      /* z */ Double, 
      Vector3
    ] {
  
  /**
    * Returns a new Vector3 set to (0.0, 0.0, -1.0)
    * Example Playground https://playground.babylonjs.com/#R1F8YU#71
    * @param rightHandedSystem is the scene right-handed (negative-z)
    * @returns a new Backward Vector3
    */
  def Backward(): Vector3 = js.native
  def Backward(rightHandedSystem: Boolean): Vector3 = js.native
  
  /**
    * Returns a new Vector3 located for "amount" on the CatmullRom interpolation spline defined by the vectors "value1", "value2", "value3", "value4"
    * Example Playground https://playground.babylonjs.com/#R1F8YU#69
    * @param value1 defines the first control point
    * @param value2 defines the second control point
    * @param value3 defines the third control point
    * @param value4 defines the fourth control point
    * @param amount defines the amount on the spline to use
    * @returns the new Vector3
    */
  def CatmullRom[T /* <: Vector3 */](
    value1: DeepImmutable[T],
    value2: DeepImmutable[Vector3],
    value3: DeepImmutable[Vector3],
    value4: DeepImmutable[Vector3],
    amount: Double
  ): T = js.native
  
  /**
    * Returns a new Vector3 located at the center between "value1" and "value2"
    * Example Playground https://playground.babylonjs.com/#R1F8YU#72
    * @param value1 defines the first operand
    * @param value2 defines the second operand
    * @returns the new Vector3
    */
  def Center(value1: DeepImmutable[Vector3], value2: DeepImmutable[Vector3]): Vector3 = js.native
  
  /**
    * Gets the center of the vectors "value1" and "value2" and stores the result in the vector "ref"
    * Example Playground https://playground.babylonjs.com/#R1F8YU#73
    * @param value1 defines first vector
    * @param value2 defines second vector
    * @param ref defines third vector
    * @returns ref
    */
  def CenterToRef[T /* <: Vector3 */](value1: DeepImmutable[Vector3], value2: DeepImmutable[Vector3], ref: T): T = js.native
  
  /**
    * Checks if a given vector is inside a specific range
    * Example Playground https://playground.babylonjs.com/#R1F8YU#75
    * @param v defines the vector to test
    * @param min defines the minimum range
    * @param max defines the maximum range
    */
  def CheckExtends(v: Vector3, min: Vector3, max: Vector3): Unit = js.native
  
  /**
    * Returns a new Vector3 set with the coordinates of "value", if the vector "value" is in the cube defined by the vectors "min" and "max"
    * If a coordinate value of "value" is lower than one of the "min" coordinate, then this "value" coordinate is set with the "min" one
    * If a coordinate value of "value" is greater than one of the "max" coordinate, then this "value" coordinate is set with the "max" one
    * Example Playground https://playground.babylonjs.com/#R1F8YU#76
    * @param value defines the current value
    * @param min defines the lower range value
    * @param max defines the upper range value
    * @returns the new Vector3
    */
  def Clamp[T /* <: Vector3 */](value: DeepImmutable[T], min: DeepImmutable[Vector3], max: DeepImmutable[Vector3]): T = js.native
  
  /**
    * Sets the given vector "result" with the coordinates of "value", if the vector "value" is in the cube defined by the vectors "min" and "max"
    * If a coordinate value of "value" is lower than one of the "min" coordinate, then this "value" coordinate is set with the "min" one
    * If a coordinate value of "value" is greater than one of the "max" coordinate, then this "value" coordinate is set with the "max" one
    * Example Playground https://playground.babylonjs.com/#R1F8YU#77
    * @param value defines the current value
    * @param min defines the lower range value
    * @param max defines the upper range value
    * @param result defines the Vector3 where to store the result
    * @returns result input
    */
  def ClampToRef[T /* <: Vector3 */](value: DeepImmutable[Vector3], min: DeepImmutable[Vector3], max: DeepImmutable[Vector3], result: T): T = js.native
  
  /**
    * Returns a new Vector3 as the cross product of the vectors "left" and "right"
    * The cross product is then orthogonal to both "left" and "right"
    * Example Playground https://playground.babylonjs.com/#R1F8YU#15
    * @param left defines the left operand
    * @param right defines the right operand
    * @returns the cross product
    */
  def Cross[T /* <: Vector3 */](left: DeepImmutable[T], right: DeepImmutable[Vector3]): T = js.native
  
  /**
    * Sets the given vector "result" with the cross product of "left" and "right"
    * The cross product is then orthogonal to both "left" and "right"
    * Example Playground https://playground.babylonjs.com/#R1F8YU#78
    * @param left defines the left operand
    * @param right defines the right operand
    * @param result defines the Vector3 where to store the result
    * @returns result input
    */
  def CrossToRef[T /* <: Vector3 */](left: DeepImmutable[Vector3], right: DeepImmutable[Vector3], result: T): T = js.native
  
  /**
    * Returns the distance between the vectors "value1" and "value2"
    * Example Playground https://playground.babylonjs.com/#R1F8YU#81
    * @param value1 defines the first operand
    * @param value2 defines the second operand
    * @returns the distance
    */
  def Distance(value1: DeepImmutable[Vector3], value2: DeepImmutable[Vector3]): Double = js.native
  
  /**
    * Returns the squared distance between the vectors "value1" and "value2"
    * Example Playground https://playground.babylonjs.com/#R1F8YU#80
    * @param value1 defines the first operand
    * @param value2 defines the second operand
    * @returns the squared distance
    */
  def DistanceSquared(value1: DeepImmutable[Vector3], value2: DeepImmutable[Vector3]): Double = js.native
  
  /**
    * Returns the dot product (float) between the vectors "left" and "right"
    * Example Playground https://playground.babylonjs.com/#R1F8YU#82
    * @param left defines the left operand
    * @param right defines the right operand
    * @returns the dot product
    */
  def Dot(left: DeepImmutable[Vector3], right: DeepImmutable[Vector3]): Double = js.native
  
  /**
    * Returns a new Vector3 set to (0.0, -1.0, 0.0)
    * Example Playground https://playground.babylonjs.com/#R1F8YU#71
    * @returns a new down Vector3
    */
  def Down(): Vector3 = js.native
  
  /**
    * Gets a down Vector3 that must not be updated
    */
  def DownReadOnly: DeepImmutable[Vector3] = js.native
  
  /**
    * Returns a new Vector3 set to (0.0, 0.0, 1.0)
    * Example Playground https://playground.babylonjs.com/#R1F8YU#71
    * @param rightHandedSystem is the scene right-handed (negative z)
    * @returns a new forward Vector3
    */
  def Forward(): Vector3 = js.native
  def Forward(rightHandedSystem: Boolean): Vector3 = js.native
  
  /**
    * Returns a new Vector3 set from the index "offset" of the given array
    * Example Playground https://playground.babylonjs.com/#R1F8YU#83
    * @param array defines the source array
    * @param offset defines the offset in the source array
    * @returns the new Vector3
    */
  def FromArray(array: DeepImmutable[ArrayLike[Double]]): Vector3 = js.native
  def FromArray(array: DeepImmutable[ArrayLike[Double]], offset: Double): Vector3 = js.native
  
  /**
    * Sets the given vector "result" with the element values from the index "offset" of the given array
    * Example Playground https://playground.babylonjs.com/#R1F8YU#84
    * @param array defines the source array
    * @param offset defines the offset in the source array
    * @param result defines the Vector3 where to store the result
    * @returns result input
    */
  def FromArrayToRef[T /* <: Vector3 */](array: DeepImmutable[ArrayLike[Double]], offset: Double, result: T): T = js.native
  
  /**
    * Returns a new Vector3 set from the index "offset" of the given Float32Array
    * @param array defines the source array
    * @param offset defines the offset in the source array
    * @returns the new Vector3
    * @deprecated Please use FromArray instead.
    */
  def FromFloatArray(array: DeepImmutable[js.typedarray.Float32Array]): Vector3 = js.native
  def FromFloatArray(array: DeepImmutable[js.typedarray.Float32Array], offset: Double): Vector3 = js.native
  
  /**
    * Sets the given vector "result" with the element values from the index "offset" of the given Float32Array
    * @param array defines the source array
    * @param offset defines the offset in the source array
    * @param result defines the Vector3 where to store the result
    * @deprecated Please use FromArrayToRef instead.
    */
  def FromFloatArrayToRef[T /* <: Vector3 */](array: DeepImmutable[js.typedarray.Float32Array], offset: Double, result: T): T = js.native
  
  /**
    * Sets the given vector "result" with the given floats.
    * Example Playground https://playground.babylonjs.com/#R1F8YU#85
    * @param x defines the x coordinate of the source
    * @param y defines the y coordinate of the source
    * @param z defines the z coordinate of the source
    * @param result defines the Vector3 where to store the result
    */
  def FromFloatsToRef[T /* <: Vector3 */](x: Double, y: Double, z: Double, result: T): T = js.native
  
  /**
    * Get angle between two vectors
    * Example Playground https://playground.babylonjs.com/#R1F8YU#86
    * @param vector0 the starting point
    * @param vector1 the ending point
    * @param normal direction of the normal
    * @returns the angle between vector0 and vector1
    */
  def GetAngleBetweenVectors(vector0: DeepImmutable[Vector3], vector1: DeepImmutable[Vector3], normal: DeepImmutable[Vector3]): Double = js.native
  
  /**
    * Get angle between two vectors projected on a plane
    * Example Playground https://playground.babylonjs.com/#R1F8YU#87
    * Expectation compute time: 0.01 ms (median) and 0.02 ms (percentile 95%)
    * @param vector0 angle between vector0 and vector1
    * @param vector1 angle between vector0 and vector1
    * @param normal Normal of the projection plane
    * @returns the angle in radians (float) between vector0 and vector1 projected on the plane with the specified normal
    */
  def GetAngleBetweenVectorsOnPlane(vector0: Vector3, vector1: Vector3, normal: Vector3): Double = js.native
  
  /**
    * Get the clip factor between two vectors
    * Example Playground https://playground.babylonjs.com/#R1F8YU#126
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
    * Example Playground https://playground.babylonjs.com/#R1F8YU#89
    * @param value1 defines the first control point
    * @param tangent1 defines the first tangent vector
    * @param value2 defines the second control point
    * @param tangent2 defines the second tangent vector
    * @param amount defines the amount on the interpolation spline (between 0 and 1)
    * @returns the new Vector3
    */
  def Hermite[T /* <: Vector3 */](
    value1: DeepImmutable[T],
    tangent1: DeepImmutable[Vector3],
    value2: DeepImmutable[Vector3],
    tangent2: DeepImmutable[Vector3],
    amount: Double
  ): T = js.native
  
  /**
    * Returns a new Vector3 which is the 1st derivative of the Hermite spline defined by the vectors "value1", "value2", "tangent1", "tangent2".
    * Example Playground https://playground.babylonjs.com/#R1F8YU#90
    * @param value1 defines the first control point
    * @param tangent1 defines the first tangent
    * @param value2 defines the second control point
    * @param tangent2 defines the second tangent
    * @param time define where the derivative must be done
    * @returns 1st derivative
    */
  def Hermite1stDerivative[T /* <: Vector3 */](
    value1: DeepImmutable[T],
    tangent1: DeepImmutable[Vector3],
    value2: DeepImmutable[Vector3],
    tangent2: DeepImmutable[Vector3],
    time: Double
  ): T = js.native
  
  /**
    * Update a Vector3 with the 1st derivative of the Hermite spline defined by the vectors "value1", "value2", "tangent1", "tangent2".
    * Example Playground https://playground.babylonjs.com/#R1F8YU#91
    * @param value1 defines the first control point
    * @param tangent1 defines the first tangent
    * @param value2 defines the second control point
    * @param tangent2 defines the second tangent
    * @param time define where the derivative must be done
    * @param result define where to store the derivative
    * @returns result input
    */
  def Hermite1stDerivativeToRef[T /* <: Vector3 */](
    value1: DeepImmutable[Vector3],
    tangent1: DeepImmutable[Vector3],
    value2: DeepImmutable[Vector3],
    tangent2: DeepImmutable[Vector3],
    time: Double,
    result: T
  ): T = js.native
  
  /**
    * Returns a new Vector3 set to (-1.0, 0.0, 0.0)
    * Example Playground https://playground.babylonjs.com/#R1F8YU#71
    * @returns a new left Vector3
    */
  def Left(): Vector3 = js.native
  
  /**
    * Gets a forward Vector3 that must not be updated
    */
  def LeftHandedForwardReadOnly: DeepImmutable[Vector3] = js.native
  
  /**
    * Gets a left Vector3 that must not be updated
    */
  def LeftReadOnly: DeepImmutable[Vector3] = js.native
  
  /**
    * Returns a new Vector3 located for "amount" (float) on the linear interpolation between the vectors "start" and "end"
    * Example Playground https://playground.babylonjs.com/#R1F8YU#95
    * @param start defines the start value
    * @param end defines the end value
    * @param amount max defines amount between both (between 0 and 1)
    * @returns the new Vector3
    */
  def Lerp[T /* <: Vector3 */](start: DeepImmutable[T], end: DeepImmutable[Vector3], amount: Double): T = js.native
  
  /**
    * Sets the given vector "result" with the result of the linear interpolation from the vector "start" for "amount" to the vector "end"
    * Example Playground https://playground.babylonjs.com/#R1F8YU#93
    * @param start defines the start value
    * @param end defines the end value
    * @param amount max defines amount between both (between 0 and 1)
    * @param result defines the Vector3 where to store the result
    * @returns result input
    */
  def LerpToRef[T /* <: Vector3 */](start: DeepImmutable[Vector3], end: DeepImmutable[Vector3], amount: Double, result: T): T = js.native
  
  /**
    * Gets the maximal coordinate values between two Vector3
    * Example Playground https://playground.babylonjs.com/#R1F8YU#96
    * @param left defines the first operand
    * @param right defines the second operand
    * @returns the new Vector3
    */
  def Maximize[T /* <: Vector3 */](left: DeepImmutable[T], right: DeepImmutable[Vector3]): T = js.native
  
  /**
    * Gets the minimal coordinate values between two Vector3
    * Example Playground https://playground.babylonjs.com/#R1F8YU#97
    * @param left defines the first operand
    * @param right defines the second operand
    * @returns the new Vector3
    */
  def Minimize[T /* <: Vector3 */](left: DeepImmutable[T], right: DeepImmutable[Vector3]): T = js.native
  
  /**
    * Returns a new Vector3 as the normalization of the given vector
    * Example Playground https://playground.babylonjs.com/#R1F8YU#98
    * @param vector defines the Vector3 to normalize
    * @returns the new Vector3
    */
  def Normalize(vector: DeepImmutable[Vector3]): Vector3 = js.native
  
  /**
    * Sets the given vector "result" with the normalization of the given first vector
    * Example Playground https://playground.babylonjs.com/#R1F8YU#98
    * @param vector defines the Vector3 to normalize
    * @param result defines the Vector3 where to store the result
    * @returns result input
    */
  def NormalizeToRef[T /* <: Vector3 */](vector: DeepImmutable[Vector3], result: T): T = js.native
  
  /**
    * Returns a new Vector3 set to (1.0, 1.0, 1.0)
    * @returns a new Vector3
    */
  def One(): Vector3 = js.native
  
  /**
    * Gets the rotation that aligns the roll axis (Y) to the line joining the start point to the target point
    * Example PG https://playground.babylonjs.com/#R1F8YU#188
    * @param start the starting point
    * @param target the target point
    * @returns the rotation in the form (pitch, yaw, 0)
    */
  def PitchYawRollToMoveBetweenPoints(start: Vector3, target: Vector3): Vector3 = js.native
  
  /**
    * Gets the rotation that aligns the roll axis (Y) to the line joining the start point to the target point and stores it in the ref Vector3
    * Example PG https://playground.babylonjs.com/#R1F8YU#189
    * @param start the starting point
    * @param target the target point
    * @param ref the vector3 to store the result
    * @returns ref in the form (pitch, yaw, 0)
    */
  def PitchYawRollToMoveBetweenPointsToRef[T /* <: Vector3 */](start: Vector3, target: Vector3, ref: T): T = js.native
  
  /**
    * Project a Vector3 onto screen space
    * Example Playground https://playground.babylonjs.com/#R1F8YU#101
    * @param vector defines the Vector3 to project
    * @param world defines the world matrix to use
    * @param transform defines the transform (view x projection) matrix to use
    * @param viewport defines the screen viewport to use
    * @returns the new Vector3
    */
  def Project[T /* <: Vector3 */](
    vector: DeepImmutable[T],
    world: DeepImmutable[Matrix],
    transform: DeepImmutable[Matrix],
    viewport: DeepImmutable[Viewport]
  ): T = js.native
  
  /**
    * Projects "vector" on the triangle determined by its extremities "p0", "p1" and "p2", stores the result in "ref"
    * and returns the distance to the projected point.
    * Example Playground https://playground.babylonjs.com/#R1F8YU#104
    * From http://citeseerx.ist.psu.edu/viewdoc/download?doi=10.1.1.104.4264&rep=rep1&type=pdf
    *
    * @param vector the vector to get distance from
    * @param p0 extremity of the triangle
    * @param p1 extremity of the triangle
    * @param p2 extremity of the triangle
    * @param ref variable to store the result to
    * @returns The distance between "ref" and "vector"
    */
  def ProjectOnTriangleToRef(
    vector: DeepImmutable[Vector3],
    p0: DeepImmutable[Vector3],
    p1: DeepImmutable[Vector3],
    p2: DeepImmutable[Vector3],
    ref: Vector3
  ): Double = js.native
  
  /**
    * Project a Vector3 onto screen space to reference
    * Example Playground https://playground.babylonjs.com/#R1F8YU#102
    * @param vector defines the Vector3 to project
    * @param world defines the world matrix to use
    * @param transform defines the transform (view x projection) matrix to use
    * @param viewport defines the screen viewport to use
    * @param result the vector in which the screen space will be stored
    * @returns result input
    */
  def ProjectToRef[T /* <: Vector3 */](
    vector: DeepImmutable[Vector3],
    world: DeepImmutable[Matrix],
    transform: DeepImmutable[Matrix],
    viewport: DeepImmutable[Viewport],
    result: T
  ): T = js.native
  
  /**
    * Returns a new Vector3 set to (1.0, 0.0, 0.0)
    * Example Playground https://playground.babylonjs.com/#R1F8YU#71
    * @returns a new right Vector3
    */
  def Right(): Vector3 = js.native
  
  /**
    * Gets a forward Vector3 that must not be updated
    */
  def RightHandedForwardReadOnly: DeepImmutable[Vector3] = js.native
  
  /**
    * Gets a right Vector3 that must not be updated
    */
  def RightReadOnly: DeepImmutable[Vector3] = js.native
  
  /**
    * Given three orthogonal normalized left-handed oriented Vector3 axis in space (target system),
    * RotationFromAxis() returns the rotation Euler angles (ex : rotation.x, rotation.y, rotation.z) to apply
    * to something in order to rotate it from its local system to the given target system
    * Note: axis1, axis2 and axis3 are normalized during this operation
    * Example Playground https://playground.babylonjs.com/#R1F8YU#106
    * @param axis1 defines the first axis
    * @param axis2 defines the second axis
    * @param axis3 defines the third axis
    * @returns a new Vector3
    * @see https://doc.babylonjs.com/divingDeeper/mesh/transforms/center_origin/target_align
    */
  def RotationFromAxis[T /* <: Vector3 */](axis1: DeepImmutable[T], axis2: DeepImmutable[Vector3], axis3: DeepImmutable[Vector3]): T = js.native
  
  /**
    * The same than RotationFromAxis but updates the given ref Vector3 parameter instead of returning a new Vector3
    * Example Playground https://playground.babylonjs.com/#R1F8YU#107
    * @param axis1 defines the first axis
    * @param axis2 defines the second axis
    * @param axis3 defines the third axis
    * @param ref defines the Vector3 where to store the result
    * @returns result input
    */
  def RotationFromAxisToRef[T /* <: Vector3 */](
    axis1: DeepImmutable[Vector3],
    axis2: DeepImmutable[Vector3],
    axis3: DeepImmutable[Vector3],
    ref: T
  ): T = js.native
  
  /**
    * Slerp between two vectors. See also `SmoothToRef`
    * Slerp is a spherical linear interpolation
    * giving a slow in and out effect
    * Example Playground 1 https://playground.babylonjs.com/#R1F8YU#108
    * Example Playground 2 https://playground.babylonjs.com/#R1F8YU#109
    * @param vector0 Start vector
    * @param vector1 End vector
    * @param slerp amount (will be clamped between 0 and 1)
    * @param result The slerped vector
    */
  def SlerpToRef[T /* <: Vector3 */](vector0: Vector3, vector1: Vector3, slerp: Double, result: T): T = js.native
  
  /**
    * Smooth interpolation between two vectors using Slerp
    * Example Playground https://playground.babylonjs.com/#R1F8YU#110
    * @param source source vector
    * @param goal goal vector
    * @param deltaTime current interpolation frame
    * @param lerpTime total interpolation time
    * @param result the smoothed vector
    */
  def SmoothToRef[T /* <: Vector3 */](source: Vector3, goal: Vector3, deltaTime: Double, lerpTime: Double, result: T): T = js.native
  
  /**
    * Returns a new Vector3 set with the result of the transformation by the given matrix of the given vector.
    * This method computes transformed coordinates only, not transformed direction vectors (ie. it takes translation in account)
    * Example Playground https://playground.babylonjs.com/#R1F8YU#111
    * @param vector defines the Vector3 to transform
    * @param transformation defines the transformation matrix
    * @returns the transformed Vector3
    */
  def TransformCoordinates[T /* <: Vector3 */](vector: DeepImmutable[Vector3], transformation: DeepImmutable[Matrix]): Vector3 = js.native
  
  /**
    * Sets the given vector "result" coordinates with the result of the transformation by the given matrix of the given floats (x, y, z)
    * This method computes transformed coordinates only, not transformed direction vectors
    * Example Playground https://playground.babylonjs.com/#R1F8YU#115
    * @param x define the x coordinate of the source vector
    * @param y define the y coordinate of the source vector
    * @param z define the z coordinate of the source vector
    * @param transformation defines the transformation matrix
    * @param result defines the Vector3 where to store the result
    * @returns result input
    */
  def TransformCoordinatesFromFloatsToRef[T /* <: Vector3 */](x: Double, y: Double, z: Double, transformation: DeepImmutable[Matrix], result: T): T = js.native
  
  /**
    * Sets the given vector "result" coordinates with the result of the transformation by the given matrix of the given vector
    * This method computes transformed coordinates only, not transformed direction vectors (ie. it takes translation in account)
    * Example Playground https://playground.babylonjs.com/#R1F8YU#113
    * @param vector defines the Vector3 to transform
    * @param transformation defines the transformation matrix
    * @param result defines the Vector3 where to store the result
    * @returns result input
    */
  def TransformCoordinatesToRef[T /* <: Vector3 */](vector: DeepImmutable[Vector3], transformation: DeepImmutable[Matrix], result: T): T = js.native
  
  /**
    * Returns a new Vector3 set with the result of the normal transformation by the given matrix of the given vector
    * This methods computes transformed normalized direction vectors only (ie. it does not apply translation)
    * Example Playground https://playground.babylonjs.com/#R1F8YU#112
    * @param vector defines the Vector3 to transform
    * @param transformation defines the transformation matrix
    * @returns the new Vector3
    */
  def TransformNormal(vector: DeepImmutable[Vector3], transformation: DeepImmutable[Matrix]): Vector3 = js.native
  
  /**
    * Sets the given vector "result" with the result of the normal transformation by the given matrix of the given floats (x, y, z)
    * This methods computes transformed normalized direction vectors only (ie. it does not apply translation)
    * Example Playground https://playground.babylonjs.com/#R1F8YU#116
    * @param x define the x coordinate of the source vector
    * @param y define the y coordinate of the source vector
    * @param z define the z coordinate of the source vector
    * @param transformation defines the transformation matrix
    * @param result defines the Vector3 where to store the result
    * @returns result input
    */
  def TransformNormalFromFloatsToRef[T /* <: Vector3 */](x: Double, y: Double, z: Double, transformation: DeepImmutable[Matrix], result: T): T = js.native
  
  /**
    * Sets the given vector "result" with the result of the normal transformation by the given matrix of the given vector
    * This methods computes transformed normalized direction vectors only (ie. it does not apply translation)
    * Example Playground https://playground.babylonjs.com/#R1F8YU#114
    * @param vector defines the Vector3 to transform
    * @param transformation defines the transformation matrix
    * @param result defines the Vector3 where to store the result
    * @returns result input
    */
  def TransformNormalToRef[T /* <: Vector3 */](vector: DeepImmutable[Vector3], transformation: DeepImmutable[Matrix], result: T): T = js.native
  
  /**
    * Unproject from screen space to object space
    * Example Playground https://playground.babylonjs.com/#R1F8YU#117
    * @param source defines the screen space Vector3 to use
    * @param viewportWidth defines the current width of the viewport
    * @param viewportHeight defines the current height of the viewport
    * @param world defines the world matrix to use (can be set to Identity to go to world space)
    * @param view defines the view matrix to use
    * @param projection defines the projection matrix to use
    * @returns the new Vector3
    */
  def Unproject[T /* <: Vector3 */](
    source: DeepImmutable[T],
    viewportWidth: Double,
    viewportHeight: Double,
    world: DeepImmutable[Matrix],
    view: DeepImmutable[Matrix],
    projection: DeepImmutable[Matrix]
  ): T = js.native
  
  /**
    * Unproject from screen space to object space
    * Example Playground https://playground.babylonjs.com/#R1F8YU#120
    * @param sourceX defines the screen space x coordinate to use
    * @param sourceY defines the screen space y coordinate to use
    * @param sourceZ defines the screen space z coordinate to use
    * @param viewportWidth defines the current width of the viewport
    * @param viewportHeight defines the current height of the viewport
    * @param world defines the world matrix to use (can be set to Identity to go to world space)
    * @param view defines the view matrix to use
    * @param projection defines the projection matrix to use
    * @param result defines the Vector3 where to store the result
    * @returns result input
    */
  def UnprojectFloatsToRef[T /* <: Vector3 */](
    sourceX: float,
    sourceY: float,
    sourceZ: float,
    viewportWidth: Double,
    viewportHeight: Double,
    world: DeepImmutable[Matrix],
    view: DeepImmutable[Matrix],
    projection: DeepImmutable[Matrix],
    result: T
  ): T = js.native
  
  /**
    * Unproject from screen space to object space
    * Example Playground https://playground.babylonjs.com/#R1F8YU#121
    * @param source defines the screen space Vector3 to use
    * @param viewportWidth defines the current width of the viewport
    * @param viewportHeight defines the current height of the viewport
    * @param world defines the world matrix to use (can be set to Identity to go to world space)
    * @param transform defines the transform (view x projection) matrix to use
    * @returns the new Vector3
    */
  def UnprojectFromTransform[T /* <: Vector3 */](
    source: DeepImmutable[T],
    viewportWidth: Double,
    viewportHeight: Double,
    world: DeepImmutable[Matrix],
    transform: DeepImmutable[Matrix]
  ): T = js.native
  
  /**
    * Unproject from screen space to object space
    * Example Playground https://playground.babylonjs.com/#R1F8YU#119
    * @param source defines the screen space Vector3 to use
    * @param viewportWidth defines the current width of the viewport
    * @param viewportHeight defines the current height of the viewport
    * @param world defines the world matrix to use (can be set to Identity to go to world space)
    * @param view defines the view matrix to use
    * @param projection defines the projection matrix to use
    * @param result defines the Vector3 where to store the result
    * @returns result input
    */
  def UnprojectToRef[T /* <: Vector3 */](
    source: DeepImmutable[Vector3],
    viewportWidth: Double,
    viewportHeight: Double,
    world: DeepImmutable[Matrix],
    view: DeepImmutable[Matrix],
    projection: DeepImmutable[Matrix],
    result: T
  ): T = js.native
  
  /**
    * Returns a new Vector3 set to (0.0, 1.0, 0.0)
    * Example Playground https://playground.babylonjs.com/#R1F8YU#71
    * @returns a new up Vector3
    */
  def Up(): Vector3 = js.native
  
  /**
    * Gets an up Vector3 that must not be updated
    */
  def UpReadOnly: DeepImmutable[Vector3] = js.native
  
  /**
    * Returns a new Vector3 set to (0.0, 0.0, 0.0)
    * @returns a new empty Vector3
    */
  def Zero(): Vector3 = js.native
  
  /**
    * Gets a zero Vector3 that must not be updated
    */
  def ZeroReadOnly: DeepImmutable[Vector3] = js.native
  
  /* private */ var _DownReadOnly: Any = js.native
  
  /* private */ var _LeftHandedForwardReadOnly: Any = js.native
  
  /* private */ var _LeftReadOnly: Any = js.native
  
  /* private */ var _RightHandedForwardReadOnly: Any = js.native
  
  /* private */ var _RightReadOnly: Any = js.native
  
  /**
    * @internal
    */
  def _UnprojectFromInvertedMatrixToRef[T /* <: Vector3 */](source: DeepImmutable[Vector3], matrix: DeepImmutable[Matrix], result: T): T = js.native
  
  /* private */ var _UpReadOnly: Any = js.native
  
  /* private */ var _ZeroReadOnly: Any = js.native
}
