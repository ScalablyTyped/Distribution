package typings
package braintreeDashWebLib.braintreeDashWebMod.braintreeNs

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
  var cardType: java.lang.String
  var lastFour: java.lang.String
  var lastTwo: java.lang.String
}

object HostedFieldsAccountDetails {
  @scala.inline
  def apply(cardType: java.lang.String, lastFour: java.lang.String, lastTwo: java.lang.String): HostedFieldsAccountDetails = {
    val __obj = js.Dynamic.literal(cardType = cardType, lastFour = lastFour, lastTwo = lastTwo)
  
    __obj.asInstanceOf[HostedFieldsAccountDetails]
  }
}

