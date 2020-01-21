package typings.canvaskitWasm

import typings.canvaskitWasm.mod.SkTextAlign
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCenter extends js.Object {
  var Center: SkTextAlign
  var End: SkTextAlign
  var Justify: SkTextAlign
  var Left: SkTextAlign
  var Right: SkTextAlign
  var Start: SkTextAlign
}

object AnonCenter {
  @scala.inline
  def apply(
    Center: SkTextAlign,
    End: SkTextAlign,
    Justify: SkTextAlign,
    Left: SkTextAlign,
    Right: SkTextAlign,
    Start: SkTextAlign
  ): AnonCenter = {
    val __obj = js.Dynamic.literal(Center = Center.asInstanceOf[js.Any], End = End.asInstanceOf[js.Any], Justify = Justify.asInstanceOf[js.Any], Left = Left.asInstanceOf[js.Any], Right = Right.asInstanceOf[js.Any], Start = Start.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonCenter]
  }
}

