package typings.babylonjs.indexMod

import typings.babylonjs.typesMod.DeepImmutable
import typings.std.ArrayLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/index", "Vector4")
@js.native
/**
  * Creates a Vector4 object from the given floats.
  * @param x x value of the vector
  * @param y y value of the vector
  * @param z z value of the vector
  * @param w w value of the vector
  */
open class Vector4 ()
  extends typings.babylonjs.mathsIndexMod.Vector4 {
  def this(/** x value of the vector */
  x: Double) = this()
  def this(/** x value of the vector */
  x: Double, /** y value of the vector */
  y: Double) = this()
  def this(/** x value of the vector */
  x: Unit, /** y value of the vector */
  y: Double) = this()
  def this(
    /** x value of the vector */
  x: Double,
    /** y value of the vector */
  y: Double,
    /** z value of the vector */
  z: Double
  ) = this()
  def this(
    /** x value of the vector */
  x: Double,
    /** y value of the vector */
  y: Unit,
    /** z value of the vector */
  z: Double
  ) = this()
  def this(
    /** x value of the vector */
  x: Unit,
    /** y value of the vector */
  y: Double,
    /** z value of the vector */
  z: Double
  ) = this()
  def this(
    /** x value of the vector */
  x: Unit,
    /** y value of the vector */
  y: Unit,
    /** z value of the vector */
  z: Double
  ) = this()
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
  def this(
    /** x value of the vector */
  x: Double,
    /** y value of the vector */
  y: Double,
    /** z value of the vector */
  z: Unit,
    /** w value of the vector */
  w: Double
  ) = this()
  def this(
    /** x value of the vector */
  x: Double,
    /** y value of the vector */
  y: Unit,
    /** z value of the vector */
  z: Double,
    /** w value of the vector */
  w: Double
  ) = this()
  def this(
    /** x value of the vector */
  x: Double,
    /** y value of the vector */
  y: Unit,
    /** z value of the vector */
  z: Unit,
    /** w value of the vector */
  w: Double
  ) = this()
  def this(
    /** x value of the vector */
  x: Unit,
    /** y value of the vector */
  y: Double,
    /** z value of the vector */
  z: Double,
    /** w value of the vector */
  w: Double
  ) = this()
  def this(
    /** x value of the vector */
  x: Unit,
    /** y value of the vector */
  y: Double,
    /** z value of the vector */
  z: Unit,
    /** w value of the vector */
  w: Double
  ) = this()
  def this(
    /** x value of the vector */
  x: Unit,
    /** y value of the vector */
  y: Unit,
    /** z value of the vector */
  z: Double,
    /** w value of the vector */
  w: Double
  ) = this()
  def this(
    /** x value of the vector */
  x: Unit,
    /** y value of the vector */
  y: Unit,
    /** z value of the vector */
  z: Unit,
    /** w value of the vector */
  w: Double
  ) = this()
}
/* static members */
object Vector4 {
  
