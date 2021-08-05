package typings.awsSdk.pinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NumberValidateResponse extends StObject {
  
  /**
    * The carrier or service provider that the phone number is currently registered with. In some countries and regions, this value may be the carrier or service provider that the phone number was originally registered with.
    */
  var Carrier: js.UndefOr[string] = js.undefined
  
  /**
    * The name of the city where the phone number was originally registered.
    */
  var City: js.UndefOr[string] = js.undefined
  
  /**
    * The cleansed phone number, in E.164 format, for the location where the phone number was originally registered.
    */
  var CleansedPhoneNumberE164: js.UndefOr[string] = js.undefined
  
  /**
    * The cleansed phone number, in the format for the location where the phone number was originally registered.
    */
  var CleansedPhoneNumberNational: js.UndefOr[string] = js.undefined
  
  /**
    * The name of the country or region where the phone number was originally registered.
    */
  var Country: js.UndefOr[string] = js.undefined
  
  /**
    * The two-character code, in ISO 3166-1 alpha-2 format, for the country or region where the phone number was originally registered.
    */
  var CountryCodeIso2: js.UndefOr[string] = js.undefined
  
  /**
    * The numeric code for the country or region where the phone number was originally registered.
    */
  var CountryCodeNumeric: js.UndefOr[string] = js.undefined
  
  /**
    * The name of the county where the phone number was originally registered.
    */
  var County: js.UndefOr[string] = js.undefined
  
  /**
    * The two-character code, in ISO 3166-1 alpha-2 format, that was sent in the request body.
    */
  var OriginalCountryCodeIso2: js.UndefOr[string] = js.undefined
  
  /**
    * The phone number that was sent in the request body.
    */
  var OriginalPhoneNumber: js.UndefOr[string] = js.undefined
  
  /**
    * The description of the phone type. Valid values are: MOBILE, LANDLINE, VOIP,
    INVALID, PREPAID, and OTHER.
    */
  var PhoneType: js.UndefOr[string] = js.undefined
  
  /**
    * The phone type, represented by an integer. Valid values are: 0 (mobile), 1 (landline), 2 (VoIP), 3 (invalid), 4 (other), and 5 (prepaid).
    */
  var PhoneTypeCode: js.UndefOr[integer] = js.undefined
  
  /**
    * The time zone for the location where the phone number was originally registered.
    */
  var Timezone: js.UndefOr[string] = js.undefined
  
  /**
    * The postal or ZIP code for the location where the phone number was originally registered.
    */
  var ZipCode: js.UndefOr[string] = js.undefined
}
object NumberValidateResponse {
  
  inline def apply(): NumberValidateResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NumberValidateResponse]
  }
  
  extension [Self <: NumberValidateResponse](x: Self) {
    
    inline def setCarrier(value: string): Self = StObject.set(x, "Carrier", value.asInstanceOf[js.Any])
    
    inline def setCarrierUndefined: Self = StObject.set(x, "Carrier", js.undefined)
    
    inline def setCity(value: string): Self = StObject.set(x, "City", value.asInstanceOf[js.Any])
    
    inline def setCityUndefined: Self = StObject.set(x, "City", js.undefined)
    
    inline def setCleansedPhoneNumberE164(value: string): Self = StObject.set(x, "CleansedPhoneNumberE164", value.asInstanceOf[js.Any])
    
    inline def setCleansedPhoneNumberE164Undefined: Self = StObject.set(x, "CleansedPhoneNumberE164", js.undefined)
    
    inline def setCleansedPhoneNumberNational(value: string): Self = StObject.set(x, "CleansedPhoneNumberNational", value.asInstanceOf[js.Any])
    
    inline def setCleansedPhoneNumberNationalUndefined: Self = StObject.set(x, "CleansedPhoneNumberNational", js.undefined)
    
    inline def setCountry(value: string): Self = StObject.set(x, "Country", value.asInstanceOf[js.Any])
    
    inline def setCountryCodeIso2(value: string): Self = StObject.set(x, "CountryCodeIso2", value.asInstanceOf[js.Any])
    
    inline def setCountryCodeIso2Undefined: Self = StObject.set(x, "CountryCodeIso2", js.undefined)
    
    inline def setCountryCodeNumeric(value: string): Self = StObject.set(x, "CountryCodeNumeric", value.asInstanceOf[js.Any])
    
    inline def setCountryCodeNumericUndefined: Self = StObject.set(x, "CountryCodeNumeric", js.undefined)
    
    inline def setCountryUndefined: Self = StObject.set(x, "Country", js.undefined)
    
    inline def setCounty(value: string): Self = StObject.set(x, "County", value.asInstanceOf[js.Any])
    
    inline def setCountyUndefined: Self = StObject.set(x, "County", js.undefined)
    
    inline def setOriginalCountryCodeIso2(value: string): Self = StObject.set(x, "OriginalCountryCodeIso2", value.asInstanceOf[js.Any])
    
    inline def setOriginalCountryCodeIso2Undefined: Self = StObject.set(x, "OriginalCountryCodeIso2", js.undefined)
    
    inline def setOriginalPhoneNumber(value: string): Self = StObject.set(x, "OriginalPhoneNumber", value.asInstanceOf[js.Any])
    
    inline def setOriginalPhoneNumberUndefined: Self = StObject.set(x, "OriginalPhoneNumber", js.undefined)
    
    inline def setPhoneType(value: string): Self = StObject.set(x, "PhoneType", value.asInstanceOf[js.Any])
    
    inline def setPhoneTypeCode(value: integer): Self = StObject.set(x, "PhoneTypeCode", value.asInstanceOf[js.Any])
    
    inline def setPhoneTypeCodeUndefined: Self = StObject.set(x, "PhoneTypeCode", js.undefined)
    
    inline def setPhoneTypeUndefined: Self = StObject.set(x, "PhoneType", js.undefined)
    
    inline def setTimezone(value: string): Self = StObject.set(x, "Timezone", value.asInstanceOf[js.Any])
    
    inline def setTimezoneUndefined: Self = StObject.set(x, "Timezone", js.undefined)
    
    inline def setZipCode(value: string): Self = StObject.set(x, "ZipCode", value.asInstanceOf[js.Any])
    
    inline def setZipCodeUndefined: Self = StObject.set(x, "ZipCode", js.undefined)
  }
}
