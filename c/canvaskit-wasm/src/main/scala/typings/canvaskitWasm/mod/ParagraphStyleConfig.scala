package typings.canvaskitWasm.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParagraphStyleConfig extends js.Object {
  var disableHinting: js.UndefOr[Boolean] = js.native
  var ellipsis: js.UndefOr[String] = js.native
  var maxLines: js.UndefOr[Double] = js.native
  var textAlign: js.UndefOr[SkTextAlign] = js.native
  var textDirection: js.UndefOr[SkTextDirection] = js.native
  var textStyle: TextStyleConfig = js.native
}

object ParagraphStyleConfig {
  @scala.inline
  def apply(textStyle: TextStyleConfig): ParagraphStyleConfig = {
    val __obj = js.Dynamic.literal(textStyle = textStyle.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParagraphStyleConfig]
  }
  @scala.inline
  implicit class ParagraphStyleConfigOps[Self <: ParagraphStyleConfig] (val x: Self) extends AnyVal {
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
    def setTextStyle(value: TextStyleConfig): Self = this.set("textStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def setDisableHinting(value: Boolean): Self = this.set("disableHinting", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisableHinting: Self = this.set("disableHinting", js.undefined)
    @scala.inline
    def setEllipsis(value: String): Self = this.set("ellipsis", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEllipsis: Self = this.set("ellipsis", js.undefined)
    @scala.inline
    def setMaxLines(value: Double): Self = this.set("maxLines", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxLines: Self = this.set("maxLines", js.undefined)
    @scala.inline
    def setTextAlign(value: SkTextAlign): Self = this.set("textAlign", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTextAlign: Self = this.set("textAlign", js.undefined)
    @scala.inline
    def setTextDirection(value: SkTextDirection): Self = this.set("textDirection", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTextDirection: Self = this.set("textDirection", js.undefined)
  }
  
}

