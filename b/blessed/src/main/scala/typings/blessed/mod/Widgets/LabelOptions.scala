package typings.blessed.mod.Widgets

import typings.blessed.mod.Widgets.Types.TAlign
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LabelOptions extends js.Object {
  var side: TAlign = js.native
  var text: String = js.native
}

object LabelOptions {
  @scala.inline
  def apply(side: TAlign, text: String): LabelOptions = {
    val __obj = js.Dynamic.literal(side = side.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[LabelOptions]
  }
  @scala.inline
  implicit class LabelOptionsOps[Self <: LabelOptions] (val x: Self) extends AnyVal {
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
    def setSide(value: TAlign): Self = this.set("side", value.asInstanceOf[js.Any])
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
  }
  
}

