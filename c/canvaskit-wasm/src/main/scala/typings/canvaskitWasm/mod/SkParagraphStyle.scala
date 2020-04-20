package typings.canvaskitWasm.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SkParagraphStyle extends js.Object {
  var disableHinting: Boolean
  var heightMultiplier: Double
  var maxLines: Double
  var textAlign: SkTextAlign
  var textDirection: SkTextDirection
  var textStyle: SkTextStyle
}

object SkParagraphStyle {
  @scala.inline
  def apply(
    disableHinting: Boolean,
    heightMultiplier: Double,
    maxLines: Double,
    textAlign: SkTextAlign,
    textDirection: SkTextDirection,
    textStyle: SkTextStyle
  ): SkParagraphStyle = {
    val __obj = js.Dynamic.literal(disableHinting = disableHinting.asInstanceOf[js.Any], heightMultiplier = heightMultiplier.asInstanceOf[js.Any], maxLines = maxLines.asInstanceOf[js.Any], textAlign = textAlign.asInstanceOf[js.Any], textDirection = textDirection.asInstanceOf[js.Any], textStyle = textStyle.asInstanceOf[js.Any])
    __obj.asInstanceOf[SkParagraphStyle]
  }
}

