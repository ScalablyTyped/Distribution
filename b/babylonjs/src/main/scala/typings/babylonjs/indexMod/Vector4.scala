package typings.babylonjs.indexMod

import typings.babylonjs.typesMod.DeepImmutable
import typings.std.ArrayLike
import typings.std.Float32Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("babylonjs/index", "Vector4")
@js.native
class Vector4 protected ()
  extends typings.babylonjs.mathsIndexMod.Vector4 {
  /**
    * Creates a Vector4 object from the given floats.
    * @param x x value of the vector
    * @param y y value of the vector
    * @param z z value of the vector
    * @param w w value of the vector
    */
  def this(
    /** x value of the vector */
  x: Double,
    /** y value of the vector */
  y: Double,
    /** z value of the vector */
  z: Double,
    /** w value of the vector */
  w: Double
  ) = this()
}

/* static members */
@JSImport("babylonjs/index", "Vector4")
@js.native
object Vector4 extends js.Object {
  /**
    * Returns a new Vector4 located at the center between the vectors "value1" and "value2".
    * @param value1 value to calulate the center between
    * @param value2 value to calulate the center between
    * @return the center between the two vectors
    */
  def Center(
    value1: DeepImmutable[typings.babylonjs.mathVectorMod.Vector4],
    value2: DeepImmutable[typings.babylonjs.mathVectorMod.Vector4]
  ): typings.babylonjs.mathVectorMod.Vector4 = js.native
  /**
    * Returns the distance (float) between the vectors "value1" and "value2".
    * @param value1 value to calulate the distance between
    * @param value2 value to calulate the distance between
    * @return the distance between the two vectors
    */
  def Distance(
    value1: DeepImmutable[typings.babylonjs.mathVectorMod.Vector4],
    value2: DeepImmutable[typings.babylonjs.mathVectorMod.Vector4]
  ): Double = js.native
  /**
    * Returns the squared distance (float) between the vectors "value1" and "value2".
    * @param value1 value to calulate the distance between
    * @param value2 value to calulate the distance between
    * @return the distance between the two vectors squared
    */
  def DistanceSquared(
    value1: DeepImmutable[typings.babylonjs.mathVectorMod.Vector4],
    value2: DeepImmutable[typings.babylonjs.mathVectorMod.Vector4]
  ): Double = js.native
  /**
    * Returns a new Vector4 set from the starting index of the given array.
    * @param array the array to pull values from
    * @param offset the offset into the array to start at
    * @returns the new vector
    */
  def FromArray(array: DeepImmutable[ArrayLike[Double]]): typings.babylonjs.mathVectorMod.Vector4 = js.native
  def FromArray(array: DeepImmutable[ArrayLike[Double]], offset: Double): typings.babylonjs.mathVectorMod.Vector4 = js.native
  /**
    * Updates the given vector "result" from the starting index of the given array.
    * @param array the array to pull values from
    * @param offset the offset into the array to start at
    * @param result the vector to store the result in
    */
  def FromArrayToRef(
    array: DeepImmutable[ArrayLike[Double]],
    offset: Double,
    result: typings.babylonjs.mathVectorMod.Vector4
  ): Unit = js.native
  /**
    * Updates the given vector "result" from the starting index of the given Float32Array.
    * @param array the array to pull values from
    * @param offset the offset into the array to start at
    * @param result the vector to store the result in
    */
  def FromFloatArrayToRef(
    array: DeepImmutable[Float32Array],
    offset: Double,
    result: typings.babylonjs.mathVectorMod.Vector4
  ): Unit = js.native
  /**
    * Updates the given vector "result" coordinates from the given floats.
    * @param x float to set from
    * @param y float to set from
    * @param z float to set from
    * @param w float to set from
    * @param result the vector to the floats in
    */
  def FromFloatsToRef(x: Double, y: Double, z: Double, w: Double, result: typings.babylonjs.mathVectorMod.Vector4): Unit = js.native
  /**
    * Creates a new Vector4 from a Vector3
    * @param source defines the source data
    * @param w defines the 4th component (default is 0)
    * @returns a new Vector4
    */
  def FromVector3(source: typings.babylonjs.mathVectorMod.Vector3): typings.babylonjs.mathVectorMod.Vector4 = js.native
  def FromVector3(source: typings.babylonjs.mathVectorMod.Vector3, w: Double): typings.babylonjs.mathVectorMod.Vector4 = js.native
  /**
    * Returns a vector with the maximum values from the left and right vectors
    * @param left left vector to maximize
    * @param right right vector to maximize
    * @returns a new vector with the maximum of the left and right vector values
    */
  def Maximize(
    left: DeepImmutable[typings.babylonjs.mathVectorMod.Vector4],
    right: DeepImmutable[typings.babylonjs.mathVectorMod.Vector4]
  ): typings.babylonjs.mathVectorMod.Vector4 = js.native
  /**
    * Returns a vector with the minimum values from the left and right vectors
    * @param left left vector to minimize
    * @param right right vector to minimize
    * @returns a new vector with the minimum of the left and right vector values
    */
  def Minimize(
    left: DeepImmutable[typings.babylonjs.mathVectorMod.Vector4],
    right: DeepImmutable[typings.babylonjs.mathVectorMod.Vector4]
  ): typings.babylonjs.mathVectorMod.Vector4 = js.native
  /**
    * Returns a new normalized Vector4 from the given one.
    * @param vector the vector to normalize
    * @returns the vector
    */
  def Normalize(vector: DeepImmutable[typings.babylonjs.mathVectorMod.Vector4]): typings.babylonjs.mathVectorMod.Vector4 = js.native
  /**
    * Updates the given vector "result" from the normalization of the given one.
    * @param vector the vector to normalize
    * @param result the vector to store the result in
    */
  def NormalizeToRef(
    vector: DeepImmutable[typings.babylonjs.mathVectorMod.Vector4],
    result: typings.babylonjs.mathVectorMod.Vector4
  ): Unit = js.native
  /**
    * Returns a new Vector4 set to (1.0, 1.0, 1.0, 1.0)
    * @returns the new vector
    */
  def One(): typings.babylonjs.mathVectorMod.Vector4 = js.native
  /**
    * Returns a new Vector4 set with the result of the normal transformation by the given matrix of the given vector.
    * This methods computes transformed normalized direction vectors only.
    * @param vector the vector to transform
    * @param transformation the transformation matrix to apply
    * @returns the new vector
    */
  def TransformNormal(
    vector: DeepImmutable[typings.babylonjs.mathVectorMod.Vector4],
    transformation: DeepImmutable[typings.babylonjs.mathVectorMod.Matrix]
  ): typings.babylonjs.mathVectorMod.Vector4 = js.native
  /**
    * Sets the given vector "result" with the result of the normal transformation by the given matrix of the given floats (x, y, z, w).
    * This methods computes transformed normalized direction vectors only.
    * @param x value to transform
    * @param y value to transform
    * @param z value to transform
    * @param w value to transform
    * @param transformation the transformation matrix to apply
    * @param result the vector to store the results in
    */
  def TransformNormalFromFloatsToRef(
    x: Double,
    y: Double,
    z: Double,
    w: Double,
    transformation: DeepImmutable[typings.babylonjs.mathVectorMod.Matrix],
    result: typings.babylonjs.mathVectorMod.Vector4
  ): Unit = js.native
  /**
    * Sets the given vector "result" with the result of the normal transformation by the given matrix of the given vector.
    * This methods computes transformed normalized direction vectors only.
    * @param vector the vector to transform
    * @param transformation the transformation matrix to apply
    * @param result the vector to store the result in
    */
  def TransformNormalToRef(
    vector: DeepImmutable[typings.babylonjs.mathVectorMod.Vector4],
    transformation: DeepImmutable[typings.babylonjs.mathVectorMod.Matrix],
    result: typings.babylonjs.mathVectorMod.Vector4
  ): Unit = js.native
  /**
    * Returns a new Vector4 set to (0.0, 0.0, 0.0, 0.0)
    * @returns the new vector
    */
  def Zero(): typings.babylonjs.mathVectorMod.Vector4 = js.native
}

