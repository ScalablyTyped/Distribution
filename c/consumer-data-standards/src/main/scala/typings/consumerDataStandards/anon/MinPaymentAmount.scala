package typings.consumerDataStandards.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MinPaymentAmount
  extends StObject
     with /* k */ StringDictionary[Any] {
  
  /**
    * The minimum payment amount due for the next card payment
    */
  var minPaymentAmount: String
  
  /**
    * If absent assumes AUD
    */
  var paymentCurrency: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The amount due for the next card payment
    */
  var paymentDueAmount: String
  
  /**
    * Date that the next payment for the card is due
    */
  var paymentDueDate: String
}
object MinPaymentAmount {
  
  inline def apply(minPaymentAmount: String, paymentDueAmount: String, paymentDueDate: String): MinPaymentAmount = {
    val __obj = js.Dynamic.literal(minPaymentAmount = minPaymentAmount.asInstanceOf[js.Any], paymentDueAmount = paymentDueAmount.asInstanceOf[js.Any], paymentDueDate = paymentDueDate.asInstanceOf[js.Any])
    __obj.asInstanceOf[MinPaymentAmount]
  }
  
  extension [Self <: MinPaymentAmount](x: Self) {
    
    inline def setMinPaymentAmount(value: String): Self = StObject.set(x, "minPaymentAmount", value.asInstanceOf[js.Any])
    
    inline def setPaymentCurrency(value: String): Self = StObject.set(x, "paymentCurrency", value.asInstanceOf[js.Any])
    
    inline def setPaymentCurrencyNull: Self = StObject.set(x, "paymentCurrency", null)
    
    inline def setPaymentCurrencyUndefined: Self = StObject.set(x, "paymentCurrency", js.undefined)
    
    inline def setPaymentDueAmount(value: String): Self = StObject.set(x, "paymentDueAmount", value.asInstanceOf[js.Any])
    
    inline def setPaymentDueDate(value: String): Self = StObject.set(x, "paymentDueDate", value.asInstanceOf[js.Any])
  }
}
