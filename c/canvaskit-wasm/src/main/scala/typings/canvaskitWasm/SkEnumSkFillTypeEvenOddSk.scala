package typings.canvaskitWasm

import typings.canvaskitWasm.mod.SkFillType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined canvaskit-wasm.canvaskit-wasm.SkEnum<canvaskit-wasm.canvaskit-wasm.SkFillType, {  EvenOdd  :canvaskit-wasm.canvaskit-wasm.SkFillType,   InverseEvenOdd  :canvaskit-wasm.canvaskit-wasm.SkFillType,   InverseWinding  :canvaskit-wasm.canvaskit-wasm.SkFillType,   Winding  :canvaskit-wasm.canvaskit-wasm.SkFillType}> */
trait SkEnumSkFillTypeEvenOddSk extends js.Object {
  val EvenOdd: SkFillType
  val InverseEvenOdd: SkFillType
  val InverseWinding: SkFillType
  val Winding: SkFillType
  val values: js.Array[SkFillType]
}

object SkEnumSkFillTypeEvenOddSk {
  @scala.inline
  def apply(
    EvenOdd: SkFillType,
    InverseEvenOdd: SkFillType,
    InverseWinding: SkFillType,
    Winding: SkFillType,
    values: js.Array[SkFillType]
  ): SkEnumSkFillTypeEvenOddSk = {
    val __obj = js.Dynamic.literal(EvenOdd = EvenOdd.asInstanceOf[js.Any], InverseEvenOdd = InverseEvenOdd.asInstanceOf[js.Any], InverseWinding = InverseWinding.asInstanceOf[js.Any], Winding = Winding.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SkEnumSkFillTypeEvenOddSk]
  }
}

