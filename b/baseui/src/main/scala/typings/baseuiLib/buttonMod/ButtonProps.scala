package typings
package baseuiLib.buttonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ButtonProps extends js.Object {
  var children: js.UndefOr[reactLib.reactMod.ReactNode] = js.undefined
  var disabled: js.UndefOr[scala.Boolean] = js.undefined
  var endEnhancer: js.UndefOr[reactLib.reactMod.ReactNode] = js.undefined
  var isLoading: js.UndefOr[scala.Boolean] = js.undefined
  var isSelected: js.UndefOr[scala.Boolean] = js.undefined
  var kind: js.UndefOr[
    baseuiLib.baseuiLibStrings.primary | baseuiLib.baseuiLibStrings.secondary | baseuiLib.baseuiLibStrings.tertiary | baseuiLib.baseuiLibStrings.minimal
  ] = js.undefined
  var onClick: js.UndefOr[
    js.Function1[
      /* event */ reactLib.reactMod.SyntheticEvent[stdLib.HTMLButtonElement, reactLib.Event], 
      _
    ]
  ] = js.undefined
  var overrides: js.UndefOr[ButtonOverrides] = js.undefined
  var shape: js.UndefOr[
    baseuiLib.baseuiLibStrings.default | baseuiLib.baseuiLibStrings.round | baseuiLib.baseuiLibStrings.square
  ] = js.undefined
  var size: js.UndefOr[
    baseuiLib.baseuiLibStrings.compact | baseuiLib.baseuiLibStrings.default | baseuiLib.baseuiLibStrings.large
  ] = js.undefined
  var startEnhancer: js.UndefOr[reactLib.reactMod.ReactNode] = js.undefined
}

object ButtonProps {
  @scala.inline
  def apply(
    children: reactLib.reactMod.ReactNode = null,
    disabled: js.UndefOr[scala.Boolean] = js.undefined,
    endEnhancer: reactLib.reactMod.ReactNode = null,
    isLoading: js.UndefOr[scala.Boolean] = js.undefined,
    isSelected: js.UndefOr[scala.Boolean] = js.undefined,
    kind: baseuiLib.baseuiLibStrings.primary | baseuiLib.baseuiLibStrings.secondary | baseuiLib.baseuiLibStrings.tertiary | baseuiLib.baseuiLibStrings.minimal = null,
    onClick: /* event */ reactLib.reactMod.SyntheticEvent[stdLib.HTMLButtonElement, reactLib.Event] => _ = null,
    overrides: ButtonOverrides = null,
    shape: baseuiLib.baseuiLibStrings.default | baseuiLib.baseuiLibStrings.round | baseuiLib.baseuiLibStrings.square = null,
    size: baseuiLib.baseuiLibStrings.compact | baseuiLib.baseuiLibStrings.default | baseuiLib.baseuiLibStrings.large = null,
    startEnhancer: reactLib.reactMod.ReactNode = null
  ): ButtonProps = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (endEnhancer != null) __obj.updateDynamic("endEnhancer")(endEnhancer.asInstanceOf[js.Any])
    if (!js.isUndefined(isLoading)) __obj.updateDynamic("isLoading")(isLoading)
    if (!js.isUndefined(isSelected)) __obj.updateDynamic("isSelected")(isSelected)
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction1(onClick))
    if (overrides != null) __obj.updateDynamic("overrides")(overrides)
    if (shape != null) __obj.updateDynamic("shape")(shape.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (startEnhancer != null) __obj.updateDynamic("startEnhancer")(startEnhancer.asInstanceOf[js.Any])
    __obj.asInstanceOf[ButtonProps]
  }
}

