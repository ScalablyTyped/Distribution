package typings.awsSdk.pinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NumberValidateResponse extends js.Object {
  
  /**
    * The carrier or service provider that the phone number is currently registered with. In some countries and regions, this value may be the carrier or service provider that the phone number was originally registered with.
    */
  var Carrier: js.UndefOr[string] = js.native
  
  /**
    * The name of the city where the phone number was originally registered.
    */
  var City: js.UndefOr[string] = js.native
  
  /**
    * The cleansed phone number, in E.164 format, for the location where the phone number was originally registered.
    */
  var CleansedPhoneNumberE164: js.UndefOr[string] = js.native
  
  /**
    * The cleansed phone number, in the format for the location where the phone number was originally registered.
    */
  var CleansedPhoneNumberNational: js.UndefOr[string] = js.native
  
  /**
    * The name of the country or region where the phone number was originally registered.
    */
  var Country: js.UndefOr[string] = js.native
  
  /**
    * The two-character code, in ISO 3166-1 alpha-2 format, for the country or region where the phone number was originally registered.
    */
  var CountryCodeIso2: js.UndefOr[string] = js.native
  
  /**
    * The numeric code for the country or region where the phone number was originally registered.
    */
  var CountryCodeNumeric: js.UndefOr[string] = js.native
  
  /**
    * The name of the county where the phone number was originally registered.
    */
  var County: js.UndefOr[string] = js.native
  
  /**
    * The two-character code, in ISO 3166-1 alpha-2 format, that was sent in the request body.
    */
  var OriginalCountryCodeIso2: js.UndefOr[string] = js.native
  
  /**
    * The phone number that was sent in the request body.
    */
  var OriginalPhoneNumber: js.UndefOr[string] = js.native
  
  /**
    * The description of the phone type. Valid values are: MOBILE, LANDLINE, VOIP,
    INVALID, PREPAID, and OTHER.
    */
  var PhoneType: js.UndefOr[string] = js.native
  
  /**
    * The phone type, represented by an integer. Valid values are: 0 (mobile), 1 (landline), 2 (VoIP), 3 (invalid), 4 (other), and 5 (prepaid).
    */
  var PhoneTypeCode: js.UndefOr[integer] = js.native
  
  /**
    * The time zone for the location where the phone number was originally registered.
    */
  var Timezone: js.UndefOr[string] = js.native
  
  /**
    * The postal or ZIP code for the location where the phone number was originally registered.
    */
  var ZipCode: js.UndefOr[string] = js.native
}
object NumberValidateResponse {
  
  @scala.inline
  def apply(): NumberValidateResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NumberValidateResponse]
  }
  
  @scala.inline
  implicit class NumberValidateResponseOps[Self <: NumberValidateResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCarrier(value: string): Self = this.set("Carrier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCarrier: Self = this.set("Carrier", js.undefined)
    
    @scala.inline
    def setCity(value: string): Self = this.set("City", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCity: Self = this.set("City", js.undefined)
    
    @scala.inline
    def setCleansedPhoneNumberE164(value: string): Self = this.set("CleansedPhoneNumberE164", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCleansedPhoneNumberE164: Self = this.set("CleansedPhoneNumberE164", js.undefined)
    
    @scala.inline
    def setCleansedPhoneNumberNational(value: string): Self = this.set("CleansedPhoneNumberNational", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCleansedPhoneNumberNational: Self = this.set("CleansedPhoneNumberNational", js.undefined)
    
    @scala.inline
    def setCountry(value: string): Self = this.set("Country", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCountry: Self = this.set("Country", js.undefined)
    
    @scala.inline
    def setCountryCodeIso2(value: string): Self = this.set("CountryCodeIso2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCountryCodeIso2: Self = this.set("CountryCodeIso2", js.undefined)
    
    @scala.inline
    def setCountryCodeNumeric(value: string): Self = this.set("CountryCodeNumeric", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCountryCodeNumeric: Self = this.set("CountryCodeNumeric", js.undefined)
    
    @scala.inline
    def setCounty(value: string): Self = this.set("County", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCounty: Self = this.set("County", js.undefined)
    
    @scala.inline
    def setOriginalCountryCodeIso2(value: string): Self = this.set("OriginalCountryCodeIso2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOriginalCountryCodeIso2: Self = this.set("OriginalCountryCodeIso2", js.undefined)
    
    @scala.inline
    def setOriginalPhoneNumber(value: string): Self = this.set("OriginalPhoneNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOriginalPhoneNumber: Self = this.set("OriginalPhoneNumber", js.undefined)
    
    @scala.inline
    def setPhoneType(value: string): Self = this.set("PhoneType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePhoneType: Self = this.set("PhoneType", js.undefined)
    
    @scala.inline
    def setPhoneTypeCode(value: integer): Self = this.set("PhoneTypeCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePhoneTypeCode: Self = this.set("PhoneTypeCode", js.undefined)
    
    @scala.inline
    def setTimezone(value: string): Self = this.set("Timezone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimezone: Self = this.set("Timezone", js.undefined)
    
    @scala.inline
    def setZipCode(value: string): Self = this.set("ZipCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteZipCode: Self = this.set("ZipCode", js.undefined)
  }
}
