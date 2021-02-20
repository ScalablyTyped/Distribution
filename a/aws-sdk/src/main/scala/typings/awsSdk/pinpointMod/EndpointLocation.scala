package typings.awsSdk.pinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EndpointLocation extends StObject {
  
  /**
    * The name of the city where the endpoint is located.
    */
  var City: js.UndefOr[string] = js.native
  
  /**
    * The two-character code, in ISO 3166-1 alpha-2 format, for the country or region where the endpoint is located. For example, US for the United States.
    */
  var Country: js.UndefOr[string] = js.native
  
  /**
    * The latitude coordinate of the endpoint location, rounded to one decimal place.
    */
  var Latitude: js.UndefOr[double] = js.native
  
  /**
    * The longitude coordinate of the endpoint location, rounded to one decimal place.
    */
  var Longitude: js.UndefOr[double] = js.native
  
  /**
    * The postal or ZIP code for the area where the endpoint is located.
    */
  var PostalCode: js.UndefOr[string] = js.native
  
  /**
    * The name of the region where the endpoint is located. For locations in the United States, this value is the name of a state.
    */
  var Region: js.UndefOr[string] = js.native
}
object EndpointLocation {
  
  @scala.inline
  def apply(): EndpointLocation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EndpointLocation]
  }
  
  @scala.inline
  implicit class EndpointLocationMutableBuilder[Self <: EndpointLocation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCity(value: string): Self = StObject.set(x, "City", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCityUndefined: Self = StObject.set(x, "City", js.undefined)
    
    @scala.inline
    def setCountry(value: string): Self = StObject.set(x, "Country", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCountryUndefined: Self = StObject.set(x, "Country", js.undefined)
    
    @scala.inline
    def setLatitude(value: double): Self = StObject.set(x, "Latitude", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLatitudeUndefined: Self = StObject.set(x, "Latitude", js.undefined)
    
    @scala.inline
    def setLongitude(value: double): Self = StObject.set(x, "Longitude", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLongitudeUndefined: Self = StObject.set(x, "Longitude", js.undefined)
    
    @scala.inline
    def setPostalCode(value: string): Self = StObject.set(x, "PostalCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPostalCodeUndefined: Self = StObject.set(x, "PostalCode", js.undefined)
    
    @scala.inline
    def setRegion(value: string): Self = StObject.set(x, "Region", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegionUndefined: Self = StObject.set(x, "Region", js.undefined)
  }
}
