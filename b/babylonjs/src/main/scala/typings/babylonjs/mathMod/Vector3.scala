package typings.babylonjs.mathMod

import typings.babylonjs.typesMod.DeepImmutable
import typings.babylonjs.typesMod.float
import typings.std.ArrayLike
import typings.std.Float32Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Maths/math", "Vector3")
@js.native
/**
  * Creates a new Vector3 object from the given x, y, z (floats) coordinates.
  * @param x defines the first coordinates (on X axis)
  * @param y defines the second coordinates (on Y axis)
  * @param z defines the third coordinates (on Z axis)
  */
class Vector3 ()
  extends typings.babylonjs.mathVectorMod.Vector3 {
  def this(x: Double) = this()
  def this(x: js.UndefOr[scala.Nothing], y: Double) = this()
  def this(x: Double, y: Double) = this()
  def this(x: js.UndefOr[scala.Nothing], y: js.UndefOr[scala.Nothing], z: Double) = this()
  def this(x: js.UndefOr[scala.Nothing], y: Double, z: Double) = this()
  def this(x: Double, y: js.UndefOr[scala.Nothing], z: Double) = this()
  def this(x: Double, y: Double, z: Double) = this()
}
/* static members */
object Vector3 {
  
  @JSImport("babylonjs/Maths/math", "Vector3")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Returns a new Vector3 set to (0.0, 0.0, -1.0)
    * @param rightHandedSystem is the scene right-handed (negative-z)
    * @returns a new forward Vector3
    */
  @JSImport("babylonjs/Maths/math", "Vector3.Backward")
  @js.native
  def Backward(): typings.babylonjs.mathVectorMod.Vector3 = js.native
  @JSImport("babylonjs/Maths/math", "Vector3.Backward")
  @js.native
  def Backward(rightHandedSystem: Boolean): typings.babylonjs.mathVectorMod.Vector3 = js.native
  
  /**
    * Returns a new Vector3 located for "amount" on the CatmullRom interpolation spline defined by the vectors "value1", "value2", "value3", "value4"
    * @param value1 defines the first control point
    * @param value2 defines the second control point
    * @param value3 defines the third control point
    * @param value4 defines the fourth control point
    * @param amount defines the amount on the spline to use
    * @returns the new Vector3
    */
  @JSImport("babylonjs/Maths/math", "Vector3.CatmullRom")
  @js.native
  def CatmullRom(
    value1: DeepImmutable[typings.babylonjs.mathVectorMod.Vector3],
    value2: DeepImmutable[typings.babylonjs.mathVectorMod.Vector3],
    value3: DeepImmutable[typings.babylonjs.mathVectorMod.Vector3],
    value4: DeepImmutable[typings.babylonjs.mathVectorMod.Vector3],
    amount: Double
  ): typings.babylonjs.mathVectorMod.Vector3 = js.native
  
  /**
    * Returns a new Vector3 located at the center between "value1" and "value2"
    * @param value1 defines the first operand
    * @param value2 defines the second operand
    * @returns the new Vector3
    */
  @JSImport("babylonjs/Maths/math", "Vector3.Center")
  @js.native
  def Center(
    value1: DeepImmutable[typings.babylonjs.mathVectorMod.Vector3],
    value2: DeepImmutable[typings.babylonjs.mathVectorMod.Vector3]
  ): typings.babylonjs.mathVectorMod.Vector3 = js.native
  
  /**
    * Checks if a given vector is inside a specific range
    * @param v defines the vector to test
    * @param min defines the minimum range
    * @param max defines the maximum range
    */
  @JSImport("babylonjs/Maths/math", "Vector3.CheckExtends")
  @js.native
  def CheckExtends(
    v: typings.babylonjs.mathVectorMod.Vector3,
    min: typings.babylonjs.mathVectorMod.Vector3,
    max: typings.babylonjs.mathVectorMod.Vector3
  ): Unit = js.native
  
