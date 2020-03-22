package typings.canvaskitWasm

import typings.canvaskitWasm.mod.SkPaintStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined canvaskit-wasm.canvaskit-wasm.SkEnum<canvaskit-wasm.canvaskit-wasm.SkPaintStyle, {  Fill  :canvaskit-wasm.canvaskit-wasm.SkPaintStyle,   Stroke  :canvaskit-wasm.canvaskit-wasm.SkPaintStyle,   StrokeAndFill  :canvaskit-wasm.canvaskit-wasm.SkPaintStyle}> */
trait SkEnumSkPaintStyleFillSkP extends js.Object {
  val Fill: SkPaintStyle
  val Stroke: SkPaintStyle
  val StrokeAndFill: SkPaintStyle
  val values: js.Array[SkPaintStyle]
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
}

