package typings.awsSdk.snowballMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Address extends js.Object {
  
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
  implicit class AddressOps[Self <: Address] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAddressId(value: AddressId): Self = this.set("AddressId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAddressId: Self = this.set("AddressId", js.undefined)
    
    @scala.inline
    def setCity(value: String): Self = this.set("City", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCity: Self = this.set("City", js.undefined)
    
    @scala.inline
    def setCompany(value: String): Self = this.set("Company", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCompany: Self = this.set("Company", js.undefined)
    
    @scala.inline
    def setCountry(value: String): Self = this.set("Country", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCountry: Self = this.set("Country", js.undefined)
    
    @scala.inline
    def setIsRestricted(value: Boolean): Self = this.set("IsRestricted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsRestricted: Self = this.set("IsRestricted", js.undefined)
    
    @scala.inline
    def setLandmark(value: String): Self = this.set("Landmark", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLandmark: Self = this.set("Landmark", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("Name", js.undefined)
    
    @scala.inline
    def setPhoneNumber(value: String): Self = this.set("PhoneNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePhoneNumber: Self = this.set("PhoneNumber", js.undefined)
    
    @scala.inline
    def setPostalCode(value: String): Self = this.set("PostalCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePostalCode: Self = this.set("PostalCode", js.undefined)
    
    @scala.inline
    def setPrefectureOrDistrict(value: String): Self = this.set("PrefectureOrDistrict", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrefectureOrDistrict: Self = this.set("PrefectureOrDistrict", js.undefined)
    
    @scala.inline
    def setStateOrProvince(value: String): Self = this.set("StateOrProvince", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStateOrProvince: Self = this.set("StateOrProvince", js.undefined)
    
    @scala.inline
    def setStreet1(value: String): Self = this.set("Street1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStreet1: Self = this.set("Street1", js.undefined)
    
    @scala.inline
    def setStreet2(value: String): Self = this.set("Street2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStreet2: Self = this.set("Street2", js.undefined)
    
    @scala.inline
    def setStreet3(value: String): Self = this.set("Street3", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStreet3: Self = this.set("Street3", js.undefined)
  }
}
