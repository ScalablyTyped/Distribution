package typings.canvaskitWasm.anon

import typings.canvaskitWasm.mod.SkPaintStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined canvaskit-wasm.canvaskit-wasm.SkEnum<canvaskit-wasm.canvaskit-wasm.SkPaintStyle, {  Fill :canvaskit-wasm.canvaskit-wasm.SkPaintStyle,   Stroke :canvaskit-wasm.canvaskit-wasm.SkPaintStyle,   StrokeAndFill :canvaskit-wasm.canvaskit-wasm.SkPaintStyle}> */
@js.native
trait SkEnumSkPaintStyleFillSkP extends js.Object {
  val Fill: SkPaintStyle = js.native
  val Stroke: SkPaintStyle = js.native
  val StrokeAndFill: SkPaintStyle = js.native
  val values: js.Array[SkPaintStyle] = js.native
}

object SkEnumSkPaintStyleFillSkP {
  @scala.inline
  def apply(
    Fill: SkPaintStyle,
    Stroke: SkPaintStyle,
    StrokeAndFill: SkPaintStyle,
    values: js.Array[SkPaintStyle]
  ): SkEnumSkPaintStyleFillSkP = {
    val __obj = js.Dynamic.literal(Fill = Fill.asInstanceOf[js.Any], Stroke = Stroke.asInstanceOf[js.Any], StrokeAndFill = StrokeAndFill.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[SkEnumSkPaintStyleFillSkP]
  }
  @scala.inline
  implicit class SkEnumSkPaintStyleFillSkPOps[Self <: SkEnumSkPaintStyleFillSkP] (val x: Self) extends AnyVal {
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
    def setFill(value: SkPaintStyle): Self = this.set("Fill", value.asInstanceOf[js.Any])
    @scala.inline
    def setStroke(value: SkPaintStyle): Self = this.set("Stroke", value.asInstanceOf[js.Any])
    @scala.inline
    def setStrokeAndFill(value: SkPaintStyle): Self = this.set("StrokeAndFill", value.asInstanceOf[js.Any])
    @scala.inline
    def setValuesVarargs(value: SkPaintStyle*): Self = this.set("values", js.Array(value :_*))
    @scala.inline
    def setValues(value: js.Array[SkPaintStyle]): Self = this.set("values", value.asInstanceOf[js.Any])
  }
  
}

