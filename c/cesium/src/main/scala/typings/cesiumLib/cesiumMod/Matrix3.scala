package typings
package cesiumLib.cesiumMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "Matrix3")
@js.native
class Matrix3 protected () extends Packable {
  def this(column0Row0: js.UndefOr[scala.Double], column1Row0: js.UndefOr[scala.Double], column2Row0: js.UndefOr[scala.Double], column0Row1: js.UndefOr[scala.Double], column1Row1: js.UndefOr[scala.Double], column2Row1: js.UndefOr[scala.Double], column0Row2: js.UndefOr[scala.Double], column1Row2: js.UndefOr[scala.Double], column2Row2: js.UndefOr[scala.Double]) = this()
  def clone(result: Matrix3): Matrix3 = js.native
  def equals(): scala.Boolean = js.native
  def equals(right: Matrix3): scala.Boolean = js.native
  def equalsEpsilon(right: Matrix3, epsilon: scala.Double): scala.Boolean = js.native
}

/* static members */
@JSImport("cesium", "Matrix3")
@js.native
object Matrix3 extends js.Object {
  var COLUMN0ROW0: scala.Double = js.native
  var COLUMN0ROW1: scala.Double = js.native
  var COLUMN0ROW2: scala.Double = js.native
  var COLUMN1ROW0: scala.Double = js.native
  var COLUMN1ROW1: scala.Double = js.native
  var COLUMN1ROW2: scala.Double = js.native
  var COLUMN2ROW0: scala.Double = js.native
  var COLUMN2ROW1: scala.Double = js.native
  var COLUMN2ROW2: scala.Double = js.native
  var IDENTITY: cesiumLib.cesiumMod.Matrix3 = js.native
  def abs(matrix: cesiumLib.cesiumMod.Matrix3, result: cesiumLib.cesiumMod.Matrix3): cesiumLib.cesiumMod.Matrix3 = js.native
  def add(
    left: cesiumLib.cesiumMod.Matrix3,
    right: cesiumLib.cesiumMod.Matrix3,
    result: cesiumLib.cesiumMod.Matrix3
  ): cesiumLib.cesiumMod.Matrix3 = js.native
  def clone(matrix: cesiumLib.cesiumMod.Matrix3): cesiumLib.cesiumMod.Matrix3 = js.native
  def clone(matrix: cesiumLib.cesiumMod.Matrix3, result: cesiumLib.cesiumMod.Matrix3): cesiumLib.cesiumMod.Matrix3 = js.native
  def computeEigenDecomposition(matrix: cesiumLib.cesiumMod.Matrix3): js.Any = js.native
  def computeEigenDecomposition(matrix: cesiumLib.cesiumMod.Matrix3, result: js.Any): js.Any = js.native
  def determinant(matrix: cesiumLib.cesiumMod.Matrix3): scala.Double = js.native
  def equals(): scala.Boolean = js.native
  def equals(left: cesiumLib.cesiumMod.Matrix3): scala.Boolean = js.native
  def equals(left: cesiumLib.cesiumMod.Matrix3, right: cesiumLib.cesiumMod.Matrix3): scala.Boolean = js.native
  def equalsEpsilon(left: cesiumLib.cesiumMod.Matrix3, right: cesiumLib.cesiumMod.Matrix3, epsilon: scala.Double): scala.Boolean = js.native
  def fromArray(array: js.Array[scala.Double]): cesiumLib.cesiumMod.Matrix3 = js.native
  def fromArray(array: js.Array[scala.Double], startingIndex: scala.Double): cesiumLib.cesiumMod.Matrix3 = js.native
  def fromArray(array: js.Array[scala.Double], startingIndex: scala.Double, result: cesiumLib.cesiumMod.Matrix3): cesiumLib.cesiumMod.Matrix3 = js.native
  def fromColumnMajorArray(values: js.Array[scala.Double]): cesiumLib.cesiumMod.Matrix3 = js.native
  def fromColumnMajorArray(values: js.Array[scala.Double], result: cesiumLib.cesiumMod.Matrix3): cesiumLib.cesiumMod.Matrix3 = js.native
  def fromCrossProduct(the: cesiumLib.cesiumMod.Cartesian3): cesiumLib.cesiumMod.Matrix3 = js.native
  def fromCrossProduct(the: cesiumLib.cesiumMod.Cartesian3, result: cesiumLib.cesiumMod.Matrix3): cesiumLib.cesiumMod.Matrix3 = js.native
  def fromHeadingPitchRoll(headingPitchRoll: cesiumLib.cesiumMod.HeadingPitchRoll): cesiumLib.cesiumMod.Matrix3 = js.native
  def fromHeadingPitchRoll(headingPitchRoll: cesiumLib.cesiumMod.HeadingPitchRoll, result: cesiumLib.cesiumMod.Matrix3): cesiumLib.cesiumMod.Matrix3 = js.native
  def fromQuaternion(quaternion: cesiumLib.cesiumMod.Quaternion): cesiumLib.cesiumMod.Matrix3 = js.native
  def fromRotationX(angle: scala.Double): cesiumLib.cesiumMod.Matrix3 = js.native
  def fromRotationX(angle: scala.Double, result: cesiumLib.cesiumMod.Matrix3): cesiumLib.cesiumMod.Matrix3 = js.native
  def fromRotationY(angle: scala.Double): cesiumLib.cesiumMod.Matrix3 = js.native
  def fromRotationY(angle: scala.Double, result: cesiumLib.cesiumMod.Matrix3): cesiumLib.cesiumMod.Matrix3 = js.native
  def fromRotationZ(angle: scala.Double): cesiumLib.cesiumMod.Matrix3 = js.native
  def fromRotationZ(angle: scala.Double, result: cesiumLib.cesiumMod.Matrix3): cesiumLib.cesiumMod.Matrix3 = js.native
  def fromRowMajorArray(values: js.Array[scala.Double]): cesiumLib.cesiumMod.Matrix3 = js.native
  def fromRowMajorArray(values: js.Array[scala.Double], result: cesiumLib.cesiumMod.Matrix3): cesiumLib.cesiumMod.Matrix3 = js.native
  def fromScale(scale: cesiumLib.cesiumMod.Cartesian3): cesiumLib.cesiumMod.Matrix3 = js.native
  def fromScale(scale: cesiumLib.cesiumMod.Cartesian3, result: cesiumLib.cesiumMod.Matrix3): cesiumLib.cesiumMod.Matrix3 = js.native
  def fromUniformScale(scale: scala.Double): cesiumLib.cesiumMod.Matrix3 = js.native
  def fromUniformScale(scale: scala.Double, result: cesiumLib.cesiumMod.Matrix3): cesiumLib.cesiumMod.Matrix3 = js.native
  def getColumn(matrix: cesiumLib.cesiumMod.Matrix3, index: scala.Double, result: cesiumLib.cesiumMod.Cartesian3): cesiumLib.cesiumMod.Cartesian3 = js.native
  def getElementIndex(row: scala.Double, column: scala.Double): scala.Double = js.native
  def getMaximumScale(matrix: cesiumLib.cesiumMod.Matrix3): scala.Double = js.native
  def getRow(matrix: cesiumLib.cesiumMod.Matrix3, index: scala.Double, result: cesiumLib.cesiumMod.Cartesian3): cesiumLib.cesiumMod.Cartesian3 = js.native
  def getScale(matrix: cesiumLib.cesiumMod.Matrix3, result: cesiumLib.cesiumMod.Cartesian3): cesiumLib.cesiumMod.Cartesian3 = js.native
  def inverse(matrix: cesiumLib.cesiumMod.Matrix3, result: cesiumLib.cesiumMod.Matrix3): cesiumLib.cesiumMod.Matrix3 = js.native
  def multiply(
    left: cesiumLib.cesiumMod.Matrix3,
    right: cesiumLib.cesiumMod.Matrix3,
    result: cesiumLib.cesiumMod.Matrix3
  ): cesiumLib.cesiumMod.Matrix3 = js.native
  def multiplyByScalar(matrix: cesiumLib.cesiumMod.Matrix3, scalar: scala.Double, result: cesiumLib.cesiumMod.Matrix3): cesiumLib.cesiumMod.Matrix3 = js.native
  def multiplyByVector(
    matrix: cesiumLib.cesiumMod.Matrix3,
    cartesian: cesiumLib.cesiumMod.Cartesian3,
    result: cesiumLib.cesiumMod.Cartesian3
  ): cesiumLib.cesiumMod.Cartesian3 = js.native
  def negate(matrix: cesiumLib.cesiumMod.Matrix3, result: cesiumLib.cesiumMod.Matrix3): cesiumLib.cesiumMod.Matrix3 = js.native
  def pack(value: cesiumLib.cesiumMod.Matrix3, array: js.Array[scala.Double]): js.Array[scala.Double] = js.native
  def pack(value: cesiumLib.cesiumMod.Matrix3, array: js.Array[scala.Double], startingIndex: scala.Double): js.Array[scala.Double] = js.native
  def setColumn(
    matrix: cesiumLib.cesiumMod.Matrix3,
    index: scala.Double,
    cartesian: cesiumLib.cesiumMod.Cartesian3,
    result: cesiumLib.cesiumMod.Cartesian3
  ): cesiumLib.cesiumMod.Matrix3 = js.native
  def setRow(
    matrix: cesiumLib.cesiumMod.Matrix3,
    index: scala.Double,
    cartesian: cesiumLib.cesiumMod.Cartesian3,
    result: cesiumLib.cesiumMod.Cartesian3
  ): cesiumLib.cesiumMod.Matrix3 = js.native
  def subtract(
    left: cesiumLib.cesiumMod.Matrix3,
    right: cesiumLib.cesiumMod.Matrix3,
    result: cesiumLib.cesiumMod.Matrix3
  ): cesiumLib.cesiumMod.Matrix3 = js.native
  def toArray(matrix: cesiumLib.cesiumMod.Matrix3): js.Array[scala.Double] = js.native
  def toArray(matrix: cesiumLib.cesiumMod.Matrix3, result: js.Array[scala.Double]): js.Array[scala.Double] = js.native
  def transpose(matrix: cesiumLib.cesiumMod.Matrix3, result: cesiumLib.cesiumMod.Matrix3): cesiumLib.cesiumMod.Matrix3 = js.native
  def unpack(array: js.Array[scala.Double]): cesiumLib.cesiumMod.Matrix3 = js.native
  def unpack(array: js.Array[scala.Double], startingIndex: scala.Double): cesiumLib.cesiumMod.Matrix3 = js.native
  def unpack(array: js.Array[scala.Double], startingIndex: scala.Double, result: cesiumLib.cesiumMod.Matrix3): cesiumLib.cesiumMod.Matrix3 = js.native
}

