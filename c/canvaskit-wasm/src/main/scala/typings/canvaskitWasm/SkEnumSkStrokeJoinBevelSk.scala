package typings.canvaskitWasm

import typings.canvaskitWasm.mod.SkStrokeJoin
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined canvaskit-wasm.canvaskit-wasm.SkEnum<canvaskit-wasm.canvaskit-wasm.SkStrokeJoin, {  Bevel  :canvaskit-wasm.canvaskit-wasm.SkStrokeJoin,   Miter  :canvaskit-wasm.canvaskit-wasm.SkStrokeJoin,   Round  :canvaskit-wasm.canvaskit-wasm.SkStrokeJoin}> */
trait SkEnumSkStrokeJoinBevelSk extends js.Object {
  val Bevel: SkStrokeJoin
  val Miter: SkStrokeJoin
  val Round: SkStrokeJoin
  val values: js.Array[SkStrokeJoin]
}

object SkEnumSkStrokeJoinBevelSk {
  @scala.inline
  def apply(Bevel: SkStrokeJoin, Miter: SkStrokeJoin, Round: SkStrokeJoin, values: js.Array[SkStrokeJoin]): SkEnumSkStrokeJoinBevelSk = {
    val __obj = js.Dynamic.literal(Bevel = Bevel.asInstanceOf[js.Any], Miter = Miter.asInstanceOf[js.Any], Round = Round.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[SkEnumSkStrokeJoinBevelSk]
  }
}

