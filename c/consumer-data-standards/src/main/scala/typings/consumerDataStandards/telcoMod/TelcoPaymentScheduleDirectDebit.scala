package typings.consumerDataStandards.telcoMod

import org.scalablytyped.runtime.StringDictionary
import typings.consumerDataStandards.consumerDataStandardsStrings.BALANCE
import typings.consumerDataStandards.consumerDataStandardsStrings.CALCULATED
import typings.consumerDataStandards.consumerDataStandardsStrings.STATIC
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TelcoPaymentScheduleDirectDebit
  extends StObject
     with /* k */ StringDictionary[Any] {
  
  /**
    * The unmasked account number for the account to be debited. Is expected to be formatted as digits only with leading zeros included and no punctuation or spaces.  Is required if isTokenised is absent or false
    */
  var accountNumber: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The unmasked BSB for the account to be debited. Is expected to be formatted as digits only with leading zeros included and no punctuation or spaces.  Is required if isTokenised is absent or false
    */
  var bsb: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The mechanism by which the payment amount is calculated.  Explanation of values are as follows:<br/><ul><li>**STATIC** - Indicates a consistent, static amount, per payment</li><li>**BALANCE** - Indicates that the outstanding balance for the account is paid per period</li><li>**CALCULATED** - Indicates that the payment amount is variable and calculated using a pre-defined algorithm</li></ul>
    */
  var calculationType: STATIC | BALANCE | CALCULATED
  
  /**
    * Flag indicating that the account details are tokenised and cannot be shared.  False if absent
    */
  var isTokenised: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * The frequency that payments will occur.  Formatted according to [ISO 8601 Durations](https://en.wikipedia.org/wiki/ISO_8601#Durations) (excludes recurrence syntax)
    */
  var paymentFrequency: String
}
object TelcoPaymentScheduleDirectDebit {
  
  inline def apply(calculationType: STATIC | BALANCE | CALCULATED, paymentFrequency: String): TelcoPaymentScheduleDirectDebit = {
    val __obj = js.Dynamic.literal(calculationType = calculationType.asInstanceOf[js.Any], paymentFrequency = paymentFrequency.asInstanceOf[js.Any])
    __obj.asInstanceOf[TelcoPaymentScheduleDirectDebit]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TelcoPaymentScheduleDirectDebit] (val x: Self) extends AnyVal {
    
    inline def setAccountNumber(value: String): Self = StObject.set(x, "accountNumber", value.asInstanceOf[js.Any])
    
    inline def setAccountNumberNull: Self = StObject.set(x, "accountNumber", null)
    
    inline def setAccountNumberUndefined: Self = StObject.set(x, "accountNumber", js.undefined)
    
    inline def setBsb(value: String): Self = StObject.set(x, "bsb", value.asInstanceOf[js.Any])
    
    inline def setBsbNull: Self = StObject.set(x, "bsb", null)
    
    inline def setBsbUndefined: Self = StObject.set(x, "bsb", js.undefined)
    
    inline def setCalculationType(value: STATIC | BALANCE | CALCULATED): Self = StObject.set(x, "calculationType", value.asInstanceOf[js.Any])
    
    inline def setIsTokenised(value: Boolean): Self = StObject.set(x, "isTokenised", value.asInstanceOf[js.Any])
    
    inline def setIsTokenisedNull: Self = StObject.set(x, "isTokenised", null)
    
    inline def setIsTokenisedUndefined: Self = StObject.set(x, "isTokenised", js.undefined)
    
    inline def setPaymentFrequency(value: String): Self = StObject.set(x, "paymentFrequency", value.asInstanceOf[js.Any])
  }
}
