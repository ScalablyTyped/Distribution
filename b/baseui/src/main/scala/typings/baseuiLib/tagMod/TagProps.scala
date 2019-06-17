package typings
package baseuiLib.tagMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TagProps extends js.Object {
  var children: js.UndefOr[reactLib.reactMod.ReactNode] = js.undefined
  var closeable: js.UndefOr[scala.Boolean] = js.undefined
  var color: js.UndefOr[java.lang.String] = js.undefined
  var disabled: js.UndefOr[scala.Boolean] = js.undefined
  var isFocused: js.UndefOr[scala.Boolean] = js.undefined
  var isHovered: js.UndefOr[scala.Boolean] = js.undefined
  var kind: js.UndefOr[
    baseuiLib.baseuiLibStrings.custom | baseuiLib.baseuiLibStrings.negative | baseuiLib.baseuiLibStrings.warning | baseuiLib.baseuiLibStrings.positive | baseuiLib.baseuiLibStrings.neutral | baseuiLib.baseuiLibStrings.primary
  ] = js.undefined
  var onActionClick: js.UndefOr[
    js.Function2[/* e */ stdLib.Event, /* children */ js.UndefOr[reactLib.reactMod.ReactNode], _]
  ] = js.undefined
  var onActionKeyDown: js.UndefOr[
    js.Function2[/* e */ stdLib.Event, /* children */ js.UndefOr[reactLib.reactMod.ReactNode], _]
  ] = js.undefined
  var onClick: js.UndefOr[js.Function1[/* event */ stdLib.Event, _]] = js.undefined
  var onKeyDown: js.UndefOr[js.Function1[/* event */ stdLib.Event, _]] = js.undefined
  var overrides: js.UndefOr[TagOverrides] = js.undefined
  var variant: js.UndefOr[
    baseuiLib.baseuiLibStrings.solid | baseuiLib.baseuiLibStrings.light | baseuiLib.baseuiLibStrings.outlined
  ] = js.undefined
}

object TagProps {
  @scala.inline
  def apply(
    children: reactLib.reactMod.ReactNode = null,
    closeable: js.UndefOr[scala.Boolean] = js.undefined,
    color: java.lang.String = null,
    disabled: js.UndefOr[scala.Boolean] = js.undefined,
    isFocused: js.UndefOr[scala.Boolean] = js.undefined,
    isHovered: js.UndefOr[scala.Boolean] = js.undefined,
    kind: baseuiLib.baseuiLibStrings.custom | baseuiLib.baseuiLibStrings.negative | baseuiLib.baseuiLibStrings.warning | baseuiLib.baseuiLibStrings.positive | baseuiLib.baseuiLibStrings.neutral | baseuiLib.baseuiLibStrings.primary = null,
    onActionClick: (/* e */ stdLib.Event, /* children */ js.UndefOr[reactLib.reactMod.ReactNode]) => _ = null,
    onActionKeyDown: (/* e */ stdLib.Event, /* children */ js.UndefOr[reactLib.reactMod.ReactNode]) => _ = null,
    onClick: /* event */ stdLib.Event => _ = null,
    onKeyDown: /* event */ stdLib.Event => _ = null,
    overrides: TagOverrides = null,
    variant: baseuiLib.baseuiLibStrings.solid | baseuiLib.baseuiLibStrings.light | baseuiLib.baseuiLibStrings.outlined = null
  ): TagProps = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (!js.isUndefined(closeable)) __obj.updateDynamic("closeable")(closeable)
    if (color != null) __obj.updateDynamic("color")(color)
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (!js.isUndefined(isFocused)) __obj.updateDynamic("isFocused")(isFocused)
    if (!js.isUndefined(isHovered)) __obj.updateDynamic("isHovered")(isHovered)
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (onActionClick != null) __obj.updateDynamic("onActionClick")(js.Any.fromFunction2(onActionClick))
    if (onActionKeyDown != null) __obj.updateDynamic("onActionKeyDown")(js.Any.fromFunction2(onActionKeyDown))
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction1(onClick))
    if (onKeyDown != null) __obj.updateDynamic("onKeyDown")(js.Any.fromFunction1(onKeyDown))
    if (overrides != null) __obj.updateDynamic("overrides")(overrides)
    if (variant != null) __obj.updateDynamic("variant")(variant.asInstanceOf[js.Any])
    __obj.asInstanceOf[TagProps]
  }
}

