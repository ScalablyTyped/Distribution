package typings
package baseuiLib.radioMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RadioProps extends js.Object {
  var autoFocus: js.UndefOr[scala.Boolean] = js.undefined
  var checked: js.UndefOr[scala.Boolean] = js.undefined
  var children: js.UndefOr[reactLib.reactMod.ReactNode] = js.undefined
  var description: js.UndefOr[java.lang.String] = js.undefined
  var disabled: js.UndefOr[scala.Boolean] = js.undefined
  var inputRef: js.UndefOr[reactLib.reactMod.Ref[stdLib.HTMLInputElement]] = js.undefined
  var isError: js.UndefOr[scala.Boolean] = js.undefined
  var labelPlacement: js.UndefOr[
    baseuiLib.baseuiLibStrings.top | baseuiLib.baseuiLibStrings.right | baseuiLib.baseuiLibStrings.bottom | baseuiLib.baseuiLibStrings.left
  ] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  var onBlur: js.UndefOr[
    js.Function1[/* e */ reactLib.reactMod.FocusEventHandler[stdLib.HTMLInputElement], _]
  ] = js.undefined
  var onChange: js.UndefOr[
    js.Function1[/* e */ reactLib.reactMod.FormEventHandler[stdLib.HTMLInputElement], _]
  ] = js.undefined
  var onFocus: js.UndefOr[
    js.Function1[/* e */ reactLib.reactMod.FocusEventHandler[stdLib.HTMLInputElement], _]
  ] = js.undefined
  var onMouseDown: js.UndefOr[
    js.Function1[/* e */ reactLib.reactMod.MouseEventHandler[stdLib.HTMLInputElement], _]
  ] = js.undefined
  var onMouseEnter: js.UndefOr[
    js.Function1[/* e */ reactLib.reactMod.MouseEventHandler[stdLib.HTMLInputElement], _]
  ] = js.undefined
  var onMouseLeave: js.UndefOr[
    js.Function1[/* e */ reactLib.reactMod.MouseEventHandler[stdLib.HTMLInputElement], _]
  ] = js.undefined
  var onMouseUp: js.UndefOr[
    js.Function1[/* e */ reactLib.reactMod.MouseEventHandler[stdLib.HTMLInputElement], _]
  ] = js.undefined
  var overrides: js.UndefOr[RadioOverrides with RadioGroupOverrides] = js.undefined
  var required: js.UndefOr[scala.Boolean] = js.undefined
  var value: js.UndefOr[java.lang.String] = js.undefined
}

object RadioProps {
  @scala.inline
  def apply(
    autoFocus: js.UndefOr[scala.Boolean] = js.undefined,
    checked: js.UndefOr[scala.Boolean] = js.undefined,
    children: reactLib.reactMod.ReactNode = null,
    description: java.lang.String = null,
    disabled: js.UndefOr[scala.Boolean] = js.undefined,
    inputRef: reactLib.reactMod.Ref[stdLib.HTMLInputElement] = null,
    isError: js.UndefOr[scala.Boolean] = js.undefined,
    labelPlacement: baseuiLib.baseuiLibStrings.top | baseuiLib.baseuiLibStrings.right | baseuiLib.baseuiLibStrings.bottom | baseuiLib.baseuiLibStrings.left = null,
    name: java.lang.String = null,
    onBlur: /* e */ reactLib.reactMod.FocusEventHandler[stdLib.HTMLInputElement] => _ = null,
    onChange: /* e */ reactLib.reactMod.FormEventHandler[stdLib.HTMLInputElement] => _ = null,
    onFocus: /* e */ reactLib.reactMod.FocusEventHandler[stdLib.HTMLInputElement] => _ = null,
    onMouseDown: /* e */ reactLib.reactMod.MouseEventHandler[stdLib.HTMLInputElement] => _ = null,
    onMouseEnter: /* e */ reactLib.reactMod.MouseEventHandler[stdLib.HTMLInputElement] => _ = null,
    onMouseLeave: /* e */ reactLib.reactMod.MouseEventHandler[stdLib.HTMLInputElement] => _ = null,
    onMouseUp: /* e */ reactLib.reactMod.MouseEventHandler[stdLib.HTMLInputElement] => _ = null,
    overrides: RadioOverrides with RadioGroupOverrides = null,
    required: js.UndefOr[scala.Boolean] = js.undefined,
    value: java.lang.String = null
  ): RadioProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoFocus)) __obj.updateDynamic("autoFocus")(autoFocus)
    if (!js.isUndefined(checked)) __obj.updateDynamic("checked")(checked)
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description)
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (inputRef != null) __obj.updateDynamic("inputRef")(inputRef.asInstanceOf[js.Any])
    if (!js.isUndefined(isError)) __obj.updateDynamic("isError")(isError)
    if (labelPlacement != null) __obj.updateDynamic("labelPlacement")(labelPlacement.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name)
    if (onBlur != null) __obj.updateDynamic("onBlur")(js.Any.fromFunction1(onBlur))
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (onFocus != null) __obj.updateDynamic("onFocus")(js.Any.fromFunction1(onFocus))
    if (onMouseDown != null) __obj.updateDynamic("onMouseDown")(js.Any.fromFunction1(onMouseDown))
    if (onMouseEnter != null) __obj.updateDynamic("onMouseEnter")(js.Any.fromFunction1(onMouseEnter))
    if (onMouseLeave != null) __obj.updateDynamic("onMouseLeave")(js.Any.fromFunction1(onMouseLeave))
    if (onMouseUp != null) __obj.updateDynamic("onMouseUp")(js.Any.fromFunction1(onMouseUp))
    if (overrides != null) __obj.updateDynamic("overrides")(overrides)
    if (!js.isUndefined(required)) __obj.updateDynamic("required")(required)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[RadioProps]
  }
}

