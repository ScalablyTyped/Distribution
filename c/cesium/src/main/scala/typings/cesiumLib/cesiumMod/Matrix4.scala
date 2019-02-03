package typings
package cesiumLib.cesiumMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "Matrix4")
@js.native
class Matrix4 protected ()
  extends cesiumLib.cesiumMod.CesiumNs.Matrix4 {
  def this(column0Row0: js.UndefOr[scala.Double], column1Row0: js.UndefOr[scala.Double], column2Row0: js.UndefOr[scala.Double], column3Row0: js.UndefOr[scala.Double], column0Row1: js.UndefOr[scala.Double], column1Row1: js.UndefOr[scala.Double], column2Row1: js.UndefOr[scala.Double], column3Row1: js.UndefOr[scala.Double], column0Row2: js.UndefOr[scala.Double], column1Row2: js.UndefOr[scala.Double], column2Row2: js.UndefOr[scala.Double], column3Row2: js.UndefOr[scala.Double], column0Row3: js.UndefOr[scala.Double], column1Row3: js.UndefOr[scala.Double], column2Row3: js.UndefOr[scala.Double], column3Row3: js.UndefOr[scala.Double]) = this()
}

/* static members */
@JSImport("cesium", "Matrix4")
@js.native
object Matrix4 extends js.Object {
  var COLUMN0ROW0: scala.Double = js.native
  var COLUMN0ROW1: scala.Double = js.native
  var COLUMN0ROW2: scala.Double = js.native
  var COLUMN0ROW3: scala.Double = js.native
  var COLUMN1ROW0: scala.Double = js.native
  var COLUMN1ROW1: scala.Double = js.native
  var COLUMN1ROW2: scala.Double = js.native
  var COLUMN1ROW3: scala.Double = js.native
  var COLUMN2ROW0: scala.Double = js.native
  var COLUMN2ROW1: scala.Double = js.native
  var COLUMN2ROW2: scala.Double = js.native
  var COLUMN2ROW3: scala.Double = js.native
  var COLUMN3ROW0: scala.Double = js.native
  var COLUMN3ROW1: scala.Double = js.native
  var COLUMN3ROW2: scala.Double = js.native
  var COLUMN3ROW3: scala.Double = js.native
  var IDENTITY: cesiumLib.cesiumMod.CesiumNs.Matrix4 = js.native
  def abs(matrix: cesiumLib.cesiumMod.CesiumNs.Matrix4, result: cesiumLib.cesiumMod.CesiumNs.Matrix4): cesiumLib.cesiumMod.CesiumNs.Matrix4 = js.native
  def add(
    left: cesiumLib.cesiumMod.CesiumNs.Matrix4,
    right: cesiumLib.cesiumMod.CesiumNs.Matrix4,
    result: cesiumLib.cesiumMod.CesiumNs.Matrix4
  ): cesiumLib.cesiumMod.CesiumNs.Matrix4 = js.native
  def clone(matrix: cesiumLib.cesiumMod.CesiumNs.Matrix4): cesiumLib.cesiumMod.CesiumNs.Matrix4 = js.native
  def clone(matrix: cesiumLib.cesiumMod.CesiumNs.Matrix4, result: cesiumLib.cesiumMod.CesiumNs.Matrix4): cesiumLib.cesiumMod.CesiumNs.Matrix4 = js.native
  def computeInfinitePerspectiveOffCenter(
    left: scala.Double,
    right: scala.Double,
    bottom: scala.Double,
    top: scala.Double,
    near: scala.Double,
    far: scala.Double,
    result: cesiumLib.cesiumMod.CesiumNs.Matrix4
  ): cesiumLib.cesiumMod.CesiumNs.Matrix4 = js.native
  def computeOrthographicOffCenter(
    left: scala.Double,
    right: scala.Double,
    bottom: scala.Double,
    top: scala.Double,
    near: scala.Double,
    far: scala.Double,
    result: cesiumLib.cesiumMod.CesiumNs.Matrix4
  ): cesiumLib.cesiumMod.CesiumNs.Matrix4 = js.native
  def computePerspectiveFieldOfView(
    fovY: scala.Double,
    aspectRatio: scala.Double,
    near: scala.Double,
    far: scala.Double,
    result: cesiumLib.cesiumMod.CesiumNs.Matrix4
  ): cesiumLib.cesiumMod.CesiumNs.Matrix4 = js.native
  def computePerspectiveOffCenter(
    left: scala.Double,
    right: scala.Double,
    bottom: scala.Double,
    top: scala.Double,
    near: scala.Double,
    far: scala.Double,
    result: cesiumLib.cesiumMod.CesiumNs.Matrix4
  ): cesiumLib.cesiumMod.CesiumNs.Matrix4 = js.native
  def computeViewportTransformation(
    viewport: js.Any,
    nearDepthRange: scala.Double,
    farDepthRange: scala.Double,
    result: cesiumLib.cesiumMod.CesiumNs.Matrix4
  ): cesiumLib.cesiumMod.CesiumNs.Matrix4 = js.native
  def equals(): scala.Boolean = js.native
  def equals(left: cesiumLib.cesiumMod.CesiumNs.Matrix4): scala.Boolean = js.native
  def equals(left: cesiumLib.cesiumMod.CesiumNs.Matrix4, right: cesiumLib.cesiumMod.CesiumNs.Matrix4): scala.Boolean = js.native
  def equalsEpsilon(
    left: cesiumLib.cesiumMod.CesiumNs.Matrix4,
    right: cesiumLib.cesiumMod.CesiumNs.Matrix4,
    epsilon: scala.Double
  ): scala.Boolean = js.native
  def fromArray(array: js.Array[scala.Double]): cesiumLib.cesiumMod.CesiumNs.Matrix4 = js.native
  def fromArray(array: js.Array[scala.Double], startingIndex: scala.Double): cesiumLib.cesiumMod.CesiumNs.Matrix4 = js.native
  def fromArray(
    array: js.Array[scala.Double],
    startingIndex: scala.Double,
    result: cesiumLib.cesiumMod.CesiumNs.Matrix4
  ): cesiumLib.cesiumMod.CesiumNs.Matrix4 = js.native
  def fromCamera(camera: cesiumLib.cesiumMod.CesiumNs.Camera): cesiumLib.cesiumMod.CesiumNs.Matrix4 = js.native
  def fromCamera(camera: cesiumLib.cesiumMod.CesiumNs.Camera, result: cesiumLib.cesiumMod.CesiumNs.Matrix4): cesiumLib.cesiumMod.CesiumNs.Matrix4 = js.native
  def fromColumnMajorArray(values: js.Array[scala.Double]): cesiumLib.cesiumMod.CesiumNs.Matrix4 = js.native
  def fromColumnMajorArray(values: js.Array[scala.Double], result: cesiumLib.cesiumMod.CesiumNs.Matrix4): cesiumLib.cesiumMod.CesiumNs.Matrix4 = js.native
  def fromRotationTranslation(rotation: cesiumLib.cesiumMod.CesiumNs.Matrix3): cesiumLib.cesiumMod.CesiumNs.Matrix4 = js.native
  def fromRotationTranslation(
    rotation: cesiumLib.cesiumMod.CesiumNs.Matrix3,
    translation: cesiumLib.cesiumMod.CesiumNs.Cartesian3
  ): cesiumLib.cesiumMod.CesiumNs.Matrix4 = js.native
  def fromRotationTranslation(
    rotation: cesiumLib.cesiumMod.CesiumNs.Matrix3,
    translation: cesiumLib.cesiumMod.CesiumNs.Cartesian3,
    result: cesiumLib.cesiumMod.CesiumNs.Matrix4
  ): cesiumLib.cesiumMod.CesiumNs.Matrix4 = js.native
  def fromRowMajorArray(values: js.Array[scala.Double]): cesiumLib.cesiumMod.CesiumNs.Matrix4 = js.native
  def fromRowMajorArray(values: js.Array[scala.Double], result: cesiumLib.cesiumMod.CesiumNs.Matrix4): cesiumLib.cesiumMod.CesiumNs.Matrix4 = js.native
  def fromScale(scale: cesiumLib.cesiumMod.CesiumNs.Cartesian3): cesiumLib.cesiumMod.CesiumNs.Matrix4 = js.native
  def fromScale(scale: cesiumLib.cesiumMod.CesiumNs.Cartesian3, result: cesiumLib.cesiumMod.CesiumNs.Matrix4): cesiumLib.cesiumMod.CesiumNs.Matrix4 = js.native
  def fromTranslation(translation: cesiumLib.cesiumMod.CesiumNs.Cartesian3): cesiumLib.cesiumMod.CesiumNs.Matrix4 = js.native
  def fromTranslation(translation: cesiumLib.cesiumMod.CesiumNs.Cartesian3, result: cesiumLib.cesiumMod.CesiumNs.Matrix4): cesiumLib.cesiumMod.CesiumNs.Matrix4 = js.native
  def fromTranslationQuaternionRotationScale(
    translation: cesiumLib.cesiumMod.CesiumNs.Cartesian3,
    rotation: cesiumLib.cesiumMod.CesiumNs.Quaternion,
    scale: cesiumLib.cesiumMod.CesiumNs.Cartesian3
  ): cesiumLib.cesiumMod.CesiumNs.Matrix4 = js.native
  def fromTranslationQuaternionRotationScale(
    translation: cesiumLib.cesiumMod.CesiumNs.Cartesian3,
    rotation: cesiumLib.cesiumMod.CesiumNs.Quaternion,
    scale: cesiumLib.cesiumMod.CesiumNs.Cartesian3,
    result: cesiumLib.cesiumMod.CesiumNs.Matrix4
  ): cesiumLib.cesiumMod.CesiumNs.Matrix4 = js.native
  def fromUniformScale(scale: scala.Double): cesiumLib.cesiumMod.CesiumNs.Matrix4 = js.native
  def fromUniformScale(scale: scala.Double, result: cesiumLib.cesiumMod.CesiumNs.Matrix4): cesiumLib.cesiumMod.CesiumNs.Matrix4 = js.native
  def getColumn(
    matrix: cesiumLib.cesiumMod.CesiumNs.Matrix4,
    index: scala.Double,
    result: cesiumLib.cesiumMod.CesiumNs.Cartesian4
  ): cesiumLib.cesiumMod.CesiumNs.Cartesian4 = js.native
  def getElementIndex(row: scala.Double, column: scala.Double): scala.Double = js.native
  def getMaximumScale(matrix: cesiumLib.cesiumMod.CesiumNs.Matrix4): scala.Double = js.native
  def getRotation(matrix: cesiumLib.cesiumMod.CesiumNs.Matrix4, result: cesiumLib.cesiumMod.CesiumNs.Matrix3): cesiumLib.cesiumMod.CesiumNs.Matrix3 = js.native
  def getRow(
    matrix: cesiumLib.cesiumMod.CesiumNs.Matrix4,
    index: scala.Double,
    result: cesiumLib.cesiumMod.CesiumNs.Cartesian4
  ): cesiumLib.cesiumMod.CesiumNs.Cartesian4 = js.native
  def getScale(matrix: cesiumLib.cesiumMod.CesiumNs.Matrix4, result: cesiumLib.cesiumMod.CesiumNs.Cartesian3): cesiumLib.cesiumMod.CesiumNs.Cartesian3 = js.native
  def getTranslation(matrix: cesiumLib.cesiumMod.CesiumNs.Matrix4, result: cesiumLib.cesiumMod.CesiumNs.Cartesian3): cesiumLib.cesiumMod.CesiumNs.Cartesian3 = js.native
  def inverse(matrix: cesiumLib.cesiumMod.CesiumNs.Matrix4, result: cesiumLib.cesiumMod.CesiumNs.Matrix4): cesiumLib.cesiumMod.CesiumNs.Matrix4 = js.native
  def inverseTransformation(matrix: cesiumLib.cesiumMod.CesiumNs.Matrix4, result: cesiumLib.cesiumMod.CesiumNs.Matrix4): cesiumLib.cesiumMod.CesiumNs.Matrix4 = js.native
  def multiply(
    left: cesiumLib.cesiumMod.CesiumNs.Matrix4,
    right: cesiumLib.cesiumMod.CesiumNs.Matrix4,
    result: cesiumLib.cesiumMod.CesiumNs.Matrix4
  ): cesiumLib.cesiumMod.CesiumNs.Matrix4 = js.native
  def multiplyByMatrix3(
    matrix: cesiumLib.cesiumMod.CesiumNs.Matrix4,
    rotation: cesiumLib.cesiumMod.CesiumNs.Matrix3,
    result: cesiumLib.cesiumMod.CesiumNs.Matrix4
  ): cesiumLib.cesiumMod.CesiumNs.Matrix4 = js.native
  def multiplyByPoint(
    matrix: cesiumLib.cesiumMod.CesiumNs.Matrix4,
    cartesian: cesiumLib.cesiumMod.CesiumNs.Cartesian3,
    result: cesiumLib.cesiumMod.CesiumNs.Cartesian3
  ): cesiumLib.cesiumMod.CesiumNs.Cartesian3 = js.native
  def multiplyByPointAsVector(
    matrix: cesiumLib.cesiumMod.CesiumNs.Matrix4,
    cartesian: cesiumLib.cesiumMod.CesiumNs.Cartesian3,
    result: cesiumLib.cesiumMod.CesiumNs.Cartesian3
  ): cesiumLib.cesiumMod.CesiumNs.Cartesian3 = js.native
  def multiplyByScalar(
    matrix: cesiumLib.cesiumMod.CesiumNs.Matrix4,
    scalar: scala.Double,
    result: cesiumLib.cesiumMod.CesiumNs.Matrix4
  ): cesiumLib.cesiumMod.CesiumNs.Matrix4 = js.native
  def multiplyByScale(
    matrix: cesiumLib.cesiumMod.CesiumNs.Matrix4,
    scale: cesiumLib.cesiumMod.CesiumNs.Cartesian3,
    result: cesiumLib.cesiumMod.CesiumNs.Matrix4
  ): cesiumLib.cesiumMod.CesiumNs.Matrix4 = js.native
  def multiplyByTranslation(
    matrix: cesiumLib.cesiumMod.CesiumNs.Matrix4,
    translation: cesiumLib.cesiumMod.CesiumNs.Cartesian3,
    result: cesiumLib.cesiumMod.CesiumNs.Matrix4
  ): cesiumLib.cesiumMod.CesiumNs.Matrix4 = js.native
  def multiplyByUniformScale(
    matrix: cesiumLib.cesiumMod.CesiumNs.Matrix4,
    scale: scala.Double,
    result: cesiumLib.cesiumMod.CesiumNs.Matrix4
  ): cesiumLib.cesiumMod.CesiumNs.Matrix4 = js.native
  def multiplyByVector(
    matrix: cesiumLib.cesiumMod.CesiumNs.Matrix4,
    cartesian: cesiumLib.cesiumMod.CesiumNs.Cartesian4,
    result: cesiumLib.cesiumMod.CesiumNs.Cartesian4
  ): cesiumLib.cesiumMod.CesiumNs.Cartesian4 = js.native
  def multiplyTransformation(
    left: cesiumLib.cesiumMod.CesiumNs.Matrix4,
    right: cesiumLib.cesiumMod.CesiumNs.Matrix4,
    result: cesiumLib.cesiumMod.CesiumNs.Matrix4
  ): cesiumLib.cesiumMod.CesiumNs.Matrix4 = js.native
  def negate(matrix: cesiumLib.cesiumMod.CesiumNs.Matrix4, result: cesiumLib.cesiumMod.CesiumNs.Matrix4): cesiumLib.cesiumMod.CesiumNs.Matrix4 = js.native
  def pack(value: cesiumLib.cesiumMod.CesiumNs.Matrix4, array: js.Array[scala.Double]): js.Array[scala.Double] = js.native
  def pack(
    value: cesiumLib.cesiumMod.CesiumNs.Matrix4,
    array: js.Array[scala.Double],
    startingIndex: scala.Double
  ): js.Array[scala.Double] = js.native
  def setColumn(
    matrix: cesiumLib.cesiumMod.CesiumNs.Matrix4,
    index: scala.Double,
    cartesian: cesiumLib.cesiumMod.CesiumNs.Cartesian4,
    result: cesiumLib.cesiumMod.CesiumNs.Cartesian4
  ): cesiumLib.cesiumMod.CesiumNs.Matrix4 = js.native
  def setRow(
    matrix: cesiumLib.cesiumMod.CesiumNs.Matrix4,
    index: scala.Double,
    cartesian: cesiumLib.cesiumMod.CesiumNs.Cartesian4,
    result: cesiumLib.cesiumMod.CesiumNs.Cartesian4
  ): cesiumLib.cesiumMod.CesiumNs.Matrix4 = js.native
  def subtract(
    left: cesiumLib.cesiumMod.CesiumNs.Matrix4,
    right: cesiumLib.cesiumMod.CesiumNs.Matrix4,
    result: cesiumLib.cesiumMod.CesiumNs.Matrix4
  ): cesiumLib.cesiumMod.CesiumNs.Matrix4 = js.native
  def toArray(matrix: cesiumLib.cesiumMod.CesiumNs.Matrix4): js.Array[scala.Double] = js.native
  def toArray(matrix: cesiumLib.cesiumMod.CesiumNs.Matrix4, result: js.Array[scala.Double]): js.Array[scala.Double] = js.native
  def transpose(matrix: cesiumLib.cesiumMod.CesiumNs.Matrix4, result: cesiumLib.cesiumMod.CesiumNs.Matrix4): cesiumLib.cesiumMod.CesiumNs.Matrix4 = js.native
  def unpack(array: js.Array[scala.Double]): cesiumLib.cesiumMod.CesiumNs.Matrix4 = js.native
  def unpack(array: js.Array[scala.Double], startingIndex: scala.Double): cesiumLib.cesiumMod.CesiumNs.Matrix4 = js.native
  def unpack(
    array: js.Array[scala.Double],
    startingIndex: scala.Double,
    result: cesiumLib.cesiumMod.CesiumNs.Matrix4
  ): cesiumLib.cesiumMod.CesiumNs.Matrix4 = js.native
}

