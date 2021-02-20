package typings.awsSdk.robomakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListWorldTemplatesResponse extends StObject {
  
  /**
    * If the previous paginated request did not return all of the remaining results, the response object's nextToken parameter value is set to a token. To retrieve the next set of results, call ListWorldTemplates again and assign that token to the request object's nextToken parameter. If there are no remaining results, the previous response object's NextToken parameter is set to null. 
    */
  var nextToken: js.UndefOr[PaginationToken] = js.native
  
  /**
    * Summary information for templates.
    */
  var templateSummaries: js.UndefOr[TemplateSummaries] = js.native
}
object ListWorldTemplatesResponse {
  
  @scala.inline
  def apply(): ListWorldTemplatesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListWorldTemplatesResponse]
  }
  
  @scala.inline
  implicit class ListWorldTemplatesResponseMutableBuilder[Self <: ListWorldTemplatesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextToken(value: PaginationToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    @scala.inline
    def setTemplateSummaries(value: TemplateSummaries): Self = StObject.set(x, "templateSummaries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTemplateSummariesUndefined: Self = StObject.set(x, "templateSummaries", js.undefined)
    
    @scala.inline
    def setTemplateSummariesVarargs(value: TemplateSummary*): Self = StObject.set(x, "templateSummaries", js.Array(value :_*))
  }
}
