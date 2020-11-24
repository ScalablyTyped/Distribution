package typings.coinbase.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PaymentMethodLimits extends js.Object {
  
  var buy: js.Array[PaymentMethodLimit] = js.native
  
  var deposit: js.Array[PaymentMethodLimit] = js.native
  
  var instant_buy: js.Array[PaymentMethodLimit] = js.native
  
  var sell: js.Array[PaymentMethodLimit] = js.native
}
object PaymentMethodLimits {
  
  @scala.inline
  def apply(
    buy: js.Array[PaymentMethodLimit],
    deposit: js.Array[PaymentMethodLimit],
    instant_buy: js.Array[PaymentMethodLimit],
    sell: js.Array[PaymentMethodLimit]
  ): PaymentMethodLimits = {
    val __obj = js.Dynamic.literal(buy = buy.asInstanceOf[js.Any], deposit = deposit.asInstanceOf[js.Any], instant_buy = instant_buy.asInstanceOf[js.Any], sell = sell.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaymentMethodLimits]
  }
  
  @scala.inline
  implicit class PaymentMethodLimitsOps[Self <: PaymentMethodLimits] (val x: Self) extends AnyVal {
    
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
    def setBuyVarargs(value: PaymentMethodLimit*): Self = this.set("buy", js.Array(value :_*))
    
    @scala.inline
    def setBuy(value: js.Array[PaymentMethodLimit]): Self = this.set("buy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDepositVarargs(value: PaymentMethodLimit*): Self = this.set("deposit", js.Array(value :_*))
    
    @scala.inline
    def setDeposit(value: js.Array[PaymentMethodLimit]): Self = this.set("deposit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstant_buyVarargs(value: PaymentMethodLimit*): Self = this.set("instant_buy", js.Array(value :_*))
    
    @scala.inline
    def setInstant_buy(value: js.Array[PaymentMethodLimit]): Self = this.set("instant_buy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSellVarargs(value: PaymentMethodLimit*): Self = this.set("sell", js.Array(value :_*))
    
    @scala.inline
    def setSell(value: js.Array[PaymentMethodLimit]): Self = this.set("sell", value.asInstanceOf[js.Any])
  }
}
