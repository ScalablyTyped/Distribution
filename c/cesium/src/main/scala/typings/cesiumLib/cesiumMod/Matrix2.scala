package typings
package cesiumLib.cesiumMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "Matrix2")
@js.native
class Matrix2 () extends Packable {
  def this(column0Row0: scala.Double) = this()
  def this(column0Row0: scala.Double, column1Row0: scala.Double) = this()
  def this(column0Row0: scala.Double, column1Row0: scala.Double, column0Row1: scala.Double) = this()
  def this(column0Row0: scala.Double, column1Row0: scala.Double, column0Row1: scala.Double, column1Row1: scala.Double) = this()
  def clone(result: Matrix2): Matrix2 = js.native
  def equals(): scala.Boolean = js.native
  def equals(right: Matrix2): scala.Boolean = js.native
  def equalsEpsilon(right: Matrix2, epsilon: scala.Double): scala.Boolean = js.native
}

/* static members */
@JSImport("cesium", "Matrix2")
@js.native
object Matrix2 extends js.Object {
  var COLUMN0ROW0: scala.Double = js.native
  var COLUMN0ROW1: scala.Double = js.native
  var COLUMN1ROW0: scala.Double = js.native
  var COLUMN1ROW1: scala.Double = js.native
  var IDENTITY: cesiumLib.cesiumMod.Matrix2 = js.native
  def abs(matrix: cesiumLib.cesiumMod.Matrix2, result: cesiumLib.cesiumMod.Matrix2): cesiumLib.cesiumMod.Matrix2 = js.native
  def add(
    left: cesiumLib.cesiumMod.Matrix2,
    right: cesiumLib.cesiumMod.Matrix2,
    result: cesiumLib.cesiumMod.Matrix2
  ): cesiumLib.cesiumMod.Matrix2 = js.native
  def clone(matrix: cesiumLib.cesiumMod.Matrix2): cesiumLib.cesiumMod.Matrix2 = js.native
  def clone(matrix: cesiumLib.cesiumMod.Matrix2, result: cesiumLib.cesiumMod.Matrix2): cesiumLib.cesiumMod.Matrix2 = js.native
  def equals(): scala.Boolean = js.native
  def equals(left: cesiumLib.cesiumMod.Matrix2): scala.Boolean = js.native
  def equals(left: cesiumLib.cesiumMod.Matrix2, right: cesiumLib.cesiumMod.Matrix2): scala.Boolean = js.native
  def equalsEpsilon(left: cesiumLib.cesiumMod.Matrix2, right: cesiumLib.cesiumMod.Matrix2, epsilon: scala.Double): scala.Boolean = js.native
  def fromArray(array: js.Array[scala.Double]): cesiumLib.cesiumMod.Matrix2 = js.native
  def fromArray(array: js.Array[scala.Double], startingIndex: scala.Double): cesiumLib.cesiumMod.Matrix2 = js.native
  def fromArray(array: js.Array[scala.Double], startingIndex: scala.Double, result: cesiumLib.cesiumMod.Matrix2): cesiumLib.cesiumMod.Matrix2 = js.native
  def fromColumnMajorArray(values: js.Array[scala.Double]): cesiumLib.cesiumMod.Matrix2 = js.native
  def fromColumnMajorArray(values: js.Array[scala.Double], result: cesiumLib.cesiumMod.Matrix2): cesiumLib.cesiumMod.Matrix2 = js.native
  def fromRotation(angle: scala.Double): cesiumLib.cesiumMod.Matrix2 = js.native
  def fromRotation(angle: scala.Double, result: cesiumLib.cesiumMod.Matrix2): cesiumLib.cesiumMod.Matrix2 = js.native
  def fromRowMajorArray(values: js.Array[scala.Double]): cesiumLib.cesiumMod.Matrix2 = js.native
  def fromRowMajorArray(values: js.Array[scala.Double], result: cesiumLib.cesiumMod.Matrix2): cesiumLib.cesiumMod.Matrix2 = js.native
  def fromScale(scale: cesiumLib.cesiumMod.Cartesian2): cesiumLib.cesiumMod.Matrix2 = js.native
  def fromScale(scale: cesiumLib.cesiumMod.Cartesian2, result: cesiumLib.cesiumMod.Matrix2): cesiumLib.cesiumMod.Matrix2 = js.native
  def fromUniformScale(scale: scala.Double): cesiumLib.cesiumMod.Matrix2 = js.native
  def fromUniformScale(scale: scala.Double, result: cesiumLib.cesiumMod.Matrix2): cesiumLib.cesiumMod.Matrix2 = js.native
  def getColumn(matrix: cesiumLib.cesiumMod.Matrix2, index: scala.Double, result: cesiumLib.cesiumMod.Cartesian2): cesiumLib.cesiumMod.Cartesian2 = js.native
  def getElementIndex(row: scala.Double, column: scala.Double): scala.Double = js.native
  def getMaximumScale(matrix: cesiumLib.cesiumMod.Matrix2): scala.Double = js.native
  def getRow(matrix: cesiumLib.cesiumMod.Matrix2, index: scala.Double, result: cesiumLib.cesiumMod.Cartesian2): cesiumLib.cesiumMod.Cartesian2 = js.native
  def getScale(matrix: cesiumLib.cesiumMod.Matrix2, result: cesiumLib.cesiumMod.Cartesian2): cesiumLib.cesiumMod.Cartesian2 = js.native
  def multiply(
    left: cesiumLib.cesiumMod.Matrix2,
    right: cesiumLib.cesiumMod.Matrix2,
    result: cesiumLib.cesiumMod.Matrix2
  ): cesiumLib.cesiumMod.Matrix2 = js.native
  def multiplyByScalar(matrix: cesiumLib.cesiumMod.Matrix2, scalar: scala.Double, result: cesiumLib.cesiumMod.Matrix2): cesiumLib.cesiumMod.Matrix2 = js.native
  def multiplyByVector(
    matrix: cesiumLib.cesiumMod.Matrix2,
    cartesian: cesiumLib.cesiumMod.Cartesian2,
    result: cesiumLib.cesiumMod.Cartesian2
  ): cesiumLib.cesiumMod.Cartesian2 = js.native
  def negate(matrix: cesiumLib.cesiumMod.Matrix2, result: cesiumLib.cesiumMod.Matrix2): cesiumLib.cesiumMod.Matrix2 = js.native
  def pack(value: cesiumLib.cesiumMod.Matrix2, array: js.Array[scala.Double]): js.Array[scala.Double] = js.native
  def pack(value: cesiumLib.cesiumMod.Matrix2, array: js.Array[scala.Double], startingIndex: scala.Double): js.Array[scala.Double] = js.native
  def setColumn(
    matrix: cesiumLib.cesiumMod.Matrix2,
    index: scala.Double,
    cartesian: cesiumLib.cesiumMod.Cartesian2,
    result: cesiumLib.cesiumMod.Cartesian2
  ): cesiumLib.cesiumMod.Matrix2 = js.native
  def setRow(
    matrix: cesiumLib.cesiumMod.Matrix2,
    index: scala.Double,
    cartesian: cesiumLib.cesiumMod.Cartesian2,
    result: cesiumLib.cesiumMod.Matrix2
  ): cesiumLib.cesiumMod.Matrix2 = js.native
  def subtract(
    left: cesiumLib.cesiumMod.Matrix2,
    right: cesiumLib.cesiumMod.Matrix2,
    result: cesiumLib.cesiumMod.Matrix2
  ): cesiumLib.cesiumMod.Matrix2 = js.native
  def toArray(matrix: cesiumLib.cesiumMod.Matrix2): js.Array[scala.Double] = js.native
  def toArray(matrix: cesiumLib.cesiumMod.Matrix2, result: js.Array[scala.Double]): js.Array[scala.Double] = js.native
  def transpose(matrix: cesiumLib.cesiumMod.Matrix2, result: cesiumLib.cesiumMod.Matrix2): cesiumLib.cesiumMod.Matrix2 = js.native
  def unpack(array: js.Array[scala.Double]): cesiumLib.cesiumMod.Matrix2 = js.native
  def unpack(array: js.Array[scala.Double], startingIndex: scala.Double): cesiumLib.cesiumMod.Matrix2 = js.native
  def unpack(array: js.Array[scala.Double], startingIndex: scala.Double, result: cesiumLib.cesiumMod.Matrix2): cesiumLib.cesiumMod.Matrix2 = js.native
}

