package typings.cardValidator.cardNumberMod

import typings.cardValidator.typesMod.Verification
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CardNumberVerification extends Verification {
  
  var card: CreditCardType | Null = js.native
}
object CardNumberVerification {
  
  @scala.inline
  def apply(isPotentiallyValid: Boolean, isValid: Boolean): CardNumberVerification = {
    val __obj = js.Dynamic.literal(isPotentiallyValid = isPotentiallyValid.asInstanceOf[js.Any], isValid = isValid.asInstanceOf[js.Any])
    __obj.asInstanceOf[CardNumberVerification]
  }
  
  @scala.inline
  implicit class CardNumberVerificationOps[Self <: CardNumberVerification] (val x: Self) extends AnyVal {
    
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
    def setCard(value: CreditCardType): Self = this.set("card", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCardNull: Self = this.set("card", null)
  }
}
