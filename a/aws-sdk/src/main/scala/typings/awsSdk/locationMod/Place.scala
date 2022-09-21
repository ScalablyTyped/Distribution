package typings.awsSdk.locationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Place extends StObject {
  
  /**
    * The numerical portion of an address, such as a building number. 
    */
  var AddressNumber: js.UndefOr[String] = js.undefined
  
  /**
    * A country/region specified using ISO 3166 3-digit country/region code. For example, CAN.
    */
  var Country: js.UndefOr[String] = js.undefined
  
  var Geometry: PlaceGeometry
  
  /**
    *  True if the result is interpolated from other known places.  False if the Place is a known place. Not returned when the partner does not provide the information. For example, returns False for an address location that is found in the partner data, but returns True if an address does not exist in the partner data and its location is calculated by interpolating between other known addresses. 
    */
  var Interpolated: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The full name and address of the point of interest such as a city, region, or country. For example, 123 Any Street, Any Town, USA.
    */
  var Label: js.UndefOr[String] = js.undefined
  
  /**
    * A name for a local area, such as a city or town name. For example, Toronto.
    */
  var Municipality: js.UndefOr[String] = js.undefined
  
  /**
    * The name of a community district. For example, Downtown.
    */
  var Neighborhood: js.UndefOr[String] = js.undefined
  
  /**
    * A group of numbers and letters in a country-specific format, which accompanies the address for the purpose of identifying a location. 
    */
  var PostalCode: js.UndefOr[String] = js.undefined
  
  /**
    * A name for an area or geographical division, such as a province or state name. For example, British Columbia.
    */
  var Region: js.UndefOr[String] = js.undefined
  
  /**
    * The name for a street or a road to identify a location. For example, Main Street.
    */
  var Street: js.UndefOr[String] = js.undefined
  
  /**
    * A country, or an area that's part of a larger region. For example, Metro Vancouver.
    */
  var SubRegion: js.UndefOr[String] = js.undefined
  
  /**
    * The time zone in which the Place is located. Returned only when using Here as the selected partner.
    */
  var TimeZone: js.UndefOr[typings.awsSdk.locationMod.TimeZone] = js.undefined
}
object Place {
  
  inline def apply(Geometry: PlaceGeometry): Place = {
    val __obj = js.Dynamic.literal(Geometry = Geometry.asInstanceOf[js.Any])
    __obj.asInstanceOf[Place]
  }
  
  extension [Self <: Place](x: Self) {
    
    inline def setAddressNumber(value: String): Self = StObject.set(x, "AddressNumber", value.asInstanceOf[js.Any])
    
    inline def setAddressNumberUndefined: Self = StObject.set(x, "AddressNumber", js.undefined)
    
    inline def setCountry(value: String): Self = StObject.set(x, "Country", value.asInstanceOf[js.Any])
    
    inline def setCountryUndefined: Self = StObject.set(x, "Country", js.undefined)
    
    inline def setGeometry(value: PlaceGeometry): Self = StObject.set(x, "Geometry", value.asInstanceOf[js.Any])
    
    inline def setInterpolated(value: Boolean): Self = StObject.set(x, "Interpolated", value.asInstanceOf[js.Any])
    
    inline def setInterpolatedUndefined: Self = StObject.set(x, "Interpolated", js.undefined)
    
    inline def setLabel(value: String): Self = StObject.set(x, "Label", value.asInstanceOf[js.Any])
    
    inline def setLabelUndefined: Self = StObject.set(x, "Label", js.undefined)
    
    inline def setMunicipality(value: String): Self = StObject.set(x, "Municipality", value.asInstanceOf[js.Any])
    
    inline def setMunicipalityUndefined: Self = StObject.set(x, "Municipality", js.undefined)
    
    inline def setNeighborhood(value: String): Self = StObject.set(x, "Neighborhood", value.asInstanceOf[js.Any])
    
    inline def setNeighborhoodUndefined: Self = StObject.set(x, "Neighborhood", js.undefined)
    
    inline def setPostalCode(value: String): Self = StObject.set(x, "PostalCode", value.asInstanceOf[js.Any])
    
    inline def setPostalCodeUndefined: Self = StObject.set(x, "PostalCode", js.undefined)
    
    inline def setRegion(value: String): Self = StObject.set(x, "Region", value.asInstanceOf[js.Any])
    
    inline def setRegionUndefined: Self = StObject.set(x, "Region", js.undefined)
    
    inline def setStreet(value: String): Self = StObject.set(x, "Street", value.asInstanceOf[js.Any])
    
    inline def setStreetUndefined: Self = StObject.set(x, "Street", js.undefined)
    
    inline def setSubRegion(value: String): Self = StObject.set(x, "SubRegion", value.asInstanceOf[js.Any])
    
    inline def setSubRegionUndefined: Self = StObject.set(x, "SubRegion", js.undefined)
    
    inline def setTimeZone(value: TimeZone): Self = StObject.set(x, "TimeZone", value.asInstanceOf[js.Any])
    
    inline def setTimeZoneUndefined: Self = StObject.set(x, "TimeZone", js.undefined)
  }
}
