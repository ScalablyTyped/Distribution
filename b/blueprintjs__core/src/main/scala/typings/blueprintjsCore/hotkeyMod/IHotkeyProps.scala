package typings.blueprintjsCore.hotkeyMod

import typings.blueprintjsCore.propsMod.IProps
import typings.std.KeyboardEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IHotkeyProps extends IProps {
  /**
    * Whether the hotkey should be triggerable when focused in a text input.
    * @default false
    */
  var allowInInput: js.UndefOr[Boolean] = js.undefined
  /**
    * Hotkey combination string, such as "space" or "cmd+n".
    */
  var combo: String
  /**
    * Whether the hotkey cannot be triggered.
    * @default false
    */
  var disabled: js.UndefOr[Boolean] = js.undefined
  /**
    * If `false`, the hotkey is active only when the target is focused. If
    * `true`, the hotkey can be triggered regardless of what component is
    * focused.
    * @default false
    */
  var global: js.UndefOr[Boolean] = js.undefined
  /**
    * Unless the hotkey is global, you must specify a group where the hotkey
    * will be displayed in the hotkeys dialog. This string will be displayed
    * in a header at the start of the group of hotkeys.
    */
  var group: js.UndefOr[String] = js.undefined
  /**
    * Human-friendly label for the hotkey.
    */
  var label: String
  /**
    * `keydown` event handler.
    */
  var onKeyDown: js.UndefOr[js.Function1[/* e */ KeyboardEvent, _]] = js.undefined
  /**
    * `keyup` event handler.
    */
  var onKeyUp: js.UndefOr[js.Function1[/* e */ KeyboardEvent, _]] = js.undefined
  /**
    * When `true`, invokes `event.preventDefault()` before the respective `onKeyDown` and
    * `onKeyUp` callbacks are invoked. Enabling this can simplify handler implementations.
    * @default false
    */
  var preventDefault: js.UndefOr[Boolean] = js.undefined
  /**
    * When `true`, invokes `event.stopPropagation()` before the respective `onKeyDown` and
    * `onKeyUp` callbacks are invoked. Enabling this can simplify handler implementations.
    * @default false
    */
  var stopPropagation: js.UndefOr[Boolean] = js.undefined
}

object IHotkeyProps {
  @scala.inline
  def apply(
    combo: String,
    label: String,
    allowInInput: js.UndefOr[Boolean] = js.undefined,
    className: String = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    global: js.UndefOr[Boolean] = js.undefined,
    group: String = null,
    onKeyDown: /* e */ KeyboardEvent => _ = null,
    onKeyUp: /* e */ KeyboardEvent => _ = null,
    preventDefault: js.UndefOr[Boolean] = js.undefined,
    stopPropagation: js.UndefOr[Boolean] = js.undefined
  ): IHotkeyProps = {
    val __obj = js.Dynamic.literal(combo = combo.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    if (!js.isUndefined(allowInInput)) __obj.updateDynamic("allowInInput")(allowInInput.get.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.get.asInstanceOf[js.Any])
    if (!js.isUndefined(global)) __obj.updateDynamic("global")(global.get.asInstanceOf[js.Any])
    if (group != null) __obj.updateDynamic("group")(group.asInstanceOf[js.Any])
    if (onKeyDown != null) __obj.updateDynamic("onKeyDown")(js.Any.fromFunction1(onKeyDown))
    if (onKeyUp != null) __obj.updateDynamic("onKeyUp")(js.Any.fromFunction1(onKeyUp))
    if (!js.isUndefined(preventDefault)) __obj.updateDynamic("preventDefault")(preventDefault.get.asInstanceOf[js.Any])
    if (!js.isUndefined(stopPropagation)) __obj.updateDynamic("stopPropagation")(stopPropagation.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[IHotkeyProps]
  }
}

