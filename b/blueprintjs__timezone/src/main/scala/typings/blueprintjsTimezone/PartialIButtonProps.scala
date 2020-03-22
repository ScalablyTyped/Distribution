package typings.blueprintjsTimezone

import typings.blueprintjsCore.alignmentMod.Alignment
import typings.blueprintjsCore.intentMod.Intent
import typings.blueprintjsCore.propsMod.MaybeElement
import typings.blueprintjsIcons.iconNameMod.IconName
import typings.blueprintjsTimezone.blueprintjsTimezoneStrings.button
import typings.blueprintjsTimezone.blueprintjsTimezoneStrings.reset
import typings.blueprintjsTimezone.blueprintjsTimezoneStrings.submit
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.react.mod.ReactNode
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@blueprintjs/core.@blueprintjs/core.IButtonProps> */
trait PartialIButtonProps extends js.Object {
  var active: js.UndefOr[Boolean] = js.undefined
  var alignText: js.UndefOr[Alignment] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  var disabled: js.UndefOr[Boolean] = js.undefined
  var elementRef: js.UndefOr[js.Function1[/* ref */ HTMLElement | Null, _]] = js.undefined
  var fill: js.UndefOr[Boolean] = js.undefined
  var icon: js.UndefOr[IconName | MaybeElement] = js.undefined
  var intent: js.UndefOr[Intent] = js.undefined
  var large: js.UndefOr[Boolean] = js.undefined
  var loading: js.UndefOr[Boolean] = js.undefined
  var minimal: js.UndefOr[Boolean] = js.undefined
  var onClick: js.UndefOr[js.Function1[/* event */ MouseEvent[HTMLElement, NativeMouseEvent], Unit]] = js.undefined
  var outlined: js.UndefOr[Boolean] = js.undefined
  var rightIcon: js.UndefOr[IconName | MaybeElement] = js.undefined
  var small: js.UndefOr[Boolean] = js.undefined
  var text: js.UndefOr[ReactNode] = js.undefined
  var `type`: js.UndefOr[submit | reset | button] = js.undefined
}

object PartialIButtonProps {
  @scala.inline
  def apply(
    active: js.UndefOr[Boolean] = js.undefined,
    alignText: Alignment = null,
    className: String = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    elementRef: /* ref */ HTMLElement | Null => _ = null,
    fill: js.UndefOr[Boolean] = js.undefined,
    icon: IconName | MaybeElement = null,
    intent: Intent = null,
    large: js.UndefOr[Boolean] = js.undefined,
    loading: js.UndefOr[Boolean] = js.undefined,
    minimal: js.UndefOr[Boolean] = js.undefined,
    onClick: /* event */ MouseEvent[HTMLElement, NativeMouseEvent] => Unit = null,
    outlined: js.UndefOr[Boolean] = js.undefined,
    rightIcon: IconName | MaybeElement = null,
    small: js.UndefOr[Boolean] = js.undefined,
    text: ReactNode = null,
    `type`: submit | reset | button = null
  ): PartialIButtonProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(active)) __obj.updateDynamic("active")(active.asInstanceOf[js.Any])
    if (alignText != null) __obj.updateDynamic("alignText")(alignText.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (elementRef != null) __obj.updateDynamic("elementRef")(js.Any.fromFunction1(elementRef))
    if (!js.isUndefined(fill)) __obj.updateDynamic("fill")(fill.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (intent != null) __obj.updateDynamic("intent")(intent.asInstanceOf[js.Any])
    if (!js.isUndefined(large)) __obj.updateDynamic("large")(large.asInstanceOf[js.Any])
    if (!js.isUndefined(loading)) __obj.updateDynamic("loading")(loading.asInstanceOf[js.Any])
    if (!js.isUndefined(minimal)) __obj.updateDynamic("minimal")(minimal.asInstanceOf[js.Any])
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction1(onClick))
    if (!js.isUndefined(outlined)) __obj.updateDynamic("outlined")(outlined.asInstanceOf[js.Any])
    if (rightIcon != null) __obj.updateDynamic("rightIcon")(rightIcon.asInstanceOf[js.Any])
    if (!js.isUndefined(small)) __obj.updateDynamic("small")(small.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialIButtonProps]
  }
}

