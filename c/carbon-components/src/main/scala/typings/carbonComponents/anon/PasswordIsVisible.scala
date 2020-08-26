package typings.carbonComponents.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PasswordIsVisible extends js.Object {
  var passwordIsVisible: String = js.native
  var selectorInit: String = js.native
  var selectorPasswordField: String = js.native
  var selectorPasswordVisibilityButton: String = js.native
  var selectorPasswordVisibilityTooltip: String = js.native
  var svgIconVisibilityOff: String = js.native
  var svgIconVisibilityOn: String = js.native
}

object PasswordIsVisible {
  @scala.inline
  def apply(
    passwordIsVisible: String,
    selectorInit: String,
    selectorPasswordField: String,
    selectorPasswordVisibilityButton: String,
    selectorPasswordVisibilityTooltip: String,
    svgIconVisibilityOff: String,
    svgIconVisibilityOn: String
  ): PasswordIsVisible = {
    val __obj = js.Dynamic.literal(passwordIsVisible = passwordIsVisible.asInstanceOf[js.Any], selectorInit = selectorInit.asInstanceOf[js.Any], selectorPasswordField = selectorPasswordField.asInstanceOf[js.Any], selectorPasswordVisibilityButton = selectorPasswordVisibilityButton.asInstanceOf[js.Any], selectorPasswordVisibilityTooltip = selectorPasswordVisibilityTooltip.asInstanceOf[js.Any], svgIconVisibilityOff = svgIconVisibilityOff.asInstanceOf[js.Any], svgIconVisibilityOn = svgIconVisibilityOn.asInstanceOf[js.Any])
    __obj.asInstanceOf[PasswordIsVisible]
  }
  @scala.inline
  implicit class PasswordIsVisibleOps[Self <: PasswordIsVisible] (val x: Self) extends AnyVal {
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
    def setPasswordIsVisible(value: String): Self = this.set("passwordIsVisible", value.asInstanceOf[js.Any])
    @scala.inline
    def setSelectorInit(value: String): Self = this.set("selectorInit", value.asInstanceOf[js.Any])
    @scala.inline
    def setSelectorPasswordField(value: String): Self = this.set("selectorPasswordField", value.asInstanceOf[js.Any])
    @scala.inline
    def setSelectorPasswordVisibilityButton(value: String): Self = this.set("selectorPasswordVisibilityButton", value.asInstanceOf[js.Any])
    @scala.inline
    def setSelectorPasswordVisibilityTooltip(value: String): Self = this.set("selectorPasswordVisibilityTooltip", value.asInstanceOf[js.Any])
    @scala.inline
    def setSvgIconVisibilityOff(value: String): Self = this.set("svgIconVisibilityOff", value.asInstanceOf[js.Any])
    @scala.inline
    def setSvgIconVisibilityOn(value: String): Self = this.set("svgIconVisibilityOn", value.asInstanceOf[js.Any])
  }
  
}

