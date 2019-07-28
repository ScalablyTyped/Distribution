package typings.braintreeDashWeb.braintreeDashWebMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An object that has {@link module:braintree-web/hosted-fields~field field objects} for each field. Used in {@link module:braintree-web/hosted-fields~create create}.
  * @typedef {object} fieldOptions
  * @property {field} [number] A field for card number.
  * @property {field} [expirationDate] A field for expiration date in `MM/YYYY` format. This should not be used with the `expirationMonth` and `expirationYear` properties.
  * @property {field} [expirationMonth] A field for expiration month in `MM` format. This should be used with the `expirationYear` property.
  * @property {field} [expirationYear] A field for expiration year in `YYYY` format. This should be used with the `expirationMonth` property.
  * @property {field} [cvv] A field for 3 or 4 digit CVV or CID.
  * @property {field} [postalCode] A field for postal or region code.
  */
trait HostedFieldFieldOptions extends js.Object {
  var cvv: HostedFieldsField
  var expirationDate: js.UndefOr[HostedFieldsField] = js.undefined
  var expirationMonth: js.UndefOr[HostedFieldsField] = js.undefined
  var expirationYear: js.UndefOr[HostedFieldsField] = js.undefined
  var number: HostedFieldsField
  var postalCode: js.UndefOr[HostedFieldsField] = js.undefined
}

object HostedFieldFieldOptions {
  @scala.inline
  def apply(
    cvv: HostedFieldsField,
    number: HostedFieldsField,
    expirationDate: HostedFieldsField = null,
    expirationMonth: HostedFieldsField = null,
    expirationYear: HostedFieldsField = null,
    postalCode: HostedFieldsField = null
  ): HostedFieldFieldOptions = {
    val __obj = js.Dynamic.literal(cvv = cvv, number = number)
    if (expirationDate != null) __obj.updateDynamic("expirationDate")(expirationDate)
    if (expirationMonth != null) __obj.updateDynamic("expirationMonth")(expirationMonth)
    if (expirationYear != null) __obj.updateDynamic("expirationYear")(expirationYear)
    if (postalCode != null) __obj.updateDynamic("postalCode")(postalCode)
    __obj.asInstanceOf[HostedFieldFieldOptions]
  }
}

