package typings.consumerDataStandards.energyMod

import org.scalablytyped.runtime.StringDictionary
import typings.consumerDataStandards.anon.BillFrequency
import typings.consumerDataStandards.anon.Bsb
import typings.consumerDataStandards.anon.CalculationType
import typings.consumerDataStandards.consumerDataStandardsStrings.cardDebit
import typings.consumerDataStandards.consumerDataStandardsStrings.directDebit
import typings.consumerDataStandards.consumerDataStandardsStrings.manualPayment
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnergyPaymentSchedule
  extends StObject
     with /* k */ StringDictionary[Any] {
  
  /**
    * Optional payment amount indicating that a constant payment amount is scheduled to be paid (used in bill smooting scenarios)
    */
  var amount: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Represents a regular credit card payment schedule. Mandatory if paymentScheduleUType is set to cardDebit
    */
  var cardDebit: js.UndefOr[CalculationType | Null] = js.undefined
  
  /**
    * Represents a regular direct debit from a specified bank account. Mandatory if paymentScheduleUType is set to directDebit
    */
  var directDebit: js.UndefOr[Bsb | Null] = js.undefined
  
  /**
    * Represents a manual payment schedule where the customer pays in response to a delivered statement. Mandatory if paymentScheduleUType is set to manualPayment
    */
  var manualPayment: js.UndefOr[BillFrequency | Null] = js.undefined
  
  /**
    * The type of object present in this response
    */
  var paymentScheduleUType: cardDebit | directDebit | manualPayment
}
object EnergyPaymentSchedule {
  
  inline def apply(paymentScheduleUType: cardDebit | directDebit | manualPayment): EnergyPaymentSchedule = {
    val __obj = js.Dynamic.literal(paymentScheduleUType = paymentScheduleUType.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnergyPaymentSchedule]
  }
  
  extension [Self <: EnergyPaymentSchedule](x: Self) {
    
    inline def setAmount(value: String): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
    
    inline def setAmountNull: Self = StObject.set(x, "amount", null)
    
    inline def setAmountUndefined: Self = StObject.set(x, "amount", js.undefined)
    
    inline def setCardDebit(value: CalculationType): Self = StObject.set(x, "cardDebit", value.asInstanceOf[js.Any])
    
    inline def setCardDebitNull: Self = StObject.set(x, "cardDebit", null)
    
    inline def setCardDebitUndefined: Self = StObject.set(x, "cardDebit", js.undefined)
    
    inline def setDirectDebit(value: Bsb): Self = StObject.set(x, "directDebit", value.asInstanceOf[js.Any])
    
    inline def setDirectDebitNull: Self = StObject.set(x, "directDebit", null)
    
    inline def setDirectDebitUndefined: Self = StObject.set(x, "directDebit", js.undefined)
    
    inline def setManualPayment(value: BillFrequency): Self = StObject.set(x, "manualPayment", value.asInstanceOf[js.Any])
    
    inline def setManualPaymentNull: Self = StObject.set(x, "manualPayment", null)
    
    inline def setManualPaymentUndefined: Self = StObject.set(x, "manualPayment", js.undefined)
    
    inline def setPaymentScheduleUType(value: cardDebit | directDebit | manualPayment): Self = StObject.set(x, "paymentScheduleUType", value.asInstanceOf[js.Any])
  }
}
