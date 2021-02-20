package typings.cesium.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
object Matrix3 {
  
  @JSImport("cesium", "Matrix3")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("cesium", "Matrix3.COLUMN0ROW0")
  @js.native
  def COLUMN0ROW0: Double = js.native
  @scala.inline
  def COLUMN0ROW0_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("COLUMN0ROW0")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("cesium", "Matrix3.COLUMN0ROW1")
  @js.native
  def COLUMN0ROW1: Double = js.native
  @scala.inline
  def COLUMN0ROW1_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("COLUMN0ROW1")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("cesium", "Matrix3.COLUMN0ROW2")
  @js.native
  def COLUMN0ROW2: Double = js.native
  @scala.inline
  def COLUMN0ROW2_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("COLUMN0ROW2")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("cesium", "Matrix3.COLUMN1ROW0")
  @js.native
  def COLUMN1ROW0: Double = js.native
  @scala.inline
  def COLUMN1ROW0_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("COLUMN1ROW0")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("cesium", "Matrix3.COLUMN1ROW1")
  @js.native
  def COLUMN1ROW1: Double = js.native
  @scala.inline
  def COLUMN1ROW1_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("COLUMN1ROW1")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("cesium", "Matrix3.COLUMN1ROW2")
  @js.native
  def COLUMN1ROW2: Double = js.native
  @scala.inline
  def COLUMN1ROW2_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("COLUMN1ROW2")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("cesium", "Matrix3.COLUMN2ROW0")
  @js.native
  def COLUMN2ROW0: Double = js.native
  @scala.inline
  def COLUMN2ROW0_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("COLUMN2ROW0")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("cesium", "Matrix3.COLUMN2ROW1")
  @js.native
  def COLUMN2ROW1: Double = js.native
  @scala.inline
  def COLUMN2ROW1_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("COLUMN2ROW1")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("cesium", "Matrix3.COLUMN2ROW2")
  @js.native
  def COLUMN2ROW2: Double = js.native
  @scala.inline
  def COLUMN2ROW2_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("COLUMN2ROW2")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("cesium", "Matrix3.IDENTITY")
  @js.native
  def IDENTITY: Matrix3 = js.native
  @scala.inline
  def IDENTITY_=(x: Matrix3): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("IDENTITY")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("cesium", "Matrix3.abs")
  @js.native
  def abs(matrix: Matrix3, result: Matrix3): Matrix3 = js.native
  
  /* static member */
  @JSImport("cesium", "Matrix3.add")
  @js.native
  def add(left: Matrix3, right: Matrix3, result: Matrix3): Matrix3 = js.native
  
  /* static member */
  @JSImport("cesium", "Matrix3.clone")
  @js.native
  def clone_(matrix: Matrix3): Matrix3 = js.native
  @JSImport("cesium", "Matrix3.clone")
  @js.native
  def clone_(matrix: Matrix3, result: Matrix3): Matrix3 = js.native
  
  /* static member */
  @JSImport("cesium", "Matrix3.computeEigenDecomposition")
  @js.native
  def computeEigenDecomposition(matrix: Matrix3): js.Any = js.native
  @JSImport("cesium", "Matrix3.computeEigenDecomposition")
  @js.native
  def computeEigenDecomposition(matrix: Matrix3, result: js.Any): js.Any = js.native
  
  /* static member */
  @JSImport("cesium", "Matrix3.determinant")
  @js.native
  def determinant(matrix: Matrix3): Double = js.native
  
  /* static member */
  @JSImport("cesium", "Matrix3.equalsEpsilon")
  @js.native
  def equalsEpsilon(left: Matrix3, right: Matrix3, epsilon: Double): Boolean = js.native
  
  /* static member */
  @JSImport("cesium", "Matrix3.equals")
  @js.native
  def equals_(): Boolean = js.native
  @JSImport("cesium", "Matrix3.equals")
  @js.native
  def equals_(left: js.UndefOr[scala.Nothing], right: Matrix3): Boolean = js.native
  @JSImport("cesium", "Matrix3.equals")
  @js.native
  def equals_(left: Matrix3): Boolean = js.native
  @JSImport("cesium", "Matrix3.equals")
  @js.native
  def equals_(left: Matrix3, right: Matrix3): Boolean = js.native
  
