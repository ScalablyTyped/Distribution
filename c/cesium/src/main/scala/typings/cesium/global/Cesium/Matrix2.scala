package typings.cesium.global.Cesium

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Cesium.Matrix2")
@js.native
class Matrix2 ()
  extends typings.cesium.mod.Matrix2 {
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
}
object Matrix2 {
  
  @JSGlobal("Cesium.Matrix2")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSGlobal("Cesium.Matrix2.COLUMN0ROW0")
  @js.native
  def COLUMN0ROW0: Double = js.native
  inline def COLUMN0ROW0_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("COLUMN0ROW0")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("Cesium.Matrix2.COLUMN0ROW1")
  @js.native
  def COLUMN0ROW1: Double = js.native
  inline def COLUMN0ROW1_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("COLUMN0ROW1")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("Cesium.Matrix2.COLUMN1ROW0")
  @js.native
  def COLUMN1ROW0: Double = js.native
  inline def COLUMN1ROW0_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("COLUMN1ROW0")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("Cesium.Matrix2.COLUMN1ROW1")
  @js.native
  def COLUMN1ROW1: Double = js.native
  inline def COLUMN1ROW1_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("COLUMN1ROW1")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("Cesium.Matrix2.IDENTITY")
  @js.native
  def IDENTITY: typings.cesium.mod.Matrix2 = js.native
  inline def IDENTITY_=(x: typings.cesium.mod.Matrix2): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("IDENTITY")(x.asInstanceOf[js.Any])
  
