package typings.braintreeWeb.mod

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
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], nonce = nonce.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[HostedFieldsTokenizePayload]
  }
}

