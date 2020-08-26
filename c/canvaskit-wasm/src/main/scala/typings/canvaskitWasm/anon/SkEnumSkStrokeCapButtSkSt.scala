package typings.canvaskitWasm.anon

import typings.canvaskitWasm.mod.SkStrokeCap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined canvaskit-wasm.canvaskit-wasm.SkEnum<canvaskit-wasm.canvaskit-wasm.SkStrokeCap, {  Butt :canvaskit-wasm.canvaskit-wasm.SkStrokeCap,   Round :canvaskit-wasm.canvaskit-wasm.SkStrokeCap,   Square :canvaskit-wasm.canvaskit-wasm.SkStrokeCap}> */
@js.native
trait SkEnumSkStrokeCapButtSkSt extends js.Object {
  val Butt: SkStrokeCap = js.native
  val Round: SkStrokeCap = js.native
  val Square: SkStrokeCap = js.native
  val values: js.Array[SkStrokeCap] = js.native
}

object SkEnumSkStrokeCapButtSkSt {
  @scala.inline
  def apply(Butt: SkStrokeCap, Round: SkStrokeCap, Square: SkStrokeCap, values: js.Array[SkStrokeCap]): SkEnumSkStrokeCapButtSkSt = {
    val __obj = js.Dynamic.literal(Butt = Butt.asInstanceOf[js.Any], Round = Round.asInstanceOf[js.Any], Square = Square.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[SkEnumSkStrokeCapButtSkSt]
  }
  @scala.inline
  implicit class SkEnumSkStrokeCapButtSkStOps[Self <: SkEnumSkStrokeCapButtSkSt] (val x: Self) extends AnyVal {
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
    def setButt(value: SkStrokeCap): Self = this.set("Butt", value.asInstanceOf[js.Any])
    @scala.inline
    def setRound(value: SkStrokeCap): Self = this.set("Round", value.asInstanceOf[js.Any])
    @scala.inline
    def setSquare(value: SkStrokeCap): Self = this.set("Square", value.asInstanceOf[js.Any])
    @scala.inline
    def setValuesVarargs(value: SkStrokeCap*): Self = this.set("values", js.Array(value :_*))
    @scala.inline
    def setValues(value: js.Array[SkStrokeCap]): Self = this.set("values", value.asInstanceOf[js.Any])
  }
  
}

