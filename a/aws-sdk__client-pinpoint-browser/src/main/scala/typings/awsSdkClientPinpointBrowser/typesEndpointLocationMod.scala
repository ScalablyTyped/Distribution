package typings.awsSdkClientPinpointBrowser

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesEndpointLocationMod {
  
  trait EndpointLocation extends StObject {
    
    /**
      * The city where the endpoint is located.
      */
    var City: js.UndefOr[String] = js.undefined
    
    /**
      * The two-letter code for the country or region of the endpoint. Specified as an ISO 3166-1 alpha-2 code, such as "US" for the United States.
      */
    var Country: js.UndefOr[String] = js.undefined
    
    /**
      * The latitude of the endpoint location, rounded to one decimal place.
      */
    var Latitude: js.UndefOr[Double] = js.undefined
    
    /**
      * The longitude of the endpoint location, rounded to one decimal place.
      */
    var Longitude: js.UndefOr[Double] = js.undefined
    
    /**
      * The postal code or zip code of the endpoint.
      */
    var PostalCode: js.UndefOr[String] = js.undefined
    
    /**
      * The region of the endpoint location. For example, in the United States, this corresponds to a state.
      */
    var Region: js.UndefOr[String] = js.undefined
  }
  object EndpointLocation {
    
    inline def apply(): EndpointLocation = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EndpointLocation]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: EndpointLocation] (val x: Self) extends AnyVal {
      
      inline def setCity(value: String): Self = StObject.set(x, "City", value.asInstanceOf[js.Any])
      
      inline def setCityUndefined: Self = StObject.set(x, "City", js.undefined)
      
      inline def setCountry(value: String): Self = StObject.set(x, "Country", value.asInstanceOf[js.Any])
      
      inline def setCountryUndefined: Self = StObject.set(x, "Country", js.undefined)
      
      inline def setLatitude(value: Double): Self = StObject.set(x, "Latitude", value.asInstanceOf[js.Any])
      
      inline def setLatitudeUndefined: Self = StObject.set(x, "Latitude", js.undefined)
      
      inline def setLongitude(value: Double): Self = StObject.set(x, "Longitude", value.asInstanceOf[js.Any])
      
      inline def setLongitudeUndefined: Self = StObject.set(x, "Longitude", js.undefined)
      
      inline def setPostalCode(value: String): Self = StObject.set(x, "PostalCode", value.asInstanceOf[js.Any])
      
      inline def setPostalCodeUndefined: Self = StObject.set(x, "PostalCode", js.undefined)
      
      inline def setRegion(value: String): Self = StObject.set(x, "Region", value.asInstanceOf[js.Any])
      
      inline def setRegionUndefined: Self = StObject.set(x, "Region", js.undefined)
    }
  }
  
  type UnmarshalledEndpointLocation = EndpointLocation
}
