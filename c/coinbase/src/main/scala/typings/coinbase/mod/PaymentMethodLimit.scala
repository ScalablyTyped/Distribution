package typings.coinbase.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PaymentMethodLimit extends StObject {
  
  var period_in_days: Double
  
  var remaining: MoneyHash
  
  var total: MoneyHash
}
object PaymentMethodLimit {
  
  inline def apply(period_in_days: Double, remaining: MoneyHash, total: MoneyHash): PaymentMethodLimit = {
    val __obj = js.Dynamic.literal(period_in_days = period_in_days.asInstanceOf[js.Any], remaining = remaining.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaymentMethodLimit]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PaymentMethodLimit] (val x: Self) extends AnyVal {
    
    inline def setPeriod_in_days(value: Double): Self = StObject.set(x, "period_in_days", value.asInstanceOf[js.Any])
    
    inline def setRemaining(value: MoneyHash): Self = StObject.set(x, "remaining", value.asInstanceOf[js.Any])
    
    inline def setTotal(value: MoneyHash): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
  }
}
