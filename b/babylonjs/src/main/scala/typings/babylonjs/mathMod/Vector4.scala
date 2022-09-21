package typings.babylonjs.mathMod

import typings.babylonjs.typesMod.DeepImmutable
import typings.std.ArrayLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Maths/math", "Vector4")
@js.native
open class Vector4 protected ()
  extends typings.babylonjs.mathVectorMod.Vector4 {
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
object Vector4 {
  
  @JSImport("babylonjs/Maths/math", "Vector4")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Returns a new Vector4 located at the center between the vectors "value1" and "value2".
    * @param value1 value to calulate the center between
    * @param value2 value to calulate the center between
    * @returns the center between the two vectors
    */
  inline def Center(
    value1: DeepImmutable[typings.babylonjs.mathVectorMod.Vector4],
    value2: DeepImmutable[typings.babylonjs.mathVectorMod.Vector4]
  ): typings.babylonjs.mathVectorMod.Vector4 = (^.asInstanceOf[js.Dynamic].applyDynamic("Center")(value1.asInstanceOf[js.Any], value2.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.mathVectorMod.Vector4]
  
  /**
    * Gets the center of the vectors "value1" and "value2" and stores the result in the vector "ref"
    * @param value1 defines first vector
    * @param value2 defines second vector
    * @param ref defines third vector
    * @returns ref
    */
  inline def CenterToRef(
    value1: DeepImmutable[typings.babylonjs.mathVectorMod.Vector4],
    value2: DeepImmutable[typings.babylonjs.mathVectorMod.Vector4],
    ref: DeepImmutable[typings.babylonjs.mathVectorMod.Vector4]
  ): typings.babylonjs.mathVectorMod.Vector4 = (^.asInstanceOf[js.Dynamic].applyDynamic("CenterToRef")(value1.asInstanceOf[js.Any], value2.asInstanceOf[js.Any], ref.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.mathVectorMod.Vector4]
  
  /**
    * Returns the distance (float) between the vectors "value1" and "value2".
    * @param value1 value to calulate the distance between
    * @param value2 value to calulate the distance between
    * @returns the distance between the two vectors
    */
  inline def Distance(
    value1: DeepImmutable[typings.babylonjs.mathVectorMod.Vector4],
    value2: DeepImmutable[typings.babylonjs.mathVectorMod.Vector4]
  ): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("Distance")(value1.asInstanceOf[js.Any], value2.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  /**
    * Returns the squared distance (float) between the vectors "value1" and "value2".
    * @param value1 value to calulate the distance between
    * @param value2 value to calulate the distance between
    * @returns the distance between the two vectors squared
    */
  inline def DistanceSquared(
    value1: DeepImmutable[typings.babylonjs.mathVectorMod.Vector4],
    value2: DeepImmutable[typings.babylonjs.mathVectorMod.Vector4]
  ): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("DistanceSquared")(value1.asInstanceOf[js.Any], value2.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  /**
    * Returns a new Vector4 set from the starting index of the given array.
    * @param array the array to pull values from
    * @param offset the offset into the array to start at
    * @returns the new vector
    */
  inline def FromArray(array: DeepImmutable[ArrayLike[Double]]): typings.babylonjs.mathVectorMod.Vector4 = ^.asInstanceOf[js.Dynamic].applyDynamic("FromArray")(array.asInstanceOf[js.Any]).asInstanceOf[typings.babylonjs.mathVectorMod.Vector4]
  inline def FromArray(array: DeepImmutable[ArrayLike[Double]], offset: Double): typings.babylonjs.mathVectorMod.Vector4 = (^.asInstanceOf[js.Dynamic].applyDynamic("FromArray")(array.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.mathVectorMod.Vector4]
  
  /**
    * Updates the given vector "result" from the starting index of the given array.
    * @param array the array to pull values from
    * @param offset the offset into the array to start at
    * @param result the vector to store the result in
    */
  inline def FromArrayToRef(
    array: DeepImmutable[ArrayLike[Double]],
    offset: Double,
    result: typings.babylonjs.mathVectorMod.Vector4
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("FromArrayToRef")(array.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Updates the given vector "result" from the starting index of the given Float32Array.
    * @param array the array to pull values from
    * @param offset the offset into the array to start at
    * @param result the vector to store the result in
    */
  inline def FromFloatArrayToRef(
    array: DeepImmutable[js.typedarray.Float32Array],
    offset: Double,
    result: typings.babylonjs.mathVectorMod.Vector4
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("FromFloatArrayToRef")(array.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Updates the given vector "result" coordinates from the given floats.
    * @param x float to set from
    * @param y float to set from
    * @param z float to set from
    * @param w float to set from
    * @param result the vector to the floats in
    */
  inline def FromFloatsToRef(x: Double, y: Double, z: Double, w: Double, result: typings.babylonjs.mathVectorMod.Vector4): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("FromFloatsToRef")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], z.asInstanceOf[js.Any], w.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Creates a new Vector4 from a Vector3
    * @param source defines the source data
    * @param w defines the 4th component (default is 0)
    * @returns a new Vector4
    */
  inline def FromVector3(source: typings.babylonjs.mathVectorMod.Vector3): typings.babylonjs.mathVectorMod.Vector4 = ^.asInstanceOf[js.Dynamic].applyDynamic("FromVector3")(source.asInstanceOf[js.Any]).asInstanceOf[typings.babylonjs.mathVectorMod.Vector4]
  inline def FromVector3(source: typings.babylonjs.mathVectorMod.Vector3, w: Double): typings.babylonjs.mathVectorMod.Vector4 = (^.asInstanceOf[js.Dynamic].applyDynamic("FromVector3")(source.asInstanceOf[js.Any], w.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.mathVectorMod.Vector4]
  
  /**
    * Returns a vector with the maximum values from the left and right vectors
    * @param left left vector to maximize
    * @param right right vector to maximize
    * @returns a new vector with the maximum of the left and right vector values
    */
  inline def Maximize(
    left: DeepImmutable[typings.babylonjs.mathVectorMod.Vector4],
    right: DeepImmutable[typings.babylonjs.mathVectorMod.Vector4]
  ): typings.babylonjs.mathVectorMod.Vector4 = (^.asInstanceOf[js.Dynamic].applyDynamic("Maximize")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.mathVectorMod.Vector4]
  
  /**
    * Returns a vector with the minimum values from the left and right vectors
    * @param left left vector to minimize
    * @param right right vector to minimize
    * @returns a new vector with the minimum of the left and right vector values
    */
  inline def Minimize(
    left: DeepImmutable[typings.babylonjs.mathVectorMod.Vector4],
    right: DeepImmutable[typings.babylonjs.mathVectorMod.Vector4]
  ): typings.babylonjs.mathVectorMod.Vector4 = (^.asInstanceOf[js.Dynamic].applyDynamic("Minimize")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.mathVectorMod.Vector4]
  
  /**
    * Returns a new normalized Vector4 from the given one.
    * @param vector the vector to normalize
    * @returns the vector
    */
  inline def Normalize(vector: DeepImmutable[typings.babylonjs.mathVectorMod.Vector4]): typings.babylonjs.mathVectorMod.Vector4 = ^.asInstanceOf[js.Dynamic].applyDynamic("Normalize")(vector.asInstanceOf[js.Any]).asInstanceOf[typings.babylonjs.mathVectorMod.Vector4]
  
  /**
    * Updates the given vector "result" from the normalization of the given one.
    * @param vector the vector to normalize
    * @param result the vector to store the result in
    */
  inline def NormalizeToRef(
    vector: DeepImmutable[typings.babylonjs.mathVectorMod.Vector4],
    result: typings.babylonjs.mathVectorMod.Vector4
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("NormalizeToRef")(vector.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Returns a new Vector4 set to (1.0, 1.0, 1.0, 1.0)
    * @returns the new vector
    */
  inline def One(): typings.babylonjs.mathVectorMod.Vector4 = ^.asInstanceOf[js.Dynamic].applyDynamic("One")().asInstanceOf[typings.babylonjs.mathVectorMod.Vector4]
  
  /**
    * Returns a new Vector4 set with the result of the transformation by the given matrix of the given vector.
    * This method computes tranformed coordinates only, not transformed direction vectors (ie. it takes translation in account)
    * The difference with Vector3.TransformCoordinates is that the w component is not used to divide the other coordinates but is returned in the w coordinate instead
    * @param vector defines the Vector3 to transform
    * @param transformation defines the transformation matrix
    * @returns the transformed Vector4
    */
  inline def TransformCoordinates(
    vector: DeepImmutable[typings.babylonjs.mathVectorMod.Vector3],
    transformation: DeepImmutable[typings.babylonjs.mathVectorMod.Matrix]
  ): typings.babylonjs.mathVectorMod.Vector4 = (^.asInstanceOf[js.Dynamic].applyDynamic("TransformCoordinates")(vector.asInstanceOf[js.Any], transformation.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.mathVectorMod.Vector4]
  
  /**
    * Sets the given vector "result" coordinates with the result of the transformation by the given matrix of the given floats (x, y, z)
    * This method computes tranformed coordinates only, not transformed direction vectors
    * The difference with Vector3.TransformCoordinatesFromFloatsToRef is that the w component is not used to divide the other coordinates but is returned in the w coordinate instead
    * @param x define the x coordinate of the source vector
    * @param y define the y coordinate of the source vector
    * @param z define the z coordinate of the source vector
    * @param transformation defines the transformation matrix
    * @param result defines the Vector4 where to store the result
    */
  inline def TransformCoordinatesFromFloatsToRef(
    x: Double,
    y: Double,
    z: Double,
    transformation: DeepImmutable[typings.babylonjs.mathVectorMod.Matrix],
    result: typings.babylonjs.mathVectorMod.Vector4
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("TransformCoordinatesFromFloatsToRef")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], z.asInstanceOf[js.Any], transformation.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Sets the given vector "result" coordinates with the result of the transformation by the given matrix of the given vector
    * This method computes tranformed coordinates only, not transformed direction vectors (ie. it takes translation in account)
    * The difference with Vector3.TransformCoordinatesToRef is that the w component is not used to divide the other coordinates but is returned in the w coordinate instead
    * @param vector defines the Vector3 to transform
    * @param transformation defines the transformation matrix
    * @param result defines the Vector4 where to store the result
    */
  inline def TransformCoordinatesToRef(
    vector: DeepImmutable[typings.babylonjs.mathVectorMod.Vector3],
    transformation: DeepImmutable[typings.babylonjs.mathVectorMod.Matrix],
    result: typings.babylonjs.mathVectorMod.Vector4
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("TransformCoordinatesToRef")(vector.asInstanceOf[js.Any], transformation.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Returns a new Vector4 set with the result of the normal transformation by the given matrix of the given vector.
    * This methods computes transformed normalized direction vectors only.
    * @param vector the vector to transform
    * @param transformation the transformation matrix to apply
    * @returns the new vector
    */
  inline def TransformNormal(
    vector: DeepImmutable[typings.babylonjs.mathVectorMod.Vector4],
    transformation: DeepImmutable[typings.babylonjs.mathVectorMod.Matrix]
  ): typings.babylonjs.mathVectorMod.Vector4 = (^.asInstanceOf[js.Dynamic].applyDynamic("TransformNormal")(vector.asInstanceOf[js.Any], transformation.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.mathVectorMod.Vector4]
  
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
  inline def TransformNormalFromFloatsToRef(
    x: Double,
    y: Double,
    z: Double,
    w: Double,
    transformation: DeepImmutable[typings.babylonjs.mathVectorMod.Matrix],
    result: typings.babylonjs.mathVectorMod.Vector4
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("TransformNormalFromFloatsToRef")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], z.asInstanceOf[js.Any], w.asInstanceOf[js.Any], transformation.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Sets the given vector "result" with the result of the normal transformation by the given matrix of the given vector.
    * This methods computes transformed normalized direction vectors only.
    * @param vector the vector to transform
    * @param transformation the transformation matrix to apply
    * @param result the vector to store the result in
    */
  inline def TransformNormalToRef(
    vector: DeepImmutable[typings.babylonjs.mathVectorMod.Vector4],
    transformation: DeepImmutable[typings.babylonjs.mathVectorMod.Matrix],
    result: typings.babylonjs.mathVectorMod.Vector4
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("TransformNormalToRef")(vector.asInstanceOf[js.Any], transformation.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Returns a new Vector4 set to (0.0, 0.0, 0.0, 0.0)
    * @returns the new vector
    */
  inline def Zero(): typings.babylonjs.mathVectorMod.Vector4 = ^.asInstanceOf[js.Dynamic].applyDynamic("Zero")().asInstanceOf[typings.babylonjs.mathVectorMod.Vector4]
  
  @JSImport("babylonjs/Maths/math", "Vector4._ZeroReadOnly")
  @js.native
  def _ZeroReadOnly: Any = js.native
  inline def _ZeroReadOnly_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_ZeroReadOnly")(x.asInstanceOf[js.Any])
}
