package typings.awsSdk.snsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteSMSSandboxPhoneNumberInput extends StObject {
  
  /**
    * The destination phone number to delete.
    */
  var PhoneNumber: PhoneNumberString
}
object DeleteSMSSandboxPhoneNumberInput {
  
  inline def apply(PhoneNumber: PhoneNumberString): DeleteSMSSandboxPhoneNumberInput = {
    val __obj = js.Dynamic.literal(PhoneNumber = PhoneNumber.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteSMSSandboxPhoneNumberInput]
  }
  
  extension [Self <: DeleteSMSSandboxPhoneNumberInput](x: Self) {
    
    inline def setPhoneNumber(value: PhoneNumberString): Self = StObject.set(x, "PhoneNumber", value.asInstanceOf[js.Any])
  }
}
