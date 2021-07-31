package typings.awsSdk.devicefarmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MonetaryAmount extends StObject {
  
  /**
    * The numerical amount of an offering or transaction.
    */
  var amount: js.UndefOr[Double] = js.undefined
  
  /**
    * The currency code of a monetary amount. For example, USD means U.S. dollars.
    */
  var currencyCode: js.UndefOr[CurrencyCode] = js.undefined
}
object MonetaryAmount {
  
  @scala.inline
  def apply(): MonetaryAmount = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MonetaryAmount]
  }
  
  @scala.inline
  implicit class MonetaryAmountMutableBuilder[Self <: MonetaryAmount] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAmount(value: Double): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAmountUndefined: Self = StObject.set(x, "amount", js.undefined)
    
    @scala.inline
    def setCurrencyCode(value: CurrencyCode): Self = StObject.set(x, "currencyCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrencyCodeUndefined: Self = StObject.set(x, "currencyCode", js.undefined)
  }
}
