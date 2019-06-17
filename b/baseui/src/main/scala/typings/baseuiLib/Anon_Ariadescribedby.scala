package typings
package baseuiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Ariadescribedby extends js.Object {
  var `aria-describedby`: js.UndefOr[java.lang.String] = js.undefined
  var `aria-label`: js.UndefOr[java.lang.String] = js.undefined
  var `aria-labelledby`: js.UndefOr[java.lang.String] = js.undefined
  var disabled: js.UndefOr[scala.Boolean] = js.undefined
  var error: js.UndefOr[scala.Boolean] = js.undefined
  var formatDisplayValue: js.UndefOr[
    js.Function2[
      /* date */ stdLib.Date | js.Array[stdLib.Date], 
      /* formatString */ java.lang.String, 
      java.lang.String
    ]
  ] = js.undefined
  var formatString: js.UndefOr[java.lang.String] = js.undefined
  var mountNode: js.UndefOr[stdLib.HTMLElement] = js.undefined
  var onClose: js.UndefOr[js.Function0[_]] = js.undefined
  var placeholder: js.UndefOr[java.lang.String] = js.undefined
  var required: js.UndefOr[scala.Boolean] = js.undefined
}

object Anon_Ariadescribedby {
  @scala.inline
  def apply(
    `aria-describedby`: java.lang.String = null,
    `aria-label`: java.lang.String = null,
    `aria-labelledby`: java.lang.String = null,
    disabled: js.UndefOr[scala.Boolean] = js.undefined,
    error: js.UndefOr[scala.Boolean] = js.undefined,
    formatDisplayValue: (/* date */ stdLib.Date | js.Array[stdLib.Date], /* formatString */ java.lang.String) => java.lang.String = null,
    formatString: java.lang.String = null,
    mountNode: stdLib.HTMLElement = null,
    onClose: () => _ = null,
    placeholder: java.lang.String = null,
    required: js.UndefOr[scala.Boolean] = js.undefined
  ): Anon_Ariadescribedby = {
    val __obj = js.Dynamic.literal()
    if (`aria-describedby` != null) __obj.updateDynamic("aria-describedby")(`aria-describedby`)
    if (`aria-label` != null) __obj.updateDynamic("aria-label")(`aria-label`)
    if (`aria-labelledby` != null) __obj.updateDynamic("aria-labelledby")(`aria-labelledby`)
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (!js.isUndefined(error)) __obj.updateDynamic("error")(error)
    if (formatDisplayValue != null) __obj.updateDynamic("formatDisplayValue")(js.Any.fromFunction2(formatDisplayValue))
    if (formatString != null) __obj.updateDynamic("formatString")(formatString)
    if (mountNode != null) __obj.updateDynamic("mountNode")(mountNode)
    if (onClose != null) __obj.updateDynamic("onClose")(js.Any.fromFunction0(onClose))
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder)
    if (!js.isUndefined(required)) __obj.updateDynamic("required")(required)
    __obj.asInstanceOf[Anon_Ariadescribedby]
  }
}