  /* static member */
  @JSImport("cesium", "Matrix3.fromArray")
  @js.native
  def fromArray(array: js.Array[Double]): Matrix3 = js.native
  @JSImport("cesium", "Matrix3.fromArray")
  @js.native
  def fromArray(array: js.Array[Double], startingIndex: js.UndefOr[scala.Nothing], result: Matrix3): Matrix3 = js.native
  @JSImport("cesium", "Matrix3.fromArray")
  @js.native
  def fromArray(array: js.Array[Double], startingIndex: Double): Matrix3 = js.native
  @JSImport("cesium", "Matrix3.fromArray")
  @js.native
  def fromArray(array: js.Array[Double], startingIndex: Double, result: Matrix3): Matrix3 = js.native
  
  /* static member */
  @JSImport("cesium", "Matrix3.fromColumnMajorArray")
  @js.native
  def fromColumnMajorArray(values: js.Array[Double]): Matrix3 = js.native
  @JSImport("cesium", "Matrix3.fromColumnMajorArray")
  @js.native
  def fromColumnMajorArray(values: js.Array[Double], result: Matrix3): Matrix3 = js.native
  
  /* static member */
  @JSImport("cesium", "Matrix3.fromCrossProduct")
  @js.native
  def fromCrossProduct(the: Cartesian3): Matrix3 = js.native
  @JSImport("cesium", "Matrix3.fromCrossProduct")
  @js.native
  def fromCrossProduct(the: Cartesian3, result: Matrix3): Matrix3 = js.native
  
  /* static member */
  @JSImport("cesium", "Matrix3.fromHeadingPitchRoll")
  @js.native
  def fromHeadingPitchRoll(headingPitchRoll: HeadingPitchRoll): Matrix3 = js.native
  @JSImport("cesium", "Matrix3.fromHeadingPitchRoll")
  @js.native
  def fromHeadingPitchRoll(headingPitchRoll: HeadingPitchRoll, result: Matrix3): Matrix3 = js.native
  
  /* static member */
  @JSImport("cesium", "Matrix3.fromQuaternion")
  @js.native
  def fromQuaternion(quaternion: Quaternion): Matrix3 = js.native
  
  /* static member */
  @JSImport("cesium", "Matrix3.fromRotationX")
  @js.native
  def fromRotationX(angle: Double): Matrix3 = js.native
  @JSImport("cesium", "Matrix3.fromRotationX")
  @js.native
  def fromRotationX(angle: Double, result: Matrix3): Matrix3 = js.native
  
  /* static member */
  @JSImport("cesium", "Matrix3.fromRotationY")
  @js.native
  def fromRotationY(angle: Double): Matrix3 = js.native
  @JSImport("cesium", "Matrix3.fromRotationY")
  @js.native
  def fromRotationY(angle: Double, result: Matrix3): Matrix3 = js.native
  
  /* static member */
  @JSImport("cesium", "Matrix3.fromRotationZ")
  @js.native
  def fromRotationZ(angle: Double): Matrix3 = js.native
  @JSImport("cesium", "Matrix3.fromRotationZ")
  @js.native
  def fromRotationZ(angle: Double, result: Matrix3): Matrix3 = js.native
  
  /* static member */
  @JSImport("cesium", "Matrix3.fromRowMajorArray")
  @js.native
  def fromRowMajorArray(values: js.Array[Double]): Matrix3 = js.native
  @JSImport("cesium", "Matrix3.fromRowMajorArray")
  @js.native
  def fromRowMajorArray(values: js.Array[Double], result: Matrix3): Matrix3 = js.native
  
  /* static member */
  @JSImport("cesium", "Matrix3.fromScale")
  @js.native
  def fromScale(scale: Cartesian3): Matrix3 = js.native
  @JSImport("cesium", "Matrix3.fromScale")
  @js.native
  def fromScale(scale: Cartesian3, result: Matrix3): Matrix3 = js.native
  
  /* static member */
  @JSImport("cesium", "Matrix3.fromUniformScale")
  @js.native
  def fromUniformScale(scale: Double): Matrix3 = js.native
  @JSImport("cesium", "Matrix3.fromUniformScale")
  @js.native
  def fromUniformScale(scale: Double, result: Matrix3): Matrix3 = js.native
  
  /* static member */
  @JSImport("cesium", "Matrix3.getColumn")
  @js.native
  def getColumn(matrix: Matrix3, index: Double, result: Cartesian3): Cartesian3 = js.native
  
