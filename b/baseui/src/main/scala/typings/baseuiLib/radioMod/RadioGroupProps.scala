package typings
package baseuiLib.radioMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RadioGroupProps extends js.Object {
  var align: js.UndefOr[java.lang.String] = js.undefined
  var `aria-label`: js.UndefOr[java.lang.String] = js.undefined
  var `aria-labelledby`: js.UndefOr[java.lang.String] = js.undefined
  var autoFocus: js.UndefOr[scala.Boolean] = js.undefined
  var children: js.UndefOr[reactLib.reactMod.ReactNode] = js.undefined
  var disabled: js.UndefOr[scala.Boolean] = js.undefined
  var isError: js.UndefOr[scala.Boolean] = js.undefined
  var labelPlacement: js.UndefOr[
    baseuiLib.baseuiLibStrings.top | baseuiLib.baseuiLibStrings.right | baseuiLib.baseuiLibStrings.bottom | baseuiLib.baseuiLibStrings.left
  ] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  var onBlur: js.UndefOr[
    js.Function1[
      /* e */ reactLib.reactMod.SyntheticEvent[stdLib.HTMLInputElement, reactLib.Event], 
      _
    ]
  ] = js.undefined
  var onChange: js.UndefOr[
    js.Function1[
      /* e */ reactLib.reactMod.SyntheticEvent[stdLib.HTMLInputElement, reactLib.Event], 
      _
    ]
  ] = js.undefined
  var onFocus: js.UndefOr[
    js.Function1[
      /* e */ reactLib.reactMod.SyntheticEvent[stdLib.HTMLInputElement, reactLib.Event], 
      _
    ]
  ] = js.undefined
  var onMouseEnter: js.UndefOr[
    js.Function1[
      /* e */ reactLib.reactMod.SyntheticEvent[stdLib.HTMLInputElement, reactLib.Event], 
      _
    ]
  ] = js.undefined
  var onMouseLeave: js.UndefOr[
    js.Function1[
      /* e */ reactLib.reactMod.SyntheticEvent[stdLib.HTMLInputElement, reactLib.Event], 
      _
    ]
  ] = js.undefined
  var overrides: js.UndefOr[RadioOverrides with RadioGroupOverrides] = js.undefined
  var required: js.UndefOr[scala.Boolean] = js.undefined
  var value: js.UndefOr[java.lang.String] = js.undefined
}

object RadioGroupProps {
  @scala.inline
  def apply(
    align: java.lang.String = null,
    `aria-label`: java.lang.String = null,
    `aria-labelledby`: java.lang.String = null,
    autoFocus: js.UndefOr[scala.Boolean] = js.undefined,
    children: reactLib.reactMod.ReactNode = null,
    disabled: js.UndefOr[scala.Boolean] = js.undefined,
    isError: js.UndefOr[scala.Boolean] = js.undefined,
    labelPlacement: baseuiLib.baseuiLibStrings.top | baseuiLib.baseuiLibStrings.right | baseuiLib.baseuiLibStrings.bottom | baseuiLib.baseuiLibStrings.left = null,
    name: java.lang.String = null,
    onBlur: /* e */ reactLib.reactMod.SyntheticEvent[stdLib.HTMLInputElement, reactLib.Event] => _ = null,
    onChange: /* e */ reactLib.reactMod.SyntheticEvent[stdLib.HTMLInputElement, reactLib.Event] => _ = null,
    onFocus: /* e */ reactLib.reactMod.SyntheticEvent[stdLib.HTMLInputElement, reactLib.Event] => _ = null,
    onMouseEnter: /* e */ reactLib.reactMod.SyntheticEvent[stdLib.HTMLInputElement, reactLib.Event] => _ = null,
    onMouseLeave: /* e */ reactLib.reactMod.SyntheticEvent[stdLib.HTMLInputElement, reactLib.Event] => _ = null,
    overrides: RadioOverrides with RadioGroupOverrides = null,
    required: js.UndefOr[scala.Boolean] = js.undefined,
    value: java.lang.String = null
  ): RadioGroupProps = {
    val __obj = js.Dynamic.literal()
    if (align != null) __obj.updateDynamic("align")(align)
    if (`aria-label` != null) __obj.updateDynamic("aria-label")(`aria-label`)
    if (`aria-labelledby` != null) __obj.updateDynamic("aria-labelledby")(`aria-labelledby`)
    if (!js.isUndefined(autoFocus)) __obj.updateDynamic("autoFocus")(autoFocus)
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (!js.isUndefined(isError)) __obj.updateDynamic("isError")(isError)
    if (labelPlacement != null) __obj.updateDynamic("labelPlacement")(labelPlacement.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name)
    if (onBlur != null) __obj.updateDynamic("onBlur")(js.Any.fromFunction1(onBlur))
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (onFocus != null) __obj.updateDynamic("onFocus")(js.Any.fromFunction1(onFocus))
    if (onMouseEnter != null) __obj.updateDynamic("onMouseEnter")(js.Any.fromFunction1(onMouseEnter))
    if (onMouseLeave != null) __obj.updateDynamic("onMouseLeave")(js.Any.fromFunction1(onMouseLeave))
    if (overrides != null) __obj.updateDynamic("overrides")(overrides)
    if (!js.isUndefined(required)) __obj.updateDynamic("required")(required)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[RadioGroupProps]
  }
}

