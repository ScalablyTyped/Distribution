package typings.baseui.buttonGroupMod

import typings.baseui.baseuiStrings.checkbox
import typings.baseui.baseuiStrings.compact
import typings.baseui.baseuiStrings.default_
import typings.baseui.baseuiStrings.large_
import typings.baseui.baseuiStrings.mini
import typings.baseui.baseuiStrings.minimal
import typings.baseui.baseuiStrings.pill
import typings.baseui.baseuiStrings.primary
import typings.baseui.baseuiStrings.radio
import typings.baseui.baseuiStrings.round
import typings.baseui.baseuiStrings.secondary
import typings.baseui.baseuiStrings.square
import typings.baseui.baseuiStrings.tertiary
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.react.mod.ReactNode
import typings.std.HTMLButtonElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ButtonGroupProps extends js.Object {
  var ariaLabel: js.UndefOr[String] = js.undefined
  var children: ReactNode
  var disabled: js.UndefOr[Boolean] = js.undefined
  var kind: js.UndefOr[primary | secondary | tertiary | minimal] = js.undefined
  var mode: js.UndefOr[checkbox | radio] = js.undefined
  var onClick: js.UndefOr[
    js.Function2[/* event */ MouseEvent[HTMLButtonElement, NativeMouseEvent], /* index */ Double, _]
  ] = js.undefined
  var overrides: js.UndefOr[ButtonGroupOverrides] = js.undefined
  var selected: js.UndefOr[Double | js.Array[Double]] = js.undefined
  var shape: js.UndefOr[default_ | pill | round | square] = js.undefined
  var size: js.UndefOr[compact | default_ | large_ | mini] = js.undefined
}

object ButtonGroupProps {
  @scala.inline
  def apply(
    ariaLabel: String = null,
    children: ReactNode = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    kind: primary | secondary | tertiary | minimal = null,
    mode: checkbox | radio = null,
    onClick: (/* event */ MouseEvent[HTMLButtonElement, NativeMouseEvent], /* index */ Double) => _ = null,
    overrides: ButtonGroupOverrides = null,
    selected: Double | js.Array[Double] = null,
    shape: default_ | pill | round | square = null,
    size: compact | default_ | large_ | mini = null
  ): ButtonGroupProps = {
    val __obj = js.Dynamic.literal()
    if (ariaLabel != null) __obj.updateDynamic("ariaLabel")(ariaLabel.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction2(onClick))
    if (overrides != null) __obj.updateDynamic("overrides")(overrides.asInstanceOf[js.Any])
    if (selected != null) __obj.updateDynamic("selected")(selected.asInstanceOf[js.Any])
    if (shape != null) __obj.updateDynamic("shape")(shape.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    __obj.asInstanceOf[ButtonGroupProps]
  }
}

