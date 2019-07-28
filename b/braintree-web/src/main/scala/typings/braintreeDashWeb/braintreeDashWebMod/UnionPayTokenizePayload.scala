package typings.braintreeDashWeb.braintreeDashWebMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UnionPayTokenizePayload extends js.Object {
  var details: UnionPayAccountDetails
  var nonce: String
  var `type`: String
}

object UnionPayTokenizePayload {
  @scala.inline
  def apply(details: UnionPayAccountDetails, nonce: String, `type`: String): UnionPayTokenizePayload = {
    val __obj = js.Dynamic.literal(details = details, nonce = nonce)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[UnionPayTokenizePayload]
  }
}

