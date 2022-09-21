package typings.consumerDataStandards.bankingMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CommonSimpleAddress
  extends StObject
     with /* k */ StringDictionary[Any] {
  
  /**
    * First line of the standard address object
    */
  var addressLine1: String
  
  /**
    * Second line of the standard address object
    */
  var addressLine2: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Third line of the standard address object
    */
  var addressLine3: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Name of the city or locality
    */
  var city: String
  
  /**
    * A valid [ISO 3166 Alpha-3](https://www.iso.org/iso-3166-country-codes.html) country code. Australia (AUS) is assumed if country is not present.
    */
  var country: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Name of the individual or business formatted for inclusion in an address used for physical mail
    */
  var mailingName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Mandatory for Australian addresses
    */
  var postcode: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Free text if the country is not Australia. If country is Australia then must be one of the values defined by the [State Type Abbreviation](https://auspost.com.au/content/dam/auspost_corp/media/documents/australia-post-data-guide.pdf) in the PAF file format. NSW, QLD, VIC, NT, WA, SA, TAS, ACT, AAT
    */
  var state: String
}
object CommonSimpleAddress {
  
  inline def apply(addressLine1: String, city: String, state: String): CommonSimpleAddress = {
    val __obj = js.Dynamic.literal(addressLine1 = addressLine1.asInstanceOf[js.Any], city = city.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommonSimpleAddress]
  }
  
  extension [Self <: CommonSimpleAddress](x: Self) {
    
    inline def setAddressLine1(value: String): Self = StObject.set(x, "addressLine1", value.asInstanceOf[js.Any])
    
    inline def setAddressLine2(value: String): Self = StObject.set(x, "addressLine2", value.asInstanceOf[js.Any])
    
    inline def setAddressLine2Null: Self = StObject.set(x, "addressLine2", null)
    
    inline def setAddressLine2Undefined: Self = StObject.set(x, "addressLine2", js.undefined)
    
    inline def setAddressLine3(value: String): Self = StObject.set(x, "addressLine3", value.asInstanceOf[js.Any])
    
    inline def setAddressLine3Null: Self = StObject.set(x, "addressLine3", null)
    
    inline def setAddressLine3Undefined: Self = StObject.set(x, "addressLine3", js.undefined)
    
    inline def setCity(value: String): Self = StObject.set(x, "city", value.asInstanceOf[js.Any])
    
    inline def setCountry(value: String): Self = StObject.set(x, "country", value.asInstanceOf[js.Any])
    
    inline def setCountryNull: Self = StObject.set(x, "country", null)
    
    inline def setCountryUndefined: Self = StObject.set(x, "country", js.undefined)
    
    inline def setMailingName(value: String): Self = StObject.set(x, "mailingName", value.asInstanceOf[js.Any])
    
    inline def setMailingNameNull: Self = StObject.set(x, "mailingName", null)
    
    inline def setMailingNameUndefined: Self = StObject.set(x, "mailingName", js.undefined)
    
    inline def setPostcode(value: String): Self = StObject.set(x, "postcode", value.asInstanceOf[js.Any])
    
    inline def setPostcodeNull: Self = StObject.set(x, "postcode", null)
    
    inline def setPostcodeUndefined: Self = StObject.set(x, "postcode", js.undefined)
    
    inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
  }
}
