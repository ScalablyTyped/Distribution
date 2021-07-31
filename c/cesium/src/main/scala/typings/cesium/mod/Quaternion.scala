package typings.cesium.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cesium", "Quaternion")
@js.native
class Quaternion () extends Packable {
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
  
  def equals(): Boolean = js.native
  def equals(right: Quaternion): Boolean = js.native
  
  def equalsEpsilon(right: Quaternion, epsilon: Double): Boolean = js.native
  
  var w: Double = js.native
  
  var x: Double = js.native
  
  var y: Double = js.native
  
  var z: Double = js.native
}
object Quaternion {
  
  @JSImport("cesium", "Quaternion")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("cesium", "Quaternion.IDENTITY")
  @js.native
  def IDENTITY: Quaternion = js.native
  @scala.inline
  def IDENTITY_=(x: Quaternion): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("IDENTITY")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("cesium", "Quaternion.ZERO")
  @js.native
  def ZERO: Quaternion = js.native
  @scala.inline
  def ZERO_=(x: Quaternion): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ZERO")(x.asInstanceOf[js.Any])
  
  /* static member */
  @scala.inline
  def add(left: Quaternion, right: Quaternion, result: Quaternion): Quaternion = (^.asInstanceOf[js.Dynamic].applyDynamic("add")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Quaternion]
  
