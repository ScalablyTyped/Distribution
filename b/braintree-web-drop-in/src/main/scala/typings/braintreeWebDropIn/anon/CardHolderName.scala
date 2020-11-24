package typings.braintreeWebDropIn.anon

import typings.applepayjs.ApplePayJS.ApplePayPayment
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CardHolderName extends js.Object {
  
  var cardHolderName: String = js.native
  
  var cardType: String = js.native
  
  var dpanLastTwo: String = js.native
  
  var rawPaymentData: ApplePayPayment = js.native
}
object CardHolderName {
  
  @scala.inline
  def apply(cardHolderName: String, cardType: String, dpanLastTwo: String, rawPaymentData: ApplePayPayment): CardHolderName = {
    val __obj = js.Dynamic.literal(cardHolderName = cardHolderName.asInstanceOf[js.Any], cardType = cardType.asInstanceOf[js.Any], dpanLastTwo = dpanLastTwo.asInstanceOf[js.Any], rawPaymentData = rawPaymentData.asInstanceOf[js.Any])
    __obj.asInstanceOf[CardHolderName]
  }
  
  @scala.inline
  implicit class CardHolderNameOps[Self <: CardHolderName] (val x: Self) extends AnyVal {
    
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
    def setCardHolderName(value: String): Self = this.set("cardHolderName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCardType(value: String): Self = this.set("cardType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDpanLastTwo(value: String): Self = this.set("dpanLastTwo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRawPaymentData(value: ApplePayPayment): Self = this.set("rawPaymentData", value.asInstanceOf[js.Any])
  }
}