  /* static member */
  inline def abs(matrix: typings.cesium.mod.Matrix2, result: typings.cesium.mod.Matrix2): typings.cesium.mod.Matrix2 = (^.asInstanceOf[js.Dynamic].applyDynamic("abs")(matrix.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[typings.cesium.mod.Matrix2]
  
  /* static member */
  inline def add(
    left: typings.cesium.mod.Matrix2,
    right: typings.cesium.mod.Matrix2,
    result: typings.cesium.mod.Matrix2
  ): typings.cesium.mod.Matrix2 = (^.asInstanceOf[js.Dynamic].applyDynamic("add")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[typings.cesium.mod.Matrix2]
  
  /* static member */
  inline def clone_(matrix: typings.cesium.mod.Matrix2): typings.cesium.mod.Matrix2 = ^.asInstanceOf[js.Dynamic].applyDynamic("clone")(matrix.asInstanceOf[js.Any]).asInstanceOf[typings.cesium.mod.Matrix2]
  inline def clone_(matrix: typings.cesium.mod.Matrix2, result: typings.cesium.mod.Matrix2): typings.cesium.mod.Matrix2 = (^.asInstanceOf[js.Dynamic].applyDynamic("clone")(matrix.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[typings.cesium.mod.Matrix2]
  
  /* static member */
  inline def equalsEpsilon(left: typings.cesium.mod.Matrix2, right: typings.cesium.mod.Matrix2, epsilon: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equalsEpsilon")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any], epsilon.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  /* static member */
  inline def equals_(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("equals")().asInstanceOf[Boolean]
  inline def equals_(left: Unit, right: typings.cesium.mod.Matrix2): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def equals_(left: typings.cesium.mod.Matrix2): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("equals")(left.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def equals_(left: typings.cesium.mod.Matrix2, right: typings.cesium.mod.Matrix2): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  /* static member */
  inline def fromArray(array: js.Array[Double]): typings.cesium.mod.Matrix2 = ^.asInstanceOf[js.Dynamic].applyDynamic("fromArray")(array.asInstanceOf[js.Any]).asInstanceOf[typings.cesium.mod.Matrix2]
  inline def fromArray(array: js.Array[Double], startingIndex: Double): typings.cesium.mod.Matrix2 = (^.asInstanceOf[js.Dynamic].applyDynamic("fromArray")(array.asInstanceOf[js.Any], startingIndex.asInstanceOf[js.Any])).asInstanceOf[typings.cesium.mod.Matrix2]
  inline def fromArray(array: js.Array[Double], startingIndex: Double, result: typings.cesium.mod.Matrix2): typings.cesium.mod.Matrix2 = (^.asInstanceOf[js.Dynamic].applyDynamic("fromArray")(array.asInstanceOf[js.Any], startingIndex.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[typings.cesium.mod.Matrix2]
  inline def fromArray(array: js.Array[Double], startingIndex: Unit, result: typings.cesium.mod.Matrix2): typings.cesium.mod.Matrix2 = (^.asInstanceOf[js.Dynamic].applyDynamic("fromArray")(array.asInstanceOf[js.Any], startingIndex.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[typings.cesium.mod.Matrix2]
  
  /* static member */
  inline def fromColumnMajorArray(values: js.Array[Double]): typings.cesium.mod.Matrix2 = ^.asInstanceOf[js.Dynamic].applyDynamic("fromColumnMajorArray")(values.asInstanceOf[js.Any]).asInstanceOf[typings.cesium.mod.Matrix2]
  inline def fromColumnMajorArray(values: js.Array[Double], result: typings.cesium.mod.Matrix2): typings.cesium.mod.Matrix2 = (^.asInstanceOf[js.Dynamic].applyDynamic("fromColumnMajorArray")(values.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[typings.cesium.mod.Matrix2]
  
  /* static member */
  inline def fromRotation(angle: Double): typings.cesium.mod.Matrix2 = ^.asInstanceOf[js.Dynamic].applyDynamic("fromRotation")(angle.asInstanceOf[js.Any]).asInstanceOf[typings.cesium.mod.Matrix2]
  inline def fromRotation(angle: Double, result: typings.cesium.mod.Matrix2): typings.cesium.mod.Matrix2 = (^.asInstanceOf[js.Dynamic].applyDynamic("fromRotation")(angle.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[typings.cesium.mod.Matrix2]
  
  /* static member */
  inline def fromRowMajorArray(values: js.Array[Double]): typings.cesium.mod.Matrix2 = ^.asInstanceOf[js.Dynamic].applyDynamic("fromRowMajorArray")(values.asInstanceOf[js.Any]).asInstanceOf[typings.cesium.mod.Matrix2]
  inline def fromRowMajorArray(values: js.Array[Double], result: typings.cesium.mod.Matrix2): typings.cesium.mod.Matrix2 = (^.asInstanceOf[js.Dynamic].applyDynamic("fromRowMajorArray")(values.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[typings.cesium.mod.Matrix2]
  
  /* static member */
  inline def fromScale(scale: typings.cesium.mod.Cartesian2): typings.cesium.mod.Matrix2 = ^.asInstanceOf[js.Dynamic].applyDynamic("fromScale")(scale.asInstanceOf[js.Any]).asInstanceOf[typings.cesium.mod.Matrix2]
  inline def fromScale(scale: typings.cesium.mod.Cartesian2, result: typings.cesium.mod.Matrix2): typings.cesium.mod.Matrix2 = (^.asInstanceOf[js.Dynamic].applyDynamic("fromScale")(scale.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[typings.cesium.mod.Matrix2]
  
  /* static member */
  inline def fromUniformScale(scale: Double): typings.cesium.mod.Matrix2 = ^.asInstanceOf[js.Dynamic].applyDynamic("fromUniformScale")(scale.asInstanceOf[js.Any]).asInstanceOf[typings.cesium.mod.Matrix2]
  inline def fromUniformScale(scale: Double, result: typings.cesium.mod.Matrix2): typings.cesium.mod.Matrix2 = (^.asInstanceOf[js.Dynamic].applyDynamic("fromUniformScale")(scale.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[typings.cesium.mod.Matrix2]
  
  /* static member */
  inline def getColumn(matrix: typings.cesium.mod.Matrix2, index: Double, result: typings.cesium.mod.Cartesian2): typings.cesium.mod.Cartesian2 = (^.asInstanceOf[js.Dynamic].applyDynamic("getColumn")(matrix.asInstanceOf[js.Any], index.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[typings.cesium.mod.Cartesian2]
  
  /* static member */
  inline def getElementIndex(row: Double, column: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getElementIndex")(row.asInstanceOf[js.Any], column.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  /* static member */
  inline def getMaximumScale(matrix: typings.cesium.mod.Matrix2): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getMaximumScale")(matrix.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  /* static member */
  inline def getRow(matrix: typings.cesium.mod.Matrix2, index: Double, result: typings.cesium.mod.Cartesian2): typings.cesium.mod.Cartesian2 = (^.asInstanceOf[js.Dynamic].applyDynamic("getRow")(matrix.asInstanceOf[js.Any], index.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[typings.cesium.mod.Cartesian2]
  
  /* static member */
  inline def getScale(matrix: typings.cesium.mod.Matrix2, result: typings.cesium.mod.Cartesian2): typings.cesium.mod.Cartesian2 = (^.asInstanceOf[js.Dynamic].applyDynamic("getScale")(matrix.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[typings.cesium.mod.Cartesian2]
  
  /* static member */
  inline def multiply(
    left: typings.cesium.mod.Matrix2,
    right: typings.cesium.mod.Matrix2,
    result: typings.cesium.mod.Matrix2
  ): typings.cesium.mod.Matrix2 = (^.asInstanceOf[js.Dynamic].applyDynamic("multiply")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[typings.cesium.mod.Matrix2]
  
  /* static member */
  inline def multiplyByScalar(matrix: typings.cesium.mod.Matrix2, scalar: Double, result: typings.cesium.mod.Matrix2): typings.cesium.mod.Matrix2 = (^.asInstanceOf[js.Dynamic].applyDynamic("multiplyByScalar")(matrix.asInstanceOf[js.Any], scalar.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[typings.cesium.mod.Matrix2]
  
  /* static member */
  inline def multiplyByVector(
    matrix: typings.cesium.mod.Matrix2,
    cartesian: typings.cesium.mod.Cartesian2,
    result: typings.cesium.mod.Cartesian2
  ): typings.cesium.mod.Cartesian2 = (^.asInstanceOf[js.Dynamic].applyDynamic("multiplyByVector")(matrix.asInstanceOf[js.Any], cartesian.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[typings.cesium.mod.Cartesian2]
  
  /* static member */
  inline def negate(matrix: typings.cesium.mod.Matrix2, result: typings.cesium.mod.Matrix2): typings.cesium.mod.Matrix2 = (^.asInstanceOf[js.Dynamic].applyDynamic("negate")(matrix.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[typings.cesium.mod.Matrix2]
  
  /* static member */
  inline def pack(value: typings.cesium.mod.Matrix2, array: js.Array[Double]): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("pack")(value.asInstanceOf[js.Any], array.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  inline def pack(value: typings.cesium.mod.Matrix2, array: js.Array[Double], startingIndex: Double): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("pack")(value.asInstanceOf[js.Any], array.asInstanceOf[js.Any], startingIndex.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  
  /* static member */
  inline def setColumn(
    matrix: typings.cesium.mod.Matrix2,
    index: Double,
    cartesian: typings.cesium.mod.Cartesian2,
    result: typings.cesium.mod.Cartesian2
  ): typings.cesium.mod.Matrix2 = (^.asInstanceOf[js.Dynamic].applyDynamic("setColumn")(matrix.asInstanceOf[js.Any], index.asInstanceOf[js.Any], cartesian.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[typings.cesium.mod.Matrix2]
  
  /* static member */
  inline def setRow(
    matrix: typings.cesium.mod.Matrix2,
    index: Double,
    cartesian: typings.cesium.mod.Cartesian2,
    result: typings.cesium.mod.Matrix2
  ): typings.cesium.mod.Matrix2 = (^.asInstanceOf[js.Dynamic].applyDynamic("setRow")(matrix.asInstanceOf[js.Any], index.asInstanceOf[js.Any], cartesian.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[typings.cesium.mod.Matrix2]
  
  /* static member */
  inline def subtract(
    left: typings.cesium.mod.Matrix2,
    right: typings.cesium.mod.Matrix2,
    result: typings.cesium.mod.Matrix2
  ): typings.cesium.mod.Matrix2 = (^.asInstanceOf[js.Dynamic].applyDynamic("subtract")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[typings.cesium.mod.Matrix2]
  
  /* static member */
  inline def toArray(matrix: typings.cesium.mod.Matrix2): js.Array[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("toArray")(matrix.asInstanceOf[js.Any]).asInstanceOf[js.Array[Double]]
  inline def toArray(matrix: typings.cesium.mod.Matrix2, result: js.Array[Double]): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("toArray")(matrix.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  
  /* static member */
  inline def transpose(matrix: typings.cesium.mod.Matrix2, result: typings.cesium.mod.Matrix2): typings.cesium.mod.Matrix2 = (^.asInstanceOf[js.Dynamic].applyDynamic("transpose")(matrix.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[typings.cesium.mod.Matrix2]
  
  /* static member */
  inline def unpack(array: js.Array[Double]): typings.cesium.mod.Matrix2 = ^.asInstanceOf[js.Dynamic].applyDynamic("unpack")(array.asInstanceOf[js.Any]).asInstanceOf[typings.cesium.mod.Matrix2]
  inline def unpack(array: js.Array[Double], startingIndex: Double): typings.cesium.mod.Matrix2 = (^.asInstanceOf[js.Dynamic].applyDynamic("unpack")(array.asInstanceOf[js.Any], startingIndex.asInstanceOf[js.Any])).asInstanceOf[typings.cesium.mod.Matrix2]
  inline def unpack(array: js.Array[Double], startingIndex: Double, result: typings.cesium.mod.Matrix2): typings.cesium.mod.Matrix2 = (^.asInstanceOf[js.Dynamic].applyDynamic("unpack")(array.asInstanceOf[js.Any], startingIndex.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[typings.cesium.mod.Matrix2]
  inline def unpack(array: js.Array[Double], startingIndex: Unit, result: typings.cesium.mod.Matrix2): typings.cesium.mod.Matrix2 = (^.asInstanceOf[js.Dynamic].applyDynamic("unpack")(array.asInstanceOf[js.Any], startingIndex.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[typings.cesium.mod.Matrix2]
}
