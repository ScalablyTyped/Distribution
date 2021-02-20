package typings.braintree.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CountryName extends StObject {
  
  var company: js.UndefOr[String] = js.native
  
  var countryName: js.UndefOr[String] = js.native
  
  var extendedAddress: js.UndefOr[String] = js.native
  
  var firstName: js.UndefOr[String] = js.native
  
  var lastName: js.UndefOr[String] = js.native
  
  var locality: js.UndefOr[String] = js.native
  
  var postalCode: js.UndefOr[String] = js.native
  
  var region: js.UndefOr[String] = js.native
  
  var streetAddress: js.UndefOr[String] = js.native
}
object CountryName {
  
  @scala.inline
  def apply(): CountryName = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CountryName]
  }
  
  @scala.inline
  implicit class CountryNameMutableBuilder[Self <: CountryName] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCompany(value: String): Self = StObject.set(x, "company", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompanyUndefined: Self = StObject.set(x, "company", js.undefined)
    
    @scala.inline
    def setCountryName(value: String): Self = StObject.set(x, "countryName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCountryNameUndefined: Self = StObject.set(x, "countryName", js.undefined)
    
    @scala.inline
    def setExtendedAddress(value: String): Self = StObject.set(x, "extendedAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtendedAddressUndefined: Self = StObject.set(x, "extendedAddress", js.undefined)
    
    @scala.inline
    def setFirstName(value: String): Self = StObject.set(x, "firstName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFirstNameUndefined: Self = StObject.set(x, "firstName", js.undefined)
    
    @scala.inline
    def setLastName(value: String): Self = StObject.set(x, "lastName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastNameUndefined: Self = StObject.set(x, "lastName", js.undefined)
    
    @scala.inline
    def setLocality(value: String): Self = StObject.set(x, "locality", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocalityUndefined: Self = StObject.set(x, "locality", js.undefined)
    
    @scala.inline
    def setPostalCode(value: String): Self = StObject.set(x, "postalCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPostalCodeUndefined: Self = StObject.set(x, "postalCode", js.undefined)
    
    @scala.inline
    def setRegion(value: String): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegionUndefined: Self = StObject.set(x, "region", js.undefined)
    
    @scala.inline
    def setStreetAddress(value: String): Self = StObject.set(x, "streetAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStreetAddressUndefined: Self = StObject.set(x, "streetAddress", js.undefined)
  }
}
