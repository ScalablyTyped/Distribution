package typings.braintreeWeb.threeDSecureMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ThreeDSecureAccountDetails extends js.Object {
  
  var cardType: String = js.native
  
  var lastTwo: String = js.native
}
object ThreeDSecureAccountDetails {
  
  @scala.inline
  def apply(cardType: String, lastTwo: String): ThreeDSecureAccountDetails = {
    val __obj = js.Dynamic.literal(cardType = cardType.asInstanceOf[js.Any], lastTwo = lastTwo.asInstanceOf[js.Any])
    __obj.asInstanceOf[ThreeDSecureAccountDetails]
  }
  
  @scala.inline
  implicit class ThreeDSecureAccountDetailsOps[Self <: ThreeDSecureAccountDetails] (val x: Self) extends AnyVal {
    
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
    def setCardType(value: String): Self = this.set("cardType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastTwo(value: String): Self = this.set("lastTwo", value.asInstanceOf[js.Any])
  }
}
