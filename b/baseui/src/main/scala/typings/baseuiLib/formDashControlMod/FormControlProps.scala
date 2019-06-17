package typings
package baseuiLib.formDashControlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FormControlProps extends js.Object {
  var caption: js.UndefOr[reactLib.reactMod.ReactNode] = js.undefined
  var children: reactLib.reactMod.ReactNode
  var disabled: js.UndefOr[scala.Boolean] = js.undefined
  var error: js.UndefOr[scala.Boolean | reactLib.reactMod.ReactNode] = js.undefined
  var label: js.UndefOr[reactLib.reactMod.ReactNode] = js.undefined
  var overrides: js.UndefOr[FormControlOverrides] = js.undefined
  var positive: js.UndefOr[reactLib.reactMod.ReactNode] = js.undefined
}

object FormControlProps {
  @scala.inline
  def apply(
    children: reactLib.reactMod.ReactNode,
    caption: reactLib.reactMod.ReactNode = null,
    disabled: js.UndefOr[scala.Boolean] = js.undefined,
    error: scala.Boolean | reactLib.reactMod.ReactNode = null,
    label: reactLib.reactMod.ReactNode = null,
    overrides: FormControlOverrides = null,
    positive: reactLib.reactMod.ReactNode = null
  ): FormControlProps = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    if (caption != null) __obj.updateDynamic("caption")(caption.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (error != null) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (overrides != null) __obj.updateDynamic("overrides")(overrides)
    if (positive != null) __obj.updateDynamic("positive")(positive.asInstanceOf[js.Any])
    __obj.asInstanceOf[FormControlProps]
  }
}

