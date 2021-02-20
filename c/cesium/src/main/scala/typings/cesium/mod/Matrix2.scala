package typings.cesium.mod

import org.scalablytyped.runtime.StObject
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
object Matrix2 {
  
  @JSImport("cesium", "Matrix2")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("cesium", "Matrix2.COLUMN0ROW0")
  @js.native
  def COLUMN0ROW0: Double = js.native
  @scala.inline
  def COLUMN0ROW0_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("COLUMN0ROW0")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("cesium", "Matrix2.COLUMN0ROW1")
  @js.native
  def COLUMN0ROW1: Double = js.native
  @scala.inline
  def COLUMN0ROW1_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("COLUMN0ROW1")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("cesium", "Matrix2.COLUMN1ROW0")
  @js.native
  def COLUMN1ROW0: Double = js.native
  @scala.inline
  def COLUMN1ROW0_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("COLUMN1ROW0")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("cesium", "Matrix2.COLUMN1ROW1")
  @js.native
  def COLUMN1ROW1: Double = js.native
  @scala.inline
  def COLUMN1ROW1_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("COLUMN1ROW1")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("cesium", "Matrix2.IDENTITY")
  @js.native
  def IDENTITY: Matrix2 = js.native
  @scala.inline
  def IDENTITY_=(x: Matrix2): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("IDENTITY")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("cesium", "Matrix2.abs")
  @js.native
  def abs(matrix: Matrix2, result: Matrix2): Matrix2 = js.native
  
  /* static member */
  @JSImport("cesium", "Matrix2.add")
  @js.native
  def add(left: Matrix2, right: Matrix2, result: Matrix2): Matrix2 = js.native
  
  /* static member */
  @JSImport("cesium", "Matrix2.clone")
  @js.native
  def clone_(matrix: Matrix2): Matrix2 = js.native
  @JSImport("cesium", "Matrix2.clone")
  @js.native
  def clone_(matrix: Matrix2, result: Matrix2): Matrix2 = js.native
  
  /* static member */
  @JSImport("cesium", "Matrix2.equalsEpsilon")
  @js.native
  def equalsEpsilon(left: Matrix2, right: Matrix2, epsilon: Double): Boolean = js.native
  
  /* static member */
  @JSImport("cesium", "Matrix2.equals")
  @js.native
  def equals_(): Boolean = js.native
  @JSImport("cesium", "Matrix2.equals")
  @js.native
  def equals_(left: js.UndefOr[scala.Nothing], right: Matrix2): Boolean = js.native
  @JSImport("cesium", "Matrix2.equals")
  @js.native
  def equals_(left: Matrix2): Boolean = js.native
  @JSImport("cesium", "Matrix2.equals")
  @js.native
  def equals_(left: Matrix2, right: Matrix2): Boolean = js.native
  
  /* static member */
  @JSImport("cesium", "Matrix2.fromArray")
  @js.native
  def fromArray(array: js.Array[Double]): Matrix2 = js.native
  @JSImport("cesium", "Matrix2.fromArray")
  @js.native
  def fromArray(array: js.Array[Double], startingIndex: js.UndefOr[scala.Nothing], result: Matrix2): Matrix2 = js.native
  @JSImport("cesium", "Matrix2.fromArray")
  @js.native
  def fromArray(array: js.Array[Double], startingIndex: Double): Matrix2 = js.native
  @JSImport("cesium", "Matrix2.fromArray")
  @js.native
  def fromArray(array: js.Array[Double], startingIndex: Double, result: Matrix2): Matrix2 = js.native
  
  /* static member */
  @JSImport("cesium", "Matrix2.fromColumnMajorArray")
  @js.native
  def fromColumnMajorArray(values: js.Array[Double]): Matrix2 = js.native
  @JSImport("cesium", "Matrix2.fromColumnMajorArray")
  @js.native
  def fromColumnMajorArray(values: js.Array[Double], result: Matrix2): Matrix2 = js.native
  
  /* static member */
  @JSImport("cesium", "Matrix2.fromRotation")
  @js.native
  def fromRotation(angle: Double): Matrix2 = js.native
  @JSImport("cesium", "Matrix2.fromRotation")
  @js.native
  def fromRotation(angle: Double, result: Matrix2): Matrix2 = js.native
  
  /* static member */
  @JSImport("cesium", "Matrix2.fromRowMajorArray")
  @js.native
  def fromRowMajorArray(values: js.Array[Double]): Matrix2 = js.native
  @JSImport("cesium", "Matrix2.fromRowMajorArray")
  @js.native
  def fromRowMajorArray(values: js.Array[Double], result: Matrix2): Matrix2 = js.native
  
