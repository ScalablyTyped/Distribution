package typings.braintreeDashWeb.braintreeDashWebMod

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
  var cardType: String
  var description: String
  var lastTwo: String
}

object UnionPayAccountDetails {
  @scala.inline
  def apply(cardType: String, description: String, lastTwo: String): UnionPayAccountDetails = {
    val __obj = js.Dynamic.literal(cardType = cardType.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], lastTwo = lastTwo.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[UnionPayAccountDetails]
  }
}

