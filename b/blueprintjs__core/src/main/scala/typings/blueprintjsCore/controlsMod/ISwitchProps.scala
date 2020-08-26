package typings.blueprintjsCore.controlsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ISwitchProps extends IControlProps {
  /**
    * Text to display inside the switch indicator when unchecked.
    */
  var innerLabel: js.UndefOr[String] = js.native
  /**
    * Text to display inside the switch indicator when checked.
    * If `innerLabel` is provided and this prop is omitted, then `innerLabel`
    * will be used for both states.
    * @default innerLabel
    */
  var innerLabelChecked: js.UndefOr[String] = js.native
}

object ISwitchProps {
  @scala.inline
  def apply(): ISwitchProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ISwitchProps]
  }
  @scala.inline
  implicit class ISwitchPropsOps[Self <: ISwitchProps] (val x: Self) extends AnyVal {
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
    def setInnerLabel(value: String): Self = this.set("innerLabel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInnerLabel: Self = this.set("innerLabel", js.undefined)
    @scala.inline
    def setInnerLabelChecked(value: String): Self = this.set("innerLabelChecked", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInnerLabelChecked: Self = this.set("innerLabelChecked", js.undefined)
  }
  
}

