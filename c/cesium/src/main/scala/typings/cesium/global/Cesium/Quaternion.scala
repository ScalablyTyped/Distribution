package typings.cesium.global.Cesium

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Cesium.Quaternion")
@js.native
class Quaternion ()
  extends typings.cesium.mod.Quaternion {
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
}
object Quaternion {
  
  @JSGlobal("Cesium.Quaternion")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSGlobal("Cesium.Quaternion.IDENTITY")
  @js.native
  def IDENTITY: typings.cesium.mod.Quaternion = js.native
  inline def IDENTITY_=(x: typings.cesium.mod.Quaternion): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("IDENTITY")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("Cesium.Quaternion.ZERO")
  @js.native
  def ZERO: typings.cesium.mod.Quaternion = js.native
  inline def ZERO_=(x: typings.cesium.mod.Quaternion): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ZERO")(x.asInstanceOf[js.Any])
  
  /* static member */
  inline def add(
    left: typings.cesium.mod.Quaternion,
    right: typings.cesium.mod.Quaternion,
    result: typings.cesium.mod.Quaternion
  ): typings.cesium.mod.Quaternion = (^.asInstanceOf[js.Dynamic].applyDynamic("add")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[typings.cesium.mod.Quaternion]
  
  /* static member */
  inline def clone_(quaternion: typings.cesium.mod.Quaternion): typings.cesium.mod.Quaternion = ^.asInstanceOf[js.Dynamic].applyDynamic("clone")(quaternion.asInstanceOf[js.Any]).asInstanceOf[typings.cesium.mod.Quaternion]
  inline def clone_(quaternion: typings.cesium.mod.Quaternion, result: typings.cesium.mod.Quaternion): typings.cesium.mod.Quaternion = (^.asInstanceOf[js.Dynamic].applyDynamic("clone")(quaternion.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[typings.cesium.mod.Quaternion]
  
  /* static member */
  inline def computeAngle(quaternion: typings.cesium.mod.Quaternion): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("computeAngle")(quaternion.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  /* static member */
  inline def computeAxis(quaternion: typings.cesium.mod.Quaternion, result: typings.cesium.mod.Cartesian3): typings.cesium.mod.Cartesian3 = (^.asInstanceOf[js.Dynamic].applyDynamic("computeAxis")(quaternion.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[typings.cesium.mod.Cartesian3]
  
  /* static member */
  inline def computeInnerQuadrangle(
    q0: typings.cesium.mod.Quaternion,
    q1: typings.cesium.mod.Quaternion,
    q2: typings.cesium.mod.Quaternion,
    result: typings.cesium.mod.Quaternion
  ): typings.cesium.mod.Quaternion = (^.asInstanceOf[js.Dynamic].applyDynamic("computeInnerQuadrangle")(q0.asInstanceOf[js.Any], q1.asInstanceOf[js.Any], q2.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[typings.cesium.mod.Quaternion]
  
  /* static member */
  inline def conjugate(quaternion: typings.cesium.mod.Quaternion, result: typings.cesium.mod.Quaternion): typings.cesium.mod.Quaternion = (^.asInstanceOf[js.Dynamic].applyDynamic("conjugate")(quaternion.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[typings.cesium.mod.Quaternion]
  
  /* static member */
  inline def convertPackedArrayForInterpolation(packedArray: js.Array[Double]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("convertPackedArrayForInterpolation")(packedArray.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def convertPackedArrayForInterpolation(packedArray: js.Array[Double], startingIndex: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("convertPackedArrayForInterpolation")(packedArray.asInstanceOf[js.Any], startingIndex.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def convertPackedArrayForInterpolation(packedArray: js.Array[Double], startingIndex: Double, lastIndex: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("convertPackedArrayForInterpolation")(packedArray.asInstanceOf[js.Any], startingIndex.asInstanceOf[js.Any], lastIndex.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def convertPackedArrayForInterpolation(packedArray: js.Array[Double], startingIndex: Double, lastIndex: Double, result: js.Array[Double]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("convertPackedArrayForInterpolation")(packedArray.asInstanceOf[js.Any], startingIndex.asInstanceOf[js.Any], lastIndex.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def convertPackedArrayForInterpolation(packedArray: js.Array[Double], startingIndex: Double, lastIndex: Unit, result: js.Array[Double]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("convertPackedArrayForInterpolation")(packedArray.asInstanceOf[js.Any], startingIndex.asInstanceOf[js.Any], lastIndex.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def convertPackedArrayForInterpolation(packedArray: js.Array[Double], startingIndex: Unit, lastIndex: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("convertPackedArrayForInterpolation")(packedArray.asInstanceOf[js.Any], startingIndex.asInstanceOf[js.Any], lastIndex.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def convertPackedArrayForInterpolation(packedArray: js.Array[Double], startingIndex: Unit, lastIndex: Double, result: js.Array[Double]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("convertPackedArrayForInterpolation")(packedArray.asInstanceOf[js.Any], startingIndex.asInstanceOf[js.Any], lastIndex.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def convertPackedArrayForInterpolation(packedArray: js.Array[Double], startingIndex: Unit, lastIndex: Unit, result: js.Array[Double]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("convertPackedArrayForInterpolation")(packedArray.asInstanceOf[js.Any], startingIndex.asInstanceOf[js.Any], lastIndex.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /* static member */
  inline def divideByScalar(quaternion: typings.cesium.mod.Quaternion, scalar: Double, result: typings.cesium.mod.Quaternion): typings.cesium.mod.Quaternion = (^.asInstanceOf[js.Dynamic].applyDynamic("divideByScalar")(quaternion.asInstanceOf[js.Any], scalar.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[typings.cesium.mod.Quaternion]
  
  /* static member */
  inline def dot(left: typings.cesium.mod.Quaternion, right: typings.cesium.mod.Quaternion): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("dot")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  /* static member */
  inline def equalsEpsilon(left: typings.cesium.mod.Quaternion, right: typings.cesium.mod.Quaternion, epsilon: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equalsEpsilon")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any], epsilon.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  /* static member */
  inline def equals_(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("equals")().asInstanceOf[Boolean]
  inline def equals_(left: Unit, right: typings.cesium.mod.Quaternion): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def equals_(left: typings.cesium.mod.Quaternion): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("equals")(left.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def equals_(left: typings.cesium.mod.Quaternion, right: typings.cesium.mod.Quaternion): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  /* static member */
  inline def exp(cartesian: typings.cesium.mod.Cartesian3, result: typings.cesium.mod.Quaternion): typings.cesium.mod.Quaternion = (^.asInstanceOf[js.Dynamic].applyDynamic("exp")(cartesian.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[typings.cesium.mod.Quaternion]
  
  /* static member */
  inline def fastSlerp(
    start: typings.cesium.mod.Quaternion,
    end: typings.cesium.mod.Quaternion,
    t: Double,
    result: typings.cesium.mod.Quaternion
  ): typings.cesium.mod.Quaternion = (^.asInstanceOf[js.Dynamic].applyDynamic("fastSlerp")(start.asInstanceOf[js.Any], end.asInstanceOf[js.Any], t.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[typings.cesium.mod.Quaternion]
  
  /* static member */
  inline def fastSquad(
    q0: typings.cesium.mod.Quaternion,
    q1: typings.cesium.mod.Quaternion,
    s0: typings.cesium.mod.Quaternion,
    s1: typings.cesium.mod.Quaternion,
    t: Double
  ): typings.cesium.mod.Quaternion = (^.asInstanceOf[js.Dynamic].applyDynamic("fastSquad")(q0.asInstanceOf[js.Any], q1.asInstanceOf[js.Any], s0.asInstanceOf[js.Any], s1.asInstanceOf[js.Any], t.asInstanceOf[js.Any])).asInstanceOf[typings.cesium.mod.Quaternion]
  inline def fastSquad(
    q0: typings.cesium.mod.Quaternion,
    q1: typings.cesium.mod.Quaternion,
    s0: typings.cesium.mod.Quaternion,
    s1: typings.cesium.mod.Quaternion,
    t: Double,
    result: typings.cesium.mod.Quaternion
  ): typings.cesium.mod.Quaternion = (^.asInstanceOf[js.Dynamic].applyDynamic("fastSquad")(q0.asInstanceOf[js.Any], q1.asInstanceOf[js.Any], s0.asInstanceOf[js.Any], s1.asInstanceOf[js.Any], t.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[typings.cesium.mod.Quaternion]
  
  /* static member */
  inline def fromAxisAngle(axis: typings.cesium.mod.Cartesian3, angle: Double): typings.cesium.mod.Quaternion = (^.asInstanceOf[js.Dynamic].applyDynamic("fromAxisAngle")(axis.asInstanceOf[js.Any], angle.asInstanceOf[js.Any])).asInstanceOf[typings.cesium.mod.Quaternion]
  inline def fromAxisAngle(axis: typings.cesium.mod.Cartesian3, angle: Double, result: typings.cesium.mod.Quaternion): typings.cesium.mod.Quaternion = (^.asInstanceOf[js.Dynamic].applyDynamic("fromAxisAngle")(axis.asInstanceOf[js.Any], angle.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[typings.cesium.mod.Quaternion]
  
  /* static member */
  inline def fromHeadingPitchRoll(headingPitchRoll: typings.cesium.mod.HeadingPitchRoll): typings.cesium.mod.Quaternion = ^.asInstanceOf[js.Dynamic].applyDynamic("fromHeadingPitchRoll")(headingPitchRoll.asInstanceOf[js.Any]).asInstanceOf[typings.cesium.mod.Quaternion]
  inline def fromHeadingPitchRoll(headingPitchRoll: typings.cesium.mod.HeadingPitchRoll, result: typings.cesium.mod.Quaternion): typings.cesium.mod.Quaternion = (^.asInstanceOf[js.Dynamic].applyDynamic("fromHeadingPitchRoll")(headingPitchRoll.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[typings.cesium.mod.Quaternion]
  
  /* static member */
  inline def fromRotationMatrix(matrix: typings.cesium.mod.Matrix3): typings.cesium.mod.Quaternion = ^.asInstanceOf[js.Dynamic].applyDynamic("fromRotationMatrix")(matrix.asInstanceOf[js.Any]).asInstanceOf[typings.cesium.mod.Quaternion]
  inline def fromRotationMatrix(matrix: typings.cesium.mod.Matrix3, result: typings.cesium.mod.Quaternion): typings.cesium.mod.Quaternion = (^.asInstanceOf[js.Dynamic].applyDynamic("fromRotationMatrix")(matrix.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[typings.cesium.mod.Quaternion]
  
  /* static member */
  inline def inverse(quaternion: typings.cesium.mod.Quaternion, result: typings.cesium.mod.Quaternion): typings.cesium.mod.Quaternion = (^.asInstanceOf[js.Dynamic].applyDynamic("inverse")(quaternion.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[typings.cesium.mod.Quaternion]
  
  /* static member */
  inline def lerp(
    start: typings.cesium.mod.Quaternion,
    end: typings.cesium.mod.Quaternion,
    t: Double,
    result: typings.cesium.mod.Quaternion
  ): typings.cesium.mod.Quaternion = (^.asInstanceOf[js.Dynamic].applyDynamic("lerp")(start.asInstanceOf[js.Any], end.asInstanceOf[js.Any], t.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[typings.cesium.mod.Quaternion]
  
  /* static member */
  inline def log(quaternion: typings.cesium.mod.Quaternion, result: typings.cesium.mod.Cartesian3): typings.cesium.mod.Cartesian3 = (^.asInstanceOf[js.Dynamic].applyDynamic("log")(quaternion.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[typings.cesium.mod.Cartesian3]
  
  /* static member */
  inline def magnitude(quaternion: typings.cesium.mod.Quaternion): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("magnitude")(quaternion.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  /* static member */
  inline def magnitudeSquared(quaternion: typings.cesium.mod.Quaternion): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("magnitudeSquared")(quaternion.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  /* static member */
  inline def multiply(
    left: typings.cesium.mod.Quaternion,
    right: typings.cesium.mod.Quaternion,
    result: typings.cesium.mod.Quaternion
  ): typings.cesium.mod.Quaternion = (^.asInstanceOf[js.Dynamic].applyDynamic("multiply")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[typings.cesium.mod.Quaternion]
  
  /* static member */
  inline def multiplyByScalar(quaternion: typings.cesium.mod.Quaternion, scalar: Double, result: typings.cesium.mod.Quaternion): typings.cesium.mod.Quaternion = (^.asInstanceOf[js.Dynamic].applyDynamic("multiplyByScalar")(quaternion.asInstanceOf[js.Any], scalar.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[typings.cesium.mod.Quaternion]
  
  /* static member */
  inline def negate(quaternion: typings.cesium.mod.Quaternion, result: typings.cesium.mod.Quaternion): typings.cesium.mod.Quaternion = (^.asInstanceOf[js.Dynamic].applyDynamic("negate")(quaternion.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[typings.cesium.mod.Quaternion]
  
  /* static member */
  inline def normalize(quaternion: typings.cesium.mod.Quaternion, result: typings.cesium.mod.Quaternion): typings.cesium.mod.Quaternion = (^.asInstanceOf[js.Dynamic].applyDynamic("normalize")(quaternion.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[typings.cesium.mod.Quaternion]
  
  /* static member */
  inline def pack(value: typings.cesium.mod.Quaternion, array: js.Array[Double]): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("pack")(value.asInstanceOf[js.Any], array.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  inline def pack(value: typings.cesium.mod.Quaternion, array: js.Array[Double], startingIndex: Double): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("pack")(value.asInstanceOf[js.Any], array.asInstanceOf[js.Any], startingIndex.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  
  /* static member */
  @JSGlobal("Cesium.Quaternion.packedInterpolationLength")
  @js.native
  def packedInterpolationLength: Double = js.native
  inline def packedInterpolationLength_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("packedInterpolationLength")(x.asInstanceOf[js.Any])
  
  /* static member */
  inline def slerp(
    start: typings.cesium.mod.Quaternion,
    end: typings.cesium.mod.Quaternion,
    t: Double,
    result: typings.cesium.mod.Quaternion
  ): typings.cesium.mod.Quaternion = (^.asInstanceOf[js.Dynamic].applyDynamic("slerp")(start.asInstanceOf[js.Any], end.asInstanceOf[js.Any], t.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[typings.cesium.mod.Quaternion]
  
  /* static member */
  inline def squad(
    q0: typings.cesium.mod.Quaternion,
    q1: typings.cesium.mod.Quaternion,
    s0: typings.cesium.mod.Quaternion,
    s1: typings.cesium.mod.Quaternion,
    t: Double,
    result: typings.cesium.mod.Quaternion
  ): typings.cesium.mod.Quaternion = (^.asInstanceOf[js.Dynamic].applyDynamic("squad")(q0.asInstanceOf[js.Any], q1.asInstanceOf[js.Any], s0.asInstanceOf[js.Any], s1.asInstanceOf[js.Any], t.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[typings.cesium.mod.Quaternion]
  
  /* static member */
  inline def subtract(
    left: typings.cesium.mod.Quaternion,
    right: typings.cesium.mod.Quaternion,
    result: typings.cesium.mod.Quaternion
  ): typings.cesium.mod.Quaternion = (^.asInstanceOf[js.Dynamic].applyDynamic("subtract")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[typings.cesium.mod.Quaternion]
  
  /* static member */
  inline def unpack(array: js.Array[Double]): typings.cesium.mod.Quaternion = ^.asInstanceOf[js.Dynamic].applyDynamic("unpack")(array.asInstanceOf[js.Any]).asInstanceOf[typings.cesium.mod.Quaternion]
  inline def unpack(array: js.Array[Double], startingIndex: Double): typings.cesium.mod.Quaternion = (^.asInstanceOf[js.Dynamic].applyDynamic("unpack")(array.asInstanceOf[js.Any], startingIndex.asInstanceOf[js.Any])).asInstanceOf[typings.cesium.mod.Quaternion]
  inline def unpack(array: js.Array[Double], startingIndex: Double, result: typings.cesium.mod.Quaternion): typings.cesium.mod.Quaternion = (^.asInstanceOf[js.Dynamic].applyDynamic("unpack")(array.asInstanceOf[js.Any], startingIndex.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[typings.cesium.mod.Quaternion]
  inline def unpack(array: js.Array[Double], startingIndex: Unit, result: typings.cesium.mod.Quaternion): typings.cesium.mod.Quaternion = (^.asInstanceOf[js.Dynamic].applyDynamic("unpack")(array.asInstanceOf[js.Any], startingIndex.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[typings.cesium.mod.Quaternion]
  
  /* static member */
  inline def unpackInterpolationResult(array: js.Array[Double], sourceArray: js.Array[Double]): typings.cesium.mod.Quaternion = (^.asInstanceOf[js.Dynamic].applyDynamic("unpackInterpolationResult")(array.asInstanceOf[js.Any], sourceArray.asInstanceOf[js.Any])).asInstanceOf[typings.cesium.mod.Quaternion]
  inline def unpackInterpolationResult(array: js.Array[Double], sourceArray: js.Array[Double], startingIndex: Double): typings.cesium.mod.Quaternion = (^.asInstanceOf[js.Dynamic].applyDynamic("unpackInterpolationResult")(array.asInstanceOf[js.Any], sourceArray.asInstanceOf[js.Any], startingIndex.asInstanceOf[js.Any])).asInstanceOf[typings.cesium.mod.Quaternion]
  inline def unpackInterpolationResult(array: js.Array[Double], sourceArray: js.Array[Double], startingIndex: Double, lastIndex: Double): typings.cesium.mod.Quaternion = (^.asInstanceOf[js.Dynamic].applyDynamic("unpackInterpolationResult")(array.asInstanceOf[js.Any], sourceArray.asInstanceOf[js.Any], startingIndex.asInstanceOf[js.Any], lastIndex.asInstanceOf[js.Any])).asInstanceOf[typings.cesium.mod.Quaternion]
  inline def unpackInterpolationResult(
    array: js.Array[Double],
    sourceArray: js.Array[Double],
    startingIndex: Double,
    lastIndex: Double,
    result: typings.cesium.mod.Quaternion
  ): typings.cesium.mod.Quaternion = (^.asInstanceOf[js.Dynamic].applyDynamic("unpackInterpolationResult")(array.asInstanceOf[js.Any], sourceArray.asInstanceOf[js.Any], startingIndex.asInstanceOf[js.Any], lastIndex.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[typings.cesium.mod.Quaternion]
  inline def unpackInterpolationResult(
    array: js.Array[Double],
    sourceArray: js.Array[Double],
    startingIndex: Double,
    lastIndex: Unit,
    result: typings.cesium.mod.Quaternion
  ): typings.cesium.mod.Quaternion = (^.asInstanceOf[js.Dynamic].applyDynamic("unpackInterpolationResult")(array.asInstanceOf[js.Any], sourceArray.asInstanceOf[js.Any], startingIndex.asInstanceOf[js.Any], lastIndex.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[typings.cesium.mod.Quaternion]
  inline def unpackInterpolationResult(array: js.Array[Double], sourceArray: js.Array[Double], startingIndex: Unit, lastIndex: Double): typings.cesium.mod.Quaternion = (^.asInstanceOf[js.Dynamic].applyDynamic("unpackInterpolationResult")(array.asInstanceOf[js.Any], sourceArray.asInstanceOf[js.Any], startingIndex.asInstanceOf[js.Any], lastIndex.asInstanceOf[js.Any])).asInstanceOf[typings.cesium.mod.Quaternion]
  inline def unpackInterpolationResult(
    array: js.Array[Double],
    sourceArray: js.Array[Double],
    startingIndex: Unit,
    lastIndex: Double,
    result: typings.cesium.mod.Quaternion
  ): typings.cesium.mod.Quaternion = (^.asInstanceOf[js.Dynamic].applyDynamic("unpackInterpolationResult")(array.asInstanceOf[js.Any], sourceArray.asInstanceOf[js.Any], startingIndex.asInstanceOf[js.Any], lastIndex.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[typings.cesium.mod.Quaternion]
  inline def unpackInterpolationResult(
    array: js.Array[Double],
    sourceArray: js.Array[Double],
    startingIndex: Unit,
    lastIndex: Unit,
    result: typings.cesium.mod.Quaternion
  ): typings.cesium.mod.Quaternion = (^.asInstanceOf[js.Dynamic].applyDynamic("unpackInterpolationResult")(array.asInstanceOf[js.Any], sourceArray.asInstanceOf[js.Any], startingIndex.asInstanceOf[js.Any], lastIndex.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[typings.cesium.mod.Quaternion]
}
