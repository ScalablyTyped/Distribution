package typings.awsSdk.imagebuilderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListComponentBuildVersionsResponse extends StObject {
  
  /**
    * The list of component summaries for the specified semantic version. 
    */
  var componentSummaryList: js.UndefOr[ComponentSummaryList] = js.undefined
  
  /**
    * The next token used for paginated responses. When this is not empty, there are additional elements that the service has not included in this request. Use this token with the next request to retrieve additional objects. 
    */
  var nextToken: js.UndefOr[PaginationToken] = js.undefined
  
  /**
    * The request ID that uniquely identifies this request. 
    */
  var requestId: js.UndefOr[NonEmptyString] = js.undefined
}
object ListComponentBuildVersionsResponse {
  
  inline def apply(): ListComponentBuildVersionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListComponentBuildVersionsResponse]
  }
  
  extension [Self <: ListComponentBuildVersionsResponse](x: Self) {
    
    inline def setComponentSummaryList(value: ComponentSummaryList): Self = StObject.set(x, "componentSummaryList", value.asInstanceOf[js.Any])
    
    inline def setComponentSummaryListUndefined: Self = StObject.set(x, "componentSummaryList", js.undefined)
    
    inline def setComponentSummaryListVarargs(value: ComponentSummary*): Self = StObject.set(x, "componentSummaryList", js.Array(value :_*))
    
    inline def setNextToken(value: PaginationToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setRequestId(value: NonEmptyString): Self = StObject.set(x, "requestId", value.asInstanceOf[js.Any])
    
    inline def setRequestIdUndefined: Self = StObject.set(x, "requestId", js.undefined)
  }
}