  @JSImport("babylonjs/index", "Vector4")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Returns a new Vector4 located at the center between the vectors "value1" and "value2".
    * @param value1 value to calulate the center between
    * @param value2 value to calulate the center between
    * @returns the center between the two vectors
    */
  inline def Center(
    value1: DeepImmutable[typings.babylonjs.mathsMathDotvectorMod.Vector4],
    value2: DeepImmutable[typings.babylonjs.mathsMathDotvectorMod.Vector4]
  ): typings.babylonjs.mathsMathDotvectorMod.Vector4 = (^.asInstanceOf[js.Dynamic].applyDynamic("Center")(value1.asInstanceOf[js.Any], value2.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.mathsMathDotvectorMod.Vector4]
  
  /**
    * Gets the center of the vectors "value1" and "value2" and stores the result in the vector "ref"
    * @param value1 defines first vector
    * @param value2 defines second vector
    * @param ref defines third vector
    * @returns ref
    */
  inline def CenterToRef[T /* <: typings.babylonjs.mathsMathDotvectorMod.Vector4 */](
    value1: DeepImmutable[typings.babylonjs.mathsMathDotvectorMod.Vector4],
    value2: DeepImmutable[typings.babylonjs.mathsMathDotvectorMod.Vector4],
    ref: T
  ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("CenterToRef")(value1.asInstanceOf[js.Any], value2.asInstanceOf[js.Any], ref.asInstanceOf[js.Any])).asInstanceOf[T]
  
  /**
    * Returns the distance (float) between the vectors "value1" and "value2".
    * @param value1 value to calulate the distance between
    * @param value2 value to calulate the distance between
    * @returns the distance between the two vectors
    */
  inline def Distance(
    value1: DeepImmutable[typings.babylonjs.mathsMathDotvectorMod.Vector4],
    value2: DeepImmutable[typings.babylonjs.mathsMathDotvectorMod.Vector4]
  ): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("Distance")(value1.asInstanceOf[js.Any], value2.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  /**
    * Returns the squared distance (float) between the vectors "value1" and "value2".
    * @param value1 value to calulate the distance between
    * @param value2 value to calulate the distance between
    * @returns the distance between the two vectors squared
    */
  inline def DistanceSquared(
    value1: DeepImmutable[typings.babylonjs.mathsMathDotvectorMod.Vector4],
    value2: DeepImmutable[typings.babylonjs.mathsMathDotvectorMod.Vector4]
  ): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("DistanceSquared")(value1.asInstanceOf[js.Any], value2.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  /**
    * Returns a new Vector4 set from the starting index of the given array.
    * @param array the array to pull values from
    * @param offset the offset into the array to start at
    * @returns the new vector
    */
  inline def FromArray(array: DeepImmutable[ArrayLike[Double]]): typings.babylonjs.mathsMathDotvectorMod.Vector4 = ^.asInstanceOf[js.Dynamic].applyDynamic("FromArray")(array.asInstanceOf[js.Any]).asInstanceOf[typings.babylonjs.mathsMathDotvectorMod.Vector4]
  inline def FromArray(array: DeepImmutable[ArrayLike[Double]], offset: Double): typings.babylonjs.mathsMathDotvectorMod.Vector4 = (^.asInstanceOf[js.Dynamic].applyDynamic("FromArray")(array.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.mathsMathDotvectorMod.Vector4]
  
  /**
    * Updates the given vector "result" from the starting index of the given array.
    * @param array the array to pull values from
    * @param offset the offset into the array to start at
    * @param result the vector to store the result in
    * @returns result input
    */
  inline def FromArrayToRef[T /* <: typings.babylonjs.mathsMathDotvectorMod.Vector4 */](array: DeepImmutable[ArrayLike[Double]], offset: Double, result: T): T = (^.asInstanceOf[js.Dynamic].applyDynamic("FromArrayToRef")(array.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[T]
  
  /**
    * Updates the given vector "result" from the starting index of the given Float32Array.
    * @param array the array to pull values from
    * @param offset the offset into the array to start at
    * @param result the vector to store the result in
    * @returns result input
    */
  inline def FromFloatArrayToRef[T /* <: typings.babylonjs.mathsMathDotvectorMod.Vector4 */](array: DeepImmutable[js.typedarray.Float32Array], offset: Double, result: T): T = (^.asInstanceOf[js.Dynamic].applyDynamic("FromFloatArrayToRef")(array.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[T]
  
  /**
    * Updates the given vector "result" coordinates from the given floats.
    * @param x float to set from
    * @param y float to set from
    * @param z float to set from
    * @param w float to set from
    * @param result the vector to the floats in
    * @returns result input
    */
  inline def FromFloatsToRef[T /* <: typings.babylonjs.mathsMathDotvectorMod.Vector4 */](x: Double, y: Double, z: Double, w: Double, result: T): T = (^.asInstanceOf[js.Dynamic].applyDynamic("FromFloatsToRef")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], z.asInstanceOf[js.Any], w.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[T]
  
  /**
    * Creates a new Vector4 from a Vector3
    * @param source defines the source data
    * @param w defines the 4th component (default is 0)
    * @returns a new Vector4
    */
  inline def FromVector3(source: typings.babylonjs.mathsMathDotvectorMod.Vector3): typings.babylonjs.mathsMathDotvectorMod.Vector4 = ^.asInstanceOf[js.Dynamic].applyDynamic("FromVector3")(source.asInstanceOf[js.Any]).asInstanceOf[typings.babylonjs.mathsMathDotvectorMod.Vector4]
  inline def FromVector3(source: typings.babylonjs.mathsMathDotvectorMod.Vector3, w: Double): typings.babylonjs.mathsMathDotvectorMod.Vector4 = (^.asInstanceOf[js.Dynamic].applyDynamic("FromVector3")(source.asInstanceOf[js.Any], w.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.mathsMathDotvectorMod.Vector4]
  
  /**
    * Returns a vector with the maximum values from the left and right vectors
    * @param left left vector to maximize
    * @param right right vector to maximize
    * @returns a new vector with the maximum of the left and right vector values
    */
  inline def Maximize[T /* <: typings.babylonjs.mathsMathDotvectorMod.Vector4 */](left: DeepImmutable[T], right: DeepImmutable[typings.babylonjs.mathsMathDotvectorMod.Vector4]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("Maximize")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[T]
  
  /**
    * Returns a vector with the minimum values from the left and right vectors
    * @param left left vector to minimize
    * @param right right vector to minimize
    * @returns a new vector with the minimum of the left and right vector values
    */
  inline def Minimize[T /* <: typings.babylonjs.mathsMathDotvectorMod.Vector4 */](left: DeepImmutable[T], right: DeepImmutable[typings.babylonjs.mathsMathDotvectorMod.Vector4]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("Minimize")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[T]
  
  /**
    * Returns a new normalized Vector4 from the given one.
    * @param vector the vector to normalize
    * @returns the vector
    */
  inline def Normalize(vector: DeepImmutable[typings.babylonjs.mathsMathDotvectorMod.Vector4]): typings.babylonjs.mathsMathDotvectorMod.Vector4 = ^.asInstanceOf[js.Dynamic].applyDynamic("Normalize")(vector.asInstanceOf[js.Any]).asInstanceOf[typings.babylonjs.mathsMathDotvectorMod.Vector4]
  
  /**
    * Updates the given vector "result" from the normalization of the given one.
    * @param vector the vector to normalize
    * @param result the vector to store the result in
    * @returns result input
    */
  inline def NormalizeToRef[T /* <: typings.babylonjs.mathsMathDotvectorMod.Vector4 */](vector: DeepImmutable[typings.babylonjs.mathsMathDotvectorMod.Vector4], result: T): T = (^.asInstanceOf[js.Dynamic].applyDynamic("NormalizeToRef")(vector.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[T]
  
  /**
    * Returns a new Vector4 set to (1.0, 1.0, 1.0, 1.0)
    * @returns the new vector
    */
  inline def One(): typings.babylonjs.mathsMathDotvectorMod.Vector4 = ^.asInstanceOf[js.Dynamic].applyDynamic("One")().asInstanceOf[typings.babylonjs.mathsMathDotvectorMod.Vector4]
  
  /**
    * Returns a new Vector4 with random values between min and max
    * @param min the minimum random value
    * @param max the maximum random value
    * @returns a Vector4 with random values between min and max
    */
  inline def Random(): typings.babylonjs.mathsMathDotvectorMod.Vector4 = ^.asInstanceOf[js.Dynamic].applyDynamic("Random")().asInstanceOf[typings.babylonjs.mathsMathDotvectorMod.Vector4]
  inline def Random(min: Double): typings.babylonjs.mathsMathDotvectorMod.Vector4 = ^.asInstanceOf[js.Dynamic].applyDynamic("Random")(min.asInstanceOf[js.Any]).asInstanceOf[typings.babylonjs.mathsMathDotvectorMod.Vector4]
  inline def Random(min: Double, max: Double): typings.babylonjs.mathsMathDotvectorMod.Vector4 = (^.asInstanceOf[js.Dynamic].applyDynamic("Random")(min.asInstanceOf[js.Any], max.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.mathsMathDotvectorMod.Vector4]
  inline def Random(min: Unit, max: Double): typings.babylonjs.mathsMathDotvectorMod.Vector4 = (^.asInstanceOf[js.Dynamic].applyDynamic("Random")(min.asInstanceOf[js.Any], max.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.mathsMathDotvectorMod.Vector4]
  
  /**
    * Returns a new Vector4 set with the result of the transformation by the given matrix of the given vector.
    * This method computes tranformed coordinates only, not transformed direction vectors (ie. it takes translation in account)
    * The difference with Vector3.TransformCoordinates is that the w component is not used to divide the other coordinates but is returned in the w coordinate instead
    * @param vector defines the Vector3 to transform
    * @param transformation defines the transformation matrix
    * @returns the transformed Vector4
    */
  inline def TransformCoordinates(
    vector: DeepImmutable[typings.babylonjs.mathsMathDotvectorMod.Vector3],
    transformation: DeepImmutable[typings.babylonjs.mathsMathDotvectorMod.Matrix]
  ): typings.babylonjs.mathsMathDotvectorMod.Vector4 = (^.asInstanceOf[js.Dynamic].applyDynamic("TransformCoordinates")(vector.asInstanceOf[js.Any], transformation.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.mathsMathDotvectorMod.Vector4]
  
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
  inline def TransformCoordinatesFromFloatsToRef[T /* <: typings.babylonjs.mathsMathDotvectorMod.Vector4 */](
    x: Double,
    y: Double,
    z: Double,
    transformation: DeepImmutable[typings.babylonjs.mathsMathDotvectorMod.Matrix],
    result: T
  ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("TransformCoordinatesFromFloatsToRef")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], z.asInstanceOf[js.Any], transformation.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[T]
  
  /**
    * Sets the given vector "result" coordinates with the result of the transformation by the given matrix of the given vector
    * This method computes tranformed coordinates only, not transformed direction vectors (ie. it takes translation in account)
    * The difference with Vector3.TransformCoordinatesToRef is that the w component is not used to divide the other coordinates but is returned in the w coordinate instead
    * @param vector defines the Vector3 to transform
    * @param transformation defines the transformation matrix
    * @param result defines the Vector4 where to store the result
    * @returns result input
    */
  inline def TransformCoordinatesToRef[T /* <: typings.babylonjs.mathsMathDotvectorMod.Vector4 */](
    vector: DeepImmutable[typings.babylonjs.mathsMathDotvectorMod.Vector3],
    transformation: DeepImmutable[typings.babylonjs.mathsMathDotvectorMod.Matrix],
    result: T
  ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("TransformCoordinatesToRef")(vector.asInstanceOf[js.Any], transformation.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[T]
  
  /**
    * Returns a new Vector4 set with the result of the normal transformation by the given matrix of the given vector.
    * This methods computes transformed normalized direction vectors only.
    * @param vector the vector to transform
    * @param transformation the transformation matrix to apply
    * @returns the new vector
    */
  inline def TransformNormal[T /* <: typings.babylonjs.mathsMathDotvectorMod.Vector4 */](
    vector: DeepImmutable[T],
    transformation: DeepImmutable[typings.babylonjs.mathsMathDotvectorMod.Matrix]
  ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("TransformNormal")(vector.asInstanceOf[js.Any], transformation.asInstanceOf[js.Any])).asInstanceOf[T]
  
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
  inline def TransformNormalFromFloatsToRef[T /* <: typings.babylonjs.mathsMathDotvectorMod.Vector4 */](
    x: Double,
    y: Double,
    z: Double,
    w: Double,
    transformation: DeepImmutable[typings.babylonjs.mathsMathDotvectorMod.Matrix],
    result: T
  ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("TransformNormalFromFloatsToRef")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], z.asInstanceOf[js.Any], w.asInstanceOf[js.Any], transformation.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[T]
  
  /**
    * Sets the given vector "result" with the result of the normal transformation by the given matrix of the given vector.
    * This methods computes transformed normalized direction vectors only.
    * @param vector the vector to transform
    * @param transformation the transformation matrix to apply
    * @param result the vector to store the result in
    * @returns result input
    */
  inline def TransformNormalToRef[T /* <: typings.babylonjs.mathsMathDotvectorMod.Vector4 */](
    vector: DeepImmutable[typings.babylonjs.mathsMathDotvectorMod.Vector4],
    transformation: DeepImmutable[typings.babylonjs.mathsMathDotvectorMod.Matrix],
    result: T
  ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("TransformNormalToRef")(vector.asInstanceOf[js.Any], transformation.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[T]
  
  /**
    * Returns a new Vector4 set to (0.0, 0.0, 0.0, 0.0)
    * @returns the new vector
    */
  inline def Zero(): typings.babylonjs.mathsMathDotvectorMod.Vector4 = ^.asInstanceOf[js.Dynamic].applyDynamic("Zero")().asInstanceOf[typings.babylonjs.mathsMathDotvectorMod.Vector4]
  
  @JSImport("babylonjs/index", "Vector4._ZeroReadOnly")
  @js.native
  def _ZeroReadOnly: Any = js.native
  inline def _ZeroReadOnly_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_ZeroReadOnly")(x.asInstanceOf[js.Any])
}
