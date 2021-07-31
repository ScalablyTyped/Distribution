package typings.cesium.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cesium", "Matrix2")
@js.native
class Matrix2 () extends Packable {
  def this(column0Row0: Double) = this()
  def this(column0Row0: Double, column1Row0: Double) = this()
  def this(column0Row0: Unit, column1Row0: Double) = this()
  def this(column0Row0: Double, column1Row0: Double, column0Row1: Double) = this()
  def this(column0Row0: Double, column1Row0: Unit, column0Row1: Double) = this()
  def this(column0Row0: Unit, column1Row0: Double, column0Row1: Double) = this()
  def this(column0Row0: Unit, column1Row0: Unit, column0Row1: Double) = this()
  def this(column0Row0: Double, column1Row0: Double, column0Row1: Double, column1Row1: Double) = this()
  def this(column0Row0: Double, column1Row0: Double, column0Row1: Unit, column1Row1: Double) = this()
  def this(column0Row0: Double, column1Row0: Unit, column0Row1: Double, column1Row1: Double) = this()
  def this(column0Row0: Double, column1Row0: Unit, column0Row1: Unit, column1Row1: Double) = this()
  def this(column0Row0: Unit, column1Row0: Double, column0Row1: Double, column1Row1: Double) = this()
  def this(column0Row0: Unit, column1Row0: Double, column0Row1: Unit, column1Row1: Double) = this()
  def this(column0Row0: Unit, column1Row0: Unit, column0Row1: Double, column1Row1: Double) = this()
  def this(column0Row0: Unit, column1Row0: Unit, column0Row1: Unit, column1Row1: Double) = this()
  
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
  @scala.inline
  def abs(matrix: Matrix2, result: Matrix2): Matrix2 = (^.asInstanceOf[js.Dynamic].applyDynamic("abs")(matrix.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Matrix2]
  
  /* static member */
  @scala.inline
  def add(left: Matrix2, right: Matrix2, result: Matrix2): Matrix2 = (^.asInstanceOf[js.Dynamic].applyDynamic("add")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Matrix2]
  
  /* static member */
  @scala.inline
  def clone_(matrix: Matrix2): Matrix2 = ^.asInstanceOf[js.Dynamic].applyDynamic("clone")(matrix.asInstanceOf[js.Any]).asInstanceOf[Matrix2]
  @scala.inline
  def clone_(matrix: Matrix2, result: Matrix2): Matrix2 = (^.asInstanceOf[js.Dynamic].applyDynamic("clone")(matrix.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Matrix2]
  
  /* static member */
  @scala.inline
  def equalsEpsilon(left: Matrix2, right: Matrix2, epsilon: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equalsEpsilon")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any], epsilon.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  /* static member */
  @scala.inline
  def equals_(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("equals")().asInstanceOf[Boolean]
  @scala.inline
  def equals_(left: Unit, right: Matrix2): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  @scala.inline
  def equals_(left: Matrix2): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("equals")(left.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  @scala.inline
  def equals_(left: Matrix2, right: Matrix2): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  /* static member */
  @scala.inline
  def fromArray(array: js.Array[Double]): Matrix2 = ^.asInstanceOf[js.Dynamic].applyDynamic("fromArray")(array.asInstanceOf[js.Any]).asInstanceOf[Matrix2]
  @scala.inline
  def fromArray(array: js.Array[Double], startingIndex: Double): Matrix2 = (^.asInstanceOf[js.Dynamic].applyDynamic("fromArray")(array.asInstanceOf[js.Any], startingIndex.asInstanceOf[js.Any])).asInstanceOf[Matrix2]
  @scala.inline
  def fromArray(array: js.Array[Double], startingIndex: Double, result: Matrix2): Matrix2 = (^.asInstanceOf[js.Dynamic].applyDynamic("fromArray")(array.asInstanceOf[js.Any], startingIndex.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Matrix2]
  @scala.inline
  def fromArray(array: js.Array[Double], startingIndex: Unit, result: Matrix2): Matrix2 = (^.asInstanceOf[js.Dynamic].applyDynamic("fromArray")(array.asInstanceOf[js.Any], startingIndex.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Matrix2]
  
  /* static member */
  @scala.inline
  def fromColumnMajorArray(values: js.Array[Double]): Matrix2 = ^.asInstanceOf[js.Dynamic].applyDynamic("fromColumnMajorArray")(values.asInstanceOf[js.Any]).asInstanceOf[Matrix2]
  @scala.inline
  def fromColumnMajorArray(values: js.Array[Double], result: Matrix2): Matrix2 = (^.asInstanceOf[js.Dynamic].applyDynamic("fromColumnMajorArray")(values.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Matrix2]
  
  /* static member */
  @scala.inline
  def fromRotation(angle: Double): Matrix2 = ^.asInstanceOf[js.Dynamic].applyDynamic("fromRotation")(angle.asInstanceOf[js.Any]).asInstanceOf[Matrix2]
  @scala.inline
  def fromRotation(angle: Double, result: Matrix2): Matrix2 = (^.asInstanceOf[js.Dynamic].applyDynamic("fromRotation")(angle.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Matrix2]
  
  /* static member */
  @scala.inline
  def fromRowMajorArray(values: js.Array[Double]): Matrix2 = ^.asInstanceOf[js.Dynamic].applyDynamic("fromRowMajorArray")(values.asInstanceOf[js.Any]).asInstanceOf[Matrix2]
  @scala.inline
  def fromRowMajorArray(values: js.Array[Double], result: Matrix2): Matrix2 = (^.asInstanceOf[js.Dynamic].applyDynamic("fromRowMajorArray")(values.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Matrix2]
  
  /* static member */
  @scala.inline
  def fromScale(scale: Cartesian2): Matrix2 = ^.asInstanceOf[js.Dynamic].applyDynamic("fromScale")(scale.asInstanceOf[js.Any]).asInstanceOf[Matrix2]
  @scala.inline
  def fromScale(scale: Cartesian2, result: Matrix2): Matrix2 = (^.asInstanceOf[js.Dynamic].applyDynamic("fromScale")(scale.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Matrix2]
  
  /* static member */
  @scala.inline
  def fromUniformScale(scale: Double): Matrix2 = ^.asInstanceOf[js.Dynamic].applyDynamic("fromUniformScale")(scale.asInstanceOf[js.Any]).asInstanceOf[Matrix2]
  @scala.inline
  def fromUniformScale(scale: Double, result: Matrix2): Matrix2 = (^.asInstanceOf[js.Dynamic].applyDynamic("fromUniformScale")(scale.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Matrix2]
  
  /* static member */
  @scala.inline
  def getColumn(matrix: Matrix2, index: Double, result: Cartesian2): Cartesian2 = (^.asInstanceOf[js.Dynamic].applyDynamic("getColumn")(matrix.asInstanceOf[js.Any], index.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Cartesian2]
  
  /* static member */
  @scala.inline
  def getElementIndex(row: Double, column: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getElementIndex")(row.asInstanceOf[js.Any], column.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  /* static member */
  @scala.inline
  def getMaximumScale(matrix: Matrix2): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getMaximumScale")(matrix.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  /* static member */
  @scala.inline
  def getRow(matrix: Matrix2, index: Double, result: Cartesian2): Cartesian2 = (^.asInstanceOf[js.Dynamic].applyDynamic("getRow")(matrix.asInstanceOf[js.Any], index.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Cartesian2]
  
  /* static member */
  @scala.inline
  def getScale(matrix: Matrix2, result: Cartesian2): Cartesian2 = (^.asInstanceOf[js.Dynamic].applyDynamic("getScale")(matrix.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Cartesian2]
  
  /* static member */
  @scala.inline
  def multiply(left: Matrix2, right: Matrix2, result: Matrix2): Matrix2 = (^.asInstanceOf[js.Dynamic].applyDynamic("multiply")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Matrix2]
  
  /* static member */
  @scala.inline
  def multiplyByScalar(matrix: Matrix2, scalar: Double, result: Matrix2): Matrix2 = (^.asInstanceOf[js.Dynamic].applyDynamic("multiplyByScalar")(matrix.asInstanceOf[js.Any], scalar.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Matrix2]
  
  /* static member */
  @scala.inline
  def multiplyByVector(matrix: Matrix2, cartesian: Cartesian2, result: Cartesian2): Cartesian2 = (^.asInstanceOf[js.Dynamic].applyDynamic("multiplyByVector")(matrix.asInstanceOf[js.Any], cartesian.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Cartesian2]
  
  /* static member */
  @scala.inline
  def negate(matrix: Matrix2, result: Matrix2): Matrix2 = (^.asInstanceOf[js.Dynamic].applyDynamic("negate")(matrix.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Matrix2]
  
  /* static member */
  @scala.inline
  def pack(value: Matrix2, array: js.Array[Double]): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("pack")(value.asInstanceOf[js.Any], array.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  @scala.inline
  def pack(value: Matrix2, array: js.Array[Double], startingIndex: Double): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("pack")(value.asInstanceOf[js.Any], array.asInstanceOf[js.Any], startingIndex.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  
  /* static member */
  @scala.inline
  def setColumn(matrix: Matrix2, index: Double, cartesian: Cartesian2, result: Cartesian2): Matrix2 = (^.asInstanceOf[js.Dynamic].applyDynamic("setColumn")(matrix.asInstanceOf[js.Any], index.asInstanceOf[js.Any], cartesian.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Matrix2]
  
  /* static member */
  @scala.inline
  def setRow(matrix: Matrix2, index: Double, cartesian: Cartesian2, result: Matrix2): Matrix2 = (^.asInstanceOf[js.Dynamic].applyDynamic("setRow")(matrix.asInstanceOf[js.Any], index.asInstanceOf[js.Any], cartesian.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Matrix2]
  
  /* static member */
  @scala.inline
  def subtract(left: Matrix2, right: Matrix2, result: Matrix2): Matrix2 = (^.asInstanceOf[js.Dynamic].applyDynamic("subtract")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Matrix2]
  
  /* static member */
  @scala.inline
  def toArray(matrix: Matrix2): js.Array[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("toArray")(matrix.asInstanceOf[js.Any]).asInstanceOf[js.Array[Double]]
  @scala.inline
  def toArray(matrix: Matrix2, result: js.Array[Double]): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("toArray")(matrix.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  
  /* static member */
  @scala.inline
  def transpose(matrix: Matrix2, result: Matrix2): Matrix2 = (^.asInstanceOf[js.Dynamic].applyDynamic("transpose")(matrix.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Matrix2]
  
  /* static member */
  @scala.inline
  def unpack(array: js.Array[Double]): Matrix2 = ^.asInstanceOf[js.Dynamic].applyDynamic("unpack")(array.asInstanceOf[js.Any]).asInstanceOf[Matrix2]
  @scala.inline
  def unpack(array: js.Array[Double], startingIndex: Double): Matrix2 = (^.asInstanceOf[js.Dynamic].applyDynamic("unpack")(array.asInstanceOf[js.Any], startingIndex.asInstanceOf[js.Any])).asInstanceOf[Matrix2]
  @scala.inline
  def unpack(array: js.Array[Double], startingIndex: Double, result: Matrix2): Matrix2 = (^.asInstanceOf[js.Dynamic].applyDynamic("unpack")(array.asInstanceOf[js.Any], startingIndex.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Matrix2]
  @scala.inline
  def unpack(array: js.Array[Double], startingIndex: Unit, result: Matrix2): Matrix2 = (^.asInstanceOf[js.Dynamic].applyDynamic("unpack")(array.asInstanceOf[js.Any], startingIndex.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Matrix2]
}
