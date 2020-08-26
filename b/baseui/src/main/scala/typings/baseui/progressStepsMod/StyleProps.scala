package typings.baseui.progressStepsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StyleProps extends js.Object {
  @JSName("$disabled")
  var $disabled: js.UndefOr[Boolean] = js.native
  @JSName("$isActive")
  var $isActive: js.UndefOr[Boolean] = js.native
  @JSName("$isCompleted")
  var $isCompleted: js.UndefOr[Boolean] = js.native
}

object StyleProps {
  @scala.inline
  def apply(): StyleProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StyleProps]
  }
  @scala.inline
  implicit class StylePropsOps[Self <: StyleProps] (val x: Self) extends AnyVal {
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
    def set$isActive(value: Boolean): Self = this.set("$isActive", value.asInstanceOf[js.Any])
    @scala.inline
    def delete$isActive: Self = this.set("$isActive", js.undefined)
    @scala.inline
    def set$isCompleted(value: Boolean): Self = this.set("$isCompleted", value.asInstanceOf[js.Any])
    @scala.inline
    def delete$isCompleted: Self = this.set("$isCompleted", js.undefined)
  }
  
}

