package typings.canvaskitWasm

import typings.canvaskitWasm.mod.SkPathOp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined canvaskit-wasm.canvaskit-wasm.SkEnum<canvaskit-wasm.canvaskit-wasm.SkPathOp, {  Difference  :canvaskit-wasm.canvaskit-wasm.SkPathOp,   Intersect  :canvaskit-wasm.canvaskit-wasm.SkPathOp,   ReverseDifference  :canvaskit-wasm.canvaskit-wasm.SkPathOp,   Union  :canvaskit-wasm.canvaskit-wasm.SkPathOp,   XOR  :canvaskit-wasm.canvaskit-wasm.SkPathOp}> */
trait SkEnumSkPathOpDifferenceS extends js.Object {
  val Difference: SkPathOp
  val Intersect: SkPathOp
  val ReverseDifference: SkPathOp
  val Union: SkPathOp
  val XOR: SkPathOp
  val values: js.Array[SkPathOp]
}

object SkEnumSkPathOpDifferenceS {
  @scala.inline
  def apply(
    Difference: SkPathOp,
    Intersect: SkPathOp,
    ReverseDifference: SkPathOp,
    Union: SkPathOp,
    XOR: SkPathOp,
    values: js.Array[SkPathOp]
  ): SkEnumSkPathOpDifferenceS = {
    val __obj = js.Dynamic.literal(Difference = Difference.asInstanceOf[js.Any], Intersect = Intersect.asInstanceOf[js.Any], ReverseDifference = ReverseDifference.asInstanceOf[js.Any], Union = Union.asInstanceOf[js.Any], XOR = XOR.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SkEnumSkPathOpDifferenceS]
  }
}

