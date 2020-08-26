package typings.cesium.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "Matrix4")
@js.native
class Matrix4 protected () extends Packable {
  def this(
    column0Row0: js.UndefOr[Double],
    column1Row0: js.UndefOr[Double],
    column2Row0: js.UndefOr[Double],
    column3Row0: js.UndefOr[Double],
    column0Row1: js.UndefOr[Double],
    column1Row1: js.UndefOr[Double],
    column2Row1: js.UndefOr[Double],
    column3Row1: js.UndefOr[Double],
    column0Row2: js.UndefOr[Double],
    column1Row2: js.UndefOr[Double],
    column2Row2: js.UndefOr[Double],
    column3Row2: js.UndefOr[Double],
    column0Row3: js.UndefOr[Double],
    column1Row3: js.UndefOr[Double],
    column2Row3: js.UndefOr[Double],
    column3Row3: js.UndefOr[Double]
  ) = this()
  def clone(result: Matrix4): Matrix4 = js.native
  def equals(): Boolean = js.native
  def equals(right: Matrix4): Boolean = js.native
  def equalsEpsilon(right: Matrix4, epsilon: Double): Boolean = js.native
}

/* static members */
@JSImport("cesium", "Matrix4")
@js.native
object Matrix4 extends js.Object {
  var COLUMN0ROW0: Double = js.native
  var COLUMN0ROW1: Double = js.native
  var COLUMN0ROW2: Double = js.native
  var COLUMN0ROW3: Double = js.native
  var COLUMN1ROW0: Double = js.native
  var COLUMN1ROW1: Double = js.native
  var COLUMN1ROW2: Double = js.native
  var COLUMN1ROW3: Double = js.native
  var COLUMN2ROW0: Double = js.native
  var COLUMN2ROW1: Double = js.native
  var COLUMN2ROW2: Double = js.native
  var COLUMN2ROW3: Double = js.native
  var COLUMN3ROW0: Double = js.native
  var COLUMN3ROW1: Double = js.native
  var COLUMN3ROW2: Double = js.native
  var COLUMN3ROW3: Double = js.native
  var IDENTITY: Matrix4 = js.native
  def abs(matrix: Matrix4, result: Matrix4): Matrix4 = js.native
  def add(left: Matrix4, right: Matrix4, result: Matrix4): Matrix4 = js.native
  def clone(matrix: Matrix4): Matrix4 = js.native
  def clone(matrix: Matrix4, result: Matrix4): Matrix4 = js.native
  def computeInfinitePerspectiveOffCenter(
    left: Double,
    right: Double,
    bottom: Double,
    top: Double,
    near: Double,
    far: Double,
    result: Matrix4
  ): Matrix4 = js.native
  def computeOrthographicOffCenter(
    left: Double,
    right: Double,
    bottom: Double,
    top: Double,
    near: Double,
    far: Double,
    result: Matrix4
  ): Matrix4 = js.native
  def computePerspectiveFieldOfView(fovY: Double, aspectRatio: Double, near: Double, far: Double, result: Matrix4): Matrix4 = js.native
  def computePerspectiveOffCenter(
    left: Double,
    right: Double,
    bottom: Double,
    top: Double,
    near: Double,
    far: Double,
    result: Matrix4
  ): Matrix4 = js.native
  def computeViewportTransformation(viewport: js.Any, nearDepthRange: Double, farDepthRange: Double, result: Matrix4): Matrix4 = js.native
  def equals(): Boolean = js.native
  def equals(left: js.UndefOr[scala.Nothing], right: Matrix4): Boolean = js.native
  def equals(left: Matrix4): Boolean = js.native
  def equals(left: Matrix4, right: Matrix4): Boolean = js.native
  def equalsEpsilon(left: Matrix4, right: Matrix4, epsilon: Double): Boolean = js.native
  def fromArray(array: js.Array[Double]): Matrix4 = js.native
  def fromArray(array: js.Array[Double], startingIndex: js.UndefOr[scala.Nothing], result: Matrix4): Matrix4 = js.native
  def fromArray(array: js.Array[Double], startingIndex: Double): Matrix4 = js.native
  def fromArray(array: js.Array[Double], startingIndex: Double, result: Matrix4): Matrix4 = js.native
  def fromCamera(camera: Camera): Matrix4 = js.native
  def fromCamera(camera: Camera, result: Matrix4): Matrix4 = js.native
  def fromColumnMajorArray(values: js.Array[Double]): Matrix4 = js.native
  def fromColumnMajorArray(values: js.Array[Double], result: Matrix4): Matrix4 = js.native
  def fromRotationTranslation(rotation: Matrix3): Matrix4 = js.native
  def fromRotationTranslation(rotation: Matrix3, translation: js.UndefOr[scala.Nothing], result: Matrix4): Matrix4 = js.native
  def fromRotationTranslation(rotation: Matrix3, translation: Cartesian3): Matrix4 = js.native
  def fromRotationTranslation(rotation: Matrix3, translation: Cartesian3, result: Matrix4): Matrix4 = js.native
  def fromRowMajorArray(values: js.Array[Double]): Matrix4 = js.native
  def fromRowMajorArray(values: js.Array[Double], result: Matrix4): Matrix4 = js.native
  def fromScale(scale: Cartesian3): Matrix4 = js.native
  def fromScale(scale: Cartesian3, result: Matrix4): Matrix4 = js.native
  def fromTranslation(translation: Cartesian3): Matrix4 = js.native
  def fromTranslation(translation: Cartesian3, result: Matrix4): Matrix4 = js.native
  def fromTranslationQuaternionRotationScale(translation: Cartesian3, rotation: Quaternion, scale: Cartesian3): Matrix4 = js.native
  def fromTranslationQuaternionRotationScale(translation: Cartesian3, rotation: Quaternion, scale: Cartesian3, result: Matrix4): Matrix4 = js.native
  def fromUniformScale(scale: Double): Matrix4 = js.native
  def fromUniformScale(scale: Double, result: Matrix4): Matrix4 = js.native
  def getColumn(matrix: Matrix4, index: Double, result: Cartesian4): Cartesian4 = js.native
  def getElementIndex(row: Double, column: Double): Double = js.native
  def getMatrix3(matrix: Matrix4, result: Matrix3): Matrix3 = js.native
  def getMaximumScale(matrix: Matrix4): Double = js.native
  def getRow(matrix: Matrix4, index: Double, result: Cartesian4): Cartesian4 = js.native
  def getScale(matrix: Matrix4, result: Cartesian3): Cartesian3 = js.native
  def getTranslation(matrix: Matrix4, result: Cartesian3): Cartesian3 = js.native
  def inverse(matrix: Matrix4, result: Matrix4): Matrix4 = js.native
  def inverseTransformation(matrix: Matrix4, result: Matrix4): Matrix4 = js.native
  def multiply(left: Matrix4, right: Matrix4, result: Matrix4): Matrix4 = js.native
  def multiplyByMatrix3(matrix: Matrix4, rotation: Matrix3, result: Matrix4): Matrix4 = js.native
  def multiplyByPoint(matrix: Matrix4, cartesian: Cartesian3, result: Cartesian3): Cartesian3 = js.native
  def multiplyByPointAsVector(matrix: Matrix4, cartesian: Cartesian3, result: Cartesian3): Cartesian3 = js.native
  def multiplyByScalar(matrix: Matrix4, scalar: Double, result: Matrix4): Matrix4 = js.native
  def multiplyByScale(matrix: Matrix4, scale: Cartesian3, result: Matrix4): Matrix4 = js.native
  def multiplyByTranslation(matrix: Matrix4, translation: Cartesian3, result: Matrix4): Matrix4 = js.native
  def multiplyByUniformScale(matrix: Matrix4, scale: Double, result: Matrix4): Matrix4 = js.native
  def multiplyByVector(matrix: Matrix4, cartesian: Cartesian4, result: Cartesian4): Cartesian4 = js.native
  def multiplyTransformation(left: Matrix4, right: Matrix4, result: Matrix4): Matrix4 = js.native
  def negate(matrix: Matrix4, result: Matrix4): Matrix4 = js.native
  def pack(value: Matrix4, array: js.Array[Double]): js.Array[Double] = js.native
  def pack(value: Matrix4, array: js.Array[Double], startingIndex: Double): js.Array[Double] = js.native
  def setColumn(matrix: Matrix4, index: Double, cartesian: Cartesian4, result: Cartesian4): Matrix4 = js.native
  def setRow(matrix: Matrix4, index: Double, cartesian: Cartesian4, result: Cartesian4): Matrix4 = js.native
  def subtract(left: Matrix4, right: Matrix4, result: Matrix4): Matrix4 = js.native
  def toArray(matrix: Matrix4): js.Array[Double] = js.native
  def toArray(matrix: Matrix4, result: js.Array[Double]): js.Array[Double] = js.native
  def transpose(matrix: Matrix4, result: Matrix4): Matrix4 = js.native
  def unpack(array: js.Array[Double]): Matrix4 = js.native
  def unpack(array: js.Array[Double], startingIndex: js.UndefOr[scala.Nothing], result: Matrix4): Matrix4 = js.native
  def unpack(array: js.Array[Double], startingIndex: Double): Matrix4 = js.native
  def unpack(array: js.Array[Double], startingIndex: Double, result: Matrix4): Matrix4 = js.native
}

