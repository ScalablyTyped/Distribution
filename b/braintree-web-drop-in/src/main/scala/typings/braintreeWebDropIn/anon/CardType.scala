package typings.braintreeWebDropIn.anon

import typings.googlepay.google.payments.api.PaymentData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CardType extends js.Object {
  
  var bin: String = js.native
  
  var cardType: String = js.native
  
  var isNetworkTokenized: Boolean = js.native
  
  var lastFour: String = js.native
  
  var lastTwo: String = js.native
  
  var rawPaymentData: PaymentData = js.native
}
object CardType {
  
  @scala.inline
  def apply(
    bin: String,
    cardType: String,
    isNetworkTokenized: Boolean,
    lastFour: String,
    lastTwo: String,
    rawPaymentData: PaymentData
  ): CardType = {
    val __obj = js.Dynamic.literal(bin = bin.asInstanceOf[js.Any], cardType = cardType.asInstanceOf[js.Any], isNetworkTokenized = isNetworkTokenized.asInstanceOf[js.Any], lastFour = lastFour.asInstanceOf[js.Any], lastTwo = lastTwo.asInstanceOf[js.Any], rawPaymentData = rawPaymentData.asInstanceOf[js.Any])
    __obj.asInstanceOf[CardType]
  }
  
  @scala.inline
  implicit class CardTypeOps[Self <: CardType] (val x: Self) extends AnyVal {
    
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
    def setBin(value: String): Self = this.set("bin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCardType(value: String): Self = this.set("cardType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsNetworkTokenized(value: Boolean): Self = this.set("isNetworkTokenized", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastFour(value: String): Self = this.set("lastFour", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastTwo(value: String): Self = this.set("lastTwo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRawPaymentData(value: PaymentData): Self = this.set("rawPaymentData", value.asInstanceOf[js.Any])
  }
}
