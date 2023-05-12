package typings.cesiumEngine.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@cesium/engine", "Quaternion")
@js.native
open class Quaternion () extends StObject {
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
  
  def clone(result: Quaternion): Quaternion = js.native
  
  /**
    * Compares this and the provided quaternion componentwise and returns
    * <code>true</code> if they are equal, <code>false</code> otherwise.
    * @param [right] - The right hand side quaternion.
    * @returns <code>true</code> if left and right are equal, <code>false</code> otherwise.
    */
  def equals(): Boolean = js.native
  def equals(right: Quaternion): Boolean = js.native
  
  /**
    * Compares this and the provided quaternion componentwise and returns
    * <code>true</code> if they are within the provided epsilon,
    * <code>false</code> otherwise.
    * @param [right] - The right hand side quaternion.
    * @param [epsilon = 0] - The epsilon to use for equality testing.
    * @returns <code>true</code> if left and right are within the provided epsilon, <code>false</code> otherwise.
    */
  def equalsEpsilon(): Boolean = js.native
  def equalsEpsilon(right: Unit, epsilon: Double): Boolean = js.native
  def equalsEpsilon(right: Quaternion): Boolean = js.native
  def equalsEpsilon(right: Quaternion, epsilon: Double): Boolean = js.native
  
  /**
    * The W component.
    */
  var w: Double = js.native
  
  /**
    * The X component.
    */
  var x: Double = js.native
  
  /**
    * The Y component.
    */
  var y: Double = js.native
  
  /**
    * The Z component.
    */
  var z: Double = js.native
}
/* static members */
object Quaternion {
  
  @JSImport("@cesium/engine", "Quaternion")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * An immutable Quaternion instance initialized to (0.0, 0.0, 0.0, 1.0).
    */
  @JSImport("@cesium/engine", "Quaternion.IDENTITY")
  @js.native
  val IDENTITY: Quaternion = js.native
  
  /**
    * An immutable Quaternion instance initialized to (0.0, 0.0, 0.0, 0.0).
    */
  @JSImport("@cesium/engine", "Quaternion.ZERO")
  @js.native
  val ZERO: Quaternion = js.native
  
  /**
    * Computes the componentwise sum of two quaternions.
    * @param left - The first quaternion.
    * @param right - The second quaternion.
    * @param result - The object onto which to store the result.
    * @returns The modified result parameter.
    */
  inline def add(left: Quaternion, right: Quaternion, result: Quaternion): Quaternion = (^.asInstanceOf[js.Dynamic].applyDynamic("add")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Quaternion]
  
