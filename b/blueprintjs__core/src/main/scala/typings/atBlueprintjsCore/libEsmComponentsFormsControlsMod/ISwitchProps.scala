package typings.atBlueprintjsCore.libEsmComponentsFormsControlsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISwitchProps extends IControlProps {
  /**
    * Text to display inside the switch indicator when unchecked.
    */
  var innerLabel: js.UndefOr[String] = js.undefined
  /**
    * Text to display inside the switch indicator when checked.
    * If `innerLabel` is provided and this prop is omitted, then `innerLabel`
    * will be used for both states.
    * @default innerLabel
    */
  var innerLabelChecked: js.UndefOr[String] = js.undefined
}

object ISwitchProps {
  @scala.inline
  def apply(IControlProps: IControlProps = null, innerLabel: String = null, innerLabelChecked: String = null): ISwitchProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, IControlProps)
    if (innerLabel != null) __obj.updateDynamic("innerLabel")(innerLabel)
    if (innerLabelChecked != null) __obj.updateDynamic("innerLabelChecked")(innerLabelChecked)
    __obj.asInstanceOf[ISwitchProps]
  }
}

