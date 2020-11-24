package typings.cardValidator.cardNumberMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CardNumberOptions extends js.Object {
  
  var luhnValidateUnionPay: js.UndefOr[Boolean] = js.native
  
  var maxLength: js.UndefOr[Double] = js.native
}
object CardNumberOptions {
  
  @scala.inline
  def apply(): CardNumberOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CardNumberOptions]
  }
  
  @scala.inline
  implicit class CardNumberOptionsOps[Self <: CardNumberOptions] (val x: Self) extends AnyVal {
    
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
    def setLuhnValidateUnionPay(value: Boolean): Self = this.set("luhnValidateUnionPay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLuhnValidateUnionPay: Self = this.set("luhnValidateUnionPay", js.undefined)
    
    @scala.inline
    def setMaxLength(value: Double): Self = this.set("maxLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxLength: Self = this.set("maxLength", js.undefined)
  }
}
