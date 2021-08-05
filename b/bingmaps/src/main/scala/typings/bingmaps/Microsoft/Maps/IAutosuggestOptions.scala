package typings.bingmaps.Microsoft.Maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IAutosuggestOptions extends StObject {
  
  /** Specifies if street address suggestions should be returned. Default: true */
  var addressSuggestions: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies if the user’s location should be auto detected using their IP address, if no location information is provided
    * in the userLocation property. Default: true
    */
  var autoDetectLocation: js.UndefOr[Boolean] = js.undefined
  
  /**
    * A bounding box that is used to help influence the results such that locations that are in or near this bounding box
    * are given more weight than they would normally.
    */
  var bounds: js.UndefOr[LocationRect] = js.undefined
  
  /**
    * A string specifying the ISO 3166-1 alpha-2 country region code which is used to limit suggests to a single country.
    * https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2
    */
  var countryCode: js.UndefOr[String] = js.undefined
  
  /**
    * A reference to a map instance. If the useMapView property is set to true, the bounding box of the map view will be used
    * to influence the weight of suggestions.
    */
  var map: js.UndefOr[Map] = js.undefined
  
  /** The maximum number of results to return. Can be any value between 1 and 10. Default: 5 */
  var maxResults: js.UndefOr[Double] = js.undefined
  
  /** Specifies if place suggestions (city, landmark, etc.) should be returned. Default: true */
  var placeSuggestions: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Indicates if the maps bounding box should be used to influence the suggested results. Ignored if the bounds property is
    * set. Default: true
    */
  var useMapView: js.UndefOr[Boolean] = js.undefined
  
  /** A coordinate indicating where the user is located. This will influence the results to be more relevant to the user. */
  var userLocation: js.UndefOr[Location] = js.undefined
}
object IAutosuggestOptions {
  
  inline def apply(): IAutosuggestOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IAutosuggestOptions]
  }
  
  extension [Self <: IAutosuggestOptions](x: Self) {
    
    inline def setAddressSuggestions(value: Boolean): Self = StObject.set(x, "addressSuggestions", value.asInstanceOf[js.Any])
    
    inline def setAddressSuggestionsUndefined: Self = StObject.set(x, "addressSuggestions", js.undefined)
    
    inline def setAutoDetectLocation(value: Boolean): Self = StObject.set(x, "autoDetectLocation", value.asInstanceOf[js.Any])
    
    inline def setAutoDetectLocationUndefined: Self = StObject.set(x, "autoDetectLocation", js.undefined)
    
    inline def setBounds(value: LocationRect): Self = StObject.set(x, "bounds", value.asInstanceOf[js.Any])
    
    inline def setBoundsUndefined: Self = StObject.set(x, "bounds", js.undefined)
    
    inline def setCountryCode(value: String): Self = StObject.set(x, "countryCode", value.asInstanceOf[js.Any])
    
    inline def setCountryCodeUndefined: Self = StObject.set(x, "countryCode", js.undefined)
    
    inline def setMap(value: Map): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
    
    inline def setMapUndefined: Self = StObject.set(x, "map", js.undefined)
    
    inline def setMaxResults(value: Double): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    inline def setPlaceSuggestions(value: Boolean): Self = StObject.set(x, "placeSuggestions", value.asInstanceOf[js.Any])
    
    inline def setPlaceSuggestionsUndefined: Self = StObject.set(x, "placeSuggestions", js.undefined)
    
    inline def setUseMapView(value: Boolean): Self = StObject.set(x, "useMapView", value.asInstanceOf[js.Any])
    
    inline def setUseMapViewUndefined: Self = StObject.set(x, "useMapView", js.undefined)
    
    inline def setUserLocation(value: Location): Self = StObject.set(x, "userLocation", value.asInstanceOf[js.Any])
    
    inline def setUserLocationUndefined: Self = StObject.set(x, "userLocation", js.undefined)
  }
}
