package typings.baseui.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IsHighlighted extends js.Object {
  @JSName("$disabled")
  var $disabled: Boolean = js.native
  @JSName("$isHighlighted")
  var $isHighlighted: Boolean = js.native
  @JSName("$selected")
  var $selected: Boolean = js.native
}

object IsHighlighted {
  @scala.inline
  def apply($disabled: Boolean, $isHighlighted: Boolean, $selected: Boolean): IsHighlighted = {
    val __obj = js.Dynamic.literal($disabled = $disabled.asInstanceOf[js.Any], $isHighlighted = $isHighlighted.asInstanceOf[js.Any], $selected = $selected.asInstanceOf[js.Any])
    __obj.asInstanceOf[IsHighlighted]
  }
  @scala.inline
  implicit class IsHighlightedOps[Self <: IsHighlighted] (val x: Self) extends AnyVal {
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
    def set$isHighlighted(value: Boolean): Self = this.set("$isHighlighted", value.asInstanceOf[js.Any])
    @scala.inline
    def set$selected(value: Boolean): Self = this.set("$selected", value.asInstanceOf[js.Any])
  }
  
}

