package typings.awsSdk.snsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CheckIfPhoneNumberIsOptedOutResponse extends StObject {
  
  /**
    * Indicates whether the phone number is opted out:    true – The phone number is opted out, meaning you cannot publish SMS messages to it.    false – The phone number is opted in, meaning you can publish SMS messages to it.  
    */
  var isOptedOut: js.UndefOr[Boolean] = js.native
}
object CheckIfPhoneNumberIsOptedOutResponse {
  
  @scala.inline
  def apply(): CheckIfPhoneNumberIsOptedOutResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CheckIfPhoneNumberIsOptedOutResponse]
  }
  
  @scala.inline
  implicit class CheckIfPhoneNumberIsOptedOutResponseMutableBuilder[Self <: CheckIfPhoneNumberIsOptedOutResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIsOptedOut(value: Boolean): Self = StObject.set(x, "isOptedOut", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsOptedOutUndefined: Self = StObject.set(x, "isOptedOut", js.undefined)
  }
}
