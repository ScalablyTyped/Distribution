package typings.awsSdkClientPinpointBrowser

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesNumberValidateRequestMod {
  
  trait NumberValidateRequest extends StObject {
    
    /**
      * (Optional) The two-character ISO country code for the country or region where the phone number was originally registered.
      */
    var IsoCountryCode: js.UndefOr[String] = js.undefined
    
    /**
      * The phone number to get information about. The phone number that you provide should include a country code. If the number doesn't include a valid country code, the operation might result in an error.
      */
    var PhoneNumber: js.UndefOr[String] = js.undefined
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
      def setIsoCountryCode(value: String): Self = StObject.set(x, "IsoCountryCode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsoCountryCodeUndefined: Self = StObject.set(x, "IsoCountryCode", js.undefined)
      
      @scala.inline
      def setPhoneNumber(value: String): Self = StObject.set(x, "PhoneNumber", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPhoneNumberUndefined: Self = StObject.set(x, "PhoneNumber", js.undefined)
    }
  }
  
  type UnmarshalledNumberValidateRequest = NumberValidateRequest
}
