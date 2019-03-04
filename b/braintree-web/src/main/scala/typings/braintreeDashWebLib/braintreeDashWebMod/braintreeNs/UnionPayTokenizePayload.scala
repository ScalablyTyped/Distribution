package typings
package braintreeDashWebLib.braintreeDashWebMod.braintreeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UnionPayTokenizePayload extends js.Object {
  var details: UnionPayAccountDetails
  var nonce: java.lang.String
  var `type`: java.lang.String
}

object UnionPayTokenizePayload {
  @scala.inline
  def apply(details: UnionPayAccountDetails, nonce: java.lang.String, `type`: java.lang.String): UnionPayTokenizePayload = {
    val __obj = js.Dynamic.literal(details = details, nonce = nonce)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[UnionPayTokenizePayload]
  }
}

