package typings.canvaskitDashWasm

import typings.canvaskitDashWasm.canvaskitDashWasmMod.SkPaintStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Fill extends js.Object {
  var Fill: SkPaintStyle
  var Stroke: SkPaintStyle
  var StrokeAndFill: SkPaintStyle
}

object Anon_Fill {
  @scala.inline
  def apply(Fill: SkPaintStyle, Stroke: SkPaintStyle, StrokeAndFill: SkPaintStyle): Anon_Fill = {
    val __obj = js.Dynamic.literal(Fill = Fill.asInstanceOf[js.Any], Stroke = Stroke.asInstanceOf[js.Any], StrokeAndFill = StrokeAndFill.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Fill]
  }
}

