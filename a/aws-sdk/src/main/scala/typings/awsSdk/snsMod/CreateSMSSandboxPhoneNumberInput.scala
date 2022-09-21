package typings.awsSdk.snsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateSMSSandboxPhoneNumberInput extends StObject {
  
  /**
    * The language to use for sending the OTP. The default value is en-US.
    */
  var LanguageCode: js.UndefOr[LanguageCodeString] = js.undefined
  
  /**
    * The destination phone number to verify. On verification, Amazon SNS adds this phone number to the list of verified phone numbers that you can send SMS messages to.
    */
  var PhoneNumber: PhoneNumberString
}
object CreateSMSSandboxPhoneNumberInput {
  
  inline def apply(PhoneNumber: PhoneNumberString): CreateSMSSandboxPhoneNumberInput = {
    val __obj = js.Dynamic.literal(PhoneNumber = PhoneNumber.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateSMSSandboxPhoneNumberInput]
  }
  
  extension [Self <: CreateSMSSandboxPhoneNumberInput](x: Self) {
    
    inline def setLanguageCode(value: LanguageCodeString): Self = StObject.set(x, "LanguageCode", value.asInstanceOf[js.Any])
    
    inline def setLanguageCodeUndefined: Self = StObject.set(x, "LanguageCode", js.undefined)
    
    inline def setPhoneNumber(value: PhoneNumberString): Self = StObject.set(x, "PhoneNumber", value.asInstanceOf[js.Any])
  }
}
