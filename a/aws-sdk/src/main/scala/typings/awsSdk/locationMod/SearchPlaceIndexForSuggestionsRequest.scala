package typings.awsSdk.locationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SearchPlaceIndexForSuggestionsRequest extends StObject {
  
  /**
    * An optional parameter that indicates a preference for place suggestions that are closer to a specified position.  If provided, this parameter must contain a pair of numbers. The first number represents the X coordinate, or longitude; the second number represents the Y coordinate, or latitude. For example, [-123.1174, 49.2847] represents the position with longitude -123.1174 and latitude 49.2847.   BiasPosition and FilterBBox are mutually exclusive. Specifying both options results in an error.  
    */
  var BiasPosition: js.UndefOr[Position] = js.undefined
  
  /**
    * An optional parameter that limits the search results by returning only suggestions within a specified bounding box.  If provided, this parameter must contain a total of four consecutive numbers in two pairs. The first pair of numbers represents the X and Y coordinates (longitude and latitude, respectively) of the southwest corner of the bounding box; the second pair of numbers represents the X and Y coordinates (longitude and latitude, respectively) of the northeast corner of the bounding box. For example, [-12.7935, -37.4835, -12.0684, -36.9542] represents a bounding box where the southwest corner has longitude -12.7935 and latitude -37.4835, and the northeast corner has longitude -12.0684 and latitude -36.9542.   FilterBBox and BiasPosition are mutually exclusive. Specifying both options results in an error.  
    */
  var FilterBBox: js.UndefOr[BoundingBox] = js.undefined
  
  /**
    * An optional parameter that limits the search results by returning only suggestions within the provided list of countries.   Use the ISO 3166 3-digit country code. For example, Australia uses three upper-case characters: AUS.  
    */
  var FilterCountries: js.UndefOr[CountryCodeList] = js.undefined
  
  /**
    * The name of the place index resource you want to use for the search.
    */
  var IndexName: ResourceName
  
  /**
    * The preferred language used to return results. The value must be a valid BCP 47 language tag, for example, en for English. This setting affects the languages used in the results. If no language is specified, or not supported for a particular result, the partner automatically chooses a language for the result. For an example, we'll use the Greek language. You search for Athens, Gr to get suggestions with the language parameter set to en. The results found will most likely be returned as Athens, Greece. If you set the language parameter to el, for Greek, then the result found will more likely be returned as Αθήνα, Ελλάδα. If the data provider does not have a value for Greek, the result will be in a language that the provider does support.
    */
  var Language: js.UndefOr[LanguageTag] = js.undefined
  
  /**
    * An optional parameter. The maximum number of results returned per request.  The default: 5 
    */
  var MaxResults: js.UndefOr[SearchPlaceIndexForSuggestionsRequestMaxResultsInteger] = js.undefined
  
  /**
    * The free-form partial text to use to generate place suggestions. For example, eiffel tow.
    */
  var Text: SearchPlaceIndexForSuggestionsRequestTextString
}
object SearchPlaceIndexForSuggestionsRequest {
  
  inline def apply(IndexName: ResourceName, Text: SearchPlaceIndexForSuggestionsRequestTextString): SearchPlaceIndexForSuggestionsRequest = {
    val __obj = js.Dynamic.literal(IndexName = IndexName.asInstanceOf[js.Any], Text = Text.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchPlaceIndexForSuggestionsRequest]
  }
  
  extension [Self <: SearchPlaceIndexForSuggestionsRequest](x: Self) {
    
    inline def setBiasPosition(value: Position): Self = StObject.set(x, "BiasPosition", value.asInstanceOf[js.Any])
    
    inline def setBiasPositionUndefined: Self = StObject.set(x, "BiasPosition", js.undefined)
    
    inline def setBiasPositionVarargs(value: Double*): Self = StObject.set(x, "BiasPosition", js.Array(value*))
    
    inline def setFilterBBox(value: BoundingBox): Self = StObject.set(x, "FilterBBox", value.asInstanceOf[js.Any])
    
    inline def setFilterBBoxUndefined: Self = StObject.set(x, "FilterBBox", js.undefined)
    
    inline def setFilterBBoxVarargs(value: Double*): Self = StObject.set(x, "FilterBBox", js.Array(value*))
    
    inline def setFilterCountries(value: CountryCodeList): Self = StObject.set(x, "FilterCountries", value.asInstanceOf[js.Any])
    
    inline def setFilterCountriesUndefined: Self = StObject.set(x, "FilterCountries", js.undefined)
    
    inline def setFilterCountriesVarargs(value: CountryCode*): Self = StObject.set(x, "FilterCountries", js.Array(value*))
    
    inline def setIndexName(value: ResourceName): Self = StObject.set(x, "IndexName", value.asInstanceOf[js.Any])
    
    inline def setLanguage(value: LanguageTag): Self = StObject.set(x, "Language", value.asInstanceOf[js.Any])
    
    inline def setLanguageUndefined: Self = StObject.set(x, "Language", js.undefined)
    
    inline def setMaxResults(value: SearchPlaceIndexForSuggestionsRequestMaxResultsInteger): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setText(value: SearchPlaceIndexForSuggestionsRequestTextString): Self = StObject.set(x, "Text", value.asInstanceOf[js.Any])
  }
}
