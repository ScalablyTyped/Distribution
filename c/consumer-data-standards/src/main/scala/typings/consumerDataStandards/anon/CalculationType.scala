package typings.consumerDataStandards.anon

import org.scalablytyped.runtime.StringDictionary
import typings.consumerDataStandards.consumerDataStandardsStrings.AMEX
import typings.consumerDataStandards.consumerDataStandardsStrings.BALANCE
import typings.consumerDataStandards.consumerDataStandardsStrings.CALCULATED
import typings.consumerDataStandards.consumerDataStandardsStrings.DINERS
import typings.consumerDataStandards.consumerDataStandardsStrings.MASTERCARD
import typings.consumerDataStandards.consumerDataStandardsStrings.OTHER
import typings.consumerDataStandards.consumerDataStandardsStrings.STATIC
import typings.consumerDataStandards.consumerDataStandardsStrings.UNKNOWN
import typings.consumerDataStandards.consumerDataStandardsStrings.VISA
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CalculationType
  extends StObject
     with /* k */ StringDictionary[Any] {
  
  /**
    * The mechanism by which the payment amount is calculated.  Explanation of values are as follows:<br/><ul><li>**STATIC** - Indicates a consistent, static amount, per payment</li><li>**BALANCE** - Indicates that the outstanding balance for the account is paid per period</li><li>**CALCULATED** - Indicates that the payment amount is variable and calculated using a pre-defined algorithm</li></ul>
    */
  var calculationType: STATIC | BALANCE | CALCULATED
  
  /**
    * The type of credit card held on file
    */
  var cardScheme: VISA | MASTERCARD | AMEX | DINERS | OTHER | UNKNOWN
  
  /**
    * The frequency that payments will occur.  Formatted according to [ISO 8601 Durations](https://en.wikipedia.org/wiki/ISO_8601#Durations) (excludes recurrence syntax)
    */
  var paymentFrequency: String
}
object CalculationType {
  
  inline def apply(
    calculationType: STATIC | BALANCE | CALCULATED,
    cardScheme: VISA | MASTERCARD | AMEX | DINERS | OTHER | UNKNOWN,
    paymentFrequency: String
  ): CalculationType = {
    val __obj = js.Dynamic.literal(calculationType = calculationType.asInstanceOf[js.Any], cardScheme = cardScheme.asInstanceOf[js.Any], paymentFrequency = paymentFrequency.asInstanceOf[js.Any])
    __obj.asInstanceOf[CalculationType]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CalculationType] (val x: Self) extends AnyVal {
    
    inline def setCalculationType(value: STATIC | BALANCE | CALCULATED): Self = StObject.set(x, "calculationType", value.asInstanceOf[js.Any])
    
    inline def setCardScheme(value: VISA | MASTERCARD | AMEX | DINERS | OTHER | UNKNOWN): Self = StObject.set(x, "cardScheme", value.asInstanceOf[js.Any])
    
    inline def setPaymentFrequency(value: String): Self = StObject.set(x, "paymentFrequency", value.asInstanceOf[js.Any])
  }
}
