package typings.awsSdk.pinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  def apply(
    Carrier: string = null,
    City: string = null,
    CleansedPhoneNumberE164: string = null,
    CleansedPhoneNumberNational: string = null,
    Country: string = null,
    CountryCodeIso2: string = null,
    CountryCodeNumeric: string = null,
    County: string = null,
    OriginalCountryCodeIso2: string = null,
    OriginalPhoneNumber: string = null,
    PhoneType: string = null,
    PhoneTypeCode: js.UndefOr[integer] = js.undefined,
    Timezone: string = null,
    ZipCode: string = null
  ): NumberValidateResponse = {
    val __obj = js.Dynamic.literal()
    if (Carrier != null) __obj.updateDynamic("Carrier")(Carrier.asInstanceOf[js.Any])
    if (City != null) __obj.updateDynamic("City")(City.asInstanceOf[js.Any])
    if (CleansedPhoneNumberE164 != null) __obj.updateDynamic("CleansedPhoneNumberE164")(CleansedPhoneNumberE164.asInstanceOf[js.Any])
    if (CleansedPhoneNumberNational != null) __obj.updateDynamic("CleansedPhoneNumberNational")(CleansedPhoneNumberNational.asInstanceOf[js.Any])
    if (Country != null) __obj.updateDynamic("Country")(Country.asInstanceOf[js.Any])
    if (CountryCodeIso2 != null) __obj.updateDynamic("CountryCodeIso2")(CountryCodeIso2.asInstanceOf[js.Any])
    if (CountryCodeNumeric != null) __obj.updateDynamic("CountryCodeNumeric")(CountryCodeNumeric.asInstanceOf[js.Any])
    if (County != null) __obj.updateDynamic("County")(County.asInstanceOf[js.Any])
    if (OriginalCountryCodeIso2 != null) __obj.updateDynamic("OriginalCountryCodeIso2")(OriginalCountryCodeIso2.asInstanceOf[js.Any])
    if (OriginalPhoneNumber != null) __obj.updateDynamic("OriginalPhoneNumber")(OriginalPhoneNumber.asInstanceOf[js.Any])
    if (PhoneType != null) __obj.updateDynamic("PhoneType")(PhoneType.asInstanceOf[js.Any])
    if (!js.isUndefined(PhoneTypeCode)) __obj.updateDynamic("PhoneTypeCode")(PhoneTypeCode.get.asInstanceOf[js.Any])
    if (Timezone != null) __obj.updateDynamic("Timezone")(Timezone.asInstanceOf[js.Any])
    if (ZipCode != null) __obj.updateDynamic("ZipCode")(ZipCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[NumberValidateResponse]
  }
}

