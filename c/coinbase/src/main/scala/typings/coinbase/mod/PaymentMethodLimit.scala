package typings.coinbase.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PaymentMethodLimit extends js.Object {
  
  var period_in_days: Double = js.native
  
  var remaining: MoneyHash = js.native
  
  var total: MoneyHash = js.native
}
object PaymentMethodLimit {
  
  @scala.inline
  def apply(period_in_days: Double, remaining: MoneyHash, total: MoneyHash): PaymentMethodLimit = {
    val __obj = js.Dynamic.literal(period_in_days = period_in_days.asInstanceOf[js.Any], remaining = remaining.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaymentMethodLimit]
  }
  
  @scala.inline
  implicit class PaymentMethodLimitOps[Self <: PaymentMethodLimit] (val x: Self) extends AnyVal {
    
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
    def setPeriod_in_days(value: Double): Self = this.set("period_in_days", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemaining(value: MoneyHash): Self = this.set("remaining", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotal(value: MoneyHash): Self = this.set("total", value.asInstanceOf[js.Any])
  }
}
