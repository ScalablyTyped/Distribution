package typings.canvaskitWasm.anon

import typings.canvaskitWasm.mod.SkTextDirection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined canvaskit-wasm.canvaskit-wasm.SkEnum<canvaskit-wasm.canvaskit-wasm.SkTextDirection, {  LTR :canvaskit-wasm.canvaskit-wasm.SkTextDirection,   RTL :canvaskit-wasm.canvaskit-wasm.SkTextDirection}> */
@js.native
trait SkEnumSkTextDirectionLTRS extends js.Object {
  val LTR: SkTextDirection = js.native
  val RTL: SkTextDirection = js.native
  val values: js.Array[SkTextDirection] = js.native
}

object SkEnumSkTextDirectionLTRS {
  @scala.inline
  def apply(LTR: SkTextDirection, RTL: SkTextDirection, values: js.Array[SkTextDirection]): SkEnumSkTextDirectionLTRS = {
    val __obj = js.Dynamic.literal(LTR = LTR.asInstanceOf[js.Any], RTL = RTL.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[SkEnumSkTextDirectionLTRS]
  }
  @scala.inline
  implicit class SkEnumSkTextDirectionLTRSOps[Self <: SkEnumSkTextDirectionLTRS] (val x: Self) extends AnyVal {
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
    def setLTR(value: SkTextDirection): Self = this.set("LTR", value.asInstanceOf[js.Any])
    @scala.inline
    def setRTL(value: SkTextDirection): Self = this.set("RTL", value.asInstanceOf[js.Any])
    @scala.inline
    def setValuesVarargs(value: SkTextDirection*): Self = this.set("values", js.Array(value :_*))
    @scala.inline
    def setValues(value: js.Array[SkTextDirection]): Self = this.set("values", value.asInstanceOf[js.Any])
  }
  
}

