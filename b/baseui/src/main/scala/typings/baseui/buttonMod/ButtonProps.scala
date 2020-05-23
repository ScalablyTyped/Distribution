package typings.baseui.buttonMod

import typings.baseui.baseuiStrings.button
import typings.baseui.baseuiStrings.compact
import typings.baseui.baseuiStrings.default_
import typings.baseui.baseuiStrings.large_
import typings.baseui.baseuiStrings.mini
import typings.baseui.baseuiStrings.minimal
import typings.baseui.baseuiStrings.pill
import typings.baseui.baseuiStrings.primary
import typings.baseui.baseuiStrings.reset
import typings.baseui.baseuiStrings.round
import typings.baseui.baseuiStrings.secondary
import typings.baseui.baseuiStrings.square
import typings.baseui.baseuiStrings.submit
import typings.baseui.baseuiStrings.tertiary
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.react.mod.ReactNode
import typings.std.HTMLButtonElement
import typings.styletronReact.mod.StyleProp
import typings.styletronReact.mod.StyletronBase
import typings.styletronReact.mod.StyletronComponentInjectedProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ButtonProps extends StyletronComponentInjectedProps[ButtonProps] {
  var children: js.UndefOr[ReactNode] = js.undefined
  var disabled: js.UndefOr[Boolean] = js.undefined
  var endEnhancer: js.UndefOr[ReactNode] = js.undefined
  var href: js.UndefOr[String] = js.undefined
  var isLoading: js.UndefOr[Boolean] = js.undefined
  var isSelected: js.UndefOr[Boolean] = js.undefined
  var kind: js.UndefOr[primary | secondary | tertiary | minimal] = js.undefined
  var onClick: js.UndefOr[js.Function1[/* event */ MouseEvent[HTMLButtonElement, NativeMouseEvent], _]] = js.undefined
  var overrides: js.UndefOr[ButtonOverrides] = js.undefined
  var shape: js.UndefOr[default_ | pill | round | square] = js.undefined
  var size: js.UndefOr[compact | default_ | large_ | mini] = js.undefined
  var startEnhancer: js.UndefOr[ReactNode] = js.undefined
  var target: js.UndefOr[String] = js.undefined
  var `type`: js.UndefOr[submit | reset | button] = js.undefined
}

object ButtonProps {
  @scala.inline
  def apply(
    $as: StyletronBase = null,
    $style: StyleProp[ButtonProps] = null,
    children: ReactNode = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    endEnhancer: ReactNode = null,
    href: String = null,
    isLoading: js.UndefOr[Boolean] = js.undefined,
    isSelected: js.UndefOr[Boolean] = js.undefined,
    kind: primary | secondary | tertiary | minimal = null,
    onClick: /* event */ MouseEvent[HTMLButtonElement, NativeMouseEvent] => _ = null,
    overrides: ButtonOverrides = null,
    shape: default_ | pill | round | square = null,
    size: compact | default_ | large_ | mini = null,
    startEnhancer: ReactNode = null,
    target: String = null,
    `type`: submit | reset | button = null
  ): ButtonProps = {
    val __obj = js.Dynamic.literal()
    if ($as != null) __obj.updateDynamic("$as")($as.asInstanceOf[js.Any])
    if ($style != null) __obj.updateDynamic("$style")($style.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.get.asInstanceOf[js.Any])
    if (endEnhancer != null) __obj.updateDynamic("endEnhancer")(endEnhancer.asInstanceOf[js.Any])
    if (href != null) __obj.updateDynamic("href")(href.asInstanceOf[js.Any])
    if (!js.isUndefined(isLoading)) __obj.updateDynamic("isLoading")(isLoading.get.asInstanceOf[js.Any])
    if (!js.isUndefined(isSelected)) __obj.updateDynamic("isSelected")(isSelected.get.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction1(onClick))
    if (overrides != null) __obj.updateDynamic("overrides")(overrides.asInstanceOf[js.Any])
    if (shape != null) __obj.updateDynamic("shape")(shape.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (startEnhancer != null) __obj.updateDynamic("startEnhancer")(startEnhancer.asInstanceOf[js.Any])
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ButtonProps]
  }
}

