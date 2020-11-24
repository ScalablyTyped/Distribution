package typings.braintreeWeb.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CurrencyCode extends js.Object {
  
  var currencyCode: String = js.native
  
  var totalPrice: String = js.native
  
  var totalPriceStatus: String = js.native
}
object CurrencyCode {
  
  @scala.inline
  def apply(currencyCode: String, totalPrice: String, totalPriceStatus: String): CurrencyCode = {
    val __obj = js.Dynamic.literal(currencyCode = currencyCode.asInstanceOf[js.Any], totalPrice = totalPrice.asInstanceOf[js.Any], totalPriceStatus = totalPriceStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[CurrencyCode]
  }
  
  @scala.inline
  implicit class CurrencyCodeOps[Self <: CurrencyCode] (val x: Self) extends AnyVal {
    
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
    def setCurrencyCode(value: String): Self = this.set("currencyCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalPrice(value: String): Self = this.set("totalPrice", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalPriceStatus(value: String): Self = this.set("totalPriceStatus", value.asInstanceOf[js.Any])
  }
}
