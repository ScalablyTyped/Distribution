package typings.cesium.cesiumMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "Matrix3")
@js.native
class Matrix3 protected () extends Packable {
  def this(
    column0Row0: js.UndefOr[Double],
    column1Row0: js.UndefOr[Double],
    column2Row0: js.UndefOr[Double],
    column0Row1: js.UndefOr[Double],
    column1Row1: js.UndefOr[Double],
    column2Row1: js.UndefOr[Double],
    column0Row2: js.UndefOr[Double],
    column1Row2: js.UndefOr[Double],
    column2Row2: js.UndefOr[Double]
  ) = this()
  def clone(result: Matrix3): Matrix3 = js.native
  def equals(): Boolean = js.native
  def equals(right: Matrix3): Boolean = js.native
  def equalsEpsilon(right: Matrix3, epsilon: Double): Boolean = js.native
}

/* static members */
@JSImport("cesium", "Matrix3")
@js.native
object Matrix3 extends js.Object {
  var COLUMN0ROW0: Double = js.native
  var COLUMN0ROW1: Double = js.native
  var COLUMN0ROW2: Double = js.native
  var COLUMN1ROW0: Double = js.native
  var COLUMN1ROW1: Double = js.native
  var COLUMN1ROW2: Double = js.native
  var COLUMN2ROW0: Double = js.native
  var COLUMN2ROW1: Double = js.native
  var COLUMN2ROW2: Double = js.native
  var IDENTITY: Matrix3 = js.native
  def abs(matrix: Matrix3, result: Matrix3): Matrix3 = js.native
  def add(left: Matrix3, right: Matrix3, result: Matrix3): Matrix3 = js.native
  def clone(matrix: Matrix3): Matrix3 = js.native
  def clone(matrix: Matrix3, result: Matrix3): Matrix3 = js.native
  def computeEigenDecomposition(matrix: Matrix3): js.Any = js.native
  def computeEigenDecomposition(matrix: Matrix3, result: js.Any): js.Any = js.native
  def determinant(matrix: Matrix3): Double = js.native
  def equals(): Boolean = js.native
  def equals(left: Matrix3): Boolean = js.native
  def equals(left: Matrix3, right: Matrix3): Boolean = js.native
  def equalsEpsilon(left: Matrix3, right: Matrix3, epsilon: Double): Boolean = js.native
  def fromArray(array: js.Array[Double]): Matrix3 = js.native
  def fromArray(array: js.Array[Double], startingIndex: Double): Matrix3 = js.native
  def fromArray(array: js.Array[Double], startingIndex: Double, result: Matrix3): Matrix3 = js.native
  def fromColumnMajorArray(values: js.Array[Double]): Matrix3 = js.native
  def fromColumnMajorArray(values: js.Array[Double], result: Matrix3): Matrix3 = js.native
  def fromCrossProduct(the: Cartesian3): Matrix3 = js.native
  def fromCrossProduct(the: Cartesian3, result: Matrix3): Matrix3 = js.native
  def fromHeadingPitchRoll(headingPitchRoll: HeadingPitchRoll): Matrix3 = js.native
  def fromHeadingPitchRoll(headingPitchRoll: HeadingPitchRoll, result: Matrix3): Matrix3 = js.native
  def fromQuaternion(quaternion: Quaternion): Matrix3 = js.native
  def fromRotationX(angle: Double): Matrix3 = js.native
  def fromRotationX(angle: Double, result: Matrix3): Matrix3 = js.native
  def fromRotationY(angle: Double): Matrix3 = js.native
  def fromRotationY(angle: Double, result: Matrix3): Matrix3 = js.native
  def fromRotationZ(angle: Double): Matrix3 = js.native
  def fromRotationZ(angle: Double, result: Matrix3): Matrix3 = js.native
  def fromRowMajorArray(values: js.Array[Double]): Matrix3 = js.native
  def fromRowMajorArray(values: js.Array[Double], result: Matrix3): Matrix3 = js.native
  def fromScale(scale: Cartesian3): Matrix3 = js.native
  def fromScale(scale: Cartesian3, result: Matrix3): Matrix3 = js.native
  def fromUniformScale(scale: Double): Matrix3 = js.native
  def fromUniformScale(scale: Double, result: Matrix3): Matrix3 = js.native
  def getColumn(matrix: Matrix3, index: Double, result: Cartesian3): Cartesian3 = js.native
  def getElementIndex(row: Double, column: Double): Double = js.native
  def getMaximumScale(matrix: Matrix3): Double = js.native
  def getRotation(matrix: Matrix3, result: Matrix3): Matrix3 = js.native
  def getRow(matrix: Matrix3, index: Double, result: Cartesian3): Cartesian3 = js.native
  def getScale(matrix: Matrix3, result: Cartesian3): Cartesian3 = js.native
  def inverse(matrix: Matrix3, result: Matrix3): Matrix3 = js.native
  def multiply(left: Matrix3, right: Matrix3, result: Matrix3): Matrix3 = js.native
  def multiplyByScalar(matrix: Matrix3, scalar: Double, result: Matrix3): Matrix3 = js.native
  def multiplyByVector(matrix: Matrix3, cartesian: Cartesian3, result: Cartesian3): Cartesian3 = js.native
  def negate(matrix: Matrix3, result: Matrix3): Matrix3 = js.native
  def pack(value: Matrix3, array: js.Array[Double]): js.Array[Double] = js.native
  def pack(value: Matrix3, array: js.Array[Double], startingIndex: Double): js.Array[Double] = js.native
  def setColumn(matrix: Matrix3, index: Double, cartesian: Cartesian3, result: Cartesian3): Matrix3 = js.native
  def setRow(matrix: Matrix3, index: Double, cartesian: Cartesian3, result: Cartesian3): Matrix3 = js.native
  def subtract(left: Matrix3, right: Matrix3, result: Matrix3): Matrix3 = js.native
  def toArray(matrix: Matrix3): js.Array[Double] = js.native
  def toArray(matrix: Matrix3, result: js.Array[Double]): js.Array[Double] = js.native
  def transpose(matrix: Matrix3, result: Matrix3): Matrix3 = js.native
  def unpack(array: js.Array[Double]): Matrix3 = js.native
  def unpack(array: js.Array[Double], startingIndex: Double): Matrix3 = js.native
  def unpack(array: js.Array[Double], startingIndex: Double, result: Matrix3): Matrix3 = js.native
}

