package typings.cesium.global.Cesium

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Cesium.Matrix3")
@js.native
class Matrix3 protected ()
  extends typings.cesium.mod.Matrix3 {
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
}
object Matrix3 {
  
  @JSGlobal("Cesium.Matrix3")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSGlobal("Cesium.Matrix3.COLUMN0ROW0")
  @js.native
  def COLUMN0ROW0: Double = js.native
  inline def COLUMN0ROW0_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("COLUMN0ROW0")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("Cesium.Matrix3.COLUMN0ROW1")
  @js.native
  def COLUMN0ROW1: Double = js.native
  inline def COLUMN0ROW1_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("COLUMN0ROW1")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("Cesium.Matrix3.COLUMN0ROW2")
  @js.native
  def COLUMN0ROW2: Double = js.native
  inline def COLUMN0ROW2_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("COLUMN0ROW2")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("Cesium.Matrix3.COLUMN1ROW0")
  @js.native
  def COLUMN1ROW0: Double = js.native
  inline def COLUMN1ROW0_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("COLUMN1ROW0")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("Cesium.Matrix3.COLUMN1ROW1")
  @js.native
  def COLUMN1ROW1: Double = js.native
  inline def COLUMN1ROW1_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("COLUMN1ROW1")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("Cesium.Matrix3.COLUMN1ROW2")
  @js.native
  def COLUMN1ROW2: Double = js.native
  inline def COLUMN1ROW2_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("COLUMN1ROW2")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("Cesium.Matrix3.COLUMN2ROW0")
  @js.native
  def COLUMN2ROW0: Double = js.native
  inline def COLUMN2ROW0_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("COLUMN2ROW0")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("Cesium.Matrix3.COLUMN2ROW1")
  @js.native
  def COLUMN2ROW1: Double = js.native
  inline def COLUMN2ROW1_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("COLUMN2ROW1")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("Cesium.Matrix3.COLUMN2ROW2")
  @js.native
  def COLUMN2ROW2: Double = js.native
  inline def COLUMN2ROW2_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("COLUMN2ROW2")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("Cesium.Matrix3.IDENTITY")
  @js.native
  def IDENTITY: typings.cesium.mod.Matrix3 = js.native
  inline def IDENTITY_=(x: typings.cesium.mod.Matrix3): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("IDENTITY")(x.asInstanceOf[js.Any])
  
