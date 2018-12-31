package typings
package braintreeDashWebLib.braintreeDashWebMod.braintreeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @property {string} nonce The new payment method nonce produced by the 3D Secure lookup. The original nonce passed into {@link ThreeDSecure#verifyCard|verifyCard} was consumed. This new nonce should be used to transact on your server.
  * @property {object} details Additional account details.
  * @property {string} details.cardType Type of card, ex: Visa, MasterCard.
  * @property {string} details.lastTwo Last two digits of card number.
  * @property {string} description A human-readable description.
  * @property {boolean} liabilityShiftPossible Indicates whether the card was eligible for 3D Secure.
  * @property {boolean} liabilityShifted Indicates whether the liability for fraud has been shifted away from the merchant.
  */
trait ThreeDSecureAccountDetails extends js.Object {
  var cardType: java.lang.String
  var lastTwo: java.lang.String
}

