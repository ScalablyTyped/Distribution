package typings
package baseuiLib.inputMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InputProps
  extends BaseInputProps[stdLib.HTMLInputElement] {
  var endEnhancer: js.UndefOr[reactLib.reactMod.ReactNode] = js.undefined
  @JSName("overrides")
  var overrides_InputProps: js.UndefOr[InputOverrides] = js.undefined
  var startEnhancer: js.UndefOr[reactLib.reactMod.ReactNode] = js.undefined
}

object InputProps {
  @scala.inline
  def apply(
    adjoined: baseuiLib.baseuiLibStrings.none | baseuiLib.baseuiLibStrings.left | baseuiLib.baseuiLibStrings.right | baseuiLib.baseuiLibStrings.both = null,
    `aria-describedby`: java.lang.String = null,
    `aria-label`: java.lang.String = null,
    `aria-labelledby`: java.lang.String = null,
    autoComplete: java.lang.String = null,
    autoFocus: js.UndefOr[scala.Boolean] = js.undefined,
    `data-baseweb`: java.lang.String = null,
    disabled: js.UndefOr[scala.Boolean] = js.undefined,
    endEnhancer: reactLib.reactMod.ReactNode = null,
    error: js.UndefOr[scala.Boolean] = js.undefined,
    id: java.lang.String = null,
    inputRef: reactLib.reactMod.Ref[stdLib.HTMLInputElement] = null,
    name: java.lang.String = null,
    onBlur: /* e */ reactLib.reactMod.FocusEventHandler[stdLib.HTMLInputElement] => _ = null,
    onChange: /* e */ reactLib.reactMod.FormEventHandler[stdLib.HTMLInputElement] => _ = null,
    onFocus: /* e */ reactLib.reactMod.FocusEventHandler[stdLib.HTMLInputElement] => _ = null,
    onKeyDown: /* e */ reactLib.reactMod.KeyboardEventHandler[stdLib.HTMLInputElement] => _ = null,
    onKeyPress: /* e */ reactLib.reactMod.KeyboardEventHandler[stdLib.HTMLInputElement] => _ = null,
    onKeyUp: /* e */ reactLib.reactMod.KeyboardEventHandler[stdLib.HTMLInputElement] => _ = null,
    overrides: InputOverrides = null,
    placeholder: java.lang.String = null,
    positive: js.UndefOr[scala.Boolean] = js.undefined,
    required: js.UndefOr[scala.Boolean] = js.undefined,
    rows: scala.Int | scala.Double = null,
    size: baseuiLib.baseuiLibStrings.default | baseuiLib.baseuiLibStrings.compact | baseuiLib.baseuiLibStrings.large = null,
    startEnhancer: reactLib.reactMod.ReactNode = null,
    `type`: java.lang.String = null,
    value: java.lang.String = null
  ): InputProps = {
    val __obj = js.Dynamic.literal()
    if (adjoined != null) __obj.updateDynamic("adjoined")(adjoined.asInstanceOf[js.Any])
    if (`aria-describedby` != null) __obj.updateDynamic("aria-describedby")(`aria-describedby`)
    if (`aria-label` != null) __obj.updateDynamic("aria-label")(`aria-label`)
    if (`aria-labelledby` != null) __obj.updateDynamic("aria-labelledby")(`aria-labelledby`)
    if (autoComplete != null) __obj.updateDynamic("autoComplete")(autoComplete)
    if (!js.isUndefined(autoFocus)) __obj.updateDynamic("autoFocus")(autoFocus)
    if (`data-baseweb` != null) __obj.updateDynamic("data-baseweb")(`data-baseweb`)
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (endEnhancer != null) __obj.updateDynamic("endEnhancer")(endEnhancer.asInstanceOf[js.Any])
    if (!js.isUndefined(error)) __obj.updateDynamic("error")(error)
    if (id != null) __obj.updateDynamic("id")(id)
    if (inputRef != null) __obj.updateDynamic("inputRef")(inputRef.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name)
    if (onBlur != null) __obj.updateDynamic("onBlur")(js.Any.fromFunction1(onBlur))
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (onFocus != null) __obj.updateDynamic("onFocus")(js.Any.fromFunction1(onFocus))
    if (onKeyDown != null) __obj.updateDynamic("onKeyDown")(js.Any.fromFunction1(onKeyDown))
    if (onKeyPress != null) __obj.updateDynamic("onKeyPress")(js.Any.fromFunction1(onKeyPress))
    if (onKeyUp != null) __obj.updateDynamic("onKeyUp")(js.Any.fromFunction1(onKeyUp))
    if (overrides != null) __obj.updateDynamic("overrides")(overrides)
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder)
    if (!js.isUndefined(positive)) __obj.updateDynamic("positive")(positive)
    if (!js.isUndefined(required)) __obj.updateDynamic("required")(required)
    if (rows != null) __obj.updateDynamic("rows")(rows.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (startEnhancer != null) __obj.updateDynamic("startEnhancer")(startEnhancer.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[InputProps]
  }
}

