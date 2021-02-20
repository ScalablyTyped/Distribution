package typings.awsSdk.pinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NumberValidateRequest extends StObject {
  
  /**
    * The two-character code, in ISO 3166-1 alpha-2 format, for the country or region where the phone number was originally registered.
    */
  var IsoCountryCode: js.UndefOr[string] = js.native
  
  /**
    * The phone number to retrieve information about. The phone number that you provide should include a valid numeric country code. Otherwise, the operation might result in an error.
    */
  var PhoneNumber: js.UndefOr[string] = js.native
}
object NumberValidateRequest {
  
  @scala.inline
  def apply(): NumberValidateRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NumberValidateRequest]
  }
  
  @scala.inline
  implicit class NumberValidateRequestMutableBuilder[Self <: NumberValidateRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIsoCountryCode(value: string): Self = StObject.set(x, "IsoCountryCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsoCountryCodeUndefined: Self = StObject.set(x, "IsoCountryCode", js.undefined)
    
    @scala.inline
    def setPhoneNumber(value: string): Self = StObject.set(x, "PhoneNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPhoneNumberUndefined: Self = StObject.set(x, "PhoneNumber", js.undefined)
  }
}