  /**
    * Returns a new Vector3 set with the coordinates of "value", if the vector "value" is in the cube defined by the vectors "min" and "max"
    * If a coordinate value of "value" is lower than one of the "min" coordinate, then this "value" coordinate is set with the "min" one
    * If a coordinate value of "value" is greater than one of the "max" coordinate, then this "value" coordinate is set with the "max" one
    * @param value defines the current value
    * @param min defines the lower range value
    * @param max defines the upper range value
    * @returns the new Vector3
    */
  @JSImport("babylonjs/Maths/math", "Vector3.Clamp")
  @js.native
  def Clamp(
    value: DeepImmutable[typings.babylonjs.mathVectorMod.Vector3],
    min: DeepImmutable[typings.babylonjs.mathVectorMod.Vector3],
    max: DeepImmutable[typings.babylonjs.mathVectorMod.Vector3]
  ): typings.babylonjs.mathVectorMod.Vector3 = js.native
  
  /**
    * Sets the given vector "result" with the coordinates of "value", if the vector "value" is in the cube defined by the vectors "min" and "max"
    * If a coordinate value of "value" is lower than one of the "min" coordinate, then this "value" coordinate is set with the "min" one
    * If a coordinate value of "value" is greater than one of the "max" coordinate, then this "value" coordinate is set with the "max" one
    * @param value defines the current value
    * @param min defines the lower range value
    * @param max defines the upper range value
    * @param result defines the Vector3 where to store the result
    */
  @JSImport("babylonjs/Maths/math", "Vector3.ClampToRef")
  @js.native
  def ClampToRef(
    value: DeepImmutable[typings.babylonjs.mathVectorMod.Vector3],
    min: DeepImmutable[typings.babylonjs.mathVectorMod.Vector3],
    max: DeepImmutable[typings.babylonjs.mathVectorMod.Vector3],
    result: typings.babylonjs.mathVectorMod.Vector3
  ): Unit = js.native
  
  /**
    * Returns a new Vector3 as the cross product of the vectors "left" and "right"
    * The cross product is then orthogonal to both "left" and "right"
    * @param left defines the left operand
    * @param right defines the right operand
    * @returns the cross product
    */
  @JSImport("babylonjs/Maths/math", "Vector3.Cross")
  @js.native
  def Cross(
    left: DeepImmutable[typings.babylonjs.mathVectorMod.Vector3],
    right: DeepImmutable[typings.babylonjs.mathVectorMod.Vector3]
  ): typings.babylonjs.mathVectorMod.Vector3 = js.native
  
  /**
    * Sets the given vector "result" with the cross product of "left" and "right"
    * The cross product is then orthogonal to both "left" and "right"
    * @param left defines the left operand
    * @param right defines the right operand
    * @param result defines the Vector3 where to store the result
    */
  @JSImport("babylonjs/Maths/math", "Vector3.CrossToRef")
  @js.native
  def CrossToRef(
    left: DeepImmutable[typings.babylonjs.mathVectorMod.Vector3],
    right: DeepImmutable[typings.babylonjs.mathVectorMod.Vector3],
    result: typings.babylonjs.mathVectorMod.Vector3
  ): Unit = js.native
  
  /**
    * Returns the distance between the vectors "value1" and "value2"
    * @param value1 defines the first operand
    * @param value2 defines the second operand
    * @returns the distance
    */
  @JSImport("babylonjs/Maths/math", "Vector3.Distance")
  @js.native
  def Distance(
    value1: DeepImmutable[typings.babylonjs.mathVectorMod.Vector3],
    value2: DeepImmutable[typings.babylonjs.mathVectorMod.Vector3]
  ): Double = js.native
  
  /**
    * Returns the squared distance between the vectors "value1" and "value2"
    * @param value1 defines the first operand
    * @param value2 defines the second operand
    * @returns the squared distance
    */
  @JSImport("babylonjs/Maths/math", "Vector3.DistanceSquared")
  @js.native
  def DistanceSquared(
    value1: DeepImmutable[typings.babylonjs.mathVectorMod.Vector3],
    value2: DeepImmutable[typings.babylonjs.mathVectorMod.Vector3]
  ): Double = js.native
  
  /**
    * Returns the dot product (float) between the vectors "left" and "right"
    * @param left defines the left operand
    * @param right defines the right operand
    * @returns the dot product
    */
  @JSImport("babylonjs/Maths/math", "Vector3.Dot")
  @js.native
  def Dot(
    left: DeepImmutable[typings.babylonjs.mathVectorMod.Vector3],
    right: DeepImmutable[typings.babylonjs.mathVectorMod.Vector3]
  ): Double = js.native
  
