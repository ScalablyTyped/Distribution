package typings.consumerDataStandards.anon

import org.scalablytyped.runtime.StringDictionary
import typings.consumerDataStandards.consumerDataStandardsStrings.BALANCE
import typings.consumerDataStandards.consumerDataStandardsStrings.CALCULATED
import typings.consumerDataStandards.consumerDataStandardsStrings.CONTACT_NAME
import typings.consumerDataStandards.consumerDataStandardsStrings.EMAIL
import typings.consumerDataStandards.consumerDataStandardsStrings.OTHER
import typings.consumerDataStandards.consumerDataStandardsStrings.PAYPAL_AU
import typings.consumerDataStandards.consumerDataStandardsStrings.STATIC
import typings.consumerDataStandards.consumerDataStandardsStrings.TELEPHONE
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PaymentFrequency
  extends StObject
     with /* k */ StringDictionary[Any] {
  
  /**
    * The mechanism by which the payment amount is calculated.  Explanation of values are as follows:<br/><ul><li>**STATIC** - Indicates a consistent, static amount, per payment</li><li>**BALANCE** - Indicates that the outstanding balance for the account is paid per period</li><li>**CALCULATED** - Indicates that the payment amount is variable and calculated using a pre-defined algorithm</li></ul>
    */
  var calculationType: STATIC | BALANCE | CALCULATED
  
  /**
    * The identifier of the digital wallet (dependent on type)
    */
  var identifier: String
  
  /**
    * The name assigned to the digital wallet by the owner of the wallet, else the display name provided by the digital wallet provider
    */
  var name: String
  
  /**
    * The frequency that payments will occur.  Formatted according to [ISO 8601 Durations](https://en.wikipedia.org/wiki/ISO_8601#Durations) (excludes recurrence syntax)
    */
  var paymentFrequency: String
  
  /**
    * The provider of the digital wallet
    */
  var provider: PAYPAL_AU | OTHER
  
  /**
    * The type of the digital wallet identifier
    */
  var `type`: EMAIL | CONTACT_NAME | TELEPHONE
}
object PaymentFrequency {
  
  inline def apply(
    calculationType: STATIC | BALANCE | CALCULATED,
    identifier: String,
    name: String,
    paymentFrequency: String,
    provider: PAYPAL_AU | OTHER,
    `type`: EMAIL | CONTACT_NAME | TELEPHONE
  ): PaymentFrequency = {
    val __obj = js.Dynamic.literal(calculationType = calculationType.asInstanceOf[js.Any], identifier = identifier.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], paymentFrequency = paymentFrequency.asInstanceOf[js.Any], provider = provider.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaymentFrequency]
  }
  
  extension [Self <: PaymentFrequency](x: Self) {
    
    inline def setCalculationType(value: STATIC | BALANCE | CALCULATED): Self = StObject.set(x, "calculationType", value.asInstanceOf[js.Any])
    
    inline def setIdentifier(value: String): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setPaymentFrequency(value: String): Self = StObject.set(x, "paymentFrequency", value.asInstanceOf[js.Any])
    
    inline def setProvider(value: PAYPAL_AU | OTHER): Self = StObject.set(x, "provider", value.asInstanceOf[js.Any])
    
    inline def setType(value: EMAIL | CONTACT_NAME | TELEPHONE): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
