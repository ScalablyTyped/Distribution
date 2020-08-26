package typings.blueprintjsSelect.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Fill extends js.Object {
  var fill: Boolean = js.native
  var placeholder: String = js.native
}

object Fill {
  @scala.inline
  def apply(fill: Boolean, placeholder: String): Fill = {
    val __obj = js.Dynamic.literal(fill = fill.asInstanceOf[js.Any], placeholder = placeholder.asInstanceOf[js.Any])
    __obj.asInstanceOf[Fill]
  }
  @scala.inline
  implicit class FillOps[Self <: Fill] (val x: Self) extends AnyVal {
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
    def setFill(value: Boolean): Self = this.set("fill", value.asInstanceOf[js.Any])
    @scala.inline
    def setPlaceholder(value: String): Self = this.set("placeholder", value.asInstanceOf[js.Any])
  }
  
}

