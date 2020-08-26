package typings.canvaskitWasm.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SkParagraphStyle extends js.Object {
  var disableHinting: Boolean = js.native
  var heightMultiplier: Double = js.native
  var maxLines: Double = js.native
  var textAlign: SkTextAlign = js.native
  var textDirection: SkTextDirection = js.native
  var textStyle: SkTextStyle = js.native
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
  @scala.inline
  implicit class SkParagraphStyleOps[Self <: SkParagraphStyle] (val x: Self) extends AnyVal {
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
    def setDisableHinting(value: Boolean): Self = this.set("disableHinting", value.asInstanceOf[js.Any])
    @scala.inline
    def setHeightMultiplier(value: Double): Self = this.set("heightMultiplier", value.asInstanceOf[js.Any])
    @scala.inline
    def setMaxLines(value: Double): Self = this.set("maxLines", value.asInstanceOf[js.Any])
    @scala.inline
    def setTextAlign(value: SkTextAlign): Self = this.set("textAlign", value.asInstanceOf[js.Any])
    @scala.inline
    def setTextDirection(value: SkTextDirection): Self = this.set("textDirection", value.asInstanceOf[js.Any])
    @scala.inline
    def setTextStyle(value: SkTextStyle): Self = this.set("textStyle", value.asInstanceOf[js.Any])
  }
  
}

