package typings.cesium.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cesium", "Quaternion")
@js.native
class Quaternion () extends Packable {
  def this(x: Double) = this()
  def this(x: js.UndefOr[scala.Nothing], y: Double) = this()
  def this(x: Double, y: Double) = this()
  def this(x: js.UndefOr[scala.Nothing], y: js.UndefOr[scala.Nothing], z: Double) = this()
  def this(x: js.UndefOr[scala.Nothing], y: Double, z: Double) = this()
  def this(x: Double, y: js.UndefOr[scala.Nothing], z: Double) = this()
  def this(x: Double, y: Double, z: Double) = this()
  def this(
    x: js.UndefOr[scala.Nothing],
    y: js.UndefOr[scala.Nothing],
    z: js.UndefOr[scala.Nothing],
    w: Double
  ) = this()
  def this(x: js.UndefOr[scala.Nothing], y: js.UndefOr[scala.Nothing], z: Double, w: Double) = this()
  def this(x: js.UndefOr[scala.Nothing], y: Double, z: js.UndefOr[scala.Nothing], w: Double) = this()
  def this(x: js.UndefOr[scala.Nothing], y: Double, z: Double, w: Double) = this()
  def this(x: Double, y: js.UndefOr[scala.Nothing], z: js.UndefOr[scala.Nothing], w: Double) = this()
  def this(x: Double, y: js.UndefOr[scala.Nothing], z: Double, w: Double) = this()
  def this(x: Double, y: Double, z: js.UndefOr[scala.Nothing], w: Double) = this()
  def this(x: Double, y: Double, z: Double, w: Double) = this()
  
  def clone(result: Quaternion): Quaternion = js.native
  
  def equals(): Boolean = js.native
  def equals(right: Quaternion): Boolean = js.native
  
  def equalsEpsilon(right: Quaternion, epsilon: Double): Boolean = js.native
  
  var w: Double = js.native
  
  var x: Double = js.native
  
  var y: Double = js.native
  
  var z: Double = js.native
}
/* static members */
@JSImport("cesium", "Quaternion")
@js.native
object Quaternion extends js.Object {
  
  var IDENTITY: Quaternion = js.native
  
  var ZERO: Quaternion = js.native
  
  def add(left: Quaternion, right: Quaternion, result: Quaternion): Quaternion = js.native
  
  def clone(quaternion: Quaternion): Quaternion = js.native
  def clone(quaternion: Quaternion, result: Quaternion): Quaternion = js.native
  
  def computeAngle(quaternion: Quaternion): Double = js.native
  
  def computeAxis(quaternion: Quaternion, result: Cartesian3): Cartesian3 = js.native
  
  def computeInnerQuadrangle(q0: Quaternion, q1: Quaternion, q2: Quaternion, result: Quaternion): Quaternion = js.native
  
  def conjugate(quaternion: Quaternion, result: Quaternion): Quaternion = js.native
  
  def convertPackedArrayForInterpolation(packedArray: js.Array[Double]): Unit = js.native
  def convertPackedArrayForInterpolation(
    packedArray: js.Array[Double],
    startingIndex: js.UndefOr[scala.Nothing],
    lastIndex: js.UndefOr[scala.Nothing],
    result: js.Array[Double]
  ): Unit = js.native
  def convertPackedArrayForInterpolation(packedArray: js.Array[Double], startingIndex: js.UndefOr[scala.Nothing], lastIndex: Double): Unit = js.native
  def convertPackedArrayForInterpolation(
    packedArray: js.Array[Double],
    startingIndex: js.UndefOr[scala.Nothing],
    lastIndex: Double,
    result: js.Array[Double]
  ): Unit = js.native
  def convertPackedArrayForInterpolation(packedArray: js.Array[Double], startingIndex: Double): Unit = js.native
  def convertPackedArrayForInterpolation(
    packedArray: js.Array[Double],
    startingIndex: Double,
    lastIndex: js.UndefOr[scala.Nothing],
    result: js.Array[Double]
  ): Unit = js.native
  def convertPackedArrayForInterpolation(packedArray: js.Array[Double], startingIndex: Double, lastIndex: Double): Unit = js.native
  def convertPackedArrayForInterpolation(packedArray: js.Array[Double], startingIndex: Double, lastIndex: Double, result: js.Array[Double]): Unit = js.native
  
  def divideByScalar(quaternion: Quaternion, scalar: Double, result: Quaternion): Quaternion = js.native
  
  def dot(left: Quaternion, right: Quaternion): Double = js.native
  
  def equals(): Boolean = js.native
  def equals(left: js.UndefOr[scala.Nothing], right: Quaternion): Boolean = js.native
  def equals(left: Quaternion): Boolean = js.native
  def equals(left: Quaternion, right: Quaternion): Boolean = js.native
  
