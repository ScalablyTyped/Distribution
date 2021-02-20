package typings.awsSdkClientPinpointBrowser

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesNumberValidateResponseMod {
  
  @js.native
  trait NumberValidateResponse extends StObject {
    
    /**
      * The carrier or servive provider that the phone number is currently registered with.
      */
    var Carrier: js.UndefOr[String] = js.native
    
    /**
      * The city where the phone number was originally registered.
      */
    var City: js.UndefOr[String] = js.native
    
    /**
      * The cleansed phone number, shown in E.164 format.
      */
    var CleansedPhoneNumberE164: js.UndefOr[String] = js.native
    
    /**
      * The cleansed phone number, shown in the local phone number format.
      */
    var CleansedPhoneNumberNational: js.UndefOr[String] = js.native
    
    /**
      * The country or region where the phone number was originally registered.
      */
    var Country: js.UndefOr[String] = js.native
    
    /**
      * The two-character ISO code for the country or region where the phone number was originally registered.
      */
    var CountryCodeIso2: js.UndefOr[String] = js.native
    
    /**
      * The numeric code for the country or region where the phone number was originally registered.
      */
    var CountryCodeNumeric: js.UndefOr[String] = js.native
    
    /**
      * The county where the phone number was originally registered.
      */
    var County: js.UndefOr[String] = js.native
    
    /**
      * The two-character code (in ISO 3166-1 alpha-2 format) for the country or region in the request body.
      */
    var OriginalCountryCodeIso2: js.UndefOr[String] = js.native
    
    /**
      * The phone number that you included in the request body.
      */
    var OriginalPhoneNumber: js.UndefOr[String] = js.native
    
    /**
      * A description of the phone type. Possible values are MOBILE, LANDLINE, VOIP, INVALID, PREPAID, and OTHER.
      */
    var PhoneType: js.UndefOr[String] = js.native
    
    /**
      * The phone type, represented by an integer. Possible values include 0 (MOBILE), 1 (LANDLINE), 2 (VOIP), 3 (INVALID), 4 (OTHER), and 5 (PREPAID).
      */
    var PhoneTypeCode: js.UndefOr[Double] = js.native
    
    /**
      * The time zone for the location where the phone number was originally registered.
      */
    var Timezone: js.UndefOr[String] = js.native
    
    /**
      * The postal code for the location where the phone number was originally registered.
      */
    var ZipCode: js.UndefOr[String] = js.native
  }
  object NumberValidateResponse {
    
    @scala.inline
    def apply(): NumberValidateResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NumberValidateResponse]
    }
    
    @scala.inline
    implicit class NumberValidateResponseMutableBuilder[Self <: NumberValidateResponse] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCarrier(value: String): Self = StObject.set(x, "Carrier", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCarrierUndefined: Self = StObject.set(x, "Carrier", js.undefined)
      
      @scala.inline
      def setCity(value: String): Self = StObject.set(x, "City", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCityUndefined: Self = StObject.set(x, "City", js.undefined)
      
      @scala.inline
      def setCleansedPhoneNumberE164(value: String): Self = StObject.set(x, "CleansedPhoneNumberE164", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCleansedPhoneNumberE164Undefined: Self = StObject.set(x, "CleansedPhoneNumberE164", js.undefined)
      
      @scala.inline
      def setCleansedPhoneNumberNational(value: String): Self = StObject.set(x, "CleansedPhoneNumberNational", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCleansedPhoneNumberNationalUndefined: Self = StObject.set(x, "CleansedPhoneNumberNational", js.undefined)
      
      @scala.inline
      def setCountry(value: String): Self = StObject.set(x, "Country", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCountryCodeIso2(value: String): Self = StObject.set(x, "CountryCodeIso2", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCountryCodeIso2Undefined: Self = StObject.set(x, "CountryCodeIso2", js.undefined)
      
      @scala.inline
      def setCountryCodeNumeric(value: String): Self = StObject.set(x, "CountryCodeNumeric", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCountryCodeNumericUndefined: Self = StObject.set(x, "CountryCodeNumeric", js.undefined)
      
      @scala.inline
      def setCountryUndefined: Self = StObject.set(x, "Country", js.undefined)
      
      @scala.inline
      def setCounty(value: String): Self = StObject.set(x, "County", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCountyUndefined: Self = StObject.set(x, "County", js.undefined)
      
      @scala.inline
      def setOriginalCountryCodeIso2(value: String): Self = StObject.set(x, "OriginalCountryCodeIso2", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOriginalCountryCodeIso2Undefined: Self = StObject.set(x, "OriginalCountryCodeIso2", js.undefined)
      
      @scala.inline
      def setOriginalPhoneNumber(value: String): Self = StObject.set(x, "OriginalPhoneNumber", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOriginalPhoneNumberUndefined: Self = StObject.set(x, "OriginalPhoneNumber", js.undefined)
      
      @scala.inline
      def setPhoneType(value: String): Self = StObject.set(x, "PhoneType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPhoneTypeCode(value: Double): Self = StObject.set(x, "PhoneTypeCode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPhoneTypeCodeUndefined: Self = StObject.set(x, "PhoneTypeCode", js.undefined)
      
      @scala.inline
      def setPhoneTypeUndefined: Self = StObject.set(x, "PhoneType", js.undefined)
      
      @scala.inline
      def setTimezone(value: String): Self = StObject.set(x, "Timezone", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimezoneUndefined: Self = StObject.set(x, "Timezone", js.undefined)
      
      @scala.inline
      def setZipCode(value: String): Self = StObject.set(x, "ZipCode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setZipCodeUndefined: Self = StObject.set(x, "ZipCode", js.undefined)
    }
  }
  
  type UnmarshalledNumberValidateResponse = NumberValidateResponse
}
