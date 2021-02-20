package typings.awsSdk.snsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CheckIfPhoneNumberIsOptedOutInput extends StObject {
  
  /**
    * The phone number for which you want to check the opt out status.
    */
  var phoneNumber: PhoneNumber = js.native
}
object CheckIfPhoneNumberIsOptedOutInput {
  
  @scala.inline
  def apply(phoneNumber: PhoneNumber): CheckIfPhoneNumberIsOptedOutInput = {
    val __obj = js.Dynamic.literal(phoneNumber = phoneNumber.asInstanceOf[js.Any])
    __obj.asInstanceOf[CheckIfPhoneNumberIsOptedOutInput]
  }
  
  @scala.inline
  implicit class CheckIfPhoneNumberIsOptedOutInputMutableBuilder[Self <: CheckIfPhoneNumberIsOptedOutInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPhoneNumber(value: PhoneNumber): Self = StObject.set(x, "phoneNumber", value.asInstanceOf[js.Any])
  }
}
