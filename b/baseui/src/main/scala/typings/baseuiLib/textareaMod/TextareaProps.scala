package typings
package baseuiLib.textareaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextareaProps
  extends baseuiLib.inputMod.BaseInputProps[stdLib.HTMLTextAreaElement]

object TextareaProps {
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
    error: js.UndefOr[scala.Boolean] = js.undefined,
    id: java.lang.String = null,
    inputRef: reactLib.reactMod.Ref[stdLib.HTMLTextAreaElement] = null,
    name: java.lang.String = null,
    onBlur: reactLib.reactMod.FocusEventHandler[stdLib.HTMLTextAreaElement] = null,
    onChange: reactLib.reactMod.FormEventHandler[stdLib.HTMLTextAreaElement] = null,
    onFocus: reactLib.reactMod.FocusEventHandler[stdLib.HTMLTextAreaElement] = null,
    onKeyDown: reactLib.reactMod.KeyboardEventHandler[stdLib.HTMLTextAreaElement] = null,
    onKeyPress: reactLib.reactMod.KeyboardEventHandler[stdLib.HTMLTextAreaElement] = null,
    onKeyUp: reactLib.reactMod.KeyboardEventHandler[stdLib.HTMLTextAreaElement] = null,
    overrides: baseuiLib.inputMod.BaseInputOverrides = null,
    placeholder: java.lang.String = null,
    positive: js.UndefOr[scala.Boolean] = js.undefined,
    required: js.UndefOr[scala.Boolean] = js.undefined,
    rows: scala.Int | scala.Double = null,
    size: baseuiLib.baseuiLibStrings.default | baseuiLib.baseuiLibStrings.compact | baseuiLib.baseuiLibStrings.large = null,
    `type`: java.lang.String = null,
    value: java.lang.String = null
  ): TextareaProps = {
    val __obj = js.Dynamic.literal()
    if (adjoined != null) __obj.updateDynamic("adjoined")(adjoined.asInstanceOf[js.Any])
    if (`aria-describedby` != null) __obj.updateDynamic("aria-describedby")(`aria-describedby`)
    if (`aria-label` != null) __obj.updateDynamic("aria-label")(`aria-label`)
    if (`aria-labelledby` != null) __obj.updateDynamic("aria-labelledby")(`aria-labelledby`)
    if (autoComplete != null) __obj.updateDynamic("autoComplete")(autoComplete)
    if (!js.isUndefined(autoFocus)) __obj.updateDynamic("autoFocus")(autoFocus)
    if (`data-baseweb` != null) __obj.updateDynamic("data-baseweb")(`data-baseweb`)
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (!js.isUndefined(error)) __obj.updateDynamic("error")(error)
    if (id != null) __obj.updateDynamic("id")(id)
    if (inputRef != null) __obj.updateDynamic("inputRef")(inputRef.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name)
    if (onBlur != null) __obj.updateDynamic("onBlur")(onBlur)
    if (onChange != null) __obj.updateDynamic("onChange")(onChange)
    if (onFocus != null) __obj.updateDynamic("onFocus")(onFocus)
    if (onKeyDown != null) __obj.updateDynamic("onKeyDown")(onKeyDown)
    if (onKeyPress != null) __obj.updateDynamic("onKeyPress")(onKeyPress)
    if (onKeyUp != null) __obj.updateDynamic("onKeyUp")(onKeyUp)
    if (overrides != null) __obj.updateDynamic("overrides")(overrides)
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder)
    if (!js.isUndefined(positive)) __obj.updateDynamic("positive")(positive)
    if (!js.isUndefined(required)) __obj.updateDynamic("required")(required)
    if (rows != null) __obj.updateDynamic("rows")(rows.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[TextareaProps]
  }
}

