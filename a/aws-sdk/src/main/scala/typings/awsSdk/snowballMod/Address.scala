package typings.awsSdk.snowballMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Address extends StObject {
  
  /**
    * The unique ID for an address.
    */
  var AddressId: js.UndefOr[typings.awsSdk.snowballMod.AddressId] = js.native
  
  /**
    * The city in an address that a Snow device is to be delivered to.
    */
  var City: js.UndefOr[String] = js.native
  
  /**
    * The name of the company to receive a Snow device at an address.
    */
  var Company: js.UndefOr[String] = js.native
  
  /**
    * The country in an address that a Snow device is to be delivered to.
    */
  var Country: js.UndefOr[String] = js.native
  
  /**
    * If the address you are creating is a primary address, then set this option to true. This field is not supported in most regions.
    */
  var IsRestricted: js.UndefOr[Boolean] = js.native
  
  /**
    * This field is no longer used and the value is ignored.
    */
  var Landmark: js.UndefOr[String] = js.native
  
  /**
    * The name of a person to receive a Snow device at an address.
    */
  var Name: js.UndefOr[String] = js.native
  
  /**
    * The phone number associated with an address that a Snow device is to be delivered to.
    */
  var PhoneNumber: js.UndefOr[String] = js.native
  
  /**
    * The postal code in an address that a Snow device is to be delivered to.
    */
  var PostalCode: js.UndefOr[String] = js.native
  
  /**
    * This field is no longer used and the value is ignored.
    */
  var PrefectureOrDistrict: js.UndefOr[String] = js.native
  
  /**
    * The state or province in an address that a Snow device is to be delivered to.
    */
  var StateOrProvince: js.UndefOr[String] = js.native
  
  /**
    * The first line in a street address that a Snow device is to be delivered to.
    */
  var Street1: js.UndefOr[String] = js.native
  
  /**
    * The second line in a street address that a Snow device is to be delivered to.
    */
  var Street2: js.UndefOr[String] = js.native
  
  /**
    * The third line in a street address that a Snow device is to be delivered to.
    */
  var Street3: js.UndefOr[String] = js.native
}
object Address {
  
  @scala.inline
  def apply(): Address = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Address]
  }
  
  @scala.inline
  implicit class AddressMutableBuilder[Self <: Address] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddressId(value: AddressId): Self = StObject.set(x, "AddressId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddressIdUndefined: Self = StObject.set(x, "AddressId", js.undefined)
    
    @scala.inline
    def setCity(value: String): Self = StObject.set(x, "City", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCityUndefined: Self = StObject.set(x, "City", js.undefined)
    
    @scala.inline
    def setCompany(value: String): Self = StObject.set(x, "Company", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompanyUndefined: Self = StObject.set(x, "Company", js.undefined)
    
    @scala.inline
    def setCountry(value: String): Self = StObject.set(x, "Country", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCountryUndefined: Self = StObject.set(x, "Country", js.undefined)
    
    @scala.inline
    def setIsRestricted(value: Boolean): Self = StObject.set(x, "IsRestricted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsRestrictedUndefined: Self = StObject.set(x, "IsRestricted", js.undefined)
    
    @scala.inline
    def setLandmark(value: String): Self = StObject.set(x, "Landmark", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLandmarkUndefined: Self = StObject.set(x, "Landmark", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    @scala.inline
    def setPhoneNumber(value: String): Self = StObject.set(x, "PhoneNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPhoneNumberUndefined: Self = StObject.set(x, "PhoneNumber", js.undefined)
    
    @scala.inline
    def setPostalCode(value: String): Self = StObject.set(x, "PostalCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPostalCodeUndefined: Self = StObject.set(x, "PostalCode", js.undefined)
    
    @scala.inline
    def setPrefectureOrDistrict(value: String): Self = StObject.set(x, "PrefectureOrDistrict", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrefectureOrDistrictUndefined: Self = StObject.set(x, "PrefectureOrDistrict", js.undefined)
    
    @scala.inline
    def setStateOrProvince(value: String): Self = StObject.set(x, "StateOrProvince", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateOrProvinceUndefined: Self = StObject.set(x, "StateOrProvince", js.undefined)
    
    @scala.inline
    def setStreet1(value: String): Self = StObject.set(x, "Street1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStreet1Undefined: Self = StObject.set(x, "Street1", js.undefined)
    
    @scala.inline
    def setStreet2(value: String): Self = StObject.set(x, "Street2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStreet2Undefined: Self = StObject.set(x, "Street2", js.undefined)
    
    @scala.inline
    def setStreet3(value: String): Self = StObject.set(x, "Street3", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStreet3Undefined: Self = StObject.set(x, "Street3", js.undefined)
  }
}
