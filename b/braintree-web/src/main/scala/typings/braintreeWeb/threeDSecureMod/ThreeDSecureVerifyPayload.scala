package typings.braintreeWeb.threeDSecureMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ThreeDSecureVerifyPayload extends js.Object {
  
  var description: String = js.native
  
  var details: ThreeDSecureAccountDetails = js.native
  
  var liabilityShiftPossible: Boolean = js.native
  
  var liabilityShifted: Boolean = js.native
  
  var nonce: String = js.native
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
  
  @scala.inline
  implicit class ThreeDSecureVerifyPayloadOps[Self <: ThreeDSecureVerifyPayload] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDetails(value: ThreeDSecureAccountDetails): Self = this.set("details", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLiabilityShiftPossible(value: Boolean): Self = this.set("liabilityShiftPossible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLiabilityShifted(value: Boolean): Self = this.set("liabilityShifted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNonce(value: String): Self = this.set("nonce", value.asInstanceOf[js.Any])
  }
}
