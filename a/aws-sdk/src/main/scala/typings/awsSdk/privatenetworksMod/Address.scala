package typings.awsSdk.privatenetworksMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Address extends StObject {
  
  /**
    * The city for this address.
    */
  var city: AddressContent
  
  /**
    * The company name for this address.
    */
  var company: js.UndefOr[AddressContent] = js.undefined
  
  /**
    * The country for this address.
    */
  var country: AddressContent
  
  /**
    * The recipient's name for this address.
    */
  var name: AddressContent
  
  /**
    * The phone number for this address.
    */
  var phoneNumber: js.UndefOr[AddressContent] = js.undefined
  
  /**
    * The postal code for this address.
    */
  var postalCode: AddressContent
  
  /**
    * The state or province for this address.
    */
  var stateOrProvince: AddressContent
  
  /**
    * The first line of the street address.
    */
  var street1: AddressContent
  
  /**
    * The second line of the street address.
    */
  var street2: js.UndefOr[AddressContent] = js.undefined
  
  /**
    * The third line of the street address.
    */
  var street3: js.UndefOr[AddressContent] = js.undefined
}
object Address {
  
  inline def apply(
    city: AddressContent,
    country: AddressContent,
    name: AddressContent,
    postalCode: AddressContent,
    stateOrProvince: AddressContent,
    street1: AddressContent
  ): Address = {
    val __obj = js.Dynamic.literal(city = city.asInstanceOf[js.Any], country = country.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], postalCode = postalCode.asInstanceOf[js.Any], stateOrProvince = stateOrProvince.asInstanceOf[js.Any], street1 = street1.asInstanceOf[js.Any])
    __obj.asInstanceOf[Address]
  }
  
  extension [Self <: Address](x: Self) {
    
    inline def setCity(value: AddressContent): Self = StObject.set(x, "city", value.asInstanceOf[js.Any])
    
    inline def setCompany(value: AddressContent): Self = StObject.set(x, "company", value.asInstanceOf[js.Any])
    
    inline def setCompanyUndefined: Self = StObject.set(x, "company", js.undefined)
    
    inline def setCountry(value: AddressContent): Self = StObject.set(x, "country", value.asInstanceOf[js.Any])
    
    inline def setName(value: AddressContent): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setPhoneNumber(value: AddressContent): Self = StObject.set(x, "phoneNumber", value.asInstanceOf[js.Any])
    
    inline def setPhoneNumberUndefined: Self = StObject.set(x, "phoneNumber", js.undefined)
    
    inline def setPostalCode(value: AddressContent): Self = StObject.set(x, "postalCode", value.asInstanceOf[js.Any])
    
    inline def setStateOrProvince(value: AddressContent): Self = StObject.set(x, "stateOrProvince", value.asInstanceOf[js.Any])
    
    inline def setStreet1(value: AddressContent): Self = StObject.set(x, "street1", value.asInstanceOf[js.Any])
    
    inline def setStreet2(value: AddressContent): Self = StObject.set(x, "street2", value.asInstanceOf[js.Any])
    
    inline def setStreet2Undefined: Self = StObject.set(x, "street2", js.undefined)
    
    inline def setStreet3(value: AddressContent): Self = StObject.set(x, "street3", value.asInstanceOf[js.Any])
    
    inline def setStreet3Undefined: Self = StObject.set(x, "street3", js.undefined)
  }
}
