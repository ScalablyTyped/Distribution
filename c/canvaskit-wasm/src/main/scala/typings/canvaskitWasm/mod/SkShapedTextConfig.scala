package typings.canvaskitWasm.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SkShapedTextConfig extends js.Object {
  var font: SkFont = js.native
  var leftToRight: Boolean = js.native
  var text: String = js.native
  var width: Double = js.native
}

object SkShapedTextConfig {
  @scala.inline
  def apply(font: SkFont, leftToRight: Boolean, text: String, width: Double): SkShapedTextConfig = {
    val __obj = js.Dynamic.literal(font = font.asInstanceOf[js.Any], leftToRight = leftToRight.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[SkShapedTextConfig]
  }
  @scala.inline
  implicit class SkShapedTextConfigOps[Self <: SkShapedTextConfig] (val x: Self) extends AnyVal {
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
    def setFont(value: SkFont): Self = this.set("font", value.asInstanceOf[js.Any])
    @scala.inline
    def setLeftToRight(value: Boolean): Self = this.set("leftToRight", value.asInstanceOf[js.Any])
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
  }
  
}

