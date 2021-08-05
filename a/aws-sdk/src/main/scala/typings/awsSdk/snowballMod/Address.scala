package typings.awsSdk.snowballMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Address extends StObject {
  
  /**
    * The unique ID for an address.
    */
  var AddressId: js.UndefOr[typings.awsSdk.snowballMod.AddressId] = js.undefined
  
  /**
    * The city in an address that a Snow device is to be delivered to.
    */
  var City: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the company to receive a Snow device at an address.
    */
  var Company: js.UndefOr[String] = js.undefined
  
  /**
    * The country in an address that a Snow device is to be delivered to.
    */
  var Country: js.UndefOr[String] = js.undefined
  
  /**
    * If the address you are creating is a primary address, then set this option to true. This field is not supported in most regions.
    */
  var IsRestricted: js.UndefOr[Boolean] = js.undefined
  
  /**
    * This field is no longer used and the value is ignored.
    */
  var Landmark: js.UndefOr[String] = js.undefined
  
  /**
    * The name of a person to receive a Snow device at an address.
    */
  var Name: js.UndefOr[String] = js.undefined
  
  /**
    * The phone number associated with an address that a Snow device is to be delivered to.
    */
  var PhoneNumber: js.UndefOr[String] = js.undefined
  
  /**
    * The postal code in an address that a Snow device is to be delivered to.
    */
  var PostalCode: js.UndefOr[String] = js.undefined
  
  /**
    * This field is no longer used and the value is ignored.
    */
  var PrefectureOrDistrict: js.UndefOr[String] = js.undefined
  
  /**
    * The state or province in an address that a Snow device is to be delivered to.
    */
  var StateOrProvince: js.UndefOr[String] = js.undefined
  
  /**
    * The first line in a street address that a Snow device is to be delivered to.
    */
  var Street1: js.UndefOr[String] = js.undefined
  
  /**
    * The second line in a street address that a Snow device is to be delivered to.
    */
  var Street2: js.UndefOr[String] = js.undefined
  
  /**
    * The third line in a street address that a Snow device is to be delivered to.
    */
  var Street3: js.UndefOr[String] = js.undefined
}
object Address {
  
  inline def apply(): Address = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Address]
  }
  
  extension [Self <: Address](x: Self) {
    
    inline def setAddressId(value: AddressId): Self = StObject.set(x, "AddressId", value.asInstanceOf[js.Any])
    
    inline def setAddressIdUndefined: Self = StObject.set(x, "AddressId", js.undefined)
    
    inline def setCity(value: String): Self = StObject.set(x, "City", value.asInstanceOf[js.Any])
    
    inline def setCityUndefined: Self = StObject.set(x, "City", js.undefined)
    
    inline def setCompany(value: String): Self = StObject.set(x, "Company", value.asInstanceOf[js.Any])
    
    inline def setCompanyUndefined: Self = StObject.set(x, "Company", js.undefined)
    
    inline def setCountry(value: String): Self = StObject.set(x, "Country", value.asInstanceOf[js.Any])
    
    inline def setCountryUndefined: Self = StObject.set(x, "Country", js.undefined)
    
    inline def setIsRestricted(value: Boolean): Self = StObject.set(x, "IsRestricted", value.asInstanceOf[js.Any])
    
    inline def setIsRestrictedUndefined: Self = StObject.set(x, "IsRestricted", js.undefined)
    
    inline def setLandmark(value: String): Self = StObject.set(x, "Landmark", value.asInstanceOf[js.Any])
    
    inline def setLandmarkUndefined: Self = StObject.set(x, "Landmark", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setPhoneNumber(value: String): Self = StObject.set(x, "PhoneNumber", value.asInstanceOf[js.Any])
    
    inline def setPhoneNumberUndefined: Self = StObject.set(x, "PhoneNumber", js.undefined)
    
    inline def setPostalCode(value: String): Self = StObject.set(x, "PostalCode", value.asInstanceOf[js.Any])
    
    inline def setPostalCodeUndefined: Self = StObject.set(x, "PostalCode", js.undefined)
    
    inline def setPrefectureOrDistrict(value: String): Self = StObject.set(x, "PrefectureOrDistrict", value.asInstanceOf[js.Any])
    
    inline def setPrefectureOrDistrictUndefined: Self = StObject.set(x, "PrefectureOrDistrict", js.undefined)
    
    inline def setStateOrProvince(value: String): Self = StObject.set(x, "StateOrProvince", value.asInstanceOf[js.Any])
    
    inline def setStateOrProvinceUndefined: Self = StObject.set(x, "StateOrProvince", js.undefined)
    
    inline def setStreet1(value: String): Self = StObject.set(x, "Street1", value.asInstanceOf[js.Any])
    
    inline def setStreet1Undefined: Self = StObject.set(x, "Street1", js.undefined)
    
    inline def setStreet2(value: String): Self = StObject.set(x, "Street2", value.asInstanceOf[js.Any])
    
    inline def setStreet2Undefined: Self = StObject.set(x, "Street2", js.undefined)
    
    inline def setStreet3(value: String): Self = StObject.set(x, "Street3", value.asInstanceOf[js.Any])
    
    inline def setStreet3Undefined: Self = StObject.set(x, "Street3", js.undefined)
  }
}