  /**
    * Duplicates a Quaternion instance.
    * @param quaternion - The quaternion to duplicate.
    * @param [result] - The object onto which to store the result.
    * @returns The modified result parameter or a new Quaternion instance if one was not provided. (Returns undefined if quaternion is undefined)
    */
  inline def clone(quaternion: Quaternion): Quaternion = ^.asInstanceOf[js.Dynamic].applyDynamic("clone")(quaternion.asInstanceOf[js.Any]).asInstanceOf[Quaternion]
  inline def clone(quaternion: Quaternion, result: Quaternion): Quaternion = (^.asInstanceOf[js.Dynamic].applyDynamic("clone")(quaternion.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Quaternion]
  
  /**
    * Computes the angle of rotation of the provided quaternion.
    * @param quaternion - The quaternion to use.
    * @returns The angle of rotation.
    */
  inline def computeAngle(quaternion: Quaternion): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("computeAngle")(quaternion.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  /**
    * Computes the axis of rotation of the provided quaternion.
    * @param quaternion - The quaternion to use.
    * @param result - The object onto which to store the result.
    * @returns The modified result parameter.
    */
  inline def computeAxis(quaternion: Quaternion, result: Cartesian3): Cartesian3 = (^.asInstanceOf[js.Dynamic].applyDynamic("computeAxis")(quaternion.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Cartesian3]
  
  /**
    * Computes an inner quadrangle point.
    * <p>This will compute quaternions that ensure a squad curve is C<sup>1</sup>.</p>
    * @param q0 - The first quaternion.
    * @param q1 - The second quaternion.
    * @param q2 - The third quaternion.
    * @param result - The object onto which to store the result.
    * @returns The modified result parameter.
    */
  inline def computeInnerQuadrangle(q0: Quaternion, q1: Quaternion, q2: Quaternion, result: Quaternion): Quaternion = (^.asInstanceOf[js.Dynamic].applyDynamic("computeInnerQuadrangle")(q0.asInstanceOf[js.Any], q1.asInstanceOf[js.Any], q2.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Quaternion]
  
  /**
    * Computes the conjugate of the provided quaternion.
    * @param quaternion - The quaternion to conjugate.
    * @param result - The object onto which to store the result.
    * @returns The modified result parameter.
    */
  inline def conjugate(quaternion: Quaternion, result: Quaternion): Quaternion = (^.asInstanceOf[js.Dynamic].applyDynamic("conjugate")(quaternion.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Quaternion]
  
  /**
    * Converts a packed array into a form suitable for interpolation.
    * @param packedArray - The packed array.
    * @param [startingIndex = 0] - The index of the first element to be converted.
    * @param [lastIndex = packedArray.length] - The index of the last element to be converted.
    * @param [result] - The object into which to store the result.
    */
  inline def convertPackedArrayForInterpolation(packedArray: js.Array[Double]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("convertPackedArrayForInterpolation")(packedArray.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def convertPackedArrayForInterpolation(packedArray: js.Array[Double], startingIndex: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("convertPackedArrayForInterpolation")(packedArray.asInstanceOf[js.Any], startingIndex.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def convertPackedArrayForInterpolation(packedArray: js.Array[Double], startingIndex: Double, lastIndex: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("convertPackedArrayForInterpolation")(packedArray.asInstanceOf[js.Any], startingIndex.asInstanceOf[js.Any], lastIndex.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def convertPackedArrayForInterpolation(packedArray: js.Array[Double], startingIndex: Double, lastIndex: Double, result: js.Array[Double]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("convertPackedArrayForInterpolation")(packedArray.asInstanceOf[js.Any], startingIndex.asInstanceOf[js.Any], lastIndex.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def convertPackedArrayForInterpolation(packedArray: js.Array[Double], startingIndex: Double, lastIndex: Unit, result: js.Array[Double]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("convertPackedArrayForInterpolation")(packedArray.asInstanceOf[js.Any], startingIndex.asInstanceOf[js.Any], lastIndex.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def convertPackedArrayForInterpolation(packedArray: js.Array[Double], startingIndex: Unit, lastIndex: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("convertPackedArrayForInterpolation")(packedArray.asInstanceOf[js.Any], startingIndex.asInstanceOf[js.Any], lastIndex.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def convertPackedArrayForInterpolation(packedArray: js.Array[Double], startingIndex: Unit, lastIndex: Double, result: js.Array[Double]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("convertPackedArrayForInterpolation")(packedArray.asInstanceOf[js.Any], startingIndex.asInstanceOf[js.Any], lastIndex.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def convertPackedArrayForInterpolation(packedArray: js.Array[Double], startingIndex: Unit, lastIndex: Unit, result: js.Array[Double]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("convertPackedArrayForInterpolation")(packedArray.asInstanceOf[js.Any], startingIndex.asInstanceOf[js.Any], lastIndex.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Divides the provided quaternion componentwise by the provided scalar.
    * @param quaternion - The quaternion to be divided.
    * @param scalar - The scalar to divide by.
    * @param result - The object onto which to store the result.
    * @returns The modified result parameter.
    */
  inline def divideByScalar(quaternion: Quaternion, scalar: Double, result: Quaternion): Quaternion = (^.asInstanceOf[js.Dynamic].applyDynamic("divideByScalar")(quaternion.asInstanceOf[js.Any], scalar.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Quaternion]
  
  /**
    * Computes the dot (scalar) product of two quaternions.
    * @param left - The first quaternion.
    * @param right - The second quaternion.
    * @returns The dot product.
    */
  inline def dot(left: Quaternion, right: Quaternion): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("dot")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  /**
    * Compares the provided quaternions componentwise and returns
    * <code>true</code> if they are equal, <code>false</code> otherwise.
    * @param [left] - The first quaternion.
    * @param [right] - The second quaternion.
    * @returns <code>true</code> if left and right are equal, <code>false</code> otherwise.
    */
  inline def equals(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("equals")().asInstanceOf[Boolean]
  inline def equals(left: Unit, right: Quaternion): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def equals(left: Quaternion): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("equals")(left.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def equals(left: Quaternion, right: Quaternion): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  /**
    * Compares the provided quaternions componentwise and returns
    * <code>true</code> if they are within the provided epsilon,
    * <code>false</code> otherwise.
    * @param [left] - The first quaternion.
    * @param [right] - The second quaternion.
    * @param [epsilon = 0] - The epsilon to use for equality testing.
    * @returns <code>true</code> if left and right are within the provided epsilon, <code>false</code> otherwise.
    */
  inline def equalsEpsilon(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("equalsEpsilon")().asInstanceOf[Boolean]
  inline def equalsEpsilon(left: Unit, right: Unit, epsilon: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equalsEpsilon")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any], epsilon.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def equalsEpsilon(left: Unit, right: Quaternion): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equalsEpsilon")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def equalsEpsilon(left: Unit, right: Quaternion, epsilon: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equalsEpsilon")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any], epsilon.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def equalsEpsilon(left: Quaternion): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("equalsEpsilon")(left.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def equalsEpsilon(left: Quaternion, right: Unit, epsilon: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equalsEpsilon")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any], epsilon.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def equalsEpsilon(left: Quaternion, right: Quaternion): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equalsEpsilon")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def equalsEpsilon(left: Quaternion, right: Quaternion, epsilon: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equalsEpsilon")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any], epsilon.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  /**
    * The exponential quaternion function.
    * @param cartesian - The cartesian.
    * @param result - The object onto which to store the result.
    * @returns The modified result parameter.
    */
  inline def exp(cartesian: Cartesian3, result: Quaternion): Quaternion = (^.asInstanceOf[js.Dynamic].applyDynamic("exp")(cartesian.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Quaternion]
  
  /**
    * Computes the spherical linear interpolation or extrapolation at t using the provided quaternions.
    * This implementation is faster than {@link Quaternion#slerp}, but is only accurate up to 10<sup>-6</sup>.
    * @param start - The value corresponding to t at 0.0.
    * @param end - The value corresponding to t at 1.0.
    * @param t - The point along t at which to interpolate.
    * @param result - The object onto which to store the result.
    * @returns The modified result parameter.
    */
  inline def fastSlerp(start: Quaternion, end: Quaternion, t: Double, result: Quaternion): Quaternion = (^.asInstanceOf[js.Dynamic].applyDynamic("fastSlerp")(start.asInstanceOf[js.Any], end.asInstanceOf[js.Any], t.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Quaternion]
  
  /**
    * Computes the spherical quadrangle interpolation between quaternions.
    * An implementation that is faster than {@link Quaternion#squad}, but less accurate.
    * @param q0 - The first quaternion.
    * @param q1 - The second quaternion.
    * @param s0 - The first inner quadrangle.
    * @param s1 - The second inner quadrangle.
    * @param t - The time in [0,1] used to interpolate.
    * @param result - The object onto which to store the result.
    * @returns The modified result parameter or a new instance if none was provided.
    */
  inline def fastSquad(q0: Quaternion, q1: Quaternion, s0: Quaternion, s1: Quaternion, t: Double, result: Quaternion): Quaternion = (^.asInstanceOf[js.Dynamic].applyDynamic("fastSquad")(q0.asInstanceOf[js.Any], q1.asInstanceOf[js.Any], s0.asInstanceOf[js.Any], s1.asInstanceOf[js.Any], t.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Quaternion]
  
  /**
    * Computes a quaternion representing a rotation around an axis.
    * @param axis - The axis of rotation.
    * @param angle - The angle in radians to rotate around the axis.
    * @param [result] - The object onto which to store the result.
    * @returns The modified result parameter or a new Quaternion instance if one was not provided.
    */
  inline def fromAxisAngle(axis: Cartesian3, angle: Double): Quaternion = (^.asInstanceOf[js.Dynamic].applyDynamic("fromAxisAngle")(axis.asInstanceOf[js.Any], angle.asInstanceOf[js.Any])).asInstanceOf[Quaternion]
  inline def fromAxisAngle(axis: Cartesian3, angle: Double, result: Quaternion): Quaternion = (^.asInstanceOf[js.Dynamic].applyDynamic("fromAxisAngle")(axis.asInstanceOf[js.Any], angle.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Quaternion]
  
  /**
    * Computes a rotation from the given heading, pitch and roll angles. Heading is the rotation about the
    * negative z axis. Pitch is the rotation about the negative y axis. Roll is the rotation about
    * the positive x axis.
    * @param headingPitchRoll - The rotation expressed as a heading, pitch and roll.
    * @param [result] - The object onto which to store the result.
    * @returns The modified result parameter or a new Quaternion instance if none was provided.
    */
  inline def fromHeadingPitchRoll(headingPitchRoll: HeadingPitchRoll): Quaternion = ^.asInstanceOf[js.Dynamic].applyDynamic("fromHeadingPitchRoll")(headingPitchRoll.asInstanceOf[js.Any]).asInstanceOf[Quaternion]
  inline def fromHeadingPitchRoll(headingPitchRoll: HeadingPitchRoll, result: Quaternion): Quaternion = (^.asInstanceOf[js.Dynamic].applyDynamic("fromHeadingPitchRoll")(headingPitchRoll.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Quaternion]
  
  /**
    * Computes a Quaternion from the provided Matrix3 instance.
    * @param matrix - The rotation matrix.
    * @param [result] - The object onto which to store the result.
    * @returns The modified result parameter or a new Quaternion instance if one was not provided.
    */
  inline def fromRotationMatrix(matrix: Matrix3): Quaternion = ^.asInstanceOf[js.Dynamic].applyDynamic("fromRotationMatrix")(matrix.asInstanceOf[js.Any]).asInstanceOf[Quaternion]
  inline def fromRotationMatrix(matrix: Matrix3, result: Quaternion): Quaternion = (^.asInstanceOf[js.Dynamic].applyDynamic("fromRotationMatrix")(matrix.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Quaternion]
  
  /**
    * Computes the inverse of the provided quaternion.
    * @param quaternion - The quaternion to normalize.
    * @param result - The object onto which to store the result.
    * @returns The modified result parameter.
    */
  inline def inverse(quaternion: Quaternion, result: Quaternion): Quaternion = (^.asInstanceOf[js.Dynamic].applyDynamic("inverse")(quaternion.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Quaternion]
  
  /**
    * Computes the linear interpolation or extrapolation at t using the provided quaternions.
    * @param start - The value corresponding to t at 0.0.
    * @param end - The value corresponding to t at 1.0.
    * @param t - The point along t at which to interpolate.
    * @param result - The object onto which to store the result.
    * @returns The modified result parameter.
    */
  inline def lerp(start: Quaternion, end: Quaternion, t: Double, result: Quaternion): Quaternion = (^.asInstanceOf[js.Dynamic].applyDynamic("lerp")(start.asInstanceOf[js.Any], end.asInstanceOf[js.Any], t.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Quaternion]
  
  /**
    * The logarithmic quaternion function.
    * @param quaternion - The unit quaternion.
    * @param result - The object onto which to store the result.
    * @returns The modified result parameter.
    */
  inline def log(quaternion: Quaternion, result: Cartesian3): Cartesian3 = (^.asInstanceOf[js.Dynamic].applyDynamic("log")(quaternion.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Cartesian3]
  
  /**
    * Computes magnitude for the provided quaternion.
    * @param quaternion - The quaternion to conjugate.
    * @returns The magnitude.
    */
  inline def magnitude(quaternion: Quaternion): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("magnitude")(quaternion.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  /**
    * Computes magnitude squared for the provided quaternion.
    * @param quaternion - The quaternion to conjugate.
    * @returns The magnitude squared.
    */
  inline def magnitudeSquared(quaternion: Quaternion): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("magnitudeSquared")(quaternion.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  /**
    * Computes the product of two quaternions.
    * @param left - The first quaternion.
    * @param right - The second quaternion.
    * @param result - The object onto which to store the result.
    * @returns The modified result parameter.
    */
  inline def multiply(left: Quaternion, right: Quaternion, result: Quaternion): Quaternion = (^.asInstanceOf[js.Dynamic].applyDynamic("multiply")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Quaternion]
  
  /**
    * Multiplies the provided quaternion componentwise by the provided scalar.
    * @param quaternion - The quaternion to be scaled.
    * @param scalar - The scalar to multiply with.
    * @param result - The object onto which to store the result.
    * @returns The modified result parameter.
    */
  inline def multiplyByScalar(quaternion: Quaternion, scalar: Double, result: Quaternion): Quaternion = (^.asInstanceOf[js.Dynamic].applyDynamic("multiplyByScalar")(quaternion.asInstanceOf[js.Any], scalar.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Quaternion]
  
  /**
    * Negates the provided quaternion.
    * @param quaternion - The quaternion to be negated.
    * @param result - The object onto which to store the result.
    * @returns The modified result parameter.
    */
  inline def negate(quaternion: Quaternion, result: Quaternion): Quaternion = (^.asInstanceOf[js.Dynamic].applyDynamic("negate")(quaternion.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Quaternion]
  
  /**
    * Computes the normalized form of the provided quaternion.
    * @param quaternion - The quaternion to normalize.
    * @param result - The object onto which to store the result.
    * @returns The modified result parameter.
    */
  inline def normalize(quaternion: Quaternion, result: Quaternion): Quaternion = (^.asInstanceOf[js.Dynamic].applyDynamic("normalize")(quaternion.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Quaternion]
  
  /**
    * Stores the provided instance into the provided array.
    * @param value - The value to pack.
    * @param array - The array to pack into.
    * @param [startingIndex = 0] - The index into the array at which to start packing the elements.
    * @returns The array that was packed into
    */
  inline def pack(value: Quaternion, array: js.Array[Double]): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("pack")(value.asInstanceOf[js.Any], array.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  inline def pack(value: Quaternion, array: js.Array[Double], startingIndex: Double): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("pack")(value.asInstanceOf[js.Any], array.asInstanceOf[js.Any], startingIndex.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  
  /**
    * The number of elements used to store the object into an array in its interpolatable form.
    */
  @JSImport("@cesium/engine", "Quaternion.packedInterpolationLength")
  @js.native
  def packedInterpolationLength: Double = js.native
  inline def packedInterpolationLength_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("packedInterpolationLength")(x.asInstanceOf[js.Any])
  
  /**
    * The number of elements used to pack the object into an array.
    */
  @JSImport("@cesium/engine", "Quaternion.packedLength")
  @js.native
  def packedLength: Double = js.native
  inline def packedLength_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("packedLength")(x.asInstanceOf[js.Any])
  
  /**
    * Computes the spherical linear interpolation or extrapolation at t using the provided quaternions.
    * @param start - The value corresponding to t at 0.0.
    * @param end - The value corresponding to t at 1.0.
    * @param t - The point along t at which to interpolate.
    * @param result - The object onto which to store the result.
    * @returns The modified result parameter.
    */
  inline def slerp(start: Quaternion, end: Quaternion, t: Double, result: Quaternion): Quaternion = (^.asInstanceOf[js.Dynamic].applyDynamic("slerp")(start.asInstanceOf[js.Any], end.asInstanceOf[js.Any], t.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Quaternion]
  
  /**
    * Computes the spherical quadrangle interpolation between quaternions.
    * @example
    * // 1. compute the squad interpolation between two quaternions on a curve
    * const s0 = Cesium.Quaternion.computeInnerQuadrangle(quaternions[i - 1], quaternions[i], quaternions[i + 1], new Cesium.Quaternion());
    * const s1 = Cesium.Quaternion.computeInnerQuadrangle(quaternions[i], quaternions[i + 1], quaternions[i + 2], new Cesium.Quaternion());
    * const q = Cesium.Quaternion.squad(quaternions[i], quaternions[i + 1], s0, s1, t, new Cesium.Quaternion());
    *
    * // 2. compute the squad interpolation as above but where the first quaternion is a end point.
    * const s1 = Cesium.Quaternion.computeInnerQuadrangle(quaternions[0], quaternions[1], quaternions[2], new Cesium.Quaternion());
    * const q = Cesium.Quaternion.squad(quaternions[0], quaternions[1], quaternions[0], s1, t, new Cesium.Quaternion());
    * @param q0 - The first quaternion.
    * @param q1 - The second quaternion.
    * @param s0 - The first inner quadrangle.
    * @param s1 - The second inner quadrangle.
    * @param t - The time in [0,1] used to interpolate.
    * @param result - The object onto which to store the result.
    * @returns The modified result parameter.
    */
  inline def squad(q0: Quaternion, q1: Quaternion, s0: Quaternion, s1: Quaternion, t: Double, result: Quaternion): Quaternion = (^.asInstanceOf[js.Dynamic].applyDynamic("squad")(q0.asInstanceOf[js.Any], q1.asInstanceOf[js.Any], s0.asInstanceOf[js.Any], s1.asInstanceOf[js.Any], t.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Quaternion]
  
  /**
    * Computes the componentwise difference of two quaternions.
    * @param left - The first quaternion.
    * @param right - The second quaternion.
    * @param result - The object onto which to store the result.
    * @returns The modified result parameter.
    */
  inline def subtract(left: Quaternion, right: Quaternion, result: Quaternion): Quaternion = (^.asInstanceOf[js.Dynamic].applyDynamic("subtract")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Quaternion]
  
  /**
    * Retrieves an instance from a packed array.
    * @param array - The packed array.
    * @param [startingIndex = 0] - The starting index of the element to be unpacked.
    * @param [result] - The object into which to store the result.
    * @returns The modified result parameter or a new Quaternion instance if one was not provided.
    */
  inline def unpack(array: js.Array[Double]): Quaternion = ^.asInstanceOf[js.Dynamic].applyDynamic("unpack")(array.asInstanceOf[js.Any]).asInstanceOf[Quaternion]
  inline def unpack(array: js.Array[Double], startingIndex: Double): Quaternion = (^.asInstanceOf[js.Dynamic].applyDynamic("unpack")(array.asInstanceOf[js.Any], startingIndex.asInstanceOf[js.Any])).asInstanceOf[Quaternion]
  inline def unpack(array: js.Array[Double], startingIndex: Double, result: Quaternion): Quaternion = (^.asInstanceOf[js.Dynamic].applyDynamic("unpack")(array.asInstanceOf[js.Any], startingIndex.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Quaternion]
  inline def unpack(array: js.Array[Double], startingIndex: Unit, result: Quaternion): Quaternion = (^.asInstanceOf[js.Dynamic].applyDynamic("unpack")(array.asInstanceOf[js.Any], startingIndex.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Quaternion]
  
  /**
    * Retrieves an instance from a packed array converted with {@link convertPackedArrayForInterpolation}.
    * @param array - The array previously packed for interpolation.
    * @param sourceArray - The original packed array.
    * @param [firstIndex = 0] - The firstIndex used to convert the array.
    * @param [lastIndex = packedArray.length] - The lastIndex used to convert the array.
    * @param [result] - The object into which to store the result.
    * @returns The modified result parameter or a new Quaternion instance if one was not provided.
    */
  inline def unpackInterpolationResult(array: js.Array[Double], sourceArray: js.Array[Double]): Quaternion = (^.asInstanceOf[js.Dynamic].applyDynamic("unpackInterpolationResult")(array.asInstanceOf[js.Any], sourceArray.asInstanceOf[js.Any])).asInstanceOf[Quaternion]
  inline def unpackInterpolationResult(array: js.Array[Double], sourceArray: js.Array[Double], firstIndex: Double): Quaternion = (^.asInstanceOf[js.Dynamic].applyDynamic("unpackInterpolationResult")(array.asInstanceOf[js.Any], sourceArray.asInstanceOf[js.Any], firstIndex.asInstanceOf[js.Any])).asInstanceOf[Quaternion]
  inline def unpackInterpolationResult(array: js.Array[Double], sourceArray: js.Array[Double], firstIndex: Double, lastIndex: Double): Quaternion = (^.asInstanceOf[js.Dynamic].applyDynamic("unpackInterpolationResult")(array.asInstanceOf[js.Any], sourceArray.asInstanceOf[js.Any], firstIndex.asInstanceOf[js.Any], lastIndex.asInstanceOf[js.Any])).asInstanceOf[Quaternion]
  inline def unpackInterpolationResult(
    array: js.Array[Double],
    sourceArray: js.Array[Double],
    firstIndex: Double,
    lastIndex: Double,
    result: Quaternion
  ): Quaternion = (^.asInstanceOf[js.Dynamic].applyDynamic("unpackInterpolationResult")(array.asInstanceOf[js.Any], sourceArray.asInstanceOf[js.Any], firstIndex.asInstanceOf[js.Any], lastIndex.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Quaternion]
  inline def unpackInterpolationResult(
    array: js.Array[Double],
    sourceArray: js.Array[Double],
    firstIndex: Double,
    lastIndex: Unit,
    result: Quaternion
  ): Quaternion = (^.asInstanceOf[js.Dynamic].applyDynamic("unpackInterpolationResult")(array.asInstanceOf[js.Any], sourceArray.asInstanceOf[js.Any], firstIndex.asInstanceOf[js.Any], lastIndex.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Quaternion]
  inline def unpackInterpolationResult(array: js.Array[Double], sourceArray: js.Array[Double], firstIndex: Unit, lastIndex: Double): Quaternion = (^.asInstanceOf[js.Dynamic].applyDynamic("unpackInterpolationResult")(array.asInstanceOf[js.Any], sourceArray.asInstanceOf[js.Any], firstIndex.asInstanceOf[js.Any], lastIndex.asInstanceOf[js.Any])).asInstanceOf[Quaternion]
  inline def unpackInterpolationResult(
    array: js.Array[Double],
    sourceArray: js.Array[Double],
    firstIndex: Unit,
    lastIndex: Double,
    result: Quaternion
  ): Quaternion = (^.asInstanceOf[js.Dynamic].applyDynamic("unpackInterpolationResult")(array.asInstanceOf[js.Any], sourceArray.asInstanceOf[js.Any], firstIndex.asInstanceOf[js.Any], lastIndex.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Quaternion]
  inline def unpackInterpolationResult(
    array: js.Array[Double],
    sourceArray: js.Array[Double],
    firstIndex: Unit,
    lastIndex: Unit,
    result: Quaternion
  ): Quaternion = (^.asInstanceOf[js.Dynamic].applyDynamic("unpackInterpolationResult")(array.asInstanceOf[js.Any], sourceArray.asInstanceOf[js.Any], firstIndex.asInstanceOf[js.Any], lastIndex.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Quaternion]
}
