package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetSearchSuggestionsRequest extends StObject {
  
  /**
    * The name of the Amazon SageMaker resource to search for.
    */
  var Resource: ResourceType
  
  /**
    * Limits the property names that are included in the response.
    */
  var SuggestionQuery: js.UndefOr[typings.awsSdk.sagemakerMod.SuggestionQuery] = js.undefined
}
object GetSearchSuggestionsRequest {
  
  inline def apply(Resource: ResourceType): GetSearchSuggestionsRequest = {
    val __obj = js.Dynamic.literal(Resource = Resource.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetSearchSuggestionsRequest]
  }
  
  extension [Self <: GetSearchSuggestionsRequest](x: Self) {
    
    inline def setResource(value: ResourceType): Self = StObject.set(x, "Resource", value.asInstanceOf[js.Any])
    
    inline def setSuggestionQuery(value: SuggestionQuery): Self = StObject.set(x, "SuggestionQuery", value.asInstanceOf[js.Any])
    
    inline def setSuggestionQueryUndefined: Self = StObject.set(x, "SuggestionQuery", js.undefined)
  }
}
