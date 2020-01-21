package typings.canvaskitWasm

import typings.canvaskitWasm.mod.SkPaintStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFill extends js.Object {
  var Fill: SkPaintStyle
  var Stroke: SkPaintStyle
  var StrokeAndFill: SkPaintStyle
}

object AnonFill {
  @scala.inline
  def apply(Fill: SkPaintStyle, Stroke: SkPaintStyle, StrokeAndFill: SkPaintStyle): AnonFill = {
    val __obj = js.Dynamic.literal(Fill = Fill.asInstanceOf[js.Any], Stroke = Stroke.asInstanceOf[js.Any], StrokeAndFill = StrokeAndFill.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonFill]
  }
}

