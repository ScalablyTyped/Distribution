package typings.braintreeWeb.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @property {string} nonce The payment method nonce.
  * @property {object} details Additional account details.
  * @property {string} details.cardType Type of card, ex: Visa, MasterCard.
  * @property {string} details.lastTwo Last two digits of card number.
  * @property {string} details.lastFour Last four digits of card number.
  * @property {string} description A human-readable description.
  * @property {string} type The payment method type, always `CreditCard`.
  */
trait HostedFieldsAccountDetails extends js.Object {
  var cardType: String
  var lastFour: String
  var lastTwo: String
}

object HostedFieldsAccountDetails {
  @scala.inline
  def apply(cardType: String, lastFour: String, lastTwo: String): HostedFieldsAccountDetails = {
    val __obj = js.Dynamic.literal(cardType = cardType.asInstanceOf[js.Any], lastFour = lastFour.asInstanceOf[js.Any], lastTwo = lastTwo.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[HostedFieldsAccountDetails]
  }
}

