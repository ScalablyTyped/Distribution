package typings.baseui.checkboxMod

import typings.baseui.baseuiStrings.bottom
import typings.baseui.baseuiStrings.default_
import typings.baseui.baseuiStrings.left
import typings.baseui.baseuiStrings.right
import typings.baseui.baseuiStrings.toggle
import typings.baseui.baseuiStrings.toggle_round
import typings.baseui.baseuiStrings.top
import typings.react.reactMod.FocusEvent
import typings.react.reactMod.FocusEventHandler
import typings.react.reactMod.FormEvent
import typings.react.reactMod.FormEventHandler
import typings.react.reactMod.MouseEvent
import typings.react.reactMod.MouseEventHandler
import typings.react.reactMod.NativeMouseEvent
import typings.react.reactMod.ReactNode
import typings.react.reactMod.Ref
import typings.std.HTMLInputElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StatefulCheckboxProps extends js.Object {
  var autoFocus: js.UndefOr[Boolean] = js.undefined
  var checkmarkType: js.UndefOr[default_ | toggle | toggle_round] = js.undefined
  var children: js.UndefOr[ReactNode] = js.undefined
  var disabled: js.UndefOr[Boolean] = js.undefined
  var initialState: js.UndefOr[typings.baseui.checkboxMod.initialState] = js.undefined
  var inputRef: js.UndefOr[Ref[HTMLInputElement]] = js.undefined
  var isError: js.UndefOr[Boolean] = js.undefined
  var isIndeterminate: js.UndefOr[Boolean] = js.undefined
  var labelPlacement: js.UndefOr[top | right | bottom | left] = js.undefined
  var onBlur: js.UndefOr[FocusEventHandler[HTMLInputElement]] = js.undefined
  var onChange: js.UndefOr[FormEventHandler[HTMLInputElement]] = js.undefined
  var onFocus: js.UndefOr[FocusEventHandler[HTMLInputElement]] = js.undefined
  var onMouseEnter: js.UndefOr[MouseEventHandler[HTMLInputElement]] = js.undefined
  var onMouseLeave: js.UndefOr[MouseEventHandler[HTMLInputElement]] = js.undefined
  var overrides: js.UndefOr[CheckboxOverrides] = js.undefined
}

object StatefulCheckboxProps {
  @scala.inline
  def apply(
    autoFocus: js.UndefOr[Boolean] = js.undefined,
    checkmarkType: default_ | toggle | toggle_round = null,
    children: ReactNode = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    initialState: initialState = null,
    inputRef: Ref[HTMLInputElement] = null,
    isError: js.UndefOr[Boolean] = js.undefined,
    isIndeterminate: js.UndefOr[Boolean] = js.undefined,
    labelPlacement: top | right | bottom | left = null,
    onBlur: FocusEvent[HTMLInputElement] => Unit = null,
    onChange: FormEvent[HTMLInputElement] => Unit = null,
    onFocus: FocusEvent[HTMLInputElement] => Unit = null,
    onMouseEnter: MouseEvent[HTMLInputElement, NativeMouseEvent] => Unit = null,
    onMouseLeave: MouseEvent[HTMLInputElement, NativeMouseEvent] => Unit = null,
    overrides: CheckboxOverrides = null
  ): StatefulCheckboxProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoFocus)) __obj.updateDynamic("autoFocus")(autoFocus.asInstanceOf[js.Any])
    if (checkmarkType != null) __obj.updateDynamic("checkmarkType")(checkmarkType.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (initialState != null) __obj.updateDynamic("initialState")(initialState.asInstanceOf[js.Any])
    if (inputRef != null) __obj.updateDynamic("inputRef")(inputRef.asInstanceOf[js.Any])
    if (!js.isUndefined(isError)) __obj.updateDynamic("isError")(isError.asInstanceOf[js.Any])
    if (!js.isUndefined(isIndeterminate)) __obj.updateDynamic("isIndeterminate")(isIndeterminate.asInstanceOf[js.Any])
    if (labelPlacement != null) __obj.updateDynamic("labelPlacement")(labelPlacement.asInstanceOf[js.Any])
    if (onBlur != null) __obj.updateDynamic("onBlur")(js.Any.fromFunction1(onBlur))
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (onFocus != null) __obj.updateDynamic("onFocus")(js.Any.fromFunction1(onFocus))
    if (onMouseEnter != null) __obj.updateDynamic("onMouseEnter")(js.Any.fromFunction1(onMouseEnter))
    if (onMouseLeave != null) __obj.updateDynamic("onMouseLeave")(js.Any.fromFunction1(onMouseLeave))
    if (overrides != null) __obj.updateDynamic("overrides")(overrides.asInstanceOf[js.Any])
    __obj.asInstanceOf[StatefulCheckboxProps]
  }
}