  /* static member */
  @JSImport("cesium", "Matrix2.fromScale")
  @js.native
  def fromScale(scale: Cartesian2): Matrix2 = js.native
  @JSImport("cesium", "Matrix2.fromScale")
  @js.native
  def fromScale(scale: Cartesian2, result: Matrix2): Matrix2 = js.native
  
  /* static member */
  @JSImport("cesium", "Matrix2.fromUniformScale")
  @js.native
  def fromUniformScale(scale: Double): Matrix2 = js.native
  @JSImport("cesium", "Matrix2.fromUniformScale")
  @js.native
  def fromUniformScale(scale: Double, result: Matrix2): Matrix2 = js.native
  
  /* static member */
  @JSImport("cesium", "Matrix2.getColumn")
  @js.native
  def getColumn(matrix: Matrix2, index: Double, result: Cartesian2): Cartesian2 = js.native
  
  /* static member */
  @JSImport("cesium", "Matrix2.getElementIndex")
  @js.native
  def getElementIndex(row: Double, column: Double): Double = js.native
  
  /* static member */
  @JSImport("cesium", "Matrix2.getMaximumScale")
  @js.native
  def getMaximumScale(matrix: Matrix2): Double = js.native
  
  /* static member */
  @JSImport("cesium", "Matrix2.getRow")
  @js.native
  def getRow(matrix: Matrix2, index: Double, result: Cartesian2): Cartesian2 = js.native
  
  /* static member */
  @JSImport("cesium", "Matrix2.getScale")
  @js.native
  def getScale(matrix: Matrix2, result: Cartesian2): Cartesian2 = js.native
  
  /* static member */
  @JSImport("cesium", "Matrix2.multiply")
  @js.native
  def multiply(left: Matrix2, right: Matrix2, result: Matrix2): Matrix2 = js.native
  
  /* static member */
  @JSImport("cesium", "Matrix2.multiplyByScalar")
  @js.native
  def multiplyByScalar(matrix: Matrix2, scalar: Double, result: Matrix2): Matrix2 = js.native
  
  /* static member */
  @JSImport("cesium", "Matrix2.multiplyByVector")
  @js.native
  def multiplyByVector(matrix: Matrix2, cartesian: Cartesian2, result: Cartesian2): Cartesian2 = js.native
  
  /* static member */
  @JSImport("cesium", "Matrix2.negate")
  @js.native
  def negate(matrix: Matrix2, result: Matrix2): Matrix2 = js.native
  
  /* static member */
  @JSImport("cesium", "Matrix2.pack")
  @js.native
  def pack(value: Matrix2, array: js.Array[Double]): js.Array[Double] = js.native
  @JSImport("cesium", "Matrix2.pack")
  @js.native
  def pack(value: Matrix2, array: js.Array[Double], startingIndex: Double): js.Array[Double] = js.native
  
  /* static member */
  @JSImport("cesium", "Matrix2.setColumn")
  @js.native
  def setColumn(matrix: Matrix2, index: Double, cartesian: Cartesian2, result: Cartesian2): Matrix2 = js.native
  
  /* static member */
  @JSImport("cesium", "Matrix2.setRow")
  @js.native
  def setRow(matrix: Matrix2, index: Double, cartesian: Cartesian2, result: Matrix2): Matrix2 = js.native
  
  /* static member */
  @JSImport("cesium", "Matrix2.subtract")
  @js.native
  def subtract(left: Matrix2, right: Matrix2, result: Matrix2): Matrix2 = js.native
  
  /* static member */
  @JSImport("cesium", "Matrix2.toArray")
  @js.native
  def toArray(matrix: Matrix2): js.Array[Double] = js.native
  @JSImport("cesium", "Matrix2.toArray")
  @js.native
  def toArray(matrix: Matrix2, result: js.Array[Double]): js.Array[Double] = js.native
  
  /* static member */
  @JSImport("cesium", "Matrix2.transpose")
  @js.native
  def transpose(matrix: Matrix2, result: Matrix2): Matrix2 = js.native
  
  /* static member */
  @JSImport("cesium", "Matrix2.unpack")
  @js.native
  def unpack(array: js.Array[Double]): Matrix2 = js.native
  @JSImport("cesium", "Matrix2.unpack")
  @js.native
  def unpack(array: js.Array[Double], startingIndex: js.UndefOr[scala.Nothing], result: Matrix2): Matrix2 = js.native
  @JSImport("cesium", "Matrix2.unpack")
  @js.native
  def unpack(array: js.Array[Double], startingIndex: Double): Matrix2 = js.native
  @JSImport("cesium", "Matrix2.unpack")
  @js.native
  def unpack(array: js.Array[Double], startingIndex: Double, result: Matrix2): Matrix2 = js.native
}