  /* static member */
  @scala.inline
  def clone_(quaternion: Quaternion): Quaternion = ^.asInstanceOf[js.Dynamic].applyDynamic("clone")(quaternion.asInstanceOf[js.Any]).asInstanceOf[Quaternion]
  @scala.inline
  def clone_(quaternion: Quaternion, result: Quaternion): Quaternion = (^.asInstanceOf[js.Dynamic].applyDynamic("clone")(quaternion.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Quaternion]
  
  /* static member */
  @scala.inline
  def computeAngle(quaternion: Quaternion): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("computeAngle")(quaternion.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  /* static member */
  @scala.inline
  def computeAxis(quaternion: Quaternion, result: Cartesian3): Cartesian3 = (^.asInstanceOf[js.Dynamic].applyDynamic("computeAxis")(quaternion.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Cartesian3]
  
  /* static member */
  @scala.inline
  def computeInnerQuadrangle(q0: Quaternion, q1: Quaternion, q2: Quaternion, result: Quaternion): Quaternion = (^.asInstanceOf[js.Dynamic].applyDynamic("computeInnerQuadrangle")(q0.asInstanceOf[js.Any], q1.asInstanceOf[js.Any], q2.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Quaternion]
  
  /* static member */
  @scala.inline
  def conjugate(quaternion: Quaternion, result: Quaternion): Quaternion = (^.asInstanceOf[js.Dynamic].applyDynamic("conjugate")(quaternion.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Quaternion]
  
  /* static member */
  @scala.inline
  def convertPackedArrayForInterpolation(packedArray: js.Array[Double]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("convertPackedArrayForInterpolation")(packedArray.asInstanceOf[js.Any]).asInstanceOf[Unit]
  @scala.inline
  def convertPackedArrayForInterpolation(packedArray: js.Array[Double], startingIndex: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("convertPackedArrayForInterpolation")(packedArray.asInstanceOf[js.Any], startingIndex.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def convertPackedArrayForInterpolation(packedArray: js.Array[Double], startingIndex: Double, lastIndex: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("convertPackedArrayForInterpolation")(packedArray.asInstanceOf[js.Any], startingIndex.asInstanceOf[js.Any], lastIndex.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def convertPackedArrayForInterpolation(packedArray: js.Array[Double], startingIndex: Double, lastIndex: Double, result: js.Array[Double]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("convertPackedArrayForInterpolation")(packedArray.asInstanceOf[js.Any], startingIndex.asInstanceOf[js.Any], lastIndex.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def convertPackedArrayForInterpolation(packedArray: js.Array[Double], startingIndex: Double, lastIndex: Unit, result: js.Array[Double]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("convertPackedArrayForInterpolation")(packedArray.asInstanceOf[js.Any], startingIndex.asInstanceOf[js.Any], lastIndex.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def convertPackedArrayForInterpolation(packedArray: js.Array[Double], startingIndex: Unit, lastIndex: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("convertPackedArrayForInterpolation")(packedArray.asInstanceOf[js.Any], startingIndex.asInstanceOf[js.Any], lastIndex.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def convertPackedArrayForInterpolation(packedArray: js.Array[Double], startingIndex: Unit, lastIndex: Double, result: js.Array[Double]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("convertPackedArrayForInterpolation")(packedArray.asInstanceOf[js.Any], startingIndex.asInstanceOf[js.Any], lastIndex.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def convertPackedArrayForInterpolation(packedArray: js.Array[Double], startingIndex: Unit, lastIndex: Unit, result: js.Array[Double]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("convertPackedArrayForInterpolation")(packedArray.asInstanceOf[js.Any], startingIndex.asInstanceOf[js.Any], lastIndex.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /* static member */
  @scala.inline
  def divideByScalar(quaternion: Quaternion, scalar: Double, result: Quaternion): Quaternion = (^.asInstanceOf[js.Dynamic].applyDynamic("divideByScalar")(quaternion.asInstanceOf[js.Any], scalar.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Quaternion]
  
  /* static member */
  @scala.inline
  def dot(left: Quaternion, right: Quaternion): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("dot")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  /* static member */
  @scala.inline
  def equalsEpsilon(left: Quaternion, right: Quaternion, epsilon: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equalsEpsilon")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any], epsilon.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  /* static member */
  @scala.inline
  def equals_(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("equals")().asInstanceOf[Boolean]
  @scala.inline
  def equals_(left: Unit, right: Quaternion): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  @scala.inline
  def equals_(left: Quaternion): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("equals")(left.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  @scala.inline
  def equals_(left: Quaternion, right: Quaternion): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  /* static member */
  @scala.inline
  def exp(cartesian: Cartesian3, result: Quaternion): Quaternion = (^.asInstanceOf[js.Dynamic].applyDynamic("exp")(cartesian.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Quaternion]
  
  /* static member */
  @scala.inline
  def fastSlerp(start: Quaternion, end: Quaternion, t: Double, result: Quaternion): Quaternion = (^.asInstanceOf[js.Dynamic].applyDynamic("fastSlerp")(start.asInstanceOf[js.Any], end.asInstanceOf[js.Any], t.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Quaternion]
  
  /* static member */
  @scala.inline
  def fastSquad(q0: Quaternion, q1: Quaternion, s0: Quaternion, s1: Quaternion, t: Double): Quaternion = (^.asInstanceOf[js.Dynamic].applyDynamic("fastSquad")(q0.asInstanceOf[js.Any], q1.asInstanceOf[js.Any], s0.asInstanceOf[js.Any], s1.asInstanceOf[js.Any], t.asInstanceOf[js.Any])).asInstanceOf[Quaternion]
  @scala.inline
  def fastSquad(q0: Quaternion, q1: Quaternion, s0: Quaternion, s1: Quaternion, t: Double, result: Quaternion): Quaternion = (^.asInstanceOf[js.Dynamic].applyDynamic("fastSquad")(q0.asInstanceOf[js.Any], q1.asInstanceOf[js.Any], s0.asInstanceOf[js.Any], s1.asInstanceOf[js.Any], t.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Quaternion]
  
  /* static member */
  @scala.inline
  def fromAxisAngle(axis: Cartesian3, angle: Double): Quaternion = (^.asInstanceOf[js.Dynamic].applyDynamic("fromAxisAngle")(axis.asInstanceOf[js.Any], angle.asInstanceOf[js.Any])).asInstanceOf[Quaternion]
  @scala.inline
  def fromAxisAngle(axis: Cartesian3, angle: Double, result: Quaternion): Quaternion = (^.asInstanceOf[js.Dynamic].applyDynamic("fromAxisAngle")(axis.asInstanceOf[js.Any], angle.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Quaternion]
  
  /* static member */
  @scala.inline
  def fromHeadingPitchRoll(headingPitchRoll: HeadingPitchRoll): Quaternion = ^.asInstanceOf[js.Dynamic].applyDynamic("fromHeadingPitchRoll")(headingPitchRoll.asInstanceOf[js.Any]).asInstanceOf[Quaternion]
  @scala.inline
  def fromHeadingPitchRoll(headingPitchRoll: HeadingPitchRoll, result: Quaternion): Quaternion = (^.asInstanceOf[js.Dynamic].applyDynamic("fromHeadingPitchRoll")(headingPitchRoll.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Quaternion]
  
  /* static member */
  @scala.inline
  def fromRotationMatrix(matrix: Matrix3): Quaternion = ^.asInstanceOf[js.Dynamic].applyDynamic("fromRotationMatrix")(matrix.asInstanceOf[js.Any]).asInstanceOf[Quaternion]
  @scala.inline
  def fromRotationMatrix(matrix: Matrix3, result: Quaternion): Quaternion = (^.asInstanceOf[js.Dynamic].applyDynamic("fromRotationMatrix")(matrix.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Quaternion]
  
  /* static member */
  @scala.inline
  def inverse(quaternion: Quaternion, result: Quaternion): Quaternion = (^.asInstanceOf[js.Dynamic].applyDynamic("inverse")(quaternion.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Quaternion]
  
  /* static member */
  @scala.inline
  def lerp(start: Quaternion, end: Quaternion, t: Double, result: Quaternion): Quaternion = (^.asInstanceOf[js.Dynamic].applyDynamic("lerp")(start.asInstanceOf[js.Any], end.asInstanceOf[js.Any], t.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Quaternion]
  
  /* static member */
  @scala.inline
  def log(quaternion: Quaternion, result: Cartesian3): Cartesian3 = (^.asInstanceOf[js.Dynamic].applyDynamic("log")(quaternion.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Cartesian3]
  
  /* static member */
  @scala.inline
  def magnitude(quaternion: Quaternion): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("magnitude")(quaternion.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  /* static member */
  @scala.inline
  def magnitudeSquared(quaternion: Quaternion): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("magnitudeSquared")(quaternion.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  /* static member */
  @scala.inline
  def multiply(left: Quaternion, right: Quaternion, result: Quaternion): Quaternion = (^.asInstanceOf[js.Dynamic].applyDynamic("multiply")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Quaternion]
  
  /* static member */
  @scala.inline
  def multiplyByScalar(quaternion: Quaternion, scalar: Double, result: Quaternion): Quaternion = (^.asInstanceOf[js.Dynamic].applyDynamic("multiplyByScalar")(quaternion.asInstanceOf[js.Any], scalar.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Quaternion]
  
  /* static member */
  @scala.inline
  def negate(quaternion: Quaternion, result: Quaternion): Quaternion = (^.asInstanceOf[js.Dynamic].applyDynamic("negate")(quaternion.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Quaternion]
  
  /* static member */
  @scala.inline
  def normalize(quaternion: Quaternion, result: Quaternion): Quaternion = (^.asInstanceOf[js.Dynamic].applyDynamic("normalize")(quaternion.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Quaternion]
  
  /* static member */
  @scala.inline
  def pack(value: Quaternion, array: js.Array[Double]): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("pack")(value.asInstanceOf[js.Any], array.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  @scala.inline
  def pack(value: Quaternion, array: js.Array[Double], startingIndex: Double): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("pack")(value.asInstanceOf[js.Any], array.asInstanceOf[js.Any], startingIndex.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  
  /* static member */
  @JSImport("cesium", "Quaternion.packedInterpolationLength")
  @js.native
  def packedInterpolationLength: Double = js.native
  @scala.inline
  def packedInterpolationLength_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("packedInterpolationLength")(x.asInstanceOf[js.Any])
  
  /* static member */
  @scala.inline
  def slerp(start: Quaternion, end: Quaternion, t: Double, result: Quaternion): Quaternion = (^.asInstanceOf[js.Dynamic].applyDynamic("slerp")(start.asInstanceOf[js.Any], end.asInstanceOf[js.Any], t.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Quaternion]
  
  /* static member */
  @scala.inline
  def squad(q0: Quaternion, q1: Quaternion, s0: Quaternion, s1: Quaternion, t: Double, result: Quaternion): Quaternion = (^.asInstanceOf[js.Dynamic].applyDynamic("squad")(q0.asInstanceOf[js.Any], q1.asInstanceOf[js.Any], s0.asInstanceOf[js.Any], s1.asInstanceOf[js.Any], t.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Quaternion]
  
  /* static member */
  @scala.inline
  def subtract(left: Quaternion, right: Quaternion, result: Quaternion): Quaternion = (^.asInstanceOf[js.Dynamic].applyDynamic("subtract")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Quaternion]
  
  /* static member */
  @scala.inline
  def unpack(array: js.Array[Double]): Quaternion = ^.asInstanceOf[js.Dynamic].applyDynamic("unpack")(array.asInstanceOf[js.Any]).asInstanceOf[Quaternion]
  @scala.inline
  def unpack(array: js.Array[Double], startingIndex: Double): Quaternion = (^.asInstanceOf[js.Dynamic].applyDynamic("unpack")(array.asInstanceOf[js.Any], startingIndex.asInstanceOf[js.Any])).asInstanceOf[Quaternion]
  @scala.inline
  def unpack(array: js.Array[Double], startingIndex: Double, result: Quaternion): Quaternion = (^.asInstanceOf[js.Dynamic].applyDynamic("unpack")(array.asInstanceOf[js.Any], startingIndex.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Quaternion]
  @scala.inline
  def unpack(array: js.Array[Double], startingIndex: Unit, result: Quaternion): Quaternion = (^.asInstanceOf[js.Dynamic].applyDynamic("unpack")(array.asInstanceOf[js.Any], startingIndex.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Quaternion]
  
  /* static member */
  @scala.inline
  def unpackInterpolationResult(array: js.Array[Double], sourceArray: js.Array[Double]): Quaternion = (^.asInstanceOf[js.Dynamic].applyDynamic("unpackInterpolationResult")(array.asInstanceOf[js.Any], sourceArray.asInstanceOf[js.Any])).asInstanceOf[Quaternion]
  @scala.inline
  def unpackInterpolationResult(array: js.Array[Double], sourceArray: js.Array[Double], startingIndex: Double): Quaternion = (^.asInstanceOf[js.Dynamic].applyDynamic("unpackInterpolationResult")(array.asInstanceOf[js.Any], sourceArray.asInstanceOf[js.Any], startingIndex.asInstanceOf[js.Any])).asInstanceOf[Quaternion]
  @scala.inline
  def unpackInterpolationResult(array: js.Array[Double], sourceArray: js.Array[Double], startingIndex: Double, lastIndex: Double): Quaternion = (^.asInstanceOf[js.Dynamic].applyDynamic("unpackInterpolationResult")(array.asInstanceOf[js.Any], sourceArray.asInstanceOf[js.Any], startingIndex.asInstanceOf[js.Any], lastIndex.asInstanceOf[js.Any])).asInstanceOf[Quaternion]
  @scala.inline
  def unpackInterpolationResult(
    array: js.Array[Double],
    sourceArray: js.Array[Double],
    startingIndex: Double,
    lastIndex: Double,
    result: Quaternion
  ): Quaternion = (^.asInstanceOf[js.Dynamic].applyDynamic("unpackInterpolationResult")(array.asInstanceOf[js.Any], sourceArray.asInstanceOf[js.Any], startingIndex.asInstanceOf[js.Any], lastIndex.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Quaternion]
  @scala.inline
  def unpackInterpolationResult(
    array: js.Array[Double],
    sourceArray: js.Array[Double],
    startingIndex: Double,
    lastIndex: Unit,
    result: Quaternion
  ): Quaternion = (^.asInstanceOf[js.Dynamic].applyDynamic("unpackInterpolationResult")(array.asInstanceOf[js.Any], sourceArray.asInstanceOf[js.Any], startingIndex.asInstanceOf[js.Any], lastIndex.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Quaternion]
  @scala.inline
  def unpackInterpolationResult(array: js.Array[Double], sourceArray: js.Array[Double], startingIndex: Unit, lastIndex: Double): Quaternion = (^.asInstanceOf[js.Dynamic].applyDynamic("unpackInterpolationResult")(array.asInstanceOf[js.Any], sourceArray.asInstanceOf[js.Any], startingIndex.asInstanceOf[js.Any], lastIndex.asInstanceOf[js.Any])).asInstanceOf[Quaternion]
  @scala.inline
  def unpackInterpolationResult(
    array: js.Array[Double],
    sourceArray: js.Array[Double],
    startingIndex: Unit,
    lastIndex: Double,
    result: Quaternion
  ): Quaternion = (^.asInstanceOf[js.Dynamic].applyDynamic("unpackInterpolationResult")(array.asInstanceOf[js.Any], sourceArray.asInstanceOf[js.Any], startingIndex.asInstanceOf[js.Any], lastIndex.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Quaternion]
  @scala.inline
  def unpackInterpolationResult(
    array: js.Array[Double],
    sourceArray: js.Array[Double],
    startingIndex: Unit,
    lastIndex: Unit,
    result: Quaternion
  ): Quaternion = (^.asInstanceOf[js.Dynamic].applyDynamic("unpackInterpolationResult")(array.asInstanceOf[js.Any], sourceArray.asInstanceOf[js.Any], startingIndex.asInstanceOf[js.Any], lastIndex.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Quaternion]
}