  /**
    * Returns a new Vector3 set to (0.0, -1.0, 0.0)
    * @returns a new down Vector3
    */
  @JSImport("babylonjs/Maths/math", "Vector3.Down")
  @js.native
  def Down(): typings.babylonjs.mathVectorMod.Vector3 = js.native
  
  /**
    * Returns a new Vector3 set to (0.0, 0.0, 1.0)
    * @param rightHandedSystem is the scene right-handed (negative z)
    * @returns a new forward Vector3
    */
  @JSImport("babylonjs/Maths/math", "Vector3.Forward")
  @js.native
  def Forward(): typings.babylonjs.mathVectorMod.Vector3 = js.native
  @JSImport("babylonjs/Maths/math", "Vector3.Forward")
  @js.native
  def Forward(rightHandedSystem: Boolean): typings.babylonjs.mathVectorMod.Vector3 = js.native
  
  /**
    * Returns a new Vector3 set from the index "offset" of the given array
    * @param array defines the source array
    * @param offset defines the offset in the source array
    * @returns the new Vector3
    */
  @JSImport("babylonjs/Maths/math", "Vector3.FromArray")
  @js.native
  def FromArray(array: DeepImmutable[ArrayLike[Double]]): typings.babylonjs.mathVectorMod.Vector3 = js.native
  @JSImport("babylonjs/Maths/math", "Vector3.FromArray")
  @js.native
  def FromArray(array: DeepImmutable[ArrayLike[Double]], offset: Double): typings.babylonjs.mathVectorMod.Vector3 = js.native
  
  /**
    * Sets the given vector "result" with the element values from the index "offset" of the given array
    * @param array defines the source array
    * @param offset defines the offset in the source array
    * @param result defines the Vector3 where to store the result
    */
  @JSImport("babylonjs/Maths/math", "Vector3.FromArrayToRef")
  @js.native
  def FromArrayToRef(
    array: DeepImmutable[ArrayLike[Double]],
    offset: Double,
    result: typings.babylonjs.mathVectorMod.Vector3
  ): Unit = js.native
  
  /**
    * Returns a new Vector3 set from the index "offset" of the given Float32Array
    * @param array defines the source array
    * @param offset defines the offset in the source array
    * @returns the new Vector3
    * @deprecated Please use FromArray instead.
    */
  @JSImport("babylonjs/Maths/math", "Vector3.FromFloatArray")
  @js.native
  def FromFloatArray(array: DeepImmutable[Float32Array]): typings.babylonjs.mathVectorMod.Vector3 = js.native
  @JSImport("babylonjs/Maths/math", "Vector3.FromFloatArray")
  @js.native
  def FromFloatArray(array: DeepImmutable[Float32Array], offset: Double): typings.babylonjs.mathVectorMod.Vector3 = js.native
  
  /**
    * Sets the given vector "result" with the element values from the index "offset" of the given Float32Array
    * @param array defines the source array
    * @param offset defines the offset in the source array
    * @param result defines the Vector3 where to store the result
    * @deprecated Please use FromArrayToRef instead.
    */
  @JSImport("babylonjs/Maths/math", "Vector3.FromFloatArrayToRef")
  @js.native
  def FromFloatArrayToRef(
    array: DeepImmutable[Float32Array],
    offset: Double,
    result: typings.babylonjs.mathVectorMod.Vector3
  ): Unit = js.native
  
  /**
    * Sets the given vector "result" with the given floats.
    * @param x defines the x coordinate of the source
    * @param y defines the y coordinate of the source
    * @param z defines the z coordinate of the source
    * @param result defines the Vector3 where to store the result
    */
  @JSImport("babylonjs/Maths/math", "Vector3.FromFloatsToRef")
  @js.native
  def FromFloatsToRef(x: Double, y: Double, z: Double, result: typings.babylonjs.mathVectorMod.Vector3): Unit = js.native
  
  /**
    * Get angle between two vectors
    * @param vector0 angle between vector0 and vector1
    * @param vector1 angle between vector0 and vector1
    * @param normal direction of the normal
    * @return the angle between vector0 and vector1
    */
  @JSImport("babylonjs/Maths/math", "Vector3.GetAngleBetweenVectors")
  @js.native
  def GetAngleBetweenVectors(
    vector0: DeepImmutable[typings.babylonjs.mathVectorMod.Vector3],
    vector1: DeepImmutable[typings.babylonjs.mathVectorMod.Vector3],
    normal: DeepImmutable[typings.babylonjs.mathVectorMod.Vector3]
  ): Double = js.native
  
