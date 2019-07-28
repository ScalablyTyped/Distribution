package typings.braintreeDashWeb.braintreeDashWebMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HostedFieldsTokenizePayload extends js.Object {
  var description: String
  var details: HostedFieldsAccountDetails
  var nonce: String
  var `type`: String
}

object HostedFieldsTokenizePayload {
  @scala.inline
  def apply(description: String, details: HostedFieldsAccountDetails, nonce: String, `type`: String): HostedFieldsTokenizePayload = {
    val __obj = js.Dynamic.literal(description = description, details = details, nonce = nonce)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[HostedFieldsTokenizePayload]
  }
}

