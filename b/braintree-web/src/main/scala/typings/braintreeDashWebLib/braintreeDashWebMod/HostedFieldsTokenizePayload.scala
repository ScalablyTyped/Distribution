package typings
package braintreeDashWebLib.braintreeDashWebMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HostedFieldsTokenizePayload extends js.Object {
  var description: java.lang.String
  var details: HostedFieldsAccountDetails
  var nonce: java.lang.String
  var `type`: java.lang.String
}

object HostedFieldsTokenizePayload {
  @scala.inline
  def apply(
    description: java.lang.String,
    details: HostedFieldsAccountDetails,
    nonce: java.lang.String,
    `type`: java.lang.String
  ): HostedFieldsTokenizePayload = {
    val __obj = js.Dynamic.literal(description = description, details = details, nonce = nonce)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[HostedFieldsTokenizePayload]
  }
}

