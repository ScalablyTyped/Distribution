package typings.cesium.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cesium", "Matrix2")
@js.native
class Matrix2 () extends Packable {
  def this(column0Row0: Double) = this()
  def this(column0Row0: js.UndefOr[scala.Nothing], column1Row0: Double) = this()
  def this(column0Row0: Double, column1Row0: Double) = this()
  def this(
    column0Row0: js.UndefOr[scala.Nothing],
    column1Row0: js.UndefOr[scala.Nothing],
    column0Row1: Double
  ) = this()
  def this(column0Row0: js.UndefOr[scala.Nothing], column1Row0: Double, column0Row1: Double) = this()
  def this(column0Row0: Double, column1Row0: js.UndefOr[scala.Nothing], column0Row1: Double) = this()
  def this(column0Row0: Double, column1Row0: Double, column0Row1: Double) = this()
  def this(
    column0Row0: js.UndefOr[scala.Nothing],
    column1Row0: js.UndefOr[scala.Nothing],
    column0Row1: js.UndefOr[scala.Nothing],
    column1Row1: Double
  ) = this()
  def this(
    column0Row0: js.UndefOr[scala.Nothing],
    column1Row0: js.UndefOr[scala.Nothing],
    column0Row1: Double,
    column1Row1: Double
  ) = this()
  def this(
    column0Row0: js.UndefOr[scala.Nothing],
    column1Row0: Double,
    column0Row1: js.UndefOr[scala.Nothing],
    column1Row1: Double
  ) = this()
  def this(
    column0Row0: js.UndefOr[scala.Nothing],
    column1Row0: Double,
    column0Row1: Double,
    column1Row1: Double
  ) = this()
  def this(
    column0Row0: Double,
    column1Row0: js.UndefOr[scala.Nothing],
    column0Row1: js.UndefOr[scala.Nothing],
    column1Row1: Double
  ) = this()
  def this(
    column0Row0: Double,
    column1Row0: js.UndefOr[scala.Nothing],
    column0Row1: Double,
    column1Row1: Double
  ) = this()
  def this(
    column0Row0: Double,
    column1Row0: Double,
    column0Row1: js.UndefOr[scala.Nothing],
    column1Row1: Double
  ) = this()
  def this(column0Row0: Double, column1Row0: Double, column0Row1: Double, column1Row1: Double) = this()
  
  def clone(result: Matrix2): Matrix2 = js.native
  
  def equals(): Boolean = js.native
  def equals(right: Matrix2): Boolean = js.native
  
  def equalsEpsilon(right: Matrix2, epsilon: Double): Boolean = js.native
}
/* static members */
@JSImport("cesium", "Matrix2")
@js.native
object Matrix2 extends js.Object {
  
  var COLUMN0ROW0: Double = js.native
  
  var COLUMN0ROW1: Double = js.native
  
  var COLUMN1ROW0: Double = js.native
  
  var COLUMN1ROW1: Double = js.native
  
  var IDENTITY: Matrix2 = js.native
  
  def abs(matrix: Matrix2, result: Matrix2): Matrix2 = js.native
  
  def add(left: Matrix2, right: Matrix2, result: Matrix2): Matrix2 = js.native
  
  def clone(matrix: Matrix2): Matrix2 = js.native
  def clone(matrix: Matrix2, result: Matrix2): Matrix2 = js.native
  
  def equals(): Boolean = js.native
  def equals(left: js.UndefOr[scala.Nothing], right: Matrix2): Boolean = js.native
  def equals(left: Matrix2): Boolean = js.native
  def equals(left: Matrix2, right: Matrix2): Boolean = js.native
  
  def equalsEpsilon(left: Matrix2, right: Matrix2, epsilon: Double): Boolean = js.native
  
  def fromArray(array: js.Array[Double]): Matrix2 = js.native
  def fromArray(array: js.Array[Double], startingIndex: js.UndefOr[scala.Nothing], result: Matrix2): Matrix2 = js.native
  def fromArray(array: js.Array[Double], startingIndex: Double): Matrix2 = js.native
  def fromArray(array: js.Array[Double], startingIndex: Double, result: Matrix2): Matrix2 = js.native
  
  def fromColumnMajorArray(values: js.Array[Double]): Matrix2 = js.native
  def fromColumnMajorArray(values: js.Array[Double], result: Matrix2): Matrix2 = js.native
  
  def fromRotation(angle: Double): Matrix2 = js.native
  def fromRotation(angle: Double, result: Matrix2): Matrix2 = js.native
  
  def fromRowMajorArray(values: js.Array[Double]): Matrix2 = js.native
  def fromRowMajorArray(values: js.Array[Double], result: Matrix2): Matrix2 = js.native
  
  def fromScale(scale: Cartesian2): Matrix2 = js.native
  def fromScale(scale: Cartesian2, result: Matrix2): Matrix2 = js.native
  
  def fromUniformScale(scale: Double): Matrix2 = js.native
  def fromUniformScale(scale: Double, result: Matrix2): Matrix2 = js.native
  
  def getColumn(matrix: Matrix2, index: Double, result: Cartesian2): Cartesian2 = js.native
  
  def getElementIndex(row: Double, column: Double): Double = js.native
  
  def getMaximumScale(matrix: Matrix2): Double = js.native
  
  def getRow(matrix: Matrix2, index: Double, result: Cartesian2): Cartesian2 = js.native
  
  def getScale(matrix: Matrix2, result: Cartesian2): Cartesian2 = js.native
  
  def multiply(left: Matrix2, right: Matrix2, result: Matrix2): Matrix2 = js.native
  
  def multiplyByScalar(matrix: Matrix2, scalar: Double, result: Matrix2): Matrix2 = js.native
  
  def multiplyByVector(matrix: Matrix2, cartesian: Cartesian2, result: Cartesian2): Cartesian2 = js.native
  
  def negate(matrix: Matrix2, result: Matrix2): Matrix2 = js.native
  
  def pack(value: Matrix2, array: js.Array[Double]): js.Array[Double] = js.native
  def pack(value: Matrix2, array: js.Array[Double], startingIndex: Double): js.Array[Double] = js.native
  
  def setColumn(matrix: Matrix2, index: Double, cartesian: Cartesian2, result: Cartesian2): Matrix2 = js.native
  
  def setRow(matrix: Matrix2, index: Double, cartesian: Cartesian2, result: Matrix2): Matrix2 = js.native
  
  def subtract(left: Matrix2, right: Matrix2, result: Matrix2): Matrix2 = js.native
  
  def toArray(matrix: Matrix2): js.Array[Double] = js.native
  def toArray(matrix: Matrix2, result: js.Array[Double]): js.Array[Double] = js.native
  
  def transpose(matrix: Matrix2, result: Matrix2): Matrix2 = js.native
  
  def unpack(array: js.Array[Double]): Matrix2 = js.native
  def unpack(array: js.Array[Double], startingIndex: js.UndefOr[scala.Nothing], result: Matrix2): Matrix2 = js.native
  def unpack(array: js.Array[Double], startingIndex: Double): Matrix2 = js.native
  def unpack(array: js.Array[Double], startingIndex: Double, result: Matrix2): Matrix2 = js.native
}
