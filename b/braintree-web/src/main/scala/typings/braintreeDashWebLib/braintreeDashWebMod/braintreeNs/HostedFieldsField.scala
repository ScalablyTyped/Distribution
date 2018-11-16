package typings
package braintreeDashWebLib.braintreeDashWebMod.braintreeNs

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
   */

trait HostedFieldsField extends js.Object {
  var formatInput: js.UndefOr[scala.Boolean] = js.undefined
  var placeholder: js.UndefOr[java.lang.String] = js.undefined
  var select: js.UndefOr[scala.Boolean | braintreeDashWebLib.Anon_Options] = js.undefined
  var selector: java.lang.String
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

