package typings.braintreeWeb.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @property {boolean} isUnionPay Determines if this card is a UnionPay card.
  * @property {boolean} isDebit Determines if this card is a debit card. This property is only present if `isUnionPay` is `true`.
  * @property {object} unionPay UnionPay specific properties. This property is only present if `isUnionPay` is `true`.
  * @property {boolean} unionPay.supportsTwoStepAuthAndCapture Determines if the card allows for an authorization, but settling the transaction later.
  * @property {boolean} unionPay.isSupported Determines if Braintree can process this UnionPay card. When false, Braintree cannot process this card and the user should use a different card.
  */
trait UnionPayProperties extends js.Object {
  var isSupported: Boolean
  var supportsTwoStepAuthAndCapture: Boolean
}

object UnionPayProperties {
  @scala.inline
  def apply(isSupported: Boolean, supportsTwoStepAuthAndCapture: Boolean): UnionPayProperties = {
    val __obj = js.Dynamic.literal(isSupported = isSupported.asInstanceOf[js.Any], supportsTwoStepAuthAndCapture = supportsTwoStepAuthAndCapture.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnionPayProperties]
  }
}

