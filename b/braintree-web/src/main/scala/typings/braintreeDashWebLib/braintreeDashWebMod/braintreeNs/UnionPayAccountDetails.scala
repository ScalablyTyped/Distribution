package typings
package braintreeDashWebLib.braintreeDashWebMod.braintreeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @property {string} nonce The payment method nonce.
  * @property {string} type Always <code>CreditCard</code>.
  * @property {object} details Additional account details:
  * @property {string} details.cardType Type of card, ex: Visa, MasterCard.
  * @property {string} details.lastTwo Last two digits of card number.
  * @property {string} description A human-readable description.
  */
trait UnionPayAccountDetails extends js.Object {
  var cardType: java.lang.String
  var description: java.lang.String
  var lastTwo: java.lang.String
}

object UnionPayAccountDetails {
  @scala.inline
  def apply(cardType: java.lang.String, description: java.lang.String, lastTwo: java.lang.String): UnionPayAccountDetails = {
    val __obj = js.Dynamic.literal(cardType = cardType, description = description, lastTwo = lastTwo)
  
    __obj.asInstanceOf[UnionPayAccountDetails]
  }
}

