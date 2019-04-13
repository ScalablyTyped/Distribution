package typings
package braintreeDashWebLib.braintreeDashWebMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PayPalTokenizePayload extends js.Object {
  var details: PayPalAccountDetails
  var nonce: java.lang.String
  var `type`: java.lang.String
}

object PayPalTokenizePayload {
  @scala.inline
  def apply(details: PayPalAccountDetails, nonce: java.lang.String, `type`: java.lang.String): PayPalTokenizePayload = {
    val __obj = js.Dynamic.literal(details = details, nonce = nonce)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[PayPalTokenizePayload]
  }
}

