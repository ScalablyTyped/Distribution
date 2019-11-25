package typings.atAwsDashSdkClientDashPinpointDashBrowser.typesUnderscoreNumberValidateResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _NumberValidateResponse extends js.Object {
  /**
    * The carrier or servive provider that the phone number is currently registered with.
    */
  var Carrier: js.UndefOr[String] = js.undefined
  /**
    * The city where the phone number was originally registered.
    */
  var City: js.UndefOr[String] = js.undefined
  /**
    * The cleansed phone number, shown in E.164 format.
    */
  var CleansedPhoneNumberE164: js.UndefOr[String] = js.undefined
  /**
    * The cleansed phone number, shown in the local phone number format.
    */
  var CleansedPhoneNumberNational: js.UndefOr[String] = js.undefined
  /**
    * The country or region where the phone number was originally registered.
    */
  var Country: js.UndefOr[String] = js.undefined
  /**
    * The two-character ISO code for the country or region where the phone number was originally registered.
    */
  var CountryCodeIso2: js.UndefOr[String] = js.undefined
  /**
    * The numeric code for the country or region where the phone number was originally registered.
    */
  var CountryCodeNumeric: js.UndefOr[String] = js.undefined
  /**
    * The county where the phone number was originally registered.
    */
  var County: js.UndefOr[String] = js.undefined
  /**
    * The two-character code (in ISO 3166-1 alpha-2 format) for the country or region in the request body.
    */
  var OriginalCountryCodeIso2: js.UndefOr[String] = js.undefined
  /**
    * The phone number that you included in the request body.
    */
  var OriginalPhoneNumber: js.UndefOr[String] = js.undefined
  /**
    * A description of the phone type. Possible values are MOBILE, LANDLINE, VOIP, INVALID, PREPAID, and OTHER.
    */
  var PhoneType: js.UndefOr[String] = js.undefined
  /**
    * The phone type, represented by an integer. Possible values include 0 (MOBILE), 1 (LANDLINE), 2 (VOIP), 3 (INVALID), 4 (OTHER), and 5 (PREPAID).
    */
  var PhoneTypeCode: js.UndefOr[Double] = js.undefined
  /**
    * The time zone for the location where the phone number was originally registered.
    */
  var Timezone: js.UndefOr[String] = js.undefined
  /**
    * The postal code for the location where the phone number was originally registered.
    */
  var ZipCode: js.UndefOr[String] = js.undefined
}

object _NumberValidateResponse {
  @scala.inline
  def apply(
    Carrier: String = null,
    City: String = null,
    CleansedPhoneNumberE164: String = null,
    CleansedPhoneNumberNational: String = null,
    Country: String = null,
    CountryCodeIso2: String = null,
    CountryCodeNumeric: String = null,
    County: String = null,
    OriginalCountryCodeIso2: String = null,
    OriginalPhoneNumber: String = null,
    PhoneType: String = null,
    PhoneTypeCode: Int | Double = null,
    Timezone: String = null,
    ZipCode: String = null
  ): _NumberValidateResponse = {
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
    if (PhoneTypeCode != null) __obj.updateDynamic("PhoneTypeCode")(PhoneTypeCode.asInstanceOf[js.Any])
    if (Timezone != null) __obj.updateDynamic("Timezone")(Timezone.asInstanceOf[js.Any])
    if (ZipCode != null) __obj.updateDynamic("ZipCode")(ZipCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[_NumberValidateResponse]
  }
}

