package typings.braintree.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Company extends StObject {
  
  var company: js.UndefOr[String] = js.undefined
  
  var countryCodeAlpha2: js.UndefOr[String] = js.undefined
  
  var countryCodeAlpha3: js.UndefOr[String] = js.undefined
  
  var countryCodeNumeric: js.UndefOr[String] = js.undefined
  
  var countryName: js.UndefOr[String] = js.undefined
  
  var extendedAddress: js.UndefOr[String] = js.undefined
  
  var firstName: js.UndefOr[String] = js.undefined
  
  var lastName: js.UndefOr[String] = js.undefined
  
  var locality: js.UndefOr[String] = js.undefined
  
  var postalCode: js.UndefOr[String] = js.undefined
  
  var region: js.UndefOr[String] = js.undefined
  
  var streetAddress: js.UndefOr[String] = js.undefined
}
object Company {
  
  @scala.inline
  def apply(): Company = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Company]
  }
  
  @scala.inline
  implicit class CompanyMutableBuilder[Self <: Company] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCompany(value: String): Self = StObject.set(x, "company", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompanyUndefined: Self = StObject.set(x, "company", js.undefined)
    
    @scala.inline
    def setCountryCodeAlpha2(value: String): Self = StObject.set(x, "countryCodeAlpha2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCountryCodeAlpha2Undefined: Self = StObject.set(x, "countryCodeAlpha2", js.undefined)
    
    @scala.inline
    def setCountryCodeAlpha3(value: String): Self = StObject.set(x, "countryCodeAlpha3", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCountryCodeAlpha3Undefined: Self = StObject.set(x, "countryCodeAlpha3", js.undefined)
    
    @scala.inline
    def setCountryCodeNumeric(value: String): Self = StObject.set(x, "countryCodeNumeric", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCountryCodeNumericUndefined: Self = StObject.set(x, "countryCodeNumeric", js.undefined)
    
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