  /* static member */
  inline def abs(matrix: typings.cesium.mod.Matrix3, result: typings.cesium.mod.Matrix3): typings.cesium.mod.Matrix3 = (^.asInstanceOf[js.Dynamic].applyDynamic("abs")(matrix.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[typings.cesium.mod.Matrix3]
  
  /* static member */
  inline def add(
    left: typings.cesium.mod.Matrix3,
    right: typings.cesium.mod.Matrix3,
    result: typings.cesium.mod.Matrix3
  ): typings.cesium.mod.Matrix3 = (^.asInstanceOf[js.Dynamic].applyDynamic("add")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[typings.cesium.mod.Matrix3]
  
  /* static member */
  inline def clone_(matrix: typings.cesium.mod.Matrix3): typings.cesium.mod.Matrix3 = ^.asInstanceOf[js.Dynamic].applyDynamic("clone")(matrix.asInstanceOf[js.Any]).asInstanceOf[typings.cesium.mod.Matrix3]
  inline def clone_(matrix: typings.cesium.mod.Matrix3, result: typings.cesium.mod.Matrix3): typings.cesium.mod.Matrix3 = (^.asInstanceOf[js.Dynamic].applyDynamic("clone")(matrix.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[typings.cesium.mod.Matrix3]
  
  /* static member */
  inline def computeEigenDecomposition(matrix: typings.cesium.mod.Matrix3): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("computeEigenDecomposition")(matrix.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  inline def computeEigenDecomposition(matrix: typings.cesium.mod.Matrix3, result: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("computeEigenDecomposition")(matrix.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  /* static member */
  inline def determinant(matrix: typings.cesium.mod.Matrix3): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("determinant")(matrix.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  /* static member */
  inline def equalsEpsilon(left: typings.cesium.mod.Matrix3, right: typings.cesium.mod.Matrix3, epsilon: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equalsEpsilon")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any], epsilon.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  /* static member */
  inline def equals_(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("equals")().asInstanceOf[Boolean]
  inline def equals_(left: Unit, right: typings.cesium.mod.Matrix3): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def equals_(left: typings.cesium.mod.Matrix3): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("equals")(left.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def equals_(left: typings.cesium.mod.Matrix3, right: typings.cesium.mod.Matrix3): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  /* static member */
  inline def fromArray(array: js.Array[Double]): typings.cesium.mod.Matrix3 = ^.asInstanceOf[js.Dynamic].applyDynamic("fromArray")(array.asInstanceOf[js.Any]).asInstanceOf[typings.cesium.mod.Matrix3]
  inline def fromArray(array: js.Array[Double], startingIndex: Double): typings.cesium.mod.Matrix3 = (^.asInstanceOf[js.Dynamic].applyDynamic("fromArray")(array.asInstanceOf[js.Any], startingIndex.asInstanceOf[js.Any])).asInstanceOf[typings.cesium.mod.Matrix3]
  inline def fromArray(array: js.Array[Double], startingIndex: Double, result: typings.cesium.mod.Matrix3): typings.cesium.mod.Matrix3 = (^.asInstanceOf[js.Dynamic].applyDynamic("fromArray")(array.asInstanceOf[js.Any], startingIndex.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[typings.cesium.mod.Matrix3]
  inline def fromArray(array: js.Array[Double], startingIndex: Unit, result: typings.cesium.mod.Matrix3): typings.cesium.mod.Matrix3 = (^.asInstanceOf[js.Dynamic].applyDynamic("fromArray")(array.asInstanceOf[js.Any], startingIndex.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[typings.cesium.mod.Matrix3]
  
  /* static member */
  inline def fromColumnMajorArray(values: js.Array[Double]): typings.cesium.mod.Matrix3 = ^.asInstanceOf[js.Dynamic].applyDynamic("fromColumnMajorArray")(values.asInstanceOf[js.Any]).asInstanceOf[typings.cesium.mod.Matrix3]
  inline def fromColumnMajorArray(values: js.Array[Double], result: typings.cesium.mod.Matrix3): typings.cesium.mod.Matrix3 = (^.asInstanceOf[js.Dynamic].applyDynamic("fromColumnMajorArray")(values.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[typings.cesium.mod.Matrix3]
  
  /* static member */
  inline def fromCrossProduct(the: typings.cesium.mod.Cartesian3): typings.cesium.mod.Matrix3 = ^.asInstanceOf[js.Dynamic].applyDynamic("fromCrossProduct")(the.asInstanceOf[js.Any]).asInstanceOf[typings.cesium.mod.Matrix3]
  inline def fromCrossProduct(the: typings.cesium.mod.Cartesian3, result: typings.cesium.mod.Matrix3): typings.cesium.mod.Matrix3 = (^.asInstanceOf[js.Dynamic].applyDynamic("fromCrossProduct")(the.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[typings.cesium.mod.Matrix3]
  
  /* static member */
  inline def fromHeadingPitchRoll(headingPitchRoll: typings.cesium.mod.HeadingPitchRoll): typings.cesium.mod.Matrix3 = ^.asInstanceOf[js.Dynamic].applyDynamic("fromHeadingPitchRoll")(headingPitchRoll.asInstanceOf[js.Any]).asInstanceOf[typings.cesium.mod.Matrix3]
  inline def fromHeadingPitchRoll(headingPitchRoll: typings.cesium.mod.HeadingPitchRoll, result: typings.cesium.mod.Matrix3): typings.cesium.mod.Matrix3 = (^.asInstanceOf[js.Dynamic].applyDynamic("fromHeadingPitchRoll")(headingPitchRoll.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[typings.cesium.mod.Matrix3]
  
  /* static member */
  inline def fromQuaternion(quaternion: typings.cesium.mod.Quaternion): typings.cesium.mod.Matrix3 = ^.asInstanceOf[js.Dynamic].applyDynamic("fromQuaternion")(quaternion.asInstanceOf[js.Any]).asInstanceOf[typings.cesium.mod.Matrix3]
  
  /* static member */
  inline def fromRotationX(angle: Double): typings.cesium.mod.Matrix3 = ^.asInstanceOf[js.Dynamic].applyDynamic("fromRotationX")(angle.asInstanceOf[js.Any]).asInstanceOf[typings.cesium.mod.Matrix3]
  inline def fromRotationX(angle: Double, result: typings.cesium.mod.Matrix3): typings.cesium.mod.Matrix3 = (^.asInstanceOf[js.Dynamic].applyDynamic("fromRotationX")(angle.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[typings.cesium.mod.Matrix3]
  
  /* static member */
  inline def fromRotationY(angle: Double): typings.cesium.mod.Matrix3 = ^.asInstanceOf[js.Dynamic].applyDynamic("fromRotationY")(angle.asInstanceOf[js.Any]).asInstanceOf[typings.cesium.mod.Matrix3]
  inline def fromRotationY(angle: Double, result: typings.cesium.mod.Matrix3): typings.cesium.mod.Matrix3 = (^.asInstanceOf[js.Dynamic].applyDynamic("fromRotationY")(angle.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[typings.cesium.mod.Matrix3]
  
  /* static member */
  inline def fromRotationZ(angle: Double): typings.cesium.mod.Matrix3 = ^.asInstanceOf[js.Dynamic].applyDynamic("fromRotationZ")(angle.asInstanceOf[js.Any]).asInstanceOf[typings.cesium.mod.Matrix3]
  inline def fromRotationZ(angle: Double, result: typings.cesium.mod.Matrix3): typings.cesium.mod.Matrix3 = (^.asInstanceOf[js.Dynamic].applyDynamic("fromRotationZ")(angle.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[typings.cesium.mod.Matrix3]
  
  /* static member */
  inline def fromRowMajorArray(values: js.Array[Double]): typings.cesium.mod.Matrix3 = ^.asInstanceOf[js.Dynamic].applyDynamic("fromRowMajorArray")(values.asInstanceOf[js.Any]).asInstanceOf[typings.cesium.mod.Matrix3]
  inline def fromRowMajorArray(values: js.Array[Double], result: typings.cesium.mod.Matrix3): typings.cesium.mod.Matrix3 = (^.asInstanceOf[js.Dynamic].applyDynamic("fromRowMajorArray")(values.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[typings.cesium.mod.Matrix3]
  
  /* static member */
  inline def fromScale(scale: typings.cesium.mod.Cartesian3): typings.cesium.mod.Matrix3 = ^.asInstanceOf[js.Dynamic].applyDynamic("fromScale")(scale.asInstanceOf[js.Any]).asInstanceOf[typings.cesium.mod.Matrix3]
  inline def fromScale(scale: typings.cesium.mod.Cartesian3, result: typings.cesium.mod.Matrix3): typings.cesium.mod.Matrix3 = (^.asInstanceOf[js.Dynamic].applyDynamic("fromScale")(scale.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[typings.cesium.mod.Matrix3]
  
  /* static member */
  inline def fromUniformScale(scale: Double): typings.cesium.mod.Matrix3 = ^.asInstanceOf[js.Dynamic].applyDynamic("fromUniformScale")(scale.asInstanceOf[js.Any]).asInstanceOf[typings.cesium.mod.Matrix3]
  inline def fromUniformScale(scale: Double, result: typings.cesium.mod.Matrix3): typings.cesium.mod.Matrix3 = (^.asInstanceOf[js.Dynamic].applyDynamic("fromUniformScale")(scale.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[typings.cesium.mod.Matrix3]
  
  /* static member */
  inline def getColumn(matrix: typings.cesium.mod.Matrix3, index: Double, result: typings.cesium.mod.Cartesian3): typings.cesium.mod.Cartesian3 = (^.asInstanceOf[js.Dynamic].applyDynamic("getColumn")(matrix.asInstanceOf[js.Any], index.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[typings.cesium.mod.Cartesian3]
  
  /* static member */
  inline def getElementIndex(row: Double, column: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getElementIndex")(row.asInstanceOf[js.Any], column.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  /* static member */
  inline def getMaximumScale(matrix: typings.cesium.mod.Matrix3): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getMaximumScale")(matrix.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  /* static member */
  inline def getRotation(matrix: typings.cesium.mod.Matrix3, result: typings.cesium.mod.Matrix3): typings.cesium.mod.Matrix3 = (^.asInstanceOf[js.Dynamic].applyDynamic("getRotation")(matrix.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[typings.cesium.mod.Matrix3]
  
  /* static member */
  inline def getRow(matrix: typings.cesium.mod.Matrix3, index: Double, result: typings.cesium.mod.Cartesian3): typings.cesium.mod.Cartesian3 = (^.asInstanceOf[js.Dynamic].applyDynamic("getRow")(matrix.asInstanceOf[js.Any], index.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[typings.cesium.mod.Cartesian3]
  
  /* static member */
  inline def getScale(matrix: typings.cesium.mod.Matrix3, result: typings.cesium.mod.Cartesian3): typings.cesium.mod.Cartesian3 = (^.asInstanceOf[js.Dynamic].applyDynamic("getScale")(matrix.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[typings.cesium.mod.Cartesian3]
  
  /* static member */
  inline def inverse(matrix: typings.cesium.mod.Matrix3, result: typings.cesium.mod.Matrix3): typings.cesium.mod.Matrix3 = (^.asInstanceOf[js.Dynamic].applyDynamic("inverse")(matrix.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[typings.cesium.mod.Matrix3]
  
  /* static member */
  inline def multiply(
    left: typings.cesium.mod.Matrix3,
    right: typings.cesium.mod.Matrix3,
    result: typings.cesium.mod.Matrix3
  ): typings.cesium.mod.Matrix3 = (^.asInstanceOf[js.Dynamic].applyDynamic("multiply")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[typings.cesium.mod.Matrix3]
  
  /* static member */
  inline def multiplyByScalar(matrix: typings.cesium.mod.Matrix3, scalar: Double, result: typings.cesium.mod.Matrix3): typings.cesium.mod.Matrix3 = (^.asInstanceOf[js.Dynamic].applyDynamic("multiplyByScalar")(matrix.asInstanceOf[js.Any], scalar.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[typings.cesium.mod.Matrix3]
  
  /* static member */
  inline def multiplyByVector(
    matrix: typings.cesium.mod.Matrix3,
    cartesian: typings.cesium.mod.Cartesian3,
    result: typings.cesium.mod.Cartesian3
  ): typings.cesium.mod.Cartesian3 = (^.asInstanceOf[js.Dynamic].applyDynamic("multiplyByVector")(matrix.asInstanceOf[js.Any], cartesian.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[typings.cesium.mod.Cartesian3]
  
  /* static member */
  inline def negate(matrix: typings.cesium.mod.Matrix3, result: typings.cesium.mod.Matrix3): typings.cesium.mod.Matrix3 = (^.asInstanceOf[js.Dynamic].applyDynamic("negate")(matrix.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[typings.cesium.mod.Matrix3]
  
  /* static member */
  inline def pack(value: typings.cesium.mod.Matrix3, array: js.Array[Double]): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("pack")(value.asInstanceOf[js.Any], array.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  inline def pack(value: typings.cesium.mod.Matrix3, array: js.Array[Double], startingIndex: Double): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("pack")(value.asInstanceOf[js.Any], array.asInstanceOf[js.Any], startingIndex.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  
  /* static member */
  inline def setColumn(
    matrix: typings.cesium.mod.Matrix3,
    index: Double,
    cartesian: typings.cesium.mod.Cartesian3,
    result: typings.cesium.mod.Cartesian3
  ): typings.cesium.mod.Matrix3 = (^.asInstanceOf[js.Dynamic].applyDynamic("setColumn")(matrix.asInstanceOf[js.Any], index.asInstanceOf[js.Any], cartesian.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[typings.cesium.mod.Matrix3]
  
  /* static member */
  inline def setRow(
    matrix: typings.cesium.mod.Matrix3,
    index: Double,
    cartesian: typings.cesium.mod.Cartesian3,
    result: typings.cesium.mod.Cartesian3
  ): typings.cesium.mod.Matrix3 = (^.asInstanceOf[js.Dynamic].applyDynamic("setRow")(matrix.asInstanceOf[js.Any], index.asInstanceOf[js.Any], cartesian.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[typings.cesium.mod.Matrix3]
  
  /* static member */
  inline def subtract(
    left: typings.cesium.mod.Matrix3,
    right: typings.cesium.mod.Matrix3,
    result: typings.cesium.mod.Matrix3
  ): typings.cesium.mod.Matrix3 = (^.asInstanceOf[js.Dynamic].applyDynamic("subtract")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[typings.cesium.mod.Matrix3]
  
  /* static member */
  inline def toArray(matrix: typings.cesium.mod.Matrix3): js.Array[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("toArray")(matrix.asInstanceOf[js.Any]).asInstanceOf[js.Array[Double]]
  inline def toArray(matrix: typings.cesium.mod.Matrix3, result: js.Array[Double]): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("toArray")(matrix.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  
  /* static member */
  inline def transpose(matrix: typings.cesium.mod.Matrix3, result: typings.cesium.mod.Matrix3): typings.cesium.mod.Matrix3 = (^.asInstanceOf[js.Dynamic].applyDynamic("transpose")(matrix.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[typings.cesium.mod.Matrix3]
  
  /* static member */
  inline def unpack(array: js.Array[Double]): typings.cesium.mod.Matrix3 = ^.asInstanceOf[js.Dynamic].applyDynamic("unpack")(array.asInstanceOf[js.Any]).asInstanceOf[typings.cesium.mod.Matrix3]
  inline def unpack(array: js.Array[Double], startingIndex: Double): typings.cesium.mod.Matrix3 = (^.asInstanceOf[js.Dynamic].applyDynamic("unpack")(array.asInstanceOf[js.Any], startingIndex.asInstanceOf[js.Any])).asInstanceOf[typings.cesium.mod.Matrix3]
  inline def unpack(array: js.Array[Double], startingIndex: Double, result: typings.cesium.mod.Matrix3): typings.cesium.mod.Matrix3 = (^.asInstanceOf[js.Dynamic].applyDynamic("unpack")(array.asInstanceOf[js.Any], startingIndex.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[typings.cesium.mod.Matrix3]
  inline def unpack(array: js.Array[Double], startingIndex: Unit, result: typings.cesium.mod.Matrix3): typings.cesium.mod.Matrix3 = (^.asInstanceOf[js.Dynamic].applyDynamic("unpack")(array.asInstanceOf[js.Any], startingIndex.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[typings.cesium.mod.Matrix3]
}
