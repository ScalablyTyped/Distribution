package typings.baseui.tagMod

import typings.baseui.baseuiStrings.accent
import typings.baseui.baseuiStrings.custom_
import typings.baseui.baseuiStrings.light
import typings.baseui.baseuiStrings.negative
import typings.baseui.baseuiStrings.neutral
import typings.baseui.baseuiStrings.outlined
import typings.baseui.baseuiStrings.positive
import typings.baseui.baseuiStrings.primary
import typings.baseui.baseuiStrings.solid
import typings.baseui.baseuiStrings.warning
import typings.react.mod.ReactNode
import typings.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TagProps extends js.Object {
  var children: js.UndefOr[ReactNode] = js.undefined
  var closeable: js.UndefOr[Boolean] = js.undefined
  var color: js.UndefOr[String] = js.undefined
  var disabled: js.UndefOr[Boolean] = js.undefined
  var isFocused: js.UndefOr[Boolean] = js.undefined
  var isHovered: js.UndefOr[Boolean] = js.undefined
  var kind: js.UndefOr[custom_ | accent | primary | neutral | positive | warning | negative] = js.undefined
  var onActionClick: js.UndefOr[js.Function2[/* e */ Event_, /* children */ js.UndefOr[ReactNode], _]] = js.undefined
  var onActionKeyDown: js.UndefOr[js.Function2[/* e */ Event_, /* children */ js.UndefOr[ReactNode], _]] = js.undefined
  var onClick: js.UndefOr[js.Function1[/* event */ Event_, _]] = js.undefined
  var onKeyDown: js.UndefOr[js.Function1[/* event */ Event_, _]] = js.undefined
  var overrides: js.UndefOr[TagOverrides] = js.undefined
  var title: js.UndefOr[String] = js.undefined
  var variant: js.UndefOr[solid | light | outlined] = js.undefined
}

object TagProps {
  @scala.inline
  def apply(
    children: ReactNode = null,
    closeable: js.UndefOr[Boolean] = js.undefined,
    color: String = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    isFocused: js.UndefOr[Boolean] = js.undefined,
    isHovered: js.UndefOr[Boolean] = js.undefined,
    kind: custom_ | accent | primary | neutral | positive | warning | negative = null,
    onActionClick: (/* e */ Event_, /* children */ js.UndefOr[ReactNode]) => _ = null,
    onActionKeyDown: (/* e */ Event_, /* children */ js.UndefOr[ReactNode]) => _ = null,
    onClick: /* event */ Event_ => _ = null,
    onKeyDown: /* event */ Event_ => _ = null,
    overrides: TagOverrides = null,
    title: String = null,
    variant: solid | light | outlined = null
  ): TagProps = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (!js.isUndefined(closeable)) __obj.updateDynamic("closeable")(closeable.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (!js.isUndefined(isFocused)) __obj.updateDynamic("isFocused")(isFocused.asInstanceOf[js.Any])
    if (!js.isUndefined(isHovered)) __obj.updateDynamic("isHovered")(isHovered.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (onActionClick != null) __obj.updateDynamic("onActionClick")(js.Any.fromFunction2(onActionClick))
    if (onActionKeyDown != null) __obj.updateDynamic("onActionKeyDown")(js.Any.fromFunction2(onActionKeyDown))
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction1(onClick))
    if (onKeyDown != null) __obj.updateDynamic("onKeyDown")(js.Any.fromFunction1(onKeyDown))
    if (overrides != null) __obj.updateDynamic("overrides")(overrides.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (variant != null) __obj.updateDynamic("variant")(variant.asInstanceOf[js.Any])
    __obj.asInstanceOf[TagProps]
  }
}

