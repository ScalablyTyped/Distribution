package typings.coinbase.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PaymentMethodLimits extends StObject {
  
  var buy: js.Array[PaymentMethodLimit]
  
  var deposit: js.Array[PaymentMethodLimit]
  
  var instant_buy: js.Array[PaymentMethodLimit]
  
  var sell: js.Array[PaymentMethodLimit]
}
object PaymentMethodLimits {
  
  inline def apply(
    buy: js.Array[PaymentMethodLimit],
    deposit: js.Array[PaymentMethodLimit],
    instant_buy: js.Array[PaymentMethodLimit],
    sell: js.Array[PaymentMethodLimit]
  ): PaymentMethodLimits = {
    val __obj = js.Dynamic.literal(buy = buy.asInstanceOf[js.Any], deposit = deposit.asInstanceOf[js.Any], instant_buy = instant_buy.asInstanceOf[js.Any], sell = sell.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaymentMethodLimits]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PaymentMethodLimits] (val x: Self) extends AnyVal {
    
    inline def setBuy(value: js.Array[PaymentMethodLimit]): Self = StObject.set(x, "buy", value.asInstanceOf[js.Any])
    
    inline def setBuyVarargs(value: PaymentMethodLimit*): Self = StObject.set(x, "buy", js.Array(value*))
    
    inline def setDeposit(value: js.Array[PaymentMethodLimit]): Self = StObject.set(x, "deposit", value.asInstanceOf[js.Any])
    
    inline def setDepositVarargs(value: PaymentMethodLimit*): Self = StObject.set(x, "deposit", js.Array(value*))
    
    inline def setInstant_buy(value: js.Array[PaymentMethodLimit]): Self = StObject.set(x, "instant_buy", value.asInstanceOf[js.Any])
    
    inline def setInstant_buyVarargs(value: PaymentMethodLimit*): Self = StObject.set(x, "instant_buy", js.Array(value*))
    
    inline def setSell(value: js.Array[PaymentMethodLimit]): Self = StObject.set(x, "sell", value.asInstanceOf[js.Any])
    
    inline def setSellVarargs(value: PaymentMethodLimit*): Self = StObject.set(x, "sell", js.Array(value*))
  }
}
