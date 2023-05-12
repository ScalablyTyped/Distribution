package typings.babylonjs.anon

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable3
import org.scalablytyped.runtime.Instantiable4
import typings.babylonjs.mathsMathDotvectorMod.Matrix
import typings.babylonjs.mathsMathDotvectorMod.Vector3
import typings.babylonjs.mathsMathDotvectorMod.Vector4
import typings.babylonjs.typesMod.DeepImmutable
import typings.std.ArrayLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofVector4
  extends StObject
     with Instantiable0[Vector4]
     with Instantiable1[/* x */ Double, Vector4]
     with Instantiable2[(/* x */ Double) | (/* x */ Unit), /* y */ Double, Vector4]
     with Instantiable3[
      (/* x */ Double) | (/* x */ Unit), 
      (/* y */ Double) | (/* y */ Unit), 
      /* z */ Double, 
      Vector4
    ]
     with Instantiable4[
      (/* x */ Double) | (/* x */ Unit), 
      (/* y */ Double) | (/* y */ Unit), 
      (/* z */ Double) | (/* z */ Unit), 
      /* w */ Double, 
      Vector4
    ] {
  
  /**
    * Returns a new Vector4 located at the center between the vectors "value1" and "value2".
    * @param value1 value to calulate the center between
    * @param value2 value to calulate the center between
    * @returns the center between the two vectors
    */
  def Center(value1: DeepImmutable[Vector4], value2: DeepImmutable[Vector4]): Vector4 = js.native
  
  /**
    * Gets the center of the vectors "value1" and "value2" and stores the result in the vector "ref"
    * @param value1 defines first vector
    * @param value2 defines second vector
    * @param ref defines third vector
    * @returns ref
    */
  def CenterToRef[T /* <: Vector4 */](value1: DeepImmutable[Vector4], value2: DeepImmutable[Vector4], ref: T): T = js.native
  
  /**
    * Returns the distance (float) between the vectors "value1" and "value2".
    * @param value1 value to calulate the distance between
    * @param value2 value to calulate the distance between
    * @returns the distance between the two vectors
    */
  def Distance(value1: DeepImmutable[Vector4], value2: DeepImmutable[Vector4]): Double = js.native
  
  /**
    * Returns the squared distance (float) between the vectors "value1" and "value2".
    * @param value1 value to calulate the distance between
    * @param value2 value to calulate the distance between
    * @returns the distance between the two vectors squared
    */
  def DistanceSquared(value1: DeepImmutable[Vector4], value2: DeepImmutable[Vector4]): Double = js.native
  
  /**
    * Returns a new Vector4 set from the starting index of the given array.
    * @param array the array to pull values from
    * @param offset the offset into the array to start at
    * @returns the new vector
    */
  def FromArray(array: DeepImmutable[ArrayLike[Double]]): Vector4 = js.native
  def FromArray(array: DeepImmutable[ArrayLike[Double]], offset: Double): Vector4 = js.native
  
  /**
    * Updates the given vector "result" from the starting index of the given array.
    * @param array the array to pull values from
    * @param offset the offset into the array to start at
    * @param result the vector to store the result in
    * @returns result input
    */
  def FromArrayToRef[T /* <: Vector4 */](array: DeepImmutable[ArrayLike[Double]], offset: Double, result: T): T = js.native
  
  /**
    * Updates the given vector "result" from the starting index of the given Float32Array.
    * @param array the array to pull values from
    * @param offset the offset into the array to start at
    * @param result the vector to store the result in
    * @returns result input
    */
  def FromFloatArrayToRef[T /* <: Vector4 */](array: DeepImmutable[js.typedarray.Float32Array], offset: Double, result: T): T = js.native
  
  /**
    * Updates the given vector "result" coordinates from the given floats.
    * @param x float to set from
    * @param y float to set from
    * @param z float to set from
    * @param w float to set from
    * @param result the vector to the floats in
    * @returns result input
    */
  def FromFloatsToRef[T /* <: Vector4 */](x: Double, y: Double, z: Double, w: Double, result: T): T = js.native
  
  /**
    * Creates a new Vector4 from a Vector3
    * @param source defines the source data
    * @param w defines the 4th component (default is 0)
    * @returns a new Vector4
    */
  def FromVector3(source: Vector3): Vector4 = js.native
  def FromVector3(source: Vector3, w: Double): Vector4 = js.native
  
  /**
    * Returns a vector with the maximum values from the left and right vectors
    * @param left left vector to maximize
    * @param right right vector to maximize
    * @returns a new vector with the maximum of the left and right vector values
    */
  def Maximize[T /* <: Vector4 */](left: DeepImmutable[T], right: DeepImmutable[Vector4]): T = js.native
  
  /**
    * Returns a vector with the minimum values from the left and right vectors
    * @param left left vector to minimize
    * @param right right vector to minimize
    * @returns a new vector with the minimum of the left and right vector values
    */
  def Minimize[T /* <: Vector4 */](left: DeepImmutable[T], right: DeepImmutable[Vector4]): T = js.native
  
  /**
    * Returns a new normalized Vector4 from the given one.
    * @param vector the vector to normalize
    * @returns the vector
    */
  def Normalize(vector: DeepImmutable[Vector4]): Vector4 = js.native
  
  /**
    * Updates the given vector "result" from the normalization of the given one.
    * @param vector the vector to normalize
    * @param result the vector to store the result in
    * @returns result input
    */
  def NormalizeToRef[T /* <: Vector4 */](vector: DeepImmutable[Vector4], result: T): T = js.native
  
  /**
    * Returns a new Vector4 set to (1.0, 1.0, 1.0, 1.0)
    * @returns the new vector
    */
  def One(): Vector4 = js.native
  
  /**
    * Returns a new Vector4 with random values between min and max
    * @param min the minimum random value
    * @param max the maximum random value
    * @returns a Vector4 with random values between min and max
    */
  def Random(): Vector4 = js.native
  def Random(min: Double): Vector4 = js.native
  def Random(min: Double, max: Double): Vector4 = js.native
  def Random(min: Unit, max: Double): Vector4 = js.native
  
  /**
    * Returns a new Vector4 set with the result of the transformation by the given matrix of the given vector.
    * This method computes tranformed coordinates only, not transformed direction vectors (ie. it takes translation in account)
    * The difference with Vector3.TransformCoordinates is that the w component is not used to divide the other coordinates but is returned in the w coordinate instead
    * @param vector defines the Vector3 to transform
    * @param transformation defines the transformation matrix
    * @returns the transformed Vector4
    */
  def TransformCoordinates(vector: DeepImmutable[Vector3], transformation: DeepImmutable[Matrix]): Vector4 = js.native
  
  /**
    * Sets the given vector "result" coordinates with the result of the transformation by the given matrix of the given floats (x, y, z)
    * This method computes tranformed coordinates only, not transformed direction vectors
    * The difference with Vector3.TransformCoordinatesFromFloatsToRef is that the w component is not used to divide the other coordinates but is returned in the w coordinate instead
    * @param x define the x coordinate of the source vector
    * @param y define the y coordinate of the source vector
    * @param z define the z coordinate of the source vector
    * @param transformation defines the transformation matrix
    * @param result defines the Vector4 where to store the result
    * @returns result input
    */
  def TransformCoordinatesFromFloatsToRef[T /* <: Vector4 */](x: Double, y: Double, z: Double, transformation: DeepImmutable[Matrix], result: T): T = js.native
  
  /**
    * Sets the given vector "result" coordinates with the result of the transformation by the given matrix of the given vector
    * This method computes tranformed coordinates only, not transformed direction vectors (ie. it takes translation in account)
    * The difference with Vector3.TransformCoordinatesToRef is that the w component is not used to divide the other coordinates but is returned in the w coordinate instead
    * @param vector defines the Vector3 to transform
    * @param transformation defines the transformation matrix
    * @param result defines the Vector4 where to store the result
    * @returns result input
    */
  def TransformCoordinatesToRef[T /* <: Vector4 */](vector: DeepImmutable[Vector3], transformation: DeepImmutable[Matrix], result: T): T = js.native
  
  /**
    * Returns a new Vector4 set with the result of the normal transformation by the given matrix of the given vector.
    * This methods computes transformed normalized direction vectors only.
    * @param vector the vector to transform
    * @param transformation the transformation matrix to apply
    * @returns the new vector
    */
  def TransformNormal[T /* <: Vector4 */](vector: DeepImmutable[T], transformation: DeepImmutable[Matrix]): T = js.native
  
  /**
    * Sets the given vector "result" with the result of the normal transformation by the given matrix of the given floats (x, y, z, w).
    * This methods computes transformed normalized direction vectors only.
    * @param x value to transform
    * @param y value to transform
    * @param z value to transform
    * @param w value to transform
    * @param transformation the transformation matrix to apply
    * @param result the vector to store the results in
    * @returns result input
    */
  def TransformNormalFromFloatsToRef[T /* <: Vector4 */](x: Double, y: Double, z: Double, w: Double, transformation: DeepImmutable[Matrix], result: T): T = js.native
  
  /**
    * Sets the given vector "result" with the result of the normal transformation by the given matrix of the given vector.
    * This methods computes transformed normalized direction vectors only.
    * @param vector the vector to transform
    * @param transformation the transformation matrix to apply
    * @param result the vector to store the result in
    * @returns result input
    */
  def TransformNormalToRef[T /* <: Vector4 */](vector: DeepImmutable[Vector4], transformation: DeepImmutable[Matrix], result: T): T = js.native
  
  /**
    * Returns a new Vector4 set to (0.0, 0.0, 0.0, 0.0)
    * @returns the new vector
    */
  def Zero(): Vector4 = js.native
  
  /**
    * Gets a zero Vector4 that must not be updated
    */
  def ZeroReadOnly: DeepImmutable[Vector4] = js.native
  
  /* private */ var _ZeroReadOnly: Any = js.native
}
