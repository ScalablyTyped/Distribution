package typings.braintreeDashWeb.braintreeDashWebMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ThreeDSecureVerifyPayload extends js.Object {
  var description: String
  var details: ThreeDSecureAccountDetails
  var liabilityShiftPossible: Boolean
  var liabilityShifted: Boolean
  var nonce: String
}

object ThreeDSecureVerifyPayload {
  @scala.inline
  def apply(
    description: String,
    details: ThreeDSecureAccountDetails,
    liabilityShiftPossible: Boolean,
    liabilityShifted: Boolean,
    nonce: String
  ): ThreeDSecureVerifyPayload = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], liabilityShiftPossible = liabilityShiftPossible.asInstanceOf[js.Any], liabilityShifted = liabilityShifted.asInstanceOf[js.Any], nonce = nonce.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ThreeDSecureVerifyPayload]
  }
}

