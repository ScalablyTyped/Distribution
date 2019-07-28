package typings.braintreeDashWeb.braintreeDashWebMod

import typings.braintreeDashWeb.Anon_Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Fields used in {@link module:braintree-web/hosted-fields~fieldOptions fields options}
  * @typedef {object} field
  * @property {string} selector A CSS selector to find the container where the hosted field will be inserted.
  * @property {string} [placeholder] Will be used as the `placeholder` attribute of the input. If `placeholder` is not natively supported by the browser, it will be polyfilled.
  * @property {string} [type] Will be used as the `type` attribute of the input. To mask `cvv` input, for instance, `type: "password"` can be used.
  * @property {boolean} [formatInput=true] - Enable or disable automatic formatting on this field.
  * @property {object|boolean} [select] If truthy, this field becomes a `<select>` dropdown list. This can only be used for `expirationMonth` and `expirationYear` fields.
  * @property {string[]} [select.options] An array of 12 strings, one per month. This can only be used for the `expirationMonth` field. For example, the array can look like `['01 - January', '02 - February', ...]`.
  * @property {boolean | HostedFieldsFieldMaskInput} [maskInput] Enable or disable input masking when input is not focused. If set to `true` instead of an object, the defaults for the `maskInput` parameters will be used.
  */
trait HostedFieldsField extends js.Object {
  var formatInput: js.UndefOr[Boolean] = js.undefined
  var maskInput: js.UndefOr[Boolean | HostedFieldsFieldMaskInput] = js.undefined
  var maxCardLength: js.UndefOr[Double] = js.undefined
  var maxlength: js.UndefOr[Double] = js.undefined
  var minlength: js.UndefOr[Double] = js.undefined
  var placeholder: js.UndefOr[String] = js.undefined
  var prefill: js.UndefOr[String] = js.undefined
  var rejectUnsupportedCards: js.UndefOr[Boolean] = js.undefined
  var select: js.UndefOr[Boolean | Anon_Options] = js.undefined
  var selector: String
  var `type`: js.UndefOr[String] = js.undefined
}

object HostedFieldsField {
  @scala.inline
  def apply(
    selector: String,
    formatInput: js.UndefOr[Boolean] = js.undefined,
    maskInput: Boolean | HostedFieldsFieldMaskInput = null,
    maxCardLength: Int | Double = null,
    maxlength: Int | Double = null,
    minlength: Int | Double = null,
    placeholder: String = null,
    prefill: String = null,
    rejectUnsupportedCards: js.UndefOr[Boolean] = js.undefined,
    select: Boolean | Anon_Options = null,
    `type`: String = null
  ): HostedFieldsField = {
    val __obj = js.Dynamic.literal(selector = selector)
    if (!js.isUndefined(formatInput)) __obj.updateDynamic("formatInput")(formatInput)
    if (maskInput != null) __obj.updateDynamic("maskInput")(maskInput.asInstanceOf[js.Any])
    if (maxCardLength != null) __obj.updateDynamic("maxCardLength")(maxCardLength.asInstanceOf[js.Any])
    if (maxlength != null) __obj.updateDynamic("maxlength")(maxlength.asInstanceOf[js.Any])
    if (minlength != null) __obj.updateDynamic("minlength")(minlength.asInstanceOf[js.Any])
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder)
    if (prefill != null) __obj.updateDynamic("prefill")(prefill)
    if (!js.isUndefined(rejectUnsupportedCards)) __obj.updateDynamic("rejectUnsupportedCards")(rejectUnsupportedCards)
    if (select != null) __obj.updateDynamic("select")(select.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[HostedFieldsField]
  }
}

