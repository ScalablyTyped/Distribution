package typings.awsSdk.snsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OptInPhoneNumberInput extends StObject {
  
  /**
    * The phone number to opt in.
    */
  var phoneNumber: PhoneNumber = js.native
}
object OptInPhoneNumberInput {
  
  @scala.inline
  def apply(phoneNumber: PhoneNumber): OptInPhoneNumberInput = {
    val __obj = js.Dynamic.literal(phoneNumber = phoneNumber.asInstanceOf[js.Any])
    __obj.asInstanceOf[OptInPhoneNumberInput]
  }
  
  @scala.inline
  implicit class OptInPhoneNumberInputMutableBuilder[Self <: OptInPhoneNumberInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPhoneNumber(value: PhoneNumber): Self = StObject.set(x, "phoneNumber", value.asInstanceOf[js.Any])
  }
}