  /* static member */
  @JSImport("cesium", "Matrix3.getElementIndex")
  @js.native
  def getElementIndex(row: Double, column: Double): Double = js.native
  
  /* static member */
  @JSImport("cesium", "Matrix3.getMaximumScale")
  @js.native
  def getMaximumScale(matrix: Matrix3): Double = js.native
  
  /* static member */
  @JSImport("cesium", "Matrix3.getRotation")
  @js.native
  def getRotation(matrix: Matrix3, result: Matrix3): Matrix3 = js.native
  
  /* static member */
  @JSImport("cesium", "Matrix3.getRow")
  @js.native
  def getRow(matrix: Matrix3, index: Double, result: Cartesian3): Cartesian3 = js.native
  
  /* static member */
  @JSImport("cesium", "Matrix3.getScale")
  @js.native
  def getScale(matrix: Matrix3, result: Cartesian3): Cartesian3 = js.native
  
  /* static member */
  @JSImport("cesium", "Matrix3.inverse")
  @js.native
  def inverse(matrix: Matrix3, result: Matrix3): Matrix3 = js.native
  
  /* static member */
  @JSImport("cesium", "Matrix3.multiply")
  @js.native
  def multiply(left: Matrix3, right: Matrix3, result: Matrix3): Matrix3 = js.native
  
  /* static member */
  @JSImport("cesium", "Matrix3.multiplyByScalar")
  @js.native
  def multiplyByScalar(matrix: Matrix3, scalar: Double, result: Matrix3): Matrix3 = js.native
  
  /* static member */
  @JSImport("cesium", "Matrix3.multiplyByVector")
  @js.native
  def multiplyByVector(matrix: Matrix3, cartesian: Cartesian3, result: Cartesian3): Cartesian3 = js.native
  
  /* static member */
  @JSImport("cesium", "Matrix3.negate")
  @js.native
  def negate(matrix: Matrix3, result: Matrix3): Matrix3 = js.native
  
  /* static member */
  @JSImport("cesium", "Matrix3.pack")
  @js.native
  def pack(value: Matrix3, array: js.Array[Double]): js.Array[Double] = js.native
  @JSImport("cesium", "Matrix3.pack")
  @js.native
  def pack(value: Matrix3, array: js.Array[Double], startingIndex: Double): js.Array[Double] = js.native
  
  /* static member */
  @JSImport("cesium", "Matrix3.setColumn")
  @js.native
  def setColumn(matrix: Matrix3, index: Double, cartesian: Cartesian3, result: Cartesian3): Matrix3 = js.native
  
  /* static member */
  @JSImport("cesium", "Matrix3.setRow")
  @js.native
  def setRow(matrix: Matrix3, index: Double, cartesian: Cartesian3, result: Cartesian3): Matrix3 = js.native
  
  /* static member */
  @JSImport("cesium", "Matrix3.subtract")
  @js.native
  def subtract(left: Matrix3, right: Matrix3, result: Matrix3): Matrix3 = js.native
  
  /* static member */
  @JSImport("cesium", "Matrix3.toArray")
  @js.native
  def toArray(matrix: Matrix3): js.Array[Double] = js.native
  @JSImport("cesium", "Matrix3.toArray")
  @js.native
  def toArray(matrix: Matrix3, result: js.Array[Double]): js.Array[Double] = js.native
  
  /* static member */
  @JSImport("cesium", "Matrix3.transpose")
  @js.native
  def transpose(matrix: Matrix3, result: Matrix3): Matrix3 = js.native
  
  /* static member */
  @JSImport("cesium", "Matrix3.unpack")
  @js.native
  def unpack(array: js.Array[Double]): Matrix3 = js.native
  @JSImport("cesium", "Matrix3.unpack")
  @js.native
  def unpack(array: js.Array[Double], startingIndex: js.UndefOr[scala.Nothing], result: Matrix3): Matrix3 = js.native
  @JSImport("cesium", "Matrix3.unpack")
  @js.native
  def unpack(array: js.Array[Double], startingIndex: Double): Matrix3 = js.native
  @JSImport("cesium", "Matrix3.unpack")
  @js.native
  def unpack(array: js.Array[Double], startingIndex: Double, result: Matrix3): Matrix3 = js.native
}
