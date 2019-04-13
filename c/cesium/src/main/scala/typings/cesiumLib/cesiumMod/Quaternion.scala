package typings
package cesiumLib.cesiumMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "Quaternion")
@js.native
class Quaternion () extends Packable {
  def this(x: scala.Double) = this()
  def this(x: scala.Double, y: scala.Double) = this()
  def this(x: scala.Double, y: scala.Double, z: scala.Double) = this()
  def this(x: scala.Double, y: scala.Double, z: scala.Double, w: scala.Double) = this()
  var w: scala.Double = js.native
  var x: scala.Double = js.native
  var y: scala.Double = js.native
  var z: scala.Double = js.native
  def clone(result: Quaternion): Quaternion = js.native
  def equals(): scala.Boolean = js.native
  def equals(right: Quaternion): scala.Boolean = js.native
  def equalsEpsilon(right: Quaternion, epsilon: scala.Double): scala.Boolean = js.native
}

/* static members */
@JSImport("cesium", "Quaternion")
@js.native
object Quaternion extends js.Object {
  var IDENTITY: cesiumLib.cesiumMod.Quaternion = js.native
  var ZERO: cesiumLib.cesiumMod.Quaternion = js.native
  var packedInterpolationLength: scala.Double = js.native
  def add(
    left: cesiumLib.cesiumMod.Quaternion,
    right: cesiumLib.cesiumMod.Quaternion,
    result: cesiumLib.cesiumMod.Quaternion
  ): cesiumLib.cesiumMod.Quaternion = js.native
  def clone(quaternion: cesiumLib.cesiumMod.Quaternion): cesiumLib.cesiumMod.Quaternion = js.native
  def clone(quaternion: cesiumLib.cesiumMod.Quaternion, result: cesiumLib.cesiumMod.Quaternion): cesiumLib.cesiumMod.Quaternion = js.native
  def computeAngle(quaternion: cesiumLib.cesiumMod.Quaternion): scala.Double = js.native
  def computeAxis(quaternion: cesiumLib.cesiumMod.Quaternion, result: cesiumLib.cesiumMod.Cartesian3): cesiumLib.cesiumMod.Cartesian3 = js.native
  def computeInnerQuadrangle(
    q0: cesiumLib.cesiumMod.Quaternion,
    q1: cesiumLib.cesiumMod.Quaternion,
    q2: cesiumLib.cesiumMod.Quaternion,
    result: cesiumLib.cesiumMod.Quaternion
  ): cesiumLib.cesiumMod.Quaternion = js.native
  def conjugate(quaternion: cesiumLib.cesiumMod.Quaternion, result: cesiumLib.cesiumMod.Quaternion): cesiumLib.cesiumMod.Quaternion = js.native
  def convertPackedArrayForInterpolation(packedArray: js.Array[scala.Double]): scala.Unit = js.native
  def convertPackedArrayForInterpolation(packedArray: js.Array[scala.Double], startingIndex: scala.Double): scala.Unit = js.native
  def convertPackedArrayForInterpolation(packedArray: js.Array[scala.Double], startingIndex: scala.Double, lastIndex: scala.Double): scala.Unit = js.native
  def convertPackedArrayForInterpolation(
    packedArray: js.Array[scala.Double],
    startingIndex: scala.Double,
    lastIndex: scala.Double,
    result: js.Array[scala.Double]
  ): scala.Unit = js.native
  def divideByScalar(
    quaternion: cesiumLib.cesiumMod.Quaternion,
    scalar: scala.Double,
    result: cesiumLib.cesiumMod.Quaternion
  ): cesiumLib.cesiumMod.Quaternion = js.native
  def dot(left: cesiumLib.cesiumMod.Quaternion, right: cesiumLib.cesiumMod.Quaternion): scala.Double = js.native
  def equals(): scala.Boolean = js.native
  def equals(left: cesiumLib.cesiumMod.Quaternion): scala.Boolean = js.native
  def equals(left: cesiumLib.cesiumMod.Quaternion, right: cesiumLib.cesiumMod.Quaternion): scala.Boolean = js.native
  def equalsEpsilon(left: cesiumLib.cesiumMod.Quaternion, right: cesiumLib.cesiumMod.Quaternion, epsilon: scala.Double): scala.Boolean = js.native
  def exp(cartesian: cesiumLib.cesiumMod.Cartesian3, result: cesiumLib.cesiumMod.Quaternion): cesiumLib.cesiumMod.Quaternion = js.native
  def fastSlerp(
    start: cesiumLib.cesiumMod.Quaternion,
    end: cesiumLib.cesiumMod.Quaternion,
    t: scala.Double,
    result: cesiumLib.cesiumMod.Quaternion
  ): cesiumLib.cesiumMod.Quaternion = js.native
  def fastSquad(
    q0: cesiumLib.cesiumMod.Quaternion,
    q1: cesiumLib.cesiumMod.Quaternion,
    s0: cesiumLib.cesiumMod.Quaternion,
    s1: cesiumLib.cesiumMod.Quaternion,
    t: scala.Double
  ): cesiumLib.cesiumMod.Quaternion = js.native
  def fastSquad(
    q0: cesiumLib.cesiumMod.Quaternion,
    q1: cesiumLib.cesiumMod.Quaternion,
    s0: cesiumLib.cesiumMod.Quaternion,
    s1: cesiumLib.cesiumMod.Quaternion,
    t: scala.Double,
    result: cesiumLib.cesiumMod.Quaternion
  ): cesiumLib.cesiumMod.Quaternion = js.native
  def fromAxisAngle(axis: cesiumLib.cesiumMod.Cartesian3, angle: scala.Double): cesiumLib.cesiumMod.Quaternion = js.native
  def fromAxisAngle(axis: cesiumLib.cesiumMod.Cartesian3, angle: scala.Double, result: cesiumLib.cesiumMod.Quaternion): cesiumLib.cesiumMod.Quaternion = js.native
  def fromHeadingPitchRoll(headingPitchRoll: cesiumLib.cesiumMod.HeadingPitchRoll): cesiumLib.cesiumMod.Quaternion = js.native
  def fromHeadingPitchRoll(headingPitchRoll: cesiumLib.cesiumMod.HeadingPitchRoll, result: cesiumLib.cesiumMod.Quaternion): cesiumLib.cesiumMod.Quaternion = js.native
  def fromRotationMatrix(matrix: cesiumLib.cesiumMod.Matrix3): cesiumLib.cesiumMod.Quaternion = js.native
  def fromRotationMatrix(matrix: cesiumLib.cesiumMod.Matrix3, result: cesiumLib.cesiumMod.Quaternion): cesiumLib.cesiumMod.Quaternion = js.native
  def inverse(quaternion: cesiumLib.cesiumMod.Quaternion, result: cesiumLib.cesiumMod.Quaternion): cesiumLib.cesiumMod.Quaternion = js.native
  def lerp(
    start: cesiumLib.cesiumMod.Quaternion,
    end: cesiumLib.cesiumMod.Quaternion,
    t: scala.Double,
    result: cesiumLib.cesiumMod.Quaternion
  ): cesiumLib.cesiumMod.Quaternion = js.native
  def log(quaternion: cesiumLib.cesiumMod.Quaternion, result: cesiumLib.cesiumMod.Cartesian3): cesiumLib.cesiumMod.Cartesian3 = js.native
  def magnitude(quaternion: cesiumLib.cesiumMod.Quaternion): scala.Double = js.native
  def magnitudeSquared(quaternion: cesiumLib.cesiumMod.Quaternion): scala.Double = js.native
  def multiply(
    left: cesiumLib.cesiumMod.Quaternion,
    right: cesiumLib.cesiumMod.Quaternion,
    result: cesiumLib.cesiumMod.Quaternion
  ): cesiumLib.cesiumMod.Quaternion = js.native
  def multiplyByScalar(
    quaternion: cesiumLib.cesiumMod.Quaternion,
    scalar: scala.Double,
    result: cesiumLib.cesiumMod.Quaternion
  ): cesiumLib.cesiumMod.Quaternion = js.native
  def negate(quaternion: cesiumLib.cesiumMod.Quaternion, result: cesiumLib.cesiumMod.Quaternion): cesiumLib.cesiumMod.Quaternion = js.native
  def normalize(quaternion: cesiumLib.cesiumMod.Quaternion, result: cesiumLib.cesiumMod.Quaternion): cesiumLib.cesiumMod.Quaternion = js.native
  def pack(value: cesiumLib.cesiumMod.Quaternion, array: js.Array[scala.Double]): js.Array[scala.Double] = js.native
  def pack(value: cesiumLib.cesiumMod.Quaternion, array: js.Array[scala.Double], startingIndex: scala.Double): js.Array[scala.Double] = js.native
  def slerp(
    start: cesiumLib.cesiumMod.Quaternion,
    end: cesiumLib.cesiumMod.Quaternion,
    t: scala.Double,
    result: cesiumLib.cesiumMod.Quaternion
  ): cesiumLib.cesiumMod.Quaternion = js.native
  def squad(
    q0: cesiumLib.cesiumMod.Quaternion,
    q1: cesiumLib.cesiumMod.Quaternion,
    s0: cesiumLib.cesiumMod.Quaternion,
    s1: cesiumLib.cesiumMod.Quaternion,
    t: scala.Double,
    result: cesiumLib.cesiumMod.Quaternion
  ): cesiumLib.cesiumMod.Quaternion = js.native
  def subtract(
    left: cesiumLib.cesiumMod.Quaternion,
    right: cesiumLib.cesiumMod.Quaternion,
    result: cesiumLib.cesiumMod.Quaternion
  ): cesiumLib.cesiumMod.Quaternion = js.native
  def unpack(array: js.Array[scala.Double]): cesiumLib.cesiumMod.Quaternion = js.native
  def unpack(array: js.Array[scala.Double], startingIndex: scala.Double): cesiumLib.cesiumMod.Quaternion = js.native
  def unpack(array: js.Array[scala.Double], startingIndex: scala.Double, result: cesiumLib.cesiumMod.Quaternion): cesiumLib.cesiumMod.Quaternion = js.native
  def unpackInterpolationResult(array: js.Array[scala.Double], sourceArray: js.Array[scala.Double]): cesiumLib.cesiumMod.Quaternion = js.native
  def unpackInterpolationResult(array: js.Array[scala.Double], sourceArray: js.Array[scala.Double], startingIndex: scala.Double): cesiumLib.cesiumMod.Quaternion = js.native
  def unpackInterpolationResult(
    array: js.Array[scala.Double],
    sourceArray: js.Array[scala.Double],
    startingIndex: scala.Double,
    lastIndex: scala.Double
  ): cesiumLib.cesiumMod.Quaternion = js.native
  def unpackInterpolationResult(
    array: js.Array[scala.Double],
    sourceArray: js.Array[scala.Double],
    startingIndex: scala.Double,
    lastIndex: scala.Double,
    result: cesiumLib.cesiumMod.Quaternion
  ): cesiumLib.cesiumMod.Quaternion = js.native
}

