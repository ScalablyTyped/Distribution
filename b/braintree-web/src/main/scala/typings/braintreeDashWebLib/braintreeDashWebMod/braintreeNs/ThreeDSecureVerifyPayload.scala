package typings
package braintreeDashWebLib.braintreeDashWebMod.braintreeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ThreeDSecureVerifyPayload extends js.Object {
  var description: java.lang.String
  var details: ThreeDSecureAccountDetails
  var liabilityShiftPossible: scala.Boolean
  var liabilityShifted: scala.Boolean
  var nonce: java.lang.String
}

object ThreeDSecureVerifyPayload {
  @scala.inline
  def apply(
    description: java.lang.String,
    details: ThreeDSecureAccountDetails,
    liabilityShiftPossible: scala.Boolean,
    liabilityShifted: scala.Boolean,
    nonce: java.lang.String
  ): ThreeDSecureVerifyPayload = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("description")(description)
    __obj.updateDynamic("details")(details)
    __obj.updateDynamic("liabilityShiftPossible")(liabilityShiftPossible)
    __obj.updateDynamic("liabilityShifted")(liabilityShifted)
    __obj.updateDynamic("nonce")(nonce)
    __obj.asInstanceOf[ThreeDSecureVerifyPayload]
  }
}