  /**
    * Get the clip factor between two vectors
    * @param vector0 defines the first operand
    * @param vector1 defines the second operand
    * @param axis defines the axis to use
    * @param size defines the size along the axis
    * @returns the clip factor
    */
  @JSImport("babylonjs/Maths/math", "Vector3.GetClipFactor")
  @js.native
  def GetClipFactor(
    vector0: DeepImmutable[typings.babylonjs.mathVectorMod.Vector3],
    vector1: DeepImmutable[typings.babylonjs.mathVectorMod.Vector3],
    axis: DeepImmutable[typings.babylonjs.mathVectorMod.Vector3],
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
  @JSImport("babylonjs/Maths/math", "Vector3.Hermite")
  @js.native
  def Hermite(
    value1: DeepImmutable[typings.babylonjs.mathVectorMod.Vector3],
    tangent1: DeepImmutable[typings.babylonjs.mathVectorMod.Vector3],
    value2: DeepImmutable[typings.babylonjs.mathVectorMod.Vector3],
    tangent2: DeepImmutable[typings.babylonjs.mathVectorMod.Vector3],
    amount: Double
  ): typings.babylonjs.mathVectorMod.Vector3 = js.native
  
  /**
    * Returns a new Vector3 set to (-1.0, 0.0, 0.0)
    * @returns a new left Vector3
    */
  @JSImport("babylonjs/Maths/math", "Vector3.Left")
  @js.native
  def Left(): typings.babylonjs.mathVectorMod.Vector3 = js.native
  
  /**
    * Returns a new Vector3 located for "amount" (float) on the linear interpolation between the vectors "start" and "end"
    * @param start defines the start value
    * @param end defines the end value
    * @param amount max defines amount between both (between 0 and 1)
    * @returns the new Vector3
    */
  @JSImport("babylonjs/Maths/math", "Vector3.Lerp")
  @js.native
  def Lerp(
    start: DeepImmutable[typings.babylonjs.mathVectorMod.Vector3],
    end: DeepImmutable[typings.babylonjs.mathVectorMod.Vector3],
    amount: Double
  ): typings.babylonjs.mathVectorMod.Vector3 = js.native
  
  /**
    * Sets the given vector "result" with the result of the linear interpolation from the vector "start" for "amount" to the vector "end"
    * @param start defines the start value
    * @param end defines the end value
    * @param amount max defines amount between both (between 0 and 1)
    * @param result defines the Vector3 where to store the result
    */
  @JSImport("babylonjs/Maths/math", "Vector3.LerpToRef")
  @js.native
  def LerpToRef(
    start: DeepImmutable[typings.babylonjs.mathVectorMod.Vector3],
    end: DeepImmutable[typings.babylonjs.mathVectorMod.Vector3],
    amount: Double,
    result: typings.babylonjs.mathVectorMod.Vector3
  ): Unit = js.native
  
  /**
    * Gets the maximal coordinate values between two Vector3
    * @param left defines the first operand
    * @param right defines the second operand
    * @returns the new Vector3
    */
  @JSImport("babylonjs/Maths/math", "Vector3.Maximize")
  @js.native
  def Maximize(
    left: DeepImmutable[typings.babylonjs.mathVectorMod.Vector3],
    right: DeepImmutable[typings.babylonjs.mathVectorMod.Vector3]
  ): typings.babylonjs.mathVectorMod.Vector3 = js.native
  
  /**
    * Gets the minimal coordinate values between two Vector3
    * @param left defines the first operand
    * @param right defines the second operand
    * @returns the new Vector3
    */
  @JSImport("babylonjs/Maths/math", "Vector3.Minimize")
  @js.native
  def Minimize(
    left: DeepImmutable[typings.babylonjs.mathVectorMod.Vector3],
    right: DeepImmutable[typings.babylonjs.mathVectorMod.Vector3]
  ): typings.babylonjs.mathVectorMod.Vector3 = js.native
  
  /**
    * Returns a new Vector3 as the normalization of the given vector
    * @param vector defines the Vector3 to normalize
    * @returns the new Vector3
    */
  @JSImport("babylonjs/Maths/math", "Vector3.Normalize")
  @js.native
  def Normalize(vector: DeepImmutable[typings.babylonjs.mathVectorMod.Vector3]): typings.babylonjs.mathVectorMod.Vector3 = js.native
  
  /**
    * Sets the given vector "result" with the normalization of the given first vector
    * @param vector defines the Vector3 to normalize
    * @param result defines the Vector3 where to store the result
    */
  @JSImport("babylonjs/Maths/math", "Vector3.NormalizeToRef")
  @js.native
  def NormalizeToRef(
    vector: DeepImmutable[typings.babylonjs.mathVectorMod.Vector3],
    result: typings.babylonjs.mathVectorMod.Vector3
  ): Unit = js.native
  
  /**
    * Returns a new Vector3 set to (1.0, 1.0, 1.0)
    * @returns a new unit Vector3
    */
  @JSImport("babylonjs/Maths/math", "Vector3.One")
  @js.native
  def One(): typings.babylonjs.mathVectorMod.Vector3 = js.native
  
  /**
    * Project a Vector3 onto screen space
    * @param vector defines the Vector3 to project
    * @param world defines the world matrix to use
    * @param transform defines the transform (view x projection) matrix to use
    * @param viewport defines the screen viewport to use
    * @returns the new Vector3
    */
  @JSImport("babylonjs/Maths/math", "Vector3.Project")
  @js.native
  def Project(
    vector: DeepImmutable[typings.babylonjs.mathVectorMod.Vector3],
    world: DeepImmutable[typings.babylonjs.mathVectorMod.Matrix],
    transform: DeepImmutable[typings.babylonjs.mathVectorMod.Matrix],
    viewport: DeepImmutable[typings.babylonjs.mathViewportMod.Viewport]
  ): typings.babylonjs.mathVectorMod.Vector3 = js.native
  
  /**
    * Project a Vector3 onto screen space to reference
    * @param vector defines the Vector3 to project
    * @param world defines the world matrix to use
    * @param transform defines the transform (view x projection) matrix to use
    * @param viewport defines the screen viewport to use
    * @param result the vector in which the screen space will be stored
    * @returns the new Vector3
    */
  @JSImport("babylonjs/Maths/math", "Vector3.ProjectToRef")
  @js.native
  def ProjectToRef(
    vector: DeepImmutable[typings.babylonjs.mathVectorMod.Vector3],
    world: DeepImmutable[typings.babylonjs.mathVectorMod.Matrix],
    transform: DeepImmutable[typings.babylonjs.mathVectorMod.Matrix],
    viewport: DeepImmutable[typings.babylonjs.mathViewportMod.Viewport],
    result: DeepImmutable[typings.babylonjs.mathVectorMod.Vector3]
  ): typings.babylonjs.mathVectorMod.Vector3 = js.native
  
  /**
    * Returns a new Vector3 set to (1.0, 0.0, 0.0)
    * @returns a new right Vector3
    */
  @JSImport("babylonjs/Maths/math", "Vector3.Right")
  @js.native
  def Right(): typings.babylonjs.mathVectorMod.Vector3 = js.native
  
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
  @JSImport("babylonjs/Maths/math", "Vector3.RotationFromAxis")
  @js.native
  def RotationFromAxis(
    axis1: DeepImmutable[typings.babylonjs.mathVectorMod.Vector3],
    axis2: DeepImmutable[typings.babylonjs.mathVectorMod.Vector3],
    axis3: DeepImmutable[typings.babylonjs.mathVectorMod.Vector3]
  ): typings.babylonjs.mathVectorMod.Vector3 = js.native
  
  /**
    * The same than RotationFromAxis but updates the given ref Vector3 parameter instead of returning a new Vector3
    * @param axis1 defines the first axis
    * @param axis2 defines the second axis
    * @param axis3 defines the third axis
    * @param ref defines the Vector3 where to store the result
    */
  @JSImport("babylonjs/Maths/math", "Vector3.RotationFromAxisToRef")
  @js.native
  def RotationFromAxisToRef(
    axis1: DeepImmutable[typings.babylonjs.mathVectorMod.Vector3],
    axis2: DeepImmutable[typings.babylonjs.mathVectorMod.Vector3],
    axis3: DeepImmutable[typings.babylonjs.mathVectorMod.Vector3],
    ref: typings.babylonjs.mathVectorMod.Vector3
  ): Unit = js.native
  
  /**
    * Returns a new Vector3 set with the result of the transformation by the given matrix of the given vector.
    * This method computes tranformed coordinates only, not transformed direction vectors (ie. it takes translation in account)
    * @param vector defines the Vector3 to transform
    * @param transformation defines the transformation matrix
    * @returns the transformed Vector3
    */
  @JSImport("babylonjs/Maths/math", "Vector3.TransformCoordinates")
  @js.native
  def TransformCoordinates(
    vector: DeepImmutable[typings.babylonjs.mathVectorMod.Vector3],
    transformation: DeepImmutable[typings.babylonjs.mathVectorMod.Matrix]
  ): typings.babylonjs.mathVectorMod.Vector3 = js.native
  
  /**
    * Sets the given vector "result" coordinates with the result of the transformation by the given matrix of the given floats (x, y, z)
    * This method computes tranformed coordinates only, not transformed direction vectors
    * @param x define the x coordinate of the source vector
    * @param y define the y coordinate of the source vector
    * @param z define the z coordinate of the source vector
    * @param transformation defines the transformation matrix
    * @param result defines the Vector3 where to store the result
    */
  @JSImport("babylonjs/Maths/math", "Vector3.TransformCoordinatesFromFloatsToRef")
  @js.native
  def TransformCoordinatesFromFloatsToRef(
    x: Double,
    y: Double,
    z: Double,
    transformation: DeepImmutable[typings.babylonjs.mathVectorMod.Matrix],
    result: typings.babylonjs.mathVectorMod.Vector3
  ): Unit = js.native
  
  /**
    * Sets the given vector "result" coordinates with the result of the transformation by the given matrix of the given vector
    * This method computes tranformed coordinates only, not transformed direction vectors (ie. it takes translation in account)
    * @param vector defines the Vector3 to transform
    * @param transformation defines the transformation matrix
    * @param result defines the Vector3 where to store the result
    */
  @JSImport("babylonjs/Maths/math", "Vector3.TransformCoordinatesToRef")
  @js.native
  def TransformCoordinatesToRef(
    vector: DeepImmutable[typings.babylonjs.mathVectorMod.Vector3],
    transformation: DeepImmutable[typings.babylonjs.mathVectorMod.Matrix],
    result: typings.babylonjs.mathVectorMod.Vector3
  ): Unit = js.native
  
  /**
    * Returns a new Vector3 set with the result of the normal transformation by the given matrix of the given vector
    * This methods computes transformed normalized direction vectors only (ie. it does not apply translation)
    * @param vector defines the Vector3 to transform
    * @param transformation defines the transformation matrix
    * @returns the new Vector3
    */
  @JSImport("babylonjs/Maths/math", "Vector3.TransformNormal")
  @js.native
  def TransformNormal(
    vector: DeepImmutable[typings.babylonjs.mathVectorMod.Vector3],
    transformation: DeepImmutable[typings.babylonjs.mathVectorMod.Matrix]
  ): typings.babylonjs.mathVectorMod.Vector3 = js.native
  
  /**
    * Sets the given vector "result" with the result of the normal transformation by the given matrix of the given floats (x, y, z)
    * This methods computes transformed normalized direction vectors only (ie. it does not apply translation)
    * @param x define the x coordinate of the source vector
    * @param y define the y coordinate of the source vector
    * @param z define the z coordinate of the source vector
    * @param transformation defines the transformation matrix
    * @param result defines the Vector3 where to store the result
    */
  @JSImport("babylonjs/Maths/math", "Vector3.TransformNormalFromFloatsToRef")
  @js.native
  def TransformNormalFromFloatsToRef(
    x: Double,
    y: Double,
    z: Double,
    transformation: DeepImmutable[typings.babylonjs.mathVectorMod.Matrix],
    result: typings.babylonjs.mathVectorMod.Vector3
  ): Unit = js.native
  
  /**
    * Sets the given vector "result" with the result of the normal transformation by the given matrix of the given vector
    * This methods computes transformed normalized direction vectors only (ie. it does not apply translation)
    * @param vector defines the Vector3 to transform
    * @param transformation defines the transformation matrix
    * @param result defines the Vector3 where to store the result
    */
  @JSImport("babylonjs/Maths/math", "Vector3.TransformNormalToRef")
  @js.native
  def TransformNormalToRef(
    vector: DeepImmutable[typings.babylonjs.mathVectorMod.Vector3],
    transformation: DeepImmutable[typings.babylonjs.mathVectorMod.Matrix],
    result: typings.babylonjs.mathVectorMod.Vector3
  ): Unit = js.native
  
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
  @JSImport("babylonjs/Maths/math", "Vector3.Unproject")
  @js.native
  def Unproject(
    source: DeepImmutable[typings.babylonjs.mathVectorMod.Vector3],
    viewportWidth: Double,
    viewportHeight: Double,
    world: DeepImmutable[typings.babylonjs.mathVectorMod.Matrix],
    view: DeepImmutable[typings.babylonjs.mathVectorMod.Matrix],
    projection: DeepImmutable[typings.babylonjs.mathVectorMod.Matrix]
  ): typings.babylonjs.mathVectorMod.Vector3 = js.native
  
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
  @JSImport("babylonjs/Maths/math", "Vector3.UnprojectFloatsToRef")
  @js.native
  def UnprojectFloatsToRef(
    sourceX: float,
    sourceY: float,
    sourceZ: float,
    viewportWidth: Double,
    viewportHeight: Double,
    world: DeepImmutable[typings.babylonjs.mathVectorMod.Matrix],
    view: DeepImmutable[typings.babylonjs.mathVectorMod.Matrix],
    projection: DeepImmutable[typings.babylonjs.mathVectorMod.Matrix],
    result: typings.babylonjs.mathVectorMod.Vector3
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
  @JSImport("babylonjs/Maths/math", "Vector3.UnprojectFromTransform")
  @js.native
  def UnprojectFromTransform(
    source: typings.babylonjs.mathVectorMod.Vector3,
    viewportWidth: Double,
    viewportHeight: Double,
    world: DeepImmutable[typings.babylonjs.mathVectorMod.Matrix],
    transform: DeepImmutable[typings.babylonjs.mathVectorMod.Matrix]
  ): typings.babylonjs.mathVectorMod.Vector3 = js.native
  
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
  @JSImport("babylonjs/Maths/math", "Vector3.UnprojectToRef")
  @js.native
  def UnprojectToRef(
    source: DeepImmutable[typings.babylonjs.mathVectorMod.Vector3],
    viewportWidth: Double,
    viewportHeight: Double,
    world: DeepImmutable[typings.babylonjs.mathVectorMod.Matrix],
    view: DeepImmutable[typings.babylonjs.mathVectorMod.Matrix],
    projection: DeepImmutable[typings.babylonjs.mathVectorMod.Matrix],
    result: typings.babylonjs.mathVectorMod.Vector3
  ): Unit = js.native
  
  /**
    * Returns a new Vector3 set to (0.0, 1.0, 0.0)
    * @returns a new up Vector3
    */
  @JSImport("babylonjs/Maths/math", "Vector3.Up")
  @js.native
  def Up(): typings.babylonjs.mathVectorMod.Vector3 = js.native
  
  /**
    * Returns a new Vector3 set to (0.0, 0.0, 0.0)
    * @returns a new empty Vector3
    */
  @JSImport("babylonjs/Maths/math", "Vector3.Zero")
  @js.native
  def Zero(): typings.babylonjs.mathVectorMod.Vector3 = js.native
  
  /** @hidden */
  @JSImport("babylonjs/Maths/math", "Vector3._UnprojectFromInvertedMatrixToRef")
  @js.native
  def _UnprojectFromInvertedMatrixToRef(
    source: DeepImmutable[typings.babylonjs.mathVectorMod.Vector3],
    matrix: DeepImmutable[typings.babylonjs.mathVectorMod.Matrix],
    result: typings.babylonjs.mathVectorMod.Vector3
  ): Unit = js.native
  
  @JSImport("babylonjs/Maths/math", "Vector3._UpReadOnly")
  @js.native
  def _UpReadOnly: js.Any = js.native
  @scala.inline
  def _UpReadOnly_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_UpReadOnly")(x.asInstanceOf[js.Any])
  
  @JSImport("babylonjs/Maths/math", "Vector3._ZeroReadOnly")
  @js.native
  def _ZeroReadOnly: js.Any = js.native
  @scala.inline
  def _ZeroReadOnly_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_ZeroReadOnly")(x.asInstanceOf[js.Any])
}
