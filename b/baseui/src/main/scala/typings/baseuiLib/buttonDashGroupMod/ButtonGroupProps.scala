package typings
package baseuiLib.buttonDashGroupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ButtonGroupProps extends js.Object {
  var ariaLabel: js.UndefOr[java.lang.String] = js.undefined
  var children: reactLib.reactMod.ReactNode
  var disabled: js.UndefOr[scala.Boolean] = js.undefined
  var mode: js.UndefOr[baseuiLib.baseuiLibStrings.checkbox | baseuiLib.baseuiLibStrings.radio] = js.undefined
  var onClick: js.UndefOr[
    js.Function1[/* event */ reactLib.reactMod.MouseEventHandler[stdLib.HTMLButtonElement], _]
  ] = js.undefined
  var overrides: js.UndefOr[ButtonGroupOverrides] = js.undefined
  var selected: js.UndefOr[scala.Double | js.Array[scala.Double]] = js.undefined
  var shape: js.UndefOr[
    baseuiLib.baseuiLibStrings.default | baseuiLib.baseuiLibStrings.round | baseuiLib.baseuiLibStrings.square
  ] = js.undefined
  var size: js.UndefOr[
    baseuiLib.baseuiLibStrings.compact | baseuiLib.baseuiLibStrings.default | baseuiLib.baseuiLibStrings.large
  ] = js.undefined
}

object ButtonGroupProps {
  @scala.inline
  def apply(
    children: reactLib.reactMod.ReactNode,
    ariaLabel: java.lang.String = null,
    disabled: js.UndefOr[scala.Boolean] = js.undefined,
    mode: baseuiLib.baseuiLibStrings.checkbox | baseuiLib.baseuiLibStrings.radio = null,
    onClick: /* event */ reactLib.reactMod.MouseEventHandler[stdLib.HTMLButtonElement] => _ = null,
    overrides: ButtonGroupOverrides = null,
    selected: scala.Double | js.Array[scala.Double] = null,
    shape: baseuiLib.baseuiLibStrings.default | baseuiLib.baseuiLibStrings.round | baseuiLib.baseuiLibStrings.square = null,
    size: baseuiLib.baseuiLibStrings.compact | baseuiLib.baseuiLibStrings.default | baseuiLib.baseuiLibStrings.large = null
  ): ButtonGroupProps = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    if (ariaLabel != null) __obj.updateDynamic("ariaLabel")(ariaLabel)
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction1(onClick))
    if (overrides != null) __obj.updateDynamic("overrides")(overrides)
    if (selected != null) __obj.updateDynamic("selected")(selected.asInstanceOf[js.Any])
    if (shape != null) __obj.updateDynamic("shape")(shape.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    __obj.asInstanceOf[ButtonGroupProps]
  }
}

