package typings.cesium.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
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
  @scala.inline
  def abs(matrix: Matrix3, result: Matrix3): Matrix3 = (^.asInstanceOf[js.Dynamic].applyDynamic("abs")(matrix.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Matrix3]
  
  /* static member */
  @scala.inline
  def add(left: Matrix3, right: Matrix3, result: Matrix3): Matrix3 = (^.asInstanceOf[js.Dynamic].applyDynamic("add")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Matrix3]
  
  /* static member */
  @scala.inline
  def clone_(matrix: Matrix3): Matrix3 = ^.asInstanceOf[js.Dynamic].applyDynamic("clone")(matrix.asInstanceOf[js.Any]).asInstanceOf[Matrix3]
  @scala.inline
  def clone_(matrix: Matrix3, result: Matrix3): Matrix3 = (^.asInstanceOf[js.Dynamic].applyDynamic("clone")(matrix.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Matrix3]
  
  /* static member */
  @scala.inline
  def computeEigenDecomposition(matrix: Matrix3): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("computeEigenDecomposition")(matrix.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  @scala.inline
  def computeEigenDecomposition(matrix: Matrix3, result: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("computeEigenDecomposition")(matrix.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  /* static member */
  @scala.inline
  def determinant(matrix: Matrix3): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("determinant")(matrix.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  /* static member */
  @scala.inline
  def equalsEpsilon(left: Matrix3, right: Matrix3, epsilon: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equalsEpsilon")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any], epsilon.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  /* static member */
  @scala.inline
  def equals_(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("equals")().asInstanceOf[Boolean]
  @scala.inline
  def equals_(left: Unit, right: Matrix3): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  @scala.inline
  def equals_(left: Matrix3): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("equals")(left.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  @scala.inline
  def equals_(left: Matrix3, right: Matrix3): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  /* static member */
  @scala.inline
  def fromArray(array: js.Array[Double]): Matrix3 = ^.asInstanceOf[js.Dynamic].applyDynamic("fromArray")(array.asInstanceOf[js.Any]).asInstanceOf[Matrix3]
  @scala.inline
  def fromArray(array: js.Array[Double], startingIndex: Double): Matrix3 = (^.asInstanceOf[js.Dynamic].applyDynamic("fromArray")(array.asInstanceOf[js.Any], startingIndex.asInstanceOf[js.Any])).asInstanceOf[Matrix3]
  @scala.inline
  def fromArray(array: js.Array[Double], startingIndex: Double, result: Matrix3): Matrix3 = (^.asInstanceOf[js.Dynamic].applyDynamic("fromArray")(array.asInstanceOf[js.Any], startingIndex.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Matrix3]
  @scala.inline
  def fromArray(array: js.Array[Double], startingIndex: Unit, result: Matrix3): Matrix3 = (^.asInstanceOf[js.Dynamic].applyDynamic("fromArray")(array.asInstanceOf[js.Any], startingIndex.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Matrix3]
  
  /* static member */
  @scala.inline
  def fromColumnMajorArray(values: js.Array[Double]): Matrix3 = ^.asInstanceOf[js.Dynamic].applyDynamic("fromColumnMajorArray")(values.asInstanceOf[js.Any]).asInstanceOf[Matrix3]
  @scala.inline
  def fromColumnMajorArray(values: js.Array[Double], result: Matrix3): Matrix3 = (^.asInstanceOf[js.Dynamic].applyDynamic("fromColumnMajorArray")(values.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Matrix3]
  
  /* static member */
  @scala.inline
  def fromCrossProduct(the: Cartesian3): Matrix3 = ^.asInstanceOf[js.Dynamic].applyDynamic("fromCrossProduct")(the.asInstanceOf[js.Any]).asInstanceOf[Matrix3]
  @scala.inline
  def fromCrossProduct(the: Cartesian3, result: Matrix3): Matrix3 = (^.asInstanceOf[js.Dynamic].applyDynamic("fromCrossProduct")(the.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Matrix3]
  
  /* static member */
  @scala.inline
  def fromHeadingPitchRoll(headingPitchRoll: HeadingPitchRoll): Matrix3 = ^.asInstanceOf[js.Dynamic].applyDynamic("fromHeadingPitchRoll")(headingPitchRoll.asInstanceOf[js.Any]).asInstanceOf[Matrix3]
  @scala.inline
  def fromHeadingPitchRoll(headingPitchRoll: HeadingPitchRoll, result: Matrix3): Matrix3 = (^.asInstanceOf[js.Dynamic].applyDynamic("fromHeadingPitchRoll")(headingPitchRoll.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Matrix3]
  
  /* static member */
  @scala.inline
  def fromQuaternion(quaternion: Quaternion): Matrix3 = ^.asInstanceOf[js.Dynamic].applyDynamic("fromQuaternion")(quaternion.asInstanceOf[js.Any]).asInstanceOf[Matrix3]
  
  /* static member */
  @scala.inline
  def fromRotationX(angle: Double): Matrix3 = ^.asInstanceOf[js.Dynamic].applyDynamic("fromRotationX")(angle.asInstanceOf[js.Any]).asInstanceOf[Matrix3]
  @scala.inline
  def fromRotationX(angle: Double, result: Matrix3): Matrix3 = (^.asInstanceOf[js.Dynamic].applyDynamic("fromRotationX")(angle.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Matrix3]
  
  /* static member */
  @scala.inline
  def fromRotationY(angle: Double): Matrix3 = ^.asInstanceOf[js.Dynamic].applyDynamic("fromRotationY")(angle.asInstanceOf[js.Any]).asInstanceOf[Matrix3]
  @scala.inline
  def fromRotationY(angle: Double, result: Matrix3): Matrix3 = (^.asInstanceOf[js.Dynamic].applyDynamic("fromRotationY")(angle.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Matrix3]
  
  /* static member */
  @scala.inline
  def fromRotationZ(angle: Double): Matrix3 = ^.asInstanceOf[js.Dynamic].applyDynamic("fromRotationZ")(angle.asInstanceOf[js.Any]).asInstanceOf[Matrix3]
  @scala.inline
  def fromRotationZ(angle: Double, result: Matrix3): Matrix3 = (^.asInstanceOf[js.Dynamic].applyDynamic("fromRotationZ")(angle.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Matrix3]
  
  /* static member */
  @scala.inline
  def fromRowMajorArray(values: js.Array[Double]): Matrix3 = ^.asInstanceOf[js.Dynamic].applyDynamic("fromRowMajorArray")(values.asInstanceOf[js.Any]).asInstanceOf[Matrix3]
  @scala.inline
  def fromRowMajorArray(values: js.Array[Double], result: Matrix3): Matrix3 = (^.asInstanceOf[js.Dynamic].applyDynamic("fromRowMajorArray")(values.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Matrix3]
  
  /* static member */
  @scala.inline
  def fromScale(scale: Cartesian3): Matrix3 = ^.asInstanceOf[js.Dynamic].applyDynamic("fromScale")(scale.asInstanceOf[js.Any]).asInstanceOf[Matrix3]
  @scala.inline
  def fromScale(scale: Cartesian3, result: Matrix3): Matrix3 = (^.asInstanceOf[js.Dynamic].applyDynamic("fromScale")(scale.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Matrix3]
  
  /* static member */
  @scala.inline
  def fromUniformScale(scale: Double): Matrix3 = ^.asInstanceOf[js.Dynamic].applyDynamic("fromUniformScale")(scale.asInstanceOf[js.Any]).asInstanceOf[Matrix3]
  @scala.inline
  def fromUniformScale(scale: Double, result: Matrix3): Matrix3 = (^.asInstanceOf[js.Dynamic].applyDynamic("fromUniformScale")(scale.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Matrix3]
  
  /* static member */
  @scala.inline
  def getColumn(matrix: Matrix3, index: Double, result: Cartesian3): Cartesian3 = (^.asInstanceOf[js.Dynamic].applyDynamic("getColumn")(matrix.asInstanceOf[js.Any], index.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Cartesian3]
  
  /* static member */
  @scala.inline
  def getElementIndex(row: Double, column: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getElementIndex")(row.asInstanceOf[js.Any], column.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  /* static member */
  @scala.inline
  def getMaximumScale(matrix: Matrix3): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getMaximumScale")(matrix.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  /* static member */
  @scala.inline
  def getRotation(matrix: Matrix3, result: Matrix3): Matrix3 = (^.asInstanceOf[js.Dynamic].applyDynamic("getRotation")(matrix.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Matrix3]
  
  /* static member */
  @scala.inline
  def getRow(matrix: Matrix3, index: Double, result: Cartesian3): Cartesian3 = (^.asInstanceOf[js.Dynamic].applyDynamic("getRow")(matrix.asInstanceOf[js.Any], index.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Cartesian3]
  
  /* static member */
  @scala.inline
  def getScale(matrix: Matrix3, result: Cartesian3): Cartesian3 = (^.asInstanceOf[js.Dynamic].applyDynamic("getScale")(matrix.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Cartesian3]
  
  /* static member */
  @scala.inline
  def inverse(matrix: Matrix3, result: Matrix3): Matrix3 = (^.asInstanceOf[js.Dynamic].applyDynamic("inverse")(matrix.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Matrix3]
  
  /* static member */
  @scala.inline
  def multiply(left: Matrix3, right: Matrix3, result: Matrix3): Matrix3 = (^.asInstanceOf[js.Dynamic].applyDynamic("multiply")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Matrix3]
  
  /* static member */
  @scala.inline
  def multiplyByScalar(matrix: Matrix3, scalar: Double, result: Matrix3): Matrix3 = (^.asInstanceOf[js.Dynamic].applyDynamic("multiplyByScalar")(matrix.asInstanceOf[js.Any], scalar.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Matrix3]
  
  /* static member */
  @scala.inline
  def multiplyByVector(matrix: Matrix3, cartesian: Cartesian3, result: Cartesian3): Cartesian3 = (^.asInstanceOf[js.Dynamic].applyDynamic("multiplyByVector")(matrix.asInstanceOf[js.Any], cartesian.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Cartesian3]
  
  /* static member */
  @scala.inline
  def negate(matrix: Matrix3, result: Matrix3): Matrix3 = (^.asInstanceOf[js.Dynamic].applyDynamic("negate")(matrix.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Matrix3]
  
  /* static member */
  @scala.inline
  def pack(value: Matrix3, array: js.Array[Double]): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("pack")(value.asInstanceOf[js.Any], array.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  @scala.inline
  def pack(value: Matrix3, array: js.Array[Double], startingIndex: Double): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("pack")(value.asInstanceOf[js.Any], array.asInstanceOf[js.Any], startingIndex.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  
  /* static member */
  @scala.inline
  def setColumn(matrix: Matrix3, index: Double, cartesian: Cartesian3, result: Cartesian3): Matrix3 = (^.asInstanceOf[js.Dynamic].applyDynamic("setColumn")(matrix.asInstanceOf[js.Any], index.asInstanceOf[js.Any], cartesian.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Matrix3]
  
  /* static member */
  @scala.inline
  def setRow(matrix: Matrix3, index: Double, cartesian: Cartesian3, result: Cartesian3): Matrix3 = (^.asInstanceOf[js.Dynamic].applyDynamic("setRow")(matrix.asInstanceOf[js.Any], index.asInstanceOf[js.Any], cartesian.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Matrix3]
  
  /* static member */
  @scala.inline
  def subtract(left: Matrix3, right: Matrix3, result: Matrix3): Matrix3 = (^.asInstanceOf[js.Dynamic].applyDynamic("subtract")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Matrix3]
  
  /* static member */
  @scala.inline
  def toArray(matrix: Matrix3): js.Array[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("toArray")(matrix.asInstanceOf[js.Any]).asInstanceOf[js.Array[Double]]
  @scala.inline
  def toArray(matrix: Matrix3, result: js.Array[Double]): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("toArray")(matrix.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  
  /* static member */
  @scala.inline
  def transpose(matrix: Matrix3, result: Matrix3): Matrix3 = (^.asInstanceOf[js.Dynamic].applyDynamic("transpose")(matrix.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Matrix3]
  
  /* static member */
  @scala.inline
  def unpack(array: js.Array[Double]): Matrix3 = ^.asInstanceOf[js.Dynamic].applyDynamic("unpack")(array.asInstanceOf[js.Any]).asInstanceOf[Matrix3]
  @scala.inline
  def unpack(array: js.Array[Double], startingIndex: Double): Matrix3 = (^.asInstanceOf[js.Dynamic].applyDynamic("unpack")(array.asInstanceOf[js.Any], startingIndex.asInstanceOf[js.Any])).asInstanceOf[Matrix3]
  @scala.inline
  def unpack(array: js.Array[Double], startingIndex: Double, result: Matrix3): Matrix3 = (^.asInstanceOf[js.Dynamic].applyDynamic("unpack")(array.asInstanceOf[js.Any], startingIndex.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Matrix3]
  @scala.inline
  def unpack(array: js.Array[Double], startingIndex: Unit, result: Matrix3): Matrix3 = (^.asInstanceOf[js.Dynamic].applyDynamic("unpack")(array.asInstanceOf[js.Any], startingIndex.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Matrix3]
}
