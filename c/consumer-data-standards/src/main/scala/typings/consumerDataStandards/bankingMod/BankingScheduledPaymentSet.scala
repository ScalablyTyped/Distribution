package typings.consumerDataStandards.bankingMod

import org.scalablytyped.runtime.StringDictionary
import typings.consumerDataStandards.anon.Biller
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BankingScheduledPaymentSet
  extends StObject
     with /* k */ StringDictionary[Any] {
  
  /**
    * The amount of the next payment if known. Mandatory unless the isAmountCalculated field is set to true. Must be zero or positive if present
    */
  var amount: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The currency for the payment. AUD assumed if not present
    */
  var currency: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Flag indicating whether the amount of the payment is calculated based on the context of the event. For instance a payment to reduce the balance of a credit card to zero. If absent then false is assumed
    */
  var isAmountCalculated: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Object containing details of the destination of the payment. Used to specify a variety of payment destination types
    */
  var to: Biller
}
object BankingScheduledPaymentSet {
  
  inline def apply(to: Biller): BankingScheduledPaymentSet = {
    val __obj = js.Dynamic.literal(to = to.asInstanceOf[js.Any])
    __obj.asInstanceOf[BankingScheduledPaymentSet]
  }
  
  extension [Self <: BankingScheduledPaymentSet](x: Self) {
    
    inline def setAmount(value: String): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
    
    inline def setAmountNull: Self = StObject.set(x, "amount", null)
    
    inline def setAmountUndefined: Self = StObject.set(x, "amount", js.undefined)
    
    inline def setCurrency(value: String): Self = StObject.set(x, "currency", value.asInstanceOf[js.Any])
    
    inline def setCurrencyNull: Self = StObject.set(x, "currency", null)
    
    inline def setCurrencyUndefined: Self = StObject.set(x, "currency", js.undefined)
    
    inline def setIsAmountCalculated(value: Boolean): Self = StObject.set(x, "isAmountCalculated", value.asInstanceOf[js.Any])
    
    inline def setIsAmountCalculatedNull: Self = StObject.set(x, "isAmountCalculated", null)
    
    inline def setIsAmountCalculatedUndefined: Self = StObject.set(x, "isAmountCalculated", js.undefined)
    
    inline def setTo(value: Biller): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
  }
}
