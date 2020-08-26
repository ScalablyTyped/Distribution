package typings.canvaskitWasm.anon

import typings.canvaskitWasm.mod.SkStrokeJoin
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined canvaskit-wasm.canvaskit-wasm.SkEnum<canvaskit-wasm.canvaskit-wasm.SkStrokeJoin, {  Bevel :canvaskit-wasm.canvaskit-wasm.SkStrokeJoin,   Miter :canvaskit-wasm.canvaskit-wasm.SkStrokeJoin,   Round :canvaskit-wasm.canvaskit-wasm.SkStrokeJoin}> */
@js.native
trait SkEnumSkStrokeJoinBevelSk extends js.Object {
  val Bevel: SkStrokeJoin = js.native
  val Miter: SkStrokeJoin = js.native
  val Round: SkStrokeJoin = js.native
  val values: js.Array[SkStrokeJoin] = js.native
}

object SkEnumSkStrokeJoinBevelSk {
  @scala.inline
  def apply(Bevel: SkStrokeJoin, Miter: SkStrokeJoin, Round: SkStrokeJoin, values: js.Array[SkStrokeJoin]): SkEnumSkStrokeJoinBevelSk = {
    val __obj = js.Dynamic.literal(Bevel = Bevel.asInstanceOf[js.Any], Miter = Miter.asInstanceOf[js.Any], Round = Round.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[SkEnumSkStrokeJoinBevelSk]
  }
  @scala.inline
  implicit class SkEnumSkStrokeJoinBevelSkOps[Self <: SkEnumSkStrokeJoinBevelSk] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setBevel(value: SkStrokeJoin): Self = this.set("Bevel", value.asInstanceOf[js.Any])
    @scala.inline
    def setMiter(value: SkStrokeJoin): Self = this.set("Miter", value.asInstanceOf[js.Any])
    @scala.inline
    def setRound(value: SkStrokeJoin): Self = this.set("Round", value.asInstanceOf[js.Any])
    @scala.inline
    def setValuesVarargs(value: SkStrokeJoin*): Self = this.set("values", js.Array(value :_*))
    @scala.inline
    def setValues(value: js.Array[SkStrokeJoin]): Self = this.set("values", value.asInstanceOf[js.Any])
  }
  
}

