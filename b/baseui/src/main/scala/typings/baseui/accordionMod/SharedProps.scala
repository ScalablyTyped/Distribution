package typings.baseui.accordionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SharedProps extends js.Object {
  @JSName("$color")
  var $color: js.UndefOr[String] = js.native
  @JSName("$disabled")
  var $disabled: js.UndefOr[Boolean] = js.native
  @JSName("$expanded")
  var $expanded: js.UndefOr[Boolean] = js.native
  @JSName("$size")
  var $size: js.UndefOr[String | Double] = js.native
}

object SharedProps {
  @scala.inline
  def apply(): SharedProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SharedProps]
  }
  @scala.inline
  implicit class SharedPropsOps[Self <: SharedProps] (val x: Self) extends AnyVal {
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
    def set$color(value: String): Self = this.set("$color", value.asInstanceOf[js.Any])
    @scala.inline
    def delete$color: Self = this.set("$color", js.undefined)
    @scala.inline
    def set$disabled(value: Boolean): Self = this.set("$disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def delete$disabled: Self = this.set("$disabled", js.undefined)
    @scala.inline
    def set$expanded(value: Boolean): Self = this.set("$expanded", value.asInstanceOf[js.Any])
    @scala.inline
    def delete$expanded: Self = this.set("$expanded", js.undefined)
    @scala.inline
    def set$size(value: String | Double): Self = this.set("$size", value.asInstanceOf[js.Any])
    @scala.inline
    def delete$size: Self = this.set("$size", js.undefined)
  }
  
}

