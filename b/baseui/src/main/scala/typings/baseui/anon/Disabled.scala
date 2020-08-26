package typings.baseui.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Disabled extends js.Object {
  @JSName("$disabled")
  var $disabled: js.UndefOr[Boolean] = js.native
  @JSName("$isHighlighted")
  var $isHighlighted: js.UndefOr[Boolean] = js.native
  @JSName("$selected")
  var $selected: js.UndefOr[Boolean] = js.native
}

object Disabled {
  @scala.inline
  def apply(): Disabled = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Disabled]
  }
  @scala.inline
  implicit class DisabledOps[Self <: Disabled] (val x: Self) extends AnyVal {
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
    def set$disabled(value: Boolean): Self = this.set("$disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def delete$disabled: Self = this.set("$disabled", js.undefined)
    @scala.inline
    def set$isHighlighted(value: Boolean): Self = this.set("$isHighlighted", value.asInstanceOf[js.Any])
    @scala.inline
    def delete$isHighlighted: Self = this.set("$isHighlighted", js.undefined)
    @scala.inline
    def set$selected(value: Boolean): Self = this.set("$selected", value.asInstanceOf[js.Any])
    @scala.inline
    def delete$selected: Self = this.set("$selected", js.undefined)
  }
  
}

