package typings.awsSdk.locationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SearchPlaceIndexForSuggestionsSummary extends StObject {
  
  /**
    * Contains the coordinates for the optional bias position specified in the request. This parameter contains a pair of numbers. The first number represents the X coordinate, or longitude; the second number represents the Y coordinate, or latitude. For example, [-123.1174, 49.2847] represents the position with longitude -123.1174 and latitude 49.2847.
    */
  var BiasPosition: js.UndefOr[Position] = js.undefined
  
  /**
    * The geospatial data provider attached to the place index resource specified in the request. Values can be one of the following:   Esri   Here   For more information about data providers, see Amazon Location Service data providers.
    */
  var DataSource: String
  
  /**
    * Contains the coordinates for the optional bounding box specified in the request.
    */
  var FilterBBox: js.UndefOr[BoundingBox] = js.undefined
  
  /**
    * Contains the optional country filter specified in the request.
    */
  var FilterCountries: js.UndefOr[CountryCodeList] = js.undefined
  
  /**
    * The preferred language used to return results. Matches the language in the request. The value is a valid BCP 47 language tag, for example, en for English.
    */
  var Language: js.UndefOr[LanguageTag] = js.undefined
  
  /**
    * Contains the optional result count limit specified in the request.
    */
  var MaxResults: js.UndefOr[Integer] = js.undefined
  
  /**
    * The free-form partial text input specified in the request.
    */
  var Text: SensitiveString
}
object SearchPlaceIndexForSuggestionsSummary {
  
  inline def apply(DataSource: String, Text: SensitiveString): SearchPlaceIndexForSuggestionsSummary = {
    val __obj = js.Dynamic.literal(DataSource = DataSource.asInstanceOf[js.Any], Text = Text.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchPlaceIndexForSuggestionsSummary]
  }
  
  extension [Self <: SearchPlaceIndexForSuggestionsSummary](x: Self) {
    
    inline def setBiasPosition(value: Position): Self = StObject.set(x, "BiasPosition", value.asInstanceOf[js.Any])
    
    inline def setBiasPositionUndefined: Self = StObject.set(x, "BiasPosition", js.undefined)
    
    inline def setBiasPositionVarargs(value: Double*): Self = StObject.set(x, "BiasPosition", js.Array(value*))
    
    inline def setDataSource(value: String): Self = StObject.set(x, "DataSource", value.asInstanceOf[js.Any])
    
    inline def setFilterBBox(value: BoundingBox): Self = StObject.set(x, "FilterBBox", value.asInstanceOf[js.Any])
    
    inline def setFilterBBoxUndefined: Self = StObject.set(x, "FilterBBox", js.undefined)
    
    inline def setFilterBBoxVarargs(value: Double*): Self = StObject.set(x, "FilterBBox", js.Array(value*))
    
    inline def setFilterCountries(value: CountryCodeList): Self = StObject.set(x, "FilterCountries", value.asInstanceOf[js.Any])
    
    inline def setFilterCountriesUndefined: Self = StObject.set(x, "FilterCountries", js.undefined)
    
    inline def setFilterCountriesVarargs(value: CountryCode*): Self = StObject.set(x, "FilterCountries", js.Array(value*))
    
    inline def setLanguage(value: LanguageTag): Self = StObject.set(x, "Language", value.asInstanceOf[js.Any])
    
    inline def setLanguageUndefined: Self = StObject.set(x, "Language", js.undefined)
    
    inline def setMaxResults(value: Integer): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setText(value: SensitiveString): Self = StObject.set(x, "Text", value.asInstanceOf[js.Any])
  }
}