  def equalsEpsilon(left: Quaternion, right: Quaternion, epsilon: Double): Boolean = js.native
  
  def exp(cartesian: Cartesian3, result: Quaternion): Quaternion = js.native
  
  def fastSlerp(start: Quaternion, end: Quaternion, t: Double, result: Quaternion): Quaternion = js.native
  
  def fastSquad(q0: Quaternion, q1: Quaternion, s0: Quaternion, s1: Quaternion, t: Double): Quaternion = js.native
  def fastSquad(q0: Quaternion, q1: Quaternion, s0: Quaternion, s1: Quaternion, t: Double, result: Quaternion): Quaternion = js.native
  
  def fromAxisAngle(axis: Cartesian3, angle: Double): Quaternion = js.native
  def fromAxisAngle(axis: Cartesian3, angle: Double, result: Quaternion): Quaternion = js.native
  
  def fromHeadingPitchRoll(headingPitchRoll: HeadingPitchRoll): Quaternion = js.native
  def fromHeadingPitchRoll(headingPitchRoll: HeadingPitchRoll, result: Quaternion): Quaternion = js.native
  
  def fromRotationMatrix(matrix: Matrix3): Quaternion = js.native
  def fromRotationMatrix(matrix: Matrix3, result: Quaternion): Quaternion = js.native
  
  def inverse(quaternion: Quaternion, result: Quaternion): Quaternion = js.native
  
  def lerp(start: Quaternion, end: Quaternion, t: Double, result: Quaternion): Quaternion = js.native
  
  def log(quaternion: Quaternion, result: Cartesian3): Cartesian3 = js.native
  
  def magnitude(quaternion: Quaternion): Double = js.native
  
  def magnitudeSquared(quaternion: Quaternion): Double = js.native
  
  def multiply(left: Quaternion, right: Quaternion, result: Quaternion): Quaternion = js.native
  
  def multiplyByScalar(quaternion: Quaternion, scalar: Double, result: Quaternion): Quaternion = js.native
  
  def negate(quaternion: Quaternion, result: Quaternion): Quaternion = js.native
  
  def normalize(quaternion: Quaternion, result: Quaternion): Quaternion = js.native
  
  def pack(value: Quaternion, array: js.Array[Double]): js.Array[Double] = js.native
  def pack(value: Quaternion, array: js.Array[Double], startingIndex: Double): js.Array[Double] = js.native
  
  var packedInterpolationLength: Double = js.native
  
  def slerp(start: Quaternion, end: Quaternion, t: Double, result: Quaternion): Quaternion = js.native
  
  def squad(q0: Quaternion, q1: Quaternion, s0: Quaternion, s1: Quaternion, t: Double, result: Quaternion): Quaternion = js.native
  
  def subtract(left: Quaternion, right: Quaternion, result: Quaternion): Quaternion = js.native
  
  def unpack(array: js.Array[Double]): Quaternion = js.native
  def unpack(array: js.Array[Double], startingIndex: js.UndefOr[scala.Nothing], result: Quaternion): Quaternion = js.native
  def unpack(array: js.Array[Double], startingIndex: Double): Quaternion = js.native
  def unpack(array: js.Array[Double], startingIndex: Double, result: Quaternion): Quaternion = js.native
  
  def unpackInterpolationResult(array: js.Array[Double], sourceArray: js.Array[Double]): Quaternion = js.native
  def unpackInterpolationResult(
    array: js.Array[Double],
    sourceArray: js.Array[Double],
    startingIndex: js.UndefOr[scala.Nothing],
    lastIndex: js.UndefOr[scala.Nothing],
    result: Quaternion
  ): Quaternion = js.native
  def unpackInterpolationResult(
    array: js.Array[Double],
    sourceArray: js.Array[Double],
    startingIndex: js.UndefOr[scala.Nothing],
    lastIndex: Double
  ): Quaternion = js.native
  def unpackInterpolationResult(
    array: js.Array[Double],
    sourceArray: js.Array[Double],
    startingIndex: js.UndefOr[scala.Nothing],
    lastIndex: Double,
    result: Quaternion
  ): Quaternion = js.native
  def unpackInterpolationResult(array: js.Array[Double], sourceArray: js.Array[Double], startingIndex: Double): Quaternion = js.native
  def unpackInterpolationResult(
    array: js.Array[Double],
    sourceArray: js.Array[Double],
    startingIndex: Double,
    lastIndex: js.UndefOr[scala.Nothing],
    result: Quaternion
  ): Quaternion = js.native
  def unpackInterpolationResult(array: js.Array[Double], sourceArray: js.Array[Double], startingIndex: Double, lastIndex: Double): Quaternion = js.native
  def unpackInterpolationResult(
    array: js.Array[Double],
    sourceArray: js.Array[Double],
    startingIndex: Double,
    lastIndex: Double,
    result: Quaternion
  ): Quaternion = js.native
}
