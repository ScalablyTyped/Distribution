package typings.carbonComponents.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IconVisibilityOff extends js.Object {
  var iconVisibilityOff: js.Any = js.native
  var iconVisibilityOn: js.Any = js.native
  var passwordIsVisible: js.Any = js.native
  var selectorPasswordVisibilityTooltip: js.Any = js.native
}

object IconVisibilityOff {
  @scala.inline
  def apply(
    iconVisibilityOff: js.Any,
    iconVisibilityOn: js.Any,
    passwordIsVisible: js.Any,
    selectorPasswordVisibilityTooltip: js.Any
  ): IconVisibilityOff = {
    val __obj = js.Dynamic.literal(iconVisibilityOff = iconVisibilityOff.asInstanceOf[js.Any], iconVisibilityOn = iconVisibilityOn.asInstanceOf[js.Any], passwordIsVisible = passwordIsVisible.asInstanceOf[js.Any], selectorPasswordVisibilityTooltip = selectorPasswordVisibilityTooltip.asInstanceOf[js.Any])
    __obj.asInstanceOf[IconVisibilityOff]
  }
  @scala.inline
  implicit class IconVisibilityOffOps[Self <: IconVisibilityOff] (val x: Self) extends AnyVal {
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
    def setIconVisibilityOff(value: js.Any): Self = this.set("iconVisibilityOff", value.asInstanceOf[js.Any])
    @scala.inline
    def setIconVisibilityOn(value: js.Any): Self = this.set("iconVisibilityOn", value.asInstanceOf[js.Any])
    @scala.inline
    def setPasswordIsVisible(value: js.Any): Self = this.set("passwordIsVisible", value.asInstanceOf[js.Any])
    @scala.inline
    def setSelectorPasswordVisibilityTooltip(value: js.Any): Self = this.set("selectorPasswordVisibilityTooltip", value.asInstanceOf[js.Any])
  }
  
}

