package typings.braintreeDashWeb.braintreeDashWebMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @description The event payload sent from {@link HostedFields#on|on} or {@link HostedFields#getState|getState}.
  * @property {HostedFields~hostedFieldsCard[]} cards
  * This will return an array of potential {@link HostedFields~hostedFieldsCard|cards}. If the card type has been determined, the array will contain only one card.
  * Internally, Hosted Fields uses <a href="https://github.com/braintree/credit-card-type">credit-card-type</a>,
  * an open-source card detection library.
  * @property {string} emittedBy
  * The name of the field associated with an event. This will not be included if returned by {@link HostedFields#getState|getState}. It will be one of the following strings:<br>
  * - `"number"`
  * - `"cvv"`
  * - `"expirationDate"`
  * - `"expirationMonth"`
  * - `"expirationYear"`
  * - `"postalCode"`
  * @property {object} fields
  * @property {?HostedFields~hostedFieldsFieldData} fields.number {@link HostedFields~hostedFieldsFieldData|hostedFieldsFieldData} for the number field, if it is present.
  * @property {?HostedFields~hostedFieldsFieldData} fields.cvv {@link HostedFields~hostedFieldsFieldData|hostedFieldsFieldData} for the CVV field, if it is present.
  * @property {?HostedFields~hostedFieldsFieldData} fields.expirationDate {@link HostedFields~hostedFieldsFieldData|hostedFieldsFieldData} for the expiration date field, if it is present.
  * @property {?HostedFields~hostedFieldsFieldData} fields.expirationMonth {@link HostedFields~hostedFieldsFieldData|hostedFieldsFieldData} for the expiration month field, if it is present.
  * @property {?HostedFields~hostedFieldsFieldData} fields.expirationYear {@link HostedFields~hostedFieldsFieldData|hostedFieldsFieldData} for the expiration year field, if it is present.
  * @property {?HostedFields~hostedFieldsFieldData} fields.postalCode {@link HostedFields~hostedFieldsFieldData|hostedFieldsFieldData} for the postal code field, if it is present.
  */
/* Rewritten from type alias, can be one of: 
  - typings.braintreeDashWeb.braintreeDashWebStrings.number
  - typings.braintreeDashWeb.braintreeDashWebStrings.cvv
  - typings.braintreeDashWeb.braintreeDashWebStrings.expirationDate
  - typings.braintreeDashWeb.braintreeDashWebStrings.expirationMonth
  - typings.braintreeDashWeb.braintreeDashWebStrings.expirationYear
  - typings.braintreeDashWeb.braintreeDashWebStrings.postalCode
*/
trait HostedFieldsHostedFieldsFieldName extends js.Object

object HostedFieldsHostedFieldsFieldName {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def cvv: typings.braintreeDashWeb.braintreeDashWebStrings.cvv = this.cast("cvv")
  @scala.inline
  def expirationDate: typings.braintreeDashWeb.braintreeDashWebStrings.expirationDate = this.cast("expirationDate")
  @scala.inline
  def expirationMonth: typings.braintreeDashWeb.braintreeDashWebStrings.expirationMonth = this.cast("expirationMonth")
  @scala.inline
  def expirationYear: typings.braintreeDashWeb.braintreeDashWebStrings.expirationYear = this.cast("expirationYear")
  @scala.inline
  def number: typings.braintreeDashWeb.braintreeDashWebStrings.number = this.cast("number")
  @scala.inline
  def postalCode: typings.braintreeDashWeb.braintreeDashWebStrings.postalCode = this.cast("postalCode")
}

