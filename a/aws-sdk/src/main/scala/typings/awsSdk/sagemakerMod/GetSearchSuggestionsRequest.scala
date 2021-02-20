package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetSearchSuggestionsRequest extends StObject {
  
  /**
    * The name of the Amazon SageMaker resource to search for.
    */
  var Resource: ResourceType = js.native
  
  /**
    * Limits the property names that are included in the response.
    */
  var SuggestionQuery: js.UndefOr[typings.awsSdk.sagemakerMod.SuggestionQuery] = js.native
}
object GetSearchSuggestionsRequest {
  
  @scala.inline
  def apply(Resource: ResourceType): GetSearchSuggestionsRequest = {
    val __obj = js.Dynamic.literal(Resource = Resource.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetSearchSuggestionsRequest]
  }
  
  @scala.inline
  implicit class GetSearchSuggestionsRequestMutableBuilder[Self <: GetSearchSuggestionsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setResource(value: ResourceType): Self = StObject.set(x, "Resource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuggestionQuery(value: SuggestionQuery): Self = StObject.set(x, "SuggestionQuery", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuggestionQueryUndefined: Self = StObject.set(x, "SuggestionQuery", js.undefined)
  }
}
