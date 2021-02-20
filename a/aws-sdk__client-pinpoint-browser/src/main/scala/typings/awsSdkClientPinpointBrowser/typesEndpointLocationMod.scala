package typings.awsSdkClientPinpointBrowser

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesEndpointLocationMod {
  
  @js.native
  trait EndpointLocation extends StObject {
    
    /**
      * The city where the endpoint is located.
      */
    var City: js.UndefOr[String] = js.native
    
    /**
      * The two-letter code for the country or region of the endpoint. Specified as an ISO 3166-1 alpha-2 code, such as "US" for the United States.
      */
    var Country: js.UndefOr[String] = js.native
    
    /**
      * The latitude of the endpoint location, rounded to one decimal place.
      */
    var Latitude: js.UndefOr[Double] = js.native
    
    /**
      * The longitude of the endpoint location, rounded to one decimal place.
      */
    var Longitude: js.UndefOr[Double] = js.native
    
    /**
      * The postal code or zip code of the endpoint.
      */
    var PostalCode: js.UndefOr[String] = js.native
    
    /**
      * The region of the endpoint location. For example, in the United States, this corresponds to a state.
      */
    var Region: js.UndefOr[String] = js.native
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
      def setCity(value: String): Self = StObject.set(x, "City", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCityUndefined: Self = StObject.set(x, "City", js.undefined)
      
      @scala.inline
      def setCountry(value: String): Self = StObject.set(x, "Country", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCountryUndefined: Self = StObject.set(x, "Country", js.undefined)
      
      @scala.inline
      def setLatitude(value: Double): Self = StObject.set(x, "Latitude", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLatitudeUndefined: Self = StObject.set(x, "Latitude", js.undefined)
      
      @scala.inline
      def setLongitude(value: Double): Self = StObject.set(x, "Longitude", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLongitudeUndefined: Self = StObject.set(x, "Longitude", js.undefined)
      
      @scala.inline
      def setPostalCode(value: String): Self = StObject.set(x, "PostalCode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPostalCodeUndefined: Self = StObject.set(x, "PostalCode", js.undefined)
      
      @scala.inline
      def setRegion(value: String): Self = StObject.set(x, "Region", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRegionUndefined: Self = StObject.set(x, "Region", js.undefined)
    }
  }
  
  type UnmarshalledEndpointLocation = EndpointLocation
}
