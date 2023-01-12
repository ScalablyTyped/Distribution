package typings.bingmaps.Microsoft.Maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IAddress extends StObject {
  
  /**
    * The street line of an address. The addressLine property is the most precise, official line for an address relative to the postal agency
    * servicing the area specified by the locality or postalCode properties.
    */
  var addressLine: String
  
  /**
    * The subdivision name within the country or region for an address. This element is also commonly treated as the first order administrative
    * subdivision. An example is a US state, such as “Oregon”.
    */
  var adminDistrict: String
  
  /** The country or region name of the address. */
  var countryRegion: String
  
  /** A string specifying the two-letter ISO country code. */
  var countryRegionISO2: String
  
  /** The second, third, or fourth order subdivision within a country, dependency, or region. An example is a US county, such as “King”. */
  var district: String
  
  /** A nicely formatted address string for the result. */
  var formattedAddress: String
  
  /** The locality, such as the primary city, that corresponds to an address. An example is “Seattle”. */
  var locality: String
  
  /** The post code, postal code, or ZIP code of an address. An example is a US ZIP code, such as “98152”. */
  var postalCode: String
}
object IAddress {
  
  inline def apply(
    addressLine: String,
    adminDistrict: String,
    countryRegion: String,
    countryRegionISO2: String,
    district: String,
    formattedAddress: String,
    locality: String,
    postalCode: String
  ): IAddress = {
    val __obj = js.Dynamic.literal(addressLine = addressLine.asInstanceOf[js.Any], adminDistrict = adminDistrict.asInstanceOf[js.Any], countryRegion = countryRegion.asInstanceOf[js.Any], countryRegionISO2 = countryRegionISO2.asInstanceOf[js.Any], district = district.asInstanceOf[js.Any], formattedAddress = formattedAddress.asInstanceOf[js.Any], locality = locality.asInstanceOf[js.Any], postalCode = postalCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[IAddress]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IAddress] (val x: Self) extends AnyVal {
    
    inline def setAddressLine(value: String): Self = StObject.set(x, "addressLine", value.asInstanceOf[js.Any])
    
    inline def setAdminDistrict(value: String): Self = StObject.set(x, "adminDistrict", value.asInstanceOf[js.Any])
    
    inline def setCountryRegion(value: String): Self = StObject.set(x, "countryRegion", value.asInstanceOf[js.Any])
    
    inline def setCountryRegionISO2(value: String): Self = StObject.set(x, "countryRegionISO2", value.asInstanceOf[js.Any])
    
    inline def setDistrict(value: String): Self = StObject.set(x, "district", value.asInstanceOf[js.Any])
    
    inline def setFormattedAddress(value: String): Self = StObject.set(x, "formattedAddress", value.asInstanceOf[js.Any])
    
    inline def setLocality(value: String): Self = StObject.set(x, "locality", value.asInstanceOf[js.Any])
    
    inline def setPostalCode(value: String): Self = StObject.set(x, "postalCode", value.asInstanceOf[js.Any])
  }
}
