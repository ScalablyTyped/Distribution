package typings
package cesiumLib.cesiumMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "Quaternion")
@js.native
class Quaternion ()
  extends cesiumLib.cesiumMod.CesiumNs.Quaternion {
  def this(x: scala.Double) = this()
  def this(x: scala.Double, y: scala.Double) = this()
  def this(x: scala.Double, y: scala.Double, z: scala.Double) = this()
  def this(x: scala.Double, y: scala.Double, z: scala.Double, w: scala.Double) = this()
}

/* static members */
@JSImport("cesium", "Quaternion")
@js.native
object Quaternion extends js.Object {
  var IDENTITY: cesiumLib.cesiumMod.CesiumNs.Quaternion = js.native
  var ZERO: cesiumLib.cesiumMod.CesiumNs.Quaternion = js.native
  var packedInterpolationLength: scala.Double = js.native
  def add(
    left: cesiumLib.cesiumMod.CesiumNs.Quaternion,
    right: cesiumLib.cesiumMod.CesiumNs.Quaternion,
    result: cesiumLib.cesiumMod.CesiumNs.Quaternion
  ): cesiumLib.cesiumMod.CesiumNs.Quaternion = js.native
  def clone(quaternion: cesiumLib.cesiumMod.CesiumNs.Quaternion): cesiumLib.cesiumMod.CesiumNs.Quaternion = js.native
  def clone(
    quaternion: cesiumLib.cesiumMod.CesiumNs.Quaternion,
    result: cesiumLib.cesiumMod.CesiumNs.Quaternion
  ): cesiumLib.cesiumMod.CesiumNs.Quaternion = js.native
  def computeAngle(quaternion: cesiumLib.cesiumMod.CesiumNs.Quaternion): scala.Double = js.native
  def computeAxis(
    quaternion: cesiumLib.cesiumMod.CesiumNs.Quaternion,
    result: cesiumLib.cesiumMod.CesiumNs.Cartesian3
  ): cesiumLib.cesiumMod.CesiumNs.Cartesian3 = js.native
  def computeInnerQuadrangle(
    q0: cesiumLib.cesiumMod.CesiumNs.Quaternion,
    q1: cesiumLib.cesiumMod.CesiumNs.Quaternion,
    q2: cesiumLib.cesiumMod.CesiumNs.Quaternion,
    result: cesiumLib.cesiumMod.CesiumNs.Quaternion
  ): cesiumLib.cesiumMod.CesiumNs.Quaternion = js.native
  def conjugate(
    quaternion: cesiumLib.cesiumMod.CesiumNs.Quaternion,
    result: cesiumLib.cesiumMod.CesiumNs.Quaternion
  ): cesiumLib.cesiumMod.CesiumNs.Quaternion = js.native
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
    quaternion: cesiumLib.cesiumMod.CesiumNs.Quaternion,
    scalar: scala.Double,
    result: cesiumLib.cesiumMod.CesiumNs.Quaternion
  ): cesiumLib.cesiumMod.CesiumNs.Quaternion = js.native
  def dot(left: cesiumLib.cesiumMod.CesiumNs.Quaternion, right: cesiumLib.cesiumMod.CesiumNs.Quaternion): scala.Double = js.native
  def equals(): scala.Boolean = js.native
  def equals(left: cesiumLib.cesiumMod.CesiumNs.Quaternion): scala.Boolean = js.native
  def equals(left: cesiumLib.cesiumMod.CesiumNs.Quaternion, right: cesiumLib.cesiumMod.CesiumNs.Quaternion): scala.Boolean = js.native
  def equalsEpsilon(
    left: cesiumLib.cesiumMod.CesiumNs.Quaternion,
    right: cesiumLib.cesiumMod.CesiumNs.Quaternion,
    epsilon: scala.Double
  ): scala.Boolean = js.native
  def exp(
    cartesian: cesiumLib.cesiumMod.CesiumNs.Cartesian3,
    result: cesiumLib.cesiumMod.CesiumNs.Quaternion
  ): cesiumLib.cesiumMod.CesiumNs.Quaternion = js.native
  def fastSlerp(
    start: cesiumLib.cesiumMod.CesiumNs.Quaternion,
    end: cesiumLib.cesiumMod.CesiumNs.Quaternion,
    t: scala.Double,
    result: cesiumLib.cesiumMod.CesiumNs.Quaternion
  ): cesiumLib.cesiumMod.CesiumNs.Quaternion = js.native
  def fastSquad(
    q0: cesiumLib.cesiumMod.CesiumNs.Quaternion,
    q1: cesiumLib.cesiumMod.CesiumNs.Quaternion,
    s0: cesiumLib.cesiumMod.CesiumNs.Quaternion,
    s1: cesiumLib.cesiumMod.CesiumNs.Quaternion,
    t: scala.Double
  ): cesiumLib.cesiumMod.CesiumNs.Quaternion = js.native
  def fastSquad(
    q0: cesiumLib.cesiumMod.CesiumNs.Quaternion,
    q1: cesiumLib.cesiumMod.CesiumNs.Quaternion,
    s0: cesiumLib.cesiumMod.CesiumNs.Quaternion,
    s1: cesiumLib.cesiumMod.CesiumNs.Quaternion,
    t: scala.Double,
    result: cesiumLib.cesiumMod.CesiumNs.Quaternion
  ): cesiumLib.cesiumMod.CesiumNs.Quaternion = js.native
  def fromAxisAngle(axis: cesiumLib.cesiumMod.CesiumNs.Cartesian3, angle: scala.Double): cesiumLib.cesiumMod.CesiumNs.Quaternion = js.native
  def fromAxisAngle(
    axis: cesiumLib.cesiumMod.CesiumNs.Cartesian3,
    angle: scala.Double,
    result: cesiumLib.cesiumMod.CesiumNs.Quaternion
  ): cesiumLib.cesiumMod.CesiumNs.Quaternion = js.native
  def fromHeadingPitchRoll(headingPitchRoll: cesiumLib.cesiumMod.CesiumNs.HeadingPitchRoll): cesiumLib.cesiumMod.CesiumNs.Quaternion = js.native
  def fromHeadingPitchRoll(
    headingPitchRoll: cesiumLib.cesiumMod.CesiumNs.HeadingPitchRoll,
    result: cesiumLib.cesiumMod.CesiumNs.Quaternion
  ): cesiumLib.cesiumMod.CesiumNs.Quaternion = js.native
  def fromRotationMatrix(matrix: cesiumLib.cesiumMod.CesiumNs.Matrix3): cesiumLib.cesiumMod.CesiumNs.Quaternion = js.native
  def fromRotationMatrix(matrix: cesiumLib.cesiumMod.CesiumNs.Matrix3, result: cesiumLib.cesiumMod.CesiumNs.Quaternion): cesiumLib.cesiumMod.CesiumNs.Quaternion = js.native
  def inverse(
    quaternion: cesiumLib.cesiumMod.CesiumNs.Quaternion,
    result: cesiumLib.cesiumMod.CesiumNs.Quaternion
  ): cesiumLib.cesiumMod.CesiumNs.Quaternion = js.native
  def lerp(
    start: cesiumLib.cesiumMod.CesiumNs.Quaternion,
    end: cesiumLib.cesiumMod.CesiumNs.Quaternion,
    t: scala.Double,
    result: cesiumLib.cesiumMod.CesiumNs.Quaternion
  ): cesiumLib.cesiumMod.CesiumNs.Quaternion = js.native
  def log(
    quaternion: cesiumLib.cesiumMod.CesiumNs.Quaternion,
    result: cesiumLib.cesiumMod.CesiumNs.Cartesian3
  ): cesiumLib.cesiumMod.CesiumNs.Cartesian3 = js.native
  def magnitude(quaternion: cesiumLib.cesiumMod.CesiumNs.Quaternion): scala.Double = js.native
  def magnitudeSquared(quaternion: cesiumLib.cesiumMod.CesiumNs.Quaternion): scala.Double = js.native
  def multiply(
    left: cesiumLib.cesiumMod.CesiumNs.Quaternion,
    right: cesiumLib.cesiumMod.CesiumNs.Quaternion,
    result: cesiumLib.cesiumMod.CesiumNs.Quaternion
  ): cesiumLib.cesiumMod.CesiumNs.Quaternion = js.native
  def multiplyByScalar(
    quaternion: cesiumLib.cesiumMod.CesiumNs.Quaternion,
    scalar: scala.Double,
    result: cesiumLib.cesiumMod.CesiumNs.Quaternion
  ): cesiumLib.cesiumMod.CesiumNs.Quaternion = js.native
  def negate(
    quaternion: cesiumLib.cesiumMod.CesiumNs.Quaternion,
    result: cesiumLib.cesiumMod.CesiumNs.Quaternion
  ): cesiumLib.cesiumMod.CesiumNs.Quaternion = js.native
  def normalize(
    quaternion: cesiumLib.cesiumMod.CesiumNs.Quaternion,
    result: cesiumLib.cesiumMod.CesiumNs.Quaternion
  ): cesiumLib.cesiumMod.CesiumNs.Quaternion = js.native
  def pack(value: cesiumLib.cesiumMod.CesiumNs.Quaternion, array: js.Array[scala.Double]): js.Array[scala.Double] = js.native
  def pack(
    value: cesiumLib.cesiumMod.CesiumNs.Quaternion,
    array: js.Array[scala.Double],
    startingIndex: scala.Double
  ): js.Array[scala.Double] = js.native
  def slerp(
    start: cesiumLib.cesiumMod.CesiumNs.Quaternion,
    end: cesiumLib.cesiumMod.CesiumNs.Quaternion,
    t: scala.Double,
    result: cesiumLib.cesiumMod.CesiumNs.Quaternion
  ): cesiumLib.cesiumMod.CesiumNs.Quaternion = js.native
  def squad(
    q0: cesiumLib.cesiumMod.CesiumNs.Quaternion,
    q1: cesiumLib.cesiumMod.CesiumNs.Quaternion,
    s0: cesiumLib.cesiumMod.CesiumNs.Quaternion,
    s1: cesiumLib.cesiumMod.CesiumNs.Quaternion,
    t: scala.Double,
    result: cesiumLib.cesiumMod.CesiumNs.Quaternion
  ): cesiumLib.cesiumMod.CesiumNs.Quaternion = js.native
  def subtract(
    left: cesiumLib.cesiumMod.CesiumNs.Quaternion,
    right: cesiumLib.cesiumMod.CesiumNs.Quaternion,
    result: cesiumLib.cesiumMod.CesiumNs.Quaternion
  ): cesiumLib.cesiumMod.CesiumNs.Quaternion = js.native
  def unpack(array: js.Array[scala.Double]): cesiumLib.cesiumMod.CesiumNs.Quaternion = js.native
  def unpack(array: js.Array[scala.Double], startingIndex: scala.Double): cesiumLib.cesiumMod.CesiumNs.Quaternion = js.native
  def unpack(
    array: js.Array[scala.Double],
    startingIndex: scala.Double,
    result: cesiumLib.cesiumMod.CesiumNs.Quaternion
  ): cesiumLib.cesiumMod.CesiumNs.Quaternion = js.native
  def unpackInterpolationResult(array: js.Array[scala.Double], sourceArray: js.Array[scala.Double]): cesiumLib.cesiumMod.CesiumNs.Quaternion = js.native
  def unpackInterpolationResult(array: js.Array[scala.Double], sourceArray: js.Array[scala.Double], startingIndex: scala.Double): cesiumLib.cesiumMod.CesiumNs.Quaternion = js.native
  def unpackInterpolationResult(
    array: js.Array[scala.Double],
    sourceArray: js.Array[scala.Double],
    startingIndex: scala.Double,
    lastIndex: scala.Double
  ): cesiumLib.cesiumMod.CesiumNs.Quaternion = js.native
  def unpackInterpolationResult(
    array: js.Array[scala.Double],
    sourceArray: js.Array[scala.Double],
    startingIndex: scala.Double,
    lastIndex: scala.Double,
    result: cesiumLib.cesiumMod.CesiumNs.Quaternion
  ): cesiumLib.cesiumMod.CesiumNs.Quaternion = js.native
}

