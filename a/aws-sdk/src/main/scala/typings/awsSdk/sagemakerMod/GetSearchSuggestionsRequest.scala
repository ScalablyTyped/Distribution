package typings.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetSearchSuggestionsRequest extends js.Object {
  
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
  implicit class GetSearchSuggestionsRequestOps[Self <: GetSearchSuggestionsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setResource(value: ResourceType): Self = this.set("Resource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuggestionQuery(value: SuggestionQuery): Self = this.set("SuggestionQuery", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSuggestionQuery: Self = this.set("SuggestionQuery", js.undefined)
  }
}
