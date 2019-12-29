package typings.baseui.radioMod

import typings.baseui.baseuiStrings.bottom
import typings.baseui.baseuiStrings.left
import typings.baseui.baseuiStrings.right
import typings.baseui.baseuiStrings.top
import typings.react.reactMod.ChangeEvent
import typings.react.reactMod.ChangeEventHandler
import typings.react.reactMod.FocusEvent
import typings.react.reactMod.FocusEventHandler
import typings.react.reactMod.MouseEvent
import typings.react.reactMod.MouseEventHandler
import typings.react.reactMod.NativeMouseEvent
import typings.react.reactMod.ReactNode
import typings.react.reactMod.Ref
import typings.std.HTMLInputElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RadioProps extends js.Object {
  var autoFocus: js.UndefOr[Boolean] = js.undefined
  var checked: js.UndefOr[Boolean] = js.undefined
  var children: js.UndefOr[ReactNode] = js.undefined
  var description: js.UndefOr[String] = js.undefined
  var disabled: js.UndefOr[Boolean] = js.undefined
  var inputRef: js.UndefOr[Ref[HTMLInputElement]] = js.undefined
  var isError: js.UndefOr[Boolean] = js.undefined
  var labelPlacement: js.UndefOr[top | right | bottom | left] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var onBlur: js.UndefOr[FocusEventHandler[HTMLInputElement]] = js.undefined
  var onChange: js.UndefOr[ChangeEventHandler[HTMLInputElement]] = js.undefined
  var onFocus: js.UndefOr[FocusEventHandler[HTMLInputElement]] = js.undefined
  var onMouseDown: js.UndefOr[MouseEventHandler[HTMLInputElement]] = js.undefined
  var onMouseEnter: js.UndefOr[MouseEventHandler[HTMLInputElement]] = js.undefined
  var onMouseLeave: js.UndefOr[MouseEventHandler[HTMLInputElement]] = js.undefined
  var onMouseUp: js.UndefOr[MouseEventHandler[HTMLInputElement]] = js.undefined
  var overrides: js.UndefOr[RadioOverrides with RadioGroupOverrides] = js.undefined
  var required: js.UndefOr[Boolean] = js.undefined
  var value: js.UndefOr[String] = js.undefined
}

object RadioProps {
  @scala.inline
  def apply(
    autoFocus: js.UndefOr[Boolean] = js.undefined,
    checked: js.UndefOr[Boolean] = js.undefined,
    children: ReactNode = null,
    description: String = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    inputRef: Ref[HTMLInputElement] = null,
    isError: js.UndefOr[Boolean] = js.undefined,
    labelPlacement: top | right | bottom | left = null,
    name: String = null,
    onBlur: FocusEvent[HTMLInputElement] => Unit = null,
    onChange: ChangeEvent[HTMLInputElement] => Unit = null,
    onFocus: FocusEvent[HTMLInputElement] => Unit = null,
    onMouseDown: MouseEvent[HTMLInputElement, NativeMouseEvent] => Unit = null,
    onMouseEnter: MouseEvent[HTMLInputElement, NativeMouseEvent] => Unit = null,
    onMouseLeave: MouseEvent[HTMLInputElement, NativeMouseEvent] => Unit = null,
    onMouseUp: MouseEvent[HTMLInputElement, NativeMouseEvent] => Unit = null,
    overrides: RadioOverrides with RadioGroupOverrides = null,
    required: js.UndefOr[Boolean] = js.undefined,
    value: String = null
  ): RadioProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoFocus)) __obj.updateDynamic("autoFocus")(autoFocus.asInstanceOf[js.Any])
    if (!js.isUndefined(checked)) __obj.updateDynamic("checked")(checked.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (inputRef != null) __obj.updateDynamic("inputRef")(inputRef.asInstanceOf[js.Any])
    if (!js.isUndefined(isError)) __obj.updateDynamic("isError")(isError.asInstanceOf[js.Any])
    if (labelPlacement != null) __obj.updateDynamic("labelPlacement")(labelPlacement.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (onBlur != null) __obj.updateDynamic("onBlur")(js.Any.fromFunction1(onBlur))
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (onFocus != null) __obj.updateDynamic("onFocus")(js.Any.fromFunction1(onFocus))
    if (onMouseDown != null) __obj.updateDynamic("onMouseDown")(js.Any.fromFunction1(onMouseDown))
    if (onMouseEnter != null) __obj.updateDynamic("onMouseEnter")(js.Any.fromFunction1(onMouseEnter))
    if (onMouseLeave != null) __obj.updateDynamic("onMouseLeave")(js.Any.fromFunction1(onMouseLeave))
    if (onMouseUp != null) __obj.updateDynamic("onMouseUp")(js.Any.fromFunction1(onMouseUp))
    if (overrides != null) __obj.updateDynamic("overrides")(overrides.asInstanceOf[js.Any])
    if (!js.isUndefined(required)) __obj.updateDynamic("required")(required.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[RadioProps]
  }
}

