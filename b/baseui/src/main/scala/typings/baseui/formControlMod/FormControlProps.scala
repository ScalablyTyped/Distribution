package typings.baseui.formControlMod

import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FormControlProps extends js.Object {
  var caption: js.UndefOr[ReactNode] = js.undefined
  var children: ReactNode
  var disabled: js.UndefOr[Boolean] = js.undefined
  var error: js.UndefOr[Boolean | ReactNode] = js.undefined
  var label: js.UndefOr[ReactNode] = js.undefined
  var overrides: js.UndefOr[FormControlOverrides] = js.undefined
  var positive: js.UndefOr[ReactNode] = js.undefined
}

object FormControlProps {
  @scala.inline
  def apply(
    caption: ReactNode = null,
    children: ReactNode = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    error: Boolean | ReactNode = null,
    label: ReactNode = null,
    overrides: FormControlOverrides = null,
    positive: ReactNode = null
  ): FormControlProps = {
    val __obj = js.Dynamic.literal()
    if (caption != null) __obj.updateDynamic("caption")(caption.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (overrides != null) __obj.updateDynamic("overrides")(overrides.asInstanceOf[js.Any])
    if (positive != null) __obj.updateDynamic("positive")(positive.asInstanceOf[js.Any])
    __obj.asInstanceOf[FormControlProps]
  }
}

