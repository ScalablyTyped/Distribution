package typings.awsSdk.connectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AvailableNumberSummary extends StObject {
  
  /**
    * The phone number. Phone numbers are formatted [+] [country code] [subscriber number including area code].
    */
  var PhoneNumber: js.UndefOr[typings.awsSdk.connectMod.PhoneNumber] = js.undefined
  
  /**
    * The ISO country code.
    */
  var PhoneNumberCountryCode: js.UndefOr[typings.awsSdk.connectMod.PhoneNumberCountryCode] = js.undefined
  
  /**
    * The type of phone number.
    */
  var PhoneNumberType: js.UndefOr[typings.awsSdk.connectMod.PhoneNumberType] = js.undefined
}
object AvailableNumberSummary {
  
  inline def apply(): AvailableNumberSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AvailableNumberSummary]
  }
  
  extension [Self <: AvailableNumberSummary](x: Self) {
    
    inline def setPhoneNumber(value: PhoneNumber): Self = StObject.set(x, "PhoneNumber", value.asInstanceOf[js.Any])
    
    inline def setPhoneNumberCountryCode(value: PhoneNumberCountryCode): Self = StObject.set(x, "PhoneNumberCountryCode", value.asInstanceOf[js.Any])
    
    inline def setPhoneNumberCountryCodeUndefined: Self = StObject.set(x, "PhoneNumberCountryCode", js.undefined)
    
    inline def setPhoneNumberType(value: PhoneNumberType): Self = StObject.set(x, "PhoneNumberType", value.asInstanceOf[js.Any])
    
    inline def setPhoneNumberTypeUndefined: Self = StObject.set(x, "PhoneNumberType", js.undefined)
    
    inline def setPhoneNumberUndefined: Self = StObject.set(x, "PhoneNumber", js.undefined)
  }
}
